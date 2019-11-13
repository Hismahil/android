package br.com.viewmodel;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.lifecycle.ViewModelStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView txt;
    private CountViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);

        model = ViewModelProviders.of(this).get(CountViewModel.class);

        txt.setText(String.valueOf(model.count));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.count += 1;
                txt.setText(String.valueOf(model.count));
            }
        });

        //https://github.com/viniciusthiengo/news-app-brasil-notcias.git
        //uns layouts para exemplo
    }
}
