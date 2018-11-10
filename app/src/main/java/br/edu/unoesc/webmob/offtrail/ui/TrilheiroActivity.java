package br.edu.unoesc.webmob.offtrail.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;

import br.edu.unoesc.webmob.offtrail.R;

@EActivity(R.layout.activity_trilheiro)
@Fullscreen
public class TrilheiroActivity extends AppCompatActivity {

    @ViewById
    EditText edtNome;
    @ViewById
    EditText edtIdade;
    @ViewById
    Spinner spnMoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trilheiro);
    }

    public void salvarTrilheiro(View v){
        Toast.makeText(this, "Salvando dados...", Toast.LENGTH_SHORT).show();
    }

    public void cancelarTrilheiro(View v){
        edtNome.setText("");
        edtIdade.setText("");
        spnMoto.setSelection(0);
        edtNome.requestFocus();
    }
}
