package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.j */
public class C43590j implements AbstractC43581g.AbstractC43582a {

    /* renamed from: a */
    boolean f110612a;

    /* renamed from: b */
    String f110613b;

    /* renamed from: c */
    String f110614c;

    /* renamed from: d */
    String f110615d = "0";

    /* renamed from: e */
    String f110616e = "0";

    /* renamed from: f */
    String f110617f = "0";

    /* renamed from: g */
    List<MailEntSignature> f110618g = new ArrayList();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43582a
    /* renamed from: b */
    public String mo155574b() {
        return this.f110613b;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43582a
    /* renamed from: c */
    public String mo155575c() {
        return this.f110617f;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43582a
    /* renamed from: d */
    public String mo155576d() {
        return this.f110615d;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43582a
    /* renamed from: f */
    public List<MailEntSignature> mo155578f() {
        return this.f110618g;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43582a
    /* renamed from: a */
    public boolean mo155573a() {
        return this.f110612a;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43582a
    /* renamed from: e */
    public String mo155577e() {
        if (this.f110616e.equals(this.f110617f)) {
            return null;
        }
        return this.f110617f;
    }

    /* renamed from: a */
    public void mo155593a(String str) {
        this.f110613b = str;
    }

    /* renamed from: a */
    public void mo155594a(List<MailEntSignature> list) {
        this.f110618g = list;
    }

    /* renamed from: b */
    public void mo155595b(String str) {
        this.f110615d = str;
    }

    /* renamed from: c */
    public void mo155596c(String str) {
        this.f110616e = str;
        this.f110617f = str;
    }

    public C43590j(String str) {
        this.f110614c = str;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43582a
    /* renamed from: a */
    public void mo155572a(MailEntSignature mailEntSignature) {
        if (mailEntSignature == null || TextUtils.isEmpty(mailEntSignature.mo151380a())) {
            this.f110617f = this.f110616e;
        } else {
            this.f110617f = mailEntSignature.mo151380a();
        }
    }
}
