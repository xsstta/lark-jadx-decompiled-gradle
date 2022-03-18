package com.bytedance.ee.bear.document.rnsync;

import android.app.Application;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.p281e.AbstractC5167a;
import com.bytedance.ee.bear.document.alert.FullQuoteDialogHandler;
import com.bytedance.ee.bear.document.frontendlog.JSLoggerHandler;
import com.bytedance.ee.bear.document.offline.base.C5906d;
import com.bytedance.ee.bear.document.offline.base.C5912g;
import com.bytedance.ee.bear.document.offline.create.AbstractC5917c;
import com.bytedance.ee.bear.document.offline.create.C5915a;
import com.bytedance.ee.bear.document.offline.create.C5916b;
import com.bytedance.ee.bear.document.offline.create.GetCreatedDocHandler;
import com.bytedance.ee.bear.document.offline.file.upload.UploadFileHandler;
import com.bytedance.ee.bear.document.offline.sync.sync.C6027a;
import com.bytedance.ee.bear.document.offline.sync.sync.C6034e;
import com.bytedance.ee.bear.document.statistics.ReportEventHandler;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.service.C10917c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/document/rnsync/DocRnImpl;", "Lcom/bytedance/ee/bear/contract/rn/IRn;", "()V", "mApplication", "Landroid/app/Application;", "mModifyOfflineDocInfoHandler", "Lcom/bytedance/ee/bear/document/offline/create/ModifyOfflineDocInfoHandler;", "mOfflineSyncDocHandler", "Lcom/bytedance/ee/bear/document/offline/create/OfflineSyncDocHandler;", "mRnManager", "Lcom/bytedance/ee/bear/rn/RnManager;", "getMRnManager", "()Lcom/bytedance/ee/bear/rn/RnManager;", "mRnManager$delegate", "Lkotlin/Lazy;", "init", "", "application", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "setOfflineSyncListener", "listener", "Lcom/bytedance/ee/bear/document/offline/create/OfflineSyncInterface;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.i.a */
public final class DocRnImpl implements AbstractC5167a {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f16329a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocRnImpl.class), "mRnManager", "getMRnManager()Lcom/bytedance/ee/bear/rn/RnManager;"))};

    /* renamed from: b */
    private C5916b f16330b;

    /* renamed from: c */
    private C5915a f16331c;

    /* renamed from: d */
    private Application f16332d;

    /* renamed from: e */
    private final Lazy f16333e = LazyKt.lazy(C5818a.INSTANCE);

    /* renamed from: a */
    private final RnManager m23428a() {
        Lazy lazy = this.f16333e;
        KProperty kProperty = f16329a[0];
        return (RnManager) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/rn/RnManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.i.a$a */
    static final class C5818a extends Lambda implements Function0<RnManager> {
        public static final C5818a INSTANCE = new C5818a();

        C5818a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RnManager invoke() {
            return (RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null);
        }
    }

    /* renamed from: a */
    public final void mo23376a(AbstractC5917c cVar) {
        C5916b bVar = this.f16330b;
        if (bVar != null) {
            bVar.mo23893a(cVar);
        }
        C5915a aVar = this.f16331c;
        if (aVar != null) {
            aVar.mo23891a(cVar);
        }
    }

    @Override // com.bytedance.ee.bear.contract.p281e.AbstractC5167a
    /* renamed from: a */
    public void mo20634a(Application application, C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f16332d = application;
        AbstractC5233x b = C5234y.m21391b();
        this.f16330b = new C5916b(cVar, "Rn");
        this.f16331c = new C5915a(cVar, "Rn");
        m23428a().mo40252a("biz.util.setData", new C5912g(cVar));
        m23428a().mo40252a("biz.util.getData", new C5906d());
        m23428a().mo40252a("biz.util.getOfflineCreatedDoc", new GetCreatedDocHandler(cVar));
        m23428a().mo40252a("biz.notify.syncDocInfo", this.f16330b);
        m23428a().mo40252a("biz.util.modifyOfflineDocInfo", this.f16331c);
        RnManager a = m23428a();
        Application application2 = this.f16332d;
        if (application2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplication");
        }
        a.mo40252a("biz.util.uploadFile", new UploadFileHandler(application2.getApplicationContext(), b, (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), C5084ad.m20847d(), UploadFileHandler.From.RN));
        m23428a().mo40252a("biz.util.showFullQuoteDialog", new FullQuoteDialogHandler("rn"));
        m23428a().mo40252a("biz.util.logger", new JSLoggerHandler());
        RnManager a2 = m23428a();
        Intrinsics.checkExpressionValueIsNotNull(b, "analyticService");
        a2.mo40252a("biz.statistics.reportEvent", new ReportEventHandler(b));
        m23428a().mo40252a("biz.util.notifySyncStatus", new C6034e(C6027a.m24403a()));
    }
}
