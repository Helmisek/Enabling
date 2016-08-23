package cz.josefkorbel.enable.util;

import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class CustomFontAdapter {
    @BindingAdapter({"bind:font"})
    public static void setFont(TextView textView, String fontName){
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
    }
}
