package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetAllCalendarsResponse extends Message<GetAllCalendarsResponse, C15634a> {
    public static final ProtoAdapter<GetAllCalendarsResponse> ADAPTER = new C15635b();
    private static final long serialVersionUID = 0;
    public final Map<String, Calendar> calendars;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllCalendarsResponse$a */
    public static final class C15634a extends Message.Builder<GetAllCalendarsResponse, C15634a> {

        /* renamed from: a */
        public Map<String, Calendar> f41394a = Internal.newMutableMap();

        /* renamed from: a */
        public GetAllCalendarsResponse build() {
            return new GetAllCalendarsResponse(this.f41394a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllCalendarsResponse$b */
    private static final class C15635b extends ProtoAdapter<GetAllCalendarsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Calendar>> f41395a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Calendar.ADAPTER);

        C15635b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllCalendarsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllCalendarsResponse getAllCalendarsResponse) {
            return this.f41395a.encodedSizeWithTag(1, getAllCalendarsResponse.calendars) + getAllCalendarsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllCalendarsResponse decode(ProtoReader protoReader) throws IOException {
            C15634a aVar = new C15634a();
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
                    aVar.f41394a.putAll(this.f41395a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllCalendarsResponse getAllCalendarsResponse) throws IOException {
            this.f41395a.encodeWithTag(protoWriter, 1, getAllCalendarsResponse.calendars);
            protoWriter.writeBytes(getAllCalendarsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15634a newBuilder() {
        C15634a aVar = new C15634a();
        aVar.f41394a = Internal.copyOf("calendars", this.calendars);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAllCalendarsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendars.isEmpty()) {
            sb.append(", calendars=");
            sb.append(this.calendars);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAllCalendarsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllCalendarsResponse(Map<String, Calendar> map) {
        this(map, ByteString.EMPTY);
    }

    public GetAllCalendarsResponse(Map<String, Calendar> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendars = Internal.immutableCopyOf("calendars", map);
    }
}
