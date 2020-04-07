package de.rodolfoyanke.java14.newfeatures.npes;

import lombok.Data;

@Data
public class Grandpa {
    private Papa papa = new Papa();

    @Data
    public static class Papa {
        private Son son = new Son();
    }

    @Data
    public static class Son {
        private Grandson grandson;
    }

    @Data
    public static class Grandson {
        private String name;
    }
}