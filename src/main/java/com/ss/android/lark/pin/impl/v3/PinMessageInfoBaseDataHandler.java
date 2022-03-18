package com.ss.android.lark.pin.impl.v3;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pin.dto.ChatPinMessageEntity;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0002CDB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0/2\u0006\u00100\u001a\u00020\u0010J\u0018\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020%H&J\f\u00104\u001a\b\u0012\u0004\u0012\u00020%0!J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020'H\u0002J\u000e\u00107\u001a\u00020-2\u0006\u00106\u001a\u00020'J&\u00108\u001a\u00020-2\u0006\u0010&\u001a\u00020'2\u0006\u00106\u001a\u00020'2\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H&J\u000e\u0010<\u001a\u00020-2\u0006\u00106\u001a\u00020'J\u0010\u0010=\u001a\u00020-2\u0006\u00100\u001a\u00020\u0010H\u0002J\b\u0010>\u001a\u00020-H\u0014J\u000e\u0010?\u001a\u00020-2\u0006\u00109\u001a\u00020\"J\u0014\u0010@\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0/J\u001c\u0010A\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0/2\u0006\u00100\u001a\u00020\u0010J\u000e\u0010B\u001a\u00020-2\u0006\u00109\u001a\u00020\"R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%0$X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006E"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler;", "", "chatId", "", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "handlerCallback", "Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;", "(Ljava/lang/String;Lcom/larksuite/framework/callback/CallbackManager;Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;)V", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "getChatId", "()Ljava/lang/String;", "getHandlerCallback", "()Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;", "value", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "isLoading", "setLoading", "isLocal", "setLocal", "lastTimeStampCursor", "", "getLastTimeStampCursor", "()J", "setLastTimeStampCursor", "(J)V", "mCallbacks", "", "Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$OnDataChangedCallback;", "mInfoMap", "", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "appendInfos", "", "infos", "", "showLoading", "compareInfo", "info1", "info2", "getPinInfos", "load", "count", "loadFirstPage", "loadImpl", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "loadMore", "notifyDataChanged", "onLoadFirstPage", "register", "removeInfos", "resetInfos", "unregister", "IDataHandleCallback", "OnDataChangedCallback", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.d */
public abstract class PinMessageInfoBaseDataHandler {

    /* renamed from: a */
    private final Map<String, PinInfo> f128458a = new HashMap();

    /* renamed from: b */
    private final List<OnDataChangedCallback> f128459b = new ArrayList();

    /* renamed from: c */
    private boolean f128460c;

    /* renamed from: d */
    private int f128461d;

    /* renamed from: e */
    private boolean f128462e;

    /* renamed from: f */
    private boolean f128463f = true;

    /* renamed from: g */
    private long f128464g;

    /* renamed from: h */
    private final String f128465h;

    /* renamed from: i */
    private final CallbackManager f128466i;

    /* renamed from: j */
    private final IDataHandleCallback f128467j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;", "", "onHandelError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "isFirstPage", "", "onHandleSuccess", "entity", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.d$a */
    public interface IDataHandleCallback {
        /* renamed from: a */
        void mo177486a(ErrorResult errorResult, boolean z);

        /* renamed from: a */
        boolean mo177487a(ChatPinMessageEntity aVar, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$OnDataChangedCallback;", "", "onDataChanged", "", "messageInfos", "", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "showLoading", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.d$b */
    public interface OnDataChangedCallback {
        void onDataChanged(List<PinInfo> list, boolean z);
    }

    /* renamed from: a */
    public abstract int mo177619a(PinInfo bVar, PinInfo bVar2);

    /* renamed from: a */
    public abstract void mo177621a(int i, int i2, IGetDataCallback<ChatPinMessageEntity> iGetDataCallback);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo177628b() {
        return this.f128461d;
    }

    /* renamed from: d */
    public final boolean mo177636d() {
        return this.f128463f;
    }

    /* renamed from: e */
    public final long mo177637e() {
        return this.f128464g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo177640h() {
        return this.f128465h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final CallbackManager mo177641i() {
        return this.f128466i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final IDataHandleCallback mo177642j() {
        return this.f128467j;
    }

    /* renamed from: c */
    public final boolean mo177635c() {
        return this.f128462e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo177639g() {
        this.f128461d = 0;
        mo177634c(true);
        this.f128464g = 0;
    }

    /* renamed from: f */
    public final List<PinInfo> mo177638f() {
        ArrayList arrayList = new ArrayList(this.f128458a.values());
        CollectionsKt.sortWith(arrayList, new C51634c(this));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo177627a() {
        return this.f128460c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo177634c(boolean z) {
        this.f128463f = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$load$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "entity", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.d$d */
    public static final class C51635d implements IGetDataCallback<ChatPinMessageEntity> {

        /* renamed from: a */
        final /* synthetic */ PinMessageInfoBaseDataHandler f128469a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51635d(PinMessageInfoBaseDataHandler dVar) {
            this.f128469a = dVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IDataHandleCallback j = this.f128469a.mo177642j();
            if (this.f128469a.mo177628b() == 0) {
                z = true;
            } else {
                z = false;
            }
            j.mo177486a(errorResult, z);
        }

        /* renamed from: a */
        public void onSuccess(ChatPinMessageEntity aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "entity");
            boolean z = false;
            this.f128469a.mo177632b(false);
            if (this.f128469a.mo177628b() == 0) {
                z = true;
            }
            int size = aVar.mo177262d().size();
            PinMessageInfoBaseDataHandler dVar = this.f128469a;
            dVar.mo177620a(dVar.mo177628b() + size);
            if (this.f128469a.mo177642j().mo177487a(aVar, z)) {
                this.f128469a.mo177634c(aVar.mo177263e());
                if (z) {
                    this.f128469a.mo177625a(aVar.mo177262d(), this.f128469a.mo177627a());
                } else {
                    this.f128469a.mo177631b(aVar.mo177262d(), this.f128469a.mo177627a());
                }
            } else {
                PinMessageInfoBaseDataHandler dVar2 = this.f128469a;
                dVar2.mo177620a(dVar2.mo177628b() - size);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo177620a(int i) {
        this.f128461d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo177632b(boolean z) {
        this.f128462e = z;
    }

    /* renamed from: c */
    public final void mo177633c(int i) {
        mo177639g();
        m200291d(i);
    }

    /* renamed from: b */
    public final void mo177629b(int i) {
        if (this.f128463f) {
            mo177634c(false);
            m200291d(i);
        }
    }

    /* renamed from: d */
    private final void m200291d(int i) {
        mo177632b(true);
        mo177621a(this.f128461d, i, new C51635d(this));
    }

    /* renamed from: a */
    public final void mo177622a(long j) {
        this.f128464g = j;
    }

    /* renamed from: b */
    public final void mo177630b(OnDataChangedCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        this.f128459b.remove(bVar);
    }

    /* renamed from: d */
    private final void mo177649d(boolean z) {
        List<PinInfo> f = mo177638f();
        Iterator<T> it = this.f128459b.iterator();
        while (it.hasNext()) {
            it.next().onDataChanged(f, z);
        }
    }

    /* renamed from: a */
    public final void mo177623a(OnDataChangedCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        this.f128459b.add(bVar);
    }

    /* renamed from: a */
    public final void mo177624a(List<? extends PinInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infos");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f128458a.remove(it.next().mo177396g().getId());
        }
        mo177649d(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo177626a(boolean z) {
        this.f128460c = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.d$c */
    public static final class C51634c<T> implements Comparator<PinInfo> {

        /* renamed from: a */
        final /* synthetic */ PinMessageInfoBaseDataHandler f128468a;

        C51634c(PinMessageInfoBaseDataHandler dVar) {
            this.f128468a = dVar;
        }

        /* renamed from: a */
        public final int compare(PinInfo bVar, PinInfo bVar2) {
            PinMessageInfoBaseDataHandler dVar = this.f128468a;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "o1");
            Intrinsics.checkExpressionValueIsNotNull(bVar2, "o2");
            return dVar.mo177619a(bVar, bVar2);
        }
    }

    /* renamed from: b */
    public final void mo177631b(List<? extends PinInfo> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "infos");
        for (T t : list) {
            Map<String, PinInfo> map = this.f128458a;
            String id = t.mo177396g().getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "it.message.id");
            map.put(id, t);
        }
        mo177649d(z);
    }

    /* renamed from: a */
    public final void mo177625a(List<? extends PinInfo> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "infos");
        this.f128458a.clear();
        for (T t : list) {
            Map<String, PinInfo> map = this.f128458a;
            String id = t.mo177396g().getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "it.message.id");
            map.put(id, t);
        }
        mo177649d(z);
    }

    public PinMessageInfoBaseDataHandler(String str, CallbackManager callbackManager, IDataHandleCallback aVar) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        Intrinsics.checkParameterIsNotNull(aVar, "handlerCallback");
        this.f128465h = str;
        this.f128466i = callbackManager;
        this.f128467j = aVar;
    }
}
