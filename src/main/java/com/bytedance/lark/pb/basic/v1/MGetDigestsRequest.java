package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class MGetDigestsRequest extends Message<MGetDigestsRequest, C15043a> {
    public static final ProtoAdapter<MGetDigestsRequest> ADAPTER = new C15044b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> keys;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(1),
        EMOJI(2),
        REACTION(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return UNKNOWN;
            }
            if (i == 2) {
                return EMOJI;
            }
            if (i != 3) {
                return null;
            }
            return REACTION;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MGetDigestsRequest$b */
    private static final class C15044b extends ProtoAdapter<MGetDigestsRequest> {
        C15044b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetDigestsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetDigestsRequest mGetDigestsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetDigestsRequest.keys);
            if (mGetDigestsRequest.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, mGetDigestsRequest.type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mGetDigestsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetDigestsRequest decode(ProtoReader protoReader) throws IOException {
            C15043a aVar = new C15043a();
            aVar.f39797b = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39796a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39797b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetDigestsRequest mGetDigestsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetDigestsRequest.keys);
            if (mGetDigestsRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, mGetDigestsRequest.type);
            }
            protoWriter.writeBytes(mGetDigestsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MGetDigestsRequest$a */
    public static final class C15043a extends Message.Builder<MGetDigestsRequest, C15043a> {

        /* renamed from: a */
        public List<String> f39796a = Internal.newMutableList();

        /* renamed from: b */
        public Type f39797b;

        /* renamed from: a */
        public MGetDigestsRequest build() {
            return new MGetDigestsRequest(this.f39796a, this.f39797b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15043a newBuilder() {
        C15043a aVar = new C15043a();
        aVar.f39796a = Internal.copyOf("keys", this.keys);
        aVar.f39797b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MGetDigestsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetDigestsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetDigestsRequest(List<String> list, Type type2) {
        this(list, type2, ByteString.EMPTY);
    }

    public MGetDigestsRequest(List<String> list, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
        this.type = type2;
    }
}
