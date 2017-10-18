package com.example.mukesh.caplibrary;
/**
 * Created by ${Mukesh} on ${Oct-2017}.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class FontCheckBox extends CheckBox {

    public FontCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontManager.getInstance().applyFont(this, attrs);
    }

    public FontCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontManager.getInstance().applyFont(this, attrs);
    }
}
