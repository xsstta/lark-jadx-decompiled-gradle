package com.ss.android.lark.mm.module.minifloatwindow.control;

import android.content.Context;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "getContext", "Landroid/content/Context;", "getTrackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "onClickDismiss", "", "miniType", "Lcom/ss/android/lark/mm/module/minifloatwindow/floating/MiniType;", "onClickPause", "onClickResume", "subscribe", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.a */
public interface IMiniDependency extends IMmDependency {
    /* renamed from: a */
    C47084f mo163369a();

    /* renamed from: a */
    void mo163370a(MiniType miniType);

    /* renamed from: b */
    Context mo163371b();

    /* renamed from: b */
    void mo163372b(MiniType miniType);

    /* renamed from: c */
    void mo163373c();

    /* renamed from: d */
    void mo163374d();
}
