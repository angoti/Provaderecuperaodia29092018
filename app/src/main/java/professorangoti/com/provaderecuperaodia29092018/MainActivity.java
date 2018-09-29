package professorangoti.com.provaderecuperaodia29092018;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends Activity {

    private double totalPedido;
    private TextView textoTotalPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoTotalPedido = (TextView) findViewById(R.id.textViewValorPedido);
    }


    public void registraPedido(View v) {
        NumberFormat nf =  NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        switch (((Button) v).getText().toString()) {
            case "1":
                totalPedido += 25.0;
                textoTotalPedido.setText("Total do pedido: R$ " + nf.format(totalPedido));
                break;
            case "2":
                totalPedido += 27.25;
                textoTotalPedido.setText("Total do pedido: R$ " + nf.format(totalPedido));
                break;
            case "3":
                totalPedido += 35.0;
                textoTotalPedido.setText("Total do pedido: R$ " + nf.format(totalPedido));
                break;
            case "4":
                totalPedido += 21.50;
                textoTotalPedido.setText("Total do pedido: R$ " + nf.format(totalPedido));
                break;
            case "5":
                totalPedido += 23.0;
                textoTotalPedido.setText("Total do pedido: R$ " + nf.format(totalPedido));
                break;
        }

    }
}
