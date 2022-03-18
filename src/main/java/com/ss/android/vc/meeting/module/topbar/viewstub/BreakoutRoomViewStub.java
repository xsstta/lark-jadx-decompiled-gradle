package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/BreakoutRoomViewStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "roomArea", "getRootView", "()Landroid/view/View;", "setRootView", "title", "Landroid/widget/TextView;", "gone", "", "initIfNotInflated", "visible", "text", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.a */
public final class BreakoutRoomViewStub {

    /* renamed from: a */
    private View f160281a;

    /* renamed from: b */
    private TextView f160282b;

    /* renamed from: c */
    private View f160283c;

    /* renamed from: a */
    public final void mo219532a() {
        View view = this.f160281a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    private final void m248650b() {
        View view;
        ViewStub viewStub;
        if (this.f160282b == null) {
            View view2 = this.f160283c;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.breakout_room_title)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f160283c;
            TextView textView = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.room_area);
            } else {
                view = null;
            }
            this.f160281a = view;
            View view4 = this.f160283c;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(R.id.room_title);
            }
            this.f160282b = textView;
        }
    }

    public BreakoutRoomViewStub(View view) {
        this.f160283c = view;
    }

    /* renamed from: a */
    public final void mo219533a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        m248650b();
        TextView textView = this.f160282b;
        if (textView != null) {
            textView.setText(str);
        }
        View view = this.f160281a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
