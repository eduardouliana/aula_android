package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.unoesc.webmob.offtrail.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void entrarLogin(View v) {
        EditText edtLogin = findViewById(R.id.edtLogin);
        EditText edtSenha = findViewById(R.id.edtSenha);

        String strLogin = edtLogin.getText().toString();
        String strSenha = edtSenha.getText().toString();

        //strLogin != null && strSenha != null && !strLogin.trim().equals("") && !strSenha.trim().equals("") &&

        if (strLogin.equals("eduardo") && strSenha.equals("eduardo")) {

            Toast.makeText(this, "Bem vindo " + strLogin.toUpperCase(), Toast.LENGTH_SHORT).show();
            Intent itPrincipal = new Intent(this, PrincipalActivity.class);
            startActivity(itPrincipal);
            finish();
        } else {
            Toast.makeText(this, "Usuário e senha inválidos", Toast.LENGTH_LONG).show();
        }


    }

    public void sairLogin(View v) {
        finish();
        System.exit(0);
    }
}
