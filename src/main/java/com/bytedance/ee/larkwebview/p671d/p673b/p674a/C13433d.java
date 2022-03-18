package com.bytedance.ee.larkwebview.p671d.p673b.p674a;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.larkwebview.p671d.p673b.p674a.AbstractC13430c;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.d.b.a.d */
public class C13433d extends Fragment implements AbstractC13430c {

    /* renamed from: a */
    private C13434e f35407a = new C13434e();

    /* renamed from: b */
    private C13428a f35408b = new C13428a();

    /* renamed from: c */
    private AbstractC13430c.AbstractC13431a f35409c;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f35407a.mo49832a();
        this.f35408b.mo49825a();
    }

    @Override // com.bytedance.ee.larkwebview.p671d.p673b.p674a.AbstractC13430c
    /* renamed from: a */
    public Fragment mo49829a(AbstractC13430c.AbstractC13431a aVar) {
        this.f35409c = aVar;
        return this;
    }

    /* renamed from: a */
    public static C13433d m54592a(FragmentActivity fragmentActivity) {
        return m54593a(fragmentActivity.getSupportFragmentManager());
    }

    /* renamed from: c */
    private static C13433d m54595c(FragmentManager fragmentManager) {
        C13433d dVar = new C13433d();
        fragmentManager.beginTransaction().add(dVar, "LarkWebView.PermissionHostFragment").commitNowAllowingStateLoss();
        return dVar;
    }

    /* renamed from: a */
    private static C13433d m54593a(FragmentManager fragmentManager) {
        try {
            C13433d b = m54594b(fragmentManager);
            if (b == null) {
                return m54595c(fragmentManager);
            }
            return b;
        } catch (IllegalStateException e) {
            Log.m165383e("LarkWebView.PermissionHostFragment", "create PermissionHostFragment occur exception " + e.getLocalizedMessage());
            return m54595c(fragmentManager);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static C13433d m54594b(FragmentManager fragmentManager) {
        if (!fragmentManager.isDestroyed()) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("LarkWebView.PermissionHostFragment");
            if (findFragmentByTag == null || (findFragmentByTag instanceof C13433d)) {
                return (C13433d) findFragmentByTag;
            }
            throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
        }
        throw new IllegalStateException("Can't access ViewModels from onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivityForResult(Intent intent, int i) {
        if (!isAdded()) {
            Log.m165389i("LarkWebView.PermissionHostFragment", "fragment not attached to Activity");
            return;
        }
        this.f35408b.mo49828a(this.f35409c, i);
        super.startActivityForResult(intent, i);
    }

    @Override // com.bytedance.ee.larkwebview.p671d.p673b.p674a.AbstractC13430c
    /* renamed from: a */
    public void mo49830a(Intent intent, int i, AbstractC13430c.AbstractC13431a aVar) {
        this.f35408b.mo49827a(this, intent, i, aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f35408b.mo49826a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f35407a.mo49833a(i, strArr, iArr);
    }
}
