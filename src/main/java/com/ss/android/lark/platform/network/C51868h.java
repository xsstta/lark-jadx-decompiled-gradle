package com.ss.android.lark.platform.network;

import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.network.h */
public final class C51868h implements SdkSender.IParser {

    /* renamed from: a */
    private final /* synthetic */ Function1 f128881a;

    C51868h(Function1 function1) {
        this.f128881a = function1;
    }

    @Override // com.ss.android.lark.sdk.SdkSender.IParser
    public final /* synthetic */ Object parse(byte[] bArr) {
        return this.f128881a.invoke(bArr);
    }
}
