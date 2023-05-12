package sg.edu.rp.c346.id22024852.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dp;
        TimePicker tp;
        Button btndisplaydate;
        Button btndisplaytime;
        Button btnReset;
        TextView tvDisplay;


        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btndisplaydate = findViewById(R.id.buttonDisplayDate);
        btndisplaytime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textView);
        btnReset = findViewById(R.id.buttonReset);

        btndisplaytime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = String.format("%02d:%02d", tp.getCurrentHour(), tp.getCurrentMinute());
                tvDisplay.setText("Time is " + time);

            }
        });

        btndisplaydate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = dp.getDayOfMonth() +"/"+ (dp.getMonth()+1) +"/"+ dp.getYear();
                tvDisplay.setText("Date is " + date);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020, 0, 1);
                tvDisplay.setText(" ");

            }
        });











    }
}