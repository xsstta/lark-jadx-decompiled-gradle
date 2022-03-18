package com.ss.android.vc.meeting.module.livestream;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.dependency.AbstractC60888d;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/livestream/LivestreamLabel;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "updateCount", "", "count", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class LivestreamLabel extends FrameLayout {

    /* renamed from: a */
    private final String f155807a;

    public LivestreamLabel(Context context) {
        this(context, null, 0, 6, null);
    }

    public LivestreamLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final String getTAG() {
        return this.f155807a;
    }

    /* renamed from: a */
    public final void mo214668a(int i) {
        String str;
        String str2 = this.f155807a;
        C60700b.m235851b(str2, "[updateCount]", "count=" + i);
        if (i >= 0) {
            try {
                AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
                Intrinsics.checkExpressionValueIsNotNull(appEnvDependency, "VideoChatModuleDependency.getAppEnvDependency()");
                if (appEnvDependency.mo196333c()) {
                    str = C62070h.m242514b(String.valueOf(i));
                } else {
                    str = C62070h.m242513a(String.valueOf(i));
                }
                View rootView = getRootView();
                Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                LineHeightTextView lineHeightTextView = (LineHeightTextView) rootView.findViewById(R.id.title_livestream_count);
                Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "rootView.title_livestream_count");
                lineHeightTextView.setText(str);
            } catch (Exception unused) {
                View rootView2 = getRootView();
                Intrinsics.checkExpressionValueIsNotNull(rootView2, "rootView");
                LineHeightTextView lineHeightTextView2 = (LineHeightTextView) rootView2.findViewById(R.id.title_livestream_count);
                Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView2, "rootView.title_livestream_count");
                lineHeightTextView2.setText(String.valueOf(i));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LivestreamLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f155807a = "LivestreamLabel";
        LayoutInflater.from(getContext()).inflate(R.layout.livestream_label_in_meeting, (ViewGroup) this, true);
        mo214668a(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LivestreamLabel(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
