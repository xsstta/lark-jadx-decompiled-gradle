package com.ss.android.lark.filedetail.monitor;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/filedetail/monitor/FileDownloadAppreciableKit;", "", "()V", "ERROR_CODE_NO_PERMISSION", "", "KEY_HAD_BEEN_PAUSED", "", "KEY_IS_CRYPTO", "KEY_RESOURCE_CONTENT_LENGTH", "end", "", "key", "contentLength", "", "error", "isCrypto", "", "errorType", "Lcom/ss/android/lark/appreciablelib/ErrorType;", "errorCode", "pause", "recall", "resume", "start", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.c.a */
public final class FileDownloadAppreciableKit {

    /* renamed from: a */
    public static final FileDownloadAppreciableKit f97902a = new FileDownloadAppreciableKit();

    private FileDownloadAppreciableKit() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m150174b(boolean z) {
        m150172a(z, ErrorType.Other, 3);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m150173b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        AppreciableKit.m107395b(AppreciableKit.f73094h.mo103524a(), str, null, null, null, null, 30, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m150169a(boolean z) {
        return AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Chat, Event.file_download, "null", true, MapsKt.mapOf(TuplesKt.to("is_crypto", Boolean.valueOf(z)), TuplesKt.to("had_been_paused", false)), null, null, null, 448, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m150170a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        AppreciableKit.m107391a(AppreciableKit.f73094h.mo103524a(), str, MapsKt.mapOf(TuplesKt.to("had_been_paused", true)), (Map) null, (Map) null, (Map) null, 28, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m150171a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, null, null, MapsKt.mapOf(TuplesKt.to("resource_content_length", Long.valueOf(j))), null, 22, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m150172a(boolean z, ErrorType errorType, int i) {
        Intrinsics.checkParameterIsNotNull(errorType, "errorType");
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.file_download, errorType, ErrorLevel.Fatal, i, null, null, null, true, null, null, MapsKt.mapOf(TuplesKt.to("is_crypto", Boolean.valueOf(z))), 3520, null));
    }
}
