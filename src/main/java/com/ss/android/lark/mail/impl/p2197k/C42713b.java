package com.ss.android.lark.mail.impl.p2197k;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.by.inflate_lib.p099a.C2600a;
import com.by.inflate_lib.p100b.C2605a;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;

/* renamed from: com.ss.android.lark.mail.impl.k.b */
public class C42713b {
    /* renamed from: a */
    public void mo153392a(UDCheckBox uDCheckBox, ViewGroup.LayoutParams layoutParams) {
    }

    /* renamed from: a */
    public boolean mo153393a(String str, C2600a aVar, UDCheckBox uDCheckBox, ViewGroup.LayoutParams layoutParams) {
        String a = C2605a.m10962a(str);
        a.hashCode();
        if (!a.equals("app:ud_checkbox_type")) {
            return false;
        }
        if (TextUtils.equals(aVar.f8294a, "check_box")) {
            uDCheckBox.setType(UDCheckBox.CheckBoxType.CHECK_BOX);
            return true;
        } else if (TextUtils.equals(aVar.f8294a, "radio")) {
            uDCheckBox.setType(UDCheckBox.CheckBoxType.RADIO);
            return true;
        } else if (!TextUtils.equals(aVar.f8294a, "check_mark")) {
            return true;
        } else {
            uDCheckBox.setType(UDCheckBox.CheckBoxType.CHECK_MARK);
            return true;
        }
    }
}
