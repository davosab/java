/*
Este necesara existenta unui constructor in clasa PunctColorat pentru ca sa 
putem crea obiecte PunctColorat.

Este necesara deoarece trebuie sa construim instanta subclasei ca si o 
extindere a superclasei, si aceasta se face prin "super()", care se poate 
afla doar pe prima linie a unui constructor. Trebuie sa declaram ce campuri 
sunt mostenite.
*/


public PunctColorat(int x, int y, int c) {
  super(x, y); // apeleaza constructorul clasei Punct
  this.c = c; // lucram in constructorul acesta
}


