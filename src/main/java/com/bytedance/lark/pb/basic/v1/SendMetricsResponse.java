package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendMetricsResponse extends Message<SendMetricsResponse, C15261a> {
    public static final ProtoAdapter<SendMetricsResponse> ADAPTER = new C15262b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendMetricsResponse$b */
    private static final class C15262b extends ProtoAdapter<SendMetricsResponse> {
        C15262b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMetricsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendMetricsResponse sendMetricsResponse) {
            return sendMetricsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendMetricsResponse decode(ProtoReader protoReader) throws IOException {
            C15261a aVar = new C15261a();
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
        public void encode(ProtoWriter protoWriter, SendMetricsResponse sendMetricsResponse) throws IOException {
            protoWriter.writeBytes(sendMetricsResponse.unknownFields());
        }
    }

    public SendMetricsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendMetricsResponse$a */
    public static final class C15261a extends Message.Builder<SendMetricsResponse, C15261a> {
        /* renamed from: a */
        public SendMetricsResponse build() {
            return new SendMetricsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15261a newBuilder() {
        C15261a aVar = new C15261a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SendMetricsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SendMetricsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendMetricsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
