package id.kotlin.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var fieldname : EditText
    lateinit var happy : ImageView
    lateinit var sad : ImageView
    lateinit var mad :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        fieldname = findViewById(R.id.field_name)
        happy = findViewById(R.id.happy_emot)
        sad = findViewById(R.id.sad_emot)
        mad = findViewById(R.id.mad_emot)

        happy.setOnClickListener{
            if(fieldname.text.length<1){
                Toast.makeText(applicationContext, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(applicationContext, "Hi " + fieldname.text+","+ " You are happy today", Toast.LENGTH_LONG).show()
        }

        mad.setOnClickListener{
            if(fieldname.text.length<1){
                Toast.makeText(applicationContext, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(applicationContext, "Hi " + fieldname.text +","+" You are mad today", Toast.LENGTH_LONG).show()
        }

        sad.setOnClickListener{
            if(fieldname.text.length<1){
                Toast.makeText(applicationContext, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(applicationContext, "Hi " + fieldname.text +","+ " You are sad today", Toast.LENGTH_LONG).show()
        }
    }
}