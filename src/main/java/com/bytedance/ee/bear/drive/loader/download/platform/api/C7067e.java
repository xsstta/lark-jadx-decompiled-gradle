package com.bytedance.ee.bear.drive.loader.download.platform.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.loader.download.model.C7007a;
import com.bytedance.ee.bear.drive.loader.download.model.imfile.C7009a;
import com.bytedance.ee.bear.drive.loader.download.model.p357a.C7008a;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7067e;
import com.bytedance.ee.bear.drive.loader.download.platform.api.Poller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.PreviewGetV1Puller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.imfile.PreviewGetV2Puller;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.e */
public class C7067e {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.e$a */
    public static class C7070a implements Function<PreviewGetV1Puller.Result, C7008a> {

        /* renamed from: a */
        private PreviewGetV1Puller.Params f19032a;

        public C7070a(PreviewGetV1Puller.Params params) {
            this.f19032a = params;
        }

        /* renamed from: a */
        public C7008a apply(PreviewGetV1Puller.Result result) throws Exception {
            C7007a aVar;
            if (result.content == null) {
                aVar = C7007a.f18937a;
            } else {
                aVar = new C7007a(result.content.type, result.content.transcodeUrls);
            }
            return new C7008a(this.f19032a.file_token, this.f19032a.mount_node_token, this.f19032a.mount_point, this.f19032a.preview_type, this.f19032a.version, result.status, result.interval, result.longPushRetryInterval, aVar, result.linearized, result.previewFileSize, result.extra);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.e$b */
    public static class C7071b implements Function<PreviewGetV2Puller.Result, C7009a> {

        /* renamed from: a */
        private PreviewGetV2Puller.Params f19033a;

        public C7071b(PreviewGetV2Puller.Params params) {
            this.f19033a = params;
        }

        /* renamed from: a */
        public C7009a apply(PreviewGetV2Puller.Result result) throws Exception {
            C7007a aVar;
            if (result.content == null) {
                aVar = C7007a.f18937a;
            } else {
                aVar = new C7007a(result.content.type, result.content.transcodeUrls);
            }
            return new C7009a(this.f19033a.app_id, this.f19033a.app_file_id, this.f19033a.auth_extra, result.status, result.interval, result.longPushRetryInterval, aVar, result.linearized, result.previewFileSize, result.extra);
        }
    }

    /* renamed from: a */
    public static AbstractC7064c<PreviewGetV1Puller.Params, C7008a> m28107a(C10917c cVar) {
        final PreviewGetV1Puller previewGetV1Puller = new PreviewGetV1Puller((NetService) KoinJavaComponent.m268610a(NetService.class));
        final C7128a b = C6920b.m27342f().mo27167b();
        return new AbstractC7064c<PreviewGetV1Puller.Params, C7008a>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.C7067e.C70681 */

            /* renamed from: a */
            public AbstractC68307f<C7008a> mo26542a(PreviewGetV1Puller.Params params) {
                b.mo27896b(params.file_token, "request_preview_url", null);
                return previewGetV1Puller.mo26542a((BasePuller.Params) params).mo238020d(new C7070a(params)).mo238005b((Consumer) new Consumer(params) {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$e$1$lqs4FnGTeDdUicMQkllEXTkrP1w */
                    public final /* synthetic */ PreviewGetV1Puller.Params f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7067e.C70681.m28112a(C7128a.this, this.f$1, (C7008a) obj);
                    }
                }).mo238026e(new Function() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$e$1$B_BIDldMruZDQDr7iD0Lzq_N3s4 */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C7067e.C70681.m28111a(PreviewGetV1Puller.Params.this, (Throwable) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m28111a(PreviewGetV1Puller.Params params, Throwable th) throws Exception {
                C13479a.m54758a("DrivePlatform_PreviewGetPuller", String.format("V1 previewGet error, msg: %s, params: %s", th, params.toString()));
                return AbstractC68307f.m265084a(th);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m28112a(C7128a aVar, PreviewGetV1Puller.Params params, C7008a aVar2) throws Exception {
                aVar.mo27887a(params.file_token, "request_preview_url", (AbstractC6927d) null);
            }
        };
    }

    /* renamed from: b */
    public static AbstractC7064c<PreviewGetV2Puller.Params, C7009a> m28109b(C10917c cVar) {
        final PreviewGetV2Puller previewGetV2Puller = new PreviewGetV2Puller((NetService) KoinJavaComponent.m268610a(NetService.class));
        final C7128a b = C6920b.m27342f().mo27167b();
        return new AbstractC7064c<PreviewGetV2Puller.Params, C7009a>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.C7067e.C70692 */

            /* renamed from: a */
            public AbstractC68307f<C7009a> mo26542a(PreviewGetV2Puller.Params params) {
                b.mo27896b(params.app_file_id, "request_preview_url", null);
                return previewGetV2Puller.mo26542a((BasePuller.Params) params).mo238020d(new C7071b(params)).mo238005b((Consumer) new Consumer(params) {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$e$2$0e8V9kbJrwAKsIDN76q4n8Q40c */
                    public final /* synthetic */ PreviewGetV2Puller.Params f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7067e.C70692.m28116a(C7128a.this, this.f$1, (C7009a) obj);
                    }
                }).mo238026e(new Function() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$e$2$YPg_beX84qt_jZ7e6QHWnBTqgjw */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C7067e.C70692.m28115a(PreviewGetV2Puller.Params.this, (Throwable) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m28115a(PreviewGetV2Puller.Params params, Throwable th) throws Exception {
                C13479a.m54758a("DrivePlatform_PreviewGetPuller", String.format("V2 previewGet error, msg: %s, params: %s", th, params.toString()));
                return AbstractC68307f.m265084a(th);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m28116a(C7128a aVar, PreviewGetV2Puller.Params params, C7009a aVar2) throws Exception {
                aVar.mo27887a(params.app_file_id, "request_preview_url", (AbstractC6927d) null);
            }
        };
    }

    /* renamed from: a */
    public static AbstractC7065d<PreviewGetV1Puller.Params, C7008a> m28108a(C10917c cVar, Poller.AbstractC7053b<C7008a> bVar, Poller.AbstractC7052a<C7008a> aVar, Poller.C7055d dVar, Poller.AbstractC7054c cVar2) {
        Poller poller = new Poller(m28107a(cVar), bVar, aVar);
        poller.mo27630a(dVar, cVar2);
        return poller;
    }

    /* renamed from: b */
    public static AbstractC7065d<PreviewGetV2Puller.Params, C7009a> m28110b(C10917c cVar, Poller.AbstractC7053b<C7009a> bVar, Poller.AbstractC7052a<C7009a> aVar, Poller.C7055d dVar, Poller.AbstractC7054c cVar2) {
        Poller poller = new Poller(m28109b(cVar), bVar, aVar);
        poller.mo27630a(dVar, cVar2);
        return poller;
    }
}
