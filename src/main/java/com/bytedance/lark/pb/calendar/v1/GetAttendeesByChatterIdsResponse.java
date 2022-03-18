package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetAttendeesByChatterIdsResponse extends Message<GetAttendeesByChatterIdsResponse, C15642a> {
    public static final ProtoAdapter<GetAttendeesByChatterIdsResponse> ADAPTER = new C15643b();
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarEventAttendee> chatter_id_attendees;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAttendeesByChatterIdsResponse$a */
    public static final class C15642a extends Message.Builder<GetAttendeesByChatterIdsResponse, C15642a> {

        /* renamed from: a */
        public Map<String, CalendarEventAttendee> f41404a = Internal.newMutableMap();

        /* renamed from: a */
        public GetAttendeesByChatterIdsResponse build() {
            return new GetAttendeesByChatterIdsResponse(this.f41404a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAttendeesByChatterIdsResponse$b */
    private static final class C15643b extends ProtoAdapter<GetAttendeesByChatterIdsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarEventAttendee>> f41405a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarEventAttendee.ADAPTER);

        C15643b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAttendeesByChatterIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAttendeesByChatterIdsResponse getAttendeesByChatterIdsResponse) {
            return this.f41405a.encodedSizeWithTag(1, getAttendeesByChatterIdsResponse.chatter_id_attendees) + getAttendeesByChatterIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAttendeesByChatterIdsResponse decode(ProtoReader protoReader) throws IOException {
            C15642a aVar = new C15642a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41404a.putAll(this.f41405a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAttendeesByChatterIdsResponse getAttendeesByChatterIdsResponse) throws IOException {
            this.f41405a.encodeWithTag(protoWriter, 1, getAttendeesByChatterIdsResponse.chatter_id_attendees);
            protoWriter.writeBytes(getAttendeesByChatterIdsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15642a newBuilder() {
        C15642a aVar = new C15642a();
        aVar.f41404a = Internal.copyOf("chatter_id_attendees", this.chatter_id_attendees);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAttendeesByChatterIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_id_attendees.isEmpty()) {
            sb.append(", chatter_id_attendees=");
            sb.append(this.chatter_id_attendees);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAttendeesByChatterIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAttendeesByChatterIdsResponse(Map<String, CalendarEventAttendee> map) {
        this(map, ByteString.EMPTY);
    }

    public GetAttendeesByChatterIdsResponse(Map<String, CalendarEventAttendee> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_id_attendees = Internal.immutableCopyOf("chatter_id_attendees", map);
    }
}
