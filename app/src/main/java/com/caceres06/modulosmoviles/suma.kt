package com.caceres06.modulosmoviles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.caceres06.modulosmoviles.databinding.FragmentSumaBinding
import com.caceres06.modulosmoviles.databinding.FragmentVistamathfunPrincipalFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class suma : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentSumaBinding>(inflater,R.layout.fragment_suma,container,false)

        return binding.root
    }

}
