package com.ss.android.lark.chatsetting.impl.group.avatar.view;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.ss.android.lark.chatsetting.impl.group.avatar.p1699a.C34568b;
import com.ss.android.lark.chatsetting.impl.group.avatar.p1703e.C34582a;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.view.b */
public class C34603b implements TextWatcher {

    /* renamed from: a */
    private int f89352a = 8;

    /* renamed from: b */
    private EditText f89353b;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C34603b(int i, EditText editText) {
        this.f89352a = i;
        this.f89353b = editText;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Editable text = this.f89353b.getText();
        C34568b a = C34582a.m134367a(8, text.toString());
        if (!TextUtils.equals(a.mo127743a(), text.toString())) {
            int selectionEnd = Selection.getSelectionEnd(text);
            this.f89353b.setText(a.mo127743a());
            Editable text2 = this.f89353b.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
        }
    }
}
