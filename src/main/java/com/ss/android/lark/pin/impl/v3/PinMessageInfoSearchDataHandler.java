package com.ss.android.lark.pin.impl.v3;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.ChatPinMessageEntity;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.entity.SearchFilter;
import com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\b\u0010!\u001a\u00020\u001bH\u0014J\u0014\u0010\"\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006%"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoSearchDataHandler;", "Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler;", "chatId", "", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "handlerCallback", "Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;", "(Ljava/lang/String;Lcom/larksuite/framework/callback/CallbackManager;Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;)V", "filter", "Lcom/ss/android/lark/pin/impl/entity/SearchFilter;", "getFilter", "()Lcom/ss/android/lark/pin/impl/entity/SearchFilter;", "lastMessageId", "getLastMessageId", "()Ljava/lang/String;", "setLastMessageId", "(Ljava/lang/String;)V", "searchKey", "getSearchKey", "setSearchKey", "compareInfo", "", "info1", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "info2", "loadImpl", "", "offset", "count", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "onLoadFirstPage", "setFilterChatIds", "chatIds", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.f */
public final class PinMessageInfoSearchDataHandler extends PinMessageInfoBaseDataHandler {

    /* renamed from: a */
    private String f128475a = "";

    /* renamed from: b */
    private final SearchFilter f128476b = new SearchFilter();

    /* renamed from: c */
    private String f128477c = "0";

    /* renamed from: k */
    public final String mo177656k() {
        return this.f128475a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler
    /* renamed from: g */
    public void mo177639g() {
        super.mo177639g();
        this.f128477c = "0";
        mo177622a(System.currentTimeMillis() / ((long) 1000));
    }

    /* renamed from: a */
    public final void mo177653a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128475a = str;
    }

    /* renamed from: b */
    public final void mo177654b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128477c = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/pin/impl/v3/PinMessageInfoSearchDataHandler$loadImpl$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.f$a */
    public static final class C51636a implements IGetDataCallback<ChatPinMessageEntity> {

        /* renamed from: a */
        final /* synthetic */ PinMessageInfoSearchDataHandler f128478a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f128479b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f128479b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(ChatPinMessageEntity aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            PinInfo bVar = (PinInfo) CollectionsKt.lastOrNull((List) aVar.mo177262d());
            if (bVar != null) {
                PinMessageInfoSearchDataHandler fVar = this.f128478a;
                fVar.mo177622a(Math.min(fVar.mo177637e(), bVar.mo177396g().getUpdateTime()));
                PinMessageInfoSearchDataHandler fVar2 = this.f128478a;
                String id = bVar.mo177396g().getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "message.id");
                fVar2.mo177654b(id);
            }
            this.f128479b.onSuccess(aVar);
        }

        C51636a(PinMessageInfoSearchDataHandler fVar, IGetDataCallback iGetDataCallback) {
            this.f128478a = fVar;
            this.f128479b = iGetDataCallback;
        }
    }

    /* renamed from: b */
    public final void mo177655b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "chatIds");
        List<String> a = this.f128476b.mo177399a();
        a.clear();
        a.addAll(list);
    }

    @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler
    /* renamed from: a */
    public int mo177619a(PinInfo bVar, PinInfo bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "info1");
        Intrinsics.checkParameterIsNotNull(bVar2, "info2");
        Message g = bVar.mo177396g();
        Message g2 = bVar2.mo177396g();
        if (g.getUpdateTime() > g2.getUpdateTime()) {
            return -1;
        }
        if (g.getUpdateTime() < g2.getUpdateTime()) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinMessageInfoSearchDataHandler(String str, CallbackManager callbackManager, PinMessageInfoBaseDataHandler.IDataHandleCallback aVar) {
        super(str, callbackManager, aVar);
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        Intrinsics.checkParameterIsNotNull(aVar, "handlerCallback");
    }

    @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler
    /* renamed from: a */
    public void mo177621a(int i, int i2, IGetDataCallback<ChatPinMessageEntity> iGetDataCallback) {
        AbstractC51472a.AbstractC51484j k;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC51472a a = PinModule.f128091b.mo177253a();
        if (a != null && (k = a.mo144037k()) != null) {
            k.mo144046a(this.f128475a, mo177640h(), mo177637e(), this.f128477c, i2, new C51636a(this, iGetDataCallback));
        }
    }
}
