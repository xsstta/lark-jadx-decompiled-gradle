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

public final class GetCalendarMembersByIdsResponse extends Message<GetCalendarMembersByIdsResponse, C15666a> {
    public static final ProtoAdapter<GetCalendarMembersByIdsResponse> ADAPTER = new C15667b();
    private static final long serialVersionUID = 0;
    public final List<CalendarMember> members;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarMembersByIdsResponse$b */
    private static final class C15667b extends ProtoAdapter<GetCalendarMembersByIdsResponse> {
        C15667b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarMembersByIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarMembersByIdsResponse getCalendarMembersByIdsResponse) {
            return CalendarMember.ADAPTER.asRepeated().encodedSizeWithTag(1, getCalendarMembersByIdsResponse.members) + getCalendarMembersByIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarMembersByIdsResponse decode(ProtoReader protoReader) throws IOException {
            C15666a aVar = new C15666a();
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
                    aVar.f41434a.add(CalendarMember.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarMembersByIdsResponse getCalendarMembersByIdsResponse) throws IOException {
            CalendarMember.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCalendarMembersByIdsResponse.members);
            protoWriter.writeBytes(getCalendarMembersByIdsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarMembersByIdsResponse$a */
    public static final class C15666a extends Message.Builder<GetCalendarMembersByIdsResponse, C15666a> {

        /* renamed from: a */
        public List<CalendarMember> f41434a = Internal.newMutableList();

        /* renamed from: a */
        public GetCalendarMembersByIdsResponse build() {
            return new GetCalendarMembersByIdsResponse(this.f41434a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15666a newBuilder() {
        C15666a aVar = new C15666a();
        aVar.f41434a = Internal.copyOf("members", this.members);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarMembersByIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.members.isEmpty()) {
            sb.append(", members=");
            sb.append(this.members);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarMembersByIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarMembersByIdsResponse(List<CalendarMember> list) {
        this(list, ByteString.EMPTY);
    }

    public GetCalendarMembersByIdsResponse(List<CalendarMember> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.members = Internal.immutableCopyOf("members", list);
    }
}
