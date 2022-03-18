package com.ss.android.vc.meeting.module.single.stubs;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u0004\u0018\u00010\u0003J\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/stubs/CallingCancelStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "callingCancelContainer", "cancelIcon", "Landroid/widget/ImageView;", "cancelText", "Landroid/widget/TextView;", "getRootView", "()Landroid/view/View;", "setRootView", "getCallingCancelCongtainer", "getCallingCancelText", "getCancelIcon", "initIfNotInflated", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.single.a.a */
public final class CallingCancelStub {

    /* renamed from: a */
    private View f158917a;

    /* renamed from: b */
    private TextView f158918b;

    /* renamed from: c */
    private ImageView f158919c;

    /* renamed from: d */
    private View f158920d;

    /* renamed from: a */
    public final View mo217879a() {
        m246986d();
        return this.f158917a;
    }

    /* renamed from: b */
    public final TextView mo217880b() {
        m246986d();
        return this.f158918b;
    }

    /* renamed from: c */
    public final ImageView mo217881c() {
        m246986d();
        return this.f158919c;
    }

    /* renamed from: d */
    private final void m246986d() {
        View view;
        TextView textView;
        ViewStub viewStub;
        if (this.f158917a == null) {
            View view2 = this.f158920d;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.calling_bottom_btns_stub)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f158920d;
            ImageView imageView = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.calling_cancel_container);
            } else {
                view = null;
            }
            this.f158917a = view;
            View view4 = this.f158920d;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(R.id.calling_cancel_text);
            } else {
                textView = null;
            }
            this.f158918b = textView;
            View view5 = this.f158920d;
            if (view5 != null) {
                imageView = (ImageView) view5.findViewById(R.id.calling_cancel);
            }
            this.f158919c = imageView;
        }
    }

    public CallingCancelStub(View view) {
        this.f158920d = view;
    }
}
