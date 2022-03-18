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
import java.util.Map;
import okio.ByteString;

public final class SaveEventRequest extends Message<SaveEventRequest, C15990a> {
    public static final ProtoAdapter<SaveEventRequest> ADAPTER = new C15991b();
    public static final CalendarEvent.Span DEFAULT_SPAN = CalendarEvent.Span.NONE_SPAN;
    public static final Boolean DEFAULT_TOTAL_ATTENDEE_LOADED = false;
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;
    public final Map<String, SimpleMembers> group_simple_members;
    public final CalendarEventInstance instance;
    public final CalendarEvent original_event;
    public final List<CalendarEventAttendee> original_total_attendees;
    public final String share_to_chat_id;
    public final CalendarEvent.Span span;
    public final Boolean total_attendee_loaded;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveEventRequest$b */
    private static final class C15991b extends ProtoAdapter<SaveEventRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SimpleMembers>> f42013a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SimpleMembers.ADAPTER);

        C15991b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveEventRequest saveEventRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = CalendarEvent.ADAPTER.encodedSizeWithTag(1, saveEventRequest.event);
            int i4 = 0;
            if (saveEventRequest.original_event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(2, saveEventRequest.original_event);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (saveEventRequest.instance != null) {
                i2 = CalendarEventInstance.ADAPTER.encodedSizeWithTag(3, saveEventRequest.instance);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i5 + i2 + CalendarEvent.Span.ADAPTER.encodedSizeWithTag(4, saveEventRequest.span);
            if (saveEventRequest.share_to_chat_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, saveEventRequest.share_to_chat_id);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i3 + this.f42013a.encodedSizeWithTag(6, saveEventRequest.group_simple_members) + CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(7, saveEventRequest.original_total_attendees);
            if (saveEventRequest.total_attendee_loaded != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(9, saveEventRequest.total_attendee_loaded);
            }
            return encodedSizeWithTag3 + i4 + saveEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SaveEventRequest decode(ProtoReader protoReader) throws IOException {
            C15990a aVar = new C15990a();
            aVar.f42008d = CalendarEvent.Span.NONE_SPAN;
            aVar.f42009e = "";
            aVar.f42012h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42005a = CalendarEvent.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42006b = CalendarEvent.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42007c = CalendarEventInstance.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f42008d = CalendarEvent.Span.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f42009e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42010f.putAll(this.f42013a.decode(protoReader));
                            break;
                        case 7:
                            aVar.f42011g.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 9:
                            aVar.f42012h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveEventRequest saveEventRequest) throws IOException {
            CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, saveEventRequest.event);
            if (saveEventRequest.original_event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 2, saveEventRequest.original_event);
            }
            if (saveEventRequest.instance != null) {
                CalendarEventInstance.ADAPTER.encodeWithTag(protoWriter, 3, saveEventRequest.instance);
            }
            CalendarEvent.Span.ADAPTER.encodeWithTag(protoWriter, 4, saveEventRequest.span);
            if (saveEventRequest.share_to_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, saveEventRequest.share_to_chat_id);
            }
            this.f42013a.encodeWithTag(protoWriter, 6, saveEventRequest.group_simple_members);
            CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, saveEventRequest.original_total_attendees);
            if (saveEventRequest.total_attendee_loaded != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, saveEventRequest.total_attendee_loaded);
            }
            protoWriter.writeBytes(saveEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15990a newBuilder() {
        C15990a aVar = new C15990a();
        aVar.f42005a = this.event;
        aVar.f42006b = this.original_event;
        aVar.f42007c = this.instance;
        aVar.f42008d = this.span;
        aVar.f42009e = this.share_to_chat_id;
        aVar.f42010f = Internal.copyOf("group_simple_members", this.group_simple_members);
        aVar.f42011g = Internal.copyOf("original_total_attendees", this.original_total_attendees);
        aVar.f42012h = this.total_attendee_loaded;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SaveEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", event=");
        sb.append(this.event);
        if (this.original_event != null) {
            sb.append(", original_event=");
            sb.append(this.original_event);
        }
        if (this.instance != null) {
            sb.append(", instance=");
            sb.append(this.instance);
        }
        sb.append(", span=");
        sb.append(this.span);
        if (this.share_to_chat_id != null) {
            sb.append(", share_to_chat_id=");
            sb.append(this.share_to_chat_id);
        }
        if (!this.group_simple_members.isEmpty()) {
            sb.append(", group_simple_members=");
            sb.append(this.group_simple_members);
        }
        if (!this.original_total_attendees.isEmpty()) {
            sb.append(", original_total_attendees=");
            sb.append(this.original_total_attendees);
        }
        if (this.total_attendee_loaded != null) {
            sb.append(", total_attendee_loaded=");
            sb.append(this.total_attendee_loaded);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveEventRequest$a */
    public static final class C15990a extends Message.Builder<SaveEventRequest, C15990a> {

        /* renamed from: a */
        public CalendarEvent f42005a;

        /* renamed from: b */
        public CalendarEvent f42006b;

        /* renamed from: c */
        public CalendarEventInstance f42007c;

        /* renamed from: d */
        public CalendarEvent.Span f42008d;

        /* renamed from: e */
        public String f42009e;

        /* renamed from: f */
        public Map<String, SimpleMembers> f42010f = Internal.newMutableMap();

        /* renamed from: g */
        public List<CalendarEventAttendee> f42011g = Internal.newMutableList();

        /* renamed from: h */
        public Boolean f42012h;

        /* renamed from: a */
        public SaveEventRequest build() {
            CalendarEvent.Span span;
            CalendarEvent calendarEvent = this.f42005a;
            if (calendarEvent != null && (span = this.f42008d) != null) {
                return new SaveEventRequest(calendarEvent, this.f42006b, this.f42007c, span, this.f42009e, this.f42010f, this.f42011g, this.f42012h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(calendarEvent, "event", this.f42008d, "span");
        }

        /* renamed from: a */
        public C15990a mo57553a(CalendarEvent.Span span) {
            this.f42008d = span;
            return this;
        }

        /* renamed from: b */
        public C15990a mo57561b(CalendarEvent calendarEvent) {
            this.f42006b = calendarEvent;
            return this;
        }

        /* renamed from: a */
        public C15990a mo57554a(CalendarEvent calendarEvent) {
            this.f42005a = calendarEvent;
            return this;
        }

        /* renamed from: a */
        public C15990a mo57555a(CalendarEventInstance calendarEventInstance) {
            this.f42007c = calendarEventInstance;
            return this;
        }

        /* renamed from: a */
        public C15990a mo57556a(Boolean bool) {
            this.f42012h = bool;
            return this;
        }

        /* renamed from: a */
        public C15990a mo57557a(String str) {
            this.f42009e = str;
            return this;
        }

        /* renamed from: a */
        public C15990a mo57558a(List<CalendarEventAttendee> list) {
            Internal.checkElementsNotNull(list);
            this.f42011g = list;
            return this;
        }

        /* renamed from: a */
        public C15990a mo57559a(Map<String, SimpleMembers> map) {
            Internal.checkElementsNotNull(map);
            this.f42010f = map;
            return this;
        }
    }

    public SaveEventRequest(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span2, String str, Map<String, SimpleMembers> map, List<CalendarEventAttendee> list, Boolean bool) {
        this(calendarEvent, calendarEvent2, calendarEventInstance, span2, str, map, list, bool, ByteString.EMPTY);
    }

    public SaveEventRequest(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span2, String str, Map<String, SimpleMembers> map, List<CalendarEventAttendee> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.original_event = calendarEvent2;
        this.instance = calendarEventInstance;
        this.span = span2;
        this.share_to_chat_id = str;
        this.group_simple_members = Internal.immutableCopyOf("group_simple_members", map);
        this.original_total_attendees = Internal.immutableCopyOf("original_total_attendees", list);
        this.total_attendee_loaded = bool;
    }
}
