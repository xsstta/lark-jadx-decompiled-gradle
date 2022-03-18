package com.ss.android.lark.mm.net.error;

import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45851c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/net/error/MmCommonLocalErrorHandler;", "Lcom/ss/android/lark/mm/net/error/IHttpLocalErrorHandler;", "()V", "getDisplayMsg", "", "needHandler", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.net.error.b */
public final class MmCommonLocalErrorHandler implements IHttpLocalErrorHandler {
    @Override // com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler
    /* renamed from: a */
    public boolean mo165332a() {
        return true;
    }

    @Override // com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler
    /* renamed from: b */
    public String mo165333b() {
        String string = C45851c.m181646a().getString(R.string.MMWeb_G_SomethingWentWrongTryAgain_Toast);
        Intrinsics.checkExpressionValueIsNotNull(string, "MmContext.getContext().g…gWentWrongTryAgain_Toast)");
        return string;
    }
}
