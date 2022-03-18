package com.ss.android.vc.meeting.module.reaction.widget.keyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.C58503b;

public class EmojiconAutoCompleteEditText extends AppCompatAutoCompleteTextView {

    /* renamed from: a */
    private int f158379a;

    /* renamed from: b */
    private int f158380b;

    /* renamed from: c */
    private int f158381c;

    /* renamed from: d */
    private boolean f158382d;

    /* renamed from: a */
    private void mo217283a() {
        C58503b.m226966a(getContext(), getText(), this.f158379a, this.f158380b, this.f158381c, this.f158382d);
    }

    public void setUseSystemDefault(boolean z) {
        this.f158382d = z;
    }

    public void setEmojiconSize(int i) {
        this.f158379a = i;
        mo217283a();
    }

    public EmojiconAutoCompleteEditText(Context context) {
        super(context);
        this.f158380b = 1;
        this.f158379a = (int) UIHelper.sp2px(16.0f);
        this.f158381c = (int) UIHelper.sp2px(16.0f);
    }

    /* renamed from: a */
    private void m246128a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconAlignment, R.attr.emojiconSize, R.attr.emojiconTextLength, R.attr.emojiconTextStart, R.attr.emojiconUseSystemDefault});
        this.f158379a = (int) obtainStyledAttributes.getDimension(1, getTextSize());
        this.f158380b = obtainStyledAttributes.getInt(0, 1);
        this.f158382d = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        this.f158381c = (int) getTextSize();
        setText(getText());
    }

    public EmojiconAutoCompleteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m246128a(attributeSet);
    }

    public EmojiconAutoCompleteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m246128a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mo217283a();
    }
}
