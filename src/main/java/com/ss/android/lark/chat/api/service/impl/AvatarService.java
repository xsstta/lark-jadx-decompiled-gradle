package com.ss.android.lark.chat.api.service.impl;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.TriggerPullAndPushEntityRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.dependence.IChatterAvatarService;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.service.impl.C34209g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002%&B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0007H\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\tH\u0016R,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/AvatarService;", "Lcom/larksuite/component/ui/dependence/IChatterAvatarService;", "Lcom/ss/android/lark/biz/im/api/IPushChatterListener;", "()V", "avatarChangeListeners", "Ljava/util/HashMap;", "", "", "Ljava/lang/ref/WeakReference;", "Lcom/larksuite/component/ui/dependence/IChatterAvatarService$OnAvatarChangeListener;", "isListening", "", "lastCleanupTime", "", "checkAvatar", "", BottomDialog.f17198f, "avatarKey", ShareHitPoint.f121869d, "Lcom/larksuite/component/ui/avatar/AvatarType;", "checkThread", "cleanupListenersIfNeed", "getTriggerType", "Lcom/bytedance/lark/pb/im/v1/TriggerPullAndPushEntityRequest$Type;", "notifyChange", "id", "key", "onPushChatter", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "registerAvatarChangeListener", "callback", "reportErrorIfNeed", "size", "startMonitorAvatarChange", "stopMonitorAvatarChange", "unRegisterAvatarChangeListener", "Companion", "HOLDER", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.b.a */
public final class AvatarService implements IChatterAvatarService, AbstractC29623p {

    /* renamed from: a */
    public static final Companion f84257a = new Companion(null);

    /* renamed from: b */
    private final HashMap<String, HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>>> f84258b;

    /* renamed from: c */
    private long f84259c;

    /* renamed from: d */
    private boolean f84260d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.a$c */
    static final class C32820c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C32820c f84263a = new C32820c();

        C32820c() {
        }

        /* renamed from: a */
        public final String parse(byte[] bArr) {
            return "";
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AvatarService m126107a() {
        return f84257a.mo121129a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/AvatarService$Companion;", "", "()V", "LOG_TAG", "", "MAX_LISTENER_SIZE", "", "inst", "Lcom/ss/android/lark/chat/api/service/impl/AvatarService;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final AvatarService mo121129a() {
            return HOLDER.f84261a.mo121130a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/AvatarService$HOLDER;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/chat/api/service/impl/AvatarService;", "getINSTANCE", "()Lcom/ss/android/lark/chat/api/service/impl/AvatarService;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.a$b */
    public static final class HOLDER {

        /* renamed from: a */
        public static final HOLDER f84261a = new HOLDER();

        /* renamed from: b */
        private static final AvatarService f84262b = new AvatarService(null);

        private HOLDER() {
        }

        /* renamed from: a */
        public final AvatarService mo121130a() {
            return f84262b;
        }
    }

    private AvatarService() {
        this.f84258b = new HashMap<>();
        this.f84259c = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    private final void m126111c() {
        if (!this.f84260d) {
            AvatarService aVar = this;
            C34209g.m132771a().mo126760b((AbstractC29623p) aVar);
            C34209g.m132771a().mo126756a((AbstractC29623p) aVar);
            this.f84260d = true;
        }
    }

    /* renamed from: d */
    private final void m126112d() {
        if (this.f84260d) {
            C34209g.m132771a().mo126760b((AbstractC29623p) this);
            this.f84260d = false;
        }
    }

    /* renamed from: e */
    private final void m126113e() {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        if (currentThread != mainLooper.getThread()) {
            throw new IllegalStateException("AvatarService thread not safe");
        }
    }

    /* renamed from: b */
    private final void m126110b() {
        IChatterAvatarService.OnAvatarChangeListener aVar;
        if (SystemClock.elapsedRealtime() - this.f84259c >= ((long) 30000)) {
            Iterator<Map.Entry<String, HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>>>> it = this.f84258b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>>> next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "iterator.next()");
                HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>> value = next.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
                HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>> hashMap = value;
                Set<Map.Entry<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>>> entrySet = hashMap.entrySet();
                Intrinsics.checkExpressionValueIsNotNull(entrySet, "referenceMap.entries");
                for (Map.Entry entry : CollectionsKt.reversed(entrySet)) {
                    WeakReference weakReference = (WeakReference) entry.getValue();
                    if (weakReference != null) {
                        aVar = (IChatterAvatarService.OnAvatarChangeListener) weakReference.get();
                    } else {
                        aVar = null;
                    }
                    if (aVar == null || !aVar.mo89089a()) {
                        hashMap.remove(entry.getKey());
                    }
                }
                if (hashMap.isEmpty()) {
                    it.remove();
                }
            }
            this.f84259c = SystemClock.elapsedRealtime();
        }
    }

    public /* synthetic */ AvatarService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    private final TriggerPullAndPushEntityRequest.Type m126106a(AvatarType avatarType) {
        if (avatarType == AvatarType.CHAT) {
            return TriggerPullAndPushEntityRequest.Type.CHAT;
        }
        return TriggerPullAndPushEntityRequest.Type.CHATTER;
    }

    /* renamed from: a */
    private final void m126108a(int i) {
        if (i > 25) {
            Log.m165385e("AvatarService", "Too many listener on avatar, size is:" + i, new Throwable(), true);
        }
    }

    @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
    public void onPushChatter(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Log.m165389i("AvatarService", "onPushChatter, id is:" + chatter.getId() + ", key is:" + chatter.getAvatarKey());
        String id = chatter.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
        String avatarKey = chatter.getAvatarKey();
        Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chatter.getAvatarKey()");
        m126109a(id, avatarKey);
    }

    @Override // com.larksuite.component.ui.dependence.IChatterAvatarService
    /* renamed from: b */
    public void mo89178b(String str, IChatterAvatarService.OnAvatarChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        m126113e();
        m126110b();
        HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>> hashMap = this.f84258b.get(str);
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(aVar.hashCode()));
            if (hashMap.isEmpty()) {
                this.f84258b.remove(str);
            }
        }
        if (this.f84258b.isEmpty()) {
            m126112d();
        }
    }

    /* renamed from: a */
    private final void m126109a(String str, String str2) {
        IChatterAvatarService.OnAvatarChangeListener aVar;
        m126113e();
        m126110b();
        HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>> hashMap = this.f84258b.get(str);
        if (hashMap != null) {
            Collection<WeakReference<IChatterAvatarService.OnAvatarChangeListener>> values = hashMap.values();
            Intrinsics.checkExpressionValueIsNotNull(values, "map.values");
            for (WeakReference weakReference : CollectionsKt.reversed(values)) {
                if (weakReference != null) {
                    aVar = (IChatterAvatarService.OnAvatarChangeListener) weakReference.get();
                } else {
                    aVar = null;
                }
                if (aVar != null && aVar.mo89089a()) {
                    aVar.mo89088a(str, str2);
                }
            }
        }
    }

    @Override // com.larksuite.component.ui.dependence.IChatterAvatarService
    /* renamed from: a */
    public void mo89176a(String str, IChatterAvatarService.OnAvatarChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        m126113e();
        m126110b();
        HashMap<Integer, WeakReference<IChatterAvatarService.OnAvatarChangeListener>> hashMap = this.f84258b.get(str);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f84258b.put(str, hashMap);
        }
        hashMap.put(Integer.valueOf(aVar.hashCode()), new WeakReference<>(aVar));
        m126108a(hashMap.size());
        m126111c();
    }

    @Override // com.larksuite.component.ui.dependence.IChatterAvatarService
    /* renamed from: a */
    public void mo89177a(String str, String str2, AvatarType avatarType) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(avatarType, ShareHitPoint.f121869d);
        TriggerPullAndPushEntityRequest.C18123a aVar = new TriggerPullAndPushEntityRequest.C18123a();
        aVar.f45282a = str;
        aVar.f45283b = m126106a(avatarType);
        SdkSender.asynSendRequestNonWrap(Command.TRIGGER_PULL_AND_PUSH_ENTITY, aVar, null, C32820c.f84263a);
    }
}
