package com.example.retrofit_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Base64
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.sql.DriverManager.println

class MainActivity : AppCompatActivity() {
    var username: EditText? = null
    var mobileno: EditText? = null
    var emailid: EditText? = null
    var password: EditText? = null
    var login: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById<EditText>(R.id.et_username)
        mobileno = findViewById<EditText>(R.id.et_mobileno)
        emailid = findViewById<EditText>(R.id.et_emailid)
        password = findViewById<EditText>(R.id.et_password)
        login = findViewById(R.id.login)

        login!!.setOnClickListener {
            registration()
        }

    }


    private fun registration() {

        //viewDialog!!.showDialog()

        val request = RegistrationRequest(
            ApplicationSharedPref.read(ApplicationSharedPref.USER_NAME,"")!!,
            ApplicationSharedPref.read(ApplicationSharedPref.EMAIL,"ar")!!,
            "Android",
            ApplicationSharedPref.read(ApplicationSharedPref.MOBILE,"")!!,
            ApplicationSharedPref.read(ApplicationSharedPref.PASSWORD,"")!!,
            //ApplicationSharedPref.read(ApplicationSharedPref.five,"")!!,name!!,
          //  emailEditTxt!!.text.toString(),DeviceDetails.gettingDeviceModelName(),DeviceDetails.gettingDeviceModelName() + "_" + DeviceDetails.gettingDeviceVersion(),
            //ApplicationSharedPref.read(ApplicationSharedPref.CONFIRMPASSWORD,"")!!,
            BuildConfig.VERSION_NAME,"User",
          //  ApplicationSharedPref.read(ApplicationSharedPref.OTP,"")!!

        )
        val service = RetrofitClient().webService
        CoroutineScope(Dispatchers.IO).launch {
            try {
                /*   co_code = country_code!!.text.toString().substring(1)
                   ApplicationSharedPref.write(ApplicationSharedPref.KUANAME, co_code + mobile)
                   ApplicationSharedPref.write(ApplicationSharedPref.KMOBILE, mobile)
                   println("=====mobilenumber=====$nameEditTxt")
                   ApplicationSharedPref.write(ApplicationSharedPref.KPAWD, passwordEditTxt!!.text.toString())*/
                var auth = "966"+ mobile+":"+ mobileno!!.text.toString()

                val basicAuth = "Basic " + String(Base64().encode(auth.toByteArray()))

                val response = service.registration(
                    request,basicAuth)

                withContext(Dispatchers.Main) {
                    when {
                        response!!.isSuccessful -> {
                            // doSome(response.body())

                            doSome2(response.body())

                            //viewDialog!!.hideDialog()

                            //    Toast.makeText(this@Registration, response.body().toString(), Toast.LENGTH_SHORT).show()

                            println("==response==${response.body()}")

                        }
                        else -> {

                            //viewDialog!!.hideDialog()
                            // Toast.makeText(this@SubcategoriesNewActivity, "", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            } catch (ex: Exception) {
                ex.printStackTrace()
            } finally {
                Log.e("TAG", "sendRequest: ")
            }
        }
    }


    private fun doSome2(body: RegResponse?) {
        Log.e("TAG Ranjith", "doSome: ${body!!.status}")


        if (body.status.equals("1013") ){


            val intent: Intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("otp", "1234")
            intent.putExtra("mobile", ApplicationSharedPref.read(ApplicationSharedPref.DIAL_CODE,"966")+mobile)
            intent.putExtra("name", ApplicationSharedPref.read(ApplicationSharedPref.USER_NAME,""))
            intent.putExtra("email", ApplicationSharedPref.read(ApplicationSharedPref.EMAIL,""))
           // intent.putExtra("password", password)
            intent.putExtra("type", ApplicationSharedPref.read(ApplicationSharedPref.TYPE,""))
            startActivityForResult(intent, RegistrationRequest)
        }
        else {

            //GlobalResponses!!.ShowDialog(this, body.status)
        }


    }
}