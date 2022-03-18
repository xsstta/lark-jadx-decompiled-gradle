package com.ss.android.lark.integrator.openplatform.p2045b;

import android.util.Log;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.preload.PreloadTarget;
import com.ss.android.lark.preload.p2519b.AbstractC52229a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.openplatform.b.a */
public class C39941a implements AbstractC52229a<Boolean> {

    /* renamed from: a */
    private int f101641a;

    @Override // com.ss.android.lark.preload.p2519b.AbstractC52229a
    /* renamed from: a */
    public String mo144978a() {
        return "mini_app_preload_task";
    }

    @Override // com.ss.android.lark.preload.p2519b.AbstractC52229a
    /* renamed from: d */
    public boolean mo144982d() {
        return true;
    }

    @Override // com.ss.android.lark.preload.p2519b.AbstractC52229a
    /* renamed from: b */
    public PreloadTarget mo144980b() {
        return PreloadTarget.MINI_APP;
    }

    /* renamed from: c */
    public Boolean mo144983e() {
        return false;
    }

    public C39941a(int i) {
        this.f101641a = i;
    }

    @Override // com.ss.android.lark.preload.p2519b.AbstractC52229a
    /* renamed from: a */
    public void mo144979a(IGetDataCallback<Boolean> iGetDataCallback) {
        int i = this.f101641a;
        if (i == 8) {
            Log.i("MiniAppPreloadTask", "try to preload with type : FirstScreenShow");
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).preloadProcessFromFirstScreenShow(LarkContext.getApplication(), iGetDataCallback);
        } else if (i == 9) {
            Log.i("MiniAppPreloadTask", "try to preload with type : LarkIdle");
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).preloadProcessFromLarkIdle(LarkContext.getApplication(), iGetDataCallback);
        } else {
            Log.i("MiniAppPreloadTask", "do nothing with preload type : " + this.f101641a);
        }
    }
}
