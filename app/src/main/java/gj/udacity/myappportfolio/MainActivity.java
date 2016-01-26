package gj.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int[] buttonId = new int[]{R.id.appButton1,R.id.appButton2,R.id.appButton3,R.id.appButton4,R.id.appButton5,R.id.appButton6};
    Button app[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app = new Button[6];

        for(int i=0;i<6;i++) {
            app[i] = (Button) findViewById(buttonId[i]);
            
            app[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "This Button will Launch " + ((Button)v).getText().toString() + " app"
                            , Toast.LENGTH_SHORT).show();
                }
            });
        }

        
    }
}
