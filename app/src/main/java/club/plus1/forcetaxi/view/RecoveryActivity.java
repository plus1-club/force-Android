package club.plus1.forcetaxi.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import club.plus1.forcetaxi.R;
import club.plus1.forcetaxi.databinding.RecoveryBinding;
import club.plus1.forcetaxi.model.ActiveLog;
import club.plus1.forcetaxi.viewmodel.RecoveryViewModel;

public class RecoveryActivity extends AppCompatActivity {

    private RecoveryViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActiveLog.getInstance().log();
        super.onCreate(savedInstanceState);
        RecoveryBinding binding = DataBindingUtil.setContentView(this, R.layout.recovery);
        viewModel = RecoveryViewModel.getInstance(this);
        binding.setViewModel(viewModel);
    }
}
