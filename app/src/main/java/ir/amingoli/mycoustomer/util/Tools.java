package ir.amingoli.mycoustomer.util;

import android.content.Context;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import ir.amingoli.mycoustomer.data.AppConfig;
import ir.amingoli.mycoustomer.data.SharedPref;
import saman.zamani.persiandate.PersianDate;
import saman.zamani.persiandate.PersianDateFormat;

public class Tools {
    public static String getFormattedPrice(Double price, Context ctx) {
        SharedPref sharedPref = new SharedPref(ctx);
        NumberFormat format = NumberFormat.getInstance(AppConfig.PRICE_LOCAL_FORMAT);
        String result = format.format(price);

        if (!AppConfig.PRICE_WITH_DECIMAL) {
//            result = format.format(price.longValue());
            DecimalFormat df = new DecimalFormat("###,###,###");
            result = df.format(price.longValue());
        }

        if (AppConfig.PRICE_CURRENCY_IN_END) {
//            result = result + " " + sharedPref.getInfoData().currency;
            result = result + " تومان ";
        } else {
//            result = sharedPref.getInfoData().currency + " " + result;
            result =  " تومان " + result;
        }
        return result;
    }

    public static String getFormattedDate(Long dateTime) {
        PersianDateFormat pdformater;
        pdformater = new PersianDateFormat("l j F Y");
//        pdformater = new PersianDateFormat("l j F Y ساعت H:i");
        return pdformater.format(new PersianDate(dateTime));
    }

    public static long convertDayToMillis(int howBeforeDay){
        long toDay = System.currentTimeMillis();
        long oneDay = 86400000;
        switch (howBeforeDay){
            case 1:
                return toDay -oneDay;
            case 2:
                return toDay -oneDay*2;
            case 3:
                return toDay -oneDay*3;
            case 4:
                return toDay -oneDay*4;
            case 5:
                return toDay -oneDay*5;
            case 6:
                return toDay -oneDay*6;
            case 7:
                return toDay -oneDay*7;
            case 30:
                return toDay -oneDay*30;
            default: return toDay ;
        }
    }

    public static String convertNumberToEN(String string) {
        String[][] mChars = new String[][]{
                {"0", "۰"}, {"1", "۱"}, {"2", "۲"}, {"3", "۳"}, {"4", "۴"}, {"5", "۵"}, {"6", "۶"},
                {"7", "۷"}, {"8", "۸"}, {"9", "۹"}, {"4", "٤"}, {"5", "٥"}, {"6", "٦"}
        };
        for (String[] num : mChars) {
            string = string.replace(num[1], num[0])
                    .replace(" ","")
                    .replace("٬","")
                    .replace(",","");

        }
        return string;
    }

}
