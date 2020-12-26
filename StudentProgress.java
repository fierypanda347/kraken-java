import org.knowm.xchart.*;
import java.util.*;
import java.io.*;
public class StudentProgress 
{
    public static void gg() 
    {
        double[] xData = new double[] { 1, 5, 10 };
        double[] yData = new double[] { 90.0, 80.0, 60.0 };
        XYChart chart = QuickChart.getChart("Dylan's Progress", "Terms", "Percentage", "Change in Percentage", xData, yData);
        Map<Object, Object> customXAxisTickLabelsMap = new HashMap<>();
        customXAxisTickLabelsMap.put(1, "Grade 8, Term 1");
        customXAxisTickLabelsMap.put(5, "Grade 8, Term 2");
        customXAxisTickLabelsMap.put(10, "Grade 9, Term 1");
        chart.setCustomXAxisTickLabelsMap(customXAxisTickLabelsMap);
        new SwingWrapper(chart).displayChart();      
        try
        {
            BitmapEncoder.saveBitmap(chart, "DylanReport", BitmapEncoder.BitmapFormat.PNG);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}