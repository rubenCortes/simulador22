package bennucybercafe.com.ve.simulador2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import bennucybercafe.com.ve.simulador2.fragmento.RangoListaFragmento;

public class ActividadPrincipal extends AppCompatActivity implements View.OnClickListener {
    private RangoListaFragmento fragmentoRango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        fragmentoRango = RangoListaFragmento.newInstance( 1 );

        Button botonFragmento = (Button) findViewById(R.id.botonCargaFragmento);

        botonFragmento.setOnClickListener( this );


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction transaccion = fragmentManager.beginTransaction();


        transaccion.replace(R.id.contenedorFragment, fragmentoRango);

        transaccion.commit();
        //datos = new DataBaseManager(this);
        Toast.makeText(this,"Fragmento reemplazado",Toast.LENGTH_LONG).show();

    }
}
