package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.network.C51869i;
import com.ss.android.lark.sdk.AbstractC53236c;
import com.ss.android.lark.sdk.AbstractC53238e;
import com.ss.android.lark.sdk.AbstractC53239f;
import com.ss.android.lark.sdk.C53254m;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class InitRustSdkTask extends AsyncLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitLogTask.class);
        arrayList.add(InitKVDataStoreTask.class);
        arrayList.add(InitCrashMonitorTaskV2.class);
        return arrayList;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        C53254m.m205920a(context);
        C53254m.m205925a(new AbstractC53239f() {
            /* class com.ss.android.lark.app.taskv2.central.InitRustSdkTask.C290301 */

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: a */
            public void mo103037a(String str, String str2) {
                Log.m165383e(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: b */
            public void mo103039b(String str, String str2) {
                Log.m165389i(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: c */
            public void mo103040c(String str, String str2) {
                Log.m165379d(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: d */
            public void mo103041d(String str, String str2) {
                Log.m165397w(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: a */
            public void mo103038a(String str, String str2, String str3) {
                Log.debug(str, str2, str3, (Map<String, String>) null);
            }
        });
        C53254m.m205924a(new AbstractC53238e() {
            /* class com.ss.android.lark.app.taskv2.central.InitRustSdkTask.C290312 */

            /* renamed from: b */
            private boolean f72743b = C37239a.m146648b().mo136951a("lark.sdk.async_invoke_in_background");

            /* renamed from: c */
            private boolean f72744c = C37239a.m146648b().mo136951a("lark.android.push.intercept_other_user_push");

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: c */
            public int mo102655c() {
                return 1;
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: b */
            public boolean mo102654b() {
                return this.f72744c;
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: d */
            public boolean mo102656d() {
                return this.f72743b;
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: a */
            public String mo102652a() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: a */
            public boolean mo102653a(Command command) {
                if (command == Command.SET_DEVICE || command == Command.MAKE_USER_ONLINE || command == Command.GET_INIT_SETTINGS) {
                    return true;
                }
                return false;
            }
        });
        C53254m.m205922a(new AbstractC53236c() {
            /* class com.ss.android.lark.app.taskv2.central.InitRustSdkTask.C290323 */

            @Override // com.ss.android.lark.sdk.AbstractC53236c
            /* renamed from: a */
            public boolean mo103043a() {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isAppRealForeground();
            }

            @Override // com.ss.android.lark.sdk.AbstractC53236c
            /* renamed from: a */
            public void mo103042a(String str, JSONObject jSONObject) {
                Statistics.sendEvent(str, jSONObject);
            }
        });
        C53254m.m205923a(C51869i.m201153a());
    }
}
