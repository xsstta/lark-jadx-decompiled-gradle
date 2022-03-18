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

public final class SaveCalendarWithMembersRequest extends Message<SaveCalendarWithMembersRequest, C15988a> {
    public static final ProtoAdapter<SaveCalendarWithMembersRequest> ADAPTER = new C15989b();
    private static final long serialVersionUID = 0;
    public final Calendar calendar;
    public final List<CalendarMember> members;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveCalendarWithMembersRequest$b */
    private static final class C15989b extends ProtoAdapter<SaveCalendarWithMembersRequest> {
        C15989b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveCalendarWithMembersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveCalendarWithMembersRequest saveCalendarWithMembersRequest) {
            return Calendar.ADAPTER.encodedSizeWithTag(1, saveCalendarWithMembersRequest.calendar) + CalendarMember.ADAPTER.asRepeated().encodedSizeWithTag(2, saveCalendarWithMembersRequest.members) + saveCalendarWithMembersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SaveCalendarWithMembersRequest decode(ProtoReader protoReader) throws IOException {
            C15988a aVar = new C15988a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42003a = Calendar.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42004b.add(CalendarMember.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveCalendarWithMembersRequest saveCalendarWithMembersRequest) throws IOException {
            Calendar.ADAPTER.encodeWithTag(protoWriter, 1, saveCalendarWithMembersRequest.calendar);
            CalendarMember.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, saveCalendarWithMembersRequest.members);
            protoWriter.writeBytes(saveCalendarWithMembersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveCalendarWithMembersRequest$a */
    public static final class C15988a extends Message.Builder<SaveCalendarWithMembersRequest, C15988a> {

        /* renamed from: a */
        public Calendar f42003a;

        /* renamed from: b */
        public List<CalendarMember> f42004b = Internal.newMutableList();

        /* renamed from: a */
        public SaveCalendarWithMembersRequest build() {
            Calendar calendar = this.f42003a;
            if (calendar != null) {
                return new SaveCalendarWithMembersRequest(calendar, this.f42004b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(calendar, "calendar");
        }

        /* renamed from: a */
        public C15988a mo57547a(Calendar calendar) {
            this.f42003a = calendar;
            return this;
        }

        /* renamed from: a */
        public C15988a mo57548a(List<CalendarMember> list) {
            Internal.checkElementsNotNull(list);
            this.f42004b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15988a newBuilder() {
        C15988a aVar = new C15988a();
        aVar.f42003a = this.calendar;
        aVar.f42004b = Internal.copyOf("members", this.members);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SaveCalendarWithMembersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar=");
        sb.append(this.calendar);
        if (!this.members.isEmpty()) {
            sb.append(", members=");
            sb.append(this.members);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveCalendarWithMembersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SaveCalendarWithMembersRequest(Calendar calendar2, List<CalendarMember> list) {
        this(calendar2, list, ByteString.EMPTY);
    }

    public SaveCalendarWithMembersRequest(Calendar calendar2, List<CalendarMember> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar = calendar2;
        this.members = Internal.immutableCopyOf("members", list);
    }
}
