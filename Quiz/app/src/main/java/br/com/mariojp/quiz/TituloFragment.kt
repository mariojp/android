package br.com.mariojp.quiz

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import br.com.mariojp.quiz.databinding.ActivityMainBinding
import br.com.mariojp.quiz.databinding.FragmentTituloBinding



class TituloFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentTituloBinding>(inflater, R.layout.fragment_titulo, container, false)

        //Listner com o navgation
        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_tituloFragment_to_jogoFragment)
        }

//        //createNavigateOnClickListener
//        binding.button.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.action_tituloFragment_to_jogoFragment))
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,
            requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}