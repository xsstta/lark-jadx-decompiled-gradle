package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushMomentsTabNotificationRequest extends Message<PushMomentsTabNotificationRequest, C49942a> {
    public static final ProtoAdapter<PushMomentsTabNotificationRequest> ADAPTER = new C49943b();
    public static final Long DEFAULT_LAST_POST_TIMESTAMP = 0L;
    public static final Long DEFAULT_READ_POST_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final Long mlast_post_timestamp;
    public final Long mread_post_timestamp;

    /* renamed from: com.ss.android.lark.pb.moments.PushMomentsTabNotificationRequest$b */
    private static final class C49943b extends ProtoAdapter<PushMomentsTabNotificationRequest> {
        C49943b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMomentsTabNotificationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMomentsTabNotificationRequest pushMomentsTabNotificationRequest) {
            int i;
            int i2 = 0;
            if (pushMomentsTabNotificationRequest.mlast_post_timestamp != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, pushMomentsTabNotificationRequest.mlast_post_timestamp);
            } else {
                i = 0;
            }
            if (pushMomentsTabNotificationRequest.mread_post_timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, pushMomentsTabNotificationRequest.mread_post_timestamp);
            }
            return i + i2 + pushMomentsTabNotificationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushMomentsTabNotificationRequest decode(ProtoReader protoReader) throws IOException {
            C49942a aVar = new C49942a();
            aVar.f124949a = 0L;
            aVar.f124950b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124949a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124950b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMomentsTabNotificationRequest pushMomentsTabNotificationRequest) throws IOException {
            if (pushMomentsTabNotificationRequest.mlast_post_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pushMomentsTabNotificationRequest.mlast_post_timestamp);
            }
            if (pushMomentsTabNotificationRequest.mread_post_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pushMomentsTabNotificationRequest.mread_post_timestamp);
            }
            protoWriter.writeBytes(pushMomentsTabNotificationRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.PushMomentsTabNotificationRequest$a */
    public static final class C49942a extends Message.Builder<PushMomentsTabNotificationRequest, C49942a> {

        /* renamed from: a */
        public Long f124949a;

        /* renamed from: b */
        public Long f124950b;

        /* renamed from: a */
        public PushMomentsTabNotificationRequest build() {
            return new PushMomentsTabNotificationRequest(this.f124949a, this.f124950b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49942a newBuilder() {
        C49942a aVar = new C49942a();
        aVar.f124949a = this.mlast_post_timestamp;
        aVar.f124950b = this.mread_post_timestamp;
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
        StringBuilder replace = sb.replace(0, 2, "PushMomentsTabNotificationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushMomentsTabNotificationRequest(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public PushMomentsTabNotificationRequest(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlast_post_timestamp = l;
        this.mread_post_timestamp = l2;
    }
}
