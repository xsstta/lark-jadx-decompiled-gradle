package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/TimeLimitViewStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "getRootView", "()Landroid/view/View;", "setRootView", "timeLimitArea", "timeLimitTv", "Landroid/widget/TextView;", "gone", "", "initIfNotInflated", "planTime", "", "visible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.g */
public final class TimeLimitViewStub {

    /* renamed from: a */
    private View f160301a;

    /* renamed from: b */
    private TextView f160302b;

    /* renamed from: c */
    private View f160303c;

    /* renamed from: a */
    public final void mo219547a() {
        View view = this.f160301a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public TimeLimitViewStub(View view) {
        this.f160303c = view;
    }

    /* renamed from: a */
    public final void mo219548a(int i) {
        m248671b(i);
        View view = this.f160301a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    private final void m248671b(int i) {
        View view;
        ViewStub viewStub;
        if (this.f160301a == null) {
            View view2 = this.f160303c;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.time_limit_view_stub)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f160303c;
            TextView textView = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.time_limit_area);
            } else {
                view = null;
            }
            this.f160301a = view;
            View view4 = this.f160303c;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(R.id.time_limit_tv);
            }
            this.f160302b = textView;
            if (textView != null) {
                textView.setText("(" + UIHelper.mustacheFormat((int) R.string.View_G_NumberMinutes, "number", String.valueOf(i)) + ")");
            }
        }
    }
}
