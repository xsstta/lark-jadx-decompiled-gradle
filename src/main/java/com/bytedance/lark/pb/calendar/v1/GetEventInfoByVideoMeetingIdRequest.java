package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetEventInfoByVideoMeetingIdRequest extends Message<GetEventInfoByVideoMeetingIdRequest, C15696a> {
    public static final ProtoAdapter<GetEventInfoByVideoMeetingIdRequest> ADAPTER = new C15697b();
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long start_time;
    public final String video_meeting_unique_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventInfoByVideoMeetingIdRequest$b */
    private static final class C15697b extends ProtoAdapter<GetEventInfoByVideoMeetingIdRequest> {
        C15697b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEventInfoByVideoMeetingIdRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEventInfoByVideoMeetingIdRequest getEventInfoByVideoMeetingIdRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getEventInfoByVideoMeetingIdRequest.video_meeting_unique_id);
            if (getEventInfoByVideoMeetingIdRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getEventInfoByVideoMeetingIdRequest.start_time);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getEventInfoByVideoMeetingIdRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetEventInfoByVideoMeetingIdRequest decode(ProtoReader protoReader) throws IOException {
            C15696a aVar = new C15696a();
            aVar.f41453a = "";
            aVar.f41454b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41453a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41454b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEventInfoByVideoMeetingIdRequest getEventInfoByVideoMeetingIdRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getEventInfoByVideoMeetingIdRequest.video_meeting_unique_id);
            if (getEventInfoByVideoMeetingIdRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getEventInfoByVideoMeetingIdRequest.start_time);
            }
            protoWriter.writeBytes(getEventInfoByVideoMeetingIdRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventInfoByVideoMeetingIdRequest$a */
    public static final class C15696a extends Message.Builder<GetEventInfoByVideoMeetingIdRequest, C15696a> {

        /* renamed from: a */
        public String f41453a;

        /* renamed from: b */
        public Long f41454b;

        /* renamed from: a */
        public GetEventInfoByVideoMeetingIdRequest build() {
            String str = this.f41453a;
            if (str != null) {
                return new GetEventInfoByVideoMeetingIdRequest(str, this.f41454b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "video_meeting_unique_id");
        }

        /* renamed from: a */
        public C15696a mo56805a(Long l) {
            this.f41454b = l;
            return this;
        }

        /* renamed from: a */
        public C15696a mo56806a(String str) {
            this.f41453a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15696a newBuilder() {
        C15696a aVar = new C15696a();
        aVar.f41453a = this.video_meeting_unique_id;
        aVar.f41454b = this.start_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetEventInfoByVideoMeetingIdRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", video_meeting_unique_id=");
        sb.append(this.video_meeting_unique_id);
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEventInfoByVideoMeetingIdRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetEventInfoByVideoMeetingIdRequest(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public GetEventInfoByVideoMeetingIdRequest(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_meeting_unique_id = str;
        this.start_time = l;
    }
}
