package example.official.reshan.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhD19006_MainActivity extends AppCompatActivity {
    EditText textBox;
    Button passButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phd19006_activity_main);
    }
    public void ct(View view){
        Intent customtoast= new Intent(this,PhD19006_Activity2.class);
        startActivity(customtoast);
    }

    public void sl(View view){
        Intent selectlist= new Intent(this,PhD19006_Activity3.class);
        startActivity(selectlist);
    }

    public void cal(View view){
        Intent calculator= new Intent(this,PhD19006_Activity4.class);
        startActivity(calculator);
    }

    public void mp(View view){

        textBox = (EditText)findViewById(R.id.e1);
        passButton = (Button)findViewById(R.id.b4);

        passButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textBox.getText().toString();

                Intent intent = new Intent(getApplicationContext(), PhD19006_Activity5.class);
                intent.putExtra("message", str);

                startActivity(intent);
            }
        });

    }
}
