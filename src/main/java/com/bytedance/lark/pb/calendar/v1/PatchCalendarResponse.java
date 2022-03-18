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

public final class PatchCalendarResponse extends Message<PatchCalendarResponse, C15906a> {
    public static final ProtoAdapter<PatchCalendarResponse> ADAPTER = new C15907b();
    private static final long serialVersionUID = 0;
    public final List<Calendar> calendars;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PatchCalendarResponse$b */
    private static final class C15907b extends ProtoAdapter<PatchCalendarResponse> {
        C15907b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchCalendarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchCalendarResponse patchCalendarResponse) {
            return Calendar.ADAPTER.asRepeated().encodedSizeWithTag(1, patchCalendarResponse.calendars) + patchCalendarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchCalendarResponse decode(ProtoReader protoReader) throws IOException {
            C15906a aVar = new C15906a();
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
                    aVar.f41866a.add(Calendar.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchCalendarResponse patchCalendarResponse) throws IOException {
            Calendar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, patchCalendarResponse.calendars);
            protoWriter.writeBytes(patchCalendarResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PatchCalendarResponse$a */
    public static final class C15906a extends Message.Builder<PatchCalendarResponse, C15906a> {

        /* renamed from: a */
        public List<Calendar> f41866a = Internal.newMutableList();

        /* renamed from: a */
        public PatchCalendarResponse build() {
            return new PatchCalendarResponse(this.f41866a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15906a newBuilder() {
        C15906a aVar = new C15906a();
        aVar.f41866a = Internal.copyOf("calendars", this.calendars);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PatchCalendarResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendars.isEmpty()) {
            sb.append(", calendars=");
            sb.append(this.calendars);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchCalendarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchCalendarResponse(List<Calendar> list) {
        this(list, ByteString.EMPTY);
    }

    public PatchCalendarResponse(List<Calendar> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendars = Internal.immutableCopyOf("calendars", list);
    }
}
