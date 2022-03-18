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

public final class GetResourceWithTokenResponse extends Message<GetResourceWithTokenResponse, C15778a> {
    public static final ProtoAdapter<GetResourceWithTokenResponse> ADAPTER = new C15779b();
    public static final Long DEFAULT_CURRENT_TIMESTAMP = 0L;
    public static final Boolean DEFAULT_NEED_POPOVER = false;
    public static final Long DEFAULT_SEIZE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final CalendarBuilding building;
    public final Long current_timestamp;
    public final List<CalendarEventInstance> event_instances;
    public final Boolean need_popover;
    public final CalendarResource resource;
    public final Long seize_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceWithTokenResponse$b */
    private static final class C15779b extends ProtoAdapter<GetResourceWithTokenResponse> {
        C15779b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceWithTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceWithTokenResponse getResourceWithTokenResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getResourceWithTokenResponse.resource != null) {
                i = CalendarResource.ADAPTER.encodedSizeWithTag(1, getResourceWithTokenResponse.resource);
            } else {
                i = 0;
            }
            if (getResourceWithTokenResponse.building != null) {
                i2 = CalendarBuilding.ADAPTER.encodedSizeWithTag(2, getResourceWithTokenResponse.building);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + CalendarEventInstance.ADAPTER.asRepeated().encodedSizeWithTag(3, getResourceWithTokenResponse.event_instances);
            if (getResourceWithTokenResponse.seize_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, getResourceWithTokenResponse.seize_time);
            } else {
                i3 = 0;
            }
            int i6 = encodedSizeWithTag + i3;
            if (getResourceWithTokenResponse.current_timestamp != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(5, getResourceWithTokenResponse.current_timestamp);
            } else {
                i4 = 0;
            }
            int i7 = i6 + i4;
            if (getResourceWithTokenResponse.need_popover != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, getResourceWithTokenResponse.need_popover);
            }
            return i7 + i5 + getResourceWithTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceWithTokenResponse decode(ProtoReader protoReader) throws IOException {
            C15778a aVar = new C15778a();
            aVar.f41550d = 0L;
            aVar.f41551e = 0L;
            aVar.f41552f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41547a = CalendarResource.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41548b = CalendarBuilding.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41549c.add(CalendarEventInstance.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f41550d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41551e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41552f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetResourceWithTokenResponse getResourceWithTokenResponse) throws IOException {
            if (getResourceWithTokenResponse.resource != null) {
                CalendarResource.ADAPTER.encodeWithTag(protoWriter, 1, getResourceWithTokenResponse.resource);
            }
            if (getResourceWithTokenResponse.building != null) {
                CalendarBuilding.ADAPTER.encodeWithTag(protoWriter, 2, getResourceWithTokenResponse.building);
            }
            CalendarEventInstance.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getResourceWithTokenResponse.event_instances);
            if (getResourceWithTokenResponse.seize_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getResourceWithTokenResponse.seize_time);
            }
            if (getResourceWithTokenResponse.current_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, getResourceWithTokenResponse.current_timestamp);
            }
            if (getResourceWithTokenResponse.need_popover != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, getResourceWithTokenResponse.need_popover);
            }
            protoWriter.writeBytes(getResourceWithTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceWithTokenResponse$a */
    public static final class C15778a extends Message.Builder<GetResourceWithTokenResponse, C15778a> {

        /* renamed from: a */
        public CalendarResource f41547a;

        /* renamed from: b */
        public CalendarBuilding f41548b;

        /* renamed from: c */
        public List<CalendarEventInstance> f41549c = Internal.newMutableList();

        /* renamed from: d */
        public Long f41550d;

        /* renamed from: e */
        public Long f41551e;

        /* renamed from: f */
        public Boolean f41552f;

        /* renamed from: a */
        public GetResourceWithTokenResponse build() {
            return new GetResourceWithTokenResponse(this.f41547a, this.f41548b, this.f41549c, this.f41550d, this.f41551e, this.f41552f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15778a newBuilder() {
        C15778a aVar = new C15778a();
        aVar.f41547a = this.resource;
        aVar.f41548b = this.building;
        aVar.f41549c = Internal.copyOf("event_instances", this.event_instances);
        aVar.f41550d = this.seize_time;
        aVar.f41551e = this.current_timestamp;
        aVar.f41552f = this.need_popover;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetResourceWithTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        if (this.building != null) {
            sb.append(", building=");
            sb.append(this.building);
        }
        if (!this.event_instances.isEmpty()) {
            sb.append(", event_instances=");
            sb.append(this.event_instances);
        }
        if (this.seize_time != null) {
            sb.append(", seize_time=");
            sb.append(this.seize_time);
        }
        if (this.current_timestamp != null) {
            sb.append(", current_timestamp=");
            sb.append(this.current_timestamp);
        }
        if (this.need_popover != null) {
            sb.append(", need_popover=");
            sb.append(this.need_popover);
        }
        StringBuilder replace = sb.replace(0, 2, "GetResourceWithTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceWithTokenResponse(CalendarResource calendarResource, CalendarBuilding calendarBuilding, List<CalendarEventInstance> list, Long l, Long l2, Boolean bool) {
        this(calendarResource, calendarBuilding, list, l, l2, bool, ByteString.EMPTY);
    }

    public GetResourceWithTokenResponse(CalendarResource calendarResource, CalendarBuilding calendarBuilding, List<CalendarEventInstance> list, Long l, Long l2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource = calendarResource;
        this.building = calendarBuilding;
        this.event_instances = Internal.immutableCopyOf("event_instances", list);
        this.seize_time = l;
        this.current_timestamp = l2;
        this.need_popover = bool;
    }
}
