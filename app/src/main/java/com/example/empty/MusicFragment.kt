package com.example.empty

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.empty.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {
    private var binding: FragmentMusicBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMusicBinding.bind(view)

        binding?.run{
            btnToOtherFragment.setOnClickListener {
                findNavController().navigate(
                    R.id.action_musicFragment2_to_otherFragment,
                    MainFragment.createBundle("Music")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}