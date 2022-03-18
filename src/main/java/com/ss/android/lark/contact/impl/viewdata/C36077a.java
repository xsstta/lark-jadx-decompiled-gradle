package com.ss.android.lark.contact.impl.viewdata;

import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import java.util.Objects;

/* renamed from: com.ss.android.lark.contact.impl.viewdata.a */
public class C36077a {

    /* renamed from: a */
    public String f93243a;

    /* renamed from: b */
    public String f93244b;

    /* renamed from: c */
    public String f93245c;

    /* renamed from: d */
    public String f93246d;

    /* renamed from: e */
    public String f93247e;

    /* renamed from: f */
    public boolean f93248f;

    /* renamed from: g */
    public String f93249g;

    /* renamed from: h */
    public ChatterDescription f93250h;

    /* renamed from: i */
    public char f93251i;

    /* renamed from: j */
    public boolean f93252j;

    /* renamed from: k */
    public boolean f93253k = true;

    public int hashCode() {
        int i;
        String str = this.f93246d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + (this.f93252j ? 1 : 0)) * 31) + (this.f93253k ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36077a)) {
            return false;
        }
        C36077a aVar = (C36077a) obj;
        if (this.f93252j == aVar.f93252j && this.f93253k == aVar.f93253k) {
            return Objects.equals(this.f93246d, aVar.f93246d);
        }
        return false;
    }
}
