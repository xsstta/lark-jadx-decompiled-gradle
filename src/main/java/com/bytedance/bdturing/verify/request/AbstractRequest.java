package com.bytedance.bdturing.verify.request;

import android.app.Activity;
import com.bytedance.bdturing.domain.UrlBuilder;
import com.bytedance.bdturing.p209e.C3542b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\"j\u0002`#H&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u001cH&J\b\u0010'\u001a\u00020%H&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "fullscreen", "", "getFullscreen", "()Z", "setFullscreen", "(Z)V", "loading", "getLoading", "setLoading", "mask", "getMask", "setMask", "maskCancel", "getMaskCancel", "setMaskCancel", "preCreate", "getPreCreate", "setPreCreate", "url", "", "getUrl", "()Ljava/lang/String;", "buildUrl", "", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEventLimits", "", "getServiceType", "getType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.a.a */
public abstract class AbstractRequest {

    /* renamed from: a */
    private Activity f11191a;

    /* renamed from: b */
    private boolean f11192b;

    /* renamed from: c */
    private boolean f11193c;

    /* renamed from: d */
    private boolean f11194d;

    /* renamed from: e */
    private boolean f11195e = true;

    /* renamed from: f */
    private boolean f11196f = true;

    /* renamed from: a */
    public abstract void mo14340a(StringBuilder sb);

    /* renamed from: f */
    public abstract int mo14348f();

    /* renamed from: g */
    public abstract String mo14349g();

    /* renamed from: h */
    public abstract int mo14350h();

    /* renamed from: a */
    public final Activity mo14338a() {
        return this.f11191a;
    }

    /* renamed from: d */
    public final boolean mo14346d() {
        return this.f11195e;
    }

    /* renamed from: e */
    public final boolean mo14347e() {
        return this.f11196f;
    }

    /* renamed from: b */
    public boolean mo14343b() {
        return this.f11192b;
    }

    /* renamed from: c */
    public final boolean mo14345c() {
        return this.f11194d;
    }

    /* renamed from: i */
    public final String mo14351i() {
        StringBuilder a = UrlBuilder.f11146a.mo14291a(mo14348f(), mo14349g(), this.f11191a);
        if (this.f11193c) {
            C3542b.m14903a(a, "preload", 1);
        }
        mo14340a(a);
        String sb = a.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb, "queryBuilder.toString()");
        return sb;
    }

    /* renamed from: b */
    public final void mo14342b(boolean z) {
        this.f11195e = z;
    }

    /* renamed from: c */
    public final void mo14344c(boolean z) {
        this.f11196f = z;
    }

    /* renamed from: a */
    public final void mo14339a(Activity activity) {
        this.f11191a = activity;
    }

    /* renamed from: a */
    public void mo14341a(boolean z) {
        this.f11192b = z;
    }
}
