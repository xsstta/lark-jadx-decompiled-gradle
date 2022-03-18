package com.ss.android.lark.chat.service.impl;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.Emoji;
import com.bytedance.lark.pb.im.v1.GetEmojisRequest;
import com.bytedance.lark.pb.im.v1.GetEmojisResponse;
import com.bytedance.lark.pb.im.v1.PushEmojis;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.IEmojiService;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.newemoji.EmojiMapManager;
import com.ss.android.lark.p2719t.C55244a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rH\u0016J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J,\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00132\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0!H\u0002J\b\u0010#\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chat/service/impl/EmojiService;", "Lcom/ss/android/lark/chat/api/service/IEmojiService;", "()V", "TAG", "", "isRequest", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mAccountChangeListener", "Lcom/ss/android/lark/dependency/ILoginDependency$IAccountChangeListener;", "mPushEmojiMapListener", "com/ss/android/lark/chat/service/impl/EmojiService$mPushEmojiMapListener$1", "Lcom/ss/android/lark/chat/service/impl/EmojiService$mPushEmojiMapListener$1;", "mPushEmojiMapListeners", "", "Lcom/ss/android/lark/chat/service/impl/EmojiService$IPushEmojiMapListener;", "destroy", "", "fetchEmojis", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "triggerKeys", "onPushEmojis", "request", "", "sid", "fromServerPipe", "", "offlinePush", "parseEmojisFromPb", "", "Lcom/ss/android/lark/newemoji/EmojiEntity;", "pbVersion", "pbMap", "", "Lcom/bytedance/lark/pb/im/v1/Emoji;", "registerListener", "unRegisterListener", "IPushEmojiMapListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.service.impl.j */
public final class EmojiService implements IEmojiService {

    /* renamed from: a */
    public static final EmojiService f88528a;

    /* renamed from: b */
    private static volatile AtomicBoolean f88529b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final List<IPushEmojiMapListener> f88530c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private static final AbstractC36450aa.AbstractC36451a f88531d;

    /* renamed from: e */
    private static final C34226e f88532e = new C34226e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/service/impl/EmojiService$IPushEmojiMapListener;", "", "onPushEmojiMap", "", "result", "", "Lcom/ss/android/lark/newemoji/EmojiEntity;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.j$a */
    public interface IPushEmojiMapListener {
        /* renamed from: a */
        void mo126782a(Set<? extends C55244a> set, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/service/impl/EmojiService$fetchEmojis$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/GetEmojisResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.j$c */
    public static final class C34224c implements IGetDataCallback<GetEmojisResponse> {
        C34224c() {
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            EmojiService jVar = EmojiService.f88528a;
            EmojiService.f88529b.compareAndSet(true, false);
            C53241h.m205898b("EmojiService", "get emojis wrong");
        }

        /* renamed from: a */
        public void onSuccess(GetEmojisResponse getEmojisResponse) {
            Intrinsics.checkParameterIsNotNull(getEmojisResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            EmojiService jVar = EmojiService.f88528a;
            EmojiService.f88529b.compareAndSet(true, false);
            Map<String, Emoji> map = getEmojisResponse.emojis;
            Integer num = getEmojisResponse.version;
            EmojiService jVar2 = EmojiService.f88528a;
            Intrinsics.checkExpressionValueIsNotNull(num, "pbVersion");
            int intValue = num.intValue();
            Intrinsics.checkExpressionValueIsNotNull(map, "pbMap");
            Set<C55244a> a = jVar2.mo126780a(intValue, map);
            if (a != null && Intrinsics.compare(num.intValue(), EmojiMapManager.f136337c.mo188275e()) > 0) {
                EmojiMapManager.f136337c.mo188267a(a, num.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/service/impl/EmojiService$mPushEmojiMapListener$1", "Lcom/ss/android/lark/chat/service/impl/EmojiService$IPushEmojiMapListener;", "onPushEmojiMap", "", "result", "", "Lcom/ss/android/lark/newemoji/EmojiEntity;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.j$e */
    public static final class C34226e implements IPushEmojiMapListener {
        C34226e() {
        }

        @Override // com.ss.android.lark.chat.service.impl.EmojiService.IPushEmojiMapListener
        /* renamed from: a */
        public void mo126782a(Set<? extends C55244a> set, int i) {
            Intrinsics.checkParameterIsNotNull(set, "result");
            EmojiMapManager.f136337c.mo188267a(set, i);
        }
    }

    private EmojiService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAccountChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.j$d */
    static final class C34225d implements AbstractC36450aa.AbstractC36451a {

        /* renamed from: a */
        public static final C34225d f88534a = new C34225d();

        C34225d() {
        }

        @Override // com.ss.android.lark.dependency.AbstractC36450aa.AbstractC36451a
        public final void onAccountChange() {
            EmojiMapManager.f136337c.mo188264a((EmojiMapManager.IResetEmojisCallback) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.j$g */
    public static final class C34228g implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C34228g f88537a = new C34228g();

        C34228g() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.PUSH_EMOJIS, C342291.f88538a);
        }
    }

    /* renamed from: b */
    private final void m132823b() {
        C53246j.m205910a(f88530c, f88532e, C34228g.f88537a);
    }

    @Override // com.ss.android.lark.chat.api.service.IEmojiService
    /* renamed from: a */
    public void mo121386a() {
        mo121387a(EmojiMapManager.f136337c.mo188275e(), (List<String>) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.j$f */
    public static final class RunnableC34227f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Set f88535a;

        /* renamed from: b */
        final /* synthetic */ Integer f88536b;

        RunnableC34227f(Set set, Integer num) {
            this.f88535a = set;
            this.f88536b = num;
        }

        public final void run() {
            EmojiService jVar = EmojiService.f88528a;
            for (IPushEmojiMapListener aVar : EmojiService.f88530c) {
                Set<? extends C55244a> set = this.f88535a;
                Integer num = this.f88536b;
                Intrinsics.checkExpressionValueIsNotNull(num, "pbVersion");
                aVar.mo126782a(set, num.intValue());
            }
        }
    }

    static {
        EmojiService jVar = new EmojiService();
        f88528a = jVar;
        C34225d dVar = C34225d.f88534a;
        f88531d = dVar;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134515N().mo134397a(dVar);
        jVar.m132823b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/GetEmojisResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.j$b */
    public static final class C34223b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C34223b f88533a = new C34223b();

        C34223b() {
        }

        /* renamed from: a */
        public final GetEmojisResponse parse(byte[] bArr) {
            return GetEmojisResponse.ADAPTER.decode(bArr);
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IEmojiService
    /* renamed from: a */
    public void mo121387a(int i, List<String> list) {
        if (f88529b.get()) {
            C53241h.m205898b("EmojiService", "is requesting, it can send request only get response");
            return;
        }
        f88529b.compareAndSet(false, true);
        GetEmojisRequest.C17574a a = new GetEmojisRequest.C17574a().mo61500a(Integer.valueOf(i));
        if (!CollectionUtils.isEmpty(list)) {
            a.mo61501a(list);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_EMOJIS, a, new C34224c(), C34223b.f88533a);
    }

    /* renamed from: a */
    public final Set<C55244a> mo126780a(int i, Map<String, Emoji> map) {
        boolean z;
        if (EmojiMapManager.f136337c.mo188275e() >= i || CollectionUtils.isEmpty(map)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Emoji> entry : map.entrySet()) {
            Emoji value = entry.getValue();
            String key = entry.getKey();
            if (EmojiMapManager.m214274a().containsKey(key) || EmojiMapManager.m214278b().containsKey(key)) {
                C55244a aVar = EmojiMapManager.m214274a().get(key);
                if (aVar == null) {
                    aVar = EmojiMapManager.m214278b().get(key);
                }
                if (aVar != null) {
                    if (!Intrinsics.areEqual(Boolean.valueOf(aVar.mo188262f()), value.is_deleted) || !TextUtils.equals(aVar.mo188259c(), value.text) || !TextUtils.equals(aVar.mo188260d(), value.image_key)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        hashSet.add(new C55244a(aVar.mo188256a(), aVar.mo188258b(), value.text, value.image_key, TextUtils.equals(aVar.mo188260d(), value.image_key) ? aVar.mo188261e() : null, value.is_deleted));
                    }
                }
            } else if (!TextUtils.isEmpty(key)) {
                hashSet.add(new C55244a(key, key, value.text, value.image_key, (Bitmap) null, value.is_deleted));
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo126781a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushEmojis decode = PushEmojis.ADAPTER.decode(bArr);
            Map<String, Emoji> map = decode.emojis;
            Integer num = decode.version;
            C53241h.m205898b("EmojiService", "push emojis, version = " + num + ", map size = " + map.size());
            Intrinsics.checkExpressionValueIsNotNull(num, "pbVersion");
            int intValue = num.intValue();
            Intrinsics.checkExpressionValueIsNotNull(map, "pbMap");
            Set<C55244a> a = mo126780a(intValue, map);
            if (a != null && Intrinsics.compare(num.intValue(), EmojiMapManager.f136337c.mo188275e()) > 0) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getFixedThreadPool().submit(new RunnableC34227f(a, num));
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
