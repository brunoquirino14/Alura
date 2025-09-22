package br.com.alura.screenmatch.exerciciosMod4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double temp) {
        System.out.println("O valor da temperatura em Fahrenheit é: "+((temp*1.8)+32)+" graus Fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double temp) {
        System.out.println("O valor da temperatura em Celsius é: "+((temp-32)/1.8)+" graus Celsius");
    }
}
