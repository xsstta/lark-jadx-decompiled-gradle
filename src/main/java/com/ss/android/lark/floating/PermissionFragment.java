package com.ss.android.lark.floating;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.floating.interfaces.OnPermissionResult;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0006\u0010\u0018\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/floating/PermissionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callbackRegistered", "", "getCallbackRegistered", "()Z", "setCallbackRegistered", "(Z)V", "hasLifecyclePaused", "getHasLifecyclePaused", "setHasLifecyclePaused", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onPause", "onResume", "registerCallbackOnResume", "Companion", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.c */
public final class PermissionFragment extends Fragment {

    /* renamed from: a */
    public static OnPermissionResult f98478a;

    /* renamed from: b */
    public static final Companion f98479b = new Companion(null);

    /* renamed from: c */
    private boolean f98480c;

    /* renamed from: d */
    private boolean f98481d;

    /* renamed from: e */
    private HashMap f98482e;

    /* renamed from: b */
    public void mo140223b() {
        HashMap hashMap = this.f98482e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo140223b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/floating/PermissionFragment$Companion;", "", "()V", "onPermissionResult", "Lcom/ss/android/lark/floating/interfaces/OnPermissionResult;", "requestPermission", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo140224a(FragmentActivity fragmentActivity, OnPermissionResult hVar) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(hVar, "onPermissionResult");
            PermissionFragment.f98478a = hVar;
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(new PermissionFragment(), fragmentActivity.getLocalClassName()).commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f98481d = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f98481d && !this.f98480c) {
            mo140222a();
        }
    }

    /* renamed from: a */
    public final void mo140222a() {
        getLifecycle().addObserver(new PermissionFragment$registerCallbackOnResume$1(this));
        this.f98480c = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        PermissionUtils.f98492a.mo140250a(this);
        Log.m165388i("PermissionFragment：requestPermission");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 199 && !this.f98480c) {
            mo140222a();
        }
    }
}
