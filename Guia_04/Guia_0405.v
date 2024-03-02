// --------------------- 
// TRUTH TABLE 
// Nome: Vinicius Miranda de Araujo
// Matricula: 812839
// --------------------- 

// --------------------- 
// SoP 
// --------------------- 

module SoP (output s1,
            output s2,
            output s3,
            output s4,
            output s5,
            input  x, y, w, z); // mintermos 
 assign s = ( ~x &  y )   // 1 
          | (  x & ~y );  // 2 
endmodule // SoP

// --------------------- 
// PoS 
// --------------------- 

module PoS (output S1,
            output S2,
            output S3,
            output S4,
            output S5,
            input  X, Y, W, Z); 
            // MAXTERMOS 
 assign S = (  X |  Y )  // 0 
          & ( ~X | ~Y ); // 3 
endmodule // PoS 

// --------------------- 
// Guia_0405 
// --------------------- 

module Guia_0405; 
    reg   x = 0, y = 0, w = 0, z = 0; 
    reg   X = 0, Y = 0, W = 0, Z = 0; 
    wire  s1, s2, s3, s4, s5; 
    wire  S1, S2, S3, S4, S5; 
    // instancias 
    SoP SOP (s1, s2, s3, s4, s5, x, y, w, z); 
    PoS POS (S1, S2, S3, S4, S5, X, Y, W, Z); 

    // valores iniciais 
    initial begin: start 
        x=1'bx; y=1'bx;   // indefinidos 
    end 

    // parte principal 
    initial begin: main 
        // identificacao 
        $display("Guia_0405 - Teste \n");  
        // monitoramento 
        $display(" x  y  = s1 s2 s3"); 
        $monitor("%2b %2b  = %2b %2b %2b", x, y, s1, s2, s3); 
        // sinalizacao 
        #1  x=0; y=0; 
        #1  x=0; y=1; 
        #1  x=1; y=0; 
        #1  x=1; y=1; 
    end 

endmodule // Guia_0405 