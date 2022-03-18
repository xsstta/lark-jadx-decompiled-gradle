package com.ss.android.lark.main.app.fragment;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.maincore.AbstractC44547d;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.fragment.c */
public class C44255c implements C44274f.AbstractC44277b, AbstractC44547d {
    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public Fragment mo157305a() {
        return null;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157307a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157312a(String str, String str2) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: e */
    public void mo157322e(boolean z) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: c */
    public void mo157319c() {
        Log.m165389i("DefaultMainFragmentView", "resume: ");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        Log.m165389i("DefaultMainFragmentView", "create: ");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Log.m165389i("DefaultMainFragmentView", "destroy: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public AbstractC44552i mo157316b() {
        Log.m165389i("DefaultMainFragmentView", "getCurrentShowingSpec: ");
        return null;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public void mo157317b(View view) {
        Log.m165389i("DefaultMainFragmentView", "hideInnerDingDialog: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: d */
    public void mo157321d(boolean z) {
        Log.m165389i("DefaultMainFragmentView", "displayNewUserRedDot: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157308a(View view) {
        Log.m165389i("DefaultMainFragmentView", "showInnerDingDialog: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: c */
    public void mo157320c(boolean z) {
        Log.m165389i("DefaultMainFragmentView", "displayDoNotDisturbMark: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157306a(long j) {
        Log.m165389i("DefaultMainFragmentView", "displayTenantBadge: badgeCount= " + j);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public void mo157318b(boolean z) {
        Log.m165389i("DefaultMainFragmentView", "displayUpgradeRedDot: ");
    }

    /* renamed from: a */
    public void setViewDelegate(C44274f.AbstractC44277b.AbstractC44278a aVar) {
        Log.m165389i("DefaultMainFragmentView", "setViewDelegate: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157310a(NetworkLevel networkLevel) {
        Log.m165389i("DefaultMainFragmentView", "displayNetworkErrorTip: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157313a(List<TenantInfo> list) {
        Log.m165389i("DefaultMainFragmentView", "updateTenantData: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157314a(boolean z) {
        Log.m165389i("DefaultMainFragmentView", "reload: ");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public boolean mo157315a(KeyEvent keyEvent) {
        Log.m165389i("DefaultMainFragmentView", "handleKeyEvent: ");
        return false;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157311a(String str, Bundle bundle) {
        Log.m165389i("DefaultMainFragmentView", "showTabFragment: ");
    }
}
