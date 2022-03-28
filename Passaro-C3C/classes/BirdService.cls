public with sharing class BirdService implements IBirdService {
    @AuraEnabled
    public static List<String> randomBird() {
        Idatabase databaseBird = new Database();
        Bird randomBird = new Bird();
        List<String> property = new List<String>();

        randomBird.photos = databaseBird.getPhotos()[Integer.valueOf(Math.random() * 3)];
        randomBird.names = databaseBird.getNames()[Integer.valueOf(Math.random() * 3)];
        randomBird.breeds = databaseBird.getBreeds()[Integer.valueOf(Math.random() * 3)];
        randomBird.colors = databaseBird.getColors()[Integer.valueOf(Math.random() * 3)];

        property.add(randomBird.photos);
        property.add(randomBird.names);
        property.add(randomBird.breeds);
        property.add(randomBird.colors);

        return property;
    }
}