package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.moments_entities.NotificationCount;
import java.io.IOException;
import okio.ByteString;

public final class GetBadgeResponse extends Message<GetBadgeResponse, C49914a> {
    public static final ProtoAdapter<GetBadgeResponse> ADAPTER = new C49915b();
    private static final long serialVersionUID = 0;
    public final NotificationCount mnotification_count;

    /* renamed from: com.ss.android.lark.pb.moments.GetBadgeResponse$b */
    private static final class C49915b extends ProtoAdapter<GetBadgeResponse> {
        C49915b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBadgeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBadgeResponse getBadgeResponse) {
            int i;
            if (getBadgeResponse.mnotification_count != null) {
                i = NotificationCount.ADAPTER.encodedSizeWithTag(1, getBadgeResponse.mnotification_count);
            } else {
                i = 0;
            }
            return i + getBadgeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBadgeResponse decode(ProtoReader protoReader) throws IOException {
            C49914a aVar = new C49914a();
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
                    aVar.f124930a = NotificationCount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBadgeResponse getBadgeResponse) throws IOException {
            if (getBadgeResponse.mnotification_count != null) {
                NotificationCount.ADAPTER.encodeWithTag(protoWriter, 1, getBadgeResponse.mnotification_count);
            }
            protoWriter.writeBytes(getBadgeResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.GetBadgeResponse$a */
    public static final class C49914a extends Message.Builder<GetBadgeResponse, C49914a> {

        /* renamed from: a */
        public NotificationCount f124930a;

        /* renamed from: a */
        public GetBadgeResponse build() {
            return new GetBadgeResponse(this.f124930a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49914a newBuilder() {
        C49914a aVar = new C49914a();
        aVar.f124930a = this.mnotification_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mnotification_count != null) {
            sb.append(", notification_count=");
            sb.append(this.mnotification_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBadgeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBadgeResponse(NotificationCount notificationCount) {
        this(notificationCount, ByteString.EMPTY);
    }

    public GetBadgeResponse(NotificationCount notificationCount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mnotification_count = notificationCount;
    }
}
