package tonhaosemacento.com.br.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private Button btnoi;
    private TextView tviView;
    private EditText edtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnoi = (Button)findViewById(R.id.btn_oi);
        tviView = (TextView)findViewById(R.id.tvi_Text);
        edtMessage = (EditText)findViewById(R.id.edt_message);
        btnoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = edtMessage.getText().toString();
                tviView.setText(message);
                //Log.i(TAG,"Cliquei");
            }
        });
    }
}
