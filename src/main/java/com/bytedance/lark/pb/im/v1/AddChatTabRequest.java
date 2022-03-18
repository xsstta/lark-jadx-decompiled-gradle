package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.im.v1.ChatTab;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AddChatTabRequest extends Message<AddChatTabRequest, C17286a> {
    public static final ProtoAdapter<AddChatTabRequest> ADAPTER = new C17287b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final ChatTab.Type DEFAULT_TYPE = ChatTab.Type.Unknown;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final String name;
    public final ByteString payload;
    public final String payload_json;
    public final ChatTab.Type type;

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatTabRequest$b */
    private static final class C17287b extends ProtoAdapter<AddChatTabRequest> {
        C17287b() {
            super(FieldEncoding.LENGTH_DELIMITED, AddChatTabRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AddChatTabRequest addChatTabRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (addChatTabRequest.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, addChatTabRequest.chat_id);
            } else {
                i = 0;
            }
            if (addChatTabRequest.type != null) {
                i2 = ChatTab.Type.ADAPTER.encodedSizeWithTag(2, addChatTabRequest.type);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (addChatTabRequest.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, addChatTabRequest.name);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (addChatTabRequest.payload != null) {
                i4 = ProtoAdapter.BYTES.encodedSizeWithTag(4, addChatTabRequest.payload);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (addChatTabRequest.payload_json != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, addChatTabRequest.payload_json);
            }
            return i8 + i5 + addChatTabRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AddChatTabRequest decode(ProtoReader protoReader) throws IOException {
            C17286a aVar = new C17286a();
            aVar.f44119a = 0L;
            aVar.f44120b = ChatTab.Type.Unknown;
            aVar.f44121c = "";
            aVar.f44122d = ByteString.EMPTY;
            aVar.f44123e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44119a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f44120b = ChatTab.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f44121c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44122d = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44123e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AddChatTabRequest addChatTabRequest) throws IOException {
            if (addChatTabRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, addChatTabRequest.chat_id);
            }
            if (addChatTabRequest.type != null) {
                ChatTab.Type.ADAPTER.encodeWithTag(protoWriter, 2, addChatTabRequest.type);
            }
            if (addChatTabRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, addChatTabRequest.name);
            }
            if (addChatTabRequest.payload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, addChatTabRequest.payload);
            }
            if (addChatTabRequest.payload_json != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, addChatTabRequest.payload_json);
            }
            protoWriter.writeBytes(addChatTabRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatTabRequest$a */
    public static final class C17286a extends Message.Builder<AddChatTabRequest, C17286a> {

        /* renamed from: a */
        public Long f44119a;

        /* renamed from: b */
        public ChatTab.Type f44120b;

        /* renamed from: c */
        public String f44121c;

        /* renamed from: d */
        public ByteString f44122d;

        /* renamed from: e */
        public String f44123e;

        /* renamed from: a */
        public AddChatTabRequest build() {
            return new AddChatTabRequest(this.f44119a, this.f44120b, this.f44121c, this.f44122d, this.f44123e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17286a mo60742a(ChatTab.Type type) {
            this.f44120b = type;
            return this;
        }

        /* renamed from: b */
        public C17286a mo60746b(String str) {
            this.f44123e = str;
            return this;
        }

        /* renamed from: a */
        public C17286a mo60743a(Long l) {
            this.f44119a = l;
            return this;
        }

        /* renamed from: a */
        public C17286a mo60744a(String str) {
            this.f44121c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17286a newBuilder() {
        C17286a aVar = new C17286a();
        aVar.f44119a = this.chat_id;
        aVar.f44120b = this.type;
        aVar.f44121c = this.name;
        aVar.f44122d = this.payload;
        aVar.f44123e = this.payload_json;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "AddChatTabRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.payload_json != null) {
            sb.append(", payload_json=");
            sb.append(this.payload_json);
        }
        StringBuilder replace = sb.replace(0, 2, "AddChatTabRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AddChatTabRequest(Long l, ChatTab.Type type2, String str, ByteString byteString, String str2) {
        this(l, type2, str, byteString, str2, ByteString.EMPTY);
    }

    public AddChatTabRequest(Long l, ChatTab.Type type2, String str, ByteString byteString, String str2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.chat_id = l;
        this.type = type2;
        this.name = str;
        this.payload = byteString;
        this.payload_json = str2;
    }
}
