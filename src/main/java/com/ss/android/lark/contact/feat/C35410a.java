package com.ss.android.lark.contact.feat;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.contact.feat.contact_recommend.ContactRecFragment;
import com.ss.android.lark.contact.p1735d.AbstractC35387b;

/* renamed from: com.ss.android.lark.contact.feat.a */
public class C35410a implements AbstractC35387b {

    /* renamed from: com.ss.android.lark.contact.feat.a$a */
    private static class C35411a {

        /* renamed from: a */
        public static final AbstractC35387b f91497a = new C35410a();
    }

    /* renamed from: a */
    public static AbstractC35387b m138447a() {
        return C35411a.f91497a;
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35387b
    /* renamed from: a */
    public Fragment mo130265a(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        return ContactRecFragment.m138449a(str, str2, onClickListener, onClickListener2);
    }
}
