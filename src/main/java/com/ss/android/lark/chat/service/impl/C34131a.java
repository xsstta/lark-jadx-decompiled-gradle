package com.ss.android.lark.chat.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushAudioMessageRecognitionResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.chat.service.impl.a */
public class C34131a {

    /* renamed from: a */
    private List<AbstractC34134b> f88367a;

    /* renamed from: com.ss.android.lark.chat.service.impl.a$a */
    private static class C34133a {

        /* renamed from: a */
        public static final C34131a f88368a = new C34131a();
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.a$b */
    public interface AbstractC34134b {
        /* renamed from: a */
        void mo123059a(String str, int i, String str2, boolean z, int[] iArr);
    }

    /* renamed from: a */
    public static C34131a m132580a() {
        return C34133a.f88368a;
    }

    private C34131a() {
        this.f88367a = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132583b() {
        C53248k.m205912a().mo181696a(Command.PUSH_AUDIO_MESSAGE_RECOGNITION_RESULT);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132584c() {
        C53248k.m205912a().mo181697a(Command.PUSH_AUDIO_MESSAGE_RECOGNITION_RESULT, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$a$wku4mJmWtQmh0Yd5NhhEe0r7yY */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34131a.this.m132582a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo126661b(AbstractC34134b bVar) {
        C53246j.m205911b(this.f88367a, bVar, $$Lambda$a$nxKSnXu3K46ofxwQgmC7_GLeM.INSTANCE);
    }

    /* renamed from: a */
    public void mo126660a(AbstractC34134b bVar) {
        C53246j.m205910a(this.f88367a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$a$GaAwNfxn0L96UzwElB57b40aEzg */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34131a.this.m132584c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m132581a(PushAudioMessageRecognitionResult pushAudioMessageRecognitionResult) {
        for (AbstractC34134b bVar : this.f88367a) {
            bVar.mo123059a(pushAudioMessageRecognitionResult.message_id, pushAudioMessageRecognitionResult.seq_id.intValue(), pushAudioMessageRecognitionResult.result, pushAudioMessageRecognitionResult.is_end.booleanValue(), C34438a.m133582a(pushAudioMessageRecognitionResult.diff_index_slice));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m132582a(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165379d("AudioTextPush", "PushAudioMessageRecognitionResult:" + str + "/" + z + "/" + z2);
        try {
            PushAudioMessageRecognitionResult decode = PushAudioMessageRecognitionResult.ADAPTER.decode(bArr);
            if (decode != null && !TextUtils.isEmpty(decode.message_id)) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(decode) {
                    /* class com.ss.android.lark.chat.service.impl.$$Lambda$a$YiR_UdvJZHkaXjSxNWvC7KCPaLc */
                    public final /* synthetic */ PushAudioMessageRecognitionResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C34131a.this.m132581a((C34131a) this.f$1);
                    }
                });
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
