package com.example.empty

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.empty.databinding.FragmentStonksBinding

class StonksFragment : Fragment(R.layout.fragment_stonks) {
    private var binding: FragmentStonksBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStonksBinding.bind(view)

        binding?.run{
            btnToOtherFragment.setOnClickListener {
                findNavController().navigate(
                    R.id.action_stonksFragment_to_otherFragment,
                    MainFragment.createBundle("Stonks")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}