fun number_of_likes (){
    val likes = 11
    val people = if (likes%10 == 1 && likes != 11) "человеку" else "людям"

    println ("Понравилось $likes $people")
}