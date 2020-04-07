package de.rodolfoyanke.java14.newfeatures.npes;

public class NPEsExample {
    public static void main(String[] args) {
        var grandpa = new Grandpa();
        System.out.println(grandpa.getPapa().getSon().getGrandson().getName());
    }

//    Exception in thread "main" java.lang.NullPointerException
//    at de.rodolfoyanke.newfeatures.npes.NPEsExample.main(NPEsExample.java:6)

//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "de.rodolfoyanke.newfeatures.npes.Grandpa$Grandson.getName()" because the return value of "de.rodolfoyanke.newfeatures.npes.Grandpa$Son.getGrandson()" is null
//    at de.rodolfoyanke.newfeatures.npes.NPEsExample.main(NPEsExample.java:6)
}