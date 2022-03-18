package com.ss.android.lark.guide.p1912b.p1914b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.onboarding.v1.GetProductGuideRequest;
import com.bytedance.lark.pb.onboarding.v1.GetProductGuideResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.guide.engine.GuideKeys;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.util.share_preference.C57744a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.guide.b.b.a */
public class C38560a implements AbstractC38565b {

    /* renamed from: a */
    public volatile AtomicBoolean f99078a = new AtomicBoolean(false);

    /* renamed from: b */
    public CountDownLatch f99079b;

    /* renamed from: c */
    private volatile AtomicBoolean f99080c = new AtomicBoolean(false);

    /* renamed from: d */
    private volatile String f99081d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.b.b.a$a */
    public static class C38564a {

        /* renamed from: a */
        public static final C38560a f99089a = new C38560a();
    }

    /* renamed from: a */
    public static AbstractC38565b m152076a() {
        return C38564a.f99089a;
    }

    @Override // com.ss.android.lark.guide.p1912b.p1914b.AbstractC38565b
    /* renamed from: b */
    public void mo141285b() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        this.f99078a.getAndSet(false);
        this.f99079b = new CountDownLatch(1);
        m152078b(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.guide.p1912b.p1914b.C38560a.C385611 */

            /* renamed from: a */
            private void m152084a() {
                try {
                    C38560a.this.f99079b.countDown();
                } catch (Exception e) {
                    Log.m165380d("GuideService", "pullLock countDown error", e);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                m152084a();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C38560a.this.f99078a.getAndSet(true);
                m152084a();
                Log.m165389i("GuideService", "pull guide, costs times=" + (SystemClock.uptimeMillis() - uptimeMillis));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Map m152077a(byte[] bArr) throws IOException {
        return GetProductGuideResponse.ADAPTER.decode(bArr).guides;
    }

    /* renamed from: b */
    private void m152078b(final IGetDataCallback<Boolean> iGetDataCallback) {
        mo141282a(new IGetDataCallback<Map<String, Boolean>>() {
            /* class com.ss.android.lark.guide.p1912b.p1914b.C38560a.C385622 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Boolean> map) {
                boolean z;
                if (map != null) {
                    z = true;
                } else {
                    z = false;
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo141282a(final IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        SdkSender.asynSendRequestNonWrap(Command.GET_PRODUCT_GUIDE, new GetProductGuideRequest.C18590a(), new IGetDataCallback<Map<String, Boolean>>() {
            /* class com.ss.android.lark.guide.p1912b.p1914b.C38560a.C385633 */

            /* renamed from: a */
            private void m152087a(boolean z) {
                UGApm.OnBoarding.f141199a.mo194477a(z, SystemClock.uptimeMillis() - uptimeMillis);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                m152087a(false);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Boolean> map) {
                C38560a.this.mo141283a(map);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(map);
                }
                m152087a(true);
            }
        }, $$Lambda$a$q8w89w2YzLdrNjX17P9BJDSJJ3w.INSTANCE);
    }

    /* renamed from: a */
    public void mo141283a(Map<String, Boolean> map) {
        for (String str : GuideKeys.f99073a.mo141279a()) {
            Boolean bool = map.get(str);
            if (bool == null) {
                C57744a.m224104a().putBoolean(str, false);
            } else {
                C57744a.m224104a().putBoolean(str, bool.booleanValue());
            }
        }
    }

    @Override // com.ss.android.lark.guide.p1912b.p1914b.AbstractC38565b
    /* renamed from: b */
    public boolean mo141286b(String str) {
        if (!this.f99080c.get() || !TextUtils.equals(this.f99081d, str)) {
            return false;
        }
        this.f99081d = null;
        this.f99080c.getAndSet(false);
        return true;
    }

    @Override // com.ss.android.lark.guide.p1912b.p1914b.AbstractC38565b
    /* renamed from: a */
    public boolean mo141284a(String str) {
        if (!this.f99080c.compareAndSet(false, true)) {
            return false;
        }
        this.f99081d = str;
        return true;
    }
}
