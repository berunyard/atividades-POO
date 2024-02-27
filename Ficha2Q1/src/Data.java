public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (verificarData(dia, mes, ano) == true){
            System.out.println(dia + "/" + mes + "/" + ano);
        }
        else{
            System.out.println("01/01/0001");
        }
        System.out.println(converterData(dia, mes, ano));
        
    }
    public int converterData (int dia, int mes, int ano){
        double qtdAnos = 365.25, qtdMes = 30.42;

        int totalDias = (int) (this.dia + (this.mes * qtdMes) + (this.ano * qtdAnos));
        return totalDias;
    }
    //public int compareTo (Data d1){
    //    int r;
    //}

    private boolean verificarData(int dia, int mes, int ano) {
        if (this.ano % 4 == 0) {
            if (this.mes == 1) { // Jan
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 2) { // Fev
                if (this.dia <= 0 || this.dia > 29) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 3) { // Março
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 4) { // Abr
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 5) { // Maio
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 6) { // Jun
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 7) { // Jul
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 8) { // Aug
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 9) { // Set
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 10) { // Out
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 11) { // Nov
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 12) { // Dec
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        else if (this.ano % 4 != 0){
            if (this.mes == 1) { // Jan
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 2) { // Fev
                if (this.dia <= 0 || this.dia > 28) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 3) { // Março
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 4) { // Abr
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 5) { // Maio
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 6) { // Jun
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 7) { // Jul
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 8) { // Aug
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 9) { // Set
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 10) { // Out
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 11) { // Nov
                if (this.dia <= 0 || this.dia > 30) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.mes == 12) { // Dec
                if (this.dia <= 0 || this.dia > 31) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
