package com.ss.android.lark.widget.linked_emojicon.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.larksuite.suite.R;

public class EmojiconEditText extends AppCompatEditText {

    /* renamed from: a */
    private int f144327a;

    /* renamed from: b */
    private int f144328b;

    /* renamed from: c */
    private int f144329c;

    /* renamed from: d */
    private boolean f144330d;

    /* renamed from: a */
    private void m226953a() {
        EmojiHandler.m226947a(getContext(), getText(), this.f144327a, this.f144328b, this.f144329c);
    }

    public void setUseSystemDefault(boolean z) {
        this.f144330d = z;
    }

    public void setEmojiconSize(int i) {
        this.f144327a = i;
        m226953a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public EmojiconEditText(Context context) {
        super(context);
        this.f144327a = (int) getTextSize();
        this.f144329c = (int) getTextSize();
    }

    /* renamed from: a */
    private void m226954a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconAlignment, R.attr.emojiconSize, R.attr.emojiconTextLength, R.attr.emojiconTextStart, R.attr.emojiconUseSystemDefault});
        this.f144327a = (int) obtainStyledAttributes.getDimension(1, getTextSize());
        this.f144328b = obtainStyledAttributes.getInt(0, 1);
        this.f144330d = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        this.f144329c = (int) getTextSize();
        setText(getText());
    }

    public EmojiconEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226954a(attributeSet);
    }

    public EmojiconEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226954a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m226953a();
    }
}
