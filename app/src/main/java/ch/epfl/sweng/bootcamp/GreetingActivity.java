package ch.epfl.sweng.bootcamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        TextView textView = (TextView) findViewById(R.id.greetingMessage);
        String message = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText("Hello " + message + " !");
    }
}
