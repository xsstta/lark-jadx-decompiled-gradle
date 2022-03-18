package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SpinUpFrontierResponse extends Message<SpinUpFrontierResponse, C15292a> {
    public static final ProtoAdapter<SpinUpFrontierResponse> ADAPTER = new C15293b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SpinUpFrontierResponse$b */
    private static final class C15293b extends ProtoAdapter<SpinUpFrontierResponse> {
        C15293b() {
            super(FieldEncoding.LENGTH_DELIMITED, SpinUpFrontierResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SpinUpFrontierResponse spinUpFrontierResponse) {
            return spinUpFrontierResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SpinUpFrontierResponse decode(ProtoReader protoReader) throws IOException {
            C15292a aVar = new C15292a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SpinUpFrontierResponse spinUpFrontierResponse) throws IOException {
            protoWriter.writeBytes(spinUpFrontierResponse.unknownFields());
        }
    }

    public SpinUpFrontierResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SpinUpFrontierResponse$a */
    public static final class C15292a extends Message.Builder<SpinUpFrontierResponse, C15292a> {
        /* renamed from: a */
        public SpinUpFrontierResponse build() {
            return new SpinUpFrontierResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15292a newBuilder() {
        C15292a aVar = new C15292a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SpinUpFrontierResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SpinUpFrontierResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SpinUpFrontierResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
