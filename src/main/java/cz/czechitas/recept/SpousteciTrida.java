package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Miska cervenaMiska;
        Miska zlutaMiska;
        Mixer mixer;
        Vaha kuchynskaVaha;
        PlechNaPeceni plech;
        ElektrickaTrouba trouba;
        Vajicka vajicka;

        Ovoce ovoce;
        Maslo maslo125g;
        Mouka pytlikMouky;
        Cukr pytlikCukru;
        PrasekDoPeciva prasekDoPeciva;

        cervenaMiska = new Miska("cervenaMiska");
        zlutaMiska = new Miska("zlutaMiska");
        mixer = new Mixer("mixer");
        kuchynskaVaha = new Vaha("vaha");
        plech = new PlechNaPeceni("plech");
        trouba = new ElektrickaTrouba("trouba");

        vajicka = new Vajicka("vajicka");
        ovoce = new Ovoce("ovoce");
        maslo125g = new Maslo("maslo125g");
        pytlikMouky = new Mouka("pytlikMouky");
        pytlikCukru = new Cukr("pytlikCukru");
        prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu
        // Pouzivejte napovidani v editoru.
        // Vyskakuje samo nebo pomoci Ctrl+Mezernik

        while(cervenaMiska.getPocetVajec()!=4){
        cervenaMiska.nalozSiJedenKus(vajicka);}
        System.out.println("Počet použitých vajec:" + cervenaMiska.getPocetVajec());
        cervenaMiska.nalozSiCelyObsah(pytlikCukru);
        mixer.zamichej(cervenaMiska);
        cervenaMiska.nalozSiCelyObsah(maslo125g);
        mixer.zamichej(cervenaMiska);
        kuchynskaVaha.vynulujSeS(zlutaMiska);
        zlutaMiska.nalozSiTrochu(pytlikMouky);
        while (zlutaMiska.getHmotnost() != 250) {
            if (zlutaMiska.getHmotnost() < 250) {
                zlutaMiska.nalozSiTrochu(pytlikMouky);
            } else if (zlutaMiska.getHmotnost() > 250) {
                zlutaMiska.vylozSiTrochu(pytlikMouky);
            }
            }

kuchynskaVaha.zjistiHmotnost(zlutaMiska);

        cervenaMiska.nalozSiObsahJineMisky(zlutaMiska);
        cervenaMiska.nalozSiCelyObsah(prasekDoPeciva);
        mixer.zamichej(cervenaMiska);
        plech.preberSiObsah(cervenaMiska);
        plech.posypSeKusem(ovoce);
        while (plech.getPocetOvoce() != 50) {
            plech.posypSeKusem(ovoce);
        }
        System.out.println("Mám právě tolik malin: " + plech.getPocetOvoce());
        trouba.zapniSe(180);
        trouba.nechejPect(5);
        trouba.vlozSiDovnitr(plech);
        trouba.nechejPect(25);
        trouba.vypniSe();
        trouba.vyndejObsahVen();


    }
}
