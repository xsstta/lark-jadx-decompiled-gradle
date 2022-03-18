package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class JudgeNotificationBoxTypeRequest extends Message<JudgeNotificationBoxTypeRequest, C15828a> {
    public static final ProtoAdapter<JudgeNotificationBoxTypeRequest> ADAPTER = new C15829b();
    public static final Long DEFAULT_INSTANCE_START_TIME = 0L;
    public static final EventOperationType DEFAULT_OPERATION_TYPE = EventOperationType.OP_CREATE_EVENT;
    public static final CalendarEvent.Span DEFAULT_SPAN = CalendarEvent.Span.NONE_SPAN;
    public static final Boolean DEFAULT_TOTAL_ATTENDEE_LOADED = false;
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;
    public final Long instance_start_time;
    public final EventOperationType operation_type;
    public final CalendarEvent original_event;
    public final List<CalendarEventAttendee> original_total_attendees;
    public final CalendarEvent.Span span;
    public final Boolean total_attendee_loaded;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeNotificationBoxTypeRequest$b */
    private static final class C15829b extends ProtoAdapter<JudgeNotificationBoxTypeRequest> {
        C15829b() {
            super(FieldEncoding.LENGTH_DELIMITED, JudgeNotificationBoxTypeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JudgeNotificationBoxTypeRequest judgeNotificationBoxTypeRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = EventOperationType.ADAPTER.encodedSizeWithTag(1, judgeNotificationBoxTypeRequest.operation_type) + CalendarEvent.Span.ADAPTER.encodedSizeWithTag(2, judgeNotificationBoxTypeRequest.span) + CalendarEvent.ADAPTER.encodedSizeWithTag(3, judgeNotificationBoxTypeRequest.event);
            int i3 = 0;
            if (judgeNotificationBoxTypeRequest.original_event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(4, judgeNotificationBoxTypeRequest.original_event);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (judgeNotificationBoxTypeRequest.instance_start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(5, judgeNotificationBoxTypeRequest.instance_start_time);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i4 + i2 + CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(6, judgeNotificationBoxTypeRequest.original_total_attendees);
            if (judgeNotificationBoxTypeRequest.total_attendee_loaded != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(7, judgeNotificationBoxTypeRequest.total_attendee_loaded);
            }
            return encodedSizeWithTag2 + i3 + judgeNotificationBoxTypeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JudgeNotificationBoxTypeRequest decode(ProtoReader protoReader) throws IOException {
            C15828a aVar = new C15828a();
            aVar.f41625a = EventOperationType.OP_CREATE_EVENT;
            aVar.f41626b = CalendarEvent.Span.NONE_SPAN;
            aVar.f41629e = 0L;
            aVar.f41631g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f41625a = EventOperationType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            try {
                                aVar.f41626b = CalendarEvent.Span.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f41627c = CalendarEvent.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41628d = CalendarEvent.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41629e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41630f.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f41631g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JudgeNotificationBoxTypeRequest judgeNotificationBoxTypeRequest) throws IOException {
            EventOperationType.ADAPTER.encodeWithTag(protoWriter, 1, judgeNotificationBoxTypeRequest.operation_type);
            CalendarEvent.Span.ADAPTER.encodeWithTag(protoWriter, 2, judgeNotificationBoxTypeRequest.span);
            CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 3, judgeNotificationBoxTypeRequest.event);
            if (judgeNotificationBoxTypeRequest.original_event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 4, judgeNotificationBoxTypeRequest.original_event);
            }
            if (judgeNotificationBoxTypeRequest.instance_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, judgeNotificationBoxTypeRequest.instance_start_time);
            }
            CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, judgeNotificationBoxTypeRequest.original_total_attendees);
            if (judgeNotificationBoxTypeRequest.total_attendee_loaded != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, judgeNotificationBoxTypeRequest.total_attendee_loaded);
            }
            protoWriter.writeBytes(judgeNotificationBoxTypeRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15828a newBuilder() {
        C15828a aVar = new C15828a();
        aVar.f41625a = this.operation_type;
        aVar.f41626b = this.span;
        aVar.f41627c = this.event;
        aVar.f41628d = this.original_event;
        aVar.f41629e = this.instance_start_time;
        aVar.f41630f = Internal.copyOf("original_total_attendees", this.original_total_attendees);
        aVar.f41631g = this.total_attendee_loaded;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "JudgeNotificationBoxTypeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", operation_type=");
        sb.append(this.operation_type);
        sb.append(", span=");
        sb.append(this.span);
        sb.append(", event=");
        sb.append(this.event);
        if (this.original_event != null) {
            sb.append(", original_event=");
            sb.append(this.original_event);
        }
        if (this.instance_start_time != null) {
            sb.append(", instance_start_time=");
            sb.append(this.instance_start_time);
        }
        if (!this.original_total_attendees.isEmpty()) {
            sb.append(", original_total_attendees=");
            sb.append(this.original_total_attendees);
        }
        if (this.total_attendee_loaded != null) {
            sb.append(", total_attendee_loaded=");
            sb.append(this.total_attendee_loaded);
        }
        StringBuilder replace = sb.replace(0, 2, "JudgeNotificationBoxTypeRequest{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeNotificationBoxTypeRequest$a */
    public static final class C15828a extends Message.Builder<JudgeNotificationBoxTypeRequest, C15828a> {

        /* renamed from: a */
        public EventOperationType f41625a;

        /* renamed from: b */
        public CalendarEvent.Span f41626b;

        /* renamed from: c */
        public CalendarEvent f41627c;

        /* renamed from: d */
        public CalendarEvent f41628d;

        /* renamed from: e */
        public Long f41629e;

        /* renamed from: f */
        public List<CalendarEventAttendee> f41630f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f41631g;

        /* renamed from: a */
        public JudgeNotificationBoxTypeRequest build() {
            CalendarEvent.Span span;
            CalendarEvent calendarEvent;
            EventOperationType eventOperationType = this.f41625a;
            if (eventOperationType != null && (span = this.f41626b) != null && (calendarEvent = this.f41627c) != null) {
                return new JudgeNotificationBoxTypeRequest(eventOperationType, span, calendarEvent, this.f41628d, this.f41629e, this.f41630f, this.f41631g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(eventOperationType, "operation_type", this.f41626b, "span", this.f41627c, "event");
        }

        /* renamed from: a */
        public C15828a mo57143a(CalendarEvent.Span span) {
            this.f41626b = span;
            return this;
        }

        /* renamed from: b */
        public C15828a mo57150b(CalendarEvent calendarEvent) {
            this.f41628d = calendarEvent;
            return this;
        }

        /* renamed from: a */
        public C15828a mo57144a(CalendarEvent calendarEvent) {
            this.f41627c = calendarEvent;
            return this;
        }

        /* renamed from: a */
        public C15828a mo57145a(EventOperationType eventOperationType) {
            this.f41625a = eventOperationType;
            return this;
        }

        /* renamed from: a */
        public C15828a mo57146a(Boolean bool) {
            this.f41631g = bool;
            return this;
        }

        /* renamed from: a */
        public C15828a mo57147a(Long l) {
            this.f41629e = l;
            return this;
        }

        /* renamed from: a */
        public C15828a mo57148a(List<CalendarEventAttendee> list) {
            Internal.checkElementsNotNull(list);
            this.f41630f = list;
            return this;
        }
    }

    public JudgeNotificationBoxTypeRequest(EventOperationType eventOperationType, CalendarEvent.Span span2, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, Long l, List<CalendarEventAttendee> list, Boolean bool) {
        this(eventOperationType, span2, calendarEvent, calendarEvent2, l, list, bool, ByteString.EMPTY);
    }

    public JudgeNotificationBoxTypeRequest(EventOperationType eventOperationType, CalendarEvent.Span span2, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, Long l, List<CalendarEventAttendee> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operation_type = eventOperationType;
        this.span = span2;
        this.event = calendarEvent;
        this.original_event = calendarEvent2;
        this.instance_start_time = l;
        this.original_total_attendees = Internal.immutableCopyOf("original_total_attendees", list);
        this.total_attendee_loaded = bool;
    }
}
