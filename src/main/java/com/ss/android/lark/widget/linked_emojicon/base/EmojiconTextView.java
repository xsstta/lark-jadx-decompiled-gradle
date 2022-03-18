package com.ss.android.lark.widget.linked_emojicon.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;

public class EmojiconTextView extends AppCompatTextView {

    /* renamed from: a */
    private int f144335a;

    /* renamed from: b */
    private int f144336b;

    /* renamed from: c */
    private int f144337c;

    /* renamed from: e */
    private int f144338e;

    /* renamed from: f */
    private int f144339f = -1;

    /* renamed from: g */
    private boolean f144340g;

    /* renamed from: j */
    protected boolean f144341j = true;

    public int getEmojiconAlignment() {
        return this.f144336b;
    }

    public int getEmojiconSize() {
        return this.f144335a;
    }

    public int getEmojiconTextSize() {
        return this.f144337c;
    }

    public void setEmojiText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setTranslateEmojiCode(boolean z) {
        this.f144341j = z;
    }

    public void setUseSystemDefault(boolean z) {
        this.f144340g = z;
    }

    public EmojiconTextView(Context context) {
        super(context);
        m226957a(null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEmojiconSize(int i) {
        this.f144335a = i;
        super.setText(getText());
    }

    public void setEmojiconTextSize(int i) {
        this.f144337c = i;
        super.setText(getText());
    }

    /* renamed from: a */
    private void m226957a(AttributeSet attributeSet) {
        this.f144337c = (int) getTextSize();
        if (attributeSet == null) {
            this.f144335a = (int) getTextSize();
            this.f144336b = 1;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconAlignment, R.attr.emojiconSize, R.attr.emojiconTextLength, R.attr.emojiconTextStart, R.attr.emojiconUseSystemDefault});
            this.f144335a = (int) obtainStyledAttributes.getDimension(1, getTextSize());
            this.f144336b = obtainStyledAttributes.getInt(0, 1);
            this.f144338e = obtainStyledAttributes.getInteger(3, 0);
            this.f144339f = obtainStyledAttributes.getInteger(2, -1);
            this.f144340g = obtainStyledAttributes.getBoolean(4, false);
            obtainStyledAttributes.recycle();
        }
        setText(getText());
    }

    public EmojiconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226957a(attributeSet);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence) && this.f144341j) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            EmojiHandler.m226948a(getContext(), spannableStringBuilder, this.f144335a, this.f144336b, this.f144337c, this.f144338e, this.f144339f);
            charSequence = spannableStringBuilder;
        }
        super.setText(charSequence, bufferType);
    }

    public EmojiconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226957a(attributeSet);
    }
}
