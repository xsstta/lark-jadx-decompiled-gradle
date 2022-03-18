package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SeizeResourceResponse extends Message<SeizeResourceResponse, C16034a> {
    public static final ProtoAdapter<SeizeResourceResponse> ADAPTER = new C16035b();
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SeizeResourceResponse$b */
    private static final class C16035b extends ProtoAdapter<SeizeResourceResponse> {
        C16035b() {
            super(FieldEncoding.LENGTH_DELIMITED, SeizeResourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SeizeResourceResponse seizeResourceResponse) {
            int i;
            if (seizeResourceResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(2, seizeResourceResponse.event);
            } else {
                i = 0;
            }
            return i + seizeResourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SeizeResourceResponse decode(ProtoReader protoReader) throws IOException {
            C16034a aVar = new C16034a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42113a = CalendarEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SeizeResourceResponse seizeResourceResponse) throws IOException {
            if (seizeResourceResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 2, seizeResourceResponse.event);
            }
            protoWriter.writeBytes(seizeResourceResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SeizeResourceResponse$a */
    public static final class C16034a extends Message.Builder<SeizeResourceResponse, C16034a> {

        /* renamed from: a */
        public CalendarEvent f42113a;

        /* renamed from: a */
        public SeizeResourceResponse build() {
            return new SeizeResourceResponse(this.f42113a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16034a newBuilder() {
        C16034a aVar = new C16034a();
        aVar.f42113a = this.event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SeizeResourceResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        StringBuilder replace = sb.replace(0, 2, "SeizeResourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SeizeResourceResponse(CalendarEvent calendarEvent) {
        this(calendarEvent, ByteString.EMPTY);
    }

    public SeizeResourceResponse(CalendarEvent calendarEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
    }
}
