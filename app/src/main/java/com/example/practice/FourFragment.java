package com.example.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.practice.databinding.FragmentFourBinding;
import com.example.practice.databinding.FragmentThirdBinding;
import com.google.android.material.appbar.MaterialToolbar;

public class FourFragment extends Fragment {

    private FragmentFourBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFourBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MaterialToolbar toolbar = requireActivity().findViewById(R.id.toolbar);

        toolbar.setBackgroundColor(requireContext().getColor(R.color.lavender));

        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FourFragment.this)
                        .navigate(R.id.action_FourFragment_to_FiveFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
