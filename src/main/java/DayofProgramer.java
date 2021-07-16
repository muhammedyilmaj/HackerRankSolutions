
public class DayofProgramer {
        static String dayOfProgrammer(int year) {
            StringBuilder stringBuilder = new StringBuilder();
            if (year>2000 && year%100 == 0 && year%400 != 0) {
                stringBuilder.append("13.09."+year);
            }
            else if (year%4 == 0 && year != 1918) {
                stringBuilder.append("12.09."+year);
            }
            else if (year == 1918) {
                stringBuilder.append("26.09."+year);
            }
            else {stringBuilder.append("13.09."+year);

            }
            return stringBuilder.toString();
        }
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(2016));
        System.out.println(dayOfProgrammer(2700));
        System.out.println(dayOfProgrammer(2600));
        System.out.println(dayOfProgrammer(2500));
        System.out.println(dayOfProgrammer(2400));
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(1900));
    }
}
