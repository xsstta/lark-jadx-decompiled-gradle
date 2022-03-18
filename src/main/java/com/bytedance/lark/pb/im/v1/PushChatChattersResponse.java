package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PushChatChattersResponse extends Message<PushChatChattersResponse, C17873a> {
    public static final ProtoAdapter<PushChatChattersResponse> ADAPTER = new C17874b();
    public static final Type DEFAULT_TYPE = Type.ADD_CHATTER;
    private static final long serialVersionUID = 0;
    public final Chat chat;
    public final C14928Entity entity;
    public final String operator_id;
    public final Map<String, Long> ordered_weight;
    public final Type type;

    public enum Type implements WireEnum {
        ADD_CHATTER(1),
        DELETE_CHATTER(2),
        DELETE_ME(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return ADD_CHATTER;
            }
            if (i == 2) {
                return DELETE_CHATTER;
            }
            if (i != 3) {
                return null;
            }
            return DELETE_ME;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatChattersResponse$b */
    private static final class C17874b extends ProtoAdapter<PushChatChattersResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Long>> f44949a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        C17874b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushChatChattersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushChatChattersResponse pushChatChattersResponse) {
            int i;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, pushChatChattersResponse.type) + Chat.ADAPTER.encodedSizeWithTag(2, pushChatChattersResponse.chat) + this.f44949a.encodedSizeWithTag(5, pushChatChattersResponse.ordered_weight);
            int i2 = 0;
            if (pushChatChattersResponse.operator_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, pushChatChattersResponse.operator_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pushChatChattersResponse.entity != null) {
                i2 = C14928Entity.ADAPTER.encodedSizeWithTag(7, pushChatChattersResponse.entity);
            }
            return i3 + i2 + pushChatChattersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushChatChattersResponse decode(ProtoReader protoReader) throws IOException {
            C17873a aVar = new C17873a();
            aVar.f44944a = Type.ADD_CHATTER;
            aVar.f44947d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44944a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44945b = Chat.ADAPTER.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f44946c.putAll(this.f44949a.decode(protoReader));
                } else if (nextTag == 6) {
                    aVar.f44947d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 7) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44948e = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushChatChattersResponse pushChatChattersResponse) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, pushChatChattersResponse.type);
            Chat.ADAPTER.encodeWithTag(protoWriter, 2, pushChatChattersResponse.chat);
            this.f44949a.encodeWithTag(protoWriter, 5, pushChatChattersResponse.ordered_weight);
            if (pushChatChattersResponse.operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pushChatChattersResponse.operator_id);
            }
            if (pushChatChattersResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 7, pushChatChattersResponse.entity);
            }
            protoWriter.writeBytes(pushChatChattersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatChattersResponse$a */
    public static final class C17873a extends Message.Builder<PushChatChattersResponse, C17873a> {

        /* renamed from: a */
        public Type f44944a;

        /* renamed from: b */
        public Chat f44945b;

        /* renamed from: c */
        public Map<String, Long> f44946c = Internal.newMutableMap();

        /* renamed from: d */
        public String f44947d;

        /* renamed from: e */
        public C14928Entity f44948e;

        /* renamed from: a */
        public PushChatChattersResponse build() {
            Chat chat;
            Type type = this.f44944a;
            if (type != null && (chat = this.f44945b) != null) {
                return new PushChatChattersResponse(type, chat, this.f44946c, this.f44947d, this.f44948e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f44945b, "chat");
        }
    }

    @Override // com.squareup.wire.Message
    public C17873a newBuilder() {
        C17873a aVar = new C17873a();
        aVar.f44944a = this.type;
        aVar.f44945b = this.chat;
        aVar.f44946c = Internal.copyOf("ordered_weight", this.ordered_weight);
        aVar.f44947d = this.operator_id;
        aVar.f44948e = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushChatChattersResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", chat=");
        sb.append(this.chat);
        if (!this.ordered_weight.isEmpty()) {
            sb.append(", ordered_weight=");
            sb.append(this.ordered_weight);
        }
        if (this.operator_id != null) {
            sb.append(", operator_id=");
            sb.append(this.operator_id);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "PushChatChattersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushChatChattersResponse(Type type2, Chat chat2, Map<String, Long> map, String str, C14928Entity entity2) {
        this(type2, chat2, map, str, entity2, ByteString.EMPTY);
    }

    public PushChatChattersResponse(Type type2, Chat chat2, Map<String, Long> map, String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.chat = chat2;
        this.ordered_weight = Internal.immutableCopyOf("ordered_weight", map);
        this.operator_id = str;
        this.entity = entity2;
    }
}
