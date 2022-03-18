package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class PushDataCorruptResponse extends Message<PushDataCorruptResponse, C15131a> {
    public static final ProtoAdapter<PushDataCorruptResponse> ADAPTER = new C15132b();
    public static final Reason DEFAULT_REASON = Reason.DATABASE_CORRUPT;
    private static final long serialVersionUID = 0;
    public final Reason reason;

    public enum Reason implements WireEnum {
        DATABASE_CORRUPT(1);
        
        public static final ProtoAdapter<Reason> ADAPTER = ProtoAdapter.newEnumAdapter(Reason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Reason fromValue(int i) {
            if (i != 1) {
                return null;
            }
            return DATABASE_CORRUPT;
        }

        private Reason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushDataCorruptResponse$b */
    private static final class C15132b extends ProtoAdapter<PushDataCorruptResponse> {
        C15132b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDataCorruptResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDataCorruptResponse pushDataCorruptResponse) {
            int i;
            if (pushDataCorruptResponse.reason != null) {
                i = Reason.ADAPTER.encodedSizeWithTag(2, pushDataCorruptResponse.reason);
            } else {
                i = 0;
            }
            return i + pushDataCorruptResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushDataCorruptResponse decode(ProtoReader protoReader) throws IOException {
            C15131a aVar = new C15131a();
            aVar.f40109a = Reason.DATABASE_CORRUPT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f40109a = Reason.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushDataCorruptResponse pushDataCorruptResponse) throws IOException {
            if (pushDataCorruptResponse.reason != null) {
                Reason.ADAPTER.encodeWithTag(protoWriter, 2, pushDataCorruptResponse.reason);
            }
            protoWriter.writeBytes(pushDataCorruptResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushDataCorruptResponse$a */
    public static final class C15131a extends Message.Builder<PushDataCorruptResponse, C15131a> {

        /* renamed from: a */
        public Reason f40109a;

        /* renamed from: a */
        public PushDataCorruptResponse build() {
            return new PushDataCorruptResponse(this.f40109a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15131a newBuilder() {
        C15131a aVar = new C15131a();
        aVar.f40109a = this.reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PushDataCorruptResponse");
        StringBuilder sb = new StringBuilder();
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        StringBuilder replace = sb.replace(0, 2, "PushDataCorruptResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushDataCorruptResponse(Reason reason2) {
        this(reason2, ByteString.EMPTY);
    }

    public PushDataCorruptResponse(Reason reason2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reason = reason2;
    }
}
