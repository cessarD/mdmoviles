package com.caceres06.modulosmoviles

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.caceres06.modulosmoviles.databinding.FragmentExamBinding
import com.caceres06.modulosmoviles.databinding.FragmentTutorialBinding

/**
 * A simple [Fragment] subclass.
 */
class exam : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentExamBinding>(inflater,R.layout.fragment_exam,container,false)
        var operacion=arguments?.getString("operacion")


        if(operacion == "suma"){
            val rnds = (1..10).random()
            val rnds2 = (1..10).random()
            binding.problem.text= rnds.toString() + "+" + rnds2.toString()
            val respuesta=rnds+rnds2
            binding.button.setOnClickListener {
                var dato=binding.editText2.text.toString()

                if(respuesta.toString() == dato){
                    it.findNavController().navigate(R.id.action_exam_to_approved)
                }else{
                    it.findNavController().navigate(R.id.action_exam_to_mal)
                }
            }

        }
        if(operacion == "resta"){
            val rnds = (5..10).random()
            val rnds2 = (1..4).random()
            binding.problem.text= rnds.toString() + "-" + rnds2.toString()
            val respuesta=rnds-rnds2
            binding.button.setOnClickListener {
                var dato=binding.editText2.text.toString()

                if(respuesta.toString() == dato){
                    it.findNavController().navigate(R.id.action_exam_to_approved)
                }else{
                    it.findNavController().navigate(R.id.action_exam_to_mal)
                }
            }


        }
        if(operacion == "multiplicacion"){
            val rnds = (1..10).random()
            val rnds2 = (1..10).random()
            binding.problem.text= rnds.toString() + "*" + rnds2.toString()
            val respuesta=rnds*rnds2
            binding.button.setOnClickListener {
                var dato=binding.editText2.text.toString()

                if(respuesta.toString() == dato){
                    it.findNavController().navigate(R.id.action_exam_to_approved)
                }else{
                    it.findNavController().navigate(R.id.action_exam_to_mal)
                }
            }

        }
        if(operacion == "division"){
            val rnds = (1..10).random()
            val rnds2 = (1..10).random()
            binding.problem.text= rnds.toString() + "/" + rnds2.toString()
            val respuesta=rnds/rnds2
            binding.button.setOnClickListener {
                var dato=binding.editText2.text.toString()

                if(respuesta.toString() == dato){
                    it.findNavController().navigate(R.id.action_exam_to_approved)
                }else{
                    it.findNavController().navigate(R.id.action_exam_to_mal)
                }
            }


        }




        return binding.root
    }

}
