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
import java.util.Map;
import okio.ByteString;

public final class PullCalendarInstancesResponse extends Message<PullCalendarInstancesResponse, C15924a> {
    public static final ProtoAdapter<PullCalendarInstancesResponse> ADAPTER = new C15925b();
    public static final Long DEFAULT_NEXT_BEGIN_TIME = 0L;
    public static final Integer DEFAULT_NEXT_MIN_TIMESPAN = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarResource> calendar_id_to_resource;
    public final List<EventInfoInstances> calendar_instances;
    public final Long next_begin_time;
    public final String next_event_id;
    public final Integer next_min_timespan;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullCalendarInstancesResponse$a */
    public static final class C15924a extends Message.Builder<PullCalendarInstancesResponse, C15924a> {

        /* renamed from: a */
        public List<EventInfoInstances> f41889a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, CalendarResource> f41890b = Internal.newMutableMap();

        /* renamed from: c */
        public Long f41891c;

        /* renamed from: d */
        public Integer f41892d;

        /* renamed from: e */
        public String f41893e;

        /* renamed from: a */
        public PullCalendarInstancesResponse build() {
            return new PullCalendarInstancesResponse(this.f41889a, this.f41890b, this.f41891c, this.f41892d, this.f41893e, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullCalendarInstancesResponse$b */
    private static final class C15925b extends ProtoAdapter<PullCalendarInstancesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarResource>> f41894a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarResource.ADAPTER);

        C15925b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullCalendarInstancesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullCalendarInstancesResponse pullCalendarInstancesResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = EventInfoInstances.ADAPTER.asRepeated().encodedSizeWithTag(1, pullCalendarInstancesResponse.calendar_instances) + this.f41894a.encodedSizeWithTag(2, pullCalendarInstancesResponse.calendar_id_to_resource);
            int i3 = 0;
            if (pullCalendarInstancesResponse.next_begin_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, pullCalendarInstancesResponse.next_begin_time);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (pullCalendarInstancesResponse.next_min_timespan != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, pullCalendarInstancesResponse.next_min_timespan);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (pullCalendarInstancesResponse.next_event_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, pullCalendarInstancesResponse.next_event_id);
            }
            return i5 + i3 + pullCalendarInstancesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullCalendarInstancesResponse decode(ProtoReader protoReader) throws IOException {
            C15924a aVar = new C15924a();
            aVar.f41891c = 0L;
            aVar.f41892d = 0;
            aVar.f41893e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41889a.add(EventInfoInstances.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41890b.putAll(this.f41894a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f41891c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41892d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41893e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullCalendarInstancesResponse pullCalendarInstancesResponse) throws IOException {
            EventInfoInstances.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullCalendarInstancesResponse.calendar_instances);
            this.f41894a.encodeWithTag(protoWriter, 2, pullCalendarInstancesResponse.calendar_id_to_resource);
            if (pullCalendarInstancesResponse.next_begin_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullCalendarInstancesResponse.next_begin_time);
            }
            if (pullCalendarInstancesResponse.next_min_timespan != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, pullCalendarInstancesResponse.next_min_timespan);
            }
            if (pullCalendarInstancesResponse.next_event_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pullCalendarInstancesResponse.next_event_id);
            }
            protoWriter.writeBytes(pullCalendarInstancesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15924a newBuilder() {
        C15924a aVar = new C15924a();
        aVar.f41889a = Internal.copyOf("calendar_instances", this.calendar_instances);
        aVar.f41890b = Internal.copyOf("calendar_id_to_resource", this.calendar_id_to_resource);
        aVar.f41891c = this.next_begin_time;
        aVar.f41892d = this.next_min_timespan;
        aVar.f41893e = this.next_event_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullCalendarInstancesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_instances.isEmpty()) {
            sb.append(", calendar_instances=");
            sb.append(this.calendar_instances);
        }
        if (!this.calendar_id_to_resource.isEmpty()) {
            sb.append(", calendar_id_to_resource=");
            sb.append(this.calendar_id_to_resource);
        }
        if (this.next_begin_time != null) {
            sb.append(", next_begin_time=");
            sb.append(this.next_begin_time);
        }
        if (this.next_min_timespan != null) {
            sb.append(", next_min_timespan=");
            sb.append(this.next_min_timespan);
        }
        if (this.next_event_id != null) {
            sb.append(", next_event_id=");
            sb.append(this.next_event_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PullCalendarInstancesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullCalendarInstancesResponse(List<EventInfoInstances> list, Map<String, CalendarResource> map, Long l, Integer num, String str) {
        this(list, map, l, num, str, ByteString.EMPTY);
    }

    public PullCalendarInstancesResponse(List<EventInfoInstances> list, Map<String, CalendarResource> map, Long l, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_instances = Internal.immutableCopyOf("calendar_instances", list);
        this.calendar_id_to_resource = Internal.immutableCopyOf("calendar_id_to_resource", map);
        this.next_begin_time = l;
        this.next_min_timespan = num;
        this.next_event_id = str;
    }
}
