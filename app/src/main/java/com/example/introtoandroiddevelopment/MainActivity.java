//auto generated code with main activity, name of package and name of project
package com.example.introtoandroiddevelopment;

//import statements, including backwards compatibility
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //basically instantiates an instance of our layout, sets our activity main which sets the content view, and renders the screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(button.getText().toString().equals(getResources().getString(R.string.button_text))){
                    button.setText(R.string.button_clicked_text);
                }else if(button.getText().toString().equals(getResources().getString(R.string.button_clicked_text))){
                    button.setText(R.string.button_text);
                }
            }
        });
    }
}
