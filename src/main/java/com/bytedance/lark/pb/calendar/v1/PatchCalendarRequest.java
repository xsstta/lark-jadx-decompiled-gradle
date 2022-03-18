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

public final class PatchCalendarRequest extends Message<PatchCalendarRequest, C15904a> {
    public static final ProtoAdapter<PatchCalendarRequest> ADAPTER = new C15905b();
    private static final long serialVersionUID = 0;
    public final List<CalendarSaveInfo> calendar_save_infos;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PatchCalendarRequest$b */
    private static final class C15905b extends ProtoAdapter<PatchCalendarRequest> {
        C15905b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchCalendarRequest patchCalendarRequest) {
            return CalendarSaveInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, patchCalendarRequest.calendar_save_infos) + patchCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C15904a aVar = new C15904a();
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
                    aVar.f41865a.add(CalendarSaveInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchCalendarRequest patchCalendarRequest) throws IOException {
            CalendarSaveInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, patchCalendarRequest.calendar_save_infos);
            protoWriter.writeBytes(patchCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PatchCalendarRequest$a */
    public static final class C15904a extends Message.Builder<PatchCalendarRequest, C15904a> {

        /* renamed from: a */
        public List<CalendarSaveInfo> f41865a = Internal.newMutableList();

        /* renamed from: a */
        public PatchCalendarRequest build() {
            return new PatchCalendarRequest(this.f41865a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15904a mo57345a(List<CalendarSaveInfo> list) {
            Internal.checkElementsNotNull(list);
            this.f41865a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15904a newBuilder() {
        C15904a aVar = new C15904a();
        aVar.f41865a = Internal.copyOf("calendar_save_infos", this.calendar_save_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PatchCalendarRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_save_infos.isEmpty()) {
            sb.append(", calendar_save_infos=");
            sb.append(this.calendar_save_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchCalendarRequest(List<CalendarSaveInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public PatchCalendarRequest(List<CalendarSaveInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_save_infos = Internal.immutableCopyOf("calendar_save_infos", list);
    }
}
