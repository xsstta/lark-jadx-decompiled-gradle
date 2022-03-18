package com.ss.android.lark.mm.module.detail.titlebar;

import com.ss.android.lark.mm.module.framework.MmBaseControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "host", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getToken", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.titlebar.d */
public final class MmDetailTitleBarControl extends MmBaseControl {

    /* renamed from: a */
    private final String f116626a;

    /* renamed from: b */
    private final String f116627b;

    /* renamed from: a */
    public final String mo162746a() {
        return this.f116626a;
    }

    public MmDetailTitleBarControl(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        this.f116626a = str;
        this.f116627b = str2;
    }
}
