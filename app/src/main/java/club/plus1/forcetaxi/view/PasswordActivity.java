package club.plus1.forcetaxi.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import club.plus1.forcetaxi.R;
import club.plus1.forcetaxi.databinding.PasswordBinding;
import club.plus1.forcetaxi.viewmodel.PasswordViewModel;

public class PasswordActivity extends AppCompatActivity {

    private PasswordViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PasswordBinding binding = DataBindingUtil.setContentView(this, R.layout.password);
        viewModel = PasswordViewModel.getInstance(this);
        binding.setViewModel(viewModel);
    }
}
