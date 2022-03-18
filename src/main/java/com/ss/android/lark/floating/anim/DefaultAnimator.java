package com.ss.android.lark.floating.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.interfaces.OnFloatAnimator;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/floating/anim/DefaultAnimator;", "Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;", "()V", "bottomDistance", "", "floatRect", "Landroid/graphics/Rect;", "leftDistance", "minX", "minY", "parentRect", "rightDistance", "topDistance", "animTriple", "Lkotlin/Triple;", "", "", "view", "Landroid/view/View;", "sidePattern", "Lcom/ss/android/lark/floating/enums/SidePattern;", "bottomValue", "enterAnim", "Landroid/animation/Animator;", "parentView", "Landroid/view/ViewGroup;", "exitAnim", "initValue", "", "leftValue", "rightValue", "topValue", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.a.d */
public class DefaultAnimator implements OnFloatAnimator {

    /* renamed from: a */
    private int f98436a;

    /* renamed from: b */
    private int f98437b;

    /* renamed from: c */
    private int f98438c;

    /* renamed from: d */
    private int f98439d;

    /* renamed from: e */
    private int f98440e;

    /* renamed from: f */
    private int f98441f;

    /* renamed from: g */
    private Rect f98442g = new Rect();

    /* renamed from: h */
    private Rect f98443h = new Rect();

    /* renamed from: a */
    private final float m150854a(View view) {
        return ((float) (-(this.f98436a + view.getWidth()))) + view.getTranslationX();
    }

    /* renamed from: b */
    private final float m150857b(View view) {
        return ((float) (this.f98437b + view.getWidth())) + view.getTranslationX();
    }

    /* renamed from: c */
    private final float m150858c(View view) {
        return ((float) (-(this.f98438c + view.getHeight()))) + view.getTranslationY();
    }

    /* renamed from: d */
    private final float m150859d(View view) {
        return ((float) (this.f98439d + view.getHeight())) + view.getTranslationY();
    }

    /* renamed from: a */
    private final void m150856a(View view, ViewGroup viewGroup) {
        view.getGlobalVisibleRect(this.f98442g);
        viewGroup.getGlobalVisibleRect(this.f98443h);
        this.f98436a = this.f98442g.left;
        this.f98437b = this.f98443h.right - this.f98442g.right;
        this.f98438c = this.f98442g.top - this.f98443h.top;
        this.f98439d = this.f98443h.bottom - this.f98442g.bottom;
        this.f98440e = Math.min(this.f98436a, this.f98437b);
        this.f98441f = Math.min(this.f98438c, this.f98439d);
    }

    /* renamed from: a */
    private final Triple<String, Float, Float> m150855a(View view, SidePattern sidePattern) {
        float f;
        float f2;
        String str = "translationY";
        switch (C38337e.f98444a[sidePattern.ordinal()]) {
            case 1:
            case 2:
                f = m150854a(view);
                str = "translationX";
                break;
            case 3:
            case 4:
                f = m150857b(view);
                str = "translationX";
                break;
            case 5:
            case 6:
                f = m150858c(view);
                break;
            case 7:
            case 8:
                f = m150857b(view);
                break;
            case 9:
            case 10:
            case 11:
                if (this.f98436a < this.f98437b) {
                    f = m150854a(view);
                } else {
                    f = m150857b(view);
                }
                str = "translationX";
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 13:
                if (this.f98438c >= this.f98439d) {
                    f = m150859d(view);
                    break;
                } else {
                    f = m150858c(view);
                    break;
                }
            default:
                if (this.f98440e > this.f98441f) {
                    if (this.f98438c >= this.f98439d) {
                        f = m150859d(view);
                        break;
                    } else {
                        f = m150858c(view);
                        break;
                    }
                } else {
                    if (this.f98436a < this.f98437b) {
                        f = m150854a(view);
                    } else {
                        f = m150857b(view);
                    }
                    str = "translationX";
                    break;
                }
        }
        if (Intrinsics.areEqual(str, "translationX")) {
            f2 = view.getTranslationX();
        } else {
            f2 = view.getTranslationY();
        }
        return new Triple<>(str, Float.valueOf(f), Float.valueOf(f2));
    }

    @Override // com.ss.android.lark.floating.interfaces.OnFloatAnimator
    /* renamed from: b */
    public Animator mo140166b(View view, ViewGroup viewGroup, SidePattern sidePattern) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
        Intrinsics.checkParameterIsNotNull(sidePattern, "sidePattern");
        m150856a(view, viewGroup);
        Triple<String, Float, Float> a = m150855a(view, sidePattern);
        return ObjectAnimator.ofFloat(view, a.component1(), a.component3().floatValue(), a.component2().floatValue()).setDuration(500L);
    }

    @Override // com.ss.android.lark.floating.interfaces.OnFloatAnimator
    /* renamed from: a */
    public Animator mo140165a(View view, ViewGroup viewGroup, SidePattern sidePattern) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
        Intrinsics.checkParameterIsNotNull(sidePattern, "sidePattern");
        m150856a(view, viewGroup);
        Triple<String, Float, Float> a = m150855a(view, sidePattern);
        return ObjectAnimator.ofFloat(view, a.component1(), a.component2().floatValue(), a.component3().floatValue()).setDuration(500L);
    }
}
