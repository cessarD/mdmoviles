package com.caceres06.modulosmoviles

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.caceres06.modulosmoviles.databinding.FragmentJuegoRestaFragmentBinding
import com.caceres06.modulosmoviles.databinding.FragmentWonBinding

/**
 * A simple [Fragment] subclass.
 */
class won : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentWonBinding>(inflater,R.layout.fragment_won,container,false)
        val args=wonArgs.fromBundle(arguments!!)
        if(args.score>=3){
            binding.layout.setBackgroundColor(Color.GREEN)
            binding.scorefinal.text="Felicidades has obtenido ${args.score} respuestas buenas"
        }
        if(args.score<3){
            binding.layout.setBackgroundColor(Color.RED)
            binding.scorefinal.text="Intenta mejorar solo has obtenido ${args.score} respuestas buenas"
        }
        return binding.root
    }

}
