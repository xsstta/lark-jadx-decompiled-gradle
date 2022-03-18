package com.ss.android.lark.multitask;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.i */
public final /* synthetic */ class C48334i {

    /* renamed from: a */
    public static final /* synthetic */ int[] f121725a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f121726b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f121727c;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        f121725a = iArr;
        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        int[] iArr2 = new int[Lifecycle.Event.values().length];
        f121726b = iArr2;
        iArr2[Lifecycle.Event.ON_STOP.ordinal()] = 1;
        iArr2[Lifecycle.Event.ON_START.ordinal()] = 2;
        int[] iArr3 = new int[Lifecycle.Event.values().length];
        f121727c = iArr3;
        iArr3[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
    }
}
