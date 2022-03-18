package com.ss.android.lark.pin;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pin.dto.ShowPinDialogParam;
import com.ss.android.lark.pin.impl.C51489b;
import com.ss.android.lark.pin.impl.C51501d;
import com.ss.android.lark.pin.impl.entity.Pin;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.service.PinService;
import com.ss.android.lark.pin.impl.statistics.ChatPinHitPoint;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ6\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J.\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u0006¨\u0006!"}, d2 = {"Lcom/ss/android/lark/pin/PinModule;", "", "dependency", "Lcom/ss/android/lark/pin/dependency/IPinModuleDependency;", "(Lcom/ss/android/lark/pin/dependency/IPinModuleDependency;)V", "getPinReadState", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "gotoPinActivityFromChat", "chatOwnerId", "context", "Landroid/content/Context;", "isGroup", "isSuperGroup", "chatterCount", "", "gotoPinActivityFromThread", "isSupportPinAction", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "onPin", "param", "Lcom/ss/android/lark/pin/dto/ShowPinDialogParam;", "isAdd", "showPinDialog", "statPinForwardConfirmEvent", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.a */
public final class PinModule {

    /* renamed from: a */
    public static AbstractC51472a f128090a;

    /* renamed from: b */
    public static final Companion f128091b = new Companion(null);

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC51472a m199585b() {
        return f128091b.mo177253a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/pin/PinModule$Companion;", "", "()V", "sDependency", "Lcom/ss/android/lark/pin/dependency/IPinModuleDependency;", "getDependency", "getFeatureGatingMap", "", "", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final AbstractC51472a mo177253a() {
            return PinModule.f128090a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo177246a() {
        ChatPinHitPoint.f128202a.mo177415g();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "isAdd", "", "onPin", "com/ss/android/lark/pin/PinModule$showPinDialog$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.a$b */
    public static final class C51471b implements C51489b.AbstractC51492a {

        /* renamed from: a */
        final /* synthetic */ PinModule f128092a;

        /* renamed from: b */
        final /* synthetic */ ShowPinDialogParam f128093b;

        /* renamed from: c */
        final /* synthetic */ PinInfo f128094c;

        C51471b(PinModule aVar, ShowPinDialogParam eVar, PinInfo bVar) {
            this.f128092a = aVar;
            this.f128093b = eVar;
            this.f128094c = bVar;
        }

        @Override // com.ss.android.lark.pin.impl.C51489b.AbstractC51492a
        /* renamed from: a */
        public final void mo177254a(boolean z) {
            this.f128092a.mo177248a(this.f128093b, z);
        }
    }

    public PinModule(AbstractC51472a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f128090a = aVar;
    }

    /* renamed from: a */
    public final void mo177247a(ShowPinDialogParam eVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(eVar, "param");
        PinModule aVar = null;
        Pin pin = null;
        if (!TextUtils.isEmpty(eVar.mo177288c())) {
            pin = new Pin(eVar.mo177288c(), eVar.mo177289d(), eVar.mo177290e(), eVar.mo177291f());
        }
        PinInfo bVar = new PinInfo(eVar.mo177287b(), pin, eVar.mo177296k(), "", "");
        PinModule aVar2 = this;
        if (bVar.mo177397h() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar = this;
        }
        PinModule aVar3 = aVar;
        if (aVar3 != null) {
            aVar3.mo177248a(eVar, true);
            if (aVar3 != null) {
                return;
            }
        }
        C51489b.m199741a(eVar.mo177286a(), bVar, eVar.mo177292g(), eVar.mo177293h(), eVar.mo177295j(), eVar.mo177294i(), eVar.mo177296k(), Boolean.valueOf(eVar.mo177298m()), new C51471b(aVar2, eVar, bVar));
        Unit unit = Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo177249a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        PinService.f128155a.mo177341b(str, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo177248a(ShowPinDialogParam eVar, boolean z) {
        String id = eVar.mo177287b().getId();
        Message.Type type = eVar.mo177287b().getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "param.msg.type");
        C51489b.m199747a(id, type.getNumber(), eVar.mo177292g(), eVar.mo177293h(), eVar.mo177294i(), z);
        ShowPinDialogParam.IPinActionListener l = eVar.mo177297l();
        if (l != null) {
            l.onPin(z);
        }
    }

    /* renamed from: a */
    public final boolean mo177252a(Chat chat, Message message) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return C51489b.m199748a(chat, message);
    }

    /* renamed from: a */
    public final void mo177251a(String str, String str2, boolean z, Context context, int i) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "chatOwnerId");
        Intrinsics.checkParameterIsNotNull(context, "context");
        C51501d.m199788a(context, str, str2, 2, 3, i, z);
    }

    /* renamed from: a */
    public final void mo177250a(String str, String str2, Context context, boolean z, boolean z2, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "chatOwnerId");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        C51501d.m199788a(context, str, str2, 1, i2, i, z2);
    }
}
