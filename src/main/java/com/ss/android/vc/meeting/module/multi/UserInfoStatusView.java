package com.ss.android.vc.meeting.module.multi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001<B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ0\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0014JS\u0010/\u001a\u00020)2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u00106J_\u0010/\u001a\u00020)2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u00108J\u000e\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020!J\b\u0010;\u001a\u00020)H\u0002R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\u001e\u0010%\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010¨\u0006="}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "mCoHost", "", "getMCoHost", "()Ljava/lang/Boolean;", "setMCoHost", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mHost", "getMHost", "setMHost", "mMicUnavailable", "getMMicUnavailable", "setMMicUnavailable", "mMicrophoneMuted", "getMMicrophoneMuted", "setMMicrophoneMuted", "mName", "getMName", "()Ljava/lang/String;", "setMName", "(Ljava/lang/String;)V", "mOnLayoutChangeObserver", "Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusView$OnLayoutChangeObserver;", "mShareScreen", "getMShareScreen", "setMShareScreen", "mWeakNet", "getMWeakNet", "setMWeakNet", "onLayout", "", "changed", "left", "top", "right", "bottom", "onUserInfoChanged", "host", "microphoneMuted", "shareScreen", "weakNet", "name", "coHost", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "micUnavailable", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "setOnLayoutChangeObserver", "onLayoutChangeObserver", "updateView", "OnLayoutChangeObserver", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserInfoStatusView extends AppCompatTextView {

    /* renamed from: a */
    private final String f157184a;

    /* renamed from: b */
    private Boolean f157185b;

    /* renamed from: c */
    private Boolean f157186c;

    /* renamed from: e */
    private Boolean f157187e;

    /* renamed from: f */
    private Boolean f157188f;

    /* renamed from: g */
    private String f157189g;

    /* renamed from: h */
    private Boolean f157190h;

    /* renamed from: i */
    private Boolean f157191i;

    /* renamed from: j */
    private OnLayoutChangeObserver f157192j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusView$OnLayoutChangeObserver;", "", "onLayoutChange", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.UserInfoStatusView$a */
    public interface OnLayoutChangeObserver {
        /* renamed from: a */
        void mo216026a(View view);
    }

    public UserInfoStatusView(Context context) {
        this(context, null, 0, 6, null);
    }

    public UserInfoStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final Boolean getMCoHost() {
        return this.f157190h;
    }

    public final Boolean getMHost() {
        return this.f157185b;
    }

    public final Boolean getMMicUnavailable() {
        return this.f157191i;
    }

    public final Boolean getMMicrophoneMuted() {
        return this.f157187e;
    }

    public final String getMName() {
        return this.f157189g;
    }

    public final Boolean getMShareScreen() {
        return this.f157186c;
    }

    public final Boolean getMWeakNet() {
        return this.f157188f;
    }

    public final void setMCoHost(Boolean bool) {
        this.f157190h = bool;
    }

    public final void setMHost(Boolean bool) {
        this.f157185b = bool;
    }

    public final void setMMicUnavailable(Boolean bool) {
        this.f157191i = bool;
    }

    public final void setMMicrophoneMuted(Boolean bool) {
        this.f157187e = bool;
    }

    public final void setMName(String str) {
        this.f157189g = str;
    }

    public final void setMShareScreen(Boolean bool) {
        this.f157186c = bool;
    }

    public final void setMWeakNet(Boolean bool) {
        this.f157188f = bool;
    }

    public final void setOnLayoutChangeObserver(OnLayoutChangeObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onLayoutChangeObserver");
        this.f157192j = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInfoStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f157184a = "UserInfoStatusView";
        setIncludeFontPadding(false);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OnLayoutChangeObserver aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (aVar = this.f157192j) != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo216026a(this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserInfoStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
