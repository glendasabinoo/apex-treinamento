public with sharing class RandomBird implements IRandomBird {
    @AuraEnabled
    public static List<String> randomBird() {
        Idatabase databaseBird = new Database();
        Double randomNumber;
        Integer listLength = databaseBird.getNames().size(); 
        Integer randomIndex = (randomNumber * (listLength - 1)).intValue();
        Bird randomBird = new Bird();
        List<String> dados = new List<String>();

        randomBird.photos = databaseBird.getPhotos().get(randomIndex);
        randomBird.names = databaseBird.getNames().get(randomIndex);
        randomBird.breeds = databaseBird.getBreeds().get(randomIndex);
        randomBird.colors = databaseBird.getColors().get(randomIndex);

        dados.add(randomBird.photos);
        dados.add(randomBird.names);
        dados.add(randomBird.breeds);
        dados.add(randomBird.colors);

        return dados;
    }
}