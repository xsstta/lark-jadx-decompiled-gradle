package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.widget.Scroller;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmSmoothScroller;", "Landroid/widget/Scroller;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "smoothScrollY", "", "destY", "", "view", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.d */
public final class MmSmoothScroller extends Scroller {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSmoothScroller(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
