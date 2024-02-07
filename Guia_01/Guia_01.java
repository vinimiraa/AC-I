/**
 *  Arquitetura de Computadores I - Guia_0101c.java
 *  812839 - Vinicius Miranda de Araujo
*/
public class Guia_01 
{
    /**
     *  Contador de erros.
     */
    private static int errors = 0;

    /**
     *  Testar se dois valores sao iguais.
     *  @param x - primeiro valor
     *  @param y - segundo valor
     */
    public static void test_equals(Object x, Object y) {
        if (("" + x).compareTo("" + y) != 0)
            errors = errors + 1;
    } // end test_equals ( )

    /**
     *  Exibir o total de erros.
     *  @return mensagem com o total de erros
     */
    public static String test_report() {
        return ("" + errors);
    } // end test_report ( )

    /**
     *  Converter valor decimal para binario.
     *  @return binario equivalente
     *  @param value - valor decimal
     */
    public static String dec2bin(int value) {
        return ("0");
    } // end dec2bin ( )

    /**
     *  Converter valor binario para decimal.
     *  @return decimal equivalente
     *  @param value - valor binario
     */
    public static int bin2dec(String value) {
        return (-1);
    } // end bin2dec ( )

    /**
     *  Converter valor decimal para base indicada.
     *  @return base para a conversao
     *  @param value - valor decimal
     */
    public static String dec2base(int value, int base) {
        return ("0");
    } // end dec2base ( )

    /**
     *  Converter valor binario para base indicada.
     *  @return valor equivalente na base indicada
     *  @param value - valor binario
     *  @param base - para a conversao
     */
    public static String bin2base(String value, int base) {
        return ("0");
    } // end bin2base ( )

    /**
     *  Converter valor em ASCII para hexadecimal.
     *  @return hexadecimal equivalente
     *  @param value - caractere(s) em codigo ASCII
     */
    public static String ASCII2hex(String value) {
        return ("0");
    } // end ASCII2hex ( )

    /**
     *  Converter valor em hexadecimal para ASCII.
     *  @return caractere(s) em codigo ASCII
     *  @param value - hexadecimal equivalente(s)
     */
    public static String hex2ASCII(String value) {
        return ("0");
    } // end hex2ASCII ( )

    /**
     *  Acao principal.
     */
    public static void main( String[] args ) 
    {
        System.out.println("Guia_01 - Java Tests ");
        System.out.println("812839 - Vinicius Miranda de Araujo ");
        System.out.println();
        test_equals(dec2bin(23), "10101");
        test_equals(dec2bin(57), "10101");
        test_equals(dec2bin(732), "10101");
        test_equals(dec2bin(321), "10101");
        test_equals(dec2bin(364), "10101");
        System.out.println("1. errorTotalReport = " + test_report());
        test_equals(bin2dec("10011"), 0);
        test_equals(bin2dec("11101"), 0);
        test_equals(bin2dec("10110"), 0);
        test_equals(bin2dec("101101"), 0);
        test_equals(bin2dec("110011"), 0);
        System.out.println("2. errorTotalReport = " + test_report());
        test_equals(dec2base(67, 4), "10101");
        test_equals(dec2base(58, 8), "10101");
        test_equals(dec2base(76, 16), "10101");
        test_equals(dec2base(157, 16), "10101");
        test_equals(dec2base(735, 16), "10101");
        System.out.println("3. errorTotalReport = " + test_report());
        test_equals(bin2base("10111", 4), "10101");
        test_equals(bin2base("11110", 8), "10101");
        test_equals(bin2base("100101", 16), "10101");
        test_equals(bin2base("101011", 8), "10101");
        test_equals(bin2base("101100", 4), "10101");
        System.out.println("4. errorTotalReport = " + test_report());
        test_equals(ASCII2hex("PUC-M.G."), "10101");
        test_equals(ASCII2hex("2024-01"), "10101");
        test_equals(ASCII2hex("Minas Gerais"), "10101");
        // OBS.: A seguir, exemplos apenas para os primeiros, acrescentar todos os
        // outros códigos propostos!
        test_equals(hex2ASCII("116 ..."), "10101"); // OBS.: 116 e' o primeiro octal (0116)!
        test_equals(hex2ASCII("54 ..."), "10101"); // OBS.: 54 e' o primeiro hexadecimal (0x54)!
        System.out.println("5. errorTotalReport = " + test_report());
        System.out.print("\n\nApertar ENTER para terminar.");
        System.console().readLine();
    } // end main

} // end class
