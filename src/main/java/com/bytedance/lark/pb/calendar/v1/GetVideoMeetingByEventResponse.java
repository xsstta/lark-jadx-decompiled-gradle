package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVideoMeetingByEventResponse extends Message<GetVideoMeetingByEventResponse, C15810a> {
    public static final ProtoAdapter<GetVideoMeetingByEventResponse> ADAPTER = new C15811b();
    private static final long serialVersionUID = 0;
    public final VideoMeeting video_meeting;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetVideoMeetingByEventResponse$b */
    private static final class C15811b extends ProtoAdapter<GetVideoMeetingByEventResponse> {
        C15811b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVideoMeetingByEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVideoMeetingByEventResponse getVideoMeetingByEventResponse) {
            int i;
            if (getVideoMeetingByEventResponse.video_meeting != null) {
                i = VideoMeeting.ADAPTER.encodedSizeWithTag(1, getVideoMeetingByEventResponse.video_meeting);
            } else {
                i = 0;
            }
            return i + getVideoMeetingByEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVideoMeetingByEventResponse decode(ProtoReader protoReader) throws IOException {
            C15810a aVar = new C15810a();
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
                    aVar.f41591a = VideoMeeting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVideoMeetingByEventResponse getVideoMeetingByEventResponse) throws IOException {
            if (getVideoMeetingByEventResponse.video_meeting != null) {
                VideoMeeting.ADAPTER.encodeWithTag(protoWriter, 1, getVideoMeetingByEventResponse.video_meeting);
            }
            protoWriter.writeBytes(getVideoMeetingByEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetVideoMeetingByEventResponse$a */
    public static final class C15810a extends Message.Builder<GetVideoMeetingByEventResponse, C15810a> {

        /* renamed from: a */
        public VideoMeeting f41591a;

        /* renamed from: a */
        public GetVideoMeetingByEventResponse build() {
            return new GetVideoMeetingByEventResponse(this.f41591a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15810a newBuilder() {
        C15810a aVar = new C15810a();
        aVar.f41591a = this.video_meeting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetVideoMeetingByEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.video_meeting != null) {
            sb.append(", video_meeting=");
            sb.append(this.video_meeting);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVideoMeetingByEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVideoMeetingByEventResponse(VideoMeeting videoMeeting) {
        this(videoMeeting, ByteString.EMPTY);
    }

    public GetVideoMeetingByEventResponse(VideoMeeting videoMeeting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_meeting = videoMeeting;
    }
}
