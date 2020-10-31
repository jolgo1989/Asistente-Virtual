package com.example.vivasantamarta.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vivasantamarta.R
import com.example.vivasantamarta.RecyclerAdapter
import com.example.vivasantamarta.Sitios

class RestaurantesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurantes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lista = ArrayList<Sitios>()

        lista.add(Sitios(R.drawable.restaurantesdos, "La primera Retaurante-Bar",
            "Dirección: Cra. 1c ##15-07, Santa Marta, ",
            "LA PRIMERA RESTAURANTE BAR, antes LA PRIMERA SOCIAL CLUB, es uno de los sitios más exclusivos de Santa Marta." +
                    " Contamos con Restaurante con vista al mar con los mejores pescados y mariscos, pastas, carnes y postres. Nos definimos " +
                    "como un restaurante de alta cocina internacional, y Bar Crossover a donde podrás compartir con tus amigos en una zona privilegiada " +
                    "por su ubicación y vista hacía la bahía más linda de América. Además ofrecemos la opción de eventos privados, contando con un salón para" +
                    " eventos con una capacidad de 300 personas. Aquí podrás celebrar tus cumpleaños, bodas, quinceañeros, matrimonios, eventos empresariales," +
                    " entre otros. También podrás tener la oportunidad de contratar música en vivo. Entre otros",
            "Referencia Bibliografica:\n* http://www.laprimera.com.co/\n" +
                    "* © Copyright 2017 por Agencia Seo Colombia"))

        lista.add(Sitios(R.drawable.restaurantestres,"Santa Mesa",
            "Dirección: calle 17 #3-38, en el Centro Historico de Santa Marta",
        "Si usted, lo que quiere es probar lo mejor de la cocina caribeña, tiene que venir a este restaurante, donde; literalmente, la comida, por su sabor\" +\n" +
                "y calidad, santifica la mesa y el paladar de quienes se sientan alrededor de ella. Su chef, creador y anfitrión Fredy Pertuz, ha hecho un lugar dónde\" +\n" +
                "el arte, la comida y la ambientación elegante ofrecen desde la misma entrada, una atmosfera especial de encanto donde es posible transportarse a otro mundo.\" +\n" +
                "Regálese el placer de disfrutar de la mejor comida fusión de la ciudad. Lo mejor es que todos los platos vienen acompañados por Su Majestad, El Cayeye. ",
            "Referencia Bibliografica:\n* http://www.guiasybaquianos.com/blog/comer-en-santa-marta-restaurantes"))

        lista.add(Sitios(R.drawable.restaurantescuatro,"La Basilea ","Dirección: Calle 16 No. 2-58, en el Centro Histórico\n",
        "Restaurantes como este, son los responsables de elevar toda la escena gastronómica de la ciudad a los más altos estándares posibles (de hecho, es el favorito" +
                " del ex-presidente Juan Manuel Santos y sus ministros cuando vienen de visita). La pequeñez del lugar y sus paredes blancas le dan al lugar un toque intimo donde se " +
                "siente como si estuvieran cocinando expresa y únicamente para uno. Margarita Estupiñan; dueña y chef, ha creado una carta única al fusionar sabores del mediterráneo," +
                " Francia y el pacifico colombiano, culpables de hacer agua la boca solo con leer la carta.","Referencia Bibliografica:\n" +
                    "* http://www.guiasybaquianos.com/blog/comer-en-santa-marta-restaurantes"))

        lista.add(Sitios(R.drawable.restaurantesiete,"Burukuka","Cl. 20 #5-60, Santa Marta, Gaira, Santa Marta, Magdalena",
        "Si quiere tener una experiencia completa mientras come platos de primera calidad, en la cima de una montaña frente al mar, entonces tiene que ir a Burukuka, un" +
                " restaurante de lujo ubicado en el Rodadero y llamado así en honor a una tribu indígena que habitó la Sierra Nevada de Santa Marta, los cuales eran especialistas en" +
                " trabajo con piedra y madera, y bajo esta misma filosofía fue construido. Son especialistas en Comida caribeña, latina, mariscos, mediterránea, sudamericana, colombiana y española."
        ,"Referencia Bibliografica:\n* Foto:http://www.guiasybaquianos.com/blog/comer-en-santa-marta-restaurantes"))

        lista.add(Sitios(R.drawable.restauranteseis,"Lulo Cafe Bar","Dirección:Cra. 3 #16-34, Santa Marta, Magdalena",
        "Muy bien dicen que las apariencias engañan, y precisamente este es el caso de Lulo, un restaurante pequeñísimo, pero supremamente acogedor y de meseros con una amabilidad desbordante," +
                " el cual ofrece platos sencillos pero grandes al paladar. Se ubica en el Callejón del Correo; una pequeña callecita donde se respira pura bohemia y arte. Tiene para todos los gustos: wraps," +
                " pitas, arepas gourmet y sus famosos paninis; platos que acompañados por sus ricos jugos y smothies, lo hacen digno de repetir y por eso lo convierten en uno de los mejores restaurantes para comer.",
        "Referencia Bibliografica:\n" +
                "* Foto:http://www.guiasybaquianos.com/blog/comer-en-santa-marta-restaurantes"))


        val recyclerView = view.findViewById<RecyclerView>(R.id.RecyclerViewRestaurantes)
        recyclerView.adapter = RecyclerAdapter(lista)
        recyclerView.layoutManager = LinearLayoutManager(context)

    }

}