package com.example.empty

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.empty.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run{

            btnToOtherFragment.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment_to_otherFragment,
                    createBundle("Main")
                )
            }
        }
    }

    companion object{
        fun createBundle(name: String): Bundle {
            var bundle = Bundle()
            bundle.putString("CLASS_NAME", name)
            return bundle
        }
    }
}