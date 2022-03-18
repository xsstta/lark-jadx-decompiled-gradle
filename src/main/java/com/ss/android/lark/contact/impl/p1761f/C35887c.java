package com.ss.android.lark.contact.impl.p1761f;

import androidx.fragment.app.Fragment;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.feat.mobile.C35472a;

/* renamed from: com.ss.android.lark.contact.impl.f.c */
public class C35887c implements ContactMobileApi {

    /* renamed from: com.ss.android.lark.contact.impl.f.c$a */
    private static class C35889a {

        /* renamed from: a */
        static ContactMobileApi f92821a = new C35887c();
    }

    private C35887c() {
    }

    /* renamed from: a */
    public static ContactMobileApi m140652a() {
        return C35889a.f92821a;
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi
    /* renamed from: a */
    public Fragment mo130575a(ContactMobileApi.ContactType contactType, ContactMobileApi.C35402a aVar, String str) {
        return C35472a.m138759a(contactType, aVar, str);
    }
}
