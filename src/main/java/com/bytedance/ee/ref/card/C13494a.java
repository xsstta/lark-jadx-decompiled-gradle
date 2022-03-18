package com.bytedance.ee.ref.card;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.C13518b;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.meta.CardMetaFetcher;
import com.bytedance.ee.ref.card.p686a.AbstractC13508d;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.bytedance.ee.ref.card.p690e.C13532a;
import com.bytedance.ee.ref.card.p690e.C13537b;
import com.bytedance.ee.ref.card.p691f.C13543b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.C67738a;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import com.tt.refer.common.p3417c.C67751c;
import com.tt.refer.common.pkg.AbstractC67826d;
import com.tt.refer.common.pkg.AbstractC67827e;
import com.tt.refer.common.pkg.PackageEntity;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.a */
public class C13494a {

    /* renamed from: a */
    protected IAppContext f35547a;

    /* renamed from: b */
    protected CardMetaFetcher f35548b;

    /* renamed from: c */
    public C13543b f35549c;

    /* renamed from: d */
    protected AbstractC13508d.AbstractC13509a f35550d;

    /* renamed from: com.bytedance.ee.ref.card.a$a */
    public interface AbstractC13499a {
        /* renamed from: a */
        void mo50221a(CardAppInfo cardAppInfo);

        /* renamed from: a */
        void mo50222a(byte[] bArr);
    }

    /* renamed from: a */
    public AbstractC13508d.AbstractC13509a mo50201a() {
        return this.f35550d;
    }

    public C13494a(IAppContext iAppContext) {
        this.f35547a = iAppContext;
        this.f35548b = new CardMetaFetcher(iAppContext);
        this.f35549c = new C13543b(iAppContext);
    }

    /* renamed from: a */
    public PackageEntity mo50202a(CardAppInfo cardAppInfo) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setAppId(cardAppInfo.getAppId());
        packageEntity.setIdentifier(cardAppInfo.getIdentifier());
        packageEntity.setPackageName(cardAppInfo.getAppVersion());
        packageEntity.setUrls(cardAppInfo.mo50325e());
        packageEntity.setMd5(cardAppInfo.mo50323d());
        packageEntity.setJsonMeta(cardAppInfo.toString());
        return packageEntity;
    }

    /* renamed from: a */
    public void mo50208a(AbstractC13508d.AbstractC13509a aVar) {
        this.f35550d = aVar;
    }

    /* renamed from: a */
    public void mo50204a(Context context, C13523c.C13524a aVar, AbstractC67788b.AbstractC67792b bVar) {
        this.f35548b.mo235274a(context, aVar, 1, bVar);
    }

    /* renamed from: a */
    public void mo50203a(Context context, final C13523c.C13524a aVar, final AbstractC13499a aVar2) {
        new C67738a(this.f35548b, this.f35547a).mo235104a(context, (AbsMetaLoadEntity) aVar, 0, (C67738a.AbstractC67742a) new C67738a.AbstractC67742a<CardAppInfo>() {
            /* class com.bytedance.ee.ref.card.C13494a.C134951 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
                if (DebugUtil.debug()) {
                    AppBrandLogger.m52828d("card_app_start_load_launch", "downloading card info:", aVar);
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
                AppBrandLogger.m52830i("card_app_start_load_launch", "card is download success!card id is:", aVar.getIdentifier(), "requestType:", Integer.valueOf(i), "fromLocal:", Boolean.valueOf(z));
                new C13537b("op_app_card_package_download", C13532a.f35627g, C13494a.this.f35547a).mo50290a(aVar).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeSuccess().flush();
            }

            /* renamed from: a */
            public void onRequestAppMetaSuccess(int i, CardAppInfo cardAppInfo) {
                AppBrandLogger.m52830i("card_app_start_load_launch", "loadTemplateByCardEntity->requestAppMetaSuccess>>appId:", cardAppInfo.getAppId(), "cardId", cardAppInfo.getIdentifier());
                if (cardAppInfo.getMetaSource() == 2) {
                    new C13537b("op_app_card_meta_request", C13532a.f35622b, C13494a.this.f35547a).mo50291a(cardAppInfo).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeSuccess().flush();
                }
                if (i == 0) {
                    AppBrandLogger.m52830i("card_app_start_load_launch", "loadTemplateByCardEntity->requestAppMetaSuccess->requestType is normal!");
                    AbstractC13499a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo50221a(cardAppInfo);
                    }
                    if (C13494a.this.f35550d != null) {
                        C13494a.this.f35550d.mo50258a(cardAppInfo);
                    }
                    AbstractC67796c cVar = (AbstractC67796c) C13494a.this.f35547a.findServiceByInterface(AbstractC67796c.class);
                    if (cVar != null) {
                        cVar.mo88671a(cardAppInfo);
                        return;
                    }
                    return;
                }
                AppBrandLogger.m52830i("card_app_start_load_launch", "loadTemplateByCardEntity->requestAppMetaSuccess->requestType is not normal!>>", Integer.valueOf(i));
            }

            /* renamed from: a */
            public void onAppMetaInvalid(int i, CardAppInfo cardAppInfo, int i2) {
                if (C13494a.this.f35550d != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("invalidType", i2);
                    } catch (JSONException unused) {
                        AppBrandLogger.m52830i("card_app_start_load_launch", "new invalidType json fail!");
                    }
                    AbstractC13508d.AbstractC13509a aVar = C13494a.this.f35550d;
                    aVar.mo50260a("card app info is invalid:" + i2 + "meta info:" + cardAppInfo + "requestType:" + i, jSONObject);
                }
                new C13537b("op_app_card_meta_request", C13532a.f35623c, C13494a.this.f35547a).mo50291a(cardAppInfo).addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("invalid_type", Integer.valueOf(i2)).setResultTypeFail().setErrorMessage("card app info is invalid!").flush();
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaFail(int i, String str, String str2) {
                AppBrandLogger.m52829e("card_app_start_load_launch", "requestAppMetaFail>>EntityInfo:" + aVar + " requestType:" + C67751c.m263613a(i) + " code:" + str + " errorMsg:" + str2);
                if (C13494a.this.f35550d != null && i == 0) {
                    C13494a.this.f35550d.mo50260a(str2, new Object[0]);
                }
                new C13537b("op_app_card_meta_request", C13532a.f35621a, C13494a.this.f35547a).mo50290a(aVar).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeFail().setErrorCode(str).setErrorMessage(str2).flush();
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                AppBrandLogger.m52829e("card_app_start_load_launch", "card download failed,cardId:", aVar.getIdentifier(), "requestType", C67751c.m263613a(i), "errorMsg:", str2);
                if (i == 0 && C13494a.this.f35550d != null) {
                    C13494a.this.f35550d.mo50260a(str2, new Object[0]);
                }
                if (str.startsWith("10")) {
                    new C13537b("op_app_card_package_download", C13532a.f35626f, C13494a.this.f35547a).mo50290a(aVar).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeFail().setErrorMessage(str2).flush();
                } else {
                    new C13537b("op_app_card_package_install", C13532a.f35628h, C13494a.this.f35547a).mo50290a(aVar).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeFail().setErrorMessage(str2).setErrorCode(str).flush();
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(int i, String str, String str2) {
                AppBrandLogger.m52830i("card_app_start_load_launch", "card install success! cardId is", aVar.getIdentifier(), "installPath:", str, "requestType:", Integer.valueOf(i));
                if (i == 0) {
                    byte[] readBytes = IOUtils.readBytes(new File(str, "template.js").getAbsolutePath());
                    AbstractC13499a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo50222a(readBytes);
                    }
                    if (C13494a.this.f35550d != null) {
                        C13494a.this.f35550d.mo50259a(IOUtils.readString(new File(str, "card.config.json").getAbsolutePath(), "utf-8"));
                    }
                }
                new C13537b("op_app_card_package_install", C13532a.f35629i, C13494a.this.f35547a).mo50290a(aVar).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeSuccess().flush();
            }
        }, false);
    }

    /* renamed from: a */
    public void mo50207a(final Context context, final List<C13523c.C13524a> list, final C13518b.AbstractC13520a aVar) {
        this.f35548b.mo50335a(context, list, new CardMetaFetcher.AbstractC13549a() {
            /* class com.bytedance.ee.ref.card.C13494a.C134984 */

            @Override // com.bytedance.ee.ref.card.meta.CardMetaFetcher.AbstractC13549a
            /* renamed from: a */
            public void mo50220a(List<CardAppInfo> list) {
                new C13537b("op_app_card_meta_request_batch", C13532a.f35625e, C13494a.this.f35547a).mo50293a(list).addCategoryValue("load_type", C67751c.m263613a(2)).setResultTypeSuccess().flush();
                C13518b.AbstractC13520a aVar = aVar;
                if (aVar != null) {
                    aVar.mo50274a(list);
                }
                for (CardAppInfo cardAppInfo : list) {
                    if (cardAppInfo != null) {
                        PackageEntity a = C13494a.this.mo50202a(cardAppInfo);
                        if (!C13494a.this.f35549c.mo50305b(context, a)) {
                            C13494a.this.mo50205a(context, a, 2, null);
                        } else {
                            AppBrandLogger.m52830i("card_app_start_load_launch", "preInstallCards>>card is already install! ", a);
                        }
                    }
                }
            }

            @Override // com.bytedance.ee.ref.card.meta.CardMetaFetcher.AbstractC13549a
            /* renamed from: a */
            public void mo50219a(String str, String str2) {
                AppBrandLogger.m52829e("card_app_start_load_launch", "preInstallCards>>onRequestAppMetaFail -> code:", str, "errorMsg:", str2);
                new C13537b("op_app_card_meta_request_batch", C13532a.f35624d, C13494a.this.f35547a).mo50295b(list).addCategoryValue("load_type", C67751c.m263613a(2)).setResultTypeFail().setErrorCode(str).setErrorMessage(str2).flush();
            }
        });
    }

    /* renamed from: a */
    public void mo50205a(final Context context, final PackageEntity packageEntity, final int i, final AbstractC13499a aVar) {
        int i2;
        if (i == 0) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        this.f35549c.mo50303a(context, packageEntity, i2, new AbstractC67826d() {
            /* class com.bytedance.ee.ref.card.C13494a.C134962 */

            @Override // com.tt.refer.common.pkg.AbstractC67826d
            /* renamed from: a */
            public void mo50215a(String str) {
                AppBrandLogger.m52830i("card_app_start_load_launch", "card is download success!card id is:", packageEntity.getIdentifier(), "requestType:", Integer.valueOf(i));
                ((IAppMetaService) C13494a.this.f35547a.findServiceByInterface(IAppMetaService.class)).mo235256a(context, packageEntity.getIdentifier(), packageEntity.getPackageName());
                C13494a.this.mo50206a(context, str, packageEntity, i, aVar);
                new C13537b("op_app_card_package_download", C13532a.f35627g, C13494a.this.f35547a).mo50292a(packageEntity).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeSuccess().flush();
            }

            @Override // com.tt.refer.common.pkg.AbstractC67826d
            /* renamed from: b */
            public void mo50216b(String str) {
                AppBrandLogger.m52829e("card_app_start_load_launch", "card download failed,cardId:", packageEntity.getIdentifier(), "requestType", C67751c.m263613a(i));
                if (i == 0 && C13494a.this.f35550d != null) {
                    C13494a.this.f35550d.mo50260a(str, new Object[0]);
                }
                new C13537b("op_app_card_package_download", C13532a.f35626f, C13494a.this.f35547a).mo50292a(packageEntity).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeFail().setErrorMessage(str).flush();
            }

            @Override // com.tt.refer.common.pkg.AbstractC67826d
            /* renamed from: a */
            public void mo50214a(long j, long j2, String str) {
                if (DebugUtil.debug()) {
                    AppBrandLogger.m52828d("card_app_start_load_launch", "downloading card info:", packageEntity);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo50206a(Context context, String str, final PackageEntity packageEntity, final int i, final AbstractC13499a aVar) {
        this.f35549c.mo50304a(context, packageEntity, str, new AbstractC67827e() {
            /* class com.bytedance.ee.ref.card.C13494a.C134973 */

            @Override // com.tt.refer.common.pkg.AbstractC67827e
            /* renamed from: a */
            public void mo50217a(String str) {
                AppBrandLogger.m52830i("card_app_start_load_launch", "card install success! cardId is", packageEntity.getIdentifier(), "installPath:", str, "requestType:", Integer.valueOf(i));
                if (i == 0) {
                    byte[] readBytes = IOUtils.readBytes(new File(str, "template.js").getAbsolutePath());
                    AbstractC13499a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo50222a(readBytes);
                    }
                    if (C13494a.this.f35550d != null) {
                        C13494a.this.f35550d.mo50259a(new String(IOUtils.readString(new File(str, "card.config.json").getAbsolutePath(), "utf-8")));
                    }
                }
                new C13537b("op_app_card_package_install", C13532a.f35629i, C13494a.this.f35547a).mo50292a(packageEntity).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeSuccess().flush();
            }

            @Override // com.tt.refer.common.pkg.AbstractC67827e
            /* renamed from: a */
            public void mo50218a(String str, String str2) {
                AppBrandLogger.m52830i("card_app_start_load_launch", "card install fail!", str2, "card info:", packageEntity, " requestType:", C67751c.m263613a(i));
                if (i == 0 && C13494a.this.f35550d != null) {
                    C13494a.this.f35550d.mo50260a(str2, new Object[0]);
                }
                new C13537b("op_app_card_package_install", C13532a.f35628h, C13494a.this.f35547a).mo50292a(packageEntity).addCategoryValue("load_type", C67751c.m263613a(i)).setResultTypeFail().setErrorMessage(str2).setErrorCode(str).flush();
            }
        });
    }
}
