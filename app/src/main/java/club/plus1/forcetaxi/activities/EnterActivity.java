package club.plus1.forcetaxi.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import club.plus1.forcetaxi.R;

public class EnterActivity extends AppCompatActivity {

    Button buttonEnter;

    View.OnClickListener listenerEnter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(EnterActivity.this, EnterResultActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);

        buttonEnter = findViewById(R.id.buttonEnter);
        buttonEnter.setOnClickListener(listenerEnter);
    }
}
