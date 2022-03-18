package com.ss.android.vc.meeting.module.multi.viewstub;

import android.view.View;
import android.view.ViewStub;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\b\u0010\f\u001a\u0004\u0018\u00010\u0003J\b\u0010\r\u001a\u0004\u0018\u00010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/viewstub/DesktopScrollBtnStubs;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "leftPageTurner", "pageTurnerLayer", "rightPageTurner", "getRootView", "()Landroid/view/View;", "setRootView", "getLeftPageTurner", "getPageTurnerLayer", "getRightPageTurner", "initIfNotInflated", "", "isInflated", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.c.b */
public final class DesktopScrollBtnStubs {

    /* renamed from: a */
    private View f157264a;

    /* renamed from: b */
    private View f157265b;

    /* renamed from: c */
    private View f157266c;

    /* renamed from: d */
    private View f157267d;

    /* renamed from: a */
    public final View mo216109a() {
        m244384c();
        return this.f157264a;
    }

    /* renamed from: b */
    public final View mo216110b() {
        m244384c();
        return this.f157265b;
    }

    /* renamed from: c */
    private final void m244384c() {
        if (this.f157264a == null || this.f157265b == null || this.f157266c == null) {
            ViewStub viewStub = (ViewStub) this.f157267d.findViewById(R.id.desktop_scroll_btns_viewstub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            this.f157264a = this.f157267d.findViewById(R.id.right_page_turner);
            this.f157265b = this.f157267d.findViewById(R.id.left_page_turner);
            this.f157266c = this.f157267d.findViewById(R.id.page_turner_layer);
        }
    }

    public DesktopScrollBtnStubs(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f157267d = view;
    }
}
