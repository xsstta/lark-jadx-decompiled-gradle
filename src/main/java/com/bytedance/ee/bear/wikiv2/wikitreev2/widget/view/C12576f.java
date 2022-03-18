package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiAction;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.f */
public final /* synthetic */ class C12576f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f33686a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f33687b;

    static {
        int[] iArr = new int[WikiAction.values().length];
        f33686a = iArr;
        iArr[WikiAction.ADD.ordinal()] = 1;
        iArr[WikiAction.INIT_LOAD.ordinal()] = 2;
        iArr[WikiAction.MOV.ordinal()] = 3;
        iArr[WikiAction.PUSH_UDE_NAME.ordinal()] = 4;
        int[] iArr2 = new int[WikiAction.values().length];
        f33687b = iArr2;
        iArr2[WikiAction.INIT_LOAD.ordinal()] = 1;
        iArr2[WikiAction.ADD.ordinal()] = 2;
        iArr2[WikiAction.DEL.ordinal()] = 3;
        iArr2[WikiAction.MOV.ordinal()] = 4;
        iArr2[WikiAction.PUSH_DEL.ordinal()] = 5;
        iArr2[WikiAction.PUSH_MOV.ordinal()] = 6;
        iArr2[WikiAction.SHORTCUT.ordinal()] = 7;
    }
}
