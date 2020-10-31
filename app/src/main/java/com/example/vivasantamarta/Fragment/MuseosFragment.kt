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


class MuseosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_museos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.RecyclerViewMuseos)

        val lista = ArrayList<Sitios>()
        lista.add(Sitios(R.drawable.museosuno,"Quinta de San Pedro","Direccón: (3.4 km) por Cl. 39/Av. El Libertador",
            "La Quinta de San Pedro Alejandrino es una antigua hacienda situada en la ciudad de Santa Marta, al norte de Colombia. Ocupa la casa y " +
                    "algunos terrenos de una hacienda del siglo XVII dedicada a la producción de ron, miel, y panela. Simón Bolívar pasó allí sus últimos días y" +
                    " falleció el 17 de diciembre de 1830. Se encuentra ubicada en el barrio Mamatoco. Alberga el Altar de la Patria, un Museo de Arte Contemporáneo," +
                    " un Jardín Botánico y las instalaciones coloniales de la hacienda propiamente dicha. Esta incluye un bosque que limita con la Universidad del Magdalena " +
                    "y el río Manzanares. Es uno de los mayores atractivos turísticos de Santa Marta y es administrada por la Fundación Museo Bolivariano de Arte Contemporáneo. ",
            "Referencia Bibliografica:\n* Quinta de San Pedro Alejandrino. (2020, 24 de agosto). Wikipedia, La enciclopedia libre. Fecha de consulta: 11:16, octubre 23, 2020" +
                    " desde https://es.wikipedia.org/w/index.php?title=Quinta_de_San_Pedro_Alejandrino&oldid=128721160." +
                    "\n* Magdalena Nov 12, 2018 Por: Agustín Iguarán @AgustinIguaran:https://www.elheraldo.co/magdalena/quinta-de-san-pedro-alejandrino-un-regreso-los-ultimos-dias-de-bolivar-567804"
        ))

        lista.add(Sitios(R.drawable.museosdos,"Claustro san Juan Nepomuceno","Dirección:Cl. 16 #1C-72, Santa Marta, Magdalena",
        "El Claustro San Juan Nepomuceno fue una edificación construida a mediados del siglo 18 e inaugurado a comienzos del 19. Esta ubicado en la carrera 2ª N° 16-44  en el Centro Histórico de Santa Marta." +
                "\n" +
                "Este lugar cuenta con una grandiosa historia llena de cultura, en sus inicios fue construido como centro para el Real Seminario Conciliar. Según la investigadora Carolina Navarro  la obra inició en 1673" +
                " y fue finalizado cien años  más tarde.Siempre ha estado vinculado con temas de educación desde su construcción cuando sirvió como sede del Colegio Superior, Seminario Mayor de la Diócesis de Santa Marta, Palacio" +
                " Episcopal, Gobernación del Magdalena, Casa de la Cultura, entre otras entidades importantes que funcionaron allí.\n" +
                "\n" +
                "Actualmente tiene 226 años de existencia fue declarado Patrimonio Cultural y Arquitectónico de la Nación en 1996. En las últimas dos décadas ha sido utilizado como centro de cultura de la Universidad del Magdalena.",
            "Referencia Bibliografica:\n Escrito por: Kiara Guerrero Batista 10 diciembre, 2019:https://codigoprensa.com/claustro-san-juan-nepomuceno-lugar-alberga-cultura-e-historia/" +
                    "@2017 - Codigoprensa.com - Diseñado por Código Prensa"))

        lista.add(Sitios(R.drawable.museoscuatro,"Museo del oro Tairona","Dirección: Carrera 2 Parque Simón Bolívar, Santa Marta, Magdalena",
            "La Casa de la Aduana (también conocida como Museo del Oro Tairona, Casa Simón Bolívar, Museo Tairona) es un inmueble colonial ubicado en la Plaza de Bolívar en la ciudad de Santa Marta, Magdalena.\n" +
                    "\n" +
                    "Es la sede regional del Museo del Oro, que es parte del Banco de la República de Colombia. Este museo brinda al visitante una visión de la orfebrería y la cultura de los antiguos habitantes de la Sierra Nevada.\n" +
                    "Placa recordatoria del velatorio de Simón Bolívar, arriba, dintel de la puerta principal.\n" +
                    "\n" +
                    "En el piso alto del tramo occidental de esta casa permaneció expuesto en capilla ardiente el cadáver del Libertador Simón Bolívar del 17 al 20 de diciembre de 1830.1",
        "Referecia Bibliografica: \n " +
                "* Casa de la Aduana. (2020, 6 de agosto). Wikipedia, La enciclopedia libre. Fecha de consulta: 20:54, octubre 23, 2020 desde https://es.wikipedia.org/w/index.php?title=Casa_de_la_Aduana&oldid=128297991." +
                "\n* Foto:Eduardo Londoño Laverde © Banco de la República\n" +
                "https://www.banrepcultural.org/noticias/la-casa-de-la-aduana-su-historia-y-sus-mitos"))

        lista.add(Sitios(R.drawable.museoscinco,"Museo bolivariano","Avenida del Libertador,Quinta de San Pedro Alejandrino., Santa Marta, Magdalena",
        "El arte también cuenta con espacios para su exhibición y fomento en la ciudad.\n" +
                "El Museo Bolivariano de Arte Contemporáneo, es el escenario en el que durante todo el año se presentan no solo obras de artistas reconocidos por sus técnicas y grandes obras, sino que también se le brinda espacio a" +
                " los nuevos artistas locales, nacionales o internacionales.\n" +
                "\n" +
                "Nacido de la iniciativa del artista colombiano Armando Villegas con el beneplácito de las autoridades regionales y el presidente de la República de entonces Belisario Betancur, el Museo Bolivariano de Arte Contemporáneo " +
                "abre sus puertas el 24 de julio de 1986 al interior de la Hacienda San Pedro Alejandrino, con la intención de hacer realidad a través del arte, el sueño de integración de los países bolivarianos (Bolivia, Colombia, Ecuador, " +
                "Perú, Panamá y Venezuela) como tributo al Libertador de Naciones, Simón Bolívar.",
        "Referencia Bibliografica:\n* Editorial Magdalena S.A.\n* https://www.laguiaturistica.com/index.php/santa-marta/sitios-turisticos/339-museo-bolivariano-de-arte-contemporaneo"))

        lista.add(Sitios(R.drawable.museostres,"Casa de la Aduana","Dirección: Carrera 2 Parque Simón Bolívar, Santa Marta, Magdalena",
        "Este museo forma parte de una estrategia institucional del alma mater pública del departamento para contar con espacios de exhibición, investigación y divulgación del patrimonio cultural regional-local.\n" +
                "\n" +
                "Actualmente el MEUM se encuentra ubicado en el Claustro San Juan Nepomuceno. Desde su puesta en marcha en diciembre de 2005, el MEUM se ha fijado como objetivo central la puesta en escena de las identidades," +
                " del reconocimiento y exposición de la diversidad cultural de la región Caribe colombiana.\n" +
                "\n" +
                "Abierto de lunes a sábado de 8:00 am - 7:00 pm, los visitantes encontrarán desde colecciones de hallazgos arqueológicos de la Cultura Tairona, con muestras de orfebrería y cerámica; así como utensilios relacionados " +
                "con el ámbito de la medicina y religiosidad y referentes de la vida cotidiana del contexto samario.",
        "Referencia Bibliografica:\n *Foto: https://expotur-eco.com/museos-en-santa-marta-colombia/museo-etnografico-de-la-universidad-del-magdalena-meum\n" +
                "* https://www.santamarta.gov.co/museos "))



        recyclerView.adapter = RecyclerAdapter(lista)
        recyclerView.layoutManager = LinearLayoutManager(context)


    }


}