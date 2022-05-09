package br.com.mariojp.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.mariojp.quiz.databinding.FragmentErroBinding
import br.com.mariojp.quiz.databinding.FragmentSucessoBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ErroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ErroFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentErroBinding>(inflater, R.layout.fragment_erro, container, false)

        binding.button2.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_erroFragment_to_jogoFragment)
        }

        return binding.root
    }


}