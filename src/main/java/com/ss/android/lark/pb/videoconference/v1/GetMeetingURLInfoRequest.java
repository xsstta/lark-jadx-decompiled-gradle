package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMeetingURLInfoRequest extends Message<GetMeetingURLInfoRequest, C50657a> {
    public static final ProtoAdapter<GetMeetingURLInfoRequest> ADAPTER = new C50658b();
    public static final Long DEFAULT_MEETING_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long meeting_id;
    public final String meeting_id_str;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoRequest$b */
    private static final class C50658b extends ProtoAdapter<GetMeetingURLInfoRequest> {
        C50658b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingURLInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingURLInfoRequest getMeetingURLInfoRequest) {
            int i;
            int i2 = 0;
            if (getMeetingURLInfoRequest.meeting_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getMeetingURLInfoRequest.meeting_id);
            } else {
                i = 0;
            }
            if (getMeetingURLInfoRequest.meeting_id_str != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getMeetingURLInfoRequest.meeting_id_str);
            }
            return i + i2 + getMeetingURLInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingURLInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50657a aVar = new C50657a();
            aVar.f126388a = 0L;
            aVar.f126389b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126388a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126389b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingURLInfoRequest getMeetingURLInfoRequest) throws IOException {
            if (getMeetingURLInfoRequest.meeting_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getMeetingURLInfoRequest.meeting_id);
            }
            if (getMeetingURLInfoRequest.meeting_id_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getMeetingURLInfoRequest.meeting_id_str);
            }
            protoWriter.writeBytes(getMeetingURLInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoRequest$a */
    public static final class C50657a extends Message.Builder<GetMeetingURLInfoRequest, C50657a> {

        /* renamed from: a */
        public Long f126388a;

        /* renamed from: b */
        public String f126389b;

        /* renamed from: a */
        public GetMeetingURLInfoRequest build() {
            return new GetMeetingURLInfoRequest(this.f126388a, this.f126389b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50657a mo175290a(String str) {
            this.f126389b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50657a newBuilder() {
        C50657a aVar = new C50657a();
        aVar.f126388a = this.meeting_id;
        aVar.f126389b = this.meeting_id_str;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetMeetingURLInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.meeting_id_str != null) {
            sb.append(", meeting_id_str=");
            sb.append(this.meeting_id_str);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingURLInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingURLInfoRequest(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public GetMeetingURLInfoRequest(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = l;
        this.meeting_id_str = str;
    }
}
