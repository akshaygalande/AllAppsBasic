package com.sportsfantasyindia.akshay_galande;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class que30 extends AppCompatActivity {

    dbhelper db;
    EditText ednm,edsl,edid;
    Button bt1,bt2,bt3,bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que30);

        db=new dbhelper(this);
        ednm=(EditText)findViewById(R.id.edtname);
        edsl=(EditText)findViewById(R.id.edtsal);
        edid=(EditText)findViewById(R.id.edtid);
        bt1=(Button) findViewById(R.id.btn1);
        bt2=(Button) findViewById(R.id.btn2);
        bt3=(Button)findViewById(R.id.btn3);
        bt4=(Button)findViewById(R.id.btn4);
        add();
        show();
        mod();
        callsecact();


        bt4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        callsecact();
                    }
                }
        );
    }


    public void callsecact()
    {
        Intent intent=new Intent(this, secondActivity.class);
        startActivity(intent);

    }
    public void add() {
        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean check=db.insertdata(ednm.getText().toString(),edsl.getText().toString());
                        if (check)
                            Toast.makeText(getApplicationContext(),"DATA IS INSERTED",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(getApplicationContext(),"DATA IS NOT INSERTED",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }

    public void show(){
        bt2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Cursor c=db.disp();
                        if (c.getCount()==0){
                            alert("ERROR","NO RECORDS FOUND");
                            return;
                        }
                        StringBuffer data=new StringBuffer();
                        while (c.moveToNext())
                        {
                            data.append("Emp Id="+c.getString(0)+"\n");
                            data.append("Emp Name="+c.getString(1)+"\n");
                            data.append("Emp Sal="+c.getString(2)+"\n");
                        }
                        alert("Records",data.toString());
                    }

                }

        );
    }

    public void alert(String head,String msg)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(head);
        builder.setMessage(msg);
        builder.show();

    }

    public void mod()
    {
        bt3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean check=db.modifydata(edid.getText().toString(),ednm.getText().toString(),edsl.getText().toString());
                        ednm.getText().toString();
                        edsl.getText().toString();
                        if (check)
                            Toast.makeText(getApplicationContext(),"DATA IS UDATED",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(getApplicationContext(),"DATA IS NOT UPDATED",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}
