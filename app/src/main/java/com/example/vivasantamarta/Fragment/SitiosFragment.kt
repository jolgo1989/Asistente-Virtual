package com.example.vivasantamarta.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vivasantamarta.R
import com.example.vivasantamarta.RecyclerAdapter
import com.example.vivasantamarta.Sitios


class SitiosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sitios, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val lista = ArrayList<Sitios>()
        lista.add( Sitios(R.drawable.lugaresuno,"Rodadero","Dirección: (11.7 km) por Carretera 90, partiendo de Santa Marta","El Rodadero es un" +
                " balneario de la ciudad de Santa Marta, a orillas del mar Caribe en Colombia. Se encuentra en la comuna de Gaira -" +
                " Rodadero. Su desarrollo comenzó a mediados de los años 1950 y desde entonces se ha convertido en uno de los principales destinos turísticos del país.",
            "Referencia Bibliografica:\n* El Rodadero. (2020, 21 de octubre). Wikipedia, La enciclopedia libre. Fecha de consulta: 10:04, octubre 23, 2020 desde https://es.wikipedia.org/w/index.php?title=El_Rodadero&oldid=130234442.\n" +
                    "* Foto: tomada del Twitter de @ALEJOMICHELLS:https://sostenibilidad.semana.com/medio-ambiente/articulo/la-bahia-de-santa-marta-vuelve-a-ser-la-mas-linda-de-america/49479"))

        lista.add(Sitios(R.drawable.lugarestres,"Parque tayrona","Dirección: Mingueo-Santa Marta/Av. Troncal Del Caribe,partiendo de Santa Marta",
            "El Parque Nacional Natural Tayrona se encuentra ubicado en las estribaciones de la Sierra Nevada de Santa Marta en el Caribe de Colombia. Su superficie hace parte del departamento del Magdalena.\n" +
                    "\n" +
                    "A 34 km del centro urbano de Santa Marta es uno de los parques naturales más importantes de Colombia. Es hábitat de una gran cantidad de especies que se distribuyen en regiones con diferentes pisos " +
                    "térmicos que van desde el nivel del mar hasta alturas de 900 m.",
            "Referencia Bibliografica:\n* Parque nacional natural Tayrona. (2020, 21 de octubre). Wikipedia, La enciclopedia libre. Fecha de consulta: 10:34, octubre 23, 2020 desde https://es.wikipedia.org/w/index.php?title=Parque_nacional_natural_Tayrona&oldid=130256394." +
                    "\n* Published 1 año ago on 9 octubre, 2019 By Opinión Caribe:" +
                    "https://www.opinioncaribe.com/2019/10/09/samarios-tendran-reduccion-del-50-en-la-tarifa-de-ingreso-al-parque-tayrona/"))

        lista.add(Sitios(R.drawable.lugarescinco,"Cascadas de marinca"," Dirección:(16.5 km) por Via a Minca, partiendo de Santa Marta",
            "Minca es un corregimiento del distrito de Santa Marta, en el departamento del Magdalena, al norte de Colombia. Está ubicada " +
                    "en las estribaciones de la Sierra Nevada de Santa Marta, a unos 14 km del centro de la ciudad1. Minca es la capital ecológica de la Sierra nevada de Santa. Entre sus atractivos destacan el río, las cascadas de Marinka, el Pozo Azul, y las piedras, " +
                    "entre otros. También se pueden destacar su agradable clima y su zona cafetera. Últimente Minca dispone también de muchos hostales que ofrecen a sus huéspedes comodidad y tranquilidad. ",
        "Referencia Bibliografica:\n* Minca (Santa Marta). (2020, 22 de junio). Wikipedia, La enciclopedia libre. Fecha de consulta: 10:49, octubre 23, 2020 desde https://es.wikipedia.org/w/index.php?title=Minca_(Santa_Marta)&oldid=127155628. " +
                "* Minca, Colombia Foto gracias a @josemostajo:" +
                "https://co.pinterest.com/pin/737745982684584473/"))

        lista.add(Sitios(R.drawable.lugareocho,"Ciudad Perdida","Dirección: vía a Santa Marta-Riohacha y deviándose en el sitio conocido como Guacha Puerto Nuevo, en el kilómetro 52, hacia la población de El Mamey.",
        "Ciudad Perdida, también conocida como Teyuna o Buritaca-200 o Infierno Verde,1 fue un antiguo poblado indígena tayrona y sitio arqueológico perteneciente a la ciudad de Santa Marta, en Colombia. Fue construido alrededor" +
                " del siglo VIII de nuestra era y es considerado como uno de los principales sitios arqueológicos de Colombia.3" +
                 "Hace parte de uno de los más de 250 poblados antiguos de los cuatro grupos indígenas encontrados en la cara norte y suroeste de la Sierra Nevada de Santa Marta, en el departamento del Magdalena al norte de Colombia.",
        "Referencia Bibliografica:\n* Ciudad Perdida. (2020, 22 de octubre). Wikipedia, La enciclopedia libre. Fecha de consulta: 10:57, octubre 23, 2020 desde https://es.wikipedia.org/w/index.php?title=Ciudad_Perdida&oldid=130263731." +
                "\n* fotografía por Citlali Flores:https://magictourcolombia.com/es/como-subir-ciudad-perdida-colombia-y-no-morir-en-el-intento/"))

        lista.add((Sitios(R.drawable.lugaresdos,"Taganga","Dirección: (11.2 km) por Vía Alterna al Puerto (11.2 km) por Vía Alterna al Puerto, partiendo de Santa Marta",
            "Taganga es un corregimiento de Santa Marta, en Magdalena (Colombia) Tiene 3.000 habitantes. Está compuesto por un poblado a orillas de la bahía del mismo nombre cuya actividad tradicional ha sido la pesca, aunque recientemente " +
                    "el turismo ha cobrado una gran preeminencia. El acceso es posible por carretera, desde el centro de Santa Marta.\n",
            "Referencia Bibliografica:\n* Taganga. (2020, 3 de octubre). Wikipedia, La enciclopedia libre. Fecha de consulta: 11:06, octubre 23, 2020 desde https://es.wikipedia.org/w/index.php?title=Taganga&oldid=129754544." +
                    "\n* Taganga, Santa Marta, Colombia / Foto: GettyImages:https://caracol.com.co/programa/2020/07/05/al_campo/1593948679_779177.html")))






        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewLugares)
        recyclerView.adapter = RecyclerAdapter(lista)

        recyclerView.layoutManager = LinearLayoutManager(context)


    }


}

