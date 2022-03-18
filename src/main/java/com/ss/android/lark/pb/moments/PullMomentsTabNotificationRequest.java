package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullMomentsTabNotificationRequest extends Message<PullMomentsTabNotificationRequest, C49930a> {
    public static final ProtoAdapter<PullMomentsTabNotificationRequest> ADAPTER = new C49931b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.moments.PullMomentsTabNotificationRequest$b */
    private static final class C49931b extends ProtoAdapter<PullMomentsTabNotificationRequest> {
        C49931b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullMomentsTabNotificationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullMomentsTabNotificationRequest pullMomentsTabNotificationRequest) {
            return pullMomentsTabNotificationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullMomentsTabNotificationRequest decode(ProtoReader protoReader) throws IOException {
            C49930a aVar = new C49930a();
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
        public void encode(ProtoWriter protoWriter, PullMomentsTabNotificationRequest pullMomentsTabNotificationRequest) throws IOException {
            protoWriter.writeBytes(pullMomentsTabNotificationRequest.unknownFields());
        }
    }

    public PullMomentsTabNotificationRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.moments.PullMomentsTabNotificationRequest$a */
    public static final class C49930a extends Message.Builder<PullMomentsTabNotificationRequest, C49930a> {
        /* renamed from: a */
        public PullMomentsTabNotificationRequest build() {
            return new PullMomentsTabNotificationRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49930a newBuilder() {
        C49930a aVar = new C49930a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullMomentsTabNotificationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullMomentsTabNotificationRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
