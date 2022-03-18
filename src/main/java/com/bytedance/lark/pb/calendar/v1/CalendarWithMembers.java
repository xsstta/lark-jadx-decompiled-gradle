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

public final class CalendarWithMembers extends Message<CalendarWithMembers, C15570a> {
    public static final ProtoAdapter<CalendarWithMembers> ADAPTER = new C15571b();
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final List<CalendarMember> calendar_members;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarWithMembers$b */
    private static final class C15571b extends ProtoAdapter<CalendarWithMembers> {
        C15571b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarWithMembers.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarWithMembers calendarWithMembers) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, calendarWithMembers.calendar_id) + CalendarMember.ADAPTER.asRepeated().encodedSizeWithTag(2, calendarWithMembers.calendar_members) + calendarWithMembers.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarWithMembers decode(ProtoReader protoReader) throws IOException {
            C15570a aVar = new C15570a();
            aVar.f41302a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41302a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41303b.add(CalendarMember.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarWithMembers calendarWithMembers) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarWithMembers.calendar_id);
            CalendarMember.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, calendarWithMembers.calendar_members);
            protoWriter.writeBytes(calendarWithMembers.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarWithMembers$a */
    public static final class C15570a extends Message.Builder<CalendarWithMembers, C15570a> {

        /* renamed from: a */
        public String f41302a;

        /* renamed from: b */
        public List<CalendarMember> f41303b = Internal.newMutableList();

        /* renamed from: a */
        public CalendarWithMembers build() {
            String str = this.f41302a;
            if (str != null) {
                return new CalendarWithMembers(str, this.f41303b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "calendar_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15570a newBuilder() {
        C15570a aVar = new C15570a();
        aVar.f41302a = this.calendar_id;
        aVar.f41303b = Internal.copyOf("calendar_members", this.calendar_members);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarWithMembers");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        if (!this.calendar_members.isEmpty()) {
            sb.append(", calendar_members=");
            sb.append(this.calendar_members);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarWithMembers{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarWithMembers(String str, List<CalendarMember> list) {
        this(str, list, ByteString.EMPTY);
    }

    public CalendarWithMembers(String str, List<CalendarMember> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.calendar_members = Internal.immutableCopyOf("calendar_members", list);
    }
}
