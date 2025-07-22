package test.models;

import java.util.List;

import org.junit.jupiter.api.Assertions;

public class Maquina {

    String nombre;
    String ip;
    List<Integer> codigos;
    int subred;
    int riesgo;
    public Maquina(String nombre, String ip, List<Integer> codigos, int subred, int riesgo) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = subred;
        this.riesgo = riesgo;
    }

    public static void validarSubred(Maquina var0, int var1) {
      int var2 = Integer.parseInt(var0.getIp().split("\\.")[2]);
      Assertions.assertEquals(var2, var1, "Subred calculada incorrectamente para " + var0);
      Assertions.assertTrue(var1 >= 0 && var1 <= 255, "Subred fuera de rango en: " + var0);
      Assertions.assertEquals(4, var0.getIp().split("\\.").length, "La IP debe tener 4 octetos: " + var0.getIp());
   }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getIp() {
        return ip;
    }


    public void setIp(String ip) {
        this.ip = ip;
    }


    public List<Integer> getCodigos() {
        return codigos;
    }


    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }


    public int getSubred() {
        return subred;
    }


    public void setSubred(int subred) {
        this.subred = subred;
    }


    public int getRiesgo() {
        return riesgo;
    }


    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }


}
