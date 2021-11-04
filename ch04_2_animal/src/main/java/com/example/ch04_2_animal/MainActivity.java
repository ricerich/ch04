package com.example.ch04_2_animal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        // 위젯을 변수에 대입
        TextView text1 =    (TextView) findViewById(R.id.Text1);
//        CheckBox chkAgree = (CheckBox) findViewById(R.id.ChkAgree);
        Switch swAgree = findViewById(R.id.swAgree);

        TextView text2 =     (TextView) findViewById(R.id.Text2);
        RadioGroup rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        RadioButton rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        RadioButton rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        RadioButton rdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);

//        Button btnOK =      (Button) findViewById(R.id.BtnOK);
        ImageView imgPet =  (ImageView) findViewById(R.id.ImgPet);

        Button btnFinish = findViewById(R.id.BtnFinish);
        Button btnInit = findViewById(R.id.BtnInit);

        swAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

//                if(isChecked == true)//결과적으로 체크된 상태가 되면
                if(isChecked)//결과적으로 체크된 상태가 되면
                {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
//                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                    btnFinish.setVisibility(View.VISIBLE);
                    btnInit.setVisibility(View.VISIBLE);

                }
                else//체크가 해지된 상태이면
                {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
//                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                    btnFinish.setVisibility(View.INVISIBLE);
                    btnInit.setVisibility(View.INVISIBLE);

                }
            }
        });

        rdoDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPet.setImageResource(R.drawable.dog);
            }
        });


        rdoCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPet.setImageResource(R.drawable.cat);
            }
        });


        rdoRabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPet.setImageResource(R.drawable.rabbit);
            }
        });


        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//액티비티를 종료
            }
        });

        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
//                    btnOK.setVisibility(View.INVISIBLE);
                imgPet.setVisibility(View.INVISIBLE);
                btnFinish.setVisibility(View.INVISIBLE);
                btnInit.setVisibility(View.INVISIBLE);

                swAgree.setChecked(false);
                rGroup1.clearCheck();
                imgPet.setImageResource(0);

            }
        });




//        btnOK.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                int nId = rGroup1.getCheckedRadioButtonId();
//                switch(nId)
//                {
//                    case R.id.RdoDog:
//                        imgPet.setImageResource(R.drawable.dog);
//                        break;
//                    case R.id.RdoCat:
//                        imgPet.setImageResource(R.drawable.cat);
//                        break;
//                    case R.id.RdoRabbit:
//                        imgPet.setImageResource(R.drawable.rabbit);
//                        break;
//                    default:
//                        Toast.makeText(MainActivity.this,"선택안됨!", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });



    }

}
