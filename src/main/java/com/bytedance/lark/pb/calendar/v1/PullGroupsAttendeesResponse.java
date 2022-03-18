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

public final class PullGroupsAttendeesResponse extends Message<PullGroupsAttendeesResponse, C15940a> {
    public static final ProtoAdapter<PullGroupsAttendeesResponse> ADAPTER = new C15941b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> free_busy_accessible_user_map;
    public final Map<String, CalendarEventAttendee> groups;
    public final List<String> meeting_chat_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullGroupsAttendeesResponse$a */
    public static final class C15940a extends Message.Builder<PullGroupsAttendeesResponse, C15940a> {

        /* renamed from: a */
        public Map<String, CalendarEventAttendee> f41921a = Internal.newMutableMap();

        /* renamed from: b */
        public List<String> f41922b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, Boolean> f41923c = Internal.newMutableMap();

        /* renamed from: a */
        public PullGroupsAttendeesResponse build() {
            return new PullGroupsAttendeesResponse(this.f41921a, this.f41922b, this.f41923c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullGroupsAttendeesResponse$b */
    private static final class C15941b extends ProtoAdapter<PullGroupsAttendeesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarEventAttendee>> f41924a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarEventAttendee.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Boolean>> f41925b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C15941b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullGroupsAttendeesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullGroupsAttendeesResponse pullGroupsAttendeesResponse) {
            return this.f41924a.encodedSizeWithTag(1, pullGroupsAttendeesResponse.groups) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pullGroupsAttendeesResponse.meeting_chat_ids) + this.f41925b.encodedSizeWithTag(3, pullGroupsAttendeesResponse.free_busy_accessible_user_map) + pullGroupsAttendeesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullGroupsAttendeesResponse decode(ProtoReader protoReader) throws IOException {
            C15940a aVar = new C15940a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41921a.putAll(this.f41924a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41922b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41923c.putAll(this.f41925b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullGroupsAttendeesResponse pullGroupsAttendeesResponse) throws IOException {
            this.f41924a.encodeWithTag(protoWriter, 1, pullGroupsAttendeesResponse.groups);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pullGroupsAttendeesResponse.meeting_chat_ids);
            this.f41925b.encodeWithTag(protoWriter, 3, pullGroupsAttendeesResponse.free_busy_accessible_user_map);
            protoWriter.writeBytes(pullGroupsAttendeesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15940a newBuilder() {
        C15940a aVar = new C15940a();
        aVar.f41921a = Internal.copyOf("groups", this.groups);
        aVar.f41922b = Internal.copyOf("meeting_chat_ids", this.meeting_chat_ids);
        aVar.f41923c = Internal.copyOf("free_busy_accessible_user_map", this.free_busy_accessible_user_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullGroupsAttendeesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.groups.isEmpty()) {
            sb.append(", groups=");
            sb.append(this.groups);
        }
        if (!this.meeting_chat_ids.isEmpty()) {
            sb.append(", meeting_chat_ids=");
            sb.append(this.meeting_chat_ids);
        }
        if (!this.free_busy_accessible_user_map.isEmpty()) {
            sb.append(", free_busy_accessible_user_map=");
            sb.append(this.free_busy_accessible_user_map);
        }
        StringBuilder replace = sb.replace(0, 2, "PullGroupsAttendeesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullGroupsAttendeesResponse(Map<String, CalendarEventAttendee> map, List<String> list, Map<String, Boolean> map2) {
        this(map, list, map2, ByteString.EMPTY);
    }

    public PullGroupsAttendeesResponse(Map<String, CalendarEventAttendee> map, List<String> list, Map<String, Boolean> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.groups = Internal.immutableCopyOf("groups", map);
        this.meeting_chat_ids = Internal.immutableCopyOf("meeting_chat_ids", list);
        this.free_busy_accessible_user_map = Internal.immutableCopyOf("free_busy_accessible_user_map", map2);
    }
}
