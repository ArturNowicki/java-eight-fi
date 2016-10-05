package com.sda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import com.sda.messagesender.User;
import com.sda.messagesender.UserReader;

/**
 * Twoim zadaniem jest uzupelnienie zalazka klasy {@code UserReader}. Obecnie
 * znajduje sie tam tylko pole READERS o wartosci null, pusty blok statyczny
 * oraz publiczna metoda Reader. Twoim zadaniem jest uzupelnienie bloku
 * statycznego w taki sposob, by zawieral dodawal on do mapy BiFunkcje, ktore
 * pozwalaja na z - podanych argumentow - stworzyc uzytkownika ODPOWIEDNIEGO
 * rodzaju, tj. dla SMS -> SMSUser, Mail -> MailUser, a dla EMAIL -> EmailUser.
 * Uzytkownikowi nalezy nadac rowniez wartosc odpowiedniego pola.
 * 
 * Druga czescia zadnia jest napisanie testow sprawdzajacych dzialanie swojego
 * kodu - nalezy uzupelnic test {@code ReaderTest#testReading()}.
 * 
 * Czesc ekstra - zastanow sie i zaimplementuj:
 * 
 * Co sie stanie, kiedy rozny Userzy maja wiecej pol wspolnych oraz wiecej pol
 * unikalnych? 
 *  * Dodaj do klasy {@code User} dodatkowe 2 pola, wraz z potrzebnymi metodami.
 *  * Dodaj do kazdej z implementujacych klas, tj {@code SMSUser}, {@code EmailUser}
 *    oraz {@code MailUser} od 2 do 4 pol, ktore beda unikalne dla kazdej z klas
 *    (od 2 do 4 dla SMSUser, od 2 do 4 dla MailUser, itd). 
 *  * Przeksztalc klase UserReader w taki sposob, by odpowiadala nowej sytuacji
 *  * Czy znasz inne sposoby oblsugi nie normalizowanych danych? Przeczytaj cos o JSON.
 *
 */
public class ReaderTest {

    @Test
    public void testReading() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                        ReaderTest.class.getResourceAsStream("/users.csv")));
        String smsLine = br.readLine();
        String emailLine = br.readLine();
        String mailLine = br.readLine();

        User user = getUser(smsLine);
        System.out.println(user);
    }
    
    private User getUser(String rawLine) {
    	String[] elements = rawLine.split(",");
    	User.Contact preferedContact = User.Contact.valueOf(elements[0]);
    	String name = elements[1];
    	String address = elements[2];
    	
    	UserReader reader = new UserReader();
    	User user = reader.read(preferedContact, name, address);
    	return user;
    }

}
