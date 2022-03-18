package com.ss.android.lark.widget.linked_emojicon.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import com.larksuite.suite.R;

public class EmojiconMultiAutoCompleteTextView extends AppCompatMultiAutoCompleteTextView {

    /* renamed from: a */
    private int f144331a;

    /* renamed from: b */
    private int f144332b;

    /* renamed from: c */
    private int f144333c;

    /* renamed from: d */
    private boolean f144334d;

    /* renamed from: a */
    private void m226955a() {
        EmojiHandler.m226947a(getContext(), getText(), this.f144331a, this.f144332b, this.f144333c);
    }

    public void setUseSystemDefault(boolean z) {
        this.f144334d = z;
    }

    public void setEmojiconSize(int i) {
        this.f144331a = i;
        m226955a();
    }

    public EmojiconMultiAutoCompleteTextView(Context context) {
        super(context);
        this.f144331a = (int) getTextSize();
        this.f144333c = (int) getTextSize();
    }

    /* renamed from: a */
    private void m226956a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconAlignment, R.attr.emojiconSize, R.attr.emojiconTextLength, R.attr.emojiconTextStart, R.attr.emojiconUseSystemDefault});
        this.f144331a = (int) obtainStyledAttributes.getDimension(1, getTextSize());
        this.f144332b = obtainStyledAttributes.getInt(0, 1);
        this.f144334d = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        this.f144333c = (int) getTextSize();
        setText(getText());
    }

    public EmojiconMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226956a(attributeSet);
    }

    public EmojiconMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226956a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m226955a();
    }
}
