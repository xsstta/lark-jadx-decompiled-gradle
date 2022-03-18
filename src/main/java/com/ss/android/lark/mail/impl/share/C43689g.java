package com.ss.android.lark.mail.impl.share;

import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserPayload;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.g */
public class C43689g {

    /* renamed from: a */
    EnumC43690a f110850a = EnumC43690a.Unselected;

    /* renamed from: b */
    String f110851b;

    /* renamed from: c */
    String f110852c;

    /* renamed from: d */
    String f110853d;

    /* renamed from: e */
    String f110854e;

    /* renamed from: f */
    String f110855f;

    /* renamed from: g */
    String f110856g;

    /* renamed from: h */
    CollaboratorType f110857h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.g$a */
    public enum EnumC43690a {
        Owner,
        Disable,
        Selected,
        Unselected
    }

    /* renamed from: a */
    public UserPayload mo155767a(PermissionCode permissionCode) {
        return new UserPayload(this.f110851b, permissionCode, this.f110857h);
    }

    C43689g(String str, CollaboratorType collaboratorType) {
        this.f110851b = str;
        this.f110857h = collaboratorType;
    }
}
