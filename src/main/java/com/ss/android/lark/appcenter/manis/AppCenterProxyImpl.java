package com.ss.android.lark.appcenter.manis;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.appcenter.p1262a.p1264b.C27552a;
import com.ss.android.appcenter.p1262a.p1264b.C27554b;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;
import com.ss.android.lark.appcenter.scancode.C29118b;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem;
import com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

public class AppCenterProxyImpl implements AppCenterProxy {
    private Context mContext;

    public AppCenterProxyImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public List<AppCenterMenuIPCItem> getAppCenterMenuItems(String str) {
        List<C27552a> a = C27554b.m100573a(this.mContext, str);
        if (CollectionUtils.isEmpty(a)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (C27552a aVar : a) {
            if (aVar != null) {
                arrayList.add(new AppCenterMenuIPCItem(aVar));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void doCheckFace(String str, final AppCenterProxy.AbstractC29094a aVar) {
        C29161b.m107213a(this.mContext, str, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.appcenter.manis.AppCenterProxyImpl.C290982 */

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165389i("AILabManager", "doCheckFace onSuccess in main process");
                AppCenterProxy.AbstractC29094a aVar = aVar;
                if (aVar != null) {
                    aVar.onSuccess(str);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("AILabManager", "doCheckFace error in main process" + errorResult);
                AppCenterProxy.AbstractC29094a aVar = aVar;
                if (aVar != null) {
                    aVar.onError(new ErrorResultWrapper(errorResult));
                }
            }
        });
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void getEnterBotMenuItem(String str, final AppCenterProxy.AbstractC29096c cVar) {
        C27554b.m100575a(str, new C27554b.AbstractC27562b() {
            /* class com.ss.android.lark.appcenter.manis.AppCenterProxyImpl.C290971 */

            @Override // com.ss.android.appcenter.p1262a.p1264b.C27554b.AbstractC27562b
            public void onSuccess(C27552a aVar) {
                AppCenterProxy.AbstractC29096c cVar;
                if (aVar != null && (cVar = cVar) != null) {
                    cVar.onSuccess(new AppCenterMenuIPCItem(aVar));
                }
            }
        });
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void openScanQRCodeActivity(IntArray intArray, boolean z, AppCenterProxy.AbstractC29095b bVar) {
        C29118b.m107036a().mo103279a(new AppCenterModule.AbstractC29127a() {
            /* class com.ss.android.lark.appcenter.manis.$$Lambda$AppCenterProxyImpl$wXVqiYvbIN33250UwXHdR5_LLw */

            @Override // com.ss.android.lark.appcenter.wrapper.AppCenterModule.AbstractC29127a
            public final boolean handleResult(Context context, String str, int i) {
                return AppCenterProxyImpl.lambda$openScanQRCodeActivity$0(AppCenterProxy.AbstractC29095b.this, context, str, i);
            }
        });
        C29118b.m107036a().mo103278a(this.mContext, intArray.f72914a, z);
    }
}
