package com.caceres06.modulosmoviles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.caceres06.modulosmoviles.databinding.FragmentMenuPlayFragmentBinding
import com.caceres06.modulosmoviles.databinding.FragmentVistamathfunPrincipalFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class Menu_play_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentMenuPlayFragmentBinding>(inflater,R.layout.fragment_menu_play_fragment,container,false)
        binding.sumb.setOnClickListener{
            it.findNavController().navigate(R.id.action_menu_play_fragment_to_suma)
            it.findNavController()
        }
        binding.resbt.setOnClickListener{
            it.findNavController().navigate(R.id.action_menu_play_fragment_to_juego_resta_fragment)
        }
        binding.multbt.setOnClickListener{
            it.findNavController().navigate(R.id.action_menu_play_fragment_to_juego_multiplicacion_fragment)
        }
        binding.dividirbt.setOnClickListener{
            it.findNavController().navigate(R.id.action_menu_play_fragment_to_juego_division_fragment)
        }

        return binding.root
    }

}
