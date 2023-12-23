public class Driver {
    public static void main(String[] args) {
     
        Farm farm = new Farm("farm of ten", 10);

        Animal a1 = new Animal("Cow", 2012, 1000.5, 'f');
        Animal a2 = new Animal("Pig", 2009, 550.5, 'm');
        Animal a3 = new Animal("Donkey", 1999, 773.42, 'm');
        Animal a4 = new Animal("Sheep", 2016, 164.23, 'f');
        Animal a5 = new Animal("Goose", 2004, 10.75, 'f');
        farm.addAnimal(a1);
        farm.addAnimal(a2);
        farm.addAnimal(a3);
        farm.addAnimal(a4);
        farm.addAnimal(a5);
        farm.setFarmName("farm of ten");

        farm.printAllDetails();
    }
}
