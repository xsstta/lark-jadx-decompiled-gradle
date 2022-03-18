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

public final class CalendarMemberCommits extends Message<CalendarMemberCommits, C15554a> {
    public static final ProtoAdapter<CalendarMemberCommits> ADAPTER = new C15555b();
    private static final long serialVersionUID = 0;
    public final List<CalendarMemberCommit> add_members;
    public final String comment;
    public final List<String> remove_group_ids;
    public final List<String> remove_user_ids;
    public final List<CalendarMemberCommit> update_members;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommits$b */
    private static final class C15555b extends ProtoAdapter<CalendarMemberCommits> {
        C15555b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarMemberCommits.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarMemberCommits calendarMemberCommits) {
            int i;
            int encodedSizeWithTag = CalendarMemberCommit.ADAPTER.asRepeated().encodedSizeWithTag(1, calendarMemberCommits.add_members) + CalendarMemberCommit.ADAPTER.asRepeated().encodedSizeWithTag(2, calendarMemberCommits.update_members) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, calendarMemberCommits.remove_user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, calendarMemberCommits.remove_group_ids);
            if (calendarMemberCommits.comment != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, calendarMemberCommits.comment);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + calendarMemberCommits.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarMemberCommits decode(ProtoReader protoReader) throws IOException {
            C15554a aVar = new C15554a();
            aVar.f41238e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41234a.add(CalendarMemberCommit.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41235b.add(CalendarMemberCommit.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f41236c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f41237d.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41238e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarMemberCommits calendarMemberCommits) throws IOException {
            CalendarMemberCommit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, calendarMemberCommits.add_members);
            CalendarMemberCommit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, calendarMemberCommits.update_members);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, calendarMemberCommits.remove_user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, calendarMemberCommits.remove_group_ids);
            if (calendarMemberCommits.comment != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, calendarMemberCommits.comment);
            }
            protoWriter.writeBytes(calendarMemberCommits.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommits$a */
    public static final class C15554a extends Message.Builder<CalendarMemberCommits, C15554a> {

        /* renamed from: a */
        public List<CalendarMemberCommit> f41234a = Internal.newMutableList();

        /* renamed from: b */
        public List<CalendarMemberCommit> f41235b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f41236c = Internal.newMutableList();

        /* renamed from: d */
        public List<String> f41237d = Internal.newMutableList();

        /* renamed from: e */
        public String f41238e;

        /* renamed from: a */
        public CalendarMemberCommits build() {
            return new CalendarMemberCommits(this.f41234a, this.f41235b, this.f41236c, this.f41237d, this.f41238e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15554a mo56422a(String str) {
            this.f41238e = str;
            return this;
        }

        /* renamed from: a */
        public C15554a mo56423a(List<CalendarMemberCommit> list) {
            Internal.checkElementsNotNull(list);
            this.f41234a = list;
            return this;
        }

        /* renamed from: b */
        public C15554a mo56425b(List<CalendarMemberCommit> list) {
            Internal.checkElementsNotNull(list);
            this.f41235b = list;
            return this;
        }

        /* renamed from: c */
        public C15554a mo56426c(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41236c = list;
            return this;
        }

        /* renamed from: d */
        public C15554a mo56427d(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41237d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15554a newBuilder() {
        C15554a aVar = new C15554a();
        aVar.f41234a = Internal.copyOf("add_members", this.add_members);
        aVar.f41235b = Internal.copyOf("update_members", this.update_members);
        aVar.f41236c = Internal.copyOf("remove_user_ids", this.remove_user_ids);
        aVar.f41237d = Internal.copyOf("remove_group_ids", this.remove_group_ids);
        aVar.f41238e = this.comment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarMemberCommits");
        StringBuilder sb = new StringBuilder();
        if (!this.add_members.isEmpty()) {
            sb.append(", add_members=");
            sb.append(this.add_members);
        }
        if (!this.update_members.isEmpty()) {
            sb.append(", update_members=");
            sb.append(this.update_members);
        }
        if (!this.remove_user_ids.isEmpty()) {
            sb.append(", remove_user_ids=");
            sb.append(this.remove_user_ids);
        }
        if (!this.remove_group_ids.isEmpty()) {
            sb.append(", remove_group_ids=");
            sb.append(this.remove_group_ids);
        }
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarMemberCommits{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarMemberCommits(List<CalendarMemberCommit> list, List<CalendarMemberCommit> list2, List<String> list3, List<String> list4, String str) {
        this(list, list2, list3, list4, str, ByteString.EMPTY);
    }

    public CalendarMemberCommits(List<CalendarMemberCommit> list, List<CalendarMemberCommit> list2, List<String> list3, List<String> list4, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.add_members = Internal.immutableCopyOf("add_members", list);
        this.update_members = Internal.immutableCopyOf("update_members", list2);
        this.remove_user_ids = Internal.immutableCopyOf("remove_user_ids", list3);
        this.remove_group_ids = Internal.immutableCopyOf("remove_group_ids", list4);
        this.comment = str;
    }
}
