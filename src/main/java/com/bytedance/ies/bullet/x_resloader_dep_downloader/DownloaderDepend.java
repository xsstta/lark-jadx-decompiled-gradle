package com.bytedance.ies.bullet.x_resloader_dep_downloader;

import android.app.Application;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ICdnDownloadDepender;
import com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownLoadInfo;
import com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownloaderListener;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ies/bullet/x_resloader_dep_downloader/DownloaderDepend;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ICdnDownloadDepender;", "()V", "downloadResourceFile", "", "sourceUrl", "", "syncCall", "", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "listener", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/RLDownloaderListener;", "isMainThread", "Companion", "x-resloader-dep-downloader_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ies.bullet.b.a */
public final class DownloaderDepend implements ICdnDownloadDepender {

    /* renamed from: a */
    public static final SparseArray<WeakReference<AbsDownloadListener>> f37814a = new SparseArray<>();

    /* renamed from: b */
    public static final Companion f37815b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/bullet/x_resloader_dep_downloader/DownloaderDepend$Companion;", "", "()V", "downloaderRefMap", "Landroid/util/SparseArray;", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/socialbase/downloader/depend/AbsDownloadListener;", "x-resloader-dep-downloader_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ies.bullet.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final boolean m57942a() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"com/bytedance/ies/bullet/x_resloader_dep_downloader/DownloaderDepend$downloadResourceFile$downloadListener$1", "Lcom/ss/android/socialbase/downloader/depend/AbsDownloadListener;", "resolveRef", "Ljava/lang/ref/WeakReference;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/RLDownloaderListener;", "getResolveRef", "()Ljava/lang/ref/WeakReference;", "onFailed", "", "entity", "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;", "e", "Lcom/ss/android/socialbase/downloader/exception/BaseException;", "onSuccessed", "x-resloader-dep-downloader_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ies.bullet.b.a$b */
    public static final class C14404b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ Application f37816a;

        /* renamed from: b */
        final /* synthetic */ boolean f37817b;

        /* renamed from: c */
        final /* synthetic */ File f37818c;

        /* renamed from: d */
        final /* synthetic */ RLDownloaderListener f37819d;

        /* renamed from: e */
        private final WeakReference<RLDownloaderListener> f37820e;

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public void onSuccessed(DownloadInfo downloadInfo) {
            RLDownloaderListener hVar;
            AbsDownloadListener absDownloadListener;
            Intrinsics.checkParameterIsNotNull(downloadInfo, "entity");
            WeakReference<AbsDownloadListener> weakReference = DownloaderDepend.f37814a.get(downloadInfo.getId());
            if (!(weakReference == null || (absDownloadListener = weakReference.get()) == null)) {
                Downloader.getInstance(this.f37816a).removeMainThreadListener(downloadInfo.getId(), absDownloadListener);
            }
            if (!this.f37817b && (hVar = this.f37820e.get()) != null) {
                String absolutePath = this.f37818c.getAbsolutePath();
                Intrinsics.checkExpressionValueIsNotNull(absolutePath, "destination.absolutePath");
                hVar.mo52524a(new RLDownLoadInfo(absolutePath, false));
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            RLDownloaderListener hVar;
            AbsDownloadListener absDownloadListener;
            Intrinsics.checkParameterIsNotNull(downloadInfo, "entity");
            Intrinsics.checkParameterIsNotNull(baseException, "e");
            WeakReference<AbsDownloadListener> weakReference = DownloaderDepend.f37814a.get(downloadInfo.getId());
            if (!(weakReference == null || (absDownloadListener = weakReference.get()) == null)) {
                Downloader.getInstance(this.f37816a).removeMainThreadListener(downloadInfo.getId(), absDownloadListener);
            }
            if (!this.f37817b && (hVar = this.f37820e.get()) != null) {
                hVar.mo52525a("download failed, errorCode:" + baseException.getErrorCode() + " errorMsg:" + baseException.getErrorMessage());
            }
        }

        C14404b(Application application, boolean z, File file, RLDownloaderListener hVar) {
            this.f37816a = application;
            this.f37817b = z;
            this.f37818c = file;
            this.f37819d = hVar;
            this.f37820e = new WeakReference<>(hVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r10 != null) goto L_0x008c;
     */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ICdnDownloadDepender
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo52575a(java.lang.String r17, boolean r18, com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig r19, com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownloaderListener r20) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.x_resloader_dep_downloader.DownloaderDepend.mo52575a(java.lang.String, boolean, com.bytedance.ies.bullet.service.base.resourceloader.config.j, com.bytedance.ies.bullet.service.base.resourceloader.config.h):void");
    }
}
