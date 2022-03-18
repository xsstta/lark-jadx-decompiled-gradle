package com.ss.android.lark.chat.chatwindow.chat;

import android.os.Handler;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.core.model.entity.C33960a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0002%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u001c\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\u0006\u0010!\u001a\u00020\u0012J\u0016\u0010\"\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$H\u0002R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R2\u0010\u0017\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00190\u0019 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00190\u0019\u0018\u00010\u00180\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/MessageReader;", "", "isSuperGroup", "", "(Z)V", "handledMsgSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getHandledMsgSet", "()Ljava/util/HashSet;", "()Z", "mHandler", "Landroid/os/Handler;", "kotlin.jvm.PlatformType", "mReadBuffer", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageReader$ReadBuffer;", "mReadPosition", "", "getMReadPosition", "()I", "setMReadPosition", "(I)V", "mThrottle", "Lcom/larksuite/framework/utils/AndroidThrottle;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "filterHandledMsg", "", "originMessages", "finishReadTask", "", "readMsg", "intervalMessages", "readPosition", "readMsgInner", "dataList", "", "Companion", "ReadBuffer", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.k */
public final class MessageReader {

    /* renamed from: c */
    public static final Companion f85579c = new Companion(null);

    /* renamed from: a */
    public final ReadBuffer f85580a;

    /* renamed from: b */
    public final AndroidThrottle<MessageInfo> f85581b;

    /* renamed from: d */
    private final Handler f85582d;

    /* renamed from: e */
    private int f85583e;

    /* renamed from: f */
    private final HashSet<String> f85584f = new HashSet<>();

    /* renamed from: g */
    private final boolean f85585g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/MessageReader$Companion;", "", "()V", "DEFAULT_DETECT_INTERVAL", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/MessageReader$ReadBuffer;", "Lcom/larksuite/framework/utils/AndroidThrottle$TaskBuffer;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "()V", "mHashMap", "", "", "clear", "", "consumeAll", "", "isEmpty", "", "put", "t", "size", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.k$b */
    public static final class ReadBuffer implements AndroidThrottle.AbstractC26232d<MessageInfo> {

        /* renamed from: a */
        private final Map<String, MessageInfo> f85586a = new HashMap();

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
        /* renamed from: b */
        public void mo93317b() {
            this.f85586a.clear();
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
        /* renamed from: c */
        public int mo93318c() {
            return this.f85586a.size();
        }

        /* renamed from: a */
        public final boolean mo122615a() {
            return this.f85586a.isEmpty();
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
        /* renamed from: d */
        public Collection<MessageInfo> mo93319d() {
            ArrayList arrayList = new ArrayList(this.f85586a.values());
            this.f85586a.clear();
            return arrayList;
        }

        /* renamed from: a */
        public void mo93316a(MessageInfo messageInfo) {
            if (messageInfo != null) {
                Map<String, MessageInfo> map = this.f85586a;
                String id = messageInfo.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "it.id");
                map.put(id, messageInfo);
            }
        }
    }

    /* renamed from: a */
    public final void mo122611a() {
        this.f85582d.post(new RunnableC33253c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.k$c */
    static final class RunnableC33253c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageReader f85587a;

        RunnableC33253c(MessageReader kVar) {
            this.f85587a = kVar;
        }

        public final void run() {
            if (!this.f85587a.f85580a.mo122615a()) {
                this.f85587a.mo122612a(this.f85587a.f85580a.mo93319d());
                this.f85587a.f85581b.mo93302a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "tasks", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "execute"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.k$d */
    static final class C33254d<T> implements AndroidThrottle.AbstractC26233e<MessageInfo> {

        /* renamed from: a */
        final /* synthetic */ MessageReader f85588a;

        C33254d(MessageReader kVar) {
            this.f85588a = kVar;
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
        public final void execute(Collection<MessageInfo> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "tasks");
            this.f85588a.mo122612a(collection);
        }
    }

    /* renamed from: a */
    public final void mo122612a(Collection<? extends MessageInfo> collection) {
        C32848e.m126401b().mo121101a(new ArrayList(collection), this.f85583e, this.f85585g, (IGetDataCallback<C33960a>) null);
    }

    public MessageReader(boolean z) {
        this.f85585g = z;
        ReadBuffer bVar = new ReadBuffer();
        this.f85580a = bVar;
        Handler nonblockingHandler = CoreThreadPool.getNonblockingHandler();
        this.f85582d = nonblockingHandler;
        this.f85581b = new AndroidThrottle.C26229a().mo93309a(2000L).mo93311a(bVar).mo93310a(nonblockingHandler).mo93312a(new C33254d(this)).mo93313a();
    }

    /* renamed from: a */
    private final List<MessageInfo> m128602a(List<? extends MessageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (MessageInfo messageInfo : list) {
            String id = messageInfo.getId();
            if (!this.f85584f.contains(id)) {
                this.f85584f.add(id);
                arrayList.add(messageInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo122613a(List<? extends MessageInfo> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "intervalMessages");
        this.f85583e = i;
        this.f85581b.mo93304a(m128602a(list));
    }
}
