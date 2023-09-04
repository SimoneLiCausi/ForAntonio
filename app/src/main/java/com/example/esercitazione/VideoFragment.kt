package com.example.esercitazione

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import com.example.esercitazione.databinding.FragmentVideoBinding


class VideoFragment : Fragment() {

    private var _binding: FragmentVideoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = FragmentVideoBinding.inflate(inflater, container, false)

        val view = inflater.inflate(R.layout.fragment_video, container, false)

        val videoView = view.findViewById<VideoView>(R.id.video_pipu)
        val videoPath = "android.resource://" + requireContext().packageName + "/" + R.raw.video

        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videoView)

        videoView.setVideoPath(videoPath)
        videoView.setMediaController(mediaController)

        videoView.start()

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}