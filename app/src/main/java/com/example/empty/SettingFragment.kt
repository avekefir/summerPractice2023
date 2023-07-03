package com.example.empty

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.empty.databinding.FragmentSettingsBinding

class SettingFragment : Fragment(R.layout.fragment_settings) {
    private var binding: FragmentSettingsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        binding?.run{
            btnToOtherFragment.setOnClickListener {
                findNavController().navigate(
                    R.id.action_settingFragment_to_otherFragment,
                    MainFragment.createBundle("Settings")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}