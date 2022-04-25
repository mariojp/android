package br.com.mariojp.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import br.com.mariojp.dados.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    //lateinit var resultado : ImageView;
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //val botao: Button = findViewById(R.id.main_button_lancar)
        //botao.text = "Jogar"
        binding.mainButtonLancar.text = "Jogar"
        binding.mainButtonLancar.setOnClickListener {
                jogar()
            }
        //resultado = findViewById(R.id.main_image_dado)

    }


    private fun jogar(){
        val numero = Random().nextInt(6) + 1
        val drawableResource = when (numero) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //resultado.setImageResource(drawableResource);
        binding.mainImageDado.setImageResource(drawableResource);
    }
}