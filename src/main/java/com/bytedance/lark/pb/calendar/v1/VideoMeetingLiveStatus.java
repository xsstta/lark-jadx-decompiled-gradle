package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.VideoMeeting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoMeetingLiveStatus extends Message<VideoMeetingLiveStatus, C16120a> {
    public static final ProtoAdapter<VideoMeetingLiveStatus> ADAPTER = new C16121b();
    public static final Long DEFAULT_LIVE_DURATION = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final VideoMeeting.Status DEFAULT_STATUS = VideoMeeting.Status.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long live_duration;
    public final String meeting_id;
    public final Long start_time;
    public final VideoMeeting.Status status;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.VideoMeetingLiveStatus$b */
    private static final class C16121b extends ProtoAdapter<VideoMeetingLiveStatus> {
        C16121b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoMeetingLiveStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoMeetingLiveStatus videoMeetingLiveStatus) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (videoMeetingLiveStatus.status != null) {
                i = VideoMeeting.Status.ADAPTER.encodedSizeWithTag(1, videoMeetingLiveStatus.status);
            } else {
                i = 0;
            }
            if (videoMeetingLiveStatus.start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, videoMeetingLiveStatus.start_time);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (videoMeetingLiveStatus.live_duration != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, videoMeetingLiveStatus.live_duration);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (videoMeetingLiveStatus.meeting_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoMeetingLiveStatus.meeting_id);
            }
            return i6 + i4 + videoMeetingLiveStatus.unknownFields().size();
        }

        /* renamed from: a */
        public VideoMeetingLiveStatus decode(ProtoReader protoReader) throws IOException {
            C16120a aVar = new C16120a();
            aVar.f42226a = VideoMeeting.Status.UNKNOWN;
            aVar.f42227b = 0L;
            aVar.f42228c = 0L;
            aVar.f42229d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42226a = VideoMeeting.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42227b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42228c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42229d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoMeetingLiveStatus videoMeetingLiveStatus) throws IOException {
            if (videoMeetingLiveStatus.status != null) {
                VideoMeeting.Status.ADAPTER.encodeWithTag(protoWriter, 1, videoMeetingLiveStatus.status);
            }
            if (videoMeetingLiveStatus.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, videoMeetingLiveStatus.start_time);
            }
            if (videoMeetingLiveStatus.live_duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, videoMeetingLiveStatus.live_duration);
            }
            if (videoMeetingLiveStatus.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoMeetingLiveStatus.meeting_id);
            }
            protoWriter.writeBytes(videoMeetingLiveStatus.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.VideoMeetingLiveStatus$a */
    public static final class C16120a extends Message.Builder<VideoMeetingLiveStatus, C16120a> {

        /* renamed from: a */
        public VideoMeeting.Status f42226a;

        /* renamed from: b */
        public Long f42227b;

        /* renamed from: c */
        public Long f42228c;

        /* renamed from: d */
        public String f42229d;

        /* renamed from: a */
        public VideoMeetingLiveStatus build() {
            return new VideoMeetingLiveStatus(this.f42226a, this.f42227b, this.f42228c, this.f42229d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16120a newBuilder() {
        C16120a aVar = new C16120a();
        aVar.f42226a = this.status;
        aVar.f42227b = this.start_time;
        aVar.f42228c = this.live_duration;
        aVar.f42229d = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "VideoMeetingLiveStatus");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.live_duration != null) {
            sb.append(", live_duration=");
            sb.append(this.live_duration);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoMeetingLiveStatus{");
        replace.append('}');
        return replace.toString();
    }

    public VideoMeetingLiveStatus(VideoMeeting.Status status2, Long l, Long l2, String str) {
        this(status2, l, l2, str, ByteString.EMPTY);
    }

    public VideoMeetingLiveStatus(VideoMeeting.Status status2, Long l, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.start_time = l;
        this.live_duration = l2;
        this.meeting_id = str;
    }
}
