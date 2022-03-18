package com.ss.android.lark.setting.service.impl;

import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.impl.f */
public final class C54632f implements SdkSender.IParser {

    /* renamed from: a */
    private final /* synthetic */ Function1 f134970a;

    C54632f(Function1 function1) {
        this.f134970a = function1;
    }

    @Override // com.ss.android.lark.sdk.SdkSender.IParser
    public final /* synthetic */ Object parse(byte[] bArr) {
        return this.f134970a.invoke(bArr);
    }
}
