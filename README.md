# java_project_a
AUEB Project

# DOCUMENTATION OF THE DEVELOPMENT PROCESS

### DAY 1
Created the necessary java files. One for each of the classes that are said to implement. Copied the given code template to the files so that we have a guide. From the "User" class we changed the array list which was assigned to the attribute "reviews" to accept "Review" type objects instead of Strings. Added getters to all the classes that have protected/private attributes. Overriden the toString method to each class so it returns a string with all the attributes of the class. Changed the implementation of the printDetails method by using System.out.println which uses the now overridden toString method. Added comments to each part of the class.

### DAY 2
Duplicated review constructor to optionally take comments
Made review add itself to the movie and user it takes as arguments
Changed `getWeightedRating()` of VerifiedReview so that it multiplies the rating by 1.3
Changed `getAverageRating()` of Movie so that it clamps the rating value to 10