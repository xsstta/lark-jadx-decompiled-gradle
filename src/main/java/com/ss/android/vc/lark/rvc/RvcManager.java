package com.ss.android.vc.lark.rvc;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.p034e.p035a.C0978a;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0006\u0010\u0017\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/lark/rvc/RvcManager;", "", "()V", "FLOAT_KEY", "", "getFLOAT_KEY", "()Ljava/lang/String;", "OPEN_FLOAT_WINDOW", "hasBind", "", "getHasBind", "()Z", "setHasBind", "(Z)V", "rvcUrl", "getRvcUrl", "setRvcUrl", "(Ljava/lang/String;)V", "checkAndOpenFloatView", "", "context", "Landroid/content/Context;", "closeFloatView", "openFloatView", "setRvcPageUrl", "url", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.rvc.b */
public final class RvcManager {

    /* renamed from: a */
    public static final RvcManager f153240a = new RvcManager();

    /* renamed from: b */
    private static final String f153241b = f153241b;

    /* renamed from: c */
    private static volatile String f153242c;

    /* renamed from: d */
    private static volatile boolean f153243d;

    private RvcManager() {
    }

    /* renamed from: a */
    public final String mo211549a() {
        return f153241b;
    }

    /* renamed from: b */
    public final String mo211553b() {
        return f153242c;
    }

    /* renamed from: d */
    public final void mo211555d() {
        C26171w.m94675a(RunnableC61180a.f153244a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.rvc.b$a */
    public static final class RunnableC61180a implements Runnable {

        /* renamed from: a */
        public static final RunnableC61180a f153244a = new RunnableC61180a();

        RunnableC61180a() {
        }

        public final void run() {
            VideoChatModuleDependency.getMultiTaskDependency().mo196450a(RvcManager.f153240a.mo211549a());
        }
    }

    /* renamed from: c */
    public final void mo211554c() {
        if (!TextUtils.isEmpty(f153242c) && f153243d) {
            C26171w.m94675a(RunnableC61181b.f153245a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.rvc.b$b */
    static final class RunnableC61181b implements Runnable {

        /* renamed from: a */
        public static final RunnableC61181b f153245a = new RunnableC61181b();

        RunnableC61181b() {
        }

        public final void run() {
            VideoChatModuleDependency.getMultiTaskDependency().mo196446a(C60773o.m236128f(R.drawable.vc_ic_rvc_float), new int[]{24, 24}, RvcManager.f153240a.mo211549a(), Integer.MAX_VALUE, RunnableC611821.f153246a);
        }
    }

    /* renamed from: a */
    public final void mo211552a(boolean z) {
        f153243d = z;
    }

    /* renamed from: a */
    public final void mo211551a(String str) {
        C60700b.m235843a("RvcManager", "setRvcPageUrl", "rvcUrl=" + str);
        f153242c = str;
        mo211555d();
    }

    /* renamed from: a */
    public final void mo211550a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!TextUtils.isEmpty(f153242c) && f153243d) {
            C0978a.m4782a(context).mo4992a(new Intent("com.ss.android.vc.lark.rvc.open_float_window"));
        }
    }
}
