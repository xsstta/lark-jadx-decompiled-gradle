package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import android.content.Context;
import com.ss.android.eventbus.LRUCache;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.tab.service.entity.ChatTab;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001aJ\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b0\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\"\u0010\"\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001aH\u0002J\u001e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00162\u000e\u0010'\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0017J\u0010\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u0011J,\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b0\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010$\u001a\u00020\u001aH\u0002J\u000e\u0010+\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00170\u0015X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b0\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatPageSpecController;", "", "context", "Landroid/content/Context;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabDependeceViewModel;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabDependeceViewModel;)V", "getContext", "()Landroid/content/Context;", "defaultTabList", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "getDefaultTabList", "()Ljava/util/List;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "firstPageContentViewCreatedCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "getHostVM", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabDependeceViewModel;", "mTabCreators", "Ljava/util/EnumMap;", "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$IChatTabPageSpecCreator;", "mTabPageCache", "Lcom/ss/android/eventbus/LRUCache;", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "clearPageSpecCache", "", "getCacheSpecById", "id", "loadPageSpec", "chatTabs", "loadTabSpec", "chatTab", "firstTabId", "registerTabCreator", "chatTabType", "creator", "setFirstPageContentViewCreatedCallback", "callback", "transToPageSpec", "unRegisterTabCreator", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a */
public final class ChatPageSpecController {

    /* renamed from: a */
    private final EnumMap<ChatTab.ChatTabType, IChatTabPageSpec.IChatTabPageSpecCreator<?, ?>> f86720a = new EnumMap<>(ChatTab.ChatTabType.class);

    /* renamed from: b */
    private final LRUCache<Long, IChatTabPageSpec<?, ?>> f86721b = new LRUCache<>(10);

    /* renamed from: c */
    private IChatTabPageSpec.ContentViewCreatedCallback f86722c;

    /* renamed from: d */
    private AtomicBoolean f86723d = new AtomicBoolean(true);

    /* renamed from: e */
    private final List<ChatTab> f86724e = CollectionsKt.listOf(ChatTab.Companion.mo188420a());

    /* renamed from: f */
    private final Context f86725f;

    /* renamed from: g */
    private final ITabDependeceViewModel f86726g;

    /* renamed from: a */
    public final List<ChatTab> mo123579a() {
        return this.f86724e;
    }

    /* renamed from: a */
    public final void mo123581a(IChatTabPageSpec.ContentViewCreatedCallback aVar) {
        this.f86722c = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "it", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a$a */
    public static final class C33669a extends Lambda implements Function1<ChatTab, IChatTabPageSpec<?, ?>> {
        final /* synthetic */ long $firstTabId;
        final /* synthetic */ ChatPageSpecController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33669a(ChatPageSpecController aVar, long j) {
            super(1);
            this.this$0 = aVar;
            this.$firstTabId = j;
        }

        public final IChatTabPageSpec<?, ?> invoke(ChatTab chatTab) {
            Intrinsics.checkParameterIsNotNull(chatTab, "it");
            return this.this$0.mo123578a(chatTab, this.$firstTabId);
        }
    }

    /* renamed from: a */
    public final IChatTabPageSpec<?, ?> mo123577a(long j) {
        return this.f86721b.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public final List<IChatTabPageSpec<?, ?>> mo123580a(List<ChatTab> list) {
        long j;
        Intrinsics.checkParameterIsNotNull(list, "chatTabs");
        if (this.f86723d.get()) {
            this.f86723d.set(false);
            if (list.isEmpty()) {
                j = 100001;
            } else {
                j = list.get(0).getId();
            }
        } else {
            j = -1;
        }
        if (list.isEmpty()) {
            list = this.f86724e;
        }
        return m130484a(list, j);
    }

    /* renamed from: a */
    public final void mo123582a(ChatTab.ChatTabType chatTabType, IChatTabPageSpec.IChatTabPageSpecCreator<?, ?> cVar) {
        Intrinsics.checkParameterIsNotNull(chatTabType, "chatTabType");
        Intrinsics.checkParameterIsNotNull(cVar, "creator");
        this.f86720a.put((Object) chatTabType, cVar);
    }

    public ChatPageSpecController(Context context, ITabDependeceViewModel hVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hVar, "hostVM");
        this.f86725f = context;
        this.f86726g = hVar;
    }

    /* renamed from: a */
    private final List<IChatTabPageSpec<?, ?>> m130484a(List<ChatTab> list, long j) {
        C33669a aVar = new C33669a(this, j);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object invoke = aVar.invoke((Object) it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final IChatTabPageSpec<?, ?> mo123578a(ChatTab chatTab, long j) {
        IChatTabPageSpec.IChatTabPageSpecCreator<?, ?> cVar;
        IChatTabPageSpec.ContentViewCreatedCallback aVar;
        IChatTabPageSpec<?, ?> a = mo123577a(chatTab.getId());
        if (a == null && (cVar = this.f86720a.get(chatTab.getType())) != null) {
            String str = null;
            if (j == chatTab.getId()) {
                aVar = this.f86722c;
            } else {
                aVar = null;
            }
            C35219b b = this.f86726g.getInitData().mo5927b();
            if (b != null) {
                str = b.f90955e;
            }
            a = cVar.mo123600a(str, chatTab, aVar);
            if (chatTab.isSingleton()) {
                this.f86721b.put(Long.valueOf(a.mo123591a()), a);
            }
        }
        return a;
    }
}
