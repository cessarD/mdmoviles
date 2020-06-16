package com.caceres06.modulosmoviles


import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.caceres06.modulosmoviles.databinding.FragmentTutorialBinding
import kotlinx.android.synthetic.main.fragment_tutorial.*
import kotlinx.android.synthetic.main.fragment_tutorial.view.*


/**
 * A simple [Fragment] subclass.
 */
class tutorial : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentTutorialBinding>(inflater,R.layout.fragment_tutorial,container,false)
        var operacion=arguments?.getString("operacion")
        Log.d("dd",operacion+"")

        if(operacion == "suma"){
            binding.videoView.setVideoURI(Uri.parse("android.resource://com.caceres06.modulosmoviles/"+R.raw.suma2))
            binding.videoView.start()
        }
        if(operacion == "multiplicacion"){
            binding.videoView.setVideoURI(Uri.parse("android.resource://com.caceres06.modulosmoviles/"+R.raw.multiplicacion))
            binding.videoView.start()
        }
        if(operacion == "division"){
            binding.videoView.setVideoURI(Uri.parse("android.resource://com.caceres06.modulosmoviles/"+R.raw.division))
            binding.videoView.start()
        }




        return binding.root
    }

}
