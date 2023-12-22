package com.example.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.practice.databinding.FragmentFiveBinding;
import com.example.practice.databinding.FragmentFourBinding;
import com.google.android.material.appbar.MaterialToolbar;

public class FiveFragment extends Fragment {

    private FragmentFiveBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFiveBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MaterialToolbar toolbar = requireActivity().findViewById(R.id.toolbar);

        toolbar.setBackgroundColor(requireContext().getColor(R.color.lavender));

        binding.centerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FiveFragment.this)
                        .navigate(R.id.action_FiveFragment_to_SixFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
