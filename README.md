# java_project_a AUEB

## DOCUMENTATION OF THE DEVELOPMENT PROCESS

### DAY 1
Created the necessary java files. One for each of the classes that are said to implement. Copied the given code template to the files so that we have a guide. From the `User` class we changed the array list which was assigned to the attribute "reviews" to accept `Review` type objects instead of Strings. Added getters to all the classes that have protected/private attributes. Overriden the `toString` method to each class so it returns a string with all the attributes of the class. Changed the implementation of the `printDetails` method by using `System.out.println()` which uses the now overridden toString method. Added comments to each part of the class.

### DAY 2
Duplicated review constructor to optionally take comments
Made review add itself to the movie and user it takes as arguments
Changed `getWeightedRating()` of VerifiedReview so that it multiplies the rating by 1.3
Changed `getAverageRating()` of Movie so that it clamps the rating value to 10

### DAY 3
Added a new attribute `allMovies` to the class `Movie` which stores all the movies in an array. Made a getter for it and also made the constructor add each new movie object created to `allMovies`. Changed the `printDetails()` methods to work like they used to, without the `toString()`. Changed the `toString()` method for each class to display less things so its easier to understand what is displayed to the terminal. Created the static method `getHighestRatedByGenre()` in the class `Movie` which returns a hashmap with genres(String) as keys and the highest rated movie of the correspoding genre as value. Used the getters of the attributes instead of the attributes by themselves that we have used in some methods. Changed the method `getRelatedMovies()` so now it fills the array `relatedMovies` with movies of the same genre and returns it. Created the method `getReviewers()` which returns an array of users who have reviewed the movie that called the method.

### DAY 4
Overloaded the method `getHighestRatedByGenre()` so now the new method also accepts an int N and a float X. This method returns a hashmap with with genres as keys and the highest rated movies as values that have at least N reviews and a rating higher than X. Added some comparators for movies. Added searchers for the movies.