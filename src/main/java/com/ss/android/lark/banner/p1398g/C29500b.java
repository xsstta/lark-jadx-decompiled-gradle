package com.ss.android.lark.banner.p1398g;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.banner.entity.p1395a.C29474b;
import com.ss.android.lark.banner.entity.p1395a.C29475c;
import com.ss.android.lark.banner.export.entity.C29489b;
import com.ss.android.lark.banner.export.entity.C29490c;
import com.ss.android.lark.banner.statistics.BannerApm;
import com.ss.android.lark.banner.statistics.BannerAppreciable;
import com.ss.android.lark.banner.statistics.UGAppreciable;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.guide.PullBannerResponse;
import com.ss.android.lark.pb.guide.SetBannerStatusRequest;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.banner.g.b */
class C29500b implements AbstractC29499a {

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.banner.g.b$a */
    public static class C29503a {

        /* renamed from: a */
        protected static final AbstractC29499a f73688a = new C29500b();
    }

    /* renamed from: lambda$tXa-EWtsTKnVmeENY5bfujaod78  reason: not valid java name */
    public static /* synthetic */ Boolean m270280lambda$tXaEWtsTKnVmeENY5bfujaod78(byte[] bArr) {
        return true;
    }

    C29500b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ List m108594b(byte[] bArr) throws IOException {
        return C29490c.m108577a(PullBannerResponse.ADAPTER.decode(bArr).mbanners);
    }

    @Override // com.ss.android.lark.banner.p1398g.AbstractC29499a
    /* renamed from: a */
    public void mo104455a(C29475c cVar) {
        final SetBannerStatusRequest.C49796a a = cVar.mo104437a();
        if (!TextUtils.isEmpty(a.f124728a)) {
            final UGAppreciable.NetPoint d = BannerAppreciable.f73690a.mo104468d();
            d.mo104478a();
            SdkSender.sendPassThroughRequest(Command.SET_BANNER_STATUS, a, new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.banner.p1398g.C29500b.C295022 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    Log.m165379d("BannerServiceImpl", "set banner status success");
                    d.mo104480b();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    BannerApm.f73689a.mo104463b(a.f124728a, errorResult.toString());
                    d.mo104479a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    Log.m165384e("BannerServiceImpl", "set banner status error", errorResult);
                }
            }, $$Lambda$b$tXaEWtsTKnVmeENY5bfujaod78.INSTANCE);
        }
    }

    @Override // com.ss.android.lark.banner.p1398g.AbstractC29499a
    /* renamed from: a */
    public void mo104454a(C29474b bVar, final IGetDataCallback<List<C29489b>> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(Command.PULL_BANNER, bVar.mo104435a(), new IGetDataCallback<List<C29489b>>() {
            /* class com.ss.android.lark.banner.p1398g.C29500b.C295011 */

            /* renamed from: a */
            public void onSuccess(List<C29489b> list) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(list);
                }
                Log.m165389i("BannerServiceImpl", "get banners info success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                Log.m165384e("BannerServiceImpl", "get banners info error", errorResult);
            }
        }, $$Lambda$b$zi60Fo7i3oFUhjFhl2DbgDX19PE.INSTANCE);
    }
}
