package com.ss.android.lark.pin.impl.parser;

import com.bytedance.lark.pb.basic.v1.Message;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.entity.Pin;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/pin/impl/parser/ModelParserPin;", "", "()V", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.a.b */
public final class ModelParserPin {

    /* renamed from: a */
    public static final Companion f128146a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/pin/impl/parser/ModelParserPin$Companion;", "", "()V", "parsePinFromPb", "Lcom/ss/android/lark/pin/impl/entity/Pin;", "pbPin", "Lcom/bytedance/lark/pb/basic/v1/Message$Pin;", "chatId", "", "chatChatters", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatters;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Pin mo177332a(Message.Pin pin, String str, C33982a aVar) {
            ChatChatter chatChatter;
            AbstractC51472a.AbstractC51474b i;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            String str2 = null;
            if (pin != null) {
                if (aVar != null) {
                    chatChatter = aVar.mo124892a(str, pin.operator_id);
                } else {
                    chatChatter = null;
                }
                if (chatChatter != null) {
                    String nickName = chatChatter.getNickName();
                    chatChatter.setNickName("");
                    chatChatter.setNickName(nickName);
                    String str3 = pin.id;
                    String id = chatChatter.getId();
                    AbstractC51472a a = PinModule.f128091b.mo177253a();
                    if (!(a == null || (i = a.mo144035i()) == null)) {
                        str2 = i.mo144063a(chatChatter);
                    }
                    Long l = pin.timestamp;
                    Intrinsics.checkExpressionValueIsNotNull(l, "pbPin.timestamp");
                    return new Pin(str3, id, str2, l.longValue());
                }
            }
            return null;
        }
    }
}
