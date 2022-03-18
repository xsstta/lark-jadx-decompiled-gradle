package com.ss.android.lark.mine.common;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.mine.common.a */
public class C45422a implements TextWatcher {

    /* renamed from: a */
    private int f114992a;

    /* renamed from: b */
    private EditText f114993b;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C45422a(int i, EditText editText) {
        this.f114992a = i;
        this.f114993b = editText;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f114993b;
        if (editText == null || this.f114992a <= 0) {
            C53241h.m205894a("MineNameTextWatcher", "onTextChanged: EditText is null or AsciiMaxLength <=0 ");
            return;
        }
        Editable text = editText.getText();
        String obj = text.toString();
        int selectionEnd = Selection.getSelectionEnd(text);
        int length = obj.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = obj.charAt(i5);
            if (MineUtils.f114995a.mo160281a(String.valueOf(charAt)) || MineUtils.f114995a.mo160280a(charAt)) {
                i4 += 2;
            } else {
                i4++;
            }
            if (i4 > this.f114992a) {
                this.f114993b.setText(obj.substring(0, i5));
                Editable text2 = this.f114993b.getText();
                if (selectionEnd > text2.length()) {
                    selectionEnd = text2.length();
                }
                Selection.setSelection(text2, selectionEnd);
                return;
            }
        }
    }
}
