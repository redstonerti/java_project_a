# java_project_a AUEB

## Documentation of the Development Process

### Day 1

- Created the necessary `java` files. One for each of the classes that are said to implement.
- Copied the given code template to the files so that we have a guide.
- From the `User` class we changed the `ArrayList` which was assigned to the attribute `reviews` to accept `Review` type objects instead of `String`s.
- Added getters to all the classes that have `protected`/`private` attributes.
- Overridden the `toString()` method in each class so it returns a string with all the attributes of the class.
- Changed the implementation of the `printDetails()` method by using `System.out.println()`, which uses the now-overridden `toString()`.
- Added comments to each part of the class.

---

### Day 2

- Duplicated `Review` constructor to optionally take `comments`.
- Made `Review` add itself to the `Movie` and `User` it takes as arguments.
- Changed `getWeightedRating()` of `VerifiedReview` so that it multiplies the rating by `1.3`.
- Changed `getAverageRating()` of `Movie` so that it clamps the rating value to `10`.

---

### Day 3

- Added a new attribute `allMovies` to the class `Movie` which stores all the movies in an array.
  - Made a getter for it and also made the constructor add each new movie object created to `allMovies`.
- Changed the `printDetails()` methods to work like they used to, without the `toString()`.
- Changed the `toString()` method for each class to display less information so it’s easier to understand what is displayed to the terminal.
- Created the static method `getHighestRatedByGenre()` in the class `Movie`, which returns a `HashMap<String, Movie>` mapping genres to their highest rated movie.
- Used the getters of the attributes instead of accessing the attributes directly in some methods.
- Changed the method `getRelatedMovies()` so now it fills the array `relatedMovies` with movies of the same genre and returns it.
- Created the method `getReviewers()` which returns an array of `User`s who have reviewed the movie that called the method.

---

### Day 4

- Overloaded the method `getHighestRatedByGenre()` so the new method also accepts an `int N` and a `float X`.
  - This overloaded method returns a `HashMap<String, Movie>` with genres as keys and the highest rated movies as values that have **at least** `N` reviews and a rating **higher** than `X`.
- Added some `Comparator<Movie>`s.
- Added searchers for the movies.

---

### Day 5

- Added a small run script
- Changed method `getHighestRatedByGenre(int N, double X)` to `getHighestRatedByGenre(int mininumReviewerAmount, double minimumRating)`
- Added method `getSpecificMovie(String title)` to get movies by their name
- Added **VerifiedUser** class and made **VerifiedReview** only accept VerifiedUsers. It contains an enum with several authentication methods, as well as a `verify` method that can be overriden by the users of the framework.
- Changed README formatting
- Added more movies