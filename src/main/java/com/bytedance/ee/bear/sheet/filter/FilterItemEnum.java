package com.bytedance.ee.bear.sheet.filter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterItemEnum;", "", "fragment", "Ljava/lang/Class;", "(Ljava/lang/String;ILjava/lang/Class;)V", "getFragment", "()Ljava/lang/Class;", "setFragment", "(Ljava/lang/Class;)V", "filterValue", "filterColor", "filterCondition", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum FilterItemEnum {
    filterValue(SubFilterValueFragment.class),
    filterColor(SubFilterColorFragment.class),
    filterCondition(SubFilterConditionFragment.class);
    
    private Class<?> fragment;

    public final Class<?> getFragment() {
        return this.fragment;
    }

    public final void setFragment(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "<set-?>");
        this.fragment = cls;
    }

    private FilterItemEnum(Class cls) {
        this.fragment = cls;
    }
}
