package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.module.record.RecordingAniView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/RecordAreaStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "recordArea", "recordTag", "Lcom/ss/android/vc/meeting/module/record/RecordingAniView;", "getRootView", "()Landroid/view/View;", "setRootView", "gone", "", "initIfNotInflated", "visible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.f */
public final class RecordAreaStub {

    /* renamed from: a */
    private View f160298a;

    /* renamed from: b */
    private RecordingAniView f160299b;

    /* renamed from: c */
    private View f160300c;

    /* renamed from: a */
    public final void mo219545a() {
        m248668c();
        View view = this.f160298a;
        if (view != null) {
            view.setVisibility(0);
        }
        RecordingAniView recordingAniView = this.f160299b;
        if (recordingAniView != null) {
            recordingAniView.mo217344a();
        }
    }

    /* renamed from: b */
    public final void mo219546b() {
        View view = this.f160298a;
        if (view != null) {
            view.setVisibility(8);
        }
        RecordingAniView recordingAniView = this.f160299b;
        if (recordingAniView != null) {
            recordingAniView.mo217346b();
        }
    }

    /* renamed from: c */
    private final void m248668c() {
        View view;
        ViewStub viewStub;
        if (this.f160298a == null) {
            View view2 = this.f160300c;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.record_area_stub)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f160300c;
            RecordingAniView recordingAniView = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.record_area);
            } else {
                view = null;
            }
            this.f160298a = view;
            View view4 = this.f160300c;
            if (view4 != null) {
                recordingAniView = (RecordingAniView) view4.findViewById(R.id.record_tag);
            }
            this.f160299b = recordingAniView;
        }
    }

    public RecordAreaStub(View view) {
        this.f160300c = view;
    }
}
