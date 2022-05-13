package sg.edu.rp.c346.id20042741.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DatePicker dp;
        TimePicker tp;
        Button btnDisplayDate;
        Button btnDisplayTime;
        Button btnReset;
        TextView tvDisplay;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datepickid);
        tp = findViewById(R.id.timepickid);
        btnDisplayDate = findViewById(R.id.displaydateid);
        btnDisplayTime = findViewById(R.id.displaytimeid);
        btnReset = findViewById(R.id.btnresetid);
        tvDisplay = findViewById(R.id.tvid);

        btnDisplayTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvDisplay.setText(String.format("Time is %d:%d",tp.getCurrentHour(), tp.getCurrentMinute()));
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvDisplay.setText(String.format("Date is %d/%d/%d",dp.getDayOfMonth(), dp.getMonth() + 1, dp.getYear()));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                startActivity(getIntent());
            }
        });


    }


}