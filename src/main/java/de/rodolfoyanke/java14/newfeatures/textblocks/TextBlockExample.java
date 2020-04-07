package de.rodolfoyanke.java14.newfeatures.textblocks;

public class TextBlockExample {
    public static void main(String[] args) {
        var java11TextBlock =
                "<html>\n" +
                "    <body>\n" +
                "        <p>html is just a bunch of TRs and TDs</p>\n" +
                "    </body>\n" +
                "</html>\n";

        var java14TextBlock =
                """
                <html>
                    <body>
                        <p>html is just a bunch of TRs and TDs</p>
                    </body>
                </html>
                """;

        System.out.println(java14TextBlock);
    }
}