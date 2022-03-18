package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/SpaceTab;", "", "spaceType", "", "titleRes", "view", "Landroidx/fragment/app/Fragment;", "(IILandroidx/fragment/app/Fragment;)V", "getSpaceType", "()I", "getTitleRes", "getView", "()Landroidx/fragment/app/Fragment;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.b */
public final class SpaceTab {

    /* renamed from: a */
    private final int f33084a;

    /* renamed from: b */
    private final int f33085b;

    /* renamed from: c */
    private final Fragment f33086c;

    /* renamed from: a */
    public final int mo46984a() {
        return this.f33085b;
    }

    /* renamed from: b */
    public final Fragment mo46985b() {
        return this.f33086c;
    }

    public SpaceTab(int i, int i2, Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "view");
        this.f33084a = i;
        this.f33085b = i2;
        this.f33086c = fragment;
    }
}
