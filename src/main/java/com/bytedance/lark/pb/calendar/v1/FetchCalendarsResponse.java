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

public final class FetchCalendarsResponse extends Message<FetchCalendarsResponse, C15626a> {
    public static final ProtoAdapter<FetchCalendarsResponse> ADAPTER = new C15627b();
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarTenantInfo> calendar_tenant_info_map;
    public final List<CalendarWithMembers> calendar_with_members;
    public final Map<String, Calendar> calendars;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.FetchCalendarsResponse$a */
    public static final class C15626a extends Message.Builder<FetchCalendarsResponse, C15626a> {

        /* renamed from: a */
        public Map<String, Calendar> f41381a = Internal.newMutableMap();

        /* renamed from: b */
        public List<CalendarWithMembers> f41382b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, CalendarTenantInfo> f41383c = Internal.newMutableMap();

        /* renamed from: a */
        public FetchCalendarsResponse build() {
            return new FetchCalendarsResponse(this.f41381a, this.f41382b, this.f41383c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.FetchCalendarsResponse$b */
    private static final class C15627b extends ProtoAdapter<FetchCalendarsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Calendar>> f41384a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Calendar.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, CalendarTenantInfo>> f41385b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarTenantInfo.ADAPTER);

        C15627b() {
            super(FieldEncoding.LENGTH_DELIMITED, FetchCalendarsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FetchCalendarsResponse fetchCalendarsResponse) {
            return this.f41384a.encodedSizeWithTag(1, fetchCalendarsResponse.calendars) + CalendarWithMembers.ADAPTER.asRepeated().encodedSizeWithTag(2, fetchCalendarsResponse.calendar_with_members) + this.f41385b.encodedSizeWithTag(3, fetchCalendarsResponse.calendar_tenant_info_map) + fetchCalendarsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FetchCalendarsResponse decode(ProtoReader protoReader) throws IOException {
            C15626a aVar = new C15626a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41381a.putAll(this.f41384a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41382b.add(CalendarWithMembers.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41383c.putAll(this.f41385b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FetchCalendarsResponse fetchCalendarsResponse) throws IOException {
            this.f41384a.encodeWithTag(protoWriter, 1, fetchCalendarsResponse.calendars);
            CalendarWithMembers.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, fetchCalendarsResponse.calendar_with_members);
            this.f41385b.encodeWithTag(protoWriter, 3, fetchCalendarsResponse.calendar_tenant_info_map);
            protoWriter.writeBytes(fetchCalendarsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15626a newBuilder() {
        C15626a aVar = new C15626a();
        aVar.f41381a = Internal.copyOf("calendars", this.calendars);
        aVar.f41382b = Internal.copyOf("calendar_with_members", this.calendar_with_members);
        aVar.f41383c = Internal.copyOf("calendar_tenant_info_map", this.calendar_tenant_info_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "FetchCalendarsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendars.isEmpty()) {
            sb.append(", calendars=");
            sb.append(this.calendars);
        }
        if (!this.calendar_with_members.isEmpty()) {
            sb.append(", calendar_with_members=");
            sb.append(this.calendar_with_members);
        }
        if (!this.calendar_tenant_info_map.isEmpty()) {
            sb.append(", calendar_tenant_info_map=");
            sb.append(this.calendar_tenant_info_map);
        }
        StringBuilder replace = sb.replace(0, 2, "FetchCalendarsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FetchCalendarsResponse(Map<String, Calendar> map, List<CalendarWithMembers> list, Map<String, CalendarTenantInfo> map2) {
        this(map, list, map2, ByteString.EMPTY);
    }

    public FetchCalendarsResponse(Map<String, Calendar> map, List<CalendarWithMembers> list, Map<String, CalendarTenantInfo> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendars = Internal.immutableCopyOf("calendars", map);
        this.calendar_with_members = Internal.immutableCopyOf("calendar_with_members", list);
        this.calendar_tenant_info_map = Internal.immutableCopyOf("calendar_tenant_info_map", map2);
    }
}
