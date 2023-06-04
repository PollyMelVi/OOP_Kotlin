fun main() {
    var cat = Cat("кот","корм", "дом")
    var dog = Dog("собака","мясо", "будка")
    var horse = Horse("лошадь","яблоко", "стойло")
    var veterinarian =Veterinarian()
    var animals: MutableList<Animal> = mutableListOf(cat,dog,horse)
    for (i in 0..animals.size-1)
    {
        veterinarian.treatAnimal(animals[i])
    }
}
abstract class Animal {
    abstract var food:String
    abstract var location:String
    abstract fun makeNoise ()
    abstract fun eat ()
    fun sleep (animal: Animal){
        println("$animal спит")
    }
}
class Horse(val type: String, override var food: String, override var location: String) : Animal() {
    override fun makeNoise() {
        println("$type ржет")
    }
    override fun eat() {
        println("$type ест $food")
    }
}
class Dog (val type: String, override var food: String, override var location: String) : Animal(){
    override fun makeNoise() {
        println("$type гавкает")
    }
    override fun eat() {
        println("$type ест $food")
    }
}
class Cat (val type: String, override var food: String, override var location: String) : Animal(){
    override fun makeNoise() {
        println("$type мяукает")
    }
    override fun eat() {
        println("$type ест $food")
    }
}
class Veterinarian() {
    fun treatAnimal(animal: Animal) {
        println("Питается: " + animal.food + ", проживает: " + animal.location)
    }
}