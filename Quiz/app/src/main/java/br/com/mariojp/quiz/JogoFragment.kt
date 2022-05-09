package br.com.mariojp.quiz

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.mariojp.quiz.databinding.ActivityMainBinding
import br.com.mariojp.quiz.databinding.FragmentJogoBinding
import br.com.mariojp.quiz.databinding.FragmentTituloBinding
import kotlin.math.log


class JogoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentJogoBinding>(inflater, R.layout.fragment_jogo, container, false)

        binding.submitButton.setOnClickListener { view: View ->
            val checkedId = binding.questionRadioGroup.checkedRadioButtonId
            // Do nothing if nothing is checked (id == -1)
            if (-1 != checkedId) {
                var answerIndex = 0
                when(checkedId) {
                    R.id.aRadioButton -> answerIndex = 1
                    R.id.bRadioButton -> answerIndex = 2
                    R.id.cRadioButton -> answerIndex = 3
                }
                if(answerIndex == 2){
                    view.findNavController().navigate(R.id.action_jogoFragment_to_sucessoFragment)
                }else{
                    view.findNavController().navigate(R.id.action_jogoFragment_to_erroFragment)
                }
            }
        }



        return binding.root
    }


}