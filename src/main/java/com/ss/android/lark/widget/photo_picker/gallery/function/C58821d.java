package com.ss.android.lark.widget.photo_picker.gallery.function;

import com.ss.android.lark.widget.photo_picker.entity.PhotoState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.d */
public final /* synthetic */ class C58821d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f145374a;

    static {
        int[] iArr = new int[PhotoState.UIState.values().length];
        f145374a = iArr;
        iArr[PhotoState.UIState.HIDE_LOOK.ordinal()] = 1;
        iArr[PhotoState.UIState.SHOW_LOOK.ordinal()] = 2;
        iArr[PhotoState.UIState.LOADING.ordinal()] = 3;
        iArr[PhotoState.UIState.DONE.ordinal()] = 4;
    }
}
