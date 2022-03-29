public with sharing class BirdService implements IBirdService {
    @AuraEnabled
    public static List<String> createBird() {
        
        Idatabase databaseBird = new Database();
        Bird randomBird = new Bird ();
        List<String> property = new List<String>();
        
        randomBird.names = databaseBird.getNames()[Integer.valueOf(Math.random()*(3-1))];
        randomBird.photos = databaseBird.getPhotos()[Integer.valueOf(Math.random()*(3-1))];
        randomBird.colors = databaseBird.getColors()[Integer.valueOf(Math.random()*(3-1))];
        randomBird.breeds = databaseBird.getBreeds()[Integer.valueOf(Math.random()*(3-1))];
        
       	property.add(randomBird.names);
        property.add(randomBird.breeds);
        property.add(randomBird.colors);
        property.add(randomBird.photos);
        
        return property;
    }
}