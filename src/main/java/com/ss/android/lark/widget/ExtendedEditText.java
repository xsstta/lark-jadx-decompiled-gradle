package com.ss.android.lark.widget;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.ArrayList;

public class ExtendedEditText extends EditText {

    /* renamed from: a */
    private ArrayList<TextWatcher> f143388a;

    public ExtendedEditText(Context context) {
        super(context);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f143388a == null) {
            this.f143388a = new ArrayList<>();
        }
        this.f143388a.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        int indexOf;
        ArrayList<TextWatcher> arrayList = this.f143388a;
        if (arrayList != null && (indexOf = arrayList.indexOf(textWatcher)) >= 0) {
            this.f143388a.remove(indexOf);
        }
        super.removeTextChangedListener(textWatcher);
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
