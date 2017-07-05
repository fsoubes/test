package Rhytm;
import org.jsoup.Jsoup;

/**
* Bonjour à tous
*
*/
public class App 
{
    public static void main( String [] args )
    {
	String htmlText = "<h1>Hello World!</h1>";
        System.out.println( Jsoup.parse(htmlText).text() );
	System.out.println("this is a test");
	System.out.println("this is a test");
	
    }
}
