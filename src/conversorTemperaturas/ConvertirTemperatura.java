package conversorTemperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
	}
	
	public void ConvertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
	}
	
	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celcius");
	}
	
	public void ConvertirKelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
         kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
	}
	
	public void ConvertirFarenheitAKelvin(double valor) {
		double farenheitKelvin = 0.5555555555555556*(valor - 32) + 273.15;
		farenheitKelvin	= (double) Math.round(farenheitKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +farenheitKelvin+ " Kelvin");
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = 1.8*(valor - 273.15) + 32;
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Celcius");
	}

}
