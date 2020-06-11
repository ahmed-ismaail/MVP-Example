package com.example.mvpexmaple.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpexmaple.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MovieView {
    @BindView(R.id.movieName_TextView)
    TextView movieNameTextView;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final MoviePresenter moviePresenter = new MoviePresenter(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moviePresenter.presenterGetMovieName();
            }
        });
    }

    @Override
    public void getMovieName(String movieName) {
         movieNameTextView.setText(movieName);
    }
}
