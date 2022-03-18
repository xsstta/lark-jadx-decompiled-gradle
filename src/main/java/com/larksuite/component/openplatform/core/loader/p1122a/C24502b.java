package com.larksuite.component.openplatform.core.loader.p1122a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24509c;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24510d;
import com.larksuite.component.openplatform.core.loader.abs.LoadTaskType;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.refer.common.C67738a;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.larksuite.component.openplatform.core.loader.a.b */
public class C24502b<E extends AbsMetaLoadEntity, M extends AbsAppMeta> implements AbstractC24507b<E, M> {

    /* renamed from: a */
    public IAppContext f60435a;

    /* renamed from: b */
    public IMonitorCreator f60436b;

    /* renamed from: c */
    public AbstractC24509c f60437c;

    /* renamed from: d */
    public AbstractC24540d f60438d;

    /* renamed from: e */
    public List<String> f60439e;

    /* renamed from: f */
    public AbstractC24510d f60440f = new C24500a();

    /* renamed from: g */
    private C67738a<E, M> f60441g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87361a(M m) {
    }

    @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b
    /* renamed from: a */
    public <T extends AbstractC24509c> T mo87359a() {
        return (T) this.f60437c;
    }

    /* renamed from: a */
    public void mo87360a(Context context, E e, final AbstractC24507b.AbstractC24508a<M> aVar) {
        this.f60441g.mo235104a(context, (AbsMetaLoadEntity) e, 0, (C67738a.AbstractC67742a) new C67738a.AbstractC67742a<M>() {
            /* class com.larksuite.component.openplatform.core.loader.p1122a.C24502b.C245031 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaSuccess(int i, M m) {
                AppBrandLogger.m52830i("AppLoader", "onRequestAppMetaSuccess:", m);
                C24502b.this.mo87361a(m);
                if (i == 0) {
                    aVar.mo87192a(m);
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
                AppBrandLogger.m52830i("AppLoader", "onDownloadSuccess! fromLocal:" + z);
                if (i == 0) {
                    C24502b.this.f60435a.putExtra("package_cache", Boolean.valueOf(z));
                }
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaFail(int i, String str, String str2) {
                AppBrandLogger.m52830i("AppLoader", "onRequestAppMetaFail:", str2);
                if (i == 0) {
                    aVar.mo87191a(LoadTaskType.META, str, str2, null);
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                AppBrandLogger.m52830i("AppLoader", "onPkgFailed: code->", str, "reason:", str2);
                if (i == 0) {
                    aVar.mo87191a(LoadTaskType.PACKAGE, str, str2, null);
                }
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onAppMetaInvalid(int i, M m, int i2) {
                AppBrandLogger.m52830i("AppLoader", "onAppMetaInvalid:", "invalidType:" + i2);
                if (i == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("sub_error_code", i2);
                    AbstractC24507b.AbstractC24508a aVar = aVar;
                    LoadTaskType loadTaskType = LoadTaskType.META;
                    String code = ErrorCode.META.META_INVALID.getCode();
                    aVar.mo87191a(loadTaskType, code, ErrorCode.META.META_INVALID.getDesc() + i2, bundle);
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(int i, String str, String str2) {
                AppBrandLogger.m52830i("AppLoader", "onInstallPkgSuccess:", str, str2);
                if (i == 0) {
                    aVar.mo87193a(str);
                    C24502b bVar = C24502b.this;
                    bVar.f60437c = bVar.f60440f.mo87358a(C24502b.this.f60435a, str);
                    aVar.mo87190a();
                    C24502b.this.f60435a.putExtra("current_pkg_name", str2);
                } else if (i == 1) {
                    String str3 = (String) C24502b.this.f60435a.getExtra("current_pkg_name");
                    C24502b.this.f60435a.getTracingSpan().mo92224i("AppLoader", "currentUsingPkgName:", str3);
                    if (!str2.equals(str3)) {
                        aVar.mo87194b();
                    }
                }
                if (C24502b.this.f60439e != null && !C24502b.this.f60439e.isEmpty() && C24502b.this.f60438d != null) {
                    C24502b.this.f60438d.mo87369a(C24502b.this.f60435a.getApplicationContext(), C24502b.this.f60439e, new IJSComponentManager.AbstractC24523a() {
                        /* class com.larksuite.component.openplatform.core.loader.p1122a.C24502b.C245031.C245041 */

                        @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24523a
                        /* renamed from: a */
                        public void mo87362a(Map<String, ReadyJSComponent> map) {
                            if (map != null) {
                                Set<String> keySet = map.keySet();
                                if (keySet.containsAll(C24502b.this.f60439e)) {
                                    AppBrandLogger.m52830i("AppLoader", "onComponentFetch....ready");
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(C24502b.this.f60439e);
                                arrayList.removeAll(keySet);
                                if (C24502b.this.f60436b != null) {
                                    OPMonitor createOPMonitor = C24502b.this.f60436b.createOPMonitor("op_common_component_app_start_failed", null);
                                    createOPMonitor.addCategoryValue("components", Arrays.toString(arrayList.toArray()));
                                    createOPMonitor.flush();
                                }
                            }
                        }
                    });
                }
            }
        }, true);
    }

    public C24502b(IAppContext iAppContext, AbstractC67788b<E, M> bVar, AbstractC24540d dVar) {
        this.f60441g = new C67738a<>(bVar, iAppContext);
        this.f60438d = dVar;
        this.f60435a = iAppContext;
    }
}
