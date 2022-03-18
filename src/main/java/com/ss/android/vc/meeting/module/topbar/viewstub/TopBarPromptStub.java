package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "currentMode", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;", "promptContainer", "promptLoading", "promptTextView", "Landroid/widget/TextView;", "promptWeakNetIcon", "getRootView", "()Landroid/view/View;", "getPromptContainer", "gone", "", "initIfNotInflated", "showOfMode", "mode", "text", "", "Companion", "Mode", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TopBarPromptStub {

    /* renamed from: a */
    public static final Companion f160274a = new Companion(null);

    /* renamed from: b */
    private View f160275b;

    /* renamed from: c */
    private View f160276c;

    /* renamed from: d */
    private View f160277d;

    /* renamed from: e */
    private TextView f160278e;

    /* renamed from: f */
    private Mode f160279f = Mode.GONE;

    /* renamed from: g */
    private final View f160280g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "GONE", "SUBSTITLE", "SHARE_SCREEN_LABEL", "HAND_WRITIING", "WEAK_NETWORK", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Mode {
        GONE(0),
        SUBSTITLE(17),
        SHARE_SCREEN_LABEL(18),
        HAND_WRITIING(19),
        WEAK_NETWORK(33);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private Mode(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Companion;", "", "()V", "isHigherPriority", "", "mode1", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;", "mode2", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.TopBarPromptStub$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo219531a(Mode mode, Mode mode2) {
            Intrinsics.checkParameterIsNotNull(mode, "mode1");
            Intrinsics.checkParameterIsNotNull(mode2, "mode2");
            if ((mode.getValue() & 240) >= (mode2.getValue() & 240)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo219528a() {
        View view = this.f160275b;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f160279f = Mode.GONE;
    }

    /* renamed from: b */
    private final void m248646b() {
        View view;
        View view2;
        View view3;
        ViewStub viewStub;
        if (this.f160275b == null) {
            View view4 = this.f160280g;
            if (!(view4 == null || (viewStub = (ViewStub) view4.findViewById(R.id.top_bar_prompt_stub)) == null)) {
                viewStub.inflate();
            }
            View view5 = this.f160280g;
            TextView textView = null;
            if (view5 != null) {
                view = view5.findViewById(R.id.top_bar_prompt);
            } else {
                view = null;
            }
            this.f160275b = view;
            View view6 = this.f160280g;
            if (view6 != null) {
                view2 = view6.findViewById(R.id.top_bar_prompt_loading);
            } else {
                view2 = null;
            }
            this.f160276c = view2;
            View view7 = this.f160280g;
            if (view7 != null) {
                view3 = view7.findViewById(R.id.top_bar_prompt_signal);
            } else {
                view3 = null;
            }
            this.f160277d = view3;
            View view8 = this.f160280g;
            if (view8 != null) {
                textView = (TextView) view8.findViewById(R.id.top_bar_prompt_text);
            }
            this.f160278e = textView;
        }
    }

    public TopBarPromptStub(View view) {
        this.f160280g = view;
    }

    /* renamed from: a */
    public final void mo219529a(Mode mode, String str) {
        Intrinsics.checkParameterIsNotNull(mode, "mode");
        if (f160274a.mo219531a(mode, this.f160279f)) {
            this.f160279f = mode;
            m248646b();
            View view = this.f160275b;
            if (view != null) {
                view.setVisibility(0);
            }
            if (mode == Mode.WEAK_NETWORK) {
                View view2 = this.f160276c;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.f160277d;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            } else {
                View view4 = this.f160276c;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                View view5 = this.f160277d;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            }
            TextView textView = this.f160278e;
            if (textView != null) {
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
            }
        }
    }
}
