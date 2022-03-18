package com.ss.android.lark.integrator.ccm.p2006c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.attachment.filereader.FileClickData;
import com.bytedance.ee.bear.attachment.filereader.FileReaderUtil;
import com.bytedance.ee.bear.basesdk.AbstractC4482e;
import com.bytedance.ee.bear.basesdk.api.AbstractC4382g;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.dto.DocAppUserConfig;
import com.bytedance.ee.bear.integrator.cookies.C7918a;
import com.bytedance.ee.bear.integrator.cookies.SessionInfo;
import com.bytedance.ee.bear.integrator.dto.C7925a;
import com.bytedance.ee.bear.integrator.dto.DocConvertToken;
import com.bytedance.ee.bear.integrator.dto.FileClickModel;
import com.bytedance.ee.bear.lark.notification.docfeed.AbstractC8055g;
import com.bytedance.ee.bear.lark.notification.docfeed.C8045a;
import com.bytedance.ee.bear.lark.notification.docfeed.C8056h;
import com.bytedance.ee.bear.lark.p414b.AbstractC7988a;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.lark.p414b.AbstractC8008q;
import com.bytedance.ee.bear.lark.p417e.C8034b;
import com.bytedance.ee.bear.lark.p421h.C8043a;
import com.bytedance.ee.bear.lark.selector.C8117c;
import com.bytedance.ee.bear.lark.selector.DocModuleInner;
import com.bytedance.ee.bear.lark.selector.auth.AbstractC8084c;
import com.bytedance.ee.bear.lark.selector.auth.C8080b;
import com.bytedance.ee.bear.p391g.C7804b;
import com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.C10934g;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13628h;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p719u.C13752b;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.space.doc.v1.CreateDocFeedRequest;
import com.bytedance.lark.pb.space.doc.v1.CreateDocFeedResponse;
import com.bytedance.lark.pb.space.doc.v1.GetConvertTokenRequest;
import com.bytedance.lark.pb.space.doc.v1.GetConvertTokenResponse;
import com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsRequest;
import com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1191f.C26005c;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.ccm_api.AbstractC32803a;
import com.ss.android.lark.ccm_api.SpacekitConst;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.doc.entity.AbstractC36839d;
import com.ss.android.lark.doc.entity.C36836a;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.ccm.config.diskmanage.CCMDiskCleanTask;
import com.ss.android.lark.integrator.ccm.config.p2007a.C39254b;
import com.ss.android.lark.integrator.ccm.config.p2008b.C39255a;
import com.ss.android.lark.integrator.ccm.config.p2008b.C39257b;
import com.ss.android.lark.integrator.ccm.config.p2011e.C39263a;
import com.ss.android.lark.integrator.ccm.config.p2012f.C39264a;
import com.ss.android.lark.integrator.ccm.config.p2013g.C39267a;
import com.ss.android.lark.integrator.ccm.config.viewbinder.DocCardViewBinder;
import com.ss.android.lark.integrator.ccm.dependency.C39347d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.preload.AbstractC52220a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.ss.android.lark.integrator.ccm.c.e */
public final class C39242e {

    /* renamed from: a */
    private final C39240d f100553a;

    /* renamed from: b */
    private final List<AbstractC4482e> f100554b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.ccm.c.e$a */
    public static class C39252a {

        /* renamed from: a */
        static C39242e f100579a = new C39242e();
    }

    /* renamed from: a */
    public void mo143088a(AbstractC44552i iVar, boolean z) {
    }

    /* renamed from: h */
    public String mo143118h() {
        return "space";
    }

    /* renamed from: a */
    public static C39242e m154771a() {
        return C39252a.f100579a;
    }

    /* renamed from: j */
    public static List<AbstractC28490a> m154778j() {
        return C39254b.f100580a;
    }

    /* renamed from: a */
    public void mo143080a(Context context, int i) {
        C53241h.m205898b("SpacekitSdkWrapper", "DocsImpl.preloadDocSdk ");
        this.f100553a.mo143070a(m154779n(), i);
    }

    /* renamed from: a */
    public void mo143079a(Context context) {
        if (C37239a.m146648b().mo136952a("spacekit.mobile.docs_services_tokencenter_ctrl", true)) {
            Log.m165389i("SpacekitSdkWrapper", "setting TokenCenterMonitor");
            if (C26252ad.m94993b(context)) {
                Log.m165389i("SpacekitSdkWrapper", "setting TokenCenterMonitor isInMainProcess");
                C10934g.m45449a(new C10934g.AbstractC10936a() {
                    /* class com.ss.android.lark.integrator.ccm.p2006c.$$Lambda$e$_Yhk6xEBfwpnjwGCLYH9VshK8 */

                    @Override // com.bytedance.ee.bear.service.C10934g.AbstractC10936a
                    public final void onQuery() {
                        C39242e.this.m154781p();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public boolean mo143095a(String str) {
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi.getAccountManager() == null || !iPassportApi.isLogin()) {
            return false;
        }
        return C7804b.m31283a().mo17142i().mo17048a(C36882a.m145557a(iPassportApi.getTenantCode()), DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_API), str);
    }

    /* renamed from: a */
    public boolean mo143097a(String str, Map<String, String> map) {
        if (!mo143095a(str)) {
            return false;
        }
        return C7804b.m31283a().mo17142i().mo17049a(m154775c(str), map);
    }

    /* renamed from: a */
    public boolean mo143096a(String str, String str2, Map<String, String> map) {
        return mo143097a(mo143077a(str, str2), map);
    }

    /* renamed from: a */
    public boolean mo143094a(Context context, String str, String str2, Map<String, String> map) {
        String a = mo143077a(str, str2);
        if (!mo143095a(a)) {
            return false;
        }
        return C7804b.m31283a().mo17142i().mo17046a(context, m154775c(a), map);
    }

    /* renamed from: a */
    public boolean mo143093a(Context context, String str, int i, int i2, Map<String, String> map) {
        if (!mo143095a(str)) {
            return false;
        }
        return C7804b.m31283a().mo17142i().mo17045a(context, m154775c(str), i, i2, map);
    }

    /* renamed from: a */
    public void mo143091a(final List<String> list) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.RunnableC392431 */

            public void run() {
                C7804b.m31283a().mo17142i().mo17044a(list);
            }
        });
    }

    /* renamed from: a */
    public void mo143078a(int i) {
        C53241h.m205898b("SpacekitSdkWrapper", "DocsImpl.onLoginStatusChangedEvent, event: " + i);
        boolean a = C13628h.m55294a(m154779n());
        C53241h.m205898b("SpacekitSdkWrapper", "isP0ProcessExist " + a + " inP0Process " + C13629i.m55308c());
        if (i == SpacekitConst.LoginEvent.Login.ordinal()) {
            if (a) {
                this.f100553a.mo143070a(m154779n(), 0);
            }
            C4211a.m17514a().mo16539c();
            if (C26252ad.m94993b(LarkContext.getApplication())) {
                C4211a.m17514a().mo16537b();
                if (C7804b.m31285c()) {
                    mo143113d();
                }
            }
        }
        if ((a || mo143122m()) && C7804b.m31285c()) {
            C53241h.m205898b("SpacekitSdkWrapper", "LarkSpacekitSdk fully initiated, flow the event");
            C7804b.m31283a().mo17136c().mo17017a(i);
        }
    }

    /* renamed from: a */
    public void mo143087a(final AbstractC32803a aVar) {
        C7804b.m31283a().mo17142i().mo17043a(new AbstractC4382g.AbstractC4383a() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392475 */

            @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g.AbstractC4383a
            /* renamed from: a */
            public void mo17052a(WebView webView) {
                AbstractC32803a aVar = aVar;
                if (aVar != null) {
                    aVar.mo102651a(webView);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo143083a(AbstractC4482e eVar) {
        if (!this.f100554b.contains(eVar)) {
            this.f100554b.add(eVar);
        }
    }

    /* renamed from: a */
    public void mo143086a(final IGetDataCallback<Long> iGetDataCallback) {
        if (iGetDataCallback != null) {
            final long[] jArr = {0};
            C7804b.m31283a().mo17138e().mo17025b().mo237985a(LarkRxSchedulers.io()).mo237978a(new Consumer<Long>() {
                /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392486 */

                /* renamed from: a */
                public void accept(Long l) throws Exception {
                    long[] jArr = jArr;
                    jArr[0] = jArr[0] + l.longValue();
                }
            }, new Consumer<Throwable>() {
                /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392497 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    iGetDataCallback.onError(new ErrorResult(new Exception(th)));
                }
            }, new AbstractC68309a() {
                /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392508 */

                @Override // io.reactivex.functions.AbstractC68309a
                public void run() throws Exception {
                    iGetDataCallback.onSuccess(Long.valueOf(jArr[0]));
                }
            });
        }
    }

    /* renamed from: b */
    public void mo143106b(final IGetDataCallback<Boolean> iGetDataCallback) {
        final boolean[] zArr = {false};
        C7804b.m31283a().mo17138e().mo17024a().mo237985a(LarkRxSchedulers.io()).mo237978a(new Consumer<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392519 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                boolean z;
                boolean[] zArr = zArr;
                if (zArr[0] || bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[0] = z;
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.AnonymousClass10 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult(new Exception(th)));
                }
            }
        }, new AbstractC68309a() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.AnonymousClass11 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() throws Exception {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(zArr[0]));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo143085a(C8043a aVar) {
        C53241h.m205898b("SpacekitSdkWrapper", "DocsImpl.loadThumbnail ");
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.$$Lambda$e$ACXmpMbbIm6kTdVSOCVHYBzSyg */

            public final void run() {
                C39242e.m154774b(C8043a.this);
            }
        });
    }

    /* renamed from: a */
    public boolean mo143092a(Context context, C7925a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f21313a)) {
            C53241h.m205898b("SpacekitSdkWrapper", "params invalid");
            return false;
        }
        AbstractC4385i k = C7804b.m31283a().mo17144k();
        String str = aVar.f21313a;
        int lastIndexOf = str.lastIndexOf("/") + 1;
        String substring = lastIndexOf < str.length() ? str.substring(lastIndexOf) : "";
        k.mo17058a(context, new LocalOpenEntity(aVar.f21315c, substring, aVar.f21316d, substring, aVar.f21314b, aVar.f21317e, aVar.f21313a));
        return true;
    }

    /* renamed from: a */
    public void mo143090a(String str, DocType docType, IGetDataCallback<C36836a> iGetDataCallback) {
        Doc.Type type;
        CreateDocFeedRequest.C19235a aVar = new CreateDocFeedRequest.C19235a();
        if (docType == null) {
            type = Doc.Type.DOC;
        } else {
            type = Doc.Type.fromValue(docType.getNumber());
        }
        SdkSender.asynSendRequestNonWrap(Command.CREATE_DOC_FEED, aVar.mo65656a(type).mo65657a(str), iGetDataCallback, new SdkSender.IParser<C36836a>() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.AnonymousClass12 */

            /* renamed from: a */
            public C36836a parse(byte[] bArr) throws IOException {
                return C8056h.m32195a(CreateDocFeedResponse.ADAPTER.decode(bArr).entity);
            }
        });
    }

    /* renamed from: a */
    public void mo143089a(final String str, final IGetDataCallback<DocFeed> iGetDataCallback) {
        m154773a(Collections.singletonList(str), new IGetDataCallback<C36836a>() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392442 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(C36836a aVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(aVar.mo135951a().get(str));
                }
            }
        });
    }

    /* renamed from: b */
    public void mo143107b(String str, IGetDataCallback<DocConvertToken> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_ONLINE_DOC_TOKEN, new GetConvertTokenRequest.C19247a().mo65688a(str), iGetDataCallback, new SdkSender.IParser<DocConvertToken>() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392453 */

            /* renamed from: a */
            public DocConvertToken parse(byte[] bArr) throws IOException {
                GetConvertTokenResponse decode = GetConvertTokenResponse.ADAPTER.decode(bArr);
                return new DocConvertToken(decode.token, decode.chat_token);
            }
        });
    }

    /* renamed from: a */
    public void mo143081a(Context context, int i, String str, int i2, String str2) {
        C8117c.m32408a((Activity) context, i, str, i2, str2);
    }

    /* renamed from: b */
    public String[] mo143108b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String b = C7804b.m31283a().mo17142i().mo17050b(str);
        return new String[]{C7804b.m31283a().mo17142i().mo17040a(str), b};
    }

    /* renamed from: a */
    public void mo143084a(FileClickModel fileClickModel, String str) {
        FileClickData fileClickData = new FileClickData();
        fileClickData.setFile_id(fileClickModel.getFile_id());
        fileClickData.setDrive_file_key(fileClickModel.getDrive_file_key());
        fileClickData.setFile_mime_type(fileClickModel.getFile_mime_type());
        fileClickData.setFile_name(fileClickModel.getFile_name());
        fileClickData.setFile_size(fileClickModel.getFile_size());
        fileClickData.setMount_node_token(fileClickModel.getMount_node_token());
        fileClickData.setMount_point(fileClickModel.getMount_point());
        fileClickData.setDownLoadPath(fileClickModel.getDownLoadPath());
        fileClickData.setType(fileClickModel.getType());
        FileReaderUtil.f12887i.mo16887a(str, fileClickData, new C10917c(new C10929e()));
    }

    /* renamed from: a */
    public void mo143082a(Context context, Map<String, Map<String, DocResult>> map, AbstractC8084c cVar) {
        C8080b.m32335a(context, map, cVar);
    }

    /* renamed from: n */
    private Application m154779n() {
        return LarkContext.getApplication();
    }

    /* renamed from: i */
    public AbstractC8055g mo143119i() {
        return C8056h.m32190a();
    }

    /* renamed from: k */
    public IDiskCleanTask mo143120k() {
        return new CCMDiskCleanTask();
    }

    /* renamed from: l */
    public void mo143121l() {
        C4211a.m17514a().mo16537b();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m154781p() {
        Log.m165389i("SpacekitSdkWrapper", "TokenCenterMonitor checkAndInit");
        mo143103b();
    }

    /* renamed from: g */
    public List<AbstractNotification> mo143117g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8045a());
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo143122m() {
        return ((AbstractC8008q) KoinJavaComponent.m268610a(AbstractC8008q.class)).mo31022a();
    }

    private C39242e() {
        this.f100553a = new C39240d();
        this.f100554b = new CopyOnWriteArrayList();
        C13615c.f35773a = LarkContext.getApplication();
    }

    /* renamed from: c */
    public List<AbstractC52220a> mo143110c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C39263a());
        return arrayList;
    }

    /* renamed from: d */
    public void mo143113d() {
        C53241h.m205898b("SpacekitSdkWrapper", "DocsImpl.trySetAccountInfo ");
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi.getAccountManager() != null) {
            String session = iPassportApi.getSession();
            Map<String, SessionInfo> o = m154780o();
            if (TextUtils.isEmpty(session)) {
                C53241h.m205894a("SpacekitSdkWrapper", "set account info fail due to session is null");
                return;
            }
            if (o == null) {
                C53241h.m205894a("SpacekitSdkWrapper", "set account info fail due to cross boundary sessions is null");
                o = new HashMap<>();
            }
            m154777d(session, o);
        }
    }

    /* renamed from: e */
    public void mo143115e() {
        C53241h.m205898b("SpacekitSdkWrapper", "DocsImpl.injectSessionCookies ");
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi.getAccountManager() != null) {
            String session = iPassportApi.getSession();
            if (!TextUtils.isEmpty(session)) {
                m154776d(session);
            }
        }
    }

    /* renamed from: f */
    public void mo143116f() {
        for (AbstractC4482e eVar : this.f100554b) {
            try {
                eVar.onInit();
            } catch (Exception e) {
                if (!C26284k.m95185a(LarkContext.getApplication())) {
                    C53241h.m205895a("SpacekitSdkWrapper", "dispatchInited", e);
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: o */
    private Map<String, SessionInfo> m154780o() {
        Map<String, com.ss.android.lark.passport.signinsdk_api.account.SessionInfo> sessions = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSessions();
        HashMap hashMap = new HashMap(sessions.size());
        for (String str : sessions.keySet()) {
            com.ss.android.lark.passport.signinsdk_api.account.SessionInfo sessionInfo = sessions.get(str);
            if (sessionInfo != null) {
                hashMap.put(str, new SessionInfo(sessionInfo.getHostUrl(), sessionInfo.getSessionName(), sessionInfo.getSession()));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public void mo143103b() {
        C53241h.m205898b("SpacekitSdkWrapper", "DocsImpl.checkAndInit ");
        this.f100553a.mo143070a(m154779n(), 0);
    }

    /* renamed from: c */
    public void mo143111c(Context context) {
        C39264a.m154868a(context);
    }

    /* renamed from: a */
    public int mo143072a(DocType docType) {
        return DocModuleInner.m32272b(docType);
    }

    /* renamed from: b */
    public int mo143098b(DocType docType) {
        return DocModuleInner.m32268a(docType);
    }

    /* renamed from: d */
    public AbstractC36839d mo143112d(Context context) {
        return new DocCardViewBinder(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m154774b(C8043a aVar) {
        C7804b.m31283a().mo17139f().mo17028a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C36836a m154770a(byte[] bArr) throws IOException {
        C14928Entity entity;
        MGetDocFeedsResponse decode = MGetDocFeedsResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            C53241h.m205894a("SpacekitSdkWrapper", "response == null");
            entity = null;
        } else {
            entity = decode.entity;
        }
        return C8056h.m32195a(entity);
    }

    /* renamed from: c */
    private String m154775c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("lang", ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getOnlyLanguage());
        return C13752b.m55767a(str, linkedHashMap, false);
    }

    /* renamed from: d */
    private void m154776d(String str) {
        if (C7804b.m31285c()) {
            C7804b.m31283a().mo17136c().mo17019a(str);
        }
    }

    /* renamed from: e */
    public Map<String, AbstractC29186b> mo143114e(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/docs/open", new C39255a());
        hashMap.put("/client/docs/template", new C39257b());
        return hashMap;
    }

    /* renamed from: a */
    private void m154772a(DocAppUserConfig docAppUserConfig) {
        if (C7804b.m31285c()) {
            if (docAppUserConfig.getUrlRegex().isEmpty()) {
                C53241h.m205898b("SpacekitSdkWrapper", "update url regex fail url regex is empty");
            }
            C7804b.m31283a().mo17143j().mo17054a(docAppUserConfig.getUrlRegex());
            Log.m165389i("SpacekitSdkWrapper", "update url regex success");
        }
    }

    /* renamed from: b */
    public C36836a mo143100b(List<String> list) {
        C36836a aVar = (C36836a) SdkSender.sendRequest(Command.MGET_DOC_FEEDS, new MGetDocFeedsRequest.C19269a().mo65737a(list), $$Lambda$e$ByXXhctn53EMHd4DsjYcjpJR4.INSTANCE);
        if (aVar != null) {
            return new C36836a(aVar.mo135951a(), aVar.mo135953b());
        }
        C53241h.m205900d("SpacekitSdkWrapper", "syncPullDocFeedsByIds() docFeedsResult is null");
        return new C36836a(new HashMap(), new HashMap());
    }

    /* renamed from: b */
    public void mo143104b(Context context) {
        context.stopService(new Intent(context, KeepAliveService.class));
    }

    /* renamed from: b */
    public void mo143105b(AbstractC4482e eVar) {
        this.f100554b.remove(eVar);
    }

    /* renamed from: a */
    public int mo143073a(DocType docType, int i) {
        return DocModuleInner.m32269a(docType, i);
    }

    /* renamed from: c */
    public String mo143109c(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        return C13752b.m55767a(str, map, true);
    }

    /* renamed from: b */
    public int mo143099b(DocType docType, String str) {
        return DocModuleInner.m32273b(docType, str);
    }

    /* renamed from: a */
    private void m154773a(List<String> list, IGetDataCallback<C36836a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_DOC_FEEDS, new MGetDocFeedsRequest.C19269a().mo65737a(list), iGetDataCallback, new SdkSender.IParser<C36836a>() {
            /* class com.ss.android.lark.integrator.ccm.p2006c.C39242e.C392464 */

            /* renamed from: a */
            public C36836a parse(byte[] bArr) throws IOException {
                return C8056h.m32195a(MGetDocFeedsResponse.ADAPTER.decode(bArr).entity);
            }
        });
    }

    /* renamed from: b */
    public String mo143101b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("from", str2);
        return mo143109c(str, hashMap);
    }

    /* renamed from: d */
    private void m154777d(String str, Map<String, SessionInfo> map) {
        AbstractC7993f fVar = (AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class);
        String c = ((AbstractC7988a) KoinJavaComponent.m268610a(AbstractC7988a.class)).mo30980c();
        if (C7804b.m31285c()) {
            C7804b.m31283a().mo17136c().mo17018a(C39347d.m155095a());
        }
        String c2 = fVar.mo30991c(c);
        String b = C26005c.m94127b(c2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        arrayList.add(fVar.mo30988b());
        if (!C26252ad.m94993b(m154779n())) {
            DocAppUserConfig d = fVar.mo30992d();
            C7918a.m31655a(c2, str, arrayList, d.getDocDomains());
            C7918a.m31656a(c2, map);
            m154772a(d);
            return;
        }
        DocAppUserConfig c3 = fVar.mo30990c();
        if (c3 == null) {
            C7918a.m31654a(c2, str, arrayList);
        } else {
            C7918a.m31655a(c2, str, arrayList, c3.getDocDomains());
            m154772a(c3);
        }
        if (C7804b.m31285c()) {
            C7804b.m31283a().mo17143j().mo17053a(DynamicConfigModule.m145551a(DomainSettings.Alias.PASSPORT));
        }
    }

    /* renamed from: a */
    public int mo143074a(DocType docType, String str) {
        return DocModuleInner.m32271a(docType, str);
    }

    /* renamed from: b */
    public String mo143102b(String str, Map<String, String> map) {
        return C13752b.m55766a(str, map);
    }

    /* renamed from: a */
    public IPlusItem mo143075a(Context context, Chat chat) {
        if (chat.isCrossTenant()) {
            return null;
        }
        return new C8034b(context, chat);
    }

    /* renamed from: a */
    public String mo143077a(String str, String str2) {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str2)) {
            hashMap = new HashMap();
            hashMap.put("docId", str2);
        } else {
            hashMap = null;
        }
        return C13752b.m55766a(str, hashMap);
    }

    /* renamed from: a */
    public AbstractC44552i mo143076a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return new C39267a(context, eVar, iTitleController);
    }
}
