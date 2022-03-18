package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.FileSaveToNutUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.FileUploadFailUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.ImageUploadProgressUpdate;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.SourceFileRecallUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.UploadProgressUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.chatbase.Stream;
import com.ss.android.lark.dependency.AbstractC36462ai;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2392o.AbstractC48696b;
import com.ss.android.lark.p2392o.AbstractC48701j;
import com.ss.android.lark.p2392o.AbstractC48704m;
import com.ss.android.lark.p2392o.AbstractC48705o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u00050\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatFilePushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "chatId", "", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatFilePushHandler$IFilePushListener;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatFilePushHandler$IFilePushListener;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "mDownloadStateChangeListener", "Lcom/ss/android/lark/listener/FileDownloadStateChangeListener;", "mPushDependency", "Lcom/ss/android/lark/dependency/IPushDependency;", "kotlin.jvm.PlatformType", "mPushFileUploadListener", "Lcom/ss/android/lark/listener/IPushFileUploadListener;", "mPushResourceUploadProgressListener", "Lcom/ss/android/lark/listener/IPushResourceUploadProgressListener;", "mPushSaveToNutListener", "Lcom/ss/android/lark/chat/entity/push/IPushSaveToNutStateListener;", "mRefs", "Ljava/lang/ref/WeakReference;", "mSourceMessageRecalledEventListener", "Lcom/ss/android/lark/listener/ISourceMessageRecalledEventListener;", "register", "", "unRegister", "IFilePushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.e */
public final class ChatFilePushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<IFilePushListener> f86212a;

    /* renamed from: b */
    private AbstractC36462ai f86213b;

    /* renamed from: c */
    private AbstractC48705o f86214c = new C33448f(this);

    /* renamed from: d */
    private AbstractC48704m f86215d = new C33446d(this);

    /* renamed from: e */
    private AbstractC48696b f86216e = new C33444b(this);

    /* renamed from: f */
    private AbstractC48701j f86217f = new C33445c(this);

    /* renamed from: g */
    private AbstractC33992b f86218g = new C33447e(this);

    /* renamed from: h */
    private String f86219h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatFilePushHandler$IFilePushListener;", "", "onFileDownloadFail", "", "onSwitchToCellularDataNetwork", "isPause", "", "stream", "Lcom/ss/android/lark/chatbase/Stream;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.e$a */
    public interface IFilePushListener {
        void onFileDownloadFail();

        void onSwitchToCellularDataNetwork(boolean z);

        Stream<AbstractC34006a> stream();
    }

    /* renamed from: c */
    public final String mo123070c() {
        return this.f86219h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatFilePushHandler$mDownloadStateChangeListener$1", "Lcom/ss/android/lark/listener/FileDownloadStateChangeListener;", "fileDownloadFail", "", "switchToCellularDataNetwork", "switchToCellularDataNetworkPause", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.e$b */
    public static final class C33444b implements AbstractC48696b {

        /* renamed from: a */
        final /* synthetic */ ChatFilePushHandler f86220a;

        @Override // com.ss.android.lark.p2392o.AbstractC48696b
        /* renamed from: a */
        public void mo123074a() {
            IFilePushListener aVar = this.f86220a.f86212a.get();
            if (aVar != null) {
                aVar.onFileDownloadFail();
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48696b
        /* renamed from: b */
        public void mo123075b() {
            IFilePushListener aVar = this.f86220a.f86212a.get();
            if (aVar != null) {
                aVar.onSwitchToCellularDataNetwork(true);
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48696b
        /* renamed from: c */
        public void mo123076c() {
            IFilePushListener aVar = this.f86220a.f86212a.get();
            if (aVar != null) {
                aVar.onSwitchToCellularDataNetwork(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33444b(ChatFilePushHandler eVar) {
            this.f86220a = eVar;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        C29990c.m110930b().mo134544a(this.f86214c);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134591s().mo134678a(this.f86216e);
        this.f86213b.mo134448a(this.f86215d);
        this.f86213b.mo134447a(this.f86217f);
        this.f86213b.mo134443a(this.f86218g);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        C29990c.m110930b().mo134573b(this.f86214c);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134591s().mo134682b(this.f86216e);
        this.f86213b.mo134455b(this.f86215d);
        this.f86213b.mo134454b(this.f86217f);
        this.f86213b.mo134450b(this.f86218g);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "kotlin.jvm.PlatformType", "onSourceMessageRecalledEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.e$f */
    static final class C33448f implements AbstractC48705o {

        /* renamed from: a */
        final /* synthetic */ ChatFilePushHandler f86224a;

        C33448f(ChatFilePushHandler eVar) {
            this.f86224a = eVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48705o
        /* renamed from: a */
        public final void mo123080a(Message message) {
            Stream<AbstractC34006a> stream;
            if (message != null && Objects.equals(message.getChatId(), this.f86224a.mo123070c())) {
                Log.m165389i("ChatWindowLog", "on source message recall: " + message.getId());
                IFilePushListener aVar = this.f86224a.f86212a.get();
                if (aVar != null && (stream = aVar.stream()) != null) {
                    String id = message.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "message.id");
                    Stream<AbstractC34006a> a = stream.mo127142a(id);
                    if (a != null) {
                        a.mo127146b(new SourceFileRecallUpdater());
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "key", "", "kotlin.jvm.PlatformType", "progress", "", "onPushUploadProgress"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.e$d */
    static final class C33446d implements AbstractC48704m {

        /* renamed from: a */
        final /* synthetic */ ChatFilePushHandler f86222a;

        C33446d(ChatFilePushHandler eVar) {
            this.f86222a = eVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48704m
        /* renamed from: a */
        public final void mo123078a(String str, int i) {
            Stream<AbstractC34006a> stream;
            IFilePushListener aVar = this.f86222a.f86212a.get();
            if (aVar != null && (stream = aVar.stream()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "key");
                Stream<AbstractC34006a> a = stream.mo127142a(str);
                if (a != null) {
                    a.mo127146b(new ImageUploadProgressUpdate(i));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "messageId", "", "kotlin.jvm.PlatformType", "driveStoreState", "", "onPushSaveToNutState"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.e$e */
    static final class C33447e implements AbstractC33992b {

        /* renamed from: a */
        final /* synthetic */ ChatFilePushHandler f86223a;

        C33447e(ChatFilePushHandler eVar) {
            this.f86223a = eVar;
        }

        @Override // com.ss.android.lark.chat.entity.p1667g.AbstractC33992b
        /* renamed from: a */
        public final void mo123079a(String str, int i) {
            Stream<AbstractC34006a> stream;
            IFilePushListener aVar = this.f86223a.f86212a.get();
            if (aVar != null && (stream = aVar.stream()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "messageId");
                Stream<AbstractC34006a> a = stream.mo127142a(str);
                if (a != null) {
                    a.mo127146b(new FileSaveToNutUpdater(i));
                }
            }
        }
    }

    public ChatFilePushHandler(String str, IFilePushListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86219h = str;
        this.f86212a = new WeakReference<>(aVar);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f86213b = b.mo134584l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "key", "", "kotlin.jvm.PlatformType", "channelId", "isFailed", "", "progress", "", "onPushFileUploadProgress"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.e$c */
    static final class C33445c implements AbstractC48701j {

        /* renamed from: a */
        final /* synthetic */ ChatFilePushHandler f86221a;

        C33445c(ChatFilePushHandler eVar) {
            this.f86221a = eVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48701j
        /* renamed from: a */
        public final void mo123077a(String str, String str2, boolean z, int i) {
            Stream<AbstractC34006a> stream;
            Stream<AbstractC34006a> stream2;
            if (Objects.equals(this.f86221a.mo123070c(), str2)) {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                String format = String.format("push file upload progress: %s, %s, failed: %s", Arrays.copyOf(new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)}, 3));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                Log.m165389i("ChatWindowLog", format);
                if (z) {
                    Log.m165389i("ChatWindowLog", "onPushUploadFileFailed： " + str);
                    IFilePushListener aVar = this.f86221a.f86212a.get();
                    if (aVar != null && (stream2 = aVar.stream()) != null) {
                        Intrinsics.checkExpressionValueIsNotNull(str, "key");
                        Stream<AbstractC34006a> a = stream2.mo127142a(str);
                        if (a != null) {
                            a.mo127146b(new FileUploadFailUpdater());
                            return;
                        }
                        return;
                    }
                    return;
                }
                IFilePushListener aVar2 = this.f86221a.f86212a.get();
                if (aVar2 != null && (stream = aVar2.stream()) != null) {
                    Intrinsics.checkExpressionValueIsNotNull(str, "key");
                    Stream<AbstractC34006a> a2 = stream.mo127142a(str);
                    if (a2 != null) {
                        a2.mo127146b(new UploadProgressUpdater(i));
                    }
                }
            }
        }
    }
}
