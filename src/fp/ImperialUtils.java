package fp;

/*
    Basic methods library for Imperial Units conversion.
*/

/**
 * @author Manuel S. Gomez
 * @version 0.1
 */

public class ImperialUtils{

    /**
     * 
     * @param mm Millimeters
     * @return Inches in decimal format.
     */
    public static float millimetersToInches(float mm) {
        return mm / 25.4f;
    }

    public static float inchesToMillimeters(float in) {
        return in * 25.4f;
    }

    public static float fractionalInchesToDecimalInches(String fr) {
        float feet;
        String inchesStr;
        int numerator;
        int denominator;
        float inches = 0;
        
        if(!fr.contains(".") & (!fr.contains("'")) & (!fr.contains("\"")) & (!fr.contains("/")) & (!fr.contains(" ")))
            return Float.parseFloat(fr);

        if (fr.contains(".") & !fr.contains("\"")) {
            return Float.parseFloat(fr);
        }
        if (fr.contains("\'")) {
            feet = Float.parseFloat(fr.substring(0, fr.indexOf("\'")));
            
            inches += (feet * 12);
            fr = fr.substring(fr.indexOf("\'") + 1);
        }
        if (fr.contains("\"")) {
            inchesStr = fr.substring(0, fr.length()-1);
            if (inchesStr.contains(" ")) {
                inches += Float.parseFloat(inchesStr.substring(0, fr.indexOf(" ")));
                inchesStr = inchesStr.substring(inchesStr.indexOf(" ") + 1);
            }
            if (inchesStr.contains("/")) {
                    numerator = Integer.parseInt(inchesStr.substring(0, inchesStr.indexOf("/")));
                    inchesStr = inchesStr.substring(inchesStr.indexOf("/") + 1);
                    denominator = Integer.parseInt(inchesStr);
                    inches += ((float) numerator / (float) denominator);
                } else {
                    inches += Float.parseFloat(inchesStr);
                }
        }
        return inches;
    }
    
    public static float radiusCalculatorIN(float thickness){
        /*if(thickness == 1/4f)
            return 3/8f;
        else if(thickness == 5/16f)
            return 1/2f;
        else if(thickness == 3/8f)
            return 5/8f;
        else if(thickness == 7/16f)
            return 3/4f;
        else if(thickness == 1/2f)
            return 13/16f;
        else if(thickness == 9/16f)
            return 1f;
        else if(thickness == 5/8f)
            return 1+1/16f;
        else if(thickness == 3/4f)
            return 1+5/16f;
        else if(thickness == 1)
            return 1+11/16f;
        else
            return 0;
                */
        if(thickness == 1/4f)
            return 0.625f;
        else if(thickness == 5/16f)
            return 0.625f;
        else if(thickness == 3/8f)
            return 0.625f;
        else if(thickness == 7/16f)
            return 0.625f;
        else if(thickness == 1/2f)
            return 0.625f;
        else if(thickness == 9/16f)
            return 0.625f;
        else if(thickness == 5/8f)
            return 0.938f;
        else if(thickness == 3/4f)
            return 0.938f;
        else if(thickness == 7/8f)
            return 1.25f;
        else if(thickness == 1)
            return 1.25f;
        else
            return 0;
    }
    
    public static float radiusCalculatorMM(float thickness){
        if(thickness >4f & thickness <=7f)
            return 15.88f;
        else if(thickness >7f & thickness <=8f)
            return 15.88f;
        else if(thickness >8f & thickness <=10f)
            return 15.88f;
        else if(thickness >10f & thickness <=11f)
            return 15.88f;
        else if(thickness >11f & thickness <=13f)
            return 15.88f;
        else if(thickness >13f & thickness <=15f)
            return 15.88f;
        else if(thickness >15f & thickness <=16f)
            return 23.83f;
        else if(thickness > 16 &&thickness <=20f)
            return 23.83f;
        else if(thickness > 20 &&thickness <=24f)
            return 31.75f;
        else if(thickness > 24f)
            return 31.75f;
        else
            return 0;
    }
}
