package com.ss.android.lark.moments.impl.mainview.badge;

import com.ss.android.lark.sdk.C53248k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.badge.c */
public final class C47728c implements C53248k.AbstractC53250a {

    /* renamed from: a */
    private final /* synthetic */ Function4 f120268a;

    C47728c(Function4 pVar) {
        this.f120268a = pVar;
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public final /* synthetic */ void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        Intrinsics.checkExpressionValueIsNotNull(this.f120268a.invoke(bArr, str, Boolean.valueOf(z), Boolean.valueOf(z2)), "invoke(...)");
    }
}
