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

public final class EventFilter extends Message<EventFilter, C15610a> {
    public static final ProtoAdapter<EventFilter> ADAPTER = new C15611b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> attendee_calendar_ids;
    public final List<String> calendar_ids;
    public final List<String> chat_ids;
    public final Long end_time;
    public final List<String> resource_calendar_ids;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventFilter$b */
    private static final class C15611b extends ProtoAdapter<EventFilter> {
        C15611b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventFilter.class);
        }

        /* renamed from: a */
        public int encodedSize(EventFilter eventFilter) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, eventFilter.calendar_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, eventFilter.attendee_calendar_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, eventFilter.resource_calendar_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, eventFilter.chat_ids);
            int i2 = 0;
            if (eventFilter.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(5, eventFilter.start_time);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (eventFilter.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(6, eventFilter.end_time);
            }
            return i3 + i2 + eventFilter.unknownFields().size();
        }

        /* renamed from: a */
        public EventFilter decode(ProtoReader protoReader) throws IOException {
            C15610a aVar = new C15610a();
            aVar.f41355e = 0L;
            aVar.f41356f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41351a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f41352b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f41353c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f41354d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f41355e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41356f = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, EventFilter eventFilter) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, eventFilter.calendar_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, eventFilter.attendee_calendar_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, eventFilter.resource_calendar_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, eventFilter.chat_ids);
            if (eventFilter.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, eventFilter.start_time);
            }
            if (eventFilter.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, eventFilter.end_time);
            }
            protoWriter.writeBytes(eventFilter.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventFilter$a */
    public static final class C15610a extends Message.Builder<EventFilter, C15610a> {

        /* renamed from: a */
        public List<String> f41351a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f41352b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f41353c = Internal.newMutableList();

        /* renamed from: d */
        public List<String> f41354d = Internal.newMutableList();

        /* renamed from: e */
        public Long f41355e;

        /* renamed from: f */
        public Long f41356f;

        /* renamed from: a */
        public EventFilter build() {
            return new EventFilter(this.f41351a, this.f41352b, this.f41353c, this.f41354d, this.f41355e, this.f41356f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15610a newBuilder() {
        C15610a aVar = new C15610a();
        aVar.f41351a = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.f41352b = Internal.copyOf("attendee_calendar_ids", this.attendee_calendar_ids);
        aVar.f41353c = Internal.copyOf("resource_calendar_ids", this.resource_calendar_ids);
        aVar.f41354d = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f41355e = this.start_time;
        aVar.f41356f = this.end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EventFilter");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        if (!this.attendee_calendar_ids.isEmpty()) {
            sb.append(", attendee_calendar_ids=");
            sb.append(this.attendee_calendar_ids);
        }
        if (!this.resource_calendar_ids.isEmpty()) {
            sb.append(", resource_calendar_ids=");
            sb.append(this.resource_calendar_ids);
        }
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "EventFilter{");
        replace.append('}');
        return replace.toString();
    }

    public EventFilter(List<String> list, List<String> list2, List<String> list3, List<String> list4, Long l, Long l2) {
        this(list, list2, list3, list4, l, l2, ByteString.EMPTY);
    }

    public EventFilter(List<String> list, List<String> list2, List<String> list3, List<String> list4, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
        this.attendee_calendar_ids = Internal.immutableCopyOf("attendee_calendar_ids", list2);
        this.resource_calendar_ids = Internal.immutableCopyOf("resource_calendar_ids", list3);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list4);
        this.start_time = l;
        this.end_time = l2;
    }
}
