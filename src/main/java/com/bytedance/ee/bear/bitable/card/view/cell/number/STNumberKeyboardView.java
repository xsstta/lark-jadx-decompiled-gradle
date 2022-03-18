package com.bytedance.ee.bear.bitable.card.view.cell.number;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0774a;
import com.larksuite.suite.R;

public class STNumberKeyboardView extends KeyboardView {

    /* renamed from: a */
    public Editable f13675a;

    /* renamed from: a */
    public void mo18193a() {
        this.f13675a = null;
    }

    /* renamed from: b */
    private void m19231b() {
        setOnKeyboardActionListener(new KeyboardView.OnKeyboardActionListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.number.STNumberKeyboardView.C46281 */

            public void onPress(int i) {
            }

            public void onRelease(int i) {
            }

            public void onText(CharSequence charSequence) {
            }

            public void swipeDown() {
            }

            public void swipeLeft() {
            }

            public void swipeRight() {
            }

            public void swipeUp() {
            }

            public void onKey(int i, int[] iArr) {
                if (STNumberKeyboardView.this.f13675a != null) {
                    int spanStart = STNumberKeyboardView.this.f13675a.getSpanStart(Selection.SELECTION_START);
                    if (i != -5) {
                        STNumberKeyboardView.this.f13675a.insert(spanStart, Character.toString((char) i));
                    } else if (spanStart > 0) {
                        STNumberKeyboardView.this.f13675a.delete(spanStart - 1, spanStart);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18194a(Editable editable) {
        this.f13675a = editable;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Keyboard.Key key : getKeyboard().getKeys()) {
            if (key.codes[0] == -5) {
                C0774a.m3766a(key.icon, getResources().getColor(R.color.icon_n1));
                Drawable drawable = getContext().getResources().getDrawable(R.drawable.number_keyboard_btn_side_selector);
                drawable.setState(key.getCurrentDrawableState());
                drawable.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
                drawable.draw(canvas);
                if (key.icon != null) {
                    key.icon.setBounds(key.x + ((key.width - key.icon.getIntrinsicWidth()) / 2), key.y + ((key.height - key.icon.getIntrinsicHeight()) / 2), key.x + ((key.width + key.icon.getIntrinsicWidth()) / 2), key.y + ((key.height + key.icon.getIntrinsicHeight()) / 2));
                    key.icon.draw(canvas);
                    return;
                }
                return;
            }
        }
    }

    public STNumberKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public STNumberKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19231b();
    }
}
