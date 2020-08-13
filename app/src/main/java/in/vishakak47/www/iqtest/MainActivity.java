package in.vishakak47.www.iqtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etsems;
    EditText etsem1;
    EditText etsem2;
    EditText etsem3;
    EditText etsem4;
    EditText etsem5;
    EditText etsem6;
    EditText etsem7;
    EditText etsem8;
    TextView tvcgpa,tvcg;
    Button btncgpa;
    double sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    double number;
    DecimalFormat Formatter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etsems=findViewById(R.id.etsems);
        etsem1=findViewById(R.id.etsem1);
        etsem2=findViewById(R.id.etsem2);
        etsem3=findViewById(R.id.etsem3);
        etsem4=findViewById(R.id.etsem4);
        etsem5=findViewById(R.id.etsem5);
        etsem6=findViewById(R.id.etsem6);
        etsem7=findViewById(R.id.etsem7);
        etsem8=findViewById(R.id.etsem8);
        tvcgpa=findViewById(R.id.tvcgpa);
        tvcg=findViewById(R.id.tvcg);
        btncgpa=findViewById(R.id.btncgpa);
        Formatter=new DecimalFormat("#0.00");
        etsem1.setVisibility(View.GONE);
        etsem2.setVisibility(View.GONE);
        etsem3.setVisibility(View.GONE);
        etsem4.setVisibility(View.GONE);
        etsem5.setVisibility(View.GONE);
        etsem6.setVisibility(View.GONE);
        etsem7.setVisibility(View.GONE);
        etsem8.setVisibility(View.GONE);
        btncgpa.setVisibility(View.GONE);
        tvcg.setVisibility(View.GONE);
        etsems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etsems.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter values ", Toast.LENGTH_SHORT).show();
                }
                else {

                    number = Double.parseDouble(etsems.getText().toString().trim());
                    if (number == 1) {
                        Toast.makeText(MainActivity.this, "Atleast 2 sem required", Toast.LENGTH_SHORT).show();
                    }
                    if (number == 2) {
                        etsem1.setVisibility(View.VISIBLE);
                        etsem2.setVisibility(View.VISIBLE);
                        btncgpa.setVisibility(View.VISIBLE);
                        etsem3.setVisibility(View.GONE);
                        etsem4.setVisibility(View.GONE);
                        etsem5.setVisibility(View.GONE);
                        etsem6.setVisibility(View.GONE);
                        etsem7.setVisibility(View.GONE);
                        etsem8.setVisibility(View.GONE);
                    }
                    if (number == 3) {
                        etsem1.setVisibility(View.VISIBLE);
                        etsem2.setVisibility(View.VISIBLE);
                        btncgpa.setVisibility(View.VISIBLE);
                        etsem3.setVisibility(View.VISIBLE);
                        etsem4.setVisibility(View.GONE);
                        etsem5.setVisibility(View.GONE);
                        etsem6.setVisibility(View.GONE);
                        etsem7.setVisibility(View.GONE);
                        etsem8.setVisibility(View.GONE);

                    }
                    if (number == 4) {
                        etsem1.setVisibility(View.VISIBLE);
                        etsem2.setVisibility(View.VISIBLE);
                        btncgpa.setVisibility(View.VISIBLE);
                        etsem3.setVisibility(View.VISIBLE);
                        etsem4.setVisibility(View.VISIBLE);
                        etsem5.setVisibility(View.GONE);
                        etsem6.setVisibility(View.GONE);
                        etsem7.setVisibility(View.GONE);
                        etsem8.setVisibility(View.GONE);

                    }
                    if (number == 5) {
                        etsem1.setVisibility(View.VISIBLE);
                        etsem2.setVisibility(View.VISIBLE);
                        btncgpa.setVisibility(View.VISIBLE);
                        etsem3.setVisibility(View.VISIBLE);
                        etsem4.setVisibility(View.VISIBLE);
                        etsem5.setVisibility(View.VISIBLE);
                        etsem6.setVisibility(View.GONE);
                        etsem7.setVisibility(View.GONE);
                        etsem8.setVisibility(View.GONE);

                    }
                    if (number == 6) {
                        etsem1.setVisibility(View.VISIBLE);
                        etsem2.setVisibility(View.VISIBLE);
                        btncgpa.setVisibility(View.VISIBLE);
                        etsem3.setVisibility(View.VISIBLE);
                        etsem4.setVisibility(View.VISIBLE);
                        etsem5.setVisibility(View.VISIBLE);
                        etsem6.setVisibility(View.VISIBLE);
                        etsem7.setVisibility(View.GONE);
                        etsem8.setVisibility(View.GONE);

                    }
                    if (number == 7) {
                        etsem1.setVisibility(View.VISIBLE);
                        etsem2.setVisibility(View.VISIBLE);
                        btncgpa.setVisibility(View.VISIBLE);
                        etsem3.setVisibility(View.VISIBLE);
                        etsem4.setVisibility(View.VISIBLE);
                        etsem5.setVisibility(View.VISIBLE);
                        etsem6.setVisibility(View.VISIBLE);
                        etsem7.setVisibility(View.VISIBLE);
                        etsem8.setVisibility(View.GONE);


                    }
                    if (number == 8) {
                        etsem1.setVisibility(View.VISIBLE);
                        etsem2.setVisibility(View.VISIBLE);
                        btncgpa.setVisibility(View.VISIBLE);
                        etsem3.setVisibility(View.VISIBLE);
                        etsem4.setVisibility(View.VISIBLE);
                        etsem5.setVisibility(View.VISIBLE);
                        etsem6.setVisibility(View.VISIBLE);
                        etsem7.setVisibility(View.VISIBLE);
                        etsem8.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        btncgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   /* if (etsem1.getText().toString().isEmpty()) {

                        Toast.makeText(MainActivity.this, "Enter atleast two sems sgpa", Toast.LENGTH_SHORT).show();
                        tvcgpa.setVisibility(View.GONE);

                    } else {
                        sem1 = Double.parseDouble(etsem1.getText().toString());
                        if (etsem3.getText().toString().isEmpty()) {
                            sem3 = 0;
                        } else {
                            sem3 = Double.parseDouble(etsem3.getText().toString().trim());
                        }
                        if (etsem4.getText().toString().isEmpty()) {
                            sem4 = 0;
                        } else {
                            sem4 = Double.parseDouble(etsem4.getText().toString().trim());
                        }
                        if (etsem5.getText().toString().isEmpty()) {
                            sem5 = 0;
                        } else {
                            sem5 = Double.parseDouble(etsem5.getText().toString().trim());
                        }
                        if (etsem6.getText().toString().isEmpty()) {
                            sem6 = 0;
                        } else {
                            sem6 = Double.parseDouble(etsem6.getText().toString().trim());
                        }
                        if (etsem7.getText().toString().isEmpty()) {
                            sem7 = 0;
                        } else {
                            sem7 = Double.parseDouble(etsem7.getText().toString().trim());
                        }
                        if (etsem8.getText().toString().isEmpty()) {
                            sem8 = 0;
                        } else {
                            sem8 = Double.parseDouble(etsem8.getText().toString().trim());
                        }
                        double total = (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8) / number;
                        double percentage = (total - 0.75) * 100;
                        tvcgpa.setText(Formatter.format(percentage) + "%");
                        tvcgpa.setVisibility(View.VISIBLE);


                    }*/
                    if(etsem1.getVisibility()==View.VISIBLE && etsem1.getText().toString().isEmpty() || etsem2.getVisibility()==View.VISIBLE && etsem2.getText().toString().isEmpty() ||  etsem3.getVisibility()==View.VISIBLE && etsem3.getText().toString().isEmpty() ||  etsem4.getVisibility()==View.VISIBLE && etsem4.getText().toString().isEmpty() ||  etsem5.getVisibility()==View.VISIBLE && etsem5.getText().toString().isEmpty() ||  etsem6.getVisibility()==View.VISIBLE && etsem6.getText().toString().isEmpty() ||  etsem7.getVisibility()==View.VISIBLE && etsem7.getText().toString().isEmpty() ||  etsem8.getVisibility()==View.VISIBLE && etsem8.getText().toString().isEmpty()  )
                     {
                        Toast.makeText(MainActivity.this, "Enter the required GPA", Toast.LENGTH_SHORT).show();
                        tvcgpa.setVisibility(View.GONE);
                        tvcg.setVisibility(View.GONE);

                    }
                    else {
                        sem1=Double.parseDouble(etsem1.getText().toString().trim());
                        sem2 = Double.parseDouble(etsem2.getText().toString().trim());
                        if (etsem3.getVisibility()==View.GONE ) {
                            sem3 = 0;
                        } else {
                            sem3 = Double.parseDouble(etsem3.getText().toString().trim());
                        }
                        if (etsem4.getVisibility()==View.GONE) {
                            sem4 = 0;
                        } else {
                            sem4 = Double.parseDouble(etsem4.getText().toString().trim());
                        }
                        if (etsem5.getVisibility()==View.GONE) {
                            sem5 = 0;
                        } else {
                            sem5 = Double.parseDouble(etsem5.getText().toString().trim());
                        }
                        if (etsem6.getVisibility()==View.GONE) {
                            sem6 = 0;
                        } else {
                            sem6 = Double.parseDouble(etsem6.getText().toString().trim());
                        }
                        if (etsem7.getVisibility()==View.GONE) {
                            sem7 = 0;
                        } else {
                            sem7 = Double.parseDouble(etsem7.getText().toString().trim());
                        }
                        if (etsem8.getVisibility()==View.GONE) {
                            sem8 = 0;
                        }
                        else {
                            sem8 = Double.parseDouble(etsem8.getText().toString().trim());
                        }
                        double total = (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8) / number;
                        tvcg.setText("CGPA-"+Formatter.format(total));
                        tvcg.setVisibility(View.VISIBLE);
                        double percentage = (total - 0.75) * 10;
                        tvcgpa.setText(Formatter.format(percentage) + "%");
                        tvcgpa.setVisibility(View.VISIBLE);


                    }


                }

        });
    }
}
