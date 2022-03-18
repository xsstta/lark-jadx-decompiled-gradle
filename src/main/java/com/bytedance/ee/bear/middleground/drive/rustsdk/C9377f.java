package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.space.drive.v1.SubscribeErrPush;
import com.ss.android.lark.sdk.C53248k;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.f */
public class C9377f implements C53248k.AbstractC53250a {

    /* renamed from: a */
    public String f25206a = "DriveRustErrorPushListener_DriveRustPush";

    /* renamed from: b */
    private HandlerC9378a f25207b;

    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.f$a */
    private final class HandlerC9378a extends Handler {
        public void handleMessage(Message message) {
            if (message.what == 1) {
                m38737a((byte[]) message.obj);
            }
        }

        /* renamed from: a */
        private void m38737a(byte[] bArr) {
            try {
                String str = C9377f.this.f25206a;
                C13479a.m54758a(str, "handleMessage MSG_ON_PUSH data=" + SubscribeErrPush.ADAPTER.decode(bArr));
            } catch (Throwable th) {
                C13479a.m54759a(C9377f.this.f25206a, "handleMessage MSG_ON_PUSH error", th);
            }
        }

        public HandlerC9378a(Looper looper) {
            super(looper);
        }
    }

    public C9377f(HandlerThread handlerThread) {
        this.f25207b = new HandlerC9378a(handlerThread.getLooper());
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        String str2 = this.f25206a;
        C13479a.m54772d(str2, "DriveRustPushListener.onPush: sid=" + str + " fromServerPipe=" + z + " offlinePush=" + z2);
        HandlerC9378a aVar = this.f25207b;
        aVar.sendMessage(Message.obtain(aVar, 1, bArr));
    }
}
