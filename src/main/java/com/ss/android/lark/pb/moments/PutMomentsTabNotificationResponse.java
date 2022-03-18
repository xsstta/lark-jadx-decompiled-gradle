package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutMomentsTabNotificationResponse extends Message<PutMomentsTabNotificationResponse, C49946a> {
    public static final ProtoAdapter<PutMomentsTabNotificationResponse> ADAPTER = new C49947b();
    public static final Long DEFAULT_READ_POST_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final Long mread_post_timestamp;

    /* renamed from: com.ss.android.lark.pb.moments.PutMomentsTabNotificationResponse$b */
    private static final class C49947b extends ProtoAdapter<PutMomentsTabNotificationResponse> {
        C49947b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutMomentsTabNotificationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutMomentsTabNotificationResponse putMomentsTabNotificationResponse) {
            int i;
            if (putMomentsTabNotificationResponse.mread_post_timestamp != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, putMomentsTabNotificationResponse.mread_post_timestamp);
            } else {
                i = 0;
            }
            return i + putMomentsTabNotificationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutMomentsTabNotificationResponse decode(ProtoReader protoReader) throws IOException {
            C49946a aVar = new C49946a();
            aVar.f124951a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124951a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutMomentsTabNotificationResponse putMomentsTabNotificationResponse) throws IOException {
            if (putMomentsTabNotificationResponse.mread_post_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, putMomentsTabNotificationResponse.mread_post_timestamp);
            }
            protoWriter.writeBytes(putMomentsTabNotificationResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.PutMomentsTabNotificationResponse$a */
    public static final class C49946a extends Message.Builder<PutMomentsTabNotificationResponse, C49946a> {

        /* renamed from: a */
        public Long f124951a;

        /* renamed from: a */
        public PutMomentsTabNotificationResponse build() {
            return new PutMomentsTabNotificationResponse(this.f124951a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49946a newBuilder() {
        C49946a aVar = new C49946a();
        aVar.f124951a = this.mread_post_timestamp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mread_post_timestamp != null) {
            sb.append(", read_post_timestamp=");
            sb.append(this.mread_post_timestamp);
        }
        StringBuilder replace = sb.replace(0, 2, "PutMomentsTabNotificationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutMomentsTabNotificationResponse(Long l) {
        this(l, ByteString.EMPTY);
    }

    public PutMomentsTabNotificationResponse(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mread_post_timestamp = l;
    }
}
