package com.ss.android.vc.meeting.module.topbar.viewstub;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.module.interpretation.widget.LanguageLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u0004\u0018\u00010\tJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/viewstub/InterpretationAreaStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "interpretationArea", "languageContentTv", "Landroid/widget/TextView;", "languageLabel", "Lcom/ss/android/vc/meeting/module/interpretation/widget/LanguageLabel;", "getRootView", "()Landroid/view/View;", "setRootView", "getLanguageLabel", "getLanguageTxt", "gone", "", "initIfNotInflated", "visible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.viewstub.b */
public final class InterpretationAreaStub {

    /* renamed from: a */
    private View f160284a;

    /* renamed from: b */
    private LanguageLabel f160285b;

    /* renamed from: c */
    private TextView f160286c;

    /* renamed from: d */
    private View f160287d;

    /* renamed from: c */
    public final LanguageLabel mo219536c() {
        return this.f160285b;
    }

    /* renamed from: d */
    public final TextView mo219537d() {
        return this.f160286c;
    }

    /* renamed from: a */
    public final void mo219534a() {
        m248653e();
        View view = this.f160284a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo219535b() {
        m248653e();
        View view = this.f160284a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: e */
    private final void m248653e() {
        View view;
        LanguageLabel languageLabel;
        ViewStub viewStub;
        if (this.f160284a == null) {
            View view2 = this.f160287d;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.language_interpretation_area_stub)) == null)) {
                viewStub.inflate();
            }
            View view3 = this.f160287d;
            TextView textView = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.language_interpretation);
            } else {
                view = null;
            }
            this.f160284a = view;
            View view4 = this.f160287d;
            if (view4 != null) {
                languageLabel = (LanguageLabel) view4.findViewById(R.id.txt_label);
            } else {
                languageLabel = null;
            }
            this.f160285b = languageLabel;
            if (languageLabel == null) {
                Intrinsics.throwNpe();
            }
            languageLabel.setTextSize(1, 8.0f);
            View view5 = this.f160287d;
            if (view5 != null) {
                textView = (TextView) view5.findViewById(R.id.txt_language);
            }
            this.f160286c = textView;
        }
    }

    public InterpretationAreaStub(View view) {
        this.f160287d = view;
    }
}
