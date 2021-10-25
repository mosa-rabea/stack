package stack;


public class AnimalShelter {
    Queue<Animal> dog = new Queue<>();
    Queue<Animal> cat = new Queue<>();


    public void enqueue(Animal animal) throws Exception {
        if (animal instanceof Dog) {
            dog.enqueue(animal);
        } else if (animal instanceof Cat) {
            cat.enqueue(animal);
        }
    }

    public String dequeue(String pref) throws Exception {
        if (pref =="cat") {
            if (!this.cat.empty()) {
                this.cat.dequeue();
                return "cat";
            }
        } else if (pref =="dog") {
            if (!this.dog.empty()) {
                this.dog.dequeue();
                return "dog";
            }
        }

        return null;
    }
}
