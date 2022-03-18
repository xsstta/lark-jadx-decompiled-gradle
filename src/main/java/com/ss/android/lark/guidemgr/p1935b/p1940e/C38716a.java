package com.ss.android.lark.guidemgr.p1935b.p1940e;

import android.os.SystemClock;
import androidx.core.util.C0844e;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.onboarding.v1.GetUserGuideRequest;
import com.bytedance.lark.pb.onboarding.v1.GetUserGuideResponse;
import com.bytedance.lark.pb.onboarding.v1.PostUserConsumingGuideRequest;
import com.bytedance.lark.pb.onboarding.v1.PostUserConsumingGuideResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38711a;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38712b;
import com.ss.android.lark.guidemgr.p1935b.p1942g.C38723a;
import com.ss.android.lark.guidemgr.p1946f.C38729c;
import com.ss.android.lark.guidemgr.statistics.GuideMgrApm;
import com.ss.android.lark.guidemgr.statistics.GuideMgrAppreciable;
import com.ss.android.lark.guidemgr.statistics.UGAppreciable;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.guidemgr.b.e.a */
public class C38716a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guidemgr.b.e.a$a */
    public static class C38719a {

        /* renamed from: a */
        public static final C38716a f99606a = new C38716a();
    }

    private C38716a() {
    }

    /* renamed from: a */
    public static C38716a m152920a() {
        return C38719a.f99606a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m152921a(byte[] bArr) throws IOException {
        return C38723a.m152936a(GetUserGuideResponse.ADAPTER.decode(bArr).ordered_pairs);
    }

    /* renamed from: a */
    public void mo141883a(final IGetDataCallback<List<C0844e<C38711a, List<C38712b>>>> iGetDataCallback) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final UGAppreciable.NetPoint c = GuideMgrAppreciable.f99618a.mo141908c();
        c.mo141917a();
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_GUIDE_REQUEST, new GetUserGuideRequest.C18598a(), new IGetDataCallback<List<C0844e<C38711a, List<C38712b>>>>() {
            /* class com.ss.android.lark.guidemgr.p1935b.p1940e.C38716a.C387171 */

            /* renamed from: a */
            public void onSuccess(List<C0844e<C38711a, List<C38712b>>> list) {
                C53241h.m205898b("GuideMgrService", "fetchProductGuideList onSuccess");
                GuideMgrApm.GuideEngine.f99617a.mo141904a(true, SystemClock.uptimeMillis() - uptimeMillis, null);
                c.mo141919b();
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(list);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                C53241h.m205900d("GuideMgrService", "fetchProductGuideList error");
                long uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis;
                GuideMgrApm.GuideEngine aVar = GuideMgrApm.GuideEngine.f99617a;
                if (errorResult != null) {
                    str = errorResult.toString();
                } else {
                    str = null;
                }
                aVar.mo141904a(false, uptimeMillis, str);
                c.mo141918a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                C38729c.m152954a().mo141910a(errorResult);
            }
        }, $$Lambda$a$eOrmTrYzox51wndTX3RrHDpfwIw.INSTANCE);
    }

    /* renamed from: a */
    public void mo141884a(List<String> list, final IGetDataCallback<Object> iGetDataCallback) {
        if (!(list == null || list.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            try {
                ArrayList arrayList = new ArrayList(list);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(",");
                    }
                }
            } catch (Exception unused) {
            }
            final String sb2 = sb.toString();
            final long uptimeMillis = SystemClock.uptimeMillis();
            final UGAppreciable.NetPoint d = GuideMgrAppreciable.f99618a.mo141909d();
            d.mo141917a();
            C387182 r0 = new IGetDataCallback<Object>() {
                /* class com.ss.android.lark.guidemgr.p1935b.p1940e.C38716a.C387182 */

                @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                public void onSuccess(Object obj) {
                    GuideMgrApm.GuideEngine.f99617a.mo141905a(true, SystemClock.uptimeMillis() - uptimeMillis, sb2, null, null);
                    d.mo141919b();
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(obj);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Integer num;
                    long uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis;
                    GuideMgrApm.GuideEngine aVar = GuideMgrApm.GuideEngine.f99617a;
                    String str = sb2;
                    String str2 = null;
                    if (errorResult != null) {
                        num = Integer.valueOf(errorResult.getErrorCode());
                    } else {
                        num = null;
                    }
                    if (errorResult != null) {
                        str2 = errorResult.toString();
                    }
                    aVar.mo141905a(false, uptimeMillis, str, num, str2);
                    d.mo141918a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            };
            Command command = Command.POST_USER_CONSUMING_GUIDE_REQUEST;
            PostUserConsumingGuideRequest.C18604a a = new PostUserConsumingGuideRequest.C18604a().mo64113a(list);
            ProtoAdapter<PostUserConsumingGuideResponse> protoAdapter = PostUserConsumingGuideResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, a, r0, new SdkSender.IParser() {
                /* class com.ss.android.lark.guidemgr.p1935b.p1940e.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }
}
