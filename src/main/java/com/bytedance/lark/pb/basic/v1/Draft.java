package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class Draft extends Message<Draft, C14894a> {
    public static final ProtoAdapter<Draft> ADAPTER = new C14895b();
    public static final Type DEFAULT_TYPE = Type.TEXT;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String content;
    public final String id;
    public final String message_id;
    public final Type type;

    public enum Type implements WireEnum {
        TEXT(1),
        POST(2),
        INDIVIDUAL_TOPIC(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return TEXT;
            }
            if (i == 2) {
                return POST;
            }
            if (i != 3) {
                return null;
            }
            return INDIVIDUAL_TOPIC;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Draft$b */
    private static final class C14895b extends ProtoAdapter<Draft> {
        C14895b() {
            super(FieldEncoding.LENGTH_DELIMITED, Draft.class);
        }

        /* renamed from: a */
        public int encodedSize(Draft draft) {
            int i;
            int i2;
            int i3 = 0;
            if (draft.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, draft.id);
            } else {
                i = 0;
            }
            if (draft.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, draft.chat_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (draft.message_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, draft.message_id);
            }
            return i4 + i3 + ProtoAdapter.STRING.encodedSizeWithTag(4, draft.content) + Type.ADAPTER.encodedSizeWithTag(5, draft.type) + draft.unknownFields().size();
        }

        /* renamed from: a */
        public Draft decode(ProtoReader protoReader) throws IOException {
            C14894a aVar = new C14894a();
            aVar.f39410a = "";
            aVar.f39411b = "";
            aVar.f39412c = "";
            aVar.f39413d = "";
            aVar.f39414e = Type.TEXT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39410a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39411b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f39412c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f39413d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39414e = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Draft draft) throws IOException {
            if (draft.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, draft.id);
            }
            if (draft.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, draft.chat_id);
            }
            if (draft.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, draft.message_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, draft.content);
            Type.ADAPTER.encodeWithTag(protoWriter, 5, draft.type);
            protoWriter.writeBytes(draft.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Draft$a */
    public static final class C14894a extends Message.Builder<Draft, C14894a> {

        /* renamed from: a */
        public String f39410a;

        /* renamed from: b */
        public String f39411b;

        /* renamed from: c */
        public String f39412c;

        /* renamed from: d */
        public String f39413d;

        /* renamed from: e */
        public Type f39414e;

        /* renamed from: a */
        public Draft build() {
            Type type;
            String str = this.f39413d;
            if (str != null && (type = this.f39414e) != null) {
                return new Draft(this.f39410a, this.f39411b, this.f39412c, str, type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "content", this.f39414e, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C14894a mo54583a(Type type) {
            this.f39414e = type;
            return this;
        }

        /* renamed from: b */
        public C14894a mo54586b(String str) {
            this.f39412c = str;
            return this;
        }

        /* renamed from: c */
        public C14894a mo54587c(String str) {
            this.f39413d = str;
            return this;
        }

        /* renamed from: a */
        public C14894a mo54584a(String str) {
            this.f39411b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14894a newBuilder() {
        C14894a aVar = new C14894a();
        aVar.f39410a = this.id;
        aVar.f39411b = this.chat_id;
        aVar.f39412c = this.message_id;
        aVar.f39413d = this.content;
        aVar.f39414e = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Draft");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "Draft{");
        replace.append('}');
        return replace.toString();
    }

    public Draft(String str, String str2, String str3, String str4, Type type2) {
        this(str, str2, str3, str4, type2, ByteString.EMPTY);
    }

    public Draft(String str, String str2, String str3, String str4, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.chat_id = str2;
        this.message_id = str3;
        this.content = str4;
        this.type = type2;
    }
}
