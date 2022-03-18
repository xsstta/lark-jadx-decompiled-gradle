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

public final class PullAttendeesInDepartmentsResponse extends Message<PullAttendeesInDepartmentsResponse, C15920a> {
    public static final ProtoAdapter<PullAttendeesInDepartmentsResponse> ADAPTER = new C15921b();
    private static final long serialVersionUID = 0;
    public final List<DepartmentAttendees> department_attendees;
    public final Map<String, Boolean> free_busy_accessible_user_map;
    public final List<String> limit_exceeded_department_ids;

    public static final class DepartmentAttendees extends Message<DepartmentAttendees, C15918a> {
        public static final ProtoAdapter<DepartmentAttendees> ADAPTER = new C15919b();
        private static final long serialVersionUID = 0;
        public final List<CalendarEventAttendee> attendees;
        public final String department_id;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsResponse$DepartmentAttendees$b */
        private static final class C15919b extends ProtoAdapter<DepartmentAttendees> {
            C15919b() {
                super(FieldEncoding.LENGTH_DELIMITED, DepartmentAttendees.class);
            }

            /* renamed from: a */
            public int encodedSize(DepartmentAttendees departmentAttendees) {
                int i;
                if (departmentAttendees.department_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, departmentAttendees.department_id);
                } else {
                    i = 0;
                }
                return i + CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(2, departmentAttendees.attendees) + departmentAttendees.unknownFields().size();
            }

            /* renamed from: a */
            public DepartmentAttendees decode(ProtoReader protoReader) throws IOException {
                C15918a aVar = new C15918a();
                aVar.f41877a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f41877a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41878b.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DepartmentAttendees departmentAttendees) throws IOException {
                if (departmentAttendees.department_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, departmentAttendees.department_id);
                }
                CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, departmentAttendees.attendees);
                protoWriter.writeBytes(departmentAttendees.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsResponse$DepartmentAttendees$a */
        public static final class C15918a extends Message.Builder<DepartmentAttendees, C15918a> {

            /* renamed from: a */
            public String f41877a;

            /* renamed from: b */
            public List<CalendarEventAttendee> f41878b = Internal.newMutableList();

            /* renamed from: a */
            public DepartmentAttendees build() {
                return new DepartmentAttendees(this.f41877a, this.f41878b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15918a newBuilder() {
            C15918a aVar = new C15918a();
            aVar.f41877a = this.department_id;
            aVar.f41878b = Internal.copyOf("attendees", this.attendees);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "DepartmentAttendees");
            StringBuilder sb = new StringBuilder();
            if (this.department_id != null) {
                sb.append(", department_id=");
                sb.append(this.department_id);
            }
            if (!this.attendees.isEmpty()) {
                sb.append(", attendees=");
                sb.append(this.attendees);
            }
            StringBuilder replace = sb.replace(0, 2, "DepartmentAttendees{");
            replace.append('}');
            return replace.toString();
        }

        public DepartmentAttendees(String str, List<CalendarEventAttendee> list) {
            this(str, list, ByteString.EMPTY);
        }

        public DepartmentAttendees(String str, List<CalendarEventAttendee> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.department_id = str;
            this.attendees = Internal.immutableCopyOf("attendees", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsResponse$a */
    public static final class C15920a extends Message.Builder<PullAttendeesInDepartmentsResponse, C15920a> {

        /* renamed from: a */
        public List<DepartmentAttendees> f41879a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f41880b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, Boolean> f41881c = Internal.newMutableMap();

        /* renamed from: a */
        public PullAttendeesInDepartmentsResponse build() {
            return new PullAttendeesInDepartmentsResponse(this.f41879a, this.f41880b, this.f41881c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsResponse$b */
    private static final class C15921b extends ProtoAdapter<PullAttendeesInDepartmentsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f41882a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C15921b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAttendeesInDepartmentsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAttendeesInDepartmentsResponse pullAttendeesInDepartmentsResponse) {
            return DepartmentAttendees.ADAPTER.asRepeated().encodedSizeWithTag(1, pullAttendeesInDepartmentsResponse.department_attendees) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pullAttendeesInDepartmentsResponse.limit_exceeded_department_ids) + this.f41882a.encodedSizeWithTag(3, pullAttendeesInDepartmentsResponse.free_busy_accessible_user_map) + pullAttendeesInDepartmentsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullAttendeesInDepartmentsResponse decode(ProtoReader protoReader) throws IOException {
            C15920a aVar = new C15920a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41879a.add(DepartmentAttendees.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41880b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41881c.putAll(this.f41882a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAttendeesInDepartmentsResponse pullAttendeesInDepartmentsResponse) throws IOException {
            DepartmentAttendees.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullAttendeesInDepartmentsResponse.department_attendees);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pullAttendeesInDepartmentsResponse.limit_exceeded_department_ids);
            this.f41882a.encodeWithTag(protoWriter, 3, pullAttendeesInDepartmentsResponse.free_busy_accessible_user_map);
            protoWriter.writeBytes(pullAttendeesInDepartmentsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15920a newBuilder() {
        C15920a aVar = new C15920a();
        aVar.f41879a = Internal.copyOf("department_attendees", this.department_attendees);
        aVar.f41880b = Internal.copyOf("limit_exceeded_department_ids", this.limit_exceeded_department_ids);
        aVar.f41881c = Internal.copyOf("free_busy_accessible_user_map", this.free_busy_accessible_user_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullAttendeesInDepartmentsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.department_attendees.isEmpty()) {
            sb.append(", department_attendees=");
            sb.append(this.department_attendees);
        }
        if (!this.limit_exceeded_department_ids.isEmpty()) {
            sb.append(", limit_exceeded_department_ids=");
            sb.append(this.limit_exceeded_department_ids);
        }
        if (!this.free_busy_accessible_user_map.isEmpty()) {
            sb.append(", free_busy_accessible_user_map=");
            sb.append(this.free_busy_accessible_user_map);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAttendeesInDepartmentsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullAttendeesInDepartmentsResponse(List<DepartmentAttendees> list, List<String> list2, Map<String, Boolean> map) {
        this(list, list2, map, ByteString.EMPTY);
    }

    public PullAttendeesInDepartmentsResponse(List<DepartmentAttendees> list, List<String> list2, Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_attendees = Internal.immutableCopyOf("department_attendees", list);
        this.limit_exceeded_department_ids = Internal.immutableCopyOf("limit_exceeded_department_ids", list2);
        this.free_busy_accessible_user_map = Internal.immutableCopyOf("free_busy_accessible_user_map", map);
    }
}
