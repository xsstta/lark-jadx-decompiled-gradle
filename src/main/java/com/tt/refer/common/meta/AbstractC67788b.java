package com.tt.refer.common.meta;

import android.content.Context;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import com.tt.refer.common.pkg.PackageEntity;

/* renamed from: com.tt.refer.common.meta.b */
public abstract class AbstractC67788b<E extends AbsMetaLoadEntity, M extends AbsAppMeta> {

    /* renamed from: a */
    protected AbstractC67783a<M, E> f170739a;

    /* renamed from: b */
    protected AbstractC67791a<M> f170740b;

    /* renamed from: c */
    protected IAppContext f170741c;

    /* renamed from: d */
    public IMonitorCreator f170742d;

    /* renamed from: com.tt.refer.common.meta.b$a */
    public interface AbstractC67791a<M extends AbsAppMeta> {
        /* renamed from: a */
        void mo235280a(int i, M m);
    }

    /* renamed from: com.tt.refer.common.meta.b$b */
    public interface AbstractC67792b<M extends AbsAppMeta> {
        void onAppMetaInvalid(int i, M m, int i2);

        void onRequestAppMetaFail(int i, String str, String str2);

        void onRequestAppMetaSuccess(int i, M m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo50332a(M m, E e, Context context);

    /* renamed from: a */
    public abstract PackageEntity mo50334a(M m);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo50336a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo235277b(int i) {
        return true;
    }

    /* renamed from: a */
    public void mo235275a(IMonitorCreator iMonitorCreator) {
        this.f170742d = iMonitorCreator;
        AbstractC67783a<M, E> aVar = this.f170739a;
        if (aVar != null) {
            aVar.mo235264a(iMonitorCreator);
        }
    }

    /* renamed from: a */
    public void mo235276a(AbstractC67791a<M> aVar) {
        this.f170740b = aVar;
    }

    public AbstractC67788b(AbstractC67783a aVar, IAppContext iAppContext) {
        this.f170739a = aVar;
        this.f170741c = iAppContext;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo235273a(E e, int i) {
        if (e.isLocalTest() || i == 1 || i == 2) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo235274a(final Context context, final E e, final int i, final AbstractC67792b<M> bVar) {
        try {
            AppBrandLogger.m52830i("app_start_load_fetcher", "requestAppMeta:", e.getIdentifier(), "requestType:", Integer.valueOf(i));
            final TimeMeter newAndStart = TimeMeter.newAndStart();
            LarkInnerEventHelper.mpLoadMetaStart(this.f170742d, i, e.getIdentifier());
            this.f170739a.mo235260a(context, mo235273a(e, i), e, new IAppMetaService.AbstractC67782a<M>() {
                /* class com.tt.refer.common.meta.AbstractC67788b.C677891 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: com.tt.refer.common.meta.b */
                /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: com.tt.refer.common.meta.a<M extends com.tt.refer.common.meta.base.AbsAppMeta, E extends com.tt.refer.common.meta.base.AbsMetaLoadEntity> */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void mo50337a(M m) {
                    int i;
                    AbstractC67796c cVar = (AbstractC67796c) AbstractC67788b.this.f170741c.findServiceByInterface(AbstractC67796c.class);
                    if (cVar != null) {
                        cVar.mo88672a(m, i);
                    }
                    if (i == 0) {
                        AbstractC67788b.this.f170739a.mo235267b(m);
                    }
                    IMonitorCreator iMonitorCreator = AbstractC67788b.this.f170742d;
                    String identifier = e.getIdentifier();
                    if (m.getMetaSource() == 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    LarkInnerEventHelper.mpLoadMetaResult(iMonitorCreator, identifier, true, null, null, i, i, TimeMeter.stop(newAndStart));
                    m.setVersionType(e.getVersionType());
                    int a = AbstractC67788b.this.mo50332a(m, e, context);
                    if (AbstractC67788b.this.mo50336a(a)) {
                        AppBrandLogger.m52830i("app_start_load_fetcher", "requestAppMeta success,but not invalid appId is:" + e.getAppId(), "Identifier:", e.getIdentifier(), " invalidType:", Integer.valueOf(a));
                        if (AbstractC67788b.this.mo235277b(a)) {
                            AbstractC67788b.this.f170739a.mo235269c(m);
                            if (m.getMetaSource() == 1) {
                                AbstractC67788b.this.f170739a.mo235257b(context, e);
                                AppBrandLogger.m52830i("app_start_load_fetcher", "app info remove from local:", m.getIdentifier());
                            }
                        }
                        bVar.onAppMetaInvalid(i, m, a);
                        return;
                    }
                    bVar.onRequestAppMetaSuccess(i, m);
                    if (AbstractC67788b.this.f170740b != null) {
                        AbstractC67788b.this.f170740b.mo235280a(i, m);
                    }
                }

                @Override // com.tt.refer.common.meta.IAppMetaService.AbstractC67782a
                /* renamed from: a */
                public void mo50338a(String str, String str2) {
                    LarkInnerEventHelper.mpLoadMetaResult(AbstractC67788b.this.f170742d, e.getIdentifier(), false, str, str2, 0, i, TimeMeter.stop(newAndStart));
                    AppBrandLogger.m52829e("app_start_load_fetcher", "requestAppMetaFail:", " appId:", e.getAppId(), " Identifier:", e.getIdentifier(), " code:", str, " errorMsg:", str2);
                    bVar.onRequestAppMetaFail(i, str, str2);
                }
            }, i);
        } catch (Exception e2) {
            C67554l.m262725b().execute(new Runnable() {
                /* class com.tt.refer.common.meta.AbstractC67788b.RunnableC677902 */

                public void run() {
                    bVar.onRequestAppMetaFail(i, ErrorCode.META.UNKNOWN.getCode(), Log.getStackTraceString(e2));
                }
            });
        }
    }
}
