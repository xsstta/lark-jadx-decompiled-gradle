package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VideoMeeting extends Message<VideoMeeting, C16118a> {
    public static final ProtoAdapter<VideoMeeting> ADAPTER = new C16119b();
    public static final Boolean DEFAULT_IS_EXPIRED = false;
    public static final VideoMeetingType DEFAULT_VIDEO_MEETING_TYPE = VideoMeetingType.UNKNOWN_VIDEO_MEETING_TYPE;
    private static final long serialVersionUID = 0;
    public final EventVideoMeetingConfig.GoogleVideoMeetingConfigs google_configs;
    public final Boolean is_expired;
    public final String meeting_number;
    public final String meeting_url;
    public final EventVideoMeetingConfig.OtherVideoMeetingConfigs other_configs;
    public final String unique_id;
    public final VideoMeetingType video_meeting_type;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        LIVE(1);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return LIVE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum VideoMeetingType implements WireEnum {
        UNKNOWN_VIDEO_MEETING_TYPE(0),
        VCHAT(1),
        OTHER(2),
        LARK_LIVE_HOST(3),
        NO_VIDEO_MEETING(4),
        GOOGLE_VIDEO_CONFERENCE(5);
        
        public static final ProtoAdapter<VideoMeetingType> ADAPTER = ProtoAdapter.newEnumAdapter(VideoMeetingType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static VideoMeetingType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_VIDEO_MEETING_TYPE;
            }
            if (i == 1) {
                return VCHAT;
            }
            if (i == 2) {
                return OTHER;
            }
            if (i == 3) {
                return LARK_LIVE_HOST;
            }
            if (i == 4) {
                return NO_VIDEO_MEETING;
            }
            if (i != 5) {
                return null;
            }
            return GOOGLE_VIDEO_CONFERENCE;
        }

        private VideoMeetingType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.VideoMeeting$b */
    private static final class C16119b extends ProtoAdapter<VideoMeeting> {
        C16119b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoMeeting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoMeeting videoMeeting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (videoMeeting.unique_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoMeeting.unique_id);
            } else {
                i = 0;
            }
            if (videoMeeting.meeting_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, videoMeeting.meeting_number);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (videoMeeting.is_expired != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, videoMeeting.is_expired);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (videoMeeting.meeting_url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoMeeting.meeting_url);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (videoMeeting.video_meeting_type != null) {
                i5 = VideoMeetingType.ADAPTER.encodedSizeWithTag(5, videoMeeting.video_meeting_type);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (videoMeeting.other_configs != null) {
                i6 = EventVideoMeetingConfig.OtherVideoMeetingConfigs.ADAPTER.encodedSizeWithTag(101, videoMeeting.other_configs);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (videoMeeting.google_configs != null) {
                i7 = EventVideoMeetingConfig.GoogleVideoMeetingConfigs.ADAPTER.encodedSizeWithTag(102, videoMeeting.google_configs);
            }
            return i12 + i7 + videoMeeting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoMeeting decode(ProtoReader protoReader) throws IOException {
            C16118a aVar = new C16118a();
            aVar.f42219a = "";
            aVar.f42220b = "";
            aVar.f42221c = false;
            aVar.f42222d = "";
            aVar.f42223e = VideoMeetingType.UNKNOWN_VIDEO_MEETING_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42219a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42220b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42221c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42222d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    try {
                        aVar.f42223e = VideoMeetingType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 101) {
                    aVar.mo57890a(EventVideoMeetingConfig.OtherVideoMeetingConfigs.ADAPTER.decode(protoReader));
                } else if (nextTag != 102) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo57889a(EventVideoMeetingConfig.GoogleVideoMeetingConfigs.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoMeeting videoMeeting) throws IOException {
            if (videoMeeting.unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoMeeting.unique_id);
            }
            if (videoMeeting.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoMeeting.meeting_number);
            }
            if (videoMeeting.is_expired != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, videoMeeting.is_expired);
            }
            if (videoMeeting.meeting_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoMeeting.meeting_url);
            }
            if (videoMeeting.video_meeting_type != null) {
                VideoMeetingType.ADAPTER.encodeWithTag(protoWriter, 5, videoMeeting.video_meeting_type);
            }
            if (videoMeeting.other_configs != null) {
                EventVideoMeetingConfig.OtherVideoMeetingConfigs.ADAPTER.encodeWithTag(protoWriter, 101, videoMeeting.other_configs);
            }
            if (videoMeeting.google_configs != null) {
                EventVideoMeetingConfig.GoogleVideoMeetingConfigs.ADAPTER.encodeWithTag(protoWriter, 102, videoMeeting.google_configs);
            }
            protoWriter.writeBytes(videoMeeting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16118a newBuilder() {
        C16118a aVar = new C16118a();
        aVar.f42219a = this.unique_id;
        aVar.f42220b = this.meeting_number;
        aVar.f42221c = this.is_expired;
        aVar.f42222d = this.meeting_url;
        aVar.f42223e = this.video_meeting_type;
        aVar.f42224f = this.other_configs;
        aVar.f42225g = this.google_configs;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.VideoMeeting$a */
    public static final class C16118a extends Message.Builder<VideoMeeting, C16118a> {

        /* renamed from: a */
        public String f42219a;

        /* renamed from: b */
        public String f42220b;

        /* renamed from: c */
        public Boolean f42221c;

        /* renamed from: d */
        public String f42222d;

        /* renamed from: e */
        public VideoMeetingType f42223e;

        /* renamed from: f */
        public EventVideoMeetingConfig.OtherVideoMeetingConfigs f42224f;

        /* renamed from: g */
        public EventVideoMeetingConfig.GoogleVideoMeetingConfigs f42225g;

        /* renamed from: a */
        public VideoMeeting build() {
            return new VideoMeeting(this.f42219a, this.f42220b, this.f42221c, this.f42222d, this.f42223e, this.f42224f, this.f42225g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16118a mo57891a(VideoMeetingType videoMeetingType) {
            this.f42223e = videoMeetingType;
            return this;
        }

        /* renamed from: b */
        public C16118a mo57895b(String str) {
            this.f42220b = str;
            return this;
        }

        /* renamed from: c */
        public C16118a mo57896c(String str) {
            this.f42222d = str;
            return this;
        }

        /* renamed from: a */
        public C16118a mo57889a(EventVideoMeetingConfig.GoogleVideoMeetingConfigs googleVideoMeetingConfigs) {
            this.f42225g = googleVideoMeetingConfigs;
            this.f42224f = null;
            return this;
        }

        /* renamed from: a */
        public C16118a mo57890a(EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs) {
            this.f42224f = otherVideoMeetingConfigs;
            this.f42225g = null;
            return this;
        }

        /* renamed from: a */
        public C16118a mo57892a(Boolean bool) {
            this.f42221c = bool;
            return this;
        }

        /* renamed from: a */
        public C16118a mo57893a(String str) {
            this.f42219a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "VideoMeeting");
        StringBuilder sb = new StringBuilder();
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        if (this.is_expired != null) {
            sb.append(", is_expired=");
            sb.append(this.is_expired);
        }
        if (this.meeting_url != null) {
            sb.append(", meeting_url=");
            sb.append(this.meeting_url);
        }
        if (this.video_meeting_type != null) {
            sb.append(", video_meeting_type=");
            sb.append(this.video_meeting_type);
        }
        if (this.other_configs != null) {
            sb.append(", other_configs=");
            sb.append(this.other_configs);
        }
        if (this.google_configs != null) {
            sb.append(", google_configs=");
            sb.append(this.google_configs);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoMeeting{");
        replace.append('}');
        return replace.toString();
    }

    public VideoMeeting(String str, String str2, Boolean bool, String str3, VideoMeetingType videoMeetingType, EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs, EventVideoMeetingConfig.GoogleVideoMeetingConfigs googleVideoMeetingConfigs) {
        this(str, str2, bool, str3, videoMeetingType, otherVideoMeetingConfigs, googleVideoMeetingConfigs, ByteString.EMPTY);
    }

    public VideoMeeting(String str, String str2, Boolean bool, String str3, VideoMeetingType videoMeetingType, EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs, EventVideoMeetingConfig.GoogleVideoMeetingConfigs googleVideoMeetingConfigs, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(otherVideoMeetingConfigs, googleVideoMeetingConfigs) <= 1) {
            this.unique_id = str;
            this.meeting_number = str2;
            this.is_expired = bool;
            this.meeting_url = str3;
            this.video_meeting_type = videoMeetingType;
            this.other_configs = otherVideoMeetingConfigs;
            this.google_configs = googleVideoMeetingConfigs;
            return;
        }
        throw new IllegalArgumentException("at most one of other_configs, google_configs may be non-null");
    }
}
