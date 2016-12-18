package com.gdeaditya.eventku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgGambar;
    TextView txTanggal,txJudul,txLokasi,txKategori;

    SharedPreferences pref;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref =getSharedPreferences("mydata",MODE_PRIVATE);
        editor = pref.edit();

        imgGambar = (ImageView)findViewById(R.id.imgGambar);
        txTanggal = (TextView)findViewById(R.id.txTanggal);
        txJudul = (TextView)findViewById(R.id.txJudul);
        txLokasi = (TextView)findViewById(R.id.txLokasi);
        txKategori = (TextView)findViewById(R.id.txKategori);
    }

    public void ubah1 (View view)
    {

        //imgGambar.setImageResource(R.drawable.bg_event);
        //txTanggal.setText(getResources().getString(R.string.tanggal_1));
        //txJudul.setText(getResources().getString(R.string.judul_1));
        //txLokasi.setText(getResources().getString(R.string.lokasi_1));
        //txKategori.setText(getResources().getString(R.string.kategori_1));

        merubahTampilan(R.drawable.bg_event,
                getResources().getString(R.string.tanggal_1),
                getResources().getString(R.string.judul_1),
                getResources().getString(R.string.lokasi_1),
                getResources().getString(R.string.kategori_1));

    }


    public void ubah2(View view)
    {

        merubahTampilan(R.drawable.bg_event2,
                getResources().getString(R.string.tanggal_2),
                getResources().getString(R.string.judul_2),
                getResources().getString(R.string.lokasi_2),
                getResources().getString(R.string.kategori_2));


    }
    public void ubah3(View view)
    {

        merubahTampilan(R.drawable.bg_event3,
                getResources().getString(R.string.tanggal_3),
                getResources().getString(R.string.judul_3),
                getResources().getString(R.string.lokasi_3),
                getResources().getString(R.string.kategori_3));

    }
    private void merubahTampilan(int gmbr,String tgl, String jdl, String lok, String kat)
    {

        imgGambar.setImageResource(gmbr);
        txTanggal.setText(tgl);
        txJudul.setText(jdl);
        txLokasi.setText(lok);
        txKategori.setText(kat);
    }

    public void Logout(View view)
    {
        editor.clear();
        editor.commit();
        Intent i = new Intent(this,loginactvty.class);
        startActivity(i);
        finish();

    }

}
