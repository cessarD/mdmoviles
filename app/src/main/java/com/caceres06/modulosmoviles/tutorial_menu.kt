package com.caceres06.modulosmoviles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.caceres06.modulosmoviles.databinding.FragmentMenuTutorialBinding
import com.caceres06.modulosmoviles.databinding.FragmentTutorialBinding

/**
 * A simple [Fragment] subclass.
 */
class tutorial_menu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding= DataBindingUtil.inflate<FragmentMenuTutorialBinding>(inflater,R.layout.fragment_menu_tutorial,container,false)

        binding.sumb.setOnClickListener {
            var a="suma"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_tutorial_menu_to_tutorial2,bundle)
        }

        binding.resbt.setOnClickListener {
            var a="resta"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_tutorial_menu_to_tutorial2,bundle)
        }
        binding.multbt.setOnClickListener {
            var a="multiplicacion"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_tutorial_menu_to_tutorial2,bundle)
        }
        binding.dividirbt.setOnClickListener {
            var a="division"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_tutorial_menu_to_tutorial2,bundle)
        }
        return binding.root
    }
}


