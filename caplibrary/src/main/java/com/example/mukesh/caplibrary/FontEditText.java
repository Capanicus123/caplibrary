package com.example.mukesh.caplibrary;
/**
 * Created by ${Mukesh} on ${Oct-2017}.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class FontEditText extends EditText {

    public FontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontManager.getInstance().applyFont(this, attrs);
    }

    public FontEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontManager.getInstance().applyFont(this, attrs);
    }
}
