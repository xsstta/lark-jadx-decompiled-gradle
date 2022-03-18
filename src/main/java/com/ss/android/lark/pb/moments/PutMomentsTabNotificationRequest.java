package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutMomentsTabNotificationRequest extends Message<PutMomentsTabNotificationRequest, C49944a> {
    public static final ProtoAdapter<PutMomentsTabNotificationRequest> ADAPTER = new C49945b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.moments.PutMomentsTabNotificationRequest$b */
    private static final class C49945b extends ProtoAdapter<PutMomentsTabNotificationRequest> {
        C49945b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutMomentsTabNotificationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutMomentsTabNotificationRequest putMomentsTabNotificationRequest) {
            return putMomentsTabNotificationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutMomentsTabNotificationRequest decode(ProtoReader protoReader) throws IOException {
            C49944a aVar = new C49944a();
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
        public void encode(ProtoWriter protoWriter, PutMomentsTabNotificationRequest putMomentsTabNotificationRequest) throws IOException {
            protoWriter.writeBytes(putMomentsTabNotificationRequest.unknownFields());
        }
    }

    public PutMomentsTabNotificationRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.moments.PutMomentsTabNotificationRequest$a */
    public static final class C49944a extends Message.Builder<PutMomentsTabNotificationRequest, C49944a> {
        /* renamed from: a */
        public PutMomentsTabNotificationRequest build() {
            return new PutMomentsTabNotificationRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49944a newBuilder() {
        C49944a aVar = new C49944a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PutMomentsTabNotificationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutMomentsTabNotificationRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
