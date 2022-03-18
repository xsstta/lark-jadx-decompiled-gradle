package com.ss.android.vc.meeting.module.multi.viewstub;

import android.view.View;
import android.view.ViewStub;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.IconFontView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/viewstub/DesktopHostControlStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "desktopHostControlView", "Lcom/ss/android/vc/common/widget/IconFontView;", "getRootView", "()Landroid/view/View;", "setRootView", "getDesktopHostControlView", "initIfNotInflated", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.c.a */
public final class DesktopHostControlStub {

    /* renamed from: a */
    private IconFontView f157262a;

    /* renamed from: b */
    private View f157263b;

    /* renamed from: a */
    public final View mo216108a() {
        m244382b();
        return this.f157262a;
    }

    /* renamed from: b */
    private final void m244382b() {
        if (this.f157262a == null) {
            ViewStub viewStub = (ViewStub) this.f157263b.findViewById(R.id.desktop_bottom_btn_hostcontrol);
            if (viewStub != null) {
                viewStub.inflate();
            }
            this.f157262a = (IconFontView) this.f157263b.findViewById(R.id.desktop_bottom_btn_hostcontrol);
        }
    }

    public DesktopHostControlStub(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f157263b = view;
    }
}
