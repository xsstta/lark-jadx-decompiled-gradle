package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CancelDataCleanResponse extends Message<CancelDataCleanResponse, C14720a> {
    public static final ProtoAdapter<CancelDataCleanResponse> ADAPTER = new C14721b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.CancelDataCleanResponse$b */
    private static final class C14721b extends ProtoAdapter<CancelDataCleanResponse> {
        C14721b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelDataCleanResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelDataCleanResponse cancelDataCleanResponse) {
            return cancelDataCleanResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CancelDataCleanResponse decode(ProtoReader protoReader) throws IOException {
            C14720a aVar = new C14720a();
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
        public void encode(ProtoWriter protoWriter, CancelDataCleanResponse cancelDataCleanResponse) throws IOException {
            protoWriter.writeBytes(cancelDataCleanResponse.unknownFields());
        }
    }

    public CancelDataCleanResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CancelDataCleanResponse$a */
    public static final class C14720a extends Message.Builder<CancelDataCleanResponse, C14720a> {
        /* renamed from: a */
        public CancelDataCleanResponse build() {
            return new CancelDataCleanResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14720a newBuilder() {
        C14720a aVar = new C14720a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CancelDataCleanResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "CancelDataCleanResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CancelDataCleanResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
