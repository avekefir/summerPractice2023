package com.example.empty

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.empty.databinding.FragmentOtherBinding
import com.google.android.material.snackbar.Snackbar

class OtherFragment : Fragment(R.layout.fragment_other) {

    private lateinit var binding: FragmentOtherBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOtherBinding.bind(view)

        Snackbar.make(
            binding.root,
            arguments?.getString("CLASS_NAME").toString(),
            Snackbar.LENGTH_LONG).show()
    }



}