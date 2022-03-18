package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AddChatChattersRequest extends Message<AddChatChattersRequest, C17282a> {
    public static final ProtoAdapter<AddChatChattersRequest> ADAPTER = new C17283b();
    public static final Source DEFAULT_SOURCE = Source.Unknown;
    public static final Type DEFAULT_TYPE = Type.INVITATION;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> chatter_ids;
    public final String inviter_id;
    public final String join_token;
    public final String message_id;
    public final List<PickEntities> pick_entities;
    public final Source source;
    public final Type type;

    public enum Source implements WireEnum {
        Unknown(0),
        ChatTemplate(10);
        
        public static final ProtoAdapter<Source> ADAPTER = ProtoAdapter.newEnumAdapter(Source.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Source fromValue(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i != 10) {
                return null;
            }
            return ChatTemplate;
        }

        private Source(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        INVITATION(1),
        SHARE(2),
        QRCODE(3),
        MENTION_INVITATION(4);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return INVITATION;
            }
            if (i == 2) {
                return SHARE;
            }
            if (i == 3) {
                return QRCODE;
            }
            if (i != 4) {
                return null;
            }
            return MENTION_INVITATION;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatChattersRequest$b */
    private static final class C17283b extends ProtoAdapter<AddChatChattersRequest> {
        C17283b() {
            super(FieldEncoding.LENGTH_DELIMITED, AddChatChattersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AddChatChattersRequest addChatChattersRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (addChatChattersRequest.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, addChatChattersRequest.type);
            } else {
                i = 0;
            }
            if (addChatChattersRequest.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, addChatChattersRequest.chat_id);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, addChatChattersRequest.chatter_ids) + PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(7, addChatChattersRequest.pick_entities);
            if (addChatChattersRequest.join_token != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, addChatChattersRequest.join_token);
            } else {
                i3 = 0;
            }
            int i7 = encodedSizeWithTag + i3;
            if (addChatChattersRequest.message_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, addChatChattersRequest.message_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (addChatChattersRequest.inviter_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, addChatChattersRequest.inviter_id);
            } else {
                i5 = 0;
            }
            int i9 = i8 + i5;
            if (addChatChattersRequest.source != null) {
                i6 = Source.ADAPTER.encodedSizeWithTag(9, addChatChattersRequest.source);
            }
            return i9 + i6 + addChatChattersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AddChatChattersRequest decode(ProtoReader protoReader) throws IOException {
            C17282a aVar = new C17282a();
            aVar.f44108a = Type.INVITATION;
            aVar.f44109b = "";
            aVar.f44112e = "";
            aVar.f44113f = "";
            aVar.f44114g = "";
            aVar.f44115h = Source.Unknown;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f44108a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f44109b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44110c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f44112e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44113f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44114g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44111d.add(PickEntities.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 9:
                            try {
                                aVar.f44115h = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AddChatChattersRequest addChatChattersRequest) throws IOException {
            if (addChatChattersRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, addChatChattersRequest.type);
            }
            if (addChatChattersRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, addChatChattersRequest.chat_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, addChatChattersRequest.chatter_ids);
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, addChatChattersRequest.pick_entities);
            if (addChatChattersRequest.join_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, addChatChattersRequest.join_token);
            }
            if (addChatChattersRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, addChatChattersRequest.message_id);
            }
            if (addChatChattersRequest.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, addChatChattersRequest.inviter_id);
            }
            if (addChatChattersRequest.source != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 9, addChatChattersRequest.source);
            }
            protoWriter.writeBytes(addChatChattersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatChattersRequest$a */
    public static final class C17282a extends Message.Builder<AddChatChattersRequest, C17282a> {

        /* renamed from: a */
        public Type f44108a;

        /* renamed from: b */
        public String f44109b;

        /* renamed from: c */
        public List<String> f44110c = Internal.newMutableList();

        /* renamed from: d */
        public List<PickEntities> f44111d = Internal.newMutableList();

        /* renamed from: e */
        public String f44112e;

        /* renamed from: f */
        public String f44113f;

        /* renamed from: g */
        public String f44114g;

        /* renamed from: h */
        public Source f44115h;

        /* renamed from: a */
        public AddChatChattersRequest build() {
            return new AddChatChattersRequest(this.f44108a, this.f44109b, this.f44110c, this.f44111d, this.f44112e, this.f44113f, this.f44114g, this.f44115h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17282a mo60727a(Type type) {
            this.f44108a = type;
            return this;
        }

        /* renamed from: b */
        public C17282a mo60731b(String str) {
            this.f44112e = str;
            return this;
        }

        /* renamed from: c */
        public C17282a mo60733c(String str) {
            this.f44113f = str;
            return this;
        }

        /* renamed from: d */
        public C17282a mo60734d(String str) {
            this.f44114g = str;
            return this;
        }

        /* renamed from: a */
        public C17282a mo60728a(String str) {
            this.f44109b = str;
            return this;
        }

        /* renamed from: b */
        public C17282a mo60732b(List<PickEntities> list) {
            Internal.checkElementsNotNull(list);
            this.f44111d = list;
            return this;
        }

        /* renamed from: a */
        public C17282a mo60729a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44110c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17282a newBuilder() {
        C17282a aVar = new C17282a();
        aVar.f44108a = this.type;
        aVar.f44109b = this.chat_id;
        aVar.f44110c = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44111d = Internal.copyOf("pick_entities", this.pick_entities);
        aVar.f44112e = this.join_token;
        aVar.f44113f = this.message_id;
        aVar.f44114g = this.inviter_id;
        aVar.f44115h = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "AddChatChattersRequest");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (!this.pick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.pick_entities);
        }
        if (this.join_token != null) {
            sb.append(", join_token=");
            sb.append(this.join_token);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "AddChatChattersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AddChatChattersRequest(Type type2, String str, List<String> list, List<PickEntities> list2, String str2, String str3, String str4, Source source2) {
        this(type2, str, list, list2, str2, str3, str4, source2, ByteString.EMPTY);
    }

    public AddChatChattersRequest(Type type2, String str, List<String> list, List<PickEntities> list2, String str2, String str3, String str4, Source source2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.chat_id = str;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.pick_entities = Internal.immutableCopyOf("pick_entities", list2);
        this.join_token = str2;
        this.message_id = str3;
        this.inviter_id = str4;
        this.source = source2;
    }
}
