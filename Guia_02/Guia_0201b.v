/*
   Arquitetura de Computadores I - Guia_0201b.v
   812839 - Vinícius Miranda de Araújo
*/

module Guia_0201; 

   real            x =   0 ; // decimal 
   real  power2 = 1.0; // power of 2 
   integer       y =   7 ; // counter 
   reg [7:0]     b = 8'b10100000; // binary (only fraction part, Big Endian) 

   initial begin : main 
   
      $display ( "Guia_0201 - Tests" ); 
      $display ( "x = %f" , x ); 
      $display ( "b = 0.%8b", b ); 
      while ( y >= 0 ) 
         begin 
         power2 = power2 / 2.0; 
         if ( b[y] == 1 ) 
         begin 
            x = x + power2; 
         end 
         $display ( "x = %f", x ); 
         y=y-1; 
         end // end while 

   end // main 

endmodule // Guia_0201