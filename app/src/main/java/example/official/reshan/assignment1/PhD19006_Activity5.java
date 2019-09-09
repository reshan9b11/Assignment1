package example.official.reshan.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhD19006_Activity5 extends AppCompatActivity {
     TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phd19006_activity5);

        text = (TextView)findViewById(R.id.textView);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText(str);
    }
}
