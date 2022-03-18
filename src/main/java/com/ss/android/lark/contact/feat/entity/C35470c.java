package com.ss.android.lark.contact.feat.entity;

import com.bytedance.lark.pb.contact.v2.GetExternalContactListResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.entity.c */
public final class C35470c {

    /* renamed from: a */
    private List<C35468a> f91703a;

    /* renamed from: b */
    private boolean f91704b;

    /* renamed from: a */
    public List<C35468a> mo130881a() {
        return this.f91703a;
    }

    /* renamed from: a */
    public static C35470c m138747a(GetExternalContactListResponse getExternalContactListResponse) {
        if (getExternalContactListResponse == null) {
            return null;
        }
        C35470c cVar = new C35470c();
        ArrayList arrayList = new ArrayList();
        if (getExternalContactListResponse.contacts != null) {
            for (int i = 0; i < getExternalContactListResponse.contacts.size(); i++) {
                C35468a a = C35468a.m138741a(getExternalContactListResponse.contacts.get(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        cVar.f91703a = arrayList;
        cVar.f91704b = getExternalContactListResponse.has_more.booleanValue();
        return cVar;
    }
}
