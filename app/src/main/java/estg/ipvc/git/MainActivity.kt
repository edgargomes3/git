package estg.ipvc.git

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

const val PARAM1_TEXT = "PARAM1_TEXT"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show()
    }

    fun login(view: View) {
        var edit1 = findViewById<EditText>(R.id.editTextTextPersonName)

        var intent = Intent( this, MainActivity2::class.java ).apply {
            putExtra( PARAM1_TEXT, edit1.text.toString() )
        }
        startActivity(intent)
        /*
        var texttosend = findViewById<EditText>(R.id.editTextTextPersonName)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, texttosend.text, Toast.LENGTH_SHORT).show()
         */
    }

    /*
    fun goback(view: View) {
        setContentView(R.layout.activity_main)
    }
    */

}