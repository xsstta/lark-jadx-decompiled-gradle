package com.ss.android.lark.browser.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.JudgeSecureLinkRequest;
import com.bytedance.lark.pb.im.v1.JudgeSecureLinkResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.browser.impl.e */
public class C29937e {

    /* renamed from: a */
    private static final C29937e f74699a = new C29937e();

    /* renamed from: b */
    private int f74700b;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m110693c() {
        this.f74700b = 0;
    }

    /* renamed from: a */
    public static C29937e m110691a() {
        return f74699a;
    }

    /* renamed from: b */
    public void mo107810b() {
        int i = this.f74700b;
        if (i < 3) {
            int i2 = i + 1;
            this.f74700b = i2;
            if (i2 >= 3) {
                CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
                    /* class com.ss.android.lark.browser.impl.$$Lambda$e$EHJV6eNf9fBn8ORC5S7jORFXTaw */

                    public final void run() {
                        C29937e.this.m110693c();
                    }
                }, 30, TimeUnit.MINUTES);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m110692a(UIGetDataCallback uIGetDataCallback) {
        if (!uIGetDataCallback.isCanceled()) {
            uIGetDataCallback.onSuccess(true);
            mo107810b();
            Log.m165389i("SecurityLinkJudger", "sec link request time out. failed " + this.f74700b + " times.");
        }
    }

    /* renamed from: a */
    public void mo107809a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        if (!C29638a.m109622a().isFeatureGatingEnable("lark.browser.security.linkplus")) {
            iGetDataCallback.onSuccess(false);
        } else if (this.f74700b >= 3) {
            Log.m165389i("SecurityLinkJudger", "give up url judge, request failed too many times.");
            iGetDataCallback.onSuccess(true);
        } else {
            JudgeSecureLinkRequest.C17793a aVar = new JudgeSecureLinkRequest.C17793a();
            aVar.mo62044a(str);
            aVar.mo62046b("messenger");
            final UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(iGetDataCallback);
            CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable(uIGetDataCallback) {
                /* class com.ss.android.lark.browser.impl.$$Lambda$e$PQw9GhQ_Dlw91KbWHxZSWcqY6Mg */
                public final /* synthetic */ UIGetDataCallback f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C29937e.this.m110692a(this.f$1);
                }
            }, 3, TimeUnit.SECONDS);
            Command command = Command.JUDGE_SECURE_LINK;
            C299381 r1 = new IGetDataCallback<JudgeSecureLinkResponse>() {
                /* class com.ss.android.lark.browser.impl.C29937e.C299381 */

                /* renamed from: a */
                public void onSuccess(JudgeSecureLinkResponse judgeSecureLinkResponse) {
                    if (!uIGetDataCallback.isCanceled()) {
                        uIGetDataCallback.onSuccess(judgeSecureLinkResponse.is_safe);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!uIGetDataCallback.isCanceled()) {
                        uIGetDataCallback.onSuccess(true);
                    }
                    C29937e.this.mo107810b();
                }
            };
            ProtoAdapter<JudgeSecureLinkResponse> protoAdapter = JudgeSecureLinkResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, aVar, r1, new SdkSender.IParser() {
                /* class com.ss.android.lark.browser.impl.$$Lambda$2V0gJgg7E4SiwmIspJsB3lmTmU */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (JudgeSecureLinkResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }
}
