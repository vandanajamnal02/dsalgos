// The actual code for creating an Array to hold DVD's.
// A simple definition for a DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        System.out.println(this.name + ", directed by " + this.director + ", released in " + this.releaseYear);
        return(
                this.name + ", directed by " + this.director + ", released in " + this.releaseYear);
    }

    public static void main(String args[]){
        DVD[] dvdCollection = new DVD[15];
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD avengersDVD1 = new DVD("The Avengers 2", 2014, "Joss Whedon");
        dvdCollection[7] = avengersDVD;
        dvdCollection[8] = avengersDVD1;
        System.out.println("in object ===>"+dvdCollection[8].toString());
    }

}