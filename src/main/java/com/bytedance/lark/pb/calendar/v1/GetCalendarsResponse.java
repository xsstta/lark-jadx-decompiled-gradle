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

public final class GetCalendarsResponse extends Message<GetCalendarsResponse, C15674a> {
    public static final ProtoAdapter<GetCalendarsResponse> ADAPTER = new C15675b();
    private static final long serialVersionUID = 0;
    public final List<Calendar> calendars;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarsResponse$b */
    private static final class C15675b extends ProtoAdapter<GetCalendarsResponse> {
        C15675b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarsResponse getCalendarsResponse) {
            return Calendar.ADAPTER.asRepeated().encodedSizeWithTag(1, getCalendarsResponse.calendars) + getCalendarsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarsResponse decode(ProtoReader protoReader) throws IOException {
            C15674a aVar = new C15674a();
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
                    aVar.f41437a.add(Calendar.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarsResponse getCalendarsResponse) throws IOException {
            Calendar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCalendarsResponse.calendars);
            protoWriter.writeBytes(getCalendarsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarsResponse$a */
    public static final class C15674a extends Message.Builder<GetCalendarsResponse, C15674a> {

        /* renamed from: a */
        public List<Calendar> f41437a = Internal.newMutableList();

        /* renamed from: a */
        public GetCalendarsResponse build() {
            return new GetCalendarsResponse(this.f41437a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15674a newBuilder() {
        C15674a aVar = new C15674a();
        aVar.f41437a = Internal.copyOf("calendars", this.calendars);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendars.isEmpty()) {
            sb.append(", calendars=");
            sb.append(this.calendars);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarsResponse(List<Calendar> list) {
        this(list, ByteString.EMPTY);
    }

    public GetCalendarsResponse(List<Calendar> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendars = Internal.immutableCopyOf("calendars", list);
    }
}
