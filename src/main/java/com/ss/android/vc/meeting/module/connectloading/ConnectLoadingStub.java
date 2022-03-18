package com.ss.android.vc.meeting.module.connectloading;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.LoadingLottieView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0011\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/connectloading/ConnectLoadingStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "connectLoadingContainer", "exitMeetingBtn", "Landroid/widget/TextView;", "loadingLottieView", "Lcom/ss/android/vc/common/widget/LoadingLottieView;", "getRootView", "()Landroid/view/View;", "setRootView", "getExitMeetingBtn", "gone", "", "initIfNotInflated", "visible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.c.c */
public final class ConnectLoadingStub {

    /* renamed from: a */
    private View f154393a;

    /* renamed from: b */
    private LoadingLottieView f154394b;

    /* renamed from: c */
    private TextView f154395c;

    /* renamed from: d */
    private View f154396d;

    /* renamed from: c */
    public final TextView mo213276c() {
        return this.f154395c;
    }

    /* renamed from: a */
    public final void mo213274a() {
        m240233d();
        LoadingLottieView loadingLottieView = this.f154394b;
        if (loadingLottieView != null) {
            loadingLottieView.setVisibility(0);
        }
        View view = this.f154393a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo213275b() {
        LoadingLottieView loadingLottieView = this.f154394b;
        if (loadingLottieView != null) {
            loadingLottieView.setVisibility(8);
        }
        View view = this.f154393a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: d */
    private final void m240233d() {
        View view;
        LoadingLottieView loadingLottieView;
        ViewStub viewStub;
        if (this.f154393a == null) {
            View view2 = this.f154396d;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.stub_loading_mask)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f154396d;
            TextView textView = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.loadingMask);
            } else {
                view = null;
            }
            this.f154393a = view;
            View view4 = this.f154396d;
            if (view4 != null) {
                loadingLottieView = (LoadingLottieView) view4.findViewById(R.id.loadingView);
            } else {
                loadingLottieView = null;
            }
            this.f154394b = loadingLottieView;
            View view5 = this.f154396d;
            if (view5 != null) {
                textView = (TextView) view5.findViewById(R.id.loading_exit_btn);
            }
            this.f154395c = textView;
        }
    }

    public ConnectLoadingStub(View view) {
        this.f154396d = view;
    }
}
