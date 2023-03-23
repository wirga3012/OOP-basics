public class Book {
    private String title;
    private int pages;
    private int releaseYear;

    public Book(){
    }

    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.releaseYear = year;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle (String title){
        this.title = title;
    }
    public int getPages(){
        return this.pages;
    }
    public void setPages (int pages){
        this.pages = pages;
    }
    public int getYear(){
        return this.releaseYear;
    }
    public void setYear (int year){
        this.releaseYear = year;}

    @Override
    public String toString(){
        return ("Knygos pavadinimas - " + title + "," + " Puslapių skaičius - " + pages + "," + " Išleidimo metai - " + releaseYear);
    }



}
