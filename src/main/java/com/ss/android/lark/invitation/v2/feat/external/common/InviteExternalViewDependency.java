package com.ss.android.lark.invitation.v2.feat.external.common;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.inv.export.util.C40147z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0005¢\u0006\u0002\u0010\nJ\u001f\u0010\u0017\u001a\u0002H\u0018\"\b\b\u0000\u0010\u0018*\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/common/InviteExternalViewDependency;", "", "origin", "Landroid/view/View;", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "(Landroid/view/View;Lcom/ss/android/lark/base/fragment/BaseFragment;)V", "activity", "Landroid/app/Activity;", "(Landroid/view/View;Landroid/app/Activity;)V", "()V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "getFragment", "()Lcom/ss/android/lark/base/fragment/BaseFragment;", "setFragment", "(Lcom/ss/android/lark/base/fragment/BaseFragment;)V", "getOrigin", "()Landroid/view/View;", "setOrigin", "(Landroid/view/View;)V", "findViewById", "T", "id", "", "(I)Landroid/view/View;", "requestFinish", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.e */
public final class InviteExternalViewDependency {

    /* renamed from: a */
    public View f102183a;

    /* renamed from: b */
    private BaseFragment f102184b;

    /* renamed from: c */
    private Activity f102185c;

    public InviteExternalViewDependency() {
    }

    /* renamed from: a */
    public final Activity mo145900a() {
        return this.f102185c;
    }

    /* renamed from: b */
    public final void mo145902b() {
        FragmentActivity activity;
        if (C40147z.m159165e()) {
            C36512a.m144041a().mo134758a(this.f102184b);
            return;
        }
        BaseFragment baseFragment = this.f102184b;
        if (baseFragment != null && (activity = baseFragment.getActivity()) != null) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public final <T extends View> T mo145901a(int i) {
        View view = this.f102183a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("origin");
        }
        T t = (T) view.findViewById(i);
        Intrinsics.checkExpressionValueIsNotNull(t, "origin.findViewById(id)");
        return t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteExternalViewDependency(View view, Activity activity) {
        this();
        Intrinsics.checkParameterIsNotNull(view, "origin");
        this.f102183a = view;
        this.f102185c = activity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteExternalViewDependency(View view, BaseFragment baseFragment) {
        this();
        Intrinsics.checkParameterIsNotNull(view, "origin");
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        this.f102183a = view;
        this.f102184b = baseFragment;
        this.f102185c = baseFragment.getActivity();
    }
}
