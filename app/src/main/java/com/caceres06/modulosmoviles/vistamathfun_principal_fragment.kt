package com.caceres06.modulosmoviles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.caceres06.modulosmoviles.databinding.FragmentVistamathfunPrincipalFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class vistamathfun_principal_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding=DataBindingUtil.inflate<FragmentVistamathfunPrincipalFragmentBinding>(inflater,R.layout.fragment_vistamathfun_principal_fragment,container,false)
        binding.playButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_vistamathfun_principal_fragment_to_menu_play_fragment)
        }
        binding.tuto.setOnClickListener{
            it.findNavController().navigate(R.id.action_vistamathfun_principal_fragment_to_tutorial_menu)
        }
        binding.button4.setOnClickListener {
            it.findNavController().navigate(R.id.action_vistamathfun_principal_fragment_to_about_us)
        }
        binding.button2.setOnClickListener {
            it.findNavController().navigate(R.id.action_vistamathfun_principal_fragment_to_quiz_menu)
        }
        return binding.root
    }

}
