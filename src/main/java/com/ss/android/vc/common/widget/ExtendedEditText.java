package com.ss.android.vc.common.widget;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.ArrayList;

public class ExtendedEditText extends EditText {

    /* renamed from: a */
    private ArrayList<TextWatcher> f152018a;

    public ExtendedEditText(Context context) {
        super(context);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f152018a == null) {
            this.f152018a = new ArrayList<>();
        }
        this.f152018a.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        int indexOf;
        ArrayList<TextWatcher> arrayList = this.f152018a;
        if (arrayList != null && (indexOf = arrayList.indexOf(textWatcher)) >= 0) {
            this.f152018a.remove(indexOf);
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
