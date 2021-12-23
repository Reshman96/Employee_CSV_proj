package employee_csv_proj.controller.Database_management;

/**
 * A class to change the date to the required date format accepted by @{@link employee_csv_proj.model.Employee}.
 */
public class DateFormatter {

    /**
     * Corrects the date format.
     * @param date initial date from the MySQL database.
     * @return Gives back formatted date.
     */
    public static String correctDate(String date){
        String DD = date.substring(8);
        String MM = date.substring(5, 7);
        String YYYY = date.substring(0,4);
        String fixedDate = MM + "/" + DD + "/" + YYYY;
        return fixedDate;
    }
}
