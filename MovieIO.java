//November 5, 2013
//Kelly Schiller
//MovieIO.java

public class MovieIO {
    public static Movie getMovie(int index)	    {
        switch (index)	{
            case 1:
                return new Movie("Citizen Kane", "Suspense");
            case 2:
                return new Movie("Casablanca", "Romance");
            case 3:
                return new Movie("The Godfather", "Crime");
            case 4:
                return new Movie("Red Eye", "Suspense");
            case 5:
                return new Movie("Despicable Me", "Animated");
            case 6:
                return new Movie("Men In Black", "Science fiction");
            case 7:
                return new Movie("Meet Me in St. Louis", "Musical");
            case 8:
                return new Movie("Dumb and Dumber", "Comedy");
            case 9:
                return new Movie("Role Models", "Comedy");
            case 10:
                return new Movie("Ted", "Comedy");
            case 11:
                return new Movie("National Treasure", "Adventure");
            case 12:
                return new Movie("The Breakfast Club", "Drama");
            case 13:
                return new Movie("Cool Runnings","Comedy");
            case 14:
                return new Movie("Pineapple Express","Comedy");
            case 15:
                return new Movie("Christmas Caper","Holiday");
            case 16:
                return new Movie("Halloweentown","Family");
            case 17:
                return new Movie("Halloween","Horror");
            case 18:
                return new Movie("Taxi Driver","Suspense");
            case 19:
                return new Movie("Runaway Bride","Romantic");
            case 20:
                return new Movie("How to Lose a Guy in 10 Days","Romantic Comedy");
            case 21:
                return new Movie("Speed","Action");
            case 22:
                return new Movie("Transformers","Action");
            case 23:
                return new Movie("The Matrix","Science Fiction");
            case 24:
                return new Movie("The Proposal","Romantic Comedy");
            case 25:
                return new Movie("Friends With Benefits","Romantic Comedy");
            case 26:
                return new Movie("The Dark Knight Rises","Crime");
            case 27:
                return new Movie("Toy Story","Animated");
            case 28:
                return new Movie("Shrek","Animated");
            case 29:
                return new Movie("Willy Wonka and the Chocolate Factory","Family");
            case 30:
                return new Movie("The Sound of Music","Musical");
            case 31:
                return new Movie("Gone With the Wind","Romance");
            case 32:
                return new Movie("The Other Woman","Comedy");
            case 33:
                return new Movie("Plant of the Apes","Science Fiction");
            case 34:
                return new Movie("Monsters University","Animation");
            case 35:
                return new Movie("Rush Hour","Comedy");
            case 36:
                return new Movie("The Incredibles","Animated");
            case 37:
                return new Movie("White Christmas","Musical");
            case 38:
                return new Movie("The Internship","Comedy");
            case 39:
                return new Movie("Miss Congeniality","Action");
            case 40:
                return new Movie("The Ten Commandments","History");
            case 41:
                return new Movie("Star Wars","Science Fiction");
            case 42:
                return new Movie("Indiana Jones and the Raiders of the Lost Ark","Action Adventure");
            case 43:
                return new Movie("Furious Seven","Action");
            case 44:
                return new Movie("Schindler's List","History");
            case 45:
                return new Movie("Ben Hur","History");
            case 46:
                return new Movie("Grease","Musical");
            case 47:
                return new Movie("Mary Poppins","Musical");
            case 48:
                return new Movie("The Usual Suspects","Suspense");
            case 49:
                return new Movie("The Sixth Sense","Suspense");
            case 50:
                return new Movie("Forrest Gump","Drama");
            case 51:
                return new Movie("Titanic","Drama");
            case 52:
                return new Movie("Good Will Hunting","Drama");
            case 53:
                return new Movie("Cast Away","Drama");
            case 54:
                return new Movie("Night At the Museum","Family");
            case 55:
                return new Movie("Despicable Me 2","Family");
            case 56:
                return new Movie("The Wizard of Oz","Family");
            case 57:
                return new Movie("Hook","Family");
            case 58:
                return new Movie("The Avengers","Adventure");
            case 59:
                return new Movie("The Lord of the Rings: The Fellowship of the Ring","Adventure");
            case 60:
                return new Movie("Mad Max: Fury Road","Adventure");
            case 61:
                return new Movie("Jurassic Park","Adventure");
            case 62:
                return new Movie("Alien","Science Fiction");
            case 63:
                return new Movie("The Terminator","Science Fiction");
            case 64:
                return new Movie("Blade Runner","Science Fiction");
            case 65:
                return new Movie("Back to the Future","Science Fiction");
            case 66:
                return new Movie("Seven","Thriller");
            case 67:
                return new Movie("Psycho","Thriller");
            case 68:
                return new Movie("The Boy Next Door","Thriller");
            case 69:
                return new Movie("Enough","Thriller");
            case 70:
                return new Movie("Saw","Thriller");
            case 71:
                return new Movie("Airplane!","Comedy");
            case 72:
                return new Movie("American Pie","Comedy");
            case 73:
                return new Movie("Pitch Perfect","Comedy");
            case 74:
                return new Movie("Scary Movie","Comedy");
            case 75:
                return new Movie("Ace Venture: Pet Detective","Comedy");
            case 76:
                return new Movie("Love Actually","Romance");
            case 77:
                return new Movie("When Harry Met Sally","Romance");
            case 78:
                return new Movie("The Pacifier","Family");
            case 79:
                return new Movie("The Perfect Man","Romance");
            case 80:
                return new Movie("Mean Girls","Comedy");
            case 81:
                return new Movie("Notting Hill","Romance");
            case 82:
                return new Movie("17 Again","Romantic Comedy");
            case 83:
                return new Movie("Scream","Horro");
            case 84:
                return new Movie("Insidious","Horror");
            case 85:
                return new Movie("The Exorcist","Horror");
            case 86:
                return new Movie("Saw II","Horror");
            case 87:
                return new Movie("Scarface","Crime");
            case 88:
                return new Movie("Casino","Crime");
            case 89:
                return new Movie("The Untouchables","Crime");
            case 90:
                return new Movie("Bonnie and Clyde","Crime");
            case 91:
                return new Movie("Public Enemies","Crime");
            case 92:
                return new Movie("Blow","Crime");
            case 93:
                return new Movie("Lawrence of Arabia","Classic");
            case 94:
                return new Movie("Vertigo","Classic");
            case 95:
                return new Movie("Night of the Living Dead","Classic");
            case 96:
                return new Movie("My Fair Lady","Classic");
            case 97:
                return new Movie("Metropolis","Classic");
            case 98:
                return new Movie("Breakfast at Tiffanys","Classic");
            case 99:
                return new Movie("King Kong","Classic");
            case 100:
                return new Movie("The Adventures of Robin Hood","Classic");
            default:
                return new Movie("NO SUCH MOVIE", "");
        }	// end SWITCH
    }	// end getMovie METHOD
    
}
