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

public final class PullEventIndividualAttendeesResponse extends Message<PullEventIndividualAttendeesResponse, C15936a> {
    public static final ProtoAdapter<PullEventIndividualAttendeesResponse> ADAPTER = new C15937b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<CalendarEventAttendee> attendees;
    public final Boolean has_more;
    public final String next_page_token;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventIndividualAttendeesResponse$b */
    private static final class C15937b extends ProtoAdapter<PullEventIndividualAttendeesResponse> {
        C15937b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullEventIndividualAttendeesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullEventIndividualAttendeesResponse pullEventIndividualAttendeesResponse) {
            int i;
            int encodedSizeWithTag = CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(1, pullEventIndividualAttendeesResponse.attendees);
            int i2 = 0;
            if (pullEventIndividualAttendeesResponse.next_page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, pullEventIndividualAttendeesResponse.next_page_token);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullEventIndividualAttendeesResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, pullEventIndividualAttendeesResponse.has_more);
            }
            return i3 + i2 + pullEventIndividualAttendeesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullEventIndividualAttendeesResponse decode(ProtoReader protoReader) throws IOException {
            C15936a aVar = new C15936a();
            aVar.f41918b = "";
            aVar.f41919c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41917a.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41918b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41919c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullEventIndividualAttendeesResponse pullEventIndividualAttendeesResponse) throws IOException {
            CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullEventIndividualAttendeesResponse.attendees);
            if (pullEventIndividualAttendeesResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullEventIndividualAttendeesResponse.next_page_token);
            }
            if (pullEventIndividualAttendeesResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pullEventIndividualAttendeesResponse.has_more);
            }
            protoWriter.writeBytes(pullEventIndividualAttendeesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventIndividualAttendeesResponse$a */
    public static final class C15936a extends Message.Builder<PullEventIndividualAttendeesResponse, C15936a> {

        /* renamed from: a */
        public List<CalendarEventAttendee> f41917a = Internal.newMutableList();

        /* renamed from: b */
        public String f41918b;

        /* renamed from: c */
        public Boolean f41919c;

        /* renamed from: a */
        public PullEventIndividualAttendeesResponse build() {
            return new PullEventIndividualAttendeesResponse(this.f41917a, this.f41918b, this.f41919c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15936a newBuilder() {
        C15936a aVar = new C15936a();
        aVar.f41917a = Internal.copyOf("attendees", this.attendees);
        aVar.f41918b = this.next_page_token;
        aVar.f41919c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullEventIndividualAttendeesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.attendees.isEmpty()) {
            sb.append(", attendees=");
            sb.append(this.attendees);
        }
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "PullEventIndividualAttendeesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullEventIndividualAttendeesResponse(List<CalendarEventAttendee> list, String str, Boolean bool) {
        this(list, str, bool, ByteString.EMPTY);
    }

    public PullEventIndividualAttendeesResponse(List<CalendarEventAttendee> list, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.attendees = Internal.immutableCopyOf("attendees", list);
        this.next_page_token = str;
        this.has_more = bool;
    }
}
