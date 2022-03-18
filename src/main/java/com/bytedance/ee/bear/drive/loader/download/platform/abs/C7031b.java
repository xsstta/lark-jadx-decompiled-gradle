package com.bytedance.ee.bear.drive.loader.download.platform.abs;

import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.core.model.PreviewMeta;
import com.bytedance.ee.bear.drive.loader.download.model.C7007a;
import com.bytedance.ee.bear.drive.loader.download.model.imfile.C7009a;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7031b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7067e;
import com.bytedance.ee.bear.drive.loader.download.platform.api.Poller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.imfile.PreviewGetV2Puller;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.b */
public class C7031b implements AbstractC7039c {

    /* renamed from: a */
    public final C10917c f18983a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.b$a */
    public static class C7037a implements Serializable {
        public String app_file_id;
        public String app_id;
        public C7038a body;
        public String data_version;
        public String file_token;

        /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.b$a$a */
        static class C7038a implements Serializable {
            public int preview_type;
            public int status;

            C7038a() {
            }

            public String toString() {
                return "Body{preview_type=" + this.preview_type + ", status=" + this.status + '}';
            }
        }

        private C7037a() {
        }

        public String toString() {
            return "TransformResult{app_id='" + C13721c.m55650d(this.app_id) + '\'' + ", app_file_id='" + C13721c.m55650d(this.app_file_id) + '\'' + ", file_token='" + C13721c.m55650d(this.file_token) + '\'' + ", data_version='" + this.data_version + '\'' + ", body=" + this.body + '}';
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: a */
    public AbstractC7039c.AbstractC7040a mo27587a() {
        return new AbstractC7039c.AbstractC7040a() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7031b.C70321 */

            /* renamed from: a */
            AbstractC7065d<PreviewGetV2Puller.Params, C7009a> f18984a;

            /* renamed from: b */
            AbstractC7039c.AbstractC7041b f18985b;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m27994b() {
                AbstractC7039c.AbstractC7041b bVar = this.f18985b;
                if (bVar != null) {
                    bVar.onTransformStart();
                }
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7040a
            /* renamed from: a */
            public void mo27596a() {
                AbstractC7065d<PreviewGetV2Puller.Params, C7009a> dVar = this.f18984a;
                if (dVar != null) {
                    dVar.mo27629a();
                }
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7040a
            /* renamed from: a */
            public void mo27597a(AbstractC7039c.AbstractC7041b bVar) {
                this.f18985b = bVar;
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7040a
            /* renamed from: a */
            public AbstractC7043e mo27595a(AbstractC6949c cVar) throws Throwable {
                C7009a aVar;
                final C7088b b = C7031b.this.mo27616b(cVar);
                AbstractC7065d<PreviewGetV2Puller.Params, C7009a> b2 = C7067e.m28110b(C7031b.this.f18983a, new Poller.AbstractC7053b<C7009a>() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7031b.C70321.C70331 */

                    /* renamed from: a */
                    public boolean mo27599a(C7009a aVar) {
                        boolean z = true;
                        if (aVar.mo27554a() == 1 || aVar.mo27554a() == 2) {
                            z = false;
                        }
                        C13479a.m54764b("DrivePlatform_ApiV2Executor", "check poller pull result, previewGet status: " + aVar.mo27554a() + ", check through: " + z);
                        return z;
                    }
                }, new Poller.AbstractC7052a<C7009a>() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7031b.C70321.C70342 */

                    /* renamed from: a */
                    public int mo27601a(C7009a aVar) {
                        return aVar.mo27555b();
                    }
                }, new Poller.C7055d("DRIVE_PREVIEW_EVENT_", String.format("%s_%s", b.mo27322a().f19101m, b.mo27322a().f18785a)), new Poller.AbstractC7054c() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7031b.C70321.C70353 */

                    @Override // com.bytedance.ee.bear.drive.loader.download.platform.api.Poller.AbstractC7054c
                    /* renamed from: a */
                    public boolean mo27602a(String str) {
                        boolean z;
                        C7037a a = C7031b.this.mo27614a(str);
                        if (a == null || !TextUtils.equals(a.app_id, b.mo27322a().f19101m) || !TextUtils.equals(a.app_file_id, b.mo27322a().f18785a) || !Poller.m28069a(a.body.preview_type, b.mo27329c()) || a.body.status != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C13479a.m54764b("DrivePlatform_ApiV2Executor", "check poller push result, res: " + a + ", check through: " + z);
                        return z;
                    }
                });
                this.f18984a = b2;
                b2.mo27631a(new AbstractC7065d.AbstractC7066a() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$b$1$Ru2y7z0zBfWfXkgOU9FUY5q4qFo */

                    @Override // com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d.AbstractC7066a
                    public final void onPollingStart() {
                        C7031b.C70321.this.m27994b();
                    }
                });
                PreviewMeta a = C7031b.this.mo27612a(b);
                if (a != null) {
                    aVar = C7031b.this.mo27613a(b, a);
                } else {
                    aVar = this.f18984a.mo27627a(new PreviewGetV2Puller.Params(b.mo27322a().f19101m, b.mo27322a().f18785a, b.mo27329c(), b.mo27322a().f19102n));
                }
                return C7031b.this.mo27615a(aVar, b);
            }
        };
    }

    public C7031b(C10917c cVar) {
        this.f18983a = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: b */
    public boolean mo27593b(String str) {
        return C7045g.m28052a(str);
    }

    /* renamed from: a */
    public C7037a mo27614a(String str) {
        try {
            return (C7037a) JSON.parseObject(str, C7037a.class);
        } catch (Exception e) {
            C13479a.m54759a("DrivePlatform_ApiV2Executor", "ApiV2Executor: parse url json failed. ", e);
            return null;
        }
    }

    /* renamed from: b */
    public C7088b mo27616b(AbstractC6949c cVar) {
        AbstractC6946a a = cVar.mo27371a();
        if (a instanceof C7088b) {
            return (C7088b) a;
        }
        throw new IllegalArgumentException("v2 detail not instance of SdkFileModel !!!");
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: a */
    public AbstractC7043e mo27588a(AbstractC6949c cVar) {
        C7009a aVar;
        C7088b b = mo27616b(cVar);
        PreviewMeta a = mo27612a(b);
        if (a != null) {
            aVar = mo27613a(b, a);
        } else {
            aVar = C7067e.m28109b(this.f18983a).mo26542a(new PreviewGetV2Puller.Params(b.mo27322a().f19101m, b.mo27322a().f18785a, b.mo27329c(), b.mo27322a().f19102n)).mo238023d();
        }
        return mo27615a(aVar, b);
    }

    /* renamed from: a */
    public PreviewMeta mo27612a(C7088b bVar) {
        int c = bVar.mo27329c();
        SparseArray sparseArray = bVar.mo27322a().f18793i;
        if (sparseArray == null) {
            return null;
        }
        PreviewMeta previewMeta = (PreviewMeta) sparseArray.get(c);
        if (previewMeta == null) {
            return previewMeta;
        }
        if (!Arrays.asList(9, 11, 12).contains(Integer.valueOf(c)) || previewMeta.getStatus() != 0) {
            return previewMeta;
        }
        previewMeta.setLinearized(true);
        return previewMeta;
    }

    /* renamed from: a */
    public AbstractC7043e mo27615a(final C7009a aVar, final C7088b bVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC7043e<C7009a>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7031b.C70362 */

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: a */
            public int mo27603a() {
                return aVar.mo27554a();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: b */
            public boolean mo27604b() {
                return aVar.mo27557d();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: c */
            public String mo27605c() {
                return C7046h.m28056a(bVar);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: d */
            public String mo27606d() {
                return C7046h.m28060b(bVar);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: e */
            public long mo27607e() {
                return aVar.mo27558e();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: g */
            public String mo27609g() {
                return aVar.mo27559f();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: f */
            public Map<String, String> mo27608f() {
                C7007a c = aVar.mo27556c();
                if (c == null) {
                    return null;
                }
                return c.mo27540a();
            }
        };
    }

    /* renamed from: a */
    public C7009a mo27613a(C7088b bVar, PreviewMeta previewMeta) {
        C7007a aVar;
        PreviewMeta.Content content = previewMeta.getContent();
        if (content == null) {
            aVar = C7007a.f18937a;
        } else {
            aVar = new C7007a(content.type, content.transcodeUrls);
        }
        return new C7009a(bVar.mo27322a().f19101m, bVar.mo27322a().f18785a, bVar.mo27322a().f19102n, previewMeta.getStatus(), previewMeta.getInterval(), previewMeta.getLongPushRetryInterval(), aVar, previewMeta.isLinearized(), previewMeta.getPreviewFileSize(), previewMeta.getExtra());
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: c */
    public String mo27594c(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority) {
        return mo27592b(cVar, downloadCallback, downloadPriority);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: b */
    public String mo27592b(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority) {
        C7088b b = mo27616b(cVar);
        return C7045g.m28049a(C7046h.m28061c(b), b.mo27343j(), downloadPriority, "", b.mo27322a().f18787c, null, downloadCallback);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: a */
    public String mo27590a(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority) {
        C7088b b = mo27616b(cVar);
        return C7045g.m28049a(b.mo27340g(), b.mo27343j(), downloadPriority, "", b.mo27322a().f18787c, null, downloadCallback);
    }
}
