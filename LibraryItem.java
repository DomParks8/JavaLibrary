public class LibraryItem implements Reservable, Loanable {

    private int publishYear;
    private String title, genre, ageGroup;
    private boolean isAvailable, isFactual2;
    private BookCondition condition;
    public Author author = new Author();
    String firstName = author.getFirstName(), lastName = author.getLastName();
    public PublishingCompany publishingCompany = new PublishingCompany();

    // constructor
    public LibraryItem(int publishYear, String title, Author author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual2, BookCondition condition, String firstName, String lastName,
            PublishingCompany publishingCompany) {
        this.publishYear = publishYear;
        this.title = title;
        // this.author = author;
        this.genre = genre;
        this.ageGroup = ageGroup;
        this.isAvailable = isAvailable;
        this.isFactual2 = isFactual2;
        this.condition = condition;
        this.firstName = firstName;
        this.lastName = lastName;
        this.publishingCompany = publishingCompany;
    }

    // getters

    public int getPublishYear() {
        return publishYear;
    }

    public String getTitle() {
        return title;
    }

    // public String getAuthor() {
    // return author;
    // }

    public String getGenre() {
        return genre;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public boolean getFactuality() {
        return isFactual2;
    }

    public BookCondition getCondition() {
        return condition;
    }

    // setters

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // public void setAuthor(String author) {
    // this.author = Author.getFirstName();
    // }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setFactuality(boolean isFactual2) {
        this.isFactual2 = isFactual2;
    }

    public void setCondition(BookCondition condition) {
        this.condition = condition;
    }

    public LibraryItem(boolean isAvailable, boolean isFactual2) {
        if (isAvailable) {
            System.out.println("Yes, the book " + getTitle() + " is available");
        } else {
            System.out.println("Sorry, " + getTitle() + " is not available");
        }
        if (isFactual2) {
            System.out.println("Reference book or Newspaper");
        } else {
            System.out.println("General book or Magazine");
        }
    }

    public LibraryItem(int publishYear2, String title2, String author2, String genre2, String ageGroup2,
            boolean isAvailable2, boolean isFactual22, BookCondition condition2, String authorFirstName,
            String authorLastName) {
    }

    @Override // Annotation telling us and compiler that we are Overriding previously defined
              // behavior
    public String toString() {
        return this.getTitle() + " by " + author.getFirstName() + author.getLastName() + " published on "
                + this.getPublishYear() + " by " + publishingCompany.getPublishingCompany();
    }

    @Override
    public boolean isLoanable() {
        return true;
    }

    public String getLoanStatus() {
        return null;
    }

    public int getMaximumLoanDays() {
        return 10;
    }

    public boolean isReservable() {
        return true;
    }

    public int getReserveTerm() {
        return 15;
    }

    public int getMaxReservePerYear() {
        return 1000;
    }

    @Override
    public void lateFee(Charges fee) {

        switch (fee) {
            case DAILY:
                System.out.println("Late Fee: $1");
                break;
            case WEEKLY:
                System.out.println("Late Fee: $7");
                break;
            case BIWEEKLY:
                System.out.println("Late Fee: $20");
                break;
            case MONTHLY:
                System.out.println("Late Fee: $50");
            default:
                break;
        }
    }

}