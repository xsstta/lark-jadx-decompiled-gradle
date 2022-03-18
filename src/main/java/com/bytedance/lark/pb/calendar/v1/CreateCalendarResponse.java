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

public final class CreateCalendarResponse extends Message<CreateCalendarResponse, C15578a> {
    public static final ProtoAdapter<CreateCalendarResponse> ADAPTER = new C15579b();
    private static final long serialVersionUID = 0;
    public final List<Calendar> calendars;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateCalendarResponse$b */
    private static final class C15579b extends ProtoAdapter<CreateCalendarResponse> {
        C15579b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCalendarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCalendarResponse createCalendarResponse) {
            return Calendar.ADAPTER.asRepeated().encodedSizeWithTag(1, createCalendarResponse.calendars) + createCalendarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCalendarResponse decode(ProtoReader protoReader) throws IOException {
            C15578a aVar = new C15578a();
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
                    aVar.f41313a.add(Calendar.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCalendarResponse createCalendarResponse) throws IOException {
            Calendar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, createCalendarResponse.calendars);
            protoWriter.writeBytes(createCalendarResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateCalendarResponse$a */
    public static final class C15578a extends Message.Builder<CreateCalendarResponse, C15578a> {

        /* renamed from: a */
        public List<Calendar> f41313a = Internal.newMutableList();

        /* renamed from: a */
        public CreateCalendarResponse build() {
            return new CreateCalendarResponse(this.f41313a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15578a newBuilder() {
        C15578a aVar = new C15578a();
        aVar.f41313a = Internal.copyOf("calendars", this.calendars);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CreateCalendarResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendars.isEmpty()) {
            sb.append(", calendars=");
            sb.append(this.calendars);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCalendarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCalendarResponse(List<Calendar> list) {
        this(list, ByteString.EMPTY);
    }

    public CreateCalendarResponse(List<Calendar> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendars = Internal.immutableCopyOf("calendars", list);
    }
}
