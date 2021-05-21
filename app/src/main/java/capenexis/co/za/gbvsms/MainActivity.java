package capenexis.co.za.gbvsms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private int entries = 6;
    private String phoneNum[];
    private String buttonLabels[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNum = new String[entries];
        buttonLabels = new String[entries];

        // Populate the data arrays
        populateArrays();

        // Set up buttons and attach click listeners

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setText(buttonLabels[0]);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setText(buttonLabels[1]);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button2.setText(buttonLabels[2]);
        button2.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button2.setText(buttonLabels[3]);
        button2.setOnClickListener(this);

        Button button5 = (Button)findViewById(R.id.button5);
        button2.setText(buttonLabels[4]);
        button2.setOnClickListener(this);

        Button button6 = (Button)findViewById(R.id.button6);
        button2.setText(buttonLabels[5]);
        button2.setOnClickListener(this);

        Button button7 = (Button)findViewById(R.id.button7);
        button2.setText(buttonLabels[6]);
        button2.setOnClickListener(this);

        Button button8 = (Button)findViewById(R.id.button8);
        button2.setText(buttonLabels[7]);
        button2.setOnClickListener(this);

        Button button9 = (Button)findViewById(R.id.button9);
        button2.setText(buttonLabels[8]);
        button2.setOnClickListener(this);

        Button button10 = (Button)findViewById(R.id.button10);
        button2.setText(buttonLabels[9]);
        button2.setOnClickListener(this);

        Button button11 = (Button)findViewById(R.id.button11);
        button2.setText(buttonLabels[10]);
        button2.setOnClickListener(this);

        Button button12 = (Button)findViewById(R.id.button12);
        button2.setText(buttonLabels[11]);
        button2.setOnClickListener(this);

        Button button13 = (Button)findViewById(R.id.button13);
        button2.setText(buttonLabels[12]);
        button2.setOnClickListener(this);



    }

    // Launch the phone dialer

    public void launchDialer(String number){
        String numberToDial = "tel:"+number;
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(numberToDial)));
    }


    /** Method to populate the data arrays */

    public void populateArrays(){

        /** In a practical application the arrays phoneNum and buttonLabels could be
         * updated dynamically from the Web in this method.  For this project we just
         * hard-wire in some values to illustrate how to use such data, once obtained,
         * to make phone calls. The names and numbers are made up.*/

        phoneNum[0] = "080-042-8428";
        phoneNum[1] = "*120*7867#";
        phoneNum[2] = "315-31";
        phoneNum[4] = "999-000-0004";
        phoneNum[5] = "999-000-0004";
        phoneNum[6] = "999-000-0004";
        phoneNum[7] = "999-000-0004";
        phoneNum[8] = "999-000-0004";
        phoneNum[9] = "999-000-0004";
        phoneNum[10] = "999-000-0004";
        phoneNum[11] = "999-000-0004";


        buttonLabels[0] = "EMERGENCY LINE";
        buttonLabels[1] = "(PLEASE CALL ME) supported by USSD";
        buttonLabels[2] = "SMS 'HELP' ";
        buttonLabels[3] = "COMMENTS & SUGGESTIONS";
        buttonLabels[4] = "NATIONAL EMERGENCY RESPONSE";
        buttonLabels[5] = "SAPS";
        buttonLabels[6] = "AMBULANCE";
        buttonLabels[7] = "GENDER ABUSE";
        buttonLabels[8] = "PEOPLE OPPOSED TO WOMEN ABUSE";
        buttonLabels[9] = "CHILDLINE SOUTH AFRICA";
        buttonLabels[10] = "CHILD WELFARE SOUTH AFRICA";
        buttonLabels[11] = "LIFELINE SOUTH AFRICA";
        buttonLabels[12] = "SPEAK OUT";
        buttonLabels[13] = "LIFELINE SOUTH AFRICA";
    }

    public void launchSMS(View view)
    {
        Intent intent = new Intent(MainActivity.this, SMSActivity.class);
        startActivity(intent);
    }

    /** Callback when the user click the "GO" button */
    public void btnGoHandler(View view) {
        // Create an Intent to start the second activity called "WebViewActivity"
        Intent intent = new Intent(this, WebViewActivity.class);
        // Start the intended activity
        startActivity(intent);
    }

    /** Process button events */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                launchDialer(phoneNum[0]);
                break;

            case R.id.button2:
                launchDialer(phoneNum[1]);
                break;

        }
    }
}
