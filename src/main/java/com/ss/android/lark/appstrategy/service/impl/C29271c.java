package com.ss.android.lark.appstrategy.service.impl;

import android.content.Context;
import android.os.Parcelable;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.appstrategy.C29231a;
import com.ss.android.lark.appstrategy.service.IAppStrategyManisService;
import com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper;
import com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.appstrategy.service.impl.c */
public class C29271c {

    /* renamed from: com.ss.android.lark.appstrategy.service.impl.c$a */
    private static final class C29275a {

        /* renamed from: a */
        public static final C29271c f73296a = new C29271c();
    }

    private C29271c() {
    }

    /* renamed from: a */
    public static C29271c m107607a() {
        return C29275a.f73296a;
    }

    /* renamed from: a */
    public void mo103743a(String str, final IGetDataCallback<Serializable> iGetDataCallback) {
        Context context = C29231a.m107507a().getContext();
        C292721 r1 = new IAppStrategyManisService.AbstractC29241a() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29271c.C292721 */

            @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
            public void onError(ErrorResultWrapper errorResultWrapper) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResultWrapper.f73297a);
                } else {
                    Log.m165397w("SdkRequestProcessor", "callback null");
                }
            }

            @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
            public void onSuccess(SuccessResultWrapper successResultWrapper) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(successResultWrapper.f73298a);
                } else {
                    Log.m165397w("SdkRequestProcessor", "callback null");
                }
            }
        };
        if (C26252ad.m94993b(context)) {
            new AppStrategyManisServiceImpl(context).getOpenApp(str, r1);
            return;
        }
        IAppStrategyManisService iAppStrategyManisService = (IAppStrategyManisService) C68183b.m264839a().mo237086a(C29231a.m107507a().getContext(), IAppStrategyManisService.class);
        if (iAppStrategyManisService == null) {
            Log.m165383e("SdkRequestProcessor", "app strategy manis service null");
        } else {
            iAppStrategyManisService.getOpenApp(str, r1);
        }
    }

    /* renamed from: a */
    public void mo103744a(String str, IAppStrategyManisService.OpenAppInfoType openAppInfoType, final IGetDataCallback<Parcelable> iGetDataCallback) {
        Context context = C29231a.m107507a().getContext();
        C292732 r1 = new IAppStrategyManisService.AbstractC29241a() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29271c.C292732 */

            @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
            public void onSuccess(SuccessResultWrapper successResultWrapper) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(successResultWrapper);
                } else {
                    Log.m165397w("SdkRequestProcessor", "callback null");
                }
            }

            @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
            public void onError(ErrorResultWrapper errorResultWrapper) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResultWrapper.f73297a);
                } else {
                    Log.m165397w("SdkRequestProcessor", "callback null");
                }
            }
        };
        if (C26252ad.m94993b(context)) {
            new AppStrategyManisServiceImpl(context).getOpenAppInfoV2(str, openAppInfoType.getType(), r1);
            return;
        }
        IAppStrategyManisService iAppStrategyManisService = (IAppStrategyManisService) C68183b.m264839a().mo237086a(C29231a.m107507a().getContext(), IAppStrategyManisService.class);
        if (iAppStrategyManisService == null) {
            Log.m165383e("SdkRequestProcessor", "app strategy manis service null");
        } else {
            iAppStrategyManisService.getOpenAppInfoV2(str, openAppInfoType.getType(), r1);
        }
    }

    /* renamed from: a */
    public void mo103745a(String str, String str2, long j, final IGetDataCallback<Serializable> iGetDataCallback) {
        Context context = C29231a.m107507a().getContext();
        C292743 r6 = new IAppStrategyManisService.AbstractC29241a() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29271c.C292743 */

            @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
            public void onError(ErrorResultWrapper errorResultWrapper) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResultWrapper.f73297a);
                }
            }

            @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
            public void onSuccess(SuccessResultWrapper successResultWrapper) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(successResultWrapper.f73298a);
                }
            }
        };
        if (C26252ad.m94993b(context)) {
            new AppStrategyManisServiceImpl(context).updateLastUseTime(str, str2, j, r6);
            return;
        }
        IAppStrategyManisService iAppStrategyManisService = (IAppStrategyManisService) C68183b.m264839a().mo237086a(C29231a.m107507a().getContext(), IAppStrategyManisService.class);
        if (iAppStrategyManisService != null) {
            iAppStrategyManisService.updateLastUseTime(str, str2, j, r6);
        }
    }
}
