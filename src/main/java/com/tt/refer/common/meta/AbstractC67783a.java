package com.tt.refer.common.meta;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.appinfo.C66411c;
import com.tt.miniapp.manager.appinfo.C66412d;
import com.tt.miniapp.settings.v2.handler.C66777i;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import com.tt.refer.common.meta.fetch.AbstractC67799c;
import com.tt.refer.common.meta.fetch.AbstractC67802f;
import com.tt.refer.common.meta.fetch.C67803g;
import com.tt.refer.common.meta.fetch.C67805h;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.refer.common.meta.a */
public abstract class AbstractC67783a<T extends AbsAppMeta, E extends AbsMetaLoadEntity> implements IAppMetaService<T, E> {

    /* renamed from: a */
    public static String f170712a = "app_start_load_meta_service";

    /* renamed from: b */
    public IMonitorCreator f170713b;

    /* renamed from: c */
    protected ConcurrentHashMap<String, T> f170714c = new ConcurrentHashMap<>();

    /* renamed from: d */
    protected IAppContext f170715d;

    /* renamed from: e */
    protected C66411c f170716e;

    /* renamed from: f */
    protected final AbstractC67802f<List<T>> f170717f;

    /* renamed from: g */
    private final AbstractC67799c f170718g;

    /* renamed from: h */
    private T f170719h;

    @Override // com.tt.refer.common.meta.IAppMetaService
    /* renamed from: a */
    public abstract T mo50349a(Context context, E e);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C67803g<? extends C67803g.AbstractC67804a> mo50350a(Context context, List<E> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo50351a(String str, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50353a(Context context, T t);

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f170715d;
    }

    /* renamed from: a */
    public void mo235264a(IMonitorCreator iMonitorCreator) {
        this.f170713b = iMonitorCreator;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87527a(T t) {
        if (t != null) {
            String a = mo235259a(t.getIdentifier(), t.getAppVersion());
            AppBrandLogger.m52830i(f170712a, "saveMetaToMemoryCache success: metaKey is ", a);
            this.f170714c.put(a, t);
            return;
        }
        AppBrandLogger.m52829e(f170712a, "saveMetaToMemoryCache fail: appMetaInfo not exist!");
    }

    @Override // com.tt.refer.common.meta.IAppMetaService
    /* renamed from: a */
    public boolean mo235256a(Context context, String str, String str2) {
        String a = mo235259a(str, str2);
        T remove = this.f170714c.remove(a);
        if (remove != null) {
            mo50353a(context, remove);
            AppBrandLogger.m52830i(f170712a, "saveMetaToStorage success! metaKey:", a);
            return true;
        }
        AppBrandLogger.m52830i(f170712a, "saveMetaToStorage fail! metaKey:", a);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo235265a(String str) {
        return !TextUtils.isEmpty(str) && !"current".equals(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        AppBrandLogger.m52830i(f170712a, "release ......");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo235258a() {
        Locale c = C67479c.m262467a().mo234230c();
        if (TextUtils.isEmpty(c.getCountry())) {
            return c.getLanguage().toLowerCase();
        }
        return c.getLanguage().toLowerCase() + "_" + c.getCountry().toUpperCase();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo235267b(T t) {
        this.f170719h = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo235268b(String str) {
        if (TextUtils.isEmpty(str) || !"preview".equals(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo235269c(T t) {
        if (t != null) {
            String a = mo235259a(t.getIdentifier(), t.getAppVersion());
            AppBrandLogger.m52830i(f170712a, "removeFromMemoryCache success: metaKey is ", a);
            this.f170714c.remove(a);
            return;
        }
        AppBrandLogger.m52829e(f170712a, "no need removeFromMemoryCache", t.getIdentifier());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo235259a(String str, String str2) {
        return str + "_" + str2;
    }

    @Override // com.tt.refer.common.meta.IAppMetaService
    /* renamed from: b */
    public boolean mo235257b(Context context, E e) {
        return Storage.getStorageByName(context, mo50351a(e.getAppId(), mo235265a(e.getVersionType()))).edit().clear().commit();
    }

    /* renamed from: b */
    public C67805h<List<T>> mo235266b(Context context, List<E> list) {
        C67805h<List<T>> hVar = new C67805h<>();
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52829e(f170712a, "getAppMetaForBatchSync->entities is empty!");
            String code = ErrorCode.META.META_REQUEST_INFO_ERROR.getCode();
            hVar.mo235321a(code, ErrorCode.META.META_REQUEST_INFO_ERROR.getDesc() + " entities is empty!");
            return hVar;
        }
        C67803g<? extends C67803g.AbstractC67804a> a = mo50350a(context, list);
        if (a != null) {
            return this.f170718g.mo235303a(a, this.f170717f, this.f170715d);
        }
        String code2 = ErrorCode.META.META_REQUEST_INFO_ERROR.getCode();
        hVar.mo235321a(code2, ErrorCode.META.META_REQUEST_INFO_ERROR.getDesc() + " meta request is null!");
        return hVar;
    }

    public AbstractC67783a(IAppContext iAppContext, AbstractC67802f<List<T>> fVar, AbstractC67799c cVar) {
        C66411c a = C66412d.m259646a(iAppContext.getApplicationContext(), iAppContext);
        this.f170716e = a;
        this.f170715d = iAppContext;
        this.f170717f = fVar;
        fVar.mo235304a(a);
        this.f170718g = cVar;
    }

    /* renamed from: a */
    public void mo235261a(final Context context, final E e, final IAppMetaService.AbstractC67782a<T> aVar) {
        C67554l.m262725b().execute(new Runnable() {
            /* class com.tt.refer.common.meta.AbstractC67783a.RunnableC677841 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.tt.refer.common.meta.a */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                long j;
                AbsAppMeta a = AbstractC67783a.this.mo50349a(context, e);
                if (a == null) {
                    aVar.mo50338a(ErrorCode.META.NULL.getCode(), ErrorCode.META.NULL.getDesc());
                    return;
                }
                String schema = C67432a.m262319a(AbstractC67783a.this.f170715d).getSchema();
                if (TextUtils.isEmpty(schema) || !C66375a.m259522a(schema, a.getAppVersion())) {
                    if (C25529d.m91160c(e.getAppId())) {
                        long b = C66777i.m260625a().mo232683b();
                        if (a instanceof GadgetAppInfo) {
                            j = Storage.getStorageByName(context.getApplicationContext(), Storage.getStorageFilePrefix("new_update_app_info_v2" + a.getAppId())).getLong("save_time", 0);
                        } else {
                            j = 0;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(j == 0 || b == 0 || currentTimeMillis - j <= b)) {
                            aVar.mo50338a(ErrorCode.META.NULL.getCode(), ErrorCode.META.NULL.getDesc());
                            AppBrandLogger.m52830i(AbstractC67783a.f170712a, "meta expirationTime is :" + b);
                            return;
                        }
                    }
                    aVar.mo50337a(a);
                    return;
                }
                aVar.mo50338a(ErrorCode.META.NULL.getCode(), ErrorCode.META.NULL.getDesc());
            }
        });
    }

    /* renamed from: a */
    public void mo235262a(final Context context, final E e, final IAppMetaService.AbstractC67782a<T> aVar, final int i) {
        Scheduler scheduler;
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        C677852 r7 = new Action() {
            /* class com.tt.refer.common.meta.AbstractC67783a.C677852 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                T t;
                LarkInnerEventHelper.mpMetaRequestStart(AbstractC67783a.this.f170713b, e.getIdentifier(), i);
                ArrayList arrayList = new ArrayList();
                arrayList.add(e);
                C67805h<List<T>> b = AbstractC67783a.this.mo235266b(context, arrayList);
                if (b.mo235318a() == null || b.mo235318a().size() <= 0 || (t = b.mo235318a().get(0)) == null) {
                    String str = AbstractC67783a.f170712a;
                    AppBrandLogger.m52829e(str, "getAppMetaFromNet fail:" + b.mo235323c(), " app info", e);
                    LarkInnerEventHelper.mpMetaRequestResult(AbstractC67783a.this.f170713b, b.mo235322b(), e.getIdentifier(), false, i, b.mo235324d(), b.mo235323c(), TimeMeter.stop(newAndStart));
                    aVar.mo50338a(b.mo235324d(), b.mo235323c());
                    return;
                }
                AbstractC67796c cVar = (AbstractC67796c) AbstractC67783a.this.f170715d.findServiceByInterface(AbstractC67796c.class);
                if (cVar != null) {
                    cVar.mo88672a(t, i);
                }
                LarkInnerEventHelper.mpMetaRequestResult(AbstractC67783a.this.f170713b, b.mo235322b(), e.getIdentifier(), true, i, null, null, TimeMeter.stop(newAndStart));
                if (TextUtils.isEmpty(t.getVersionType())) {
                    t.setVersionType(e.getVersionType());
                }
                AbstractC67783a.this.mo87527a(t);
                aVar.mo50337a(t);
            }
        };
        if (1 == i) {
            scheduler = Schedulers.longIO();
        } else {
            scheduler = C67554l.m262725b();
        }
        C67866g.m264025a(r7, scheduler);
    }

    /* renamed from: a */
    public void mo235263a(final Context context, final List<E> list, final IAppMetaService.AbstractC67782a<List<T>> aVar, int i) {
        C67554l.m262725b().execute(new Runnable() {
            /* class com.tt.refer.common.meta.AbstractC67783a.RunnableC677863 */

            public void run() {
                C67805h<List<T>> b = AbstractC67783a.this.mo235266b(context, list);
                if (b == null || b.mo235318a() == null || b.mo235318a().size() <= 0) {
                    String str = AbstractC67783a.f170712a;
                    AppBrandLogger.m52829e(str, "requestAppMetaForBatch fail:" + b.mo235323c());
                    aVar.mo50338a(b.mo235324d(), b.mo235323c());
                    return;
                }
                aVar.mo50337a(b.mo235318a());
                for (T t : b.mo235318a()) {
                    if (t != null) {
                        if (TextUtils.isEmpty(t.getVersionType())) {
                            t.setVersionType("current");
                        }
                        AbstractC67783a.this.mo87527a(t);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo235260a(final Context context, int i, final E e, final IAppMetaService.AbstractC67782a<T> aVar, final int i2) {
        if (i == 2) {
            mo235261a(context, e, new IAppMetaService.AbstractC67782a<T>() {
                /* class com.tt.refer.common.meta.AbstractC67783a.C677874 */

                /* renamed from: a */
                public void mo50337a(T t) {
                    String str = AbstractC67783a.f170712a;
                    AppBrandLogger.m52830i(str, "getAppMeta->from cache success! identifier is:" + e.getIdentifier(), "version:", t.getAppVersion());
                    aVar.mo50337a(t);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.tt.refer.common.meta.a */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.tt.refer.common.meta.IAppMetaService.AbstractC67782a
                /* renamed from: a */
                public void mo50338a(String str, String str2) {
                    AppBrandLogger.m52830i(AbstractC67783a.f170712a, "getAppMeta->cache is empty so try fetch from net, identifier is:", e.getIdentifier());
                    AbstractC67783a.this.mo235262a(context, e, aVar, i2);
                }
            });
        } else if (i != 3) {
            mo235262a(context, e, aVar, i2);
        } else {
            mo235261a(context, e, aVar);
        }
    }
}
