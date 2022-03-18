package com.bytedance.ee.bear.drive.loader.download.platform.abs;

import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.core.model.PreviewMeta;
import com.bytedance.ee.bear.drive.loader.download.model.C7007a;
import com.bytedance.ee.bear.drive.loader.download.model.p357a.C7008a;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7067e;
import com.bytedance.ee.bear.drive.loader.download.platform.api.Poller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.PreviewGetV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.a */
public class C7023a implements AbstractC7039c {

    /* renamed from: a */
    public final C10917c f18972a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.a$a */
    public static class C7029a implements Serializable {
        public C7030a body;
        public String data_version;
        public String file_token;

        /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.a$a$a */
        static class C7030a implements Serializable {
            public int preview_type;
            public int status;

            C7030a() {
            }

            public String toString() {
                return "Body{preview_type=" + this.preview_type + ", status=" + this.status + '}';
            }
        }

        private C7029a() {
        }

        public String toString() {
            return "TransformResult{file_token='" + C13721c.m55650d(this.file_token) + '\'' + ", data_version='" + this.data_version + '\'' + ", body=" + this.body + '}';
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: a */
    public AbstractC7039c.AbstractC7040a mo27587a() {
        return new AbstractC7039c.AbstractC7040a() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a.C70241 */

            /* renamed from: a */
            AbstractC7065d<PreviewGetV1Puller.Params, C7008a> f18973a;

            /* renamed from: b */
            AbstractC7039c.AbstractC7041b f18974b;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m27967b() {
                AbstractC7039c.AbstractC7041b bVar = this.f18974b;
                if (bVar != null) {
                    bVar.onTransformStart();
                }
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7040a
            /* renamed from: a */
            public void mo27596a() {
                AbstractC7065d<PreviewGetV1Puller.Params, C7008a> dVar = this.f18973a;
                if (dVar != null) {
                    dVar.mo27629a();
                }
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7040a
            /* renamed from: a */
            public void mo27597a(AbstractC7039c.AbstractC7041b bVar) {
                this.f18974b = bVar;
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7040a
            /* renamed from: a */
            public AbstractC7043e mo27595a(AbstractC6949c cVar) throws Throwable {
                C7008a aVar;
                final C7086a b = C7023a.this.mo27591b(cVar);
                AbstractC7065d<PreviewGetV1Puller.Params, C7008a> a = C7067e.m28108a(C7023a.this.f18972a, new Poller.AbstractC7053b<C7008a>() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a.C70241.C70251 */

                    /* renamed from: a */
                    public boolean mo27599a(C7008a aVar) {
                        boolean z = true;
                        if (aVar.mo27542a() == 1 || aVar.mo27542a() == 2) {
                            z = false;
                        }
                        C13479a.m54764b("DrivePlatform_ApiV1Executor", "check poller pull result, previewGet status: " + aVar.mo27542a() + ", check through: " + z);
                        return z;
                    }
                }, new Poller.AbstractC7052a<C7008a>() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a.C70241.C70262 */

                    /* renamed from: a */
                    public int mo27601a(C7008a aVar) {
                        return aVar.mo27543b();
                    }
                }, new Poller.C7055d("DRIVE_PREVIEW_EVENT_", b.mo27322a().f18785a), new Poller.AbstractC7054c() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a.C70241.C70273 */

                    @Override // com.bytedance.ee.bear.drive.loader.download.platform.api.Poller.AbstractC7054c
                    /* renamed from: a */
                    public boolean mo27602a(String str) {
                        boolean z;
                        C7029a a = C7023a.this.mo27586a(str);
                        if (a == null || !TextUtils.equals(a.file_token, b.mo27322a().f18785a) || !TextUtils.equals(a.data_version, b.mo27322a().f19097p) || !Poller.m28069a(a.body.preview_type, b.mo27329c()) || a.body.status != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C13479a.m54764b("DrivePlatform_ApiV1Executor", "check poller push result, res: " + a + ", fileModel version: " + b.mo27322a().f19097p + ", check through: " + z);
                        return z;
                    }
                });
                this.f18973a = a;
                a.mo27631a(new AbstractC7065d.AbstractC7066a() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$a$1$2bqtoLuCU9w6tAkuBGduihmljKE */

                    @Override // com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d.AbstractC7066a
                    public final void onPollingStart() {
                        C7023a.C70241.this.m27967b();
                    }
                });
                PreviewMeta a2 = C7023a.this.mo27584a(b);
                if (a2 != null) {
                    aVar = C7023a.this.mo27585a(b, a2);
                } else {
                    aVar = this.f18973a.mo27627a(new PreviewGetV1Puller.Params(b.mo27322a().f18785a, b.mo27322a().f19094m, b.mo27322a().f19095n, b.mo27329c(), false, b.mo27322a().f19097p, b.mo27322a().mo27363f()));
                }
                return C7023a.this.mo27589a(aVar, b);
            }
        };
    }

    public C7023a(C10917c cVar) {
        this.f18972a = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: b */
    public boolean mo27593b(String str) {
        return C7045g.m28052a(str);
    }

    /* renamed from: a */
    public C7029a mo27586a(String str) {
        try {
            return (C7029a) JSON.parseObject(str, C7029a.class);
        } catch (Exception e) {
            C13479a.m54759a("DrivePlatform_ApiV1Executor", "ApiV1Executor: parse url json failed. ", e);
            return null;
        }
    }

    /* renamed from: b */
    public C7086a mo27591b(AbstractC6949c cVar) {
        AbstractC6946a a = cVar.mo27371a();
        if (a instanceof C7086a) {
            return (C7086a) a;
        }
        throw new IllegalArgumentException("v1 detail not instance of DriveFileModel !!!");
    }

    /* renamed from: a */
    public PreviewMeta mo27584a(C7086a aVar) {
        int c = aVar.mo27329c();
        SparseArray sparseArray = aVar.mo27322a().f18793i;
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

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: a */
    public AbstractC7043e mo27588a(AbstractC6949c cVar) {
        C7008a aVar;
        C7086a b = mo27591b(cVar);
        PreviewMeta a = mo27584a(b);
        if (a != null) {
            aVar = mo27585a(b, a);
        } else {
            aVar = C7067e.m28107a(this.f18972a).mo26542a(new PreviewGetV1Puller.Params(b.mo27322a().f18785a, b.mo27322a().f19094m, b.mo27322a().f19095n, b.mo27329c(), false, b.mo27322a().f19097p, b.mo27322a().mo27363f())).mo238023d();
        }
        return mo27589a(aVar, b);
    }

    /* renamed from: a */
    public AbstractC7043e mo27589a(final C7008a aVar, final C7086a aVar2) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC7043e<C7008a>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a.C70282 */

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: a */
            public int mo27603a() {
                return aVar.mo27542a();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: b */
            public boolean mo27604b() {
                return aVar.mo27545d();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: c */
            public String mo27605c() {
                return C7046h.m28055a(aVar2);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: d */
            public String mo27606d() {
                return C7046h.m28059b(aVar2);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: e */
            public long mo27607e() {
                return aVar.mo27546e();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: g */
            public String mo27609g() {
                return aVar.mo27547f();
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e
            /* renamed from: f */
            public Map<String, String> mo27608f() {
                C7007a c = aVar.mo27544c();
                if (c == null) {
                    return null;
                }
                return C7046h.m28058a(c.mo27540a(), aVar2);
            }
        };
    }

    /* renamed from: a */
    public C7008a mo27585a(C7086a aVar, PreviewMeta previewMeta) {
        C7007a aVar2;
        PreviewMeta.Content content = previewMeta.getContent();
        if (content == null) {
            aVar2 = C7007a.f18937a;
        } else {
            aVar2 = new C7007a(content.type, content.transcodeUrls);
        }
        return new C7008a(aVar.mo27322a().f18785a, aVar.mo27322a().f19094m, aVar.mo27322a().f19095n, aVar.mo27329c(), aVar.mo27322a().f19097p, previewMeta.getStatus(), previewMeta.getInterval(), previewMeta.getLongPushRetryInterval(), aVar2, previewMeta.isLinearized(), previewMeta.getPreviewFileSize(), previewMeta.getExtra());
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: a */
    public String mo27590a(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority) {
        C7086a b = mo27591b(cVar);
        return C7045g.m28049a(b.mo27340g(), b.mo27343j(), downloadPriority, b.mo27322a().f19098q, b.mo27322a().f18787c, b.mo27322a().mo27363f(), downloadCallback);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: b */
    public String mo27592b(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority) {
        C7086a b = mo27591b(cVar);
        return C7045g.m28050a(b.mo27343j(), b.mo27322a().f18785a, b.mo27322a().f19094m, b.mo27322a().f19095n, downloadPriority, b.mo27322a().f19098q, false, b.mo27322a().mo27363f(), downloadCallback);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c
    /* renamed from: c */
    public String mo27594c(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority) {
        C7086a b = mo27591b(cVar);
        return C7045g.m28050a(b.mo27343j(), b.mo27322a().f18785a, b.mo27322a().f19094m, b.mo27322a().f19095n, downloadPriority, b.mo27322a().f19098q, true, b.mo27322a().mo27363f(), downloadCallback);
    }
}
