package temperatura;

import javax.swing.JOptionPane;

public class ConverteTemperatura {

	public double CelsiusAFahrenheit(double valorOk) {
		double celsiusParaFahrenheit = valorOk * 1.8 + 32;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null,
				valorOk + " Graus Celsius são " + celsiusParaFahrenheit + " Graus Fahrenheit ");
		return celsiusParaFahrenheit;
	}

	public double CelsiusAKelvin(double valorOk) {
		double celsiusParaKelvin = valorOk + 273.15;
		celsiusParaKelvin = (double) Math.round(celsiusParaKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorOk + " Graus Celsius são " + celsiusParaKelvin + " Kelvin");
		return celsiusParaKelvin;
	}

	public double FahrenheitACelsius(double valorOk) {
		double fahrenheitParaCelsius = (valorOk - 32) / 1.8;
		fahrenheitParaCelsius = (double) Math.round(fahrenheitParaCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorOk + " Graus Fahrenheit são " + fahrenheitParaCelsius + " Celsius");
		return fahrenheitParaCelsius;
	}

	public double KelvinACelsius(double valorOk) {
		double kelvinParaCelcius = valorOk - 273.15;
		kelvinParaCelcius = (double) Math.round(kelvinParaCelcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorOk + " Kelvin são " + kelvinParaCelcius + " Celsius");
		return kelvinParaCelcius;
	}

	public double KelvinAFahrenheit(double valorOk) {
		double kelvinParaFahrenheit = (valorOk - 273.15) * 9 / 5 + 32;
		kelvinParaFahrenheit = (double) Math.round(kelvinParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorOk + " Kelvin são " + kelvinParaFahrenheit + " Fahrenheit");
		return kelvinParaFahrenheit;
	}

}
