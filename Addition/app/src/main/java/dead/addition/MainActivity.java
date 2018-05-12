package dead.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText first_number,second_number;
    private Button add;
    private TextView results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_number=(EditText)findViewById(R.id.First_Name);
        second_number=findViewById(R.id.Second_Number);
        add=findViewById(R.id.Add);
        results=(TextView) findViewById(R.id.Result);

        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();

        switch (id){
            case R.id.Add:
                String first_num=first_number.getText().toString();
                String second_num=second_number.getText().toString();

                if (!first_num.isEmpty() && !second_num.isEmpty()){
                    Double first_numb=Double.parseDouble(first_num);
                    Double second_numb=Double.parseDouble(second_num);
                    Double result=first_numb+second_numb;
                    results.setText("Result = "+result);
                }else
                    results.setText("Enter two numbers correctly");

                break;
            default:
                break;
        }
    }
}
