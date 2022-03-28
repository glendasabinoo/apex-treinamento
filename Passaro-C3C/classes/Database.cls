public with sharing class Database implements Idatabase {
    public static List<String> getNames() {
        return new List<String>{'Horácio', 'Creuza', 'Jubiscleudo'};
    }
    @AuraEnabled
    public static List<String> getColors() {
        return new List<String> {'Amarelo', 'Cinza', 'Verde'};
    }
    @AuraEnabled
    public static List<Integer> getAges() {
        return new List<Integer> {10, 2, 5};
    }
    @AuraEnabled
    public static List<String> getBreeds() {
        return new List<String> {'Calopsita', 'Canário', 'Papagaio'};
    }
    @AuraEnabled
    public static List<String> getPhotos() {
        return new List<String> {'https://blog.cobasi.com.br/wp-content/uploads/2020/11/canario-da-terra-principal.png', 
            'https://www.agrosete.com.br/wp-content/uploads/2020/01/como-tratar-de-uma-calopsita-1.jpg',
            'https://cdn.jornaldebrasilia.com.br/wp-content/uploads/2021/03/09165626/papagaioCapa.jpg'};
    }
}