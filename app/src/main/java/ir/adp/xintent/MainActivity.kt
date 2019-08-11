package ir.adp.xintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.adp.xintentlibrary.goActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Simple start activity
        goActivity(SecondActivity::class.java)

        //start activity with finish activity
        goActivity(SecondActivity::class.java, true)

        //start activity with custom intent
        goActivity(Intent(this, SecondActivity::class.java))

        //start activity with custom intent and finish activity
        goActivity(Intent(this, SecondActivity::class.java), true)

        //start activity with pass data. you can pass any type data
        goActivity(
            SecondActivity::class.java,
            arrayOf("name", "number", "login", "model"),//key name, must be arrayOf()
            "ali", 12345, true, MainModel("ali")//value
        )

        //start activity with pass data and finish activity. you can pass any type data
        goActivity(
            SecondActivity::class.java,
            arrayOf("name", "number", "login", "model"),//key name, must be arrayOf()
            "ali", 12345, true, MainModel("ali"),//value
            isFinish = true
        )

        // start activity with model. model must be Parcelable
        goActivity(SecondActivity::class.java, MainModel("ali"))

        // start activity with model and finish activity. model must be Parcelable
        goActivity(SecondActivity::class.java, MainModel("ali"), isFinish = true)
    }
}
