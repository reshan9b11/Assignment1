package example.official.reshan.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PhD19006_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phd19006_activity2);
        //this.showDefaultToast();

        //this.showToastInLocation();

        //this.showImageInToast();
    }
    public void defaultt(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Default Toast Style", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void locationn(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Custom Toast Location", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 100,100);
        toast.show();    }


    public void imagee(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Image In Toast", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContentView = (LinearLayout) toast.getView();

        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(R.drawable.iiitdd);
        toastContentView.addView(imageView, 0);
        toast.show();
    }
}
