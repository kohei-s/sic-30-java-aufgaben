public class Main {
    public static void main(String[] args) {

        /*WortlaengeZaehlen w = new WortlaengeZaehlen();
        w.coountCharacter("abcdef");
        w.coountCharacter("Klfhn390");
        w.coountCharacter("lP0123eb)(");*/

        /*ZeichenUmwandeln z = new ZeichenUmwandeln();
        z.changeCase("UkGhsbdUI");
        z.changeCase("kgjshTrfsHHHJ");
        z.changeCase("42ezhJ78KO");*/

        /*WoerterTrennen wt = new WoerterTrennen();
        wt.separateCharacters("testtesttest");*/

        /*WoerterRueckwaertsAusgeben wra = new WoerterRueckwaertsAusgeben();
        wra.reverseWord("Abcdefg");
        wra.reverseWord("87zhekiHGFpl");*/

        /*PlatzhalterErsetzen pe = new PlatzhalterErsetzen();
        pe.placeholder("[Name] is 20 Jahre alt.", "Max");
        pe.placeholder("Das gehört zu [Name].", "Maria");
        pe.placeholder("Ich habe [Name] angerufen.", "Moritz");*/

        /*ZaehlungVonBestimmtenWoertern zvbw = new ZaehlungVonBestimmtenWoertern();
        zvbw.countWord("Heute ist Donnerstag. Morgen ist Freitag.");*/

        /*SatzInPigLatinUmwandeln spu = new SatzInPigLatinUmwandeln();
        spu.translateToPigLatin("Heute ist Donnerstag. Morgen ist Freitag.");*/

        /*AnagrammePruefen ap = new AnagrammePruefen();
        ap.isAnagram("abcdfe", "BaCFeD");*/

        /*VokaleEntfernen ve = new VokaleEntfernen();
        ve.removeVowel("Es gab auf dem Platz viele Leute.");*/

        /*InitialenEinesNamens ien  = new InitialenEinesNamens();
        ien.initialLetter("Max Mustermann");*/

        /*ZufaelligesWortWaehlen zww = new ZufaelligesWortWaehlen();
        String[] words = {"apple", "banana", "orange"};
        zww.randomWord(words);*/

        /*PalindromeInEinemTextFinden pietf = new PalindromeInEinemTextFinden();
        pietf.findPalindrome("Abcba kjhdl ajhThja, skvmghsj Jghzstebetszhgj.");*/

        /*WoerterAlphabetischSortieren was  = new WoerterAlphabetischSortieren();
        was.sortWords("Apple Orange Banana Lemon");*/

        /*WoerterMitEinerBestimmtenLaenge wmebl = new WoerterMitEinerBestimmtenLaenge();
        wmebl.findWords("Apple Orange Banana Lemon", 5);*/

        /*HaeufigsteBuchstabenZaehlen hbz = new HaeufigsteBuchstabenZaehlen();
        hbz.findFrequentLetter("Apple Orange Banana Lemon");*/

        /*WortMitDenMeistenBuchstaben w = new WortMitDenMeistenBuchstaben();
        w.findLongestWord("Apple Orange Banana Lemon");*/

        /*PlagiateErkennen pe = new PlagiateErkennen();
        pe.detectPlagiarism("Apple Orange Banana Lemon",
                "Apple Orange Banana Lemon Watermelon Cherry");*/

        /*ZeilenumbruchHinzufuegen zh = new ZeilenumbruchHinzufuegen();
        zh.lineBreak("ab sch sjn amsd fme skdnee mkgled jefie aksnde aj djeken her fgetsj");*/

        /*SatzAnalysieren satz = new SatzAnalysieren();
        String test = "test test. test test";
        satz.analyseText(test);*/

        /*SonderzeichenEntfernen se = new SonderzeichenEntfernen();
        String test = "test test. test test +++# ??? %$§ bhgd(/) &%!";
        se.removeSpecialCharacters(test);*/

        /*AbkuerzungenErkennen ae = new AbkuerzungenErkennen();
        ae.findAbbreviation("The U.S.A. is different from NASA and F.B.I. but not from e.g. or i.e.");*/

        /*WortanfaengeSuchen w = new WortanfaengeSuchen();
        String test = "The U.S.A. is different from NASA and F.B.I. but not from e.g. or i.e.";
        w.findWordStartWithParticularLetter(test, "a");
        w.findWordStartWithParticularLetter(test, "n");
        w.findWordStartWithParticularLetter(test, "f");*/

        /*HTMLTagEntfernen hte = new HTMLTagEntfernen();
        String test = "The U.S.A. is <div> different from NASA <p> and F.B.I. but </p> not from e.g. or i.e.";
        hte.removeHTMLTag(test);*/

        /*TextersetzungInSaetzen tis = new TextersetzungInSaetzen();
        tis.replaceWords("Ich bin gestern zum Zahnarzt gegangen. Ich gehe morgen nochmals dahin.");*/

        /*SynonymeFinden sf = new SynonymeFinden();
        sf.findSynonym("a");
        sf.findSynonym("b");
        sf.findSynonym("c");*/

        WortlaengeVergleichen w = new WortlaengeVergleichen();
        w.compareLength("abc", "djgfkgze");
        w.compareLength("abcdfgh", "djg");
        w.compareLength("abc", "djg");

    }
}
