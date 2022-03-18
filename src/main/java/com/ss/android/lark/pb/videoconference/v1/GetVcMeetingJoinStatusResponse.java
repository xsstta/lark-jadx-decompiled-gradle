package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVcMeetingJoinStatusResponse extends Message<GetVcMeetingJoinStatusResponse, C50707a> {
    public static final ProtoAdapter<GetVcMeetingJoinStatusResponse> ADAPTER = new C50708b();
    private static final long serialVersionUID = 0;
    public final MeetingJoinInfo meeting_join_infos;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusResponse$b */
    private static final class C50708b extends ProtoAdapter<GetVcMeetingJoinStatusResponse> {
        C50708b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVcMeetingJoinStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVcMeetingJoinStatusResponse getVcMeetingJoinStatusResponse) {
            int i;
            if (getVcMeetingJoinStatusResponse.meeting_join_infos != null) {
                i = MeetingJoinInfo.ADAPTER.encodedSizeWithTag(1, getVcMeetingJoinStatusResponse.meeting_join_infos);
            } else {
                i = 0;
            }
            return i + getVcMeetingJoinStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVcMeetingJoinStatusResponse decode(ProtoReader protoReader) throws IOException {
            C50707a aVar = new C50707a();
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
                    aVar.f126442a = MeetingJoinInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVcMeetingJoinStatusResponse getVcMeetingJoinStatusResponse) throws IOException {
            if (getVcMeetingJoinStatusResponse.meeting_join_infos != null) {
                MeetingJoinInfo.ADAPTER.encodeWithTag(protoWriter, 1, getVcMeetingJoinStatusResponse.meeting_join_infos);
            }
            protoWriter.writeBytes(getVcMeetingJoinStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusResponse$a */
    public static final class C50707a extends Message.Builder<GetVcMeetingJoinStatusResponse, C50707a> {

        /* renamed from: a */
        public MeetingJoinInfo f126442a;

        /* renamed from: a */
        public GetVcMeetingJoinStatusResponse build() {
            return new GetVcMeetingJoinStatusResponse(this.f126442a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50707a newBuilder() {
        C50707a aVar = new C50707a();
        aVar.f126442a = this.meeting_join_infos;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVcMeetingJoinStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_join_infos != null) {
            sb.append(", meeting_join_infos=");
            sb.append(this.meeting_join_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVcMeetingJoinStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVcMeetingJoinStatusResponse(MeetingJoinInfo meetingJoinInfo) {
        this(meetingJoinInfo, ByteString.EMPTY);
    }

    public GetVcMeetingJoinStatusResponse(MeetingJoinInfo meetingJoinInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_join_infos = meetingJoinInfo;
    }
}
