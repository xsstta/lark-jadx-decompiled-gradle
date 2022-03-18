package com.ss.android.vc.meeting.module.single.stubs;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.IconFontView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013J\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/stubs/RingingBottomBtsStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "acceptContainer", "acceptIcon", "Landroid/widget/ImageView;", "acceptText", "declineContainer", "declineIcon", "declineText", "getRootView", "()Landroid/view/View;", "setRootView", "voiceOnlyAcceptContainer", "voiceOnlyIcon", "Lcom/ss/android/vc/common/widget/IconFontView;", "voiceOnlyText", "Landroid/widget/TextView;", "disableView", "", "getAcceptContainer", "getDeclineContainer", "getRingingAcceptIcon", "getVoiceOnlyAcceptContainer", "getVoiceOnlyIcon", "getVoiceOnlyText", "initIfNotInflated", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.single.a.b */
public final class RingingBottomBtsStub {

    /* renamed from: a */
    private View f158921a;

    /* renamed from: b */
    private View f158922b;

    /* renamed from: c */
    private View f158923c;

    /* renamed from: d */
    private View f158924d;

    /* renamed from: e */
    private ImageView f158925e;

    /* renamed from: f */
    private IconFontView f158926f;

    /* renamed from: g */
    private View f158927g;

    /* renamed from: h */
    private View f158928h;

    /* renamed from: i */
    private TextView f158929i;

    /* renamed from: j */
    private View f158930j;

    /* renamed from: a */
    public final View mo217882a() {
        m246990h();
        return this.f158921a;
    }

    /* renamed from: b */
    public final View mo217883b() {
        m246990h();
        return this.f158922b;
    }

    /* renamed from: c */
    public final View mo217884c() {
        m246990h();
        return this.f158923c;
    }

    /* renamed from: d */
    public final TextView mo217885d() {
        m246990h();
        return this.f158929i;
    }

    /* renamed from: e */
    public final IconFontView mo217886e() {
        m246990h();
        return this.f158926f;
    }

    /* renamed from: f */
    public final ImageView mo217887f() {
        m246990h();
        return this.f158925e;
    }

    /* renamed from: g */
    public final void mo217888g() {
        IconFontView iconFontView = this.f158926f;
        if (iconFontView != null) {
            iconFontView.setEnabled(false);
        }
        TextView textView = this.f158929i;
        if (textView != null) {
            textView.setEnabled(false);
        }
        View view = this.f158923c;
        if (view != null) {
            view.setClickable(false);
        }
        View view2 = this.f158923c;
        if (view2 != null) {
            view2.setEnabled(false);
        }
        View view3 = this.f158928h;
        if (view3 != null) {
            view3.setEnabled(false);
        }
        ImageView imageView = this.f158925e;
        if (imageView != null) {
            imageView.setEnabled(false);
        }
        View view4 = this.f158922b;
        if (view4 != null) {
            view4.setClickable(false);
        }
        View view5 = this.f158922b;
        if (view5 != null) {
            view5.setEnabled(false);
        }
        View view6 = this.f158927g;
        if (view6 != null) {
            view6.setEnabled(false);
        }
        View view7 = this.f158924d;
        if (view7 != null) {
            view7.setEnabled(false);
        }
        View view8 = this.f158921a;
        if (view8 != null) {
            view8.setClickable(false);
        }
        View view9 = this.f158921a;
        if (view9 != null) {
            view9.setEnabled(false);
        }
    }

    /* renamed from: h */
    private final void m246990h() {
        View view;
        View view2;
        View view3;
        View view4;
        ImageView imageView;
        IconFontView iconFontView;
        View view5;
        View view6;
        ViewStub viewStub;
        if (this.f158921a == null) {
            View view7 = this.f158930j;
            if (!(view7 == null || (viewStub = (ViewStub) view7.findViewById(R.id.ringing_bottom_btns_stub)) == null)) {
                viewStub.inflate();
            }
            View view8 = this.f158930j;
            TextView textView = null;
            if (view8 != null) {
                view = view8.findViewById(R.id.ringing_decline_container);
            } else {
                view = null;
            }
            this.f158921a = view;
            View view9 = this.f158930j;
            if (view9 != null) {
                view2 = view9.findViewById(R.id.ringing_accept_container);
            } else {
                view2 = null;
            }
            this.f158922b = view2;
            View view10 = this.f158930j;
            if (view10 != null) {
                view3 = view10.findViewById(R.id.ringing_accept_voice_only_container);
            } else {
                view3 = null;
            }
            this.f158923c = view3;
            View view11 = this.f158930j;
            if (view11 != null) {
                view4 = view11.findViewById(R.id.ringing_decline);
            } else {
                view4 = null;
            }
            this.f158924d = view4;
            View view12 = this.f158930j;
            if (view12 != null) {
                imageView = (ImageView) view12.findViewById(R.id.ringing_accept);
            } else {
                imageView = null;
            }
            this.f158925e = imageView;
            View view13 = this.f158930j;
            if (view13 != null) {
                iconFontView = (IconFontView) view13.findViewById(R.id.ringing_accept_voice_only_icon);
            } else {
                iconFontView = null;
            }
            this.f158926f = iconFontView;
            View view14 = this.f158930j;
            if (view14 != null) {
                view5 = view14.findViewById(R.id.ringing_decline_text);
            } else {
                view5 = null;
            }
            this.f158927g = view5;
            View view15 = this.f158930j;
            if (view15 != null) {
                view6 = view15.findViewById(R.id.ringing_accept_text);
            } else {
                view6 = null;
            }
            this.f158928h = view6;
            View view16 = this.f158930j;
            if (view16 != null) {
                textView = (TextView) view16.findViewById(R.id.ringing_accept_voice_only_text);
            }
            this.f158929i = textView;
        }
    }

    public RingingBottomBtsStub(View view) {
        this.f158930j = view;
    }
}
