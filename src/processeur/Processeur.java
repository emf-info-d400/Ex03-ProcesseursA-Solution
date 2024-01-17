package processeur;

/**
 * Application "Processeur". Application qui fait un usage progressivement plus
 * complexe de classes et objets.
 *
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 18 octobre 2023
 * @version 0.1
 */
public class Processeur {

    /**
     * Constante qui représente le nombre de CPU à gérer.
     */
    public static final int NBRE_CPU = 20;

    /**
     * La méthode main() de l'application, là où tout commence mais... tout se
     * finit-il bien là ?
     *
     * @param args les arguments du programme passés sur la ligne de commande
     */
    public static void main(String[] args) {

        // Créer le tableau de CPU
        CPU[] cpus = new CPU[NBRE_CPU];

        // Y mettre des CPUS connus
        cpus[0] = new CPU("Intel 4004", 1971, 2300, 0.06);
        cpus[1] = new CPU("Intel 8088", 1972, 3500, 0.06);
        cpus[2] = new CPU("Intel 8086", 1978, 29000, 0.33);
        cpus[3] = new CPU("Intel 80286", 1982, 134000, 1);
        cpus[4] = new CPU("Intel 80386", 1985, 275000, 5);
        cpus[5] = new CPU("Intel 80486", 1989, 1200000, 20);
        cpus[6] = new CPU("Intel Pentium 1", 1993, 3100000, 100);
        cpus[7] = new CPU("Intel Pentium 2", 1997, 7500000, 300);
        cpus[8] = new CPU("Intel Pentium 3", 1999, 9500000, 510);
        cpus[9] = new CPU("Intel Pentium 4", 2000, 42000000, 1700);
        cpus[10] = new CPU("Intel Pentium 4 D (Prescott)", 2004, 125000000, 9000);
        cpus[11] = new CPU("Intel Core 2 Duo (Conroe)", 2006, 291000000, 22000);
        cpus[12] = new CPU("Intel Core i7 (Quad)", 2008, 731000000, 82300);
        cpus[13] = new CPU("Intel Core i7 (Gulftown)", 2010, 1170000000, 147600);
        cpus[14] = new CPU("Intel Core i7 (Haswell-E)", 2014, 2600000000L, 238310);
        cpus[15] = new CPU("Oracle SPARC M7", 2015, 10000000000L);

        // Passer en revue chaque CPU de notre liste
        for (int i = 0; i < cpus.length; i++) {
            CPU cpu = cpus[i];
            // Y a-t-il un CPU à cet endroit ?
            if (cpu != null) {
                // Oui. Alors l'afficher !
                if (cpu.getMips() == cpu.UNKNOWN_MIPS) {
                    System.out.println(
                            "En " + cpu.getAnnee() + " le CPU " + cpu.getNom() + " avec " + cpu.getTransistors() +
                                    " transistors et une puissance de calcul inconnue.");
                } else {
                    System.out.println(
                            "En " + cpu.getAnnee() + " le CPU " + cpu.getNom() + " avec " + cpu.getTransistors() +
                                    " transistors et une puissance de calcul de " + cpu.getMips() + " mips.");
                }
            }
        }
    }

}
