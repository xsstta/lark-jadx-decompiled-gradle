package com.ss.android.lark.mm.module.podcast.subtitle;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/subtitle/MmRvSmoothScroller;", "Lcom/ss/android/lark/mm/module/podcast/subtitle/MmLinearSmoothScroller;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "calculateSpeedPerPixel", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "getVerticalSnapPreference", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.i */
public final class MmRvSmoothScroller extends C46789d {

    /* renamed from: f */
    private final Context f117817f;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.podcast.subtitle.C46789d
    /* renamed from: b */
    public int mo164414b() {
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRvSmoothScroller(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117817f = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.podcast.subtitle.C46789d
    /* renamed from: a */
    public float mo164408a(DisplayMetrics displayMetrics) {
        Intrinsics.checkParameterIsNotNull(displayMetrics, "displayMetrics");
        return 400.0f / ((float) displayMetrics.densityDpi);
    }
}
