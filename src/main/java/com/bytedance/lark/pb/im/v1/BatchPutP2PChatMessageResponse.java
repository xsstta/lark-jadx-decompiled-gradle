package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BatchPutP2PChatMessageResponse extends Message<BatchPutP2PChatMessageResponse, C17294a> {
    public static final ProtoAdapter<BatchPutP2PChatMessageResponse> ADAPTER = new C17295b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchPutP2PChatMessageResponse$b */
    private static final class C17295b extends ProtoAdapter<BatchPutP2PChatMessageResponse> {
        C17295b() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchPutP2PChatMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(BatchPutP2PChatMessageResponse batchPutP2PChatMessageResponse) {
            return batchPutP2PChatMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public BatchPutP2PChatMessageResponse decode(ProtoReader protoReader) throws IOException {
            C17294a aVar = new C17294a();
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
        public void encode(ProtoWriter protoWriter, BatchPutP2PChatMessageResponse batchPutP2PChatMessageResponse) throws IOException {
            protoWriter.writeBytes(batchPutP2PChatMessageResponse.unknownFields());
        }
    }

    public BatchPutP2PChatMessageResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchPutP2PChatMessageResponse$a */
    public static final class C17294a extends Message.Builder<BatchPutP2PChatMessageResponse, C17294a> {
        /* renamed from: a */
        public BatchPutP2PChatMessageResponse build() {
            return new BatchPutP2PChatMessageResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17294a newBuilder() {
        C17294a aVar = new C17294a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "BatchPutP2PChatMessageResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "BatchPutP2PChatMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public BatchPutP2PChatMessageResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
