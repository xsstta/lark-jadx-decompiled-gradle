package com.ss.android.lark.app.task.initor;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoRequest;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class WidgetModuleDependencyInitor {
    /* renamed from: a */
    public static void m106670a(final Context context) {
        C37030f.m146094a(new C37030f.AbstractC37032b() {
            /* class com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor.C290251 */

            /* renamed from: b */
            private final Map<C37030f.AbstractC37033c, ComponentCallbacks2> f72728b = new HashMap();

            /* renamed from: c */
            private final Map<C37030f.AbstractC37033c, IUiModeService.UiModeChangeListener> f72729c = new HashMap();

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: a */
            public Context mo103021a() {
                return context;
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: b */
            public Activity mo103028b() {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLastTopActivity();
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: a */
            public void mo103023a(IGetDataCallback<Boolean> iGetDataCallback) {
                WidgetModuleDependencyInitor.m106671a(iGetDataCallback);
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: a */
            public void mo103024a(final C37030f.AbstractC37033c cVar) {
                ComponentCallbacks2C290261 r0 = new ComponentCallbacks2() {
                    /* class com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor.C290251.ComponentCallbacks2C290261 */

                    /* renamed from: c */
                    private int f72732c;

                    public void onLowMemory() {
                    }

                    public void onTrimMemory(int i) {
                    }

                    public void onConfigurationChanged(Configuration configuration) {
                        int i = configuration.uiMode & 48;
                        Log.m165379d("WidgetModuleDependencyInitor", "onConfigurationChanged:" + this.f72732c + "/" + i);
                        if (this.f72732c != i) {
                            this.f72732c = i;
                            C37030f.AbstractC37033c cVar = cVar;
                            if (cVar != null) {
                                cVar.mo134316a(i);
                            }
                        }
                    }
                };
                this.f72728b.put(cVar, r0);
                ComponentCallbacks2C51833b.m200968a(r0);
                $$Lambda$WidgetModuleDependencyInitor$1$7wtCfhZARUiEro2y_m5t5DFLmk r02 = new IUiModeService.UiModeChangeListener() {
                    /* class com.ss.android.lark.app.task.initor.$$Lambda$WidgetModuleDependencyInitor$1$7wtCfhZARUiEro2y_m5t5DFLmk */

                    @Override // com.ss.android.lark.biz.core.api.IUiModeService.UiModeChangeListener
                    public final void onNightModeChange(int i) {
                        WidgetModuleDependencyInitor.C290251.m106672a(C37030f.AbstractC37033c.this, i);
                    }
                };
                this.f72729c.put(cVar, r02);
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getUiModeService().mo105601a(r02);
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: a */
            public boolean mo103027a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m106672a(C37030f.AbstractC37033c cVar, int i) {
                if (cVar != null) {
                    cVar.mo134316a(i);
                }
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: a */
            public void mo103022a(Context context, String str) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str);
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: a */
            public void mo103026a(String str, JSONObject jSONObject) {
                Statistics.sendEvent(str, jSONObject);
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37032b
            /* renamed from: a */
            public void mo103025a(String str, String str2, boolean z, C37030f.AbstractC37031a aVar) {
                SyncDataStrategy syncDataStrategy;
                IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
                if (z) {
                    syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
                } else {
                    syncDataStrategy = SyncDataStrategy.TRY_LOCAL;
                }
                iIMApi.getRecogniseSpansResult(str, str2, syncDataStrategy, aVar);
            }
        });
    }

    /* renamed from: a */
    public static void m106671a(final IGetDataCallback<Boolean> iGetDataCallback) {
        Command command = Command.GET_ADMIN_PERMISSION_INFO;
        GetAdminPermissionInfoRequest.C50002a aVar = new GetAdminPermissionInfoRequest.C50002a();
        C290272 r2 = new IGetDataCallback<GetAdminPermissionInfoResponse>() {
            /* class com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor.C290272 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
                if (getAdminPermissionInfoResponse == null) {
                    onError(new ErrorResult("response is null"));
                } else {
                    iGetDataCallback.onSuccess(getAdminPermissionInfoResponse.misSuperAdministrator);
                }
            }
        };
        ProtoAdapter<GetAdminPermissionInfoResponse> protoAdapter = GetAdminPermissionInfoResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.app.task.initor.$$Lambda$PIoc97RDoCt0HfdDPiWhWVyQEts */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetAdminPermissionInfoResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }
}
