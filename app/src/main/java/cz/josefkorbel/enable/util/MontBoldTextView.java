package cz.josefkorbel.enable.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Jsf on 24. 8. 2016.
 */

public class MontBoldTextView extends TextView {

    Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"fonts/Montserrat-Bold.ttf");

    public MontBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(tf);
    }

    public MontBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setTypeface(tf);
    }

    public MontBoldTextView(Context context) {
        super(context);
        this.setTypeface(tf);
    }

}
