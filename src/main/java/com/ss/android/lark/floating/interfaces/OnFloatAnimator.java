package com.ss.android.lark.floating.interfaces;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.floating.enums.SidePattern;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;", "", "enterAnim", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "parentView", "Landroid/view/ViewGroup;", "sidePattern", "Lcom/ss/android/lark/floating/enums/SidePattern;", "exitAnim", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.c.d */
public interface OnFloatAnimator {
    /* renamed from: a */
    Animator mo140165a(View view, ViewGroup viewGroup, SidePattern sidePattern);

    /* renamed from: b */
    Animator mo140166b(View view, ViewGroup viewGroup, SidePattern sidePattern);
}
