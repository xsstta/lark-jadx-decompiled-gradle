package com.ss.android.vc.meeting.module.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63278a;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63286c;
import com.ss.android.vc.meeting.module.tab.p3168a.C63219b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/VideoChatMainTabFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "curTabPageName", "", "tabHistoryPresenter", "Lcom/ss/android/vc/meeting/module/tab/history/mvp/VCTabHistoryPresenter;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "getTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "onAccountChanged", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStop", "setCurrentTabPageName", "pageName", "setTitleController", "controller", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab.a */
public final class VideoChatMainTabFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f159391a = new Companion(null);

    /* renamed from: b */
    private ITitleController f159392b;

    /* renamed from: c */
    private C63286c f159393c;

    /* renamed from: d */
    private String f159394d;

    /* renamed from: e */
    private HashMap f159395e;

    /* renamed from: a */
    public void mo218802a() {
        HashMap hashMap = this.f159395e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/VideoChatMainTabFragment$Companion;", "", "()V", "TAG1", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C63286c cVar = this.f159393c;
        if (cVar != null) {
            cVar.destroy();
        }
        C60700b.m235851b("VideoChatTab_VideoChatMainTabFragment@", "[onDestroyView]", "onDestroyView");
        mo218802a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C60700b.m235851b("VideoChatTab_VideoChatMainTabFragment@", "[onStop]", "onStop");
        if (Intrinsics.areEqual(this.f159394d, "videochat") && !VCAppLifeCycle.m236255b()) {
            C63219b.m247574a().mo218814e();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C63286c cVar;
        C63278a.AbstractC63281b c;
        C63278a.AbstractC63281b c2;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        C60700b.m235851b("VideoChatTab_VideoChatMainTabFragment@", "[onCreateView]", "onCreateView");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            cVar = new C63286c(activity, layoutInflater, viewGroup);
        } else {
            cVar = null;
        }
        this.f159393c = cVar;
        if (!(cVar == null || (c2 = cVar.mo219020c()) == null)) {
            c2.mo219005a(this.f159392b);
        }
        C63286c cVar2 = this.f159393c;
        if (cVar2 != null) {
            cVar2.create();
        }
        C63286c cVar3 = this.f159393c;
        if (cVar3 == null || (c = cVar3.mo219020c()) == null) {
            return null;
        }
        return c.mo219011c();
    }
}
