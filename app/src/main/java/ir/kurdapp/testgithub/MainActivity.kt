package ir.kurdapp.testgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import ir.kurdapp.testgithub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )


        binding.button.setOnClickListener {

            val dialog = AlertDialog.Builder( this ).create()
            dialog.setTitle( "hello my name is sina" )
            dialog.show()

        }





    }
}