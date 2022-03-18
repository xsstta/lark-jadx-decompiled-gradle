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

public final class Icon extends Message<Icon, C15007a> {
    public static final ProtoAdapter<Icon> ADAPTER = new C15008b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Type type;
    public final String value;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        IMAGE(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return IMAGE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Icon$b */
    private static final class C15008b extends ProtoAdapter<Icon> {
        C15008b() {
            super(FieldEncoding.LENGTH_DELIMITED, Icon.class);
        }

        /* renamed from: a */
        public int encodedSize(Icon icon) {
            int i;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, icon.type);
            if (icon.value != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, icon.value);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + icon.unknownFields().size();
        }

        /* renamed from: a */
        public Icon decode(ProtoReader protoReader) throws IOException {
            C15007a aVar = new C15007a();
            aVar.f39686a = Type.UNKNOWN;
            aVar.f39687b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f39686a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39687b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Icon icon) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, icon.type);
            if (icon.value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, icon.value);
            }
            protoWriter.writeBytes(icon.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Icon$a */
    public static final class C15007a extends Message.Builder<Icon, C15007a> {

        /* renamed from: a */
        public Type f39686a;

        /* renamed from: b */
        public String f39687b;

        /* renamed from: a */
        public Icon build() {
            Type type = this.f39686a;
            if (type != null) {
                return new Icon(type, this.f39687b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C15007a mo54841a(Type type) {
            this.f39686a = type;
            return this;
        }

        /* renamed from: a */
        public C15007a mo54842a(String str) {
            this.f39687b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15007a newBuilder() {
        C15007a aVar = new C15007a();
        aVar.f39686a = this.type;
        aVar.f39687b = this.value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Icon");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "Icon{");
        replace.append('}');
        return replace.toString();
    }

    public Icon(Type type2, String str) {
        this(type2, str, ByteString.EMPTY);
    }

    public Icon(Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.value = str;
    }
}
