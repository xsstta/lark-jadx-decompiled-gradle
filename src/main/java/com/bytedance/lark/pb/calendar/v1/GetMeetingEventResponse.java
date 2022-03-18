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

public final class GetMeetingEventResponse extends Message<GetMeetingEventResponse, C15730a> {
    public static final ProtoAdapter<GetMeetingEventResponse> ADAPTER = new C15731b();
    private static final long serialVersionUID = 0;
    public final Chat chat;
    public final CalendarEvent event;
    public final Meeting meeting;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingEventResponse$b */
    private static final class C15731b extends ProtoAdapter<GetMeetingEventResponse> {
        C15731b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingEventResponse getMeetingEventResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getMeetingEventResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, getMeetingEventResponse.event);
            } else {
                i = 0;
            }
            if (getMeetingEventResponse.meeting != null) {
                i2 = Meeting.ADAPTER.encodedSizeWithTag(2, getMeetingEventResponse.meeting);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getMeetingEventResponse.chat != null) {
                i3 = Chat.ADAPTER.encodedSizeWithTag(3, getMeetingEventResponse.chat);
            }
            return i4 + i3 + getMeetingEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingEventResponse decode(ProtoReader protoReader) throws IOException {
            C15730a aVar = new C15730a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41490a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41491b = Meeting.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41492c = Chat.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingEventResponse getMeetingEventResponse) throws IOException {
            if (getMeetingEventResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, getMeetingEventResponse.event);
            }
            if (getMeetingEventResponse.meeting != null) {
                Meeting.ADAPTER.encodeWithTag(protoWriter, 2, getMeetingEventResponse.meeting);
            }
            if (getMeetingEventResponse.chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 3, getMeetingEventResponse.chat);
            }
            protoWriter.writeBytes(getMeetingEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingEventResponse$a */
    public static final class C15730a extends Message.Builder<GetMeetingEventResponse, C15730a> {

        /* renamed from: a */
        public CalendarEvent f41490a;

        /* renamed from: b */
        public Meeting f41491b;

        /* renamed from: c */
        public Chat f41492c;

        /* renamed from: a */
        public GetMeetingEventResponse build() {
            return new GetMeetingEventResponse(this.f41490a, this.f41491b, this.f41492c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15730a newBuilder() {
        C15730a aVar = new C15730a();
        aVar.f41490a = this.event;
        aVar.f41491b = this.meeting;
        aVar.f41492c = this.chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.meeting != null) {
            sb.append(", meeting=");
            sb.append(this.meeting);
        }
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingEventResponse(CalendarEvent calendarEvent, Meeting meeting2, Chat chat2) {
        this(calendarEvent, meeting2, chat2, ByteString.EMPTY);
    }

    public GetMeetingEventResponse(CalendarEvent calendarEvent, Meeting meeting2, Chat chat2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.meeting = meeting2;
        this.chat = chat2;
    }
}
