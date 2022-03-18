package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\r\u001a\u00020\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/LockViewStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "lockArea", "lockIcon", "getRootView", "()Landroid/view/View;", "setRootView", "gone", "", "initIfNotInflated", "visible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.d */
public final class LockViewStub {

    /* renamed from: a */
    private View f160292a;

    /* renamed from: b */
    private View f160293b;

    /* renamed from: c */
    private View f160294c;

    /* renamed from: a */
    public final void mo219541a() {
        m248662c();
        View view = this.f160292a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo219542b() {
        View view = this.f160292a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: c */
    private final void m248662c() {
        View view;
        ViewStub viewStub;
        if (this.f160292a == null) {
            View view2 = this.f160294c;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.lock_view_stub)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f160294c;
            View view4 = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.lock_area);
            } else {
                view = null;
            }
            this.f160292a = view;
            View view5 = this.f160294c;
            if (view5 != null) {
                view4 = view5.findViewById(R.id.lock_icon);
            }
            this.f160293b = view4;
        }
    }

    public LockViewStub(View view) {
        this.f160294c = view;
    }
}
