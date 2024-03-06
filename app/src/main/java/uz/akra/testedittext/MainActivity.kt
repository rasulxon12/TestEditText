package uz.akra.testedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import uz.akra.testedittext.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.apply {

            edt1.addTextChangedListener {
                if (it.toString() != edt12.text.toString()) {
                    edt12.setText(it.toString())
                }
            }

            edt12.addTextChangedListener {
                if (it.toString() != edt1.text.toString())
                    edt1.setText(it.toString())
            }

        }


//            edt12.addTextChangedListener {
//                edt1.setText(it.toString())
//
//            }


    }

}


