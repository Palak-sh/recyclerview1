package com.example.myapplication1;

import static com.example.myapplication1.R.id.add;
import static com.example.myapplication1.R.id.name;

import static com.example.myapplication1.R.layout.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button add;
    AlertDialog dialog;
    LinearLayout layout;
    Context ctx;
    public static final String msg = "com.example.form.msg";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindLayout();
        buildDialog();
        ctx=this;

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

    }

    private void bindLayout() {
        add = findViewById(R.id.add);
        layout = findViewById(R.id.container);
    }

    private void buildDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.dialog, null);
        EditText name = view.findViewById(R.id.nameEdit);


        builder.setView(view);
        builder.setTitle("Enter name").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        addCard(name.getText().toString());

                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
        dialog = builder.create();
    }

    private void addCard(String name) {
        View view = getLayoutInflater().inflate(R.layout.card, null);
        TextView names = view.findViewById(R.id.name);
        names.setText(name);

        layout.addView(view);



    }
  /*  private void addCard(String number) {
        View view = getLayoutInflater().inflate(R.layout.card, null);
        TextView numbers = view.findViewById(R.id.number);
        numbers.setText(number);


    }
*/

    public void UserInformation(View view) {

        Intent intent = new Intent(ctx, Information.class);
        TextView name = findViewById(R.id.name);






        String message = "name:" + name.getText().toString();

        intent.putExtra(msg, message);

        startActivity(intent);
    }
}