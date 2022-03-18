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

public final class MGetCalendarsWithIDsResponse extends Message<MGetCalendarsWithIDsResponse, C15838a> {
    public static final ProtoAdapter<MGetCalendarsWithIDsResponse> ADAPTER = new C15839b();
    private static final long serialVersionUID = 0;
    public final List<CalendarWithMembers> calendar_with_members;
    public final Map<String, Calendar> calendars;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetCalendarsWithIDsResponse$a */
    public static final class C15838a extends Message.Builder<MGetCalendarsWithIDsResponse, C15838a> {

        /* renamed from: a */
        public Map<String, Calendar> f41647a = Internal.newMutableMap();

        /* renamed from: b */
        public List<CalendarWithMembers> f41648b = Internal.newMutableList();

        /* renamed from: a */
        public MGetCalendarsWithIDsResponse build() {
            return new MGetCalendarsWithIDsResponse(this.f41647a, this.f41648b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetCalendarsWithIDsResponse$b */
    private static final class C15839b extends ProtoAdapter<MGetCalendarsWithIDsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Calendar>> f41649a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Calendar.ADAPTER);

        C15839b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetCalendarsWithIDsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetCalendarsWithIDsResponse mGetCalendarsWithIDsResponse) {
            return this.f41649a.encodedSizeWithTag(1, mGetCalendarsWithIDsResponse.calendars) + CalendarWithMembers.ADAPTER.asRepeated().encodedSizeWithTag(2, mGetCalendarsWithIDsResponse.calendar_with_members) + mGetCalendarsWithIDsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetCalendarsWithIDsResponse decode(ProtoReader protoReader) throws IOException {
            C15838a aVar = new C15838a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41647a.putAll(this.f41649a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41648b.add(CalendarWithMembers.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetCalendarsWithIDsResponse mGetCalendarsWithIDsResponse) throws IOException {
            this.f41649a.encodeWithTag(protoWriter, 1, mGetCalendarsWithIDsResponse.calendars);
            CalendarWithMembers.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mGetCalendarsWithIDsResponse.calendar_with_members);
            protoWriter.writeBytes(mGetCalendarsWithIDsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15838a newBuilder() {
        C15838a aVar = new C15838a();
        aVar.f41647a = Internal.copyOf("calendars", this.calendars);
        aVar.f41648b = Internal.copyOf("calendar_with_members", this.calendar_with_members);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetCalendarsWithIDsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendars.isEmpty()) {
            sb.append(", calendars=");
            sb.append(this.calendars);
        }
        if (!this.calendar_with_members.isEmpty()) {
            sb.append(", calendar_with_members=");
            sb.append(this.calendar_with_members);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetCalendarsWithIDsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetCalendarsWithIDsResponse(Map<String, Calendar> map, List<CalendarWithMembers> list) {
        this(map, list, ByteString.EMPTY);
    }

    public MGetCalendarsWithIDsResponse(Map<String, Calendar> map, List<CalendarWithMembers> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendars = Internal.immutableCopyOf("calendars", map);
        this.calendar_with_members = Internal.immutableCopyOf("calendar_with_members", list);
    }
}
