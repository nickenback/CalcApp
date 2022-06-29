package jp.techacademy.kenji.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_result.*



class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var answercheck = intent.getStringExtra("ANSWERCHECK")

        if(answercheck != "NM") {

            var equal = intent.getFloatExtra("Answer", 0.0f)

            Answer.text = "$equal"
        }else{
            Snackbar.make(findViewById(android.R.id.content), "No number detected", Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }

    }
}