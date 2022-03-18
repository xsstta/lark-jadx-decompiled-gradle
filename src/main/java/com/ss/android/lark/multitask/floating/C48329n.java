package com.ss.android.lark.multitask.floating;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.n */
public final /* synthetic */ class C48329n {

    /* renamed from: a */
    public static final /* synthetic */ int[] f121707a;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        f121707a = iArr;
        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
    }
}
