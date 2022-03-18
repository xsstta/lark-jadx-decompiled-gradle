package com.ss.android.lark.edu.p1823b;

import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.b.b */
public final class C36926b implements SdkSender.IParser {

    /* renamed from: a */
    private final /* synthetic */ Function1 f94926a;

    public C36926b(Function1 function1) {
        this.f94926a = function1;
    }

    @Override // com.ss.android.lark.sdk.SdkSender.IParser
    public final /* synthetic */ Object parse(byte[] bArr) {
        return this.f94926a.invoke(bArr);
    }
}
