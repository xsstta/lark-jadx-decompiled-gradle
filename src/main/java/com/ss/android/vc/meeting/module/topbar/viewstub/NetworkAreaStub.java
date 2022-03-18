package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\r\u001a\u00020\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/NetworkAreaStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "networkArea", "networkIcon", "getRootView", "()Landroid/view/View;", "setRootView", "gone", "", "initIfNotInflated", "visible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.e */
public final class NetworkAreaStub {

    /* renamed from: a */
    private View f160295a;

    /* renamed from: b */
    private View f160296b;

    /* renamed from: c */
    private View f160297c;

    /* renamed from: a */
    public final void mo219543a() {
        m248665c();
        View view = this.f160295a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo219544b() {
        View view = this.f160295a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: c */
    private final void m248665c() {
        View view;
        ViewStub viewStub;
        if (this.f160295a == null) {
            View view2 = this.f160297c;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.network_area_stub)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f160297c;
            View view4 = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.network_area);
            } else {
                view = null;
            }
            this.f160295a = view;
            View view5 = this.f160297c;
            if (view5 != null) {
                view4 = view5.findViewById(R.id.network_icon);
            }
            this.f160296b = view4;
        }
    }

    public NetworkAreaStub(View view) {
        this.f160297c = view;
    }
}
