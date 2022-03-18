package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SaveEventResponse extends Message<SaveEventResponse, C15992a> {
    public static final ProtoAdapter<SaveEventResponse> ADAPTER = new C15993b();
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveEventResponse$b */
    private static final class C15993b extends ProtoAdapter<SaveEventResponse> {
        C15993b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveEventResponse saveEventResponse) {
            int i;
            if (saveEventResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, saveEventResponse.event);
            } else {
                i = 0;
            }
            return i + saveEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SaveEventResponse decode(ProtoReader protoReader) throws IOException {
            C15992a aVar = new C15992a();
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
                    aVar.f42014a = CalendarEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveEventResponse saveEventResponse) throws IOException {
            if (saveEventResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, saveEventResponse.event);
            }
            protoWriter.writeBytes(saveEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveEventResponse$a */
    public static final class C15992a extends Message.Builder<SaveEventResponse, C15992a> {

        /* renamed from: a */
        public CalendarEvent f42014a;

        /* renamed from: a */
        public SaveEventResponse build() {
            return new SaveEventResponse(this.f42014a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15992a newBuilder() {
        C15992a aVar = new C15992a();
        aVar.f42014a = this.event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SaveEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SaveEventResponse(CalendarEvent calendarEvent) {
        this(calendarEvent, ByteString.EMPTY);
    }

    public SaveEventResponse(CalendarEvent calendarEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
    }
}
