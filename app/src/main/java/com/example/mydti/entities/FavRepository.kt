package com.example.mydti.entities

class FavRepository {

    var favList: MutableList<Favoritos> = mutableListOf()

    init {
        favList.add(Favoritos("La perla","35", "Despejado",1,1,"SE",1))
        favList.add(Favoritos("Varese","36", "Lluvias",1,1,"SE",1))
        favList.add(Favoritos("El Faro","22", "Soleado",1,1,"SE",1))
        favList.add(Favoritos("Las Grutas","29", "Nublado",1,1,"SE",1))
        favList.add(Favoritos("Windy","31", "Despejado",1,1,"SE",1))
        favList.add(Favoritos("El torreon","19", "Soleado",1,1,"SE",1))
        favList.add(Favoritos("Havanna","42", "Lluvias",1,1,"SE",1))
        favList.add(Favoritos("Alfonsina","40", "Lluvias",1,1,"SE",1))
        favList.add(Favoritos("Muelle","36", "Nublado",1,1,"SE",1))
        favList.add(Favoritos("Escolleras","33", "Soleado",1,1,"SE",1))
    }
}