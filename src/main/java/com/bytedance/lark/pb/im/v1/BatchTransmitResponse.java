package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BatchTransmitResponse extends Message<BatchTransmitResponse, C17298a> {
    public static final ProtoAdapter<BatchTransmitResponse> ADAPTER = new C17299b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchTransmitResponse$b */
    private static final class C17299b extends ProtoAdapter<BatchTransmitResponse> {
        C17299b() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchTransmitResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(BatchTransmitResponse batchTransmitResponse) {
            return batchTransmitResponse.unknownFields().size();
        }

        /* renamed from: a */
        public BatchTransmitResponse decode(ProtoReader protoReader) throws IOException {
            C17298a aVar = new C17298a();
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
        public void encode(ProtoWriter protoWriter, BatchTransmitResponse batchTransmitResponse) throws IOException {
            protoWriter.writeBytes(batchTransmitResponse.unknownFields());
        }
    }

    public BatchTransmitResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchTransmitResponse$a */
    public static final class C17298a extends Message.Builder<BatchTransmitResponse, C17298a> {
        /* renamed from: a */
        public BatchTransmitResponse build() {
            return new BatchTransmitResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17298a newBuilder() {
        C17298a aVar = new C17298a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "BatchTransmitResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "BatchTransmitResponse{");
        replace.append('}');
        return replace.toString();
    }

    public BatchTransmitResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
