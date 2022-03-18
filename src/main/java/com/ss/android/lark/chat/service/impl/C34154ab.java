package com.ss.android.lark.chat.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.chat.service.impl.ab */
public class C34154ab {

    /* renamed from: a */
    private final List<AbstractC34157b> f88401a;

    /* renamed from: com.ss.android.lark.chat.service.impl.ab$a */
    private static class C34156a {

        /* renamed from: a */
        public static final C34154ab f88402a = new C34154ab();
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.ab$b */
    public interface AbstractC34157b {
        /* renamed from: a */
        void mo123060a(String str, PushSpeechRecognitionStatus.Status status);
    }

    /* renamed from: a */
    public static C34154ab m132633a() {
        return C34156a.f88402a;
    }

    private C34154ab() {
        this.f88401a = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132636b() {
        C53248k.m205912a().mo181696a(Command.PUSH_SPEECH_RECOGNITION_STATUS);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132637c() {
        C53248k.m205912a().mo181697a(Command.PUSH_SPEECH_RECOGNITION_STATUS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ab$25SAr5zvMrwzHOJ_MhOKHEcW2k */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34154ab.this.m132635a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo126696b(AbstractC34157b bVar) {
        C53246j.m205911b(this.f88401a, bVar, $$Lambda$ab$0DM0FxHvMLzlPtsKbnruTFFPtw.INSTANCE);
    }

    /* renamed from: a */
    public void mo126695a(AbstractC34157b bVar) {
        C53246j.m205910a(this.f88401a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ab$gzVtfsmEGLnK61AfLp8uQJR8CQ0 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34154ab.this.m132637c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m132634a(PushSpeechRecognitionStatus pushSpeechRecognitionStatus) {
        for (AbstractC34157b bVar : this.f88401a) {
            bVar.mo123060a(pushSpeechRecognitionStatus.source_id, pushSpeechRecognitionStatus.status);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m132635a(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165379d("SpeechRecognitionStatusPush", "SpeechRecognitionStatusPush:" + str + "/" + z + "/" + z2);
        try {
            PushSpeechRecognitionStatus decode = PushSpeechRecognitionStatus.ADAPTER.decode(bArr);
            if (decode != null && !TextUtils.isEmpty(decode.source_id)) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(decode) {
                    /* class com.ss.android.lark.chat.service.impl.$$Lambda$ab$Sc3njn7_zikpEFDpM2SQ7i1Qn48 */
                    public final /* synthetic */ PushSpeechRecognitionStatus f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C34154ab.this.m132634a((C34154ab) this.f$1);
                    }
                });
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
