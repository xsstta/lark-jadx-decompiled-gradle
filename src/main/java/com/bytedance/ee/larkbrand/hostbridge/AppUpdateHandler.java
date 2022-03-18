package com.bytedance.ee.larkbrand.hostbridge;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/AppUpdateHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "miniAppCallback", "Lcom/ss/android/lark/littleapp/MiniAppCallback;", "(Lcom/ss/android/lark/littleapp/MiniAppCallback;)V", "getMiniAppCallback", "()Lcom/ss/android/lark/littleapp/MiniAppCallback;", "setMiniAppCallback", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a */
public final class AppUpdateHandler implements AbstractC67571b {

    /* renamed from: a */
    public static final Companion f34747a = new Companion(null);

    /* renamed from: b */
    private AbstractC41371j f34748b;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_app_async_update";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/AppUpdateHandler$Companion;", "", "()V", "ACTION_CHECK", "", "ACTION_DOWNLOAD_ERROR", "ACTION_DOWNLOAD_FINISH", "RESULT_CURRENTVER", "RESULT_HASNEW", "RESULT_LATESTVER", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final AbstractC41371j mo49140b() {
        return this.f34748b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/larkbrand/hostbridge/AppUpdateHandler$action$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.a$d */
    static final class RunnableC13078d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f34757a;

        /* renamed from: b */
        final /* synthetic */ AppUpdateHandler f34758b;

        /* renamed from: c */
        final /* synthetic */ Handler f34759c;

        RunnableC13078d(String str, AppUpdateHandler aVar, Handler handler) {
            this.f34757a = str;
            this.f34758b = aVar;
            this.f34759c = handler;
        }

        public final void run() {
            this.f34758b.mo49140b().mo149036n(this.f34757a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/larkbrand/hostbridge/AppUpdateHandler$action$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.a$c */
    static final class RunnableC13077c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f34753a;

        /* renamed from: b */
        final /* synthetic */ CrossProcessDataEntity f34754b;

        /* renamed from: c */
        final /* synthetic */ AppUpdateHandler f34755c;

        /* renamed from: d */
        final /* synthetic */ Handler f34756d;

        RunnableC13077c(String str, CrossProcessDataEntity crossProcessDataEntity, AppUpdateHandler aVar, Handler handler) {
            this.f34753a = str;
            this.f34754b = crossProcessDataEntity;
            this.f34755c = aVar;
            this.f34756d = handler;
        }

        public final void run() {
            this.f34755c.mo49140b().mo149020f(this.f34753a, this.f34754b.mo234744b("app_update_action_result"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/larkbrand/hostbridge/AppUpdateHandler$action$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.a$b */
    static final class RunnableC13076b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f34749a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f34750b;

        /* renamed from: c */
        final /* synthetic */ AppUpdateHandler f34751c;

        /* renamed from: d */
        final /* synthetic */ Handler f34752d;

        RunnableC13076b(String str, JSONObject jSONObject, AppUpdateHandler aVar, Handler handler) {
            this.f34749a = str;
            this.f34750b = jSONObject;
            this.f34751c = aVar;
            this.f34752d = handler;
        }

        public final void run() {
            this.f34751c.mo49140b().mo149002a(this.f34749a, this.f34750b.getBoolean("result_hasnew"), this.f34750b.getString("current_ver"), this.f34750b.getString("latest_ver"));
        }
    }

    public AppUpdateHandler(AbstractC41371j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "miniAppCallback");
        this.f34748b = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        AppBrandLogger.m52828d("AppUpdateHandler", "params " + crossProcessDataEntity);
        Handler handler = new Handler(Looper.getMainLooper());
        if (crossProcessDataEntity != null) {
            try {
                String b = crossProcessDataEntity.mo234744b("app_id");
                String b2 = crossProcessDataEntity.mo234744b("app_update_action");
                if (b2 != null) {
                    int hashCode = b2.hashCode();
                    if (hashCode != 94627080) {
                        if (hashCode != 164468778) {
                            if (hashCode == 974485393) {
                                if (b2.equals("download_error")) {
                                    Boolean.valueOf(handler.post(new RunnableC13078d(b, this, handler)));
                                }
                            }
                        } else if (b2.equals("download_finish")) {
                            Boolean.valueOf(handler.post(new RunnableC13077c(b, crossProcessDataEntity, this, handler)));
                        }
                    } else if (b2.equals("check")) {
                        Boolean.valueOf(handler.post(new RunnableC13076b(b, new JSONObject(crossProcessDataEntity.mo234744b("app_update_action_result")), this, handler)));
                    }
                }
                AppBrandLogger.m52829e("AppUpdateHandler", "wrong action");
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("AppUpdateHandler", ApiHandler.API_CALLBACK_EXCEPTION, e);
                Unit unit2 = Unit.INSTANCE;
            }
        }
        CrossProcessDataEntity b3 = CrossProcessDataEntity.C67574a.m263013a().mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "CrossProcessDataEntity.Builder.create().build()");
        return b3;
    }
}
