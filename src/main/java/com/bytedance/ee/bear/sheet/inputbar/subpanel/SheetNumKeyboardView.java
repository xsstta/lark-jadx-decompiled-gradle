package com.bytedance.ee.bear.sheet.inputbar.subpanel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.graphics.drawable.C0774a;
import com.larksuite.suite.R;
import java.util.Locale;

public class SheetNumKeyboardView extends KeyboardView {

    /* renamed from: a */
    private Context f30220a;

    /* renamed from: b */
    private Keyboard f30221b;

    /* renamed from: c */
    private boolean f30222c;

    /* renamed from: a */
    public String mo43065a(int i) {
        return i == 1002 ? "%" : i == 1003 ? "/" : i == 1005 ? "00" : i == 1008 ? "." : "";
    }

    public String getCurrencySymbol() {
        String language = getContext().getResources().getConfiguration().locale.getLanguage();
        if (language.equals(Locale.CHINESE.getLanguage()) || language.equals(Locale.JAPANESE.getLanguage())) {
            return "¥";
        }
        return "$";
    }

    public void setGray(boolean z) {
        this.f30222c = z;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Keyboard keyboard = getKeyboard();
        this.f30221b = keyboard;
        if (keyboard != null) {
            for (Keyboard.Key key : keyboard.getKeys()) {
                if (key.codes[0] == 1001 || key.codes[0] == 1002 || key.codes[0] == 1003 || key.codes[0] == 1004) {
                    m46720a(R.drawable.number_keyboard_btn_side_selector, canvas, key);
                    m46722a(canvas, key, getResources().getDimension(R.dimen.sheet_number_keyboard_text_size), Typeface.DEFAULT);
                } else if (key.codes[0] == -5 || key.codes[0] == 1006 || key.codes[0] == 1007) {
                    if (!this.f30222c || !(key.codes[0] == 1006 || key.codes[0] == 1007)) {
                        m46720a(R.drawable.number_keyboard_btn_side_selector, canvas, key);
                    } else {
                        m46720a(R.drawable.number_keyboard_btn_side_normal, canvas, key);
                    }
                    m46721a(canvas, key);
                } else {
                    m46720a(R.drawable.number_keyboard_btn_center_selector, canvas, key);
                    m46722a(canvas, key, getResources().getDimension(R.dimen.sheet_number_keyboard_text_size), Typeface.DEFAULT);
                }
            }
        }
    }

    public SheetNumKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30220a = context;
    }

    /* renamed from: a */
    private void m46721a(Canvas canvas, Keyboard.Key key) {
        if (key.codes[0] == 1006) {
            key.icon = C0215a.m655b(this.f30220a, R.drawable.ud_icon_insert_right_outlined);
        } else if (key.codes[0] == 1007) {
            key.icon = C0215a.m655b(this.f30220a, R.drawable.ud_icon_insert_down_outlined);
        }
        if (!this.f30222c || !(key.codes[0] == 1006 || key.codes[0] == 1007)) {
            C0774a.m3766a(key.icon, getResources().getColor(R.color.icon_n1));
        } else {
            C0774a.m3766a(key.icon, getResources().getColor(R.color.icon_disable));
        }
        if (key.icon != null) {
            key.icon.setBounds(key.x + ((key.width - key.icon.getIntrinsicWidth()) / 2), key.y + ((key.height - key.icon.getIntrinsicHeight()) / 2), key.x + ((key.width - key.icon.getIntrinsicWidth()) / 2) + key.icon.getIntrinsicWidth(), key.y + ((key.height - key.icon.getIntrinsicHeight()) / 2) + key.icon.getIntrinsicHeight());
            key.icon.draw(canvas);
        }
    }

    public SheetNumKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30220a = context;
    }

    /* renamed from: a */
    private void m46720a(int i, Canvas canvas, Keyboard.Key key) {
        Drawable drawable = this.f30220a.getResources().getDrawable(i);
        int[] currentDrawableState = key.getCurrentDrawableState();
        if (key.codes[0] != 0) {
            drawable.setState(currentDrawableState);
        }
        drawable.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        drawable.draw(canvas);
    }

    /* renamed from: a */
    private void m46722a(Canvas canvas, Keyboard.Key key, float f, Typeface typeface) {
        if (key.codes[0] == 1001) {
            key.label = getCurrencySymbol();
        }
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(this.f30220a.getResources().getColor(R.color.icon_n1));
        if (key.label != null) {
            paint.setTextSize(f);
            paint.setTypeface(typeface);
            Rect rect = new Rect(key.x, key.y, key.x + key.width, key.y + key.height);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.drawText(key.label.toString(), (float) rect.centerX(), (float) ((((rect.bottom + rect.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2), paint);
        }
    }
}
