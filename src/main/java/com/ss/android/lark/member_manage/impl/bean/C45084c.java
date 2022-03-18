package com.ss.android.lark.member_manage.impl.bean;

import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.TagType;
import java.util.Objects;

/* renamed from: com.ss.android.lark.member_manage.impl.bean.c */
public class C45084c {

    /* renamed from: a */
    private boolean f114141a;

    /* renamed from: b */
    private boolean f114142b;

    /* renamed from: c */
    private boolean f114143c;

    /* renamed from: d */
    private boolean f114144d;

    /* renamed from: e */
    private C45085e f114145e;

    /* renamed from: f */
    private char f114146f;

    /* renamed from: e */
    public boolean mo159509e() {
        return this.f114144d;
    }

    /* renamed from: g */
    public C45085e mo159512g() {
        return this.f114145e;
    }

    /* renamed from: i */
    public char mo159514i() {
        return this.f114146f;
    }

    /* renamed from: b */
    public boolean mo159504b() {
        return this.f114141a;
    }

    /* renamed from: c */
    public boolean mo159506c() {
        return this.f114142b;
    }

    /* renamed from: d */
    public boolean mo159508d() {
        return this.f114143c;
    }

    /* renamed from: h */
    public String mo159513h() {
        return this.f114145e.mo159522a();
    }

    /* renamed from: f */
    public boolean mo159511f() {
        for (TagInfo tagInfo : this.f114145e.mo159542p()) {
            if (tagInfo.getType() == TagType.ADMIN_USER) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo159502a(char c) {
        this.f114146f = c;
    }

    /* renamed from: b */
    public void mo159503b(boolean z) {
        this.f114141a = z;
    }

    /* renamed from: c */
    public void mo159505c(boolean z) {
        this.f114142b = z;
    }

    /* renamed from: d */
    public void mo159507d(boolean z) {
        this.f114143c = z;
    }

    public C45084c(C45085e eVar) {
        this.f114145e = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C45084c cVar = (C45084c) obj;
        if (this.f114141a == cVar.f114141a && this.f114142b == cVar.f114142b && this.f114143c == cVar.f114143c && Objects.equals(this.f114145e, cVar.f114145e)) {
            return true;
        }
        return false;
    }
}
