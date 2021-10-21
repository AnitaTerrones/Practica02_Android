package com.example.t3practica02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.t3practica02.adapters.animeAdapter;
import com.example.t3practica02.Anime;

import java.util.ArrayList;
import java.util.List;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    public boolean fav = true;
    ArrayList<Anime> varAnime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lViewAnime = findViewById(R.id.lvanimes);
        varAnime = new ArrayList<>();
        varAnime.add(new Anime("https://static.wikia.nocookie.net/doblaje/images/b/b3/Kimetsu_no_Yaiba.png/revision/latest/scale-to-width-down/1000?cb=20210124024744&path-prefix=es","Kimetsu No Yaiba","Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio."));
        varAnime.add(new Anime("https://static.wikia.nocookie.net/doblaje/images/4/49/Tokyo_Ghoul.jpg/revision/latest/scale-to-width-down/1000?cb=20200927220726&path-prefix=es","Tokio Ghoul","Ken Kaneki, un joven y tímido universitario, sobrevive a una operación de trasplante de órganos tras ser atacado por un Ghoul y casi devorado por uno de ellos."));
        varAnime.add(new Anime("https://static.wikia.nocookie.net/yurionice/images/c/cf/Yuri%21%21%21_on_Ice.jpg/revision/latest/scale-to-width-down/425?cb=20161026220716&path-prefix=es","Yuri On Ice","Yuuri Katsuki, es un patinador artístico que, asumiendo las expectativas de todo Japón, experimentó una derrota aplastante en la final de Grand Prix,quedando último en la competición.. "));


        ArrayList<String> anim = new ArrayList<>();
        for (Anime cont : varAnime) {
            anim.add(cont.getImagen());
            anim.add(cont.getTitulo());
            anim.add(cont.getDescripcion());
        }
        //llenamos la lista view
        lViewAnime.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, anim));

        /*Button btnF = findViewById(R.id.btnFav);
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fav) {
                    btnF.setBottom(R.drawable.favorito);
                    fav = false;
                } else {
                    btnF.setBottom(R.drawable.no_favorito);
                    fav = true;
                }
            }
        });*/

    }
}