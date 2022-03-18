package com.ss.android.vc.meeting.module.reaction.livewidget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;

public class VCEmojiconTextView extends AppCompatTextView {

    /* renamed from: a */
    protected boolean f158045a = true;

    /* renamed from: b */
    private int f158046b;

    /* renamed from: c */
    private int f158047c;

    /* renamed from: e */
    private int f158048e;

    /* renamed from: f */
    private int f158049f;

    /* renamed from: g */
    private int f158050g = -1;

    /* renamed from: h */
    private boolean f158051h;

    /* renamed from: a */
    public boolean mo216964a() {
        return this.f158045a;
    }

    public void setTranslateEmojiCode(boolean z) {
        this.f158045a = z;
    }

    public void setUseSystemDefault(boolean z) {
        this.f158051h = z;
    }

    public void setEmojiText(CharSequence charSequence) {
        setText(C62842c.m245982a(charSequence));
    }

    public VCEmojiconTextView(Context context) {
        super(context);
        m245863a(null);
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
        this.f158046b = i;
        super.setText(getText());
    }

    public void setEmojiconTextSize(int i) {
        this.f158048e = i;
        super.setText(getText());
    }

    /* renamed from: a */
    private void m245863a(AttributeSet attributeSet) {
        this.f158048e = (int) getTextSize();
        if (attributeSet == null) {
            this.f158046b = (int) getTextSize();
            this.f158047c = 1;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconAlignment, R.attr.emojiconSize, R.attr.emojiconTextLength, R.attr.emojiconTextStart, R.attr.emojiconUseSystemDefault});
            this.f158046b = (int) obtainStyledAttributes.getDimension(1, getTextSize());
            this.f158047c = obtainStyledAttributes.getInt(0, 1);
            this.f158049f = obtainStyledAttributes.getInteger(3, 0);
            this.f158050g = obtainStyledAttributes.getInteger(2, -1);
            this.f158051h = obtainStyledAttributes.getBoolean(4, false);
            obtainStyledAttributes.recycle();
        }
        setText(getText());
    }

    public VCEmojiconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m245863a(attributeSet);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            C62842c.m245984a(getContext(), spannableStringBuilder, this.f158046b, this.f158047c, this.f158048e, this.f158049f, this.f158050g, this.f158051h);
            charSequence = spannableStringBuilder;
        }
        super.setText(charSequence, bufferType);
    }

    public VCEmojiconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m245863a(attributeSet);
    }
}
