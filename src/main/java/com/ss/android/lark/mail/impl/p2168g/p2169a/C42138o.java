package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.OptionalSignature;
import com.ss.android.lark.mail.impl.entity.EntOptionalSignature;

/* renamed from: com.ss.android.lark.mail.impl.g.a.o */
public class C42138o extends C42128h<OptionalSignature, EntOptionalSignature> {
    public C42138o(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public EntOptionalSignature mo152042b(OptionalSignature optionalSignature, EntOptionalSignature entOptionalSignature) {
        if (optionalSignature == null) {
            return null;
        }
        EntOptionalSignature entOptionalSignature2 = new EntOptionalSignature();
        if (optionalSignature.signature_ids != null) {
            entOptionalSignature2.mo151161a(optionalSignature.signature_ids);
        }
        if (optionalSignature.is_force_apply != null) {
            entOptionalSignature2.mo151162a(optionalSignature.is_force_apply.booleanValue());
        }
        return entOptionalSignature2;
    }
}
