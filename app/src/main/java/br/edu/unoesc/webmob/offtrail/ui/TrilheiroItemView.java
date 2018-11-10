package br.edu.unoesc.webmob.offtrail.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import br.edu.unoesc.webmob.offtrail.R;
import br.edu.unoesc.webmob.offtrail.model.Trilheiro;

@EViewGroup(R.layout.lista_trilheiros)
public class TrilheiroItemView extends LinearLayout {

    @ViewById
    TextView txtNome;

    @ViewById
    TextView txtMoto;

    @ViewById
    ImageView imvFoto;

    //variável global
    Trilheiro trilheiro;


    public TrilheiroItemView(Context context) {
        super(context);
    }

    @Click(R.id.imvEditar)
    public void editar() {
        //intent para chamar tela de cadastro
        //passar objeto trilheiro inteiro

        Toast.makeText(getContext(), "Editar: " + trilheiro.getNome(), Toast.LENGTH_SHORT).show();
    }

    @Click(R.id.imvExcluir)
    public void excluir() {

        AlertDialog.Builder dialogo = new AlertDialog.Builder(getContext());
        dialogo.setTitle("Exclusão");
        dialogo.setMessage("Deseja realmente excluir? - " + trilheiro.getNome());
        dialogo.setCancelable(false);
        dialogo.setNegativeButton("Não", null);
        dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //implementar exclusão
                //lembrar de apagar do grupotrilheiro antes
                //depois apagar o trilheiro
            }
        });

//        Toast.makeText(getContext(), "Excluir: " + trilheiro.getNome(), Toast.LENGTH_SHORT).show();
    }

    public void bind(Trilheiro t) {
        trilheiro = t;
        txtNome.setText(t.getNome());
        txtMoto.setText(t.getMoto().getDescricao() + " - " + t.getMoto().getCilindrada());
        imvFoto.setImageBitmap(BitmapFactory.decodeByteArray(t.getFoto(), 0, t.getFoto().length));
    }
}