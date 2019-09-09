
package example.official.reshan.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static java.lang.System.exit;

public class PhD19006_Activity4 extends AppCompatActivity {
   int min=1,max=100,number;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.phd19006_activity4);
      Random r = new Random();

        number = r.nextInt(max  + 1);
   }

    public void guess(View view){
        EditText editText = (EditText)findViewById(R.id.e2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);


            int num = Integer.parseInt(editText.getText().toString());
         if (num == number) {
                textView3.setText("Correct(You Won the Game");




           } else if (num < number) {
                textView3.setText("Wrong(Guess Larger Number)");

           } else if(num>number){
                textView3.setText("Wrong(Guess Small Number)");

        }
     }

    }



