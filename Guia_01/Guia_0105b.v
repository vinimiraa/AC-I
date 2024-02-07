/*
    Arquitetura de Computadores I - Guia_0105b.v
    812839 - Vinícius Miranda de Araújo
*/

module Guia_0105;

    integer x = 13; // decimal
    reg [7:0] b ; // binary
    reg [0:2][7:0] s = "PUC"; // char array[3] (3x8 bits - little Endian)

    initial begin : main
    $display ( "Guia_0105b\n" );

    $display ( "x = %d" , x );
    $display ( "b = %8b", b );
    $display ( "s = %s" , s );
    b = x;
    $display ( "b = [%4b] [%4b] = %h %h", b[7:4], b[3:0], b[7:4], b[3:0] );
    s[0] = "-";
    s[1] = 8'b01001101; // 'M'
    s[2] = 71; // 'G'
    $display ( "s = %s" , s );
    
    end // main

endmodule // Guia_0105