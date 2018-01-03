package adefault.subat22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_Sayi1;
    EditText et_Sayi2;
    TextView lb_Sonuc;
    Button bt_Topla;
    Button bt_Cıkar;
    Button bt_Carp;
    Button bt_Bol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_Sayi1=(EditText) findViewById(R.id.txtsayi1);
        et_Sayi2=(EditText) findViewById(R.id.txtsayi2);
        lb_Sonuc=(TextView) findViewById(R.id.textViewsonuc);
        bt_Topla=(Button) findViewById(R.id.btntopla);
        bt_Cıkar=(Button) findViewById(R.id.btnCıkar);
        bt_Carp=(Button) findViewById(R.id.btnCarp);
        bt_Bol=(Button) findViewById(R.id.btnBol);

        bt_Bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sayi1=0;
                double sayi2=0;

                sayi1=Double.parseDouble(et_Sayi1.getText().toString());
                sayi2=Double.parseDouble(et_Sayi2.getText().toString());

                lb_Sonuc.setText(String.valueOf(sayi1/sayi2));
            }
        });

        bt_Topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1=0;
                int sayi2=0;

                sayi1=Integer.parseInt(et_Sayi1.getText().toString());
                sayi2=Integer.parseInt(et_Sayi2.getText().toString());

                lb_Sonuc.setText(String.valueOf(sayi1+sayi2));
            }
        });

    bt_Cıkar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int sayi1=0;
        int sayi2=0;

        sayi1=Integer.parseInt(et_Sayi1.getText().toString());
        sayi2=Integer.parseInt(et_Sayi2.getText().toString());

        lb_Sonuc.setText(String.valueOf(sayi1-sayi2));
    }
});

    bt_Carp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int sayi1=0;
            int sayi2=0;

            sayi1=Integer.parseInt(et_Sayi1.getText().toString());
            sayi2=Integer.parseInt(et_Sayi2.getText().toString());

            lb_Sonuc.setText(String.valueOf(sayi1*sayi2));

        }
    });



      //  TextView baslik= (TextView) findViewById(R.id.lbhello);
      //  EditText editornek=(EditText) findViewById(R.id.editText);

      //  String basslik= editornek.getText()+" " + "yemek yer";

       // baslik.setText("yasasin");
     //   baslik.setText(basslik);

//        Button btn=(Button) findViewById(R.id.btnislem);
//
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                EditText m_ET=(EditText) findViewById(R.id.editText);
//                TextView m_TW=(TextView) findViewById(R.id.lbhello);
//                m_TW.setText("sammas " +m_ET.getText()+"yemek sever");
//
//            }
//        });

        //hesap makinesi




    }
}
