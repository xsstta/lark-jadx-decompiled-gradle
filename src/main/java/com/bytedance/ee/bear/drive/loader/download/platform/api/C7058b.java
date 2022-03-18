package com.bytedance.ee.bear.drive.loader.download.platform.api;

import android.util.SparseArray;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.core.model.PreviewMeta;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.FileInfoV1Puller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.imfile.FileInfoV2Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.net.CloudReqFun;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.b */
public class C7058b {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.b$b */
    public static class C7062b implements Function<FileInfoV1Puller.Result, C7086a> {

        /* renamed from: a */
        private FileInfoV1Puller.Params f19026a;

        public C7062b(FileInfoV1Puller.Params params) {
            this.f19026a = params;
        }

        /* renamed from: a */
        public C7086a apply(FileInfoV1Puller.Result result) throws Exception {
            SparseArray<PreviewMeta> previewMetaMap = result.getPreviewMetaMap();
            int[] a = C7058b.m28087a(previewMetaMap, result.availablePreviewType);
            C13479a.m54764b("DrivePlatform_FileInfoPuller", "v1 old availablePreviewType: " + Arrays.toString(result.availablePreviewType) + ", new availablePreviewType: " + Arrays.toString(a));
            return new C7086a(new C7086a.C7087a(result.name, result.size, a, result.previewStatus, result.mimeType, result.webOffice, this.f19026a.file_token, this.f19026a.mount_node_token, this.f19026a.mount_point, result.numBlocks, result.version, result.dataVersion, result.creatorTenantId, result.commentFlag, result.permissionStatusCode, this.f19026a.extra, previewMetaMap));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.b$c */
    public static class C7063c implements Function<FileInfoV2Puller.Result, C7088b> {

        /* renamed from: a */
        private FileInfoV2Puller.Params f19027a;

        public C7063c(FileInfoV2Puller.Params params) {
            this.f19027a = params;
        }

        /* renamed from: a */
        public C7088b apply(FileInfoV2Puller.Result result) throws Exception {
            SparseArray<PreviewMeta> previewMetaMap = result.getPreviewMetaMap();
            int[] a = C7058b.m28087a(previewMetaMap, result.availablePreviewType);
            C13479a.m54764b("DrivePlatform_FileInfoPuller", "v2 old availablePreviewType: " + Arrays.toString(result.availablePreviewType) + ", new availablePreviewType: " + Arrays.toString(a));
            return new C7088b(new C7088b.C7089a(result.name, result.size, a, result.previewStatus, result.mimeType, result.webOffice, this.f19027a.app_id, this.f19027a.app_file_id, this.f19027a.auth_extra, result.saveStatus, result.fileToken, previewMetaMap));
        }
    }

    /* renamed from: a */
    public static AbstractC7064c<FileInfoV1Puller.Params, C7086a> m28085a(NetService netService) {
        return m28086a(netService, true);
    }

    /* renamed from: b */
    public static AbstractC7064c<FileInfoV2Puller.Params, C7088b> m28088b(NetService netService) {
        return m28089b(netService, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.b$a */
    public static class C7061a implements Function<AbstractC68307f<? extends Throwable>, AbstractC68307f<?>> {

        /* renamed from: a */
        private final int f19023a;

        /* renamed from: b */
        private final boolean f19024b;

        /* renamed from: c */
        private int f19025c;

        /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.f<R>, io.reactivex.f<?> */
        /* renamed from: a */
        public AbstractC68307f<?> apply(AbstractC68307f<? extends Throwable> fVar) {
            return (AbstractC68307f<R>) fVar.mo238014c(new Function() {
                /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$b$a$r0IZJmZDei_sUHBj7t6D2zrTdnI */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C7058b.C7061a.this.m28097b((Throwable) obj);
                }
            });
        }

        /* renamed from: a */
        private boolean m28096a(Throwable th) {
            if ((th instanceof IOException) || (th.getCause() instanceof IOException) || (th instanceof CloudReqFun.OkHttpReqException)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ AbstractC70020b m28097b(Throwable th) throws Exception {
            if (m28096a(th) && this.f19024b) {
                int i = this.f19025c + 1;
                this.f19025c = i;
                if (i <= this.f19023a) {
                    C13479a.m54764b("DrivePlatform_FileInfoPuller", "pull file info failed because of IOException! perform retry. retryCount = " + this.f19025c);
                    return AbstractC68307f.m265098b(100, TimeUnit.MILLISECONDS);
                }
            }
            return AbstractC68307f.m265084a(th);
        }

        public C7061a(int i, boolean z) {
            this.f19023a = i;
            this.f19024b = z;
        }
    }

    /* renamed from: a */
    public static AbstractC7064c<FileInfoV1Puller.Params, C7086a> m28086a(NetService netService, final boolean z) {
        final FileInfoV1Puller fileInfoV1Puller = new FileInfoV1Puller(netService);
        return new AbstractC7064c<FileInfoV1Puller.Params, C7086a>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b.C70591 */

            /* renamed from: a */
            public AbstractC68307f<C7086a> mo26542a(FileInfoV1Puller.Params params) {
                return fileInfoV1Puller.mo27622a((BasePuller.Params) params).mo238033h(new C7061a(1, z)).mo238020d(new C7062b(params)).mo238026e(new Function() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$b$1$Sh0j00r0tuKK1UCAJqmJxQSPBg */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C7058b.C70591.m28090a(FileInfoV1Puller.Params.this, (Throwable) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m28090a(FileInfoV1Puller.Params params, Throwable th) throws Exception {
                C13479a.m54758a("DrivePlatform_FileInfoPuller", String.format("V1 pullFileInfo error, msg: %s, params: %s", th, params.toString()));
                return AbstractC68307f.m265084a((Throwable) C7072f.m28121a(th, ErrCode.REQUEST_FILE_INFO_EXP));
            }
        };
    }

    /* renamed from: b */
    public static AbstractC7064c<FileInfoV2Puller.Params, C7088b> m28089b(NetService netService, final boolean z) {
        final FileInfoV2Puller fileInfoV2Puller = new FileInfoV2Puller(netService);
        return new AbstractC7064c<FileInfoV2Puller.Params, C7088b>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b.C70602 */

            /* renamed from: a */
            public AbstractC68307f<C7088b> mo26542a(FileInfoV2Puller.Params params) {
                return fileInfoV2Puller.mo27622a((BasePuller.Params) params).mo238033h(new C7061a(1, z)).mo238020d(new C7063c(params)).mo238026e(new Function() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$b$2$M8RMVgChfNoT8PViHOp5odt2F0 */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C7058b.C70602.m28093a(FileInfoV2Puller.Params.this, (Throwable) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m28093a(FileInfoV2Puller.Params params, Throwable th) throws Exception {
                C13479a.m54758a("DrivePlatform_FileInfoPuller", String.format("V2 pullFileInfo error, msg: %s, params: %s", th, params.toString()));
                return AbstractC68307f.m265084a((Throwable) C7072f.m28121a(th, ErrCode.REQUEST_FILE_INFO_EXP));
            }
        };
    }

    /* renamed from: a */
    public static int[] m28087a(SparseArray<PreviewMeta> sparseArray, int[] iArr) {
        int size;
        if (!(sparseArray == null || (size = sparseArray.size()) == 0)) {
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = sparseArray.keyAt(i);
            }
        }
        return iArr;
    }
}
