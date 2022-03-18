package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushCalendarEventVideoMeetingChange extends Message<PushCalendarEventVideoMeetingChange, C15952a> {
    public static final ProtoAdapter<PushCalendarEventVideoMeetingChange> ADAPTER = new C15953b();
    private static final long serialVersionUID = 0;
    public final List<EventVideoMeetingInfo> event_video_meeting_info;

    public static final class EventVideoMeetingInfo extends Message<EventVideoMeetingInfo, C15950a> {
        public static final ProtoAdapter<EventVideoMeetingInfo> ADAPTER = new C15951b();
        public static final Long DEFAULT_ORIGINAL_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final String calendar_id;
        public final String key;
        public final Long original_time;
        public final VideoMeeting video_meeting;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventVideoMeetingChange$EventVideoMeetingInfo$b */
        private static final class C15951b extends ProtoAdapter<EventVideoMeetingInfo> {
            C15951b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventVideoMeetingInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(EventVideoMeetingInfo eventVideoMeetingInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (eventVideoMeetingInfo.calendar_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, eventVideoMeetingInfo.calendar_id);
                } else {
                    i = 0;
                }
                if (eventVideoMeetingInfo.key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, eventVideoMeetingInfo.key);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (eventVideoMeetingInfo.original_time != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, eventVideoMeetingInfo.original_time);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (eventVideoMeetingInfo.video_meeting != null) {
                    i4 = VideoMeeting.ADAPTER.encodedSizeWithTag(4, eventVideoMeetingInfo.video_meeting);
                }
                return i6 + i4 + eventVideoMeetingInfo.unknownFields().size();
            }

            /* renamed from: a */
            public EventVideoMeetingInfo decode(ProtoReader protoReader) throws IOException {
                C15950a aVar = new C15950a();
                aVar.f41943a = "";
                aVar.f41944b = "";
                aVar.f41945c = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f41943a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f41944b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f41945c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41946d = VideoMeeting.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventVideoMeetingInfo eventVideoMeetingInfo) throws IOException {
                if (eventVideoMeetingInfo.calendar_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eventVideoMeetingInfo.calendar_id);
                }
                if (eventVideoMeetingInfo.key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eventVideoMeetingInfo.key);
                }
                if (eventVideoMeetingInfo.original_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, eventVideoMeetingInfo.original_time);
                }
                if (eventVideoMeetingInfo.video_meeting != null) {
                    VideoMeeting.ADAPTER.encodeWithTag(protoWriter, 4, eventVideoMeetingInfo.video_meeting);
                }
                protoWriter.writeBytes(eventVideoMeetingInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventVideoMeetingChange$EventVideoMeetingInfo$a */
        public static final class C15950a extends Message.Builder<EventVideoMeetingInfo, C15950a> {

            /* renamed from: a */
            public String f41943a;

            /* renamed from: b */
            public String f41944b;

            /* renamed from: c */
            public Long f41945c;

            /* renamed from: d */
            public VideoMeeting f41946d;

            /* renamed from: a */
            public EventVideoMeetingInfo build() {
                return new EventVideoMeetingInfo(this.f41943a, this.f41944b, this.f41945c, this.f41946d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15950a newBuilder() {
            C15950a aVar = new C15950a();
            aVar.f41943a = this.calendar_id;
            aVar.f41944b = this.key;
            aVar.f41945c = this.original_time;
            aVar.f41946d = this.video_meeting;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "EventVideoMeetingInfo");
            StringBuilder sb = new StringBuilder();
            if (this.calendar_id != null) {
                sb.append(", calendar_id=");
                sb.append(this.calendar_id);
            }
            if (this.key != null) {
                sb.append(", key=");
                sb.append(this.key);
            }
            if (this.original_time != null) {
                sb.append(", original_time=");
                sb.append(this.original_time);
            }
            if (this.video_meeting != null) {
                sb.append(", video_meeting=");
                sb.append(this.video_meeting);
            }
            StringBuilder replace = sb.replace(0, 2, "EventVideoMeetingInfo{");
            replace.append('}');
            return replace.toString();
        }

        public EventVideoMeetingInfo(String str, String str2, Long l, VideoMeeting videoMeeting) {
            this(str, str2, l, videoMeeting, ByteString.EMPTY);
        }

        public EventVideoMeetingInfo(String str, String str2, Long l, VideoMeeting videoMeeting, ByteString byteString) {
            super(ADAPTER, byteString);
            this.calendar_id = str;
            this.key = str2;
            this.original_time = l;
            this.video_meeting = videoMeeting;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventVideoMeetingChange$b */
    private static final class C15953b extends ProtoAdapter<PushCalendarEventVideoMeetingChange> {
        C15953b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCalendarEventVideoMeetingChange.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCalendarEventVideoMeetingChange pushCalendarEventVideoMeetingChange) {
            return EventVideoMeetingInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, pushCalendarEventVideoMeetingChange.event_video_meeting_info) + pushCalendarEventVideoMeetingChange.unknownFields().size();
        }

        /* renamed from: a */
        public PushCalendarEventVideoMeetingChange decode(ProtoReader protoReader) throws IOException {
            C15952a aVar = new C15952a();
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
                    aVar.f41947a.add(EventVideoMeetingInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCalendarEventVideoMeetingChange pushCalendarEventVideoMeetingChange) throws IOException {
            EventVideoMeetingInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushCalendarEventVideoMeetingChange.event_video_meeting_info);
            protoWriter.writeBytes(pushCalendarEventVideoMeetingChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventVideoMeetingChange$a */
    public static final class C15952a extends Message.Builder<PushCalendarEventVideoMeetingChange, C15952a> {

        /* renamed from: a */
        public List<EventVideoMeetingInfo> f41947a = Internal.newMutableList();

        /* renamed from: a */
        public PushCalendarEventVideoMeetingChange build() {
            return new PushCalendarEventVideoMeetingChange(this.f41947a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15952a newBuilder() {
        C15952a aVar = new C15952a();
        aVar.f41947a = Internal.copyOf("event_video_meeting_info", this.event_video_meeting_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushCalendarEventVideoMeetingChange");
        StringBuilder sb = new StringBuilder();
        if (!this.event_video_meeting_info.isEmpty()) {
            sb.append(", event_video_meeting_info=");
            sb.append(this.event_video_meeting_info);
        }
        StringBuilder replace = sb.replace(0, 2, "PushCalendarEventVideoMeetingChange{");
        replace.append('}');
        return replace.toString();
    }

    public PushCalendarEventVideoMeetingChange(List<EventVideoMeetingInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public PushCalendarEventVideoMeetingChange(List<EventVideoMeetingInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_video_meeting_info = Internal.immutableCopyOf("event_video_meeting_info", list);
    }
}
