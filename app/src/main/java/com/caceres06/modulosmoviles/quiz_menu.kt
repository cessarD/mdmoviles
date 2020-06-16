package com.caceres06.modulosmoviles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.caceres06.modulosmoviles.databinding.FragmentMenuTutorialBinding
import com.caceres06.modulosmoviles.databinding.FragmentQuizMenuBinding

/**
 * A simple [Fragment] subclass.
 */
class quiz_menu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentQuizMenuBinding>(inflater,R.layout.fragment_quiz_menu,container,false)

        binding.sumb.setOnClickListener {
            var a="suma"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_quiz_menu_to_exam,bundle)
        }

        binding.resbt.setOnClickListener {
            var a="resta"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_quiz_menu_to_exam,bundle)
        }
        binding.multbt.setOnClickListener {
            var a="multiplicacion"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_quiz_menu_to_exam,bundle)
        }
        binding.dividirbt.setOnClickListener {
            var a="division"
            var bundle= bundleOf("operacion" to a.toString())
            it.findNavController().navigate(R.id.action_quiz_menu_to_exam,bundle)
        }
        return binding.root
    }

}
