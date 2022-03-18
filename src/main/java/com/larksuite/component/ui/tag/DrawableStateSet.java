package com.larksuite.component.ui.tag;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Init of enum EMPTY can be incorrect */
/* JADX WARN: Init of enum SELECTED can be incorrect */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/ui/tag/DrawableStateSet;", "", "stateSet", "", "(Ljava/lang/String;I[I)V", "getStateSet", "()[I", "EMPTY", "SELECTED", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum DrawableStateSet {
    EMPTY(r2),
    SELECTED(r2);
    
    private final int[] stateSet;

    public final int[] getStateSet() {
        return this.stateSet;
    }

    static {
        Intrinsics.checkExpressionValueIsNotNull(C25706i.f63004a, "ViewState.EMPTY_STATE_SET");
        Intrinsics.checkExpressionValueIsNotNull(C25706i.f63005b, "ViewState.SELECTED_STATE_SET");
    }

    private DrawableStateSet(int[] iArr) {
        this.stateSet = iArr;
    }
}
