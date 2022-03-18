package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import okio.ByteString;

public final class GetMeetingURLInfoResponse extends Message<GetMeetingURLInfoResponse, C50659a> {
    public static final ProtoAdapter<GetMeetingURLInfoResponse> ADAPTER = new C50660b();
    public static final VideoChatInfo.MeetingSource DEFAULT_MEETING_SOURCE = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
    private static final long serialVersionUID = 0;
    public final String meeting_no;
    public final VideoChatInfo.MeetingSource meeting_source;
    public final String meeting_url;
    public final String topic;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoResponse$b */
    private static final class C50660b extends ProtoAdapter<GetMeetingURLInfoResponse> {
        C50660b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingURLInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingURLInfoResponse getMeetingURLInfoResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getMeetingURLInfoResponse.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getMeetingURLInfoResponse.topic);
            } else {
                i = 0;
            }
            if (getMeetingURLInfoResponse.meeting_no != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getMeetingURLInfoResponse.meeting_no);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getMeetingURLInfoResponse.meeting_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getMeetingURLInfoResponse.meeting_url);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getMeetingURLInfoResponse.meeting_source != null) {
                i4 = VideoChatInfo.MeetingSource.ADAPTER.encodedSizeWithTag(4, getMeetingURLInfoResponse.meeting_source);
            }
            return i6 + i4 + getMeetingURLInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingURLInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50659a aVar = new C50659a();
            aVar.f126390a = "";
            aVar.f126391b = "";
            aVar.f126392c = "";
            aVar.f126393d = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126390a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126391b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126392c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126393d = VideoChatInfo.MeetingSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingURLInfoResponse getMeetingURLInfoResponse) throws IOException {
            if (getMeetingURLInfoResponse.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMeetingURLInfoResponse.topic);
            }
            if (getMeetingURLInfoResponse.meeting_no != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getMeetingURLInfoResponse.meeting_no);
            }
            if (getMeetingURLInfoResponse.meeting_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getMeetingURLInfoResponse.meeting_url);
            }
            if (getMeetingURLInfoResponse.meeting_source != null) {
                VideoChatInfo.MeetingSource.ADAPTER.encodeWithTag(protoWriter, 4, getMeetingURLInfoResponse.meeting_source);
            }
            protoWriter.writeBytes(getMeetingURLInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoResponse$a */
    public static final class C50659a extends Message.Builder<GetMeetingURLInfoResponse, C50659a> {

        /* renamed from: a */
        public String f126390a;

        /* renamed from: b */
        public String f126391b;

        /* renamed from: c */
        public String f126392c;

        /* renamed from: d */
        public VideoChatInfo.MeetingSource f126393d;

        /* renamed from: a */
        public GetMeetingURLInfoResponse build() {
            return new GetMeetingURLInfoResponse(this.f126390a, this.f126391b, this.f126392c, this.f126393d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50659a newBuilder() {
        C50659a aVar = new C50659a();
        aVar.f126390a = this.topic;
        aVar.f126391b = this.meeting_no;
        aVar.f126392c = this.meeting_url;
        aVar.f126393d = this.meeting_source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetMeetingURLInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.meeting_no != null) {
            sb.append(", meeting_no=");
            sb.append(this.meeting_no);
        }
        if (this.meeting_url != null) {
            sb.append(", meeting_url=");
            sb.append(this.meeting_url);
        }
        if (this.meeting_source != null) {
            sb.append(", meeting_source=");
            sb.append(this.meeting_source);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingURLInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingURLInfoResponse(String str, String str2, String str3, VideoChatInfo.MeetingSource meetingSource) {
        this(str, str2, str3, meetingSource, ByteString.EMPTY);
    }

    public GetMeetingURLInfoResponse(String str, String str2, String str3, VideoChatInfo.MeetingSource meetingSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.topic = str;
        this.meeting_no = str2;
        this.meeting_url = str3;
        this.meeting_source = meetingSource;
    }
}
