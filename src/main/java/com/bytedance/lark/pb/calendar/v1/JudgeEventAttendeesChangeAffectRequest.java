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

public final class JudgeEventAttendeesChangeAffectRequest extends Message<JudgeEventAttendeesChangeAffectRequest, C15824a> {
    public static final ProtoAdapter<JudgeEventAttendeesChangeAffectRequest> ADAPTER = new C15825b();
    public static final Boolean DEFAULT_TOTAL_ATTENDEE_LOADED = false;
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;
    public final CalendarEvent original_event;
    public final List<CalendarEventAttendee> original_total_attendees;
    public final Boolean total_attendee_loaded;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeEventAttendeesChangeAffectRequest$b */
    private static final class C15825b extends ProtoAdapter<JudgeEventAttendeesChangeAffectRequest> {
        C15825b() {
            super(FieldEncoding.LENGTH_DELIMITED, JudgeEventAttendeesChangeAffectRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JudgeEventAttendeesChangeAffectRequest judgeEventAttendeesChangeAffectRequest) {
            int i;
            int encodedSizeWithTag = CalendarEvent.ADAPTER.encodedSizeWithTag(1, judgeEventAttendeesChangeAffectRequest.event) + CalendarEvent.ADAPTER.encodedSizeWithTag(2, judgeEventAttendeesChangeAffectRequest.original_event) + CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(3, judgeEventAttendeesChangeAffectRequest.original_total_attendees);
            if (judgeEventAttendeesChangeAffectRequest.total_attendee_loaded != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, judgeEventAttendeesChangeAffectRequest.total_attendee_loaded);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + judgeEventAttendeesChangeAffectRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JudgeEventAttendeesChangeAffectRequest decode(ProtoReader protoReader) throws IOException {
            C15824a aVar = new C15824a();
            aVar.f41623d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41620a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41621b = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41622c.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41623d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JudgeEventAttendeesChangeAffectRequest judgeEventAttendeesChangeAffectRequest) throws IOException {
            CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, judgeEventAttendeesChangeAffectRequest.event);
            CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 2, judgeEventAttendeesChangeAffectRequest.original_event);
            CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, judgeEventAttendeesChangeAffectRequest.original_total_attendees);
            if (judgeEventAttendeesChangeAffectRequest.total_attendee_loaded != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, judgeEventAttendeesChangeAffectRequest.total_attendee_loaded);
            }
            protoWriter.writeBytes(judgeEventAttendeesChangeAffectRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeEventAttendeesChangeAffectRequest$a */
    public static final class C15824a extends Message.Builder<JudgeEventAttendeesChangeAffectRequest, C15824a> {

        /* renamed from: a */
        public CalendarEvent f41620a;

        /* renamed from: b */
        public CalendarEvent f41621b;

        /* renamed from: c */
        public List<CalendarEventAttendee> f41622c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f41623d;

        /* renamed from: a */
        public JudgeEventAttendeesChangeAffectRequest build() {
            CalendarEvent calendarEvent;
            CalendarEvent calendarEvent2 = this.f41620a;
            if (calendarEvent2 != null && (calendarEvent = this.f41621b) != null) {
                return new JudgeEventAttendeesChangeAffectRequest(calendarEvent2, calendarEvent, this.f41622c, this.f41623d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(calendarEvent2, "event", this.f41621b, "original_event");
        }

        /* renamed from: a */
        public C15824a mo57131a(CalendarEvent calendarEvent) {
            this.f41620a = calendarEvent;
            return this;
        }

        /* renamed from: b */
        public C15824a mo57135b(CalendarEvent calendarEvent) {
            this.f41621b = calendarEvent;
            return this;
        }

        /* renamed from: a */
        public C15824a mo57132a(Boolean bool) {
            this.f41623d = bool;
            return this;
        }

        /* renamed from: a */
        public C15824a mo57133a(List<CalendarEventAttendee> list) {
            Internal.checkElementsNotNull(list);
            this.f41622c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15824a newBuilder() {
        C15824a aVar = new C15824a();
        aVar.f41620a = this.event;
        aVar.f41621b = this.original_event;
        aVar.f41622c = Internal.copyOf("original_total_attendees", this.original_total_attendees);
        aVar.f41623d = this.total_attendee_loaded;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "JudgeEventAttendeesChangeAffectRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", original_event=");
        sb.append(this.original_event);
        if (!this.original_total_attendees.isEmpty()) {
            sb.append(", original_total_attendees=");
            sb.append(this.original_total_attendees);
        }
        if (this.total_attendee_loaded != null) {
            sb.append(", total_attendee_loaded=");
            sb.append(this.total_attendee_loaded);
        }
        StringBuilder replace = sb.replace(0, 2, "JudgeEventAttendeesChangeAffectRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JudgeEventAttendeesChangeAffectRequest(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, List<CalendarEventAttendee> list, Boolean bool) {
        this(calendarEvent, calendarEvent2, list, bool, ByteString.EMPTY);
    }

    public JudgeEventAttendeesChangeAffectRequest(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, List<CalendarEventAttendee> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.original_event = calendarEvent2;
        this.original_total_attendees = Internal.immutableCopyOf("original_total_attendees", list);
        this.total_attendee_loaded = bool;
    }
}
