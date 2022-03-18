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

public final class PullEventGroupAttendeeMembersResponse extends Message<PullEventGroupAttendeeMembersResponse, C15928a> {
    public static final ProtoAdapter<PullEventGroupAttendeeMembersResponse> ADAPTER = new C15929b();
    public static final Boolean DEFAULT_HAS_MORE_PAGE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more_page;
    public final List<CalendarEventAttendee> members;
    public final String page_offset;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupAttendeeMembersResponse$b */
    private static final class C15929b extends ProtoAdapter<PullEventGroupAttendeeMembersResponse> {
        C15929b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullEventGroupAttendeeMembersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullEventGroupAttendeeMembersResponse pullEventGroupAttendeeMembersResponse) {
            int i;
            int encodedSizeWithTag = CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(1, pullEventGroupAttendeeMembersResponse.members);
            int i2 = 0;
            if (pullEventGroupAttendeeMembersResponse.has_more_page != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, pullEventGroupAttendeeMembersResponse.has_more_page);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullEventGroupAttendeeMembersResponse.page_offset != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullEventGroupAttendeeMembersResponse.page_offset);
            }
            return i3 + i2 + pullEventGroupAttendeeMembersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullEventGroupAttendeeMembersResponse decode(ProtoReader protoReader) throws IOException {
            C15928a aVar = new C15928a();
            aVar.f41903b = false;
            aVar.f41904c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41902a.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41903b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41904c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullEventGroupAttendeeMembersResponse pullEventGroupAttendeeMembersResponse) throws IOException {
            CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullEventGroupAttendeeMembersResponse.members);
            if (pullEventGroupAttendeeMembersResponse.has_more_page != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullEventGroupAttendeeMembersResponse.has_more_page);
            }
            if (pullEventGroupAttendeeMembersResponse.page_offset != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullEventGroupAttendeeMembersResponse.page_offset);
            }
            protoWriter.writeBytes(pullEventGroupAttendeeMembersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupAttendeeMembersResponse$a */
    public static final class C15928a extends Message.Builder<PullEventGroupAttendeeMembersResponse, C15928a> {

        /* renamed from: a */
        public List<CalendarEventAttendee> f41902a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f41903b;

        /* renamed from: c */
        public String f41904c;

        /* renamed from: a */
        public PullEventGroupAttendeeMembersResponse build() {
            return new PullEventGroupAttendeeMembersResponse(this.f41902a, this.f41903b, this.f41904c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15928a newBuilder() {
        C15928a aVar = new C15928a();
        aVar.f41902a = Internal.copyOf("members", this.members);
        aVar.f41903b = this.has_more_page;
        aVar.f41904c = this.page_offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullEventGroupAttendeeMembersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.members.isEmpty()) {
            sb.append(", members=");
            sb.append(this.members);
        }
        if (this.has_more_page != null) {
            sb.append(", has_more_page=");
            sb.append(this.has_more_page);
        }
        if (this.page_offset != null) {
            sb.append(", page_offset=");
            sb.append(this.page_offset);
        }
        StringBuilder replace = sb.replace(0, 2, "PullEventGroupAttendeeMembersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullEventGroupAttendeeMembersResponse(List<CalendarEventAttendee> list, Boolean bool, String str) {
        this(list, bool, str, ByteString.EMPTY);
    }

    public PullEventGroupAttendeeMembersResponse(List<CalendarEventAttendee> list, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.members = Internal.immutableCopyOf("members", list);
        this.has_more_page = bool;
        this.page_offset = str;
    }
}
