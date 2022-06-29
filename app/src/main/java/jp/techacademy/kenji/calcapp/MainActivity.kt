package jp.techacademy.kenji.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.content.Intent

import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        plusbutton.setOnClickListener(this)
        minusbutton.setOnClickListener(this)
        multbutton.setOnClickListener(this)
        divbutton.setOnClickListener(this)

    }

    override fun onClick(v: View?){

        var checkinputnum1:Float? = 0.0f
        var checkinputnum2:Float? = 0.0f

        checkinputnum1 = calinput1.text.toString().toFloatOrNull()
        checkinputnum2 = calinput2.text.toString().toFloatOrNull()


        if(checkinputnum1 != null && checkinputnum2 != null) {
            var intent = Intent(this, result::class.java)
            plusbutton.setOnClickListener {
                var inputnum1: Float = calinput1.text.toString().toFloat()
                var inputnum2: Float = calinput2.text.toString().toFloat()

                var answer: Float = inputnum1 + inputnum2

                intent.putExtra("Answer", answer)

                startActivity(intent)
            }

            minusbutton.setOnClickListener {
                var intent = Intent(this, result::class.java)
                var inputnum1: Float = calinput1.text.toString().toFloat()
                var inputnum2: Float = calinput2.text.toString().toFloat()

                var answer: Float = inputnum1 - inputnum2

                intent.putExtra("Answer", answer)

                startActivity(intent)
            }

            multbutton.setOnClickListener {
                var intent = Intent(this, result::class.java)
                var inputnum1: Float = calinput1.text.toString().toFloat()
                var inputnum2: Float = calinput2.text.toString().toFloat()

                var answer: Float = inputnum1 * inputnum2

                intent.putExtra("Answer", answer)

                startActivity(intent)
            }

            divbutton.setOnClickListener {
                var intent = Intent(this, result::class.java)
                var inputnum1: Float = calinput1.text.toString().toFloat()
                var inputnum2: Float = calinput2.text.toString().toFloat()

                var answer: Float = inputnum1 / inputnum2

                intent.putExtra("Answer", answer)

                startActivity(intent)
            }

        }else{
            plusbutton.setOnClickListener{ view ->


                var intent = Intent(this, result::class.java)
                var answercheck = "NM"
                intent.putExtra("ANSWERCHECK", answercheck)
                startActivity(intent)

            }
            minusbutton.setOnClickListener{ view ->


                var intent = Intent(this, result::class.java)
                var answercheck = "NM"
                intent.putExtra("ANSWERCHECK", answercheck)
                startActivity(intent)
            }
            multbutton.setOnClickListener{ view ->


                var intent = Intent(this, result::class.java)
                var answercheck = "NM"
                intent.putExtra("ANSWERCHECK", answercheck)
                startActivity(intent)

            }
            divbutton.setOnClickListener{ view ->


                var intent = Intent(this, result::class.java)
                var answercheck = "NM"
                intent.putExtra("ANSWERCHECK", answercheck)
                startActivity(intent)
            }

        }



    }

}


