package com.ss.android.lark.floating.anim;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.interfaces.OnFloatAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/floating/anim/AnimatorManager;", "", "onFloatAnimator", "Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;", "view", "Landroid/view/View;", "parentView", "Landroid/view/ViewGroup;", "sidePattern", "Lcom/ss/android/lark/floating/enums/SidePattern;", "(Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;Landroid/view/View;Landroid/view/ViewGroup;Lcom/ss/android/lark/floating/enums/SidePattern;)V", "enterAnim", "Landroid/animation/Animator;", "exitAnim", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.a.a */
public final class AnimatorManager {

    /* renamed from: a */
    private final OnFloatAnimator f98422a;

    /* renamed from: b */
    private final View f98423b;

    /* renamed from: c */
    private final ViewGroup f98424c;

    /* renamed from: d */
    private final SidePattern f98425d;

    /* renamed from: a */
    public final Animator mo140157a() {
        OnFloatAnimator dVar = this.f98422a;
        if (dVar != null) {
            return dVar.mo140165a(this.f98423b, this.f98424c, this.f98425d);
        }
        return null;
    }

    /* renamed from: b */
    public final Animator mo140158b() {
        OnFloatAnimator dVar = this.f98422a;
        if (dVar != null) {
            return dVar.mo140166b(this.f98423b, this.f98424c, this.f98425d);
        }
        return null;
    }

    public AnimatorManager(OnFloatAnimator dVar, View view, ViewGroup viewGroup, SidePattern sidePattern) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
        Intrinsics.checkParameterIsNotNull(sidePattern, "sidePattern");
        this.f98422a = dVar;
        this.f98423b = view;
        this.f98424c = viewGroup;
        this.f98425d = sidePattern;
    }
}
