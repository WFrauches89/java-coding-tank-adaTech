public enum EnumMeses {

    Janeiro,
    Fevereiro,
    Marco,
    Abril,
    Maio,
    Junho,
    Julho,
    Agosto,
    Setembro,
    Outubro,
    Novembro,
    Dezembro;

    public static void todosMeses(){
        EnumMeses[] todosMesesAno = EnumMeses.values();

        for(int i = 0; i < todosMesesAno.length; i++){
            EnumMeses enumMeses = todosMesesAno[i];
            if(!EnumMeses.Janeiro.equals(enumMeses) && !EnumMeses.Fevereiro.equals(enumMeses)){
                System.out.printf("Ordinal %s - Nominal %s\n", i+1, enumMeses);
            }
//            if(EnumMeses.Janeiro.equals(enumMeses) || EnumMeses.Fevereiro.equals(enumMeses)){
//                System.out.printf("Ordinal %s - Nominal %s\n", i+1, enumMeses);
//            }
        }
        System.out.println("***");
        for(EnumMeses d: todosMesesAno){
            System.out.printf("Ordinal %d - Nominal %s\n", d.ordinal()+1,d.name());
        }

    }


}
