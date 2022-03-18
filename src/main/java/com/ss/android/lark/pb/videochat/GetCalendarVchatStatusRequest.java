package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarVchatStatusRequest extends Message<GetCalendarVchatStatusRequest, C50314a> {
    public static final ProtoAdapter<GetCalendarVchatStatusRequest> ADAPTER = new C50315b();
    public static final Long DEFAULT_UNIQUE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long munique_id;

    /* renamed from: com.ss.android.lark.pb.videochat.GetCalendarVchatStatusRequest$b */
    private static final class C50315b extends ProtoAdapter<GetCalendarVchatStatusRequest> {
        C50315b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarVchatStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarVchatStatusRequest getCalendarVchatStatusRequest) {
            int i;
            if (getCalendarVchatStatusRequest.munique_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getCalendarVchatStatusRequest.munique_id);
            } else {
                i = 0;
            }
            return i + getCalendarVchatStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarVchatStatusRequest decode(ProtoReader protoReader) throws IOException {
            C50314a aVar = new C50314a();
            aVar.f125699a = 0L;
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
                    aVar.f125699a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarVchatStatusRequest getCalendarVchatStatusRequest) throws IOException {
            if (getCalendarVchatStatusRequest.munique_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getCalendarVchatStatusRequest.munique_id);
            }
            protoWriter.writeBytes(getCalendarVchatStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetCalendarVchatStatusRequest$a */
    public static final class C50314a extends Message.Builder<GetCalendarVchatStatusRequest, C50314a> {

        /* renamed from: a */
        public Long f125699a;

        /* renamed from: a */
        public GetCalendarVchatStatusRequest build() {
            return new GetCalendarVchatStatusRequest(this.f125699a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50314a mo174507a(Long l) {
            this.f125699a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50314a newBuilder() {
        C50314a aVar = new C50314a();
        aVar.f125699a = this.munique_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.munique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.munique_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarVchatStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarVchatStatusRequest(Long l) {
        this(l, ByteString.EMPTY);
    }

    public GetCalendarVchatStatusRequest(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.munique_id = l;
    }
}
