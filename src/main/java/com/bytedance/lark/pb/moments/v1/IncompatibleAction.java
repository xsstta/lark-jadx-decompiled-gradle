package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class IncompatibleAction extends Message<IncompatibleAction, C18410a> {
    public static final ProtoAdapter<IncompatibleAction> ADAPTER = new C18411b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String hint;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        HINT(1),
        HIDE(2);
        
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
            if (i == 1) {
                return HINT;
            }
            if (i != 2) {
                return null;
            }
            return HIDE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.IncompatibleAction$b */
    private static final class C18411b extends ProtoAdapter<IncompatibleAction> {
        C18411b() {
            super(FieldEncoding.LENGTH_DELIMITED, IncompatibleAction.class);
        }

        /* renamed from: a */
        public int encodedSize(IncompatibleAction incompatibleAction) {
            int i;
            int i2 = 0;
            if (incompatibleAction.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, incompatibleAction.type);
            } else {
                i = 0;
            }
            if (incompatibleAction.hint != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, incompatibleAction.hint);
            }
            return i + i2 + incompatibleAction.unknownFields().size();
        }

        /* renamed from: a */
        public IncompatibleAction decode(ProtoReader protoReader) throws IOException {
            C18410a aVar = new C18410a();
            aVar.f45796a = Type.UNKNOWN;
            aVar.f45797b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45796a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45797b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, IncompatibleAction incompatibleAction) throws IOException {
            if (incompatibleAction.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, incompatibleAction.type);
            }
            if (incompatibleAction.hint != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, incompatibleAction.hint);
            }
            protoWriter.writeBytes(incompatibleAction.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.IncompatibleAction$a */
    public static final class C18410a extends Message.Builder<IncompatibleAction, C18410a> {

        /* renamed from: a */
        public Type f45796a;

        /* renamed from: b */
        public String f45797b;

        /* renamed from: a */
        public IncompatibleAction build() {
            return new IncompatibleAction(this.f45796a, this.f45797b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18410a newBuilder() {
        C18410a aVar = new C18410a();
        aVar.f45796a = this.type;
        aVar.f45797b = this.hint;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "IncompatibleAction");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.hint != null) {
            sb.append(", hint=");
            sb.append(this.hint);
        }
        StringBuilder replace = sb.replace(0, 2, "IncompatibleAction{");
        replace.append('}');
        return replace.toString();
    }

    public IncompatibleAction(Type type2, String str) {
        this(type2, str, ByteString.EMPTY);
    }

    public IncompatibleAction(Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.hint = str;
    }
}
