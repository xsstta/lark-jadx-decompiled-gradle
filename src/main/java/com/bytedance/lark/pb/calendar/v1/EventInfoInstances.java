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

public final class EventInfoInstances extends Message<EventInfoInstances, C15614a> {
    public static final ProtoAdapter<EventInfoInstances> ADAPTER = new C15615b();
    public static final Integer DEFAULT_COLOR = 0;
    public static final UserEventVisibility DEFAULT_EVENT_VISIBILITY = UserEventVisibility.BUSY_READER;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer color;
    public final String event_id;
    public final UserEventVisibility event_visibility;
    public final List<InstanceSpan> instance_spans;
    public final Boolean is_all_day;
    public final String key;
    public final List<CalendarLocation> locations;
    public final Long original_time;
    public final List<String> resource_calendar_ids;
    public final Long start_time;
    public final String summary;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventInfoInstances$b */
    private static final class C15615b extends ProtoAdapter<EventInfoInstances> {
        C15615b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventInfoInstances.class);
        }

        /* renamed from: a */
        public int encodedSize(EventInfoInstances eventInfoInstances) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (eventInfoInstances.event_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, eventInfoInstances.event_id);
            } else {
                i = 0;
            }
            if (eventInfoInstances.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, eventInfoInstances.summary);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (eventInfoInstances.key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, eventInfoInstances.key);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (eventInfoInstances.original_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, eventInfoInstances.original_time);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (eventInfoInstances.start_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, eventInfoInstances.start_time);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i11 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, eventInfoInstances.resource_calendar_ids) + CalendarLocation.ADAPTER.asRepeated().encodedSizeWithTag(7, eventInfoInstances.locations);
            if (eventInfoInstances.color != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(8, eventInfoInstances.color);
            } else {
                i6 = 0;
            }
            int i12 = encodedSizeWithTag + i6;
            if (eventInfoInstances.is_all_day != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, eventInfoInstances.is_all_day);
            } else {
                i7 = 0;
            }
            int i13 = i12 + i7;
            if (eventInfoInstances.event_visibility != null) {
                i8 = UserEventVisibility.ADAPTER.encodedSizeWithTag(10, eventInfoInstances.event_visibility);
            }
            return i13 + i8 + InstanceSpan.ADAPTER.asRepeated().encodedSizeWithTag(11, eventInfoInstances.instance_spans) + eventInfoInstances.unknownFields().size();
        }

        /* renamed from: a */
        public EventInfoInstances decode(ProtoReader protoReader) throws IOException {
            C15614a aVar = new C15614a();
            aVar.f41359a = "";
            aVar.f41360b = "";
            aVar.f41361c = "";
            aVar.f41362d = 0L;
            aVar.f41363e = 0L;
            aVar.f41366h = 0;
            aVar.f41367i = false;
            aVar.f41368j = UserEventVisibility.BUSY_READER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41359a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41360b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41361c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41362d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41363e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41364f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f41365g.add(CalendarLocation.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f41366h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41367i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f41368j = UserEventVisibility.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 11:
                            aVar.f41369k.add(InstanceSpan.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, EventInfoInstances eventInfoInstances) throws IOException {
            if (eventInfoInstances.event_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eventInfoInstances.event_id);
            }
            if (eventInfoInstances.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eventInfoInstances.summary);
            }
            if (eventInfoInstances.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, eventInfoInstances.key);
            }
            if (eventInfoInstances.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, eventInfoInstances.original_time);
            }
            if (eventInfoInstances.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, eventInfoInstances.start_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, eventInfoInstances.resource_calendar_ids);
            CalendarLocation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, eventInfoInstances.locations);
            if (eventInfoInstances.color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, eventInfoInstances.color);
            }
            if (eventInfoInstances.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, eventInfoInstances.is_all_day);
            }
            if (eventInfoInstances.event_visibility != null) {
                UserEventVisibility.ADAPTER.encodeWithTag(protoWriter, 10, eventInfoInstances.event_visibility);
            }
            InstanceSpan.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, eventInfoInstances.instance_spans);
            protoWriter.writeBytes(eventInfoInstances.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventInfoInstances$a */
    public static final class C15614a extends Message.Builder<EventInfoInstances, C15614a> {

        /* renamed from: a */
        public String f41359a;

        /* renamed from: b */
        public String f41360b;

        /* renamed from: c */
        public String f41361c;

        /* renamed from: d */
        public Long f41362d;

        /* renamed from: e */
        public Long f41363e;

        /* renamed from: f */
        public List<String> f41364f = Internal.newMutableList();

        /* renamed from: g */
        public List<CalendarLocation> f41365g = Internal.newMutableList();

        /* renamed from: h */
        public Integer f41366h;

        /* renamed from: i */
        public Boolean f41367i;

        /* renamed from: j */
        public UserEventVisibility f41368j;

        /* renamed from: k */
        public List<InstanceSpan> f41369k = Internal.newMutableList();

        /* renamed from: a */
        public EventInfoInstances build() {
            return new EventInfoInstances(this.f41359a, this.f41360b, this.f41361c, this.f41362d, this.f41363e, this.f41364f, this.f41365g, this.f41366h, this.f41367i, this.f41368j, this.f41369k, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15614a newBuilder() {
        C15614a aVar = new C15614a();
        aVar.f41359a = this.event_id;
        aVar.f41360b = this.summary;
        aVar.f41361c = this.key;
        aVar.f41362d = this.original_time;
        aVar.f41363e = this.start_time;
        aVar.f41364f = Internal.copyOf("resource_calendar_ids", this.resource_calendar_ids);
        aVar.f41365g = Internal.copyOf("locations", this.locations);
        aVar.f41366h = this.color;
        aVar.f41367i = this.is_all_day;
        aVar.f41368j = this.event_visibility;
        aVar.f41369k = Internal.copyOf("instance_spans", this.instance_spans);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EventInfoInstances");
        StringBuilder sb = new StringBuilder();
        if (this.event_id != null) {
            sb.append(", event_id=");
            sb.append(this.event_id);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (!this.resource_calendar_ids.isEmpty()) {
            sb.append(", resource_calendar_ids=");
            sb.append(this.resource_calendar_ids);
        }
        if (!this.locations.isEmpty()) {
            sb.append(", locations=");
            sb.append(this.locations);
        }
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.event_visibility != null) {
            sb.append(", event_visibility=");
            sb.append(this.event_visibility);
        }
        if (!this.instance_spans.isEmpty()) {
            sb.append(", instance_spans=");
            sb.append(this.instance_spans);
        }
        StringBuilder replace = sb.replace(0, 2, "EventInfoInstances{");
        replace.append('}');
        return replace.toString();
    }

    public EventInfoInstances(String str, String str2, String str3, Long l, Long l2, List<String> list, List<CalendarLocation> list2, Integer num, Boolean bool, UserEventVisibility userEventVisibility, List<InstanceSpan> list3) {
        this(str, str2, str3, l, l2, list, list2, num, bool, userEventVisibility, list3, ByteString.EMPTY);
    }

    public EventInfoInstances(String str, String str2, String str3, Long l, Long l2, List<String> list, List<CalendarLocation> list2, Integer num, Boolean bool, UserEventVisibility userEventVisibility, List<InstanceSpan> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_id = str;
        this.summary = str2;
        this.key = str3;
        this.original_time = l;
        this.start_time = l2;
        this.resource_calendar_ids = Internal.immutableCopyOf("resource_calendar_ids", list);
        this.locations = Internal.immutableCopyOf("locations", list2);
        this.color = num;
        this.is_all_day = bool;
        this.event_visibility = userEventVisibility;
        this.instance_spans = Internal.immutableCopyOf("instance_spans", list3);
    }
}
