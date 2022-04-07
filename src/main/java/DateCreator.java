import org.jbehave.core.steps.ParameterConverters;

import java.util.Date;

public class DateCreator {

    public static Date date(String dateString) {
        ParameterConverters.DateConverter dateConverter = new ParameterConverters.DateConverter();
        return (Date) dateConverter.convertValue(dateString, Date.class);
    }


}