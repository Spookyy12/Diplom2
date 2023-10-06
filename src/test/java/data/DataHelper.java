package data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DataHelper {

    private static final Faker faker = new Faker(new Locale("en"));

    private static String generateDate(int addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern((pattern)));
    }

    static String monthGenerate = generateDate(10, "MM");
    static String yearGenerate = generateDate(0, "yy");

    public static UserCardApproved userApprovedCard() {
        return new UserCardApproved("1111 2222 3333 4444", yearGenerate, monthGenerate,
                faker.name().fullName(), cvc);
    }

    public static UserCardDeclined userDeclinedCard() {
        return new UserCardDeclined("5555 6666 7777 8888", yearGenerate, monthGenerate,
                faker.name().fullName(), cvc);

    }


    @Value
    public static class UserCardApproved {
        private String number;
        private String year;
        private String month;
        private String holder;
        private String cvc;
    }

    @Value
    public static class UserCardDeclined {
        private String number;
        private String year;
        private String month;
        private String holder;
        private String cvc;
    }

    private static String randomCVC() {
        int randomNumber = (int) (Math.random() * 9);
        int randomNumber1 = (int) (Math.random() * 9);
        int randomNumber2 = (int) (Math.random() * 9);
        return randomNumber + "" + randomNumber1 + "" + randomNumber2;
    }

    static String cvc = randomCVC();

}
