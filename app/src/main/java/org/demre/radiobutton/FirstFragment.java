package org.demre.radiobutton;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.demre.radiobutton.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    public FirstFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentFirstBinding binding = FragmentFirstBinding.inflate(getLayoutInflater());

        binding.btnRadioFragment.setOnClickListener(v -> {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_firstFragment_to_secondFragment);
        });
        return binding.getRoot();
    }
}