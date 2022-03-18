package com.ss.android.lark.pin.impl.service;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.CreatePinRequest;
import com.bytedance.lark.pb.im.v1.DeletePinRequest;
import com.bytedance.lark.pb.im.v1.GetChatPinMessagesRequest;
import com.bytedance.lark.pb.im.v1.GetChatPinMessagesResponse;
import com.bytedance.lark.pb.im.v1.GetPinReadStatusRequest;
import com.bytedance.lark.pb.im.v1.GetPinReadStatusResponse;
import com.bytedance.lark.pb.im.v1.UpdatePinReadRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.ChatPinMessageEntity;
import com.ss.android.lark.pin.impl.entity.Pin;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.parser.ModelParserPin;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J6\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0016J\u001e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0016J&\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001d0\fH\u0016J\u001e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001d2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001e\u0010 \u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/pin/impl/service/PinService;", "Lcom/ss/android/lark/pin/impl/service/IPinService;", "()V", "mIChatDependency", "Lcom/ss/android/lark/pin/dependency/IPinModuleDependency$IChatDependency;", "mIDocDependency", "Lcom/ss/android/lark/pin/dependency/IPinModuleDependency$IDocDependency;", "createPin", "", "messageId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/lang/Void;", "deletePin", "getPinMessages", "fromLocal", "", "chatId", "timeStampCursor", "", "count", "", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "getPinReadState", "pinMessage", "isAdd", "pullPinNotificationSetting", "isFromServer", "Lcom/ss/android/lark/pin/impl/entity/PinSubscribeSetting;", "putPinNotificationSetting", "pinSubscribeSetting", "updatePinHasRead", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.b.a */
public final class PinService {

    /* renamed from: a */
    public static final PinService f128155a = new PinService();

    /* renamed from: b */
    private static final AbstractC51472a.AbstractC51474b f128156b;

    /* renamed from: c */
    private static final AbstractC51472a.AbstractC51477d f128157c;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.b.a$a */
    public static final class C51494a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C51494a f128158a = new C51494a();

        C51494a() {
        }

        /* renamed from: a */
        public final Void parse(byte[] bArr) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.b.a$b */
    public static final class C51495b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C51495b f128159a = new C51495b();

        C51495b() {
        }

        /* renamed from: a */
        public final Void parse(byte[] bArr) {
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.b.a$e */
    static final class C51498e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C51498e f128162a = new C51498e();

        C51498e() {
        }

        /* renamed from: a */
        public final Void parse(byte[] bArr) {
            return null;
        }
    }

    private PinService() {
    }

    static {
        AbstractC51472a.AbstractC51474b bVar;
        AbstractC51472a a = PinModule.f128091b.mo177253a();
        AbstractC51472a.AbstractC51477d dVar = null;
        if (a != null) {
            bVar = a.mo144035i();
        } else {
            bVar = null;
        }
        f128156b = bVar;
        AbstractC51472a a2 = PinModule.f128091b.mo177253a();
        if (a2 != null) {
            dVar = a2.mo144036j();
        }
        f128157c = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/pin/impl/service/PinService$getPinMessages$parser$1", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.b.a$c */
    public static final class C51496c implements SdkSender.IParser<ChatPinMessageEntity> {

        /* renamed from: a */
        final /* synthetic */ String f128160a;

        C51496c(String str) {
            this.f128160a = str;
        }

        /* renamed from: a */
        public ChatPinMessageEntity parse(byte[] bArr) {
            String str;
            String str2;
            String str3;
            Chatter a;
            String id;
            Chatter a2;
            String avatarKey;
            AbstractC51472a.AbstractC51474b i;
            AbstractC51472a.AbstractC51474b i2;
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            GetChatPinMessagesResponse decode = GetChatPinMessagesResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetChatPinMessagesResponse.ADAPTER.decode(data)");
            GetChatPinMessagesResponse getChatPinMessagesResponse = decode;
            ArrayList arrayList = new ArrayList();
            AbstractC51472a a3 = PinModule.f128091b.mo177253a();
            List<Message> a4 = (a3 == null || (i2 = a3.mo144035i()) == null) ? null : i2.mo144064a(getChatPinMessagesResponse.entity, getChatPinMessagesResponse.ordered_message_ids);
            AbstractC51472a a5 = PinModule.f128091b.mo177253a();
            C33982a a6 = (a5 == null || (i = a5.mo144035i()) == null) ? null : i.mo144059a(getChatPinMessagesResponse.entity, this.f128160a);
            if (a4 != null) {
                for (T t : a4) {
                    if (!t.isMessageDisable()) {
                        com.bytedance.lark.pb.basic.v1.Message message = getChatPinMessagesResponse.entity.messages.get(t.getId());
                        Pin a7 = ModelParserPin.f128146a.mo177332a(message != null ? message.pin : null, this.f128160a, a6);
                        PinService aVar = PinService.f128155a;
                        AbstractC51472a.AbstractC51474b bVar = PinService.f128156b;
                        if (bVar != null) {
                            String a8 = bVar.mo144063a(a6 != null ? a6.mo124892a(t.getChatId(), t.getFromId()) : null);
                            if (a8 != null) {
                                str = a8;
                                if (a6 != null || (a2 = a6.mo124893a(t.getFromId())) == null || (avatarKey = a2.getAvatarKey()) == null) {
                                    str2 = "";
                                } else {
                                    str2 = avatarKey;
                                }
                                Intrinsics.checkExpressionValueIsNotNull(str2, "chatChatters?.getChatter…Id)?.getAvatarKey() ?: \"\"");
                                if (a6 != null || (a = a6.mo124893a(t.getFromId())) == null || (id = a.getId()) == null) {
                                    str3 = "";
                                } else {
                                    str3 = id;
                                }
                                Intrinsics.checkExpressionValueIsNotNull(str3, "chatChatters?.getChatter…sg.fromId)?.getId() ?: \"\"");
                                arrayList.add(new PinInfo(t, a7, str, str2, str3));
                            }
                        }
                        str = "";
                        if (a6 != null) {
                        }
                        str2 = "";
                        Intrinsics.checkExpressionValueIsNotNull(str2, "chatChatters?.getChatter…Id)?.getAvatarKey() ?: \"\"");
                        if (a6 != null) {
                        }
                        str3 = "";
                        Intrinsics.checkExpressionValueIsNotNull(str3, "chatChatters?.getChatter…sg.fromId)?.getId() ?: \"\"");
                        arrayList.add(new PinInfo(t, a7, str, str2, str3));
                    }
                }
            }
            Boolean bool = getChatPinMessagesResponse.has_more;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.has_more");
            boolean booleanValue = bool.booleanValue();
            int size = arrayList.size();
            Long l = getChatPinMessagesResponse.last_read_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.last_read_time");
            return new ChatPinMessageEntity(arrayList, booleanValue, size, l.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "invoke", "([B)Ljava/lang/Boolean;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.b.a$d */
    public static final class C51497d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C51497d f128161a = new C51497d();

        C51497d() {
        }

        /* renamed from: a */
        public final Boolean parse(byte[] bArr) {
            GetPinReadStatusResponse decode = GetPinReadStatusResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetPinReadStatusResponse.ADAPTER.decode(data)");
            return decode.has_unread_pin;
        }
    }

    /* renamed from: c */
    private final void m199763c(String str, IGetDataCallback<Void> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_PIN, new CreatePinRequest.C17372a().mo60974a(str), iGetDataCallback, C51494a.f128158a);
    }

    /* renamed from: d */
    private final void m199764d(String str, IGetDataCallback<Void> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_PIN, new DeletePinRequest.C17418a().mo61109a(str), iGetDataCallback, C51495b.f128159a);
    }

    /* renamed from: a */
    public void mo177338a(String str, IGetDataCallback<Void> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_PIN_READ, new UpdatePinReadRequest.C18156a().mo62981a(str), iGetDataCallback, C51498e.f128162a);
    }

    /* renamed from: b */
    public void mo177341b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetPinReadStatusRequest.C17664a a = new GetPinReadStatusRequest.C17664a().mo61733a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "GetPinReadStatusRequest.Builder().chat_id(chatId)");
        SdkSender.asynSendRequestNonWrap(Command.GET_PIN_READ_STATUS, a, iGetDataCallback, C51497d.f128161a);
    }

    /* renamed from: a */
    public void mo177339a(String str, boolean z, IGetDataCallback<Void> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (z) {
            m199763c(str, iGetDataCallback);
        } else {
            m199764d(str, iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo177340a(boolean z, String str, long j, int i, IGetDataCallback<ChatPinMessageEntity> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetChatPinMessagesRequest.C17534a a = new GetChatPinMessagesRequest.C17534a().mo61409a(Long.valueOf(j)).mo61408a(Integer.valueOf(i)).mo61407a(Boolean.valueOf(!z));
        Intrinsics.checkExpressionValueIsNotNull(a, "GetChatPinMessagesReques…s_from_server(!fromLocal)");
        if (!TextUtils.isEmpty(str)) {
            a.mo61410a(str);
        }
        C51496c cVar = new C51496c(str);
        if (z) {
            SdkSender.sendLocalRequest(Command.GET_CHAT_PIN_MESSAGES, a, iGetDataCallback, cVar);
        } else {
            SdkSender.sendNetRequest(Command.GET_CHAT_PIN_MESSAGES, a, iGetDataCallback, cVar);
        }
    }
}
