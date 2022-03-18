package com.ss.android.vc.meeting.module.tab3.list.mvp;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.meeting.module.tab.p3168a.C63219b;
import com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/VideoChatMainTabFragment3;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "curTabPageName", "", "tabListPresenter", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/VCTabListPresenter;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "getTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStop", "refreshUpcomingData", "reload", "setCurrentTabPageName", "pageName", "setTitleController", "controller", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.c */
public final class VideoChatMainTabFragment3 extends BaseFragment {

    /* renamed from: a */
    private ITitleController f160010a;

    /* renamed from: b */
    private C63373a f160011b;

    /* renamed from: c */
    private String f160012c;

    /* renamed from: d */
    private HashMap f160013d;

    /* renamed from: d */
    public void mo219322d() {
        HashMap hashMap = this.f160013d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo219317a() {
        C63373a aVar = this.f160011b;
        if (aVar != null) {
            aVar.mo219298d();
        }
    }

    /* renamed from: b */
    public final void mo219320b() {
        C63373a aVar = this.f160011b;
        if (aVar != null) {
            aVar.mo219299e();
        }
    }

    /* renamed from: c */
    public final ITitleInfo mo219321c() {
        C63373a aVar = this.f160011b;
        if (aVar != null) {
            return aVar.mo219297c();
        }
        return null;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C63373a aVar = this.f160011b;
        if (aVar != null) {
            aVar.mo219300f();
        }
        mo219322d();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Intrinsics.areEqual(this.f160012c, "videochat") && !VCAppLifeCycle.m236255b()) {
            C63219b.m247574a().mo218814e();
        }
    }

    /* renamed from: a */
    public final void mo219318a(ITitleController iTitleController) {
        Intrinsics.checkParameterIsNotNull(iTitleController, "controller");
        this.f160010a = iTitleController;
    }

    /* renamed from: a */
    public final void mo219319a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pageName");
        this.f160012c = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        C63375b a;
        MeetingListView a2;
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C63373a aVar = this.f160011b;
        if (aVar != null && (a = aVar.mo219295a()) != null && (a2 = a.mo219304a()) != null) {
            a2.mo219393a();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C63373a aVar;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        if (getActivity() != null) {
            aVar = new C63373a(layoutInflater, viewGroup, this.f160010a);
        } else {
            aVar = null;
        }
        this.f160011b = aVar;
        if (aVar != null) {
            return aVar.mo219296b();
        }
        return null;
    }
}
