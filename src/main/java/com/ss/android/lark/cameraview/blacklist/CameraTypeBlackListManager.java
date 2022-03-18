package com.ss.android.lark.cameraview.blacklist;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\n\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/cameraview/blacklist/CameraTypeBlackListManager;", "", "()V", "FILE_NAME", "", "LOG_TAG", "hasInit", "", "isSupportCameraType2", "Ljava/lang/Boolean;", "openBlackListCheck", "initBlackList", "", "context", "Landroid/content/Context;", "initBlackListInner", "cameraview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.cameraview.a.a */
public final class CameraTypeBlackListManager {

    /* renamed from: a */
    public static final CameraTypeBlackListManager f84002a = new CameraTypeBlackListManager();

    /* renamed from: b */
    private static volatile boolean f84003b;

    /* renamed from: c */
    private static Boolean f84004c;

    /* renamed from: d */
    private static boolean f84005d;

    private CameraTypeBlackListManager() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.cameraview.a.a$a */
    public static final class RunnableC32742a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f84006a;

        RunnableC32742a(Context context) {
            this.f84006a = context;
        }

        public final void run() {
            CameraTypeBlackListManager.f84002a.mo120682b(this.f84006a);
        }
    }

    /* renamed from: a */
    public final void mo120680a(boolean z) {
        f84005d = z;
    }

    /* renamed from: c */
    private final void m125643c(Context context) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC32742a(context));
    }

    /* renamed from: a */
    public final boolean mo120681a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!f84005d) {
            return true;
        }
        if (!f84003b) {
            m125643c(context);
            return true;
        }
        Boolean bool = f84004c;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        kotlin.io.C69101b.m265907a(r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120682b(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.cameraview.blacklist.CameraTypeBlackListManager.mo120682b(android.content.Context):void");
    }
}
