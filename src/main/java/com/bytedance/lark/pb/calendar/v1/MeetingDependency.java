package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MeetingDependency extends Message<MeetingDependency, C15866a> {
    public static final ProtoAdapter<MeetingDependency> ADAPTER = new C15867b();
    private static final long serialVersionUID = 0;
    public final Chat chat;
    public final CalendarEvent event;
    public final CalendarEventInstanceTime instance_time;
    public final Meeting meeting;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingDependency$b */
    private static final class C15867b extends ProtoAdapter<MeetingDependency> {
        C15867b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingDependency.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingDependency meetingDependency) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (meetingDependency.meeting != null) {
                i = Meeting.ADAPTER.encodedSizeWithTag(1, meetingDependency.meeting);
            } else {
                i = 0;
            }
            if (meetingDependency.event != null) {
                i2 = CalendarEvent.ADAPTER.encodedSizeWithTag(2, meetingDependency.event);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (meetingDependency.instance_time != null) {
                i3 = CalendarEventInstanceTime.ADAPTER.encodedSizeWithTag(3, meetingDependency.instance_time);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (meetingDependency.chat != null) {
                i4 = Chat.ADAPTER.encodedSizeWithTag(4, meetingDependency.chat);
            }
            return i6 + i4 + meetingDependency.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingDependency decode(ProtoReader protoReader) throws IOException {
            C15866a aVar = new C15866a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41691a = Meeting.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41692b = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41693c = CalendarEventInstanceTime.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41694d = Chat.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingDependency meetingDependency) throws IOException {
            if (meetingDependency.meeting != null) {
                Meeting.ADAPTER.encodeWithTag(protoWriter, 1, meetingDependency.meeting);
            }
            if (meetingDependency.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 2, meetingDependency.event);
            }
            if (meetingDependency.instance_time != null) {
                CalendarEventInstanceTime.ADAPTER.encodeWithTag(protoWriter, 3, meetingDependency.instance_time);
            }
            if (meetingDependency.chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 4, meetingDependency.chat);
            }
            protoWriter.writeBytes(meetingDependency.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingDependency$a */
    public static final class C15866a extends Message.Builder<MeetingDependency, C15866a> {

        /* renamed from: a */
        public Meeting f41691a;

        /* renamed from: b */
        public CalendarEvent f41692b;

        /* renamed from: c */
        public CalendarEventInstanceTime f41693c;

        /* renamed from: d */
        public Chat f41694d;

        /* renamed from: a */
        public MeetingDependency build() {
            return new MeetingDependency(this.f41691a, this.f41692b, this.f41693c, this.f41694d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15866a newBuilder() {
        C15866a aVar = new C15866a();
        aVar.f41691a = this.meeting;
        aVar.f41692b = this.event;
        aVar.f41693c = this.instance_time;
        aVar.f41694d = this.chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MeetingDependency");
        StringBuilder sb = new StringBuilder();
        if (this.meeting != null) {
            sb.append(", meeting=");
            sb.append(this.meeting);
        }
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.instance_time != null) {
            sb.append(", instance_time=");
            sb.append(this.instance_time);
        }
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingDependency{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingDependency(Meeting meeting2, CalendarEvent calendarEvent, CalendarEventInstanceTime calendarEventInstanceTime, Chat chat2) {
        this(meeting2, calendarEvent, calendarEventInstanceTime, chat2, ByteString.EMPTY);
    }

    public MeetingDependency(Meeting meeting2, CalendarEvent calendarEvent, CalendarEventInstanceTime calendarEventInstanceTime, Chat chat2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting = meeting2;
        this.event = calendarEvent;
        this.instance_time = calendarEventInstanceTime;
        this.chat = chat2;
    }
}
