package classes;

public class Transformar {

    static public String palabra(int num) {
        /**
         * 1 => "uno",
         * 5 => "cinco",
         * 945821 => "novecientos cuarenta y cinco mil ochocientos veinti uno"
         */
        String[] primeros15 = {
                "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
                "siete", "ocho", "nueve", "diez", "once", "doce", "trece",
                "catorce", "quince"
        };
        String [] decenas_palabras = {"","","", "treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
        String [] centenas_palabras = {"cien","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
        if (num <= 15) { // los primeros 15
            return primeros15[num];
        } else if (num <= 19) { // dieci-algo
            int unidades = num - 10;
            return "dieci" + palabra(unidades);
        }else if(num == 20){
            return "veinte";

        }
        else if (num <= 29){
            int unidades = num - 20;
            return "veinti" + palabra(unidades);

        }else if (num <= 99){
            int decenas = Math.round(num / 10);
            int unidades = num -( decenas * 10);
            if (unidades == 0) {
                return decenas_palabras[decenas];
            }
            return decenas_palabras[decenas] + " y "+ palabra(unidades);
        }else if (num == 100){
            return "cien";
        }else if (num <= 999){ // cien - algo
            
                int centenas = Math.round(num / 100);
                int unidades = num -( centenas * 100);

                if(unidades == 0){
                    return centenas_palabras[centenas-1];
                }
            return centenas_palabras[centenas-1]+" "+ palabra(unidades);
        }else if(num == 1000){
            return "mil";
        }else if(num <= 1999){ // mil - algo
            int resto = num -1000;
            return "mil "+ palabra(resto);

           
        }else if (num <= 999999){ // algo - mil - algo
            int restoMiles = Math.round(num /1000);
            int restoCentenas = num -(restoMiles * 1000);

            System.out.println("Resto miles: " + restoMiles);
            System.out.println("Resto centenas: " + restoCentenas);
            if(restoCentenas == 0){
                return palabra(restoMiles) + " mil";
            }
            return palabra(restoMiles) + " mil " + palabra(restoCentenas);
        }
         else {
            return "No Implementado";
        }
    }

    static public String ajustarUn(String palabra){
        if (palabra.endsWith("uno")) {
            String nueva = palabra.replace("uno", "un");
            return nueva;
            
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(palabra(100510));

      

    }

}
