package com.ss.android.lark.mm.module.minifloatwindow.control;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/control/MiniControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;)V", "getBaseInfo", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "setBaseInfo", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.d */
public final class MiniControl extends MmBaseControl {

    /* renamed from: a */
    private MmBaseInfo f117055a;

    /* renamed from: a */
    public final MmBaseInfo mo163382a() {
        return this.f117055a;
    }

    /* renamed from: a */
    public final void mo163383a(MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "<set-?>");
        this.f117055a = mmBaseInfo;
    }

    public MiniControl(MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        this.f117055a = mmBaseInfo;
    }
}
