package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.service.impl.C34131a;
import com.ss.android.lark.chat.service.impl.C34154ab;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler$IAudioPushListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler$IAudioPushListener;)V", "mPushAudioTextListener", "Lcom/ss/android/lark/chat/service/impl/AudioTextPush$IPushAudioTextListener;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "mSpeechRecognitionStatusListener", "Lcom/ss/android/lark/chat/service/impl/SpeechRecognitionStatusPush$IPushListener;", "register", "", "unRegister", "IAudioPushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.a */
public final class ChatAudioPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<IAudioPushListener> f86189a;

    /* renamed from: b */
    private C34131a.AbstractC34134b f86190b = new C33436b(this);

    /* renamed from: c */
    private C34154ab.AbstractC34157b f86191c = new C33437c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J0\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler$IAudioPushListener;", "", "onPushSpeechRecognitionStatus", "", "srcId", "", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/im/v1/PushSpeechRecognitionStatus$Status;", "onPushUpdateAudioText", "messageId", "sequenceId", "", "audioText", "isFinish", "", "diffIndex", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.a$a */
    public interface IAudioPushListener {
        /* renamed from: a */
        void mo123057a(String str, int i, String str2, boolean z, int[] iArr);

        /* renamed from: a */
        void mo123058a(String str, PushSpeechRecognitionStatus.Status status);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        C34131a.m132580a().mo126660a(this.f86190b);
        C34154ab.m132633a().mo126695a(this.f86191c);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        C34131a.m132580a().mo126661b(this.f86190b);
        C34154ab.m132633a().mo126696b(this.f86191c);
    }

    public ChatAudioPushHandler(IAudioPushListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86189a = new WeakReference<>(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "srcId", "", "kotlin.jvm.PlatformType", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/im/v1/PushSpeechRecognitionStatus$Status;", "onPushSpeechRecognitionStatus"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.a$c */
    static final class C33437c implements C34154ab.AbstractC34157b {

        /* renamed from: a */
        final /* synthetic */ ChatAudioPushHandler f86193a;

        C33437c(ChatAudioPushHandler aVar) {
            this.f86193a = aVar;
        }

        @Override // com.ss.android.lark.chat.service.impl.C34154ab.AbstractC34157b
        /* renamed from: a */
        public final void mo123060a(String str, PushSpeechRecognitionStatus.Status status) {
            IAudioPushListener aVar = this.f86193a.f86189a.get();
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "srcId");
                Intrinsics.checkExpressionValueIsNotNull(status, UpdateKey.STATUS);
                aVar.mo123058a(str, status);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n \u0004*\u0004\u0018\u00010\u000b0\u000bH\n¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "messageId", "", "kotlin.jvm.PlatformType", "seqId", "", "result", "isFinish", "", "diffIndex", "", "onPushAudioText"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.a$b */
    static final class C33436b implements C34131a.AbstractC34134b {

        /* renamed from: a */
        final /* synthetic */ ChatAudioPushHandler f86192a;

        C33436b(ChatAudioPushHandler aVar) {
            this.f86192a = aVar;
        }

        @Override // com.ss.android.lark.chat.service.impl.C34131a.AbstractC34134b
        /* renamed from: a */
        public final void mo123059a(String str, int i, String str2, boolean z, int[] iArr) {
            IAudioPushListener aVar = this.f86192a.f86189a.get();
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "messageId");
                Intrinsics.checkExpressionValueIsNotNull(str2, "result");
                Intrinsics.checkExpressionValueIsNotNull(iArr, "diffIndex");
                aVar.mo123057a(str, i, str2, z, iArr);
            }
        }
    }
}
