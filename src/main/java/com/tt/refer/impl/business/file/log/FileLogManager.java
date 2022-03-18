package com.tt.refer.impl.business.file.log;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.refer.impl.business.file.TTFileHelper;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\nH\u0007J\u0018\u0010(\u001a\u00020)2\u0006\u0010#\u001a\u00020$2\u0006\u0010*\u001a\u00020&H\u0002J\u0012\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lcom/tt/refer/impl/business/file/log/FileLogManager;", "", "()V", "DATA_SIZE", "", "LOG_FILE_VERSION", "LOG_SLICE_SIZE", "", "LOG_TOTAL_SIZE", "MD5_PLACE_HOLDER", "", "getMD5_PLACE_HOLDER", "()Ljava/lang/String;", "META_SIZE", "SLICE_VERSION", "TAG", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "logHandler", "Landroid/os/Handler;", "getLogHandler", "()Landroid/os/Handler;", "logHandler$delegate", "Lkotlin/Lazy;", "logThread", "Landroid/os/HandlerThread;", "getLogThread", "()Landroid/os/HandlerThread;", "logThread$delegate", "enqueueSync", "", "logItem", "Lcom/tt/refer/impl/business/file/log/LogItem;", "getLogFile", "Ljava/io/File;", "userId", "getLogMeta", "Lcom/tt/refer/impl/business/file/log/LogMeta;", "file", "init", "context", "readStartPosition", "logRaf", "Ljava/io/RandomAccessFile;", "writeLog", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.log.a */
public final class FileLogManager {

    /* renamed from: a */
    public static Context f171132a = null;

    /* renamed from: b */
    public static final FileLogManager f171133b = new FileLogManager();

    /* renamed from: c */
    private static final String f171134c = f171134c;

    /* renamed from: d */
    private static final Lazy f171135d = LazyKt.lazy(C67931c.INSTANCE);

    /* renamed from: e */
    private static final Lazy f171136e = LazyKt.lazy(C67930b.INSTANCE);

    /* renamed from: b */
    private final Handler m264461b() {
        return (Handler) f171136e.getValue();
    }

    /* renamed from: a */
    public final HandlerThread mo235693a() {
        return (HandlerThread) f171135d.getValue();
    }

    private FileLogManager() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.log.a$a */
    static final class RunnableC67929a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LogItem f171137a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f171138b;

        RunnableC67929a(LogItem bVar, CountDownLatch countDownLatch) {
            this.f171137a = bVar;
            this.f171138b = countDownLatch;
        }

        public final void run() {
            FileLogManager.f171133b.mo235694b(this.f171137a);
            this.f171138b.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.log.a$b */
    static final class C67930b extends Lambda implements Function0<Handler> {
        public static final C67930b INSTANCE = new C67930b();

        C67930b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(FileLogManager.f171133b.mo235693a().getLooper());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/HandlerThread;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.log.a$c */
    static final class C67931c extends Lambda implements Function0<HandlerThread> {
        public static final C67931c INSTANCE = new C67931c();

        C67931c() {
            super(0);
        }

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str, int i) {
            return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HandlerThread invoke() {
            HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("file_log_thread", 10);
            new_android_os_HandlerThread_by_knot.start();
            return new_android_os_HandlerThread_by_knot;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m264459a(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
            f171132a = applicationContext;
            return;
        }
        AppBrandLogger.m52830i("FileLogManager", "context is null");
    }

    /* renamed from: a */
    private final long m264456a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 8192) {
            randomAccessFile.writeByte(1);
            randomAccessFile.writeInt((int) 8192);
            randomAccessFile.seek(8192);
            randomAccessFile.writeByte(0);
            return 8192;
        }
        randomAccessFile.seek(1);
        return (long) randomAccessFile.readInt();
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m264458a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Context context = f171132a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        }
        File externalCacheDir = context.getExternalCacheDir();
        return new File(externalCacheDir, "/com.filesystem.openplatform/LarkUser_" + str + ".filelog");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m264460a(LogItem bVar) {
        if (!TTFileHelper.f171065a.mo235591a().isEnableFileLog()) {
            AppBrandLogger.m52830i("FileLogManager", "file log closed.");
        } else if (bVar != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Message.obtain(f171133b.m264461b(), new RunnableC67929a(bVar, countDownLatch)).sendToTarget();
            countDownLatch.await();
        } else {
            AppBrandLogger.m52830i("FileLogManager", "logItem is null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0196, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0197, code lost:
        r15 = "logRaf close exception";
        r16 = "srcRaf close exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019d, code lost:
        r15 = "logRaf close exception";
        r16 = "srcRaf close exception";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019c A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:5:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b0 A[SYNTHETIC, Splitter:B:76:0x01b0] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c4 A[SYNTHETIC, Splitter:B:81:0x01c4] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01db A[SYNTHETIC, Splitter:B:87:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ef A[SYNTHETIC, Splitter:B:92:0x01ef] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo235694b(com.tt.refer.impl.business.file.log.LogItem r18) {
        /*
        // Method dump skipped, instructions count: 514
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.impl.business.file.log.FileLogManager.mo235694b(com.tt.refer.impl.business.file.log.b):void");
    }

    /* renamed from: a */
    private final LogMeta m264457a(LogItem bVar, File file) {
        return new LogMeta(bVar.mo235697b(), file.length(), file.lastModified(), file.lastModified(), f171134c, bVar.mo235698c(), bVar.mo235699d(), bVar.mo235700e(), bVar.mo235702f(), bVar.mo235703g(), bVar.mo235704h(), bVar.mo235706i());
    }
}
