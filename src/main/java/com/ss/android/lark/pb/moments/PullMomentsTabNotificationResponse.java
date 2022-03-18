package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullMomentsTabNotificationResponse extends Message<PullMomentsTabNotificationResponse, C49932a> {
    public static final ProtoAdapter<PullMomentsTabNotificationResponse> ADAPTER = new C49933b();
    public static final Long DEFAULT_LAST_POST_TIMESTAMP = 0L;
    public static final Long DEFAULT_READ_POST_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final Long mlast_post_timestamp;
    public final Long mread_post_timestamp;

    /* renamed from: com.ss.android.lark.pb.moments.PullMomentsTabNotificationResponse$b */
    private static final class C49933b extends ProtoAdapter<PullMomentsTabNotificationResponse> {
        C49933b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullMomentsTabNotificationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullMomentsTabNotificationResponse pullMomentsTabNotificationResponse) {
            int i;
            int i2 = 0;
            if (pullMomentsTabNotificationResponse.mlast_post_timestamp != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, pullMomentsTabNotificationResponse.mlast_post_timestamp);
            } else {
                i = 0;
            }
            if (pullMomentsTabNotificationResponse.mread_post_timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, pullMomentsTabNotificationResponse.mread_post_timestamp);
            }
            return i + i2 + pullMomentsTabNotificationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullMomentsTabNotificationResponse decode(ProtoReader protoReader) throws IOException {
            C49932a aVar = new C49932a();
            aVar.f124944a = 0L;
            aVar.f124945b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124944a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124945b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullMomentsTabNotificationResponse pullMomentsTabNotificationResponse) throws IOException {
            if (pullMomentsTabNotificationResponse.mlast_post_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pullMomentsTabNotificationResponse.mlast_post_timestamp);
            }
            if (pullMomentsTabNotificationResponse.mread_post_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pullMomentsTabNotificationResponse.mread_post_timestamp);
            }
            protoWriter.writeBytes(pullMomentsTabNotificationResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.PullMomentsTabNotificationResponse$a */
    public static final class C49932a extends Message.Builder<PullMomentsTabNotificationResponse, C49932a> {

        /* renamed from: a */
        public Long f124944a;

        /* renamed from: b */
        public Long f124945b;

        /* renamed from: a */
        public PullMomentsTabNotificationResponse build() {
            return new PullMomentsTabNotificationResponse(this.f124944a, this.f124945b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49932a newBuilder() {
        C49932a aVar = new C49932a();
        aVar.f124944a = this.mlast_post_timestamp;
        aVar.f124945b = this.mread_post_timestamp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mlast_post_timestamp != null) {
            sb.append(", last_post_timestamp=");
            sb.append(this.mlast_post_timestamp);
        }
        if (this.mread_post_timestamp != null) {
            sb.append(", read_post_timestamp=");
            sb.append(this.mread_post_timestamp);
        }
        StringBuilder replace = sb.replace(0, 2, "PullMomentsTabNotificationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullMomentsTabNotificationResponse(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public PullMomentsTabNotificationResponse(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlast_post_timestamp = l;
        this.mread_post_timestamp = l2;
    }
}
