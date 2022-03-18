package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class AuthScene extends Message<AuthScene, C19451a> {
    public static final ProtoAdapter<AuthScene> ADAPTER = new C19452b();
    public static final Type DEFAULT_TYPE = Type.DEFAULT;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Type type;

    public enum Type implements WireEnum {
        DEFAULT(0),
        MESSAGE(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return MESSAGE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.AuthScene$b */
    private static final class C19452b extends ProtoAdapter<AuthScene> {
        C19452b() {
            super(FieldEncoding.LENGTH_DELIMITED, AuthScene.class);
        }

        /* renamed from: a */
        public int encodedSize(AuthScene authScene) {
            int i;
            int i2 = 0;
            if (authScene.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, authScene.id);
            } else {
                i = 0;
            }
            if (authScene.type != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(2, authScene.type);
            }
            return i + i2 + authScene.unknownFields().size();
        }

        /* renamed from: a */
        public AuthScene decode(ProtoReader protoReader) throws IOException {
            C19451a aVar = new C19451a();
            aVar.f47783a = "";
            aVar.f47784b = Type.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47783a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47784b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AuthScene authScene) throws IOException {
            if (authScene.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, authScene.id);
            }
            if (authScene.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, authScene.type);
            }
            protoWriter.writeBytes(authScene.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.AuthScene$a */
    public static final class C19451a extends Message.Builder<AuthScene, C19451a> {

        /* renamed from: a */
        public String f47783a;

        /* renamed from: b */
        public Type f47784b;

        /* renamed from: a */
        public AuthScene build() {
            return new AuthScene(this.f47783a, this.f47784b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19451a mo66185a(Type type) {
            this.f47784b = type;
            return this;
        }

        /* renamed from: a */
        public C19451a mo66186a(String str) {
            this.f47783a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19451a newBuilder() {
        C19451a aVar = new C19451a();
        aVar.f47783a = this.id;
        aVar.f47784b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "AuthScene");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "AuthScene{");
        replace.append('}');
        return replace.toString();
    }

    public AuthScene(String str, Type type2) {
        this(str, type2, ByteString.EMPTY);
    }

    public AuthScene(String str, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
    }
}
