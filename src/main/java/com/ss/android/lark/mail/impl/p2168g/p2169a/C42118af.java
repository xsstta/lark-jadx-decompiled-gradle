package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Setting;
import com.bytedance.lark.pb.email.client.v1.Signature;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.g.a.af */
public class C42118af extends C42128h<Setting, EmailSignature> {
    /* renamed from: b */
    public Setting mo152040a(Setting setting, EmailSignature emailSignature) {
        return null;
    }

    public C42118af(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public Setting.C16982a mo152051a(Setting.C16982a aVar, EmailSignature emailSignature) {
        aVar.mo59980a(new Signature(Boolean.valueOf(emailSignature.mo155470b()), emailSignature.mo155472d(), new ArrayList())).mo59994d(Boolean.valueOf(emailSignature.mo155469a())).mo59988b(new Signature(Boolean.valueOf(emailSignature.mo155471c()), emailSignature.mo155476f(), this.f107148a.f107150a.mo152107b(emailSignature.mo155474e(), this.f107148a.f107155f)));
        return aVar;
    }

    /* renamed from: a */
    public EmailSignature mo152042b(Setting setting, EmailSignature emailSignature) {
        boolean z;
        EmailSignature.C43549a aVar = new EmailSignature.C43549a();
        if (setting.signature != null) {
            aVar.mo155490b(setting.signature.enabled.booleanValue());
            aVar.mo155485a(setting.signature.text);
        }
        if (setting.pc_signature != null) {
            boolean z2 = false;
            if (setting.mobile_use_pc_signature == null) {
                z = false;
            } else {
                z = setting.mobile_use_pc_signature.booleanValue();
            }
            aVar.mo155487a(z);
            if (setting.pc_signature.enabled != null) {
                z2 = setting.pc_signature.enabled.booleanValue();
            }
            aVar.mo155491c(z2);
            aVar.mo155489b(setting.pc_signature.text);
            aVar.mo155486a(this.f107148a.f107150a.mo152106a(setting.pc_signature.images, this.f107148a.f107155f));
        }
        return aVar.mo155488a();
    }
}
