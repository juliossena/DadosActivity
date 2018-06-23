package dadosactivity.cursoandroid.dell.dadosactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = (TextView) findViewById(R.id.texto_id);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String textoPassado = (String) extras.get("nome");
            texto.setText(textoPassado);
        }

    }
}
