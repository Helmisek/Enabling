package cz.josefkorbel.enable.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import cz.josefkorbel.enable.activity.MainActivity;

/**
 * Created by Jsf on 24. 8. 2016.
 */

public class MontRegTextView extends TextView {

    Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"fonts/Montserrat-Regular.ttf");

    public MontRegTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(tf);
    }

    public MontRegTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setTypeface(tf);
    }

    public MontRegTextView(Context context) {
        super(context);
        this.setTypeface(tf);
    }

}
