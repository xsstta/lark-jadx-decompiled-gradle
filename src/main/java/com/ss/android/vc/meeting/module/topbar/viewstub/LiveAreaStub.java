package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0006\u0010\u0010\u001a\u00020\u000eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/LiveAreaStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "audienceNumber", "Landroid/widget/TextView;", "liveArea", "liveText", "getRootView", "()Landroid/view/View;", "setRootView", "getAudienceNumberView", "gone", "", "initIfNotInflated", "visible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.c */
public final class LiveAreaStub {

    /* renamed from: a */
    private View f160288a;

    /* renamed from: b */
    private TextView f160289b;

    /* renamed from: c */
    private View f160290c;

    /* renamed from: d */
    private View f160291d;

    /* renamed from: c */
    public final TextView mo219540c() {
        return this.f160289b;
    }

    /* renamed from: a */
    public final void mo219538a() {
        m248658d();
        View view = this.f160288a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo219539b() {
        View view = this.f160288a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: d */
    private final void m248658d() {
        View view;
        TextView textView;
        ViewStub viewStub;
        if (this.f160288a == null) {
            View view2 = this.f160291d;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.live_area_stub)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f160291d;
            View view4 = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.live_area);
            } else {
                view = null;
            }
            this.f160288a = view;
            View view5 = this.f160291d;
            if (view5 != null) {
                textView = (TextView) view5.findViewById(R.id.live_audience_number);
            } else {
                textView = null;
            }
            this.f160289b = textView;
            View view6 = this.f160291d;
            if (view6 != null) {
                view4 = view6.findViewById(R.id.live_text);
            }
            this.f160290c = view4;
        }
    }

    public LiveAreaStub(View view) {
        this.f160291d = view;
    }
}
