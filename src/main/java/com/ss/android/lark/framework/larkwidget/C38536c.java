package com.ss.android.lark.framework.larkwidget;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.framework.larkwidget.c */
public final /* synthetic */ class C38536c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f99058a;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        f99058a = iArr;
        iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
        iArr[Lifecycle.State.DESTROYED.ordinal()] = 2;
        iArr[Lifecycle.State.CREATED.ordinal()] = 3;
        iArr[Lifecycle.State.STARTED.ordinal()] = 4;
        iArr[Lifecycle.State.RESUMED.ordinal()] = 5;
    }
}
