package com.xwray.groupie.kotlinandroidextensions;

import android.view.View;
import com.p943f.p944a.C20972g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.extensions.CacheImplementation;
import kotlinx.android.extensions.ContainerOptions;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xwray/groupie/kotlinandroidextensions/GroupieViewHolder;", "Lcom/xwray/groupie/GroupieViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "groupie-kotlin-android-extensions_release"}, mo238835k = 1, mv = {1, 1, 16})
@ContainerOptions(cache = CacheImplementation.HASH_MAP)
/* renamed from: com.f.a.a.a */
public final class GroupieViewHolder extends C20972g {

    /* renamed from: a */
    private final View f51325a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupieViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        this.f51325a = view;
    }
}
