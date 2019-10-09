package model

public class User {
    public val name: String
    public val age: String
    public val gender: String

    constructor(name: String, age: String, gender: String) {
        this.name = name
        this.age = age
        this.gender = gender
    }
}