package fr.wildcodeschool.projet1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button buttonAccept = findViewById(R.id.button_accept);
        buttonAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                // TODO ajouter l'action au clic
                EditText text_firstname = findViewById(R.id.text_firstname);
                EditText text_Lastname = findViewById(R.id.text_lastname);
                String firstnameValue = text_firstname.getText().toString();
                String lastnameValue = text_Lastname.getText().toString();
                if (firstnameValue.isEmpty() || lastnameValue.equals("")){
                    Toast.makeText(MainActivity.this, R.string.errorName, Toast.LENGTH_LONG).show();
                }else{
                    TextView textcongrats = findViewById(R.id.text_congrats);
                    textcongrats.setVisibility(view.VISIBLE);
                    textcongrats.setText(String.format("Congratulation %s %s", firstnameValue, lastnameValue));
                }

            }
        });

        CheckBox checkAccept = findViewById(R.id.check_box);
        checkAccept.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean  isChecked) {
                EditText text_firstname = findViewById(R.id.text_firstname);
                EditText text_lastname = findViewById(R.id.text_lastname);
                Button buttonAccept = findViewById(R.id.button_accept);


                if (isChecked) {
                    text_firstname.setEnabled(true);
                    text_lastname.setEnabled(true);
                    buttonAccept.setEnabled(true);
                }   else {
                    text_firstname.setEnabled(false);
                    text_lastname.setEnabled(false);
                    buttonAccept.setEnabled(false);
                }
            }
        });



    }
}
