package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CancelDataCleanRequest extends Message<CancelDataCleanRequest, C14718a> {
    public static final ProtoAdapter<CancelDataCleanRequest> ADAPTER = new C14719b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.CancelDataCleanRequest$b */
    private static final class C14719b extends ProtoAdapter<CancelDataCleanRequest> {
        C14719b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelDataCleanRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelDataCleanRequest cancelDataCleanRequest) {
            return cancelDataCleanRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelDataCleanRequest decode(ProtoReader protoReader) throws IOException {
            C14718a aVar = new C14718a();
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
        public void encode(ProtoWriter protoWriter, CancelDataCleanRequest cancelDataCleanRequest) throws IOException {
            protoWriter.writeBytes(cancelDataCleanRequest.unknownFields());
        }
    }

    public CancelDataCleanRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CancelDataCleanRequest$a */
    public static final class C14718a extends Message.Builder<CancelDataCleanRequest, C14718a> {
        /* renamed from: a */
        public CancelDataCleanRequest build() {
            return new CancelDataCleanRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14718a newBuilder() {
        C14718a aVar = new C14718a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CancelDataCleanRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "CancelDataCleanRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelDataCleanRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
