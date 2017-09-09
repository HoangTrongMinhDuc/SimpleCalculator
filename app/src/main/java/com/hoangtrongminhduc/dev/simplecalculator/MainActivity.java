package com.hoangtrongminhduc.dev.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btncong, btntru, btnnhan, btnchia;
    private EditText edtA, edtB;
    private TextView tvkq;
    private View.OnClickListener myVarListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvkq=(TextView) findViewById(R.id.tvkq);
            int A=Integer.parseInt(edtA.getText()+"");
            int B=Integer.parseInt(edtB.getText()+"");
            if(v==btncong){
                tvkq.setText(A+"+"+B+"="+(A+B));
            }else
                if(v==btntru){
                    tvkq.setText(A+"-"+B+"="+(A-B));
                }else
                    if(v==btnnhan){
                        tvkq.setText(A+"x"+B+"="+(A*B));
                    }else tvkq.setText(A+"/"+B+"="+(A/B));
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA=(EditText) findViewById(R.id.edtA);
        edtB=(EditText) findViewById(R.id.edtB);
        btncong=(Button) findViewById(R.id.btncong);
        btncong.setOnClickListener(myVarListener);
        btntru=(Button) findViewById(R.id.btntru);
        btntru.setOnClickListener(myVarListener);
        btnnhan=(Button) findViewById(R.id.btnnhan);
        btnnhan.setOnClickListener(myVarListener);
        btnchia=(Button) findViewById(R.id.btnchia);
        btnchia.setOnClickListener(myVarListener);
    }
}
