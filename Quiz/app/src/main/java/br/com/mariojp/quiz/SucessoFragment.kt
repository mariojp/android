package br.com.mariojp.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import br.com.mariojp.quiz.databinding.FragmentJogoBinding
import br.com.mariojp.quiz.databinding.FragmentSucessoBinding



/**
 * A simple [Fragment] subclass.
 * Use the [sucessoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SucessoFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSucessoBinding>(inflater, R.layout.fragment_sucesso, container, false)
        return binding.root
    }


}