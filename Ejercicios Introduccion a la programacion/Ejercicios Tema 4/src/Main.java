public class Main {
    public static void main(String[] args) {

        // condicionales if, else if y else para el numeroIf

        int numeroIf = -3;

        if (numeroIf<0){
            System.out.println("El valor de numeroIf es " + numeroIf + " y " + numeroIf + " < 0, su valor es NEGATIVO");
        }
        else if(numeroIf>0){
            System.out.println("El valor de numeroIf es " + numeroIf + " y " + numeroIf + " > 0, su valor es POSITIVO");
        } else {
            System.out.println("El valor de numeroIf es 0");
        }

        //Bucle while para la variable numeroWhile

        int numeroWhile = 1;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile pasó a valer: " + numeroWhile);
        }

        //BUCLE DO WHILE

        //Al no cumplirse la condición, solo entra en el bucle una vez
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("numeroDoWhile pasó a valer: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        //BUCLE FOR

        for(int numeroFor = 0; numeroFor <= 5; numeroFor++){
            System.out.println("numeroFor pasó a valer: " + numeroFor);
        }

        //switch case
        String estacion = "primavera";
        switch(estacion) {
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
    }



