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

public final class CreateCalendarRequest extends Message<CreateCalendarRequest, C15576a> {
    public static final ProtoAdapter<CreateCalendarRequest> ADAPTER = new C15577b();
    private static final long serialVersionUID = 0;
    public final List<CalendarSaveInfo> calendar_save_infos;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateCalendarRequest$b */
    private static final class C15577b extends ProtoAdapter<CreateCalendarRequest> {
        C15577b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCalendarRequest createCalendarRequest) {
            return CalendarSaveInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, createCalendarRequest.calendar_save_infos) + createCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C15576a aVar = new C15576a();
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
                    aVar.f41312a.add(CalendarSaveInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCalendarRequest createCalendarRequest) throws IOException {
            CalendarSaveInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, createCalendarRequest.calendar_save_infos);
            protoWriter.writeBytes(createCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateCalendarRequest$a */
    public static final class C15576a extends Message.Builder<CreateCalendarRequest, C15576a> {

        /* renamed from: a */
        public List<CalendarSaveInfo> f41312a = Internal.newMutableList();

        /* renamed from: a */
        public CreateCalendarRequest build() {
            return new CreateCalendarRequest(this.f41312a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15576a mo56510a(List<CalendarSaveInfo> list) {
            Internal.checkElementsNotNull(list);
            this.f41312a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15576a newBuilder() {
        C15576a aVar = new C15576a();
        aVar.f41312a = Internal.copyOf("calendar_save_infos", this.calendar_save_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CreateCalendarRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_save_infos.isEmpty()) {
            sb.append(", calendar_save_infos=");
            sb.append(this.calendar_save_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCalendarRequest(List<CalendarSaveInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public CreateCalendarRequest(List<CalendarSaveInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_save_infos = Internal.immutableCopyOf("calendar_save_infos", list);
    }
}
