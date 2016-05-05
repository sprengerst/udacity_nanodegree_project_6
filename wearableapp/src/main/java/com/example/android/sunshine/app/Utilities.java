package com.example.android.sunshine.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.preference.PreferenceManager;

import java.util.Locale;

/**
 * Created by stefa on 05.05.2016.
 */
public class Utilities {


    public static Bitmap getArtBitmapForCondition(Context context, long weatherId){

        String computedID = getArtUrlForWeatherCondition(context,weatherId);

        int resID = context.getResources().getIdentifier(computedID , context.getString(R.string.drawablefolder), context.getPackageName());

        return BitmapFactory.decodeResource(context.getResources(), resID);
    }


    public static String getArtUrlForWeatherCondition(Context context, long weatherId) {
        String formatArtUrl = context.getString(R.string.pref_art_url);

        if (weatherId >= 200 && weatherId <= 232) {
            return String.format(Locale.US, formatArtUrl, "storm");
        } else if (weatherId >= 300 && weatherId <= 321) {
            return String.format(Locale.US, formatArtUrl, "light_rain");
        } else if (weatherId >= 500 && weatherId <= 504) {
            return String.format(Locale.US, formatArtUrl, "rain");
        } else if (weatherId == 511) {
            return String.format(Locale.US, formatArtUrl, "snow");
        } else if (weatherId >= 520 && weatherId <= 531) {
            return String.format(Locale.US, formatArtUrl, "rain");
        } else if (weatherId >= 600 && weatherId <= 622) {
            return String.format(Locale.US, formatArtUrl, "snow");
        } else if (weatherId >= 701 && weatherId <= 761) {
            return String.format(Locale.US, formatArtUrl, "fog");
        } else if (weatherId == 761 || weatherId == 781) {
            return String.format(Locale.US, formatArtUrl, "storm");
        } else if (weatherId == 800) {
            return String.format(Locale.US, formatArtUrl, "clear");
        } else if (weatherId == 801) {
            return String.format(Locale.US, formatArtUrl, "light_clouds");
        } else if (weatherId >= 802 && weatherId <= 804) {
            return String.format(Locale.US, formatArtUrl, "clouds");
        }



        return null;
    }

}
