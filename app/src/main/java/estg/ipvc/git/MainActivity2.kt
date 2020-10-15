package estg.ipvc.git

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val texttosend = intent.getStringExtra( PARAM1_TEXT )

        Toast.makeText(this, texttosend, Toast.LENGTH_SHORT).show()
    }

    fun goback(view: View) {
        var intent = Intent( this, MainActivity::class.java ).apply {}
        startActivity(intent)
    }
}