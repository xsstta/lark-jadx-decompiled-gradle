package com.ss.android.appcenter.business.tab.business.popups.content;

import android.content.Context;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.common.util.C28190k;
import com.ss.android.appcenter.common.util.C28209p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/popups/content/BasePopupsContent;", "Lcom/ss/android/appcenter/business/tab/business/popups/content/IPopupsContent;", "()V", "defMinHeight", "", "getDefMinHeight", "()I", "defMinWidth", "getDefMinWidth", "deviceMaxHeight", "getDeviceMaxHeight", "deviceMaxWidth", "getDeviceMaxWidth", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a */
public abstract class BasePopupsContent implements IPopupsContent {

    /* renamed from: a */
    private final int f69643a = C28209p.m103291a(174.0f);

    /* renamed from: b */
    private final int f69644b = C28209p.m103291a(180.0f);

    /* renamed from: c */
    private final int f69645c;

    /* renamed from: d */
    private final int f69646d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo99367a() {
        return this.f69643a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo99368b() {
        return this.f69644b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo99369c() {
        return this.f69645c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo99370d() {
        return this.f69646d;
    }

    public BasePopupsContent() {
        C27528a a = C27528a.m100471a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AppCenter.getInstance()");
        int b = C28190k.m103260b(a.mo98143b());
        C27528a a2 = C27528a.m100471a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AppCenter.getInstance()");
        Context b2 = a2.mo98143b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "AppCenter.getInstance().globalContext");
        this.f69645c = b - (UDDimenUtils.m93313d(b2, R.dimen.workplace_popups_biz_h_padding) * 2);
        C27528a a3 = C27528a.m100471a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AppCenter.getInstance()");
        int a4 = C28190k.m103259a(a3.mo98143b());
        C27528a a5 = C27528a.m100471a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "AppCenter.getInstance()");
        Context b3 = a5.mo98143b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "AppCenter.getInstance().globalContext");
        this.f69646d = a4 - (UDDimenUtils.m93313d(b3, R.dimen.workplace_popups_biz_v_padding) * 2);
    }
}
