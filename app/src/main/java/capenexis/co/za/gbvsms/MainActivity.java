package capenexis.co.za.gbvsms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private int entries = 13;
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
        button3.setText(buttonLabels[2]);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setText(buttonLabels[3]);
        button4.setOnClickListener(this);

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setText(buttonLabels[4]);
        button5.setOnClickListener(this);

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setText(buttonLabels[5]);
        button6.setOnClickListener(this);

        Button button7 = (Button)findViewById(R.id.button7);
        button7.setText(buttonLabels[6]);
        button7.setOnClickListener(this);

        Button button8 = (Button)findViewById(R.id.button8);
        button8.setText(buttonLabels[7]);
        button8.setOnClickListener(this);

        Button button9 = (Button)findViewById(R.id.button9);
        button9.setText(buttonLabels[8]);
        button9.setOnClickListener(this);

        Button button10 = (Button)findViewById(R.id.button10);
        button10.setText(buttonLabels[9]);
        button10.setOnClickListener(this);

        Button button11 = (Button)findViewById(R.id.button11);
        button11.setText(buttonLabels[10]);
        button11.setOnClickListener(this);

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
        phoneNum[2] = "101-77";
        phoneNum[3] = "101-11";
        phoneNum[4] = "101-77";
        phoneNum[5] = "080-015-0150";
        phoneNum[6] = "081-383-7698";
        phoneNum[7] = "011-452-4110";
        phoneNum[8] = "011-452-4110";
        phoneNum[9] = "082-231-0805";
        phoneNum[10] = "086-563-3754";



        buttonLabels[0] = "GBV HOTLINE NUMBER";
        buttonLabels[1] = "(PLEASE CALL ME) supported by USSD";
        buttonLabels[2] = "NATIONAL EMERGENCY RESPONSE";
        buttonLabels[3] = "SAPS";
        buttonLabels[4] = "AMBULANCE";
        buttonLabels[5] = "GENDER ABUSE";
        buttonLabels[6] = "PEOPLE OPPOSED TO WOMEN ABUSE";
        buttonLabels[7] = "CHILDLINE SOUTH AFRICA";
        buttonLabels[8] = "CHILD WELFARE SOUTH AFRICA";
        buttonLabels[9] = "LIFELINE SOUTH AFRICA";
        buttonLabels[10] = "SPEAK OUT";

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

            case R.id.button3:
                launchDialer(phoneNum[2]);
                break;

            case R.id.button4:
                launchDialer(phoneNum[3]);
                break;

            case R.id.button5:
                launchDialer(phoneNum[4]);
                break;

            case R.id.button6:
                launchDialer(phoneNum[5]);
                break;

            case R.id.button7:
                launchDialer(phoneNum[6]);
                break;

            case R.id.button8:
                launchDialer(phoneNum[7]);
                break;

            case R.id.button9:
                launchDialer(phoneNum[8]);
                break;

            case R.id.button10:
                launchDialer(phoneNum[9]);
                break;

            case R.id.button11:
                launchDialer(phoneNum[10]);
                break;

        }
    }
}
