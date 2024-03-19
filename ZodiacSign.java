// Cooper Bartl
// CS145
// 3/17/2024

// This program asks you for your birthday and then tells you you're zodiac sign
// with a brief description of each one.

import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth month (as a number):");
        int month = scanner.nextInt();

        System.out.println("Enter your birth day:");
        int day = scanner.nextInt();

        String zodiacSign = getZodiacSign(month, day);
        String signDescription = getSignDescription(zodiacSign);

        System.out.println("Your zodiac sign is: " + zodiacSign);
        System.out.println("Description: " + signDescription);
    }// end of main()

        // this method establishes which zodiac sign matches with the selected date using arrays.
    public static String getZodiacSign(int month, int day) {
        String[] zodiacSigns = {
                "Capricorn", "Aquarius", "Pisces", "Aries",
                "Taurus", "Gemini", "Cancer", "Leo", "Virgo",
                "Libra", "Scorpio", "Sagittarius", "Capricorn"
        };

        // cutoff dates for each zodiac sign 
        int[] cutoffDay = {20, 19, 20, 20, 21, 21, 22, 23, 23, 23, 22, 21, 31};
        int index = month - 1;

        // if day is less than or equal to cutoff day for cooresponding month return zodiac[index]
        if (day <= cutoffDay[index]) {
            return zodiacSigns[index];
        } else {
            return zodiacSigns[index + 1];
        }
    }// end of getZodiacSign()

        // this method returns the description depending on zodiac sign.
    public static String getSignDescription(String zodiacSign) {
        switch (zodiacSign) {
            case "Capricorn":
                return "Capricorn (Dec 22 - Jan 19) - Practical and prudent, Ambitious and disciplined, " +
                    "Patient and careful, Humorous and reserved.";

            case "Aquarius":
                return "Aquarius (Jan 20 - Feb 18) - Friendly and humanitarian, Honest and loyal, " +
                    "Original and inventive, Independent and intellectual.";

            case "Pisces":
                return "Pisces (Feb 19 - Mar 20) - Imaginative and sensitive, Compassionate and kind," +
                    " Selfless and unworldly, Intuitive and sympathetic.";

            case "Aries":
                return "Aries (Mar 21 - Apr 19) - Adventurous and energetic, Pioneering and courageous," + 
                    " Enthusiastic and confident, Dynamic and quick-witted.";

            case "Taurus":
                return "Taurus (Apr 20 - May 20) - Patient and reliable, Warmhearted and loving, " +
                    " Persistent and determined, Placid and security loving.";

            case "Gemini":
                return "Gemini (May 21 - Jun 20) - Adaptable and versatile, Communicative and witty,"+ 
                    " Intellectual and eloquent, Youthful and lively.";

            case "Cancer":
                return "Cancer (Jun 21 - Jul 22) - Emotional and loving, Intuitive and imaginative," + 
                    " Shrewd and cautious, Protective and sympathetic.";

            case "Leo":
                return "Leo (Jul 23 - Aug 22) - Generous and warmhearted, Creative and enthusiastic," +
                    " Broad-minded and expansive, Faithful and loving.";

            case "Virgo":
                return "Virgo (Aug 23 - Sep 22) - Modest and shy, Meticulous and reliable," +
                    " Practical and diligent, Intelligent and analytical.";

            case "Libra":
                return "Libra (Sep 23 - Oct 22) - Diplomatic and urbane, Romantic and charming," +
                     " Easygoing and sociable, Idealistic and peaceable.";

            case "Scorpio":
                return "Scorpio (Oct 23 - Nov 21) - Determined and forceful, Emotional and intuitive,"+ 
                    " Powerful and passionate, Exciting and magnetic.";

            case "Sagittarius":
                return "Sagittarius (Nov 22 - Dec 21) - Optimistic and freedom-loving, Jovial and"+
                    " good-humored, Honest and straightforward, Intellectual and philosophical.";

            default:
                return "Invalid zodiac sign";
        }
    }// end of getSignDescrption()
}