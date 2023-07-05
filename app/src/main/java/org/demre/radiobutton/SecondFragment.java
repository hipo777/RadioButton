package org.demre.radiobutton;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import org.demre.radiobutton.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        binding.btnVolver.setOnClickListener(v -> {
            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_secondFragment_to_firstFragment);
        });
        return binding.getRoot();
    }
    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.radiogroup.setOnCheckedChangeListener((radioGroup, i) -> {
            int index = binding.radiogroup.indexOfChild(binding.radiogroup.findViewById(i));
            switch (index) {
                case 0:
                    binding.TextviewRes.setText(R.string.si);
                    break;
                case 1:
                    binding.TextviewRes.setText(R.string.no);
                    break;
                default:
                    break;
            }
        });
    }
}