import java.io.Console;
import java.util.Scanner;

public class MetricConverter2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double amount = Double.parseDouble(console.nextLine());
        String inValue = console.nextLine();
        String outValue = console.nextLine();

        double result = 0;
    switch(inValue) {
	case "m":
        switch (outValue)
        {
            case "m": result = amount;break;
            case "mm": result = amount*1000;break;
            case "cm": result = amount*100;break;
            case "mi": result = amount*0.000621371192;break;
            case "in": result = amount*39.3700787;break;
            case "km": result = amount*0.001;break;
            case "ft":result = amount*3.2808399;break;
            case "yd": result = amount*1.0936133;break;
        }break;
        case "mm":
        switch (outValue)
        {
            case "mm": result = amount; break;
            case "m": result = amount / 1000;break;
            case "cm": result = amount / 1000 * 100;break;
            case "mi": result = amount / 1000 * 0.000621371192;break;
            case "in": result = amount / 1000 * 39.3700787;break;
            case "km": result = amount / 1000 * 0.001;break;
            case "ft": result = amount / 1000 * 3.2808399;break;
            case "yd": result = amount / 1000 * 1.0936133;break;
        }break;
        case "cm":
        switch (outValue)
        {
            case "cm": result = amount; break;
            case "m": result = amount / 100;break;
            case "mm": result = amount / 100 * 1000;break;
            case "mi": result = amount / 100 * 0.000621371192;break;
            case "in": result = amount / 100 * 39.3700787;break;
            case "km": result = amount / 100 * 0.001;break;
            case "ft": result = amount / 100 * 3.2808399;break;
            case "yd": result = amount / 100 * 1.0936133;break;
        }break;
        case "mi":
        switch (outValue)
        {
            case "mi": result = amount; break;
            case "m": result = amount / 0.000621371192;break;
            case "mm": result = amount / 0.000621371192 * 1000;break;
            case "cm": result = amount / 0.000621371192 * 100;break;
            case "in": result = amount / 0.000621371192 * 39.3700787;break;
            case "km": result = amount / 0.000621371192 * 0.001;break;
            case "ft": result = amount / 0.000621371192 * 3.2808399;break;
            case "yd": result = amount / 0.000621371192 * 1.0936133;break;
        }break;
        case "in":
        switch (outValue)
        {
            case "in": result = amount; break;
            case "m": result = amount / 39.3700787;break;
            case "mm": result = amount / 39.3700787 * 1000;break;
            case "cm": result = amount / 39.3700787 * 100;break;
            case "mi": result = amount / 39.3700787 * 0.000621371192;break;
            case "km": result = amount / 39.3700787 * 0.001;break;
            case "ft": result = amount / 39.3700787 * 3.2808399;break;
            case "yd": result = amount / 39.3700787 * 1.0936133;break;
        }break;
        case "km":
        switch (outValue)
        {
            case "km": result = amount; break;
            case "m": result = amount / 0.001;break;
            case "mm": result = amount / 0.001 * 1000;break;
            case "cm": result = amount / 0.001 * 100;break;
            case "mi": result = amount / 0.001 * 0.000621371192;break;
            case "in": result = amount / 0.001 * 39.3700787;break;
            case "ft": result = amount / 0.001 * 3.2808399;break;
            case "yd": result = amount / 0.001 * 1.0936133;break;
        }break;
        case "ft":
        switch (outValue)
        {
            case "ft": result = amount; break;
            case "m": result = amount / 3.2808399;break;
            case "mm": result = amount / 3.2808399 * 1000;break;
            case "cm": result = amount / 3.2808399 * 100;break;
            case "mi": result = amount / 3.2808399 * 0.000621371192;break;
            case "in": result = amount / 3.2808399 * 39.3700787;break;
            case "km": result = amount / 3.2808399 * 0.001;break;
            case "yd": result = amount / 3.2808399 * 1.0936133;break;
        }break;
        case "yd":
        switch (outValue)
        {
            case "yd": result = amount; break;
            case "m": result = amount / 1.0936133;break;
            case "mm": result = amount / 1.0936133 * 1000;break;
            case "cm": result = amount / 1.0936133 * 100;break;
            case "mi": result = amount / 1.0936133 * 0.000621371192;break;
            case "in": result = amount / 1.0936133 * 39.3700787;break;
            case "km": result = amount / 1.0936133 * 0.001;break;
            case "ft": result = amount / 1.0936133 * 3.2808399;break;
        }break;
       
    }
System.out.printf("%f, %s", result, outValue);
	}
}

