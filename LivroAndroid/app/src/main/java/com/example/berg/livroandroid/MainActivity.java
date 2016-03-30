package com.example.berg.livroandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private static final String TAG = "livro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*
        --LogCat--
        Log.v(TAG, "log de verbse");
        Log.d(TAG, "log de debug");
        Log.i(TAG, "log de info");
        Log.w(TAG, "log de alerta");
        Log.e(TAG, "log de erro", new RuntimeException("teste de erro"));
    */
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(onClickLogin());
    }
    private View.OnClickListener onClickLogin() {
        return new Button.OnClickListener() {
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);

                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if ("ricardo".equalsIgnoreCase(login) && "123".equals(senha)) {
                    alert("Bem-vindo, login realizado com sucesso! ");
                } else {
                    alert("Login e senha incorretos!");
                }
            }
        };
    }
    private void alert(String s) {
        //A classe mostra um alerta temporário
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
