package com.example.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.practice.databinding.FragmentSecondBinding;
import com.example.practice.databinding.FragmentThirdBinding;
import com.google.android.material.appbar.MaterialToolbar;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MaterialToolbar toolbar = requireActivity().findViewById(R.id.toolbar);

        toolbar.setBackgroundColor(requireContext().getColor(R.color.red));

        binding.buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_SecondFragment);
            }
        });
        
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
