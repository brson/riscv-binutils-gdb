SEARCH_DIR(/lib) 			
SEARCH_DIR(/usr/lib) 			
SEARCH_DIR(/usr/local/lib) 		
SECTIONS 				
{ 					
  .text 0: 				
  { 					
   CREATE_OBJECT_SYMBOLS                
    *(.text) 				
    } 					
  .data SIZEOF(.text) + ADDR(.text) :	
  { 					
    *(.data) 				
    } 					
  .bss SIZEOF(.data) + ADDR(.data) :	
  {					
    *(.bss)				
   [COMMON]				
    } 					
} 					
