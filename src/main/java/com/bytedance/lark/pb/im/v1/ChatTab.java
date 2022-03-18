package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatTab extends Message<ChatTab, C17314a> {
    public static final ProtoAdapter<ChatTab> ADAPTER = new C17315b();
    public static final Long DEFAULT_ID = 0L;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Type DEFAULT_TYPE = Type.Unknown;
    private static final long serialVersionUID = 0;
    public final Long id;
    public final String name;
    public final ByteString payload;
    public final String payload_json;
    public final Type type;

    public enum Type implements WireEnum {
        Unknown(0),
        Message(1),
        DocSpace(2),
        Doc(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i == 1) {
                return Message;
            }
            if (i == 2) {
                return DocSpace;
            }
            if (i != 3) {
                return null;
            }
            return Doc;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatTab$b */
    private static final class C17315b extends ProtoAdapter<ChatTab> {
        C17315b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatTab.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatTab chatTab) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (chatTab.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, chatTab.id);
            } else {
                i = 0;
            }
            if (chatTab.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatTab.name);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (chatTab.type != null) {
                i3 = Type.ADAPTER.encodedSizeWithTag(3, chatTab.type);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (chatTab.payload != null) {
                i4 = ProtoAdapter.BYTES.encodedSizeWithTag(4, chatTab.payload);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (chatTab.payload_json != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, chatTab.payload_json);
            }
            return i8 + i5 + chatTab.unknownFields().size();
        }

        /* renamed from: a */
        public ChatTab decode(ProtoReader protoReader) throws IOException {
            C17314a aVar = new C17314a();
            aVar.f44158a = 0L;
            aVar.f44159b = "";
            aVar.f44160c = Type.Unknown;
            aVar.f44161d = ByteString.EMPTY;
            aVar.f44162e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44158a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44159b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f44160c = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f44161d = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44162e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatTab chatTab) throws IOException {
            if (chatTab.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, chatTab.id);
            }
            if (chatTab.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatTab.name);
            }
            if (chatTab.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, chatTab.type);
            }
            if (chatTab.payload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, chatTab.payload);
            }
            if (chatTab.payload_json != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, chatTab.payload_json);
            }
            protoWriter.writeBytes(chatTab.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatTab$a */
    public static final class C17314a extends Message.Builder<ChatTab, C17314a> {

        /* renamed from: a */
        public Long f44158a;

        /* renamed from: b */
        public String f44159b;

        /* renamed from: c */
        public Type f44160c;

        /* renamed from: d */
        public ByteString f44161d;

        /* renamed from: e */
        public String f44162e;

        /* renamed from: a */
        public ChatTab build() {
            return new ChatTab(this.f44158a, this.f44159b, this.f44160c, this.f44161d, this.f44162e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17314a newBuilder() {
        C17314a aVar = new C17314a();
        aVar.f44158a = this.id;
        aVar.f44159b = this.name;
        aVar.f44160c = this.type;
        aVar.f44161d = this.payload;
        aVar.f44162e = this.payload_json;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ChatTab");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.payload_json != null) {
            sb.append(", payload_json=");
            sb.append(this.payload_json);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatTab{");
        replace.append('}');
        return replace.toString();
    }

    public ChatTab(Long l, String str, Type type2, ByteString byteString, String str2) {
        this(l, str, type2, byteString, str2, ByteString.EMPTY);
    }

    public ChatTab(Long l, String str, Type type2, ByteString byteString, String str2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.id = l;
        this.name = str;
        this.type = type2;
        this.payload = byteString;
        this.payload_json = str2;
    }
}
