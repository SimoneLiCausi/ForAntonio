package com.example.esercitazione

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.esercitazione.databinding.FragmentPipupapuBinding


class PipupapuFragment : Fragment() {

    private var _binding: FragmentPipupapuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPipupapuBinding.inflate(inflater, container, false)


        binding.videoButton.setOnClickListener {
            findNavController().navigate(R.id.action_pipupapu_to_video)
        }



        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}