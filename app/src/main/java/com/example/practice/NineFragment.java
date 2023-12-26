package com.example.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.practice.databinding.FragmentNineBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;


public class NineFragment extends Fragment {

    private FragmentNineBinding binding;
    private TabLayout tabLayout;
    private ConstraintLayout mainView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentNineBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tabLayout = view.findViewById(R.id.tabLayout);
        mainView = view.findViewById(R.id.main_view);

        // Set up the initial content (you may want to show a default fragment)
        showHomeFragment();

//        binding.nineNextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(NineFragment.this)
//                        .navigate(R.id.action_NineFragment_to_TenFragment);
//            }
//        });


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Handle tab selection
                switch (tab.getPosition()) {
                    case 0:
                        showHomeFragment();
                        break;
                    case 1:
                        showMyFragment();
                        break;
                    case 2:
                        showSettingsFragment();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Handle tab unselection if needed
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Handle tab reselection if needed
            }
        });
    }

    private void showHomeFragment() {
        // Replace the content of the ConstraintLayout with the HomeFragment
        getChildFragmentManager().beginTransaction()
                .replace(R.id.main_view, new TabHomeFragment())
                .commit();
    }

    private void showMyFragment() {
        // Replace the content of the ConstraintLayout with the MyInfoFragment
        getChildFragmentManager().beginTransaction()
                .replace(R.id.main_view, new TabMyFragment())
                .commit();
    }

    private void showSettingsFragment() {
        // Replace the content of the ConstraintLayout with the SettingsFragment
        getChildFragmentManager().beginTransaction()
                .replace(R.id.main_view, new TabSettingFragment())
                .commit();
    }

    // Your existing code...

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

