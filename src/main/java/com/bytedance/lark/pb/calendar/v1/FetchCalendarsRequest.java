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

public final class FetchCalendarsRequest extends Message<FetchCalendarsRequest, C15624a> {
    public static final ProtoAdapter<FetchCalendarsRequest> ADAPTER = new C15625b();
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.FetchCalendarsRequest$b */
    private static final class C15625b extends ProtoAdapter<FetchCalendarsRequest> {
        C15625b() {
            super(FieldEncoding.LENGTH_DELIMITED, FetchCalendarsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FetchCalendarsRequest fetchCalendarsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, fetchCalendarsRequest.calendar_ids) + fetchCalendarsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FetchCalendarsRequest decode(ProtoReader protoReader) throws IOException {
            C15624a aVar = new C15624a();
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
                    aVar.f41380a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FetchCalendarsRequest fetchCalendarsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, fetchCalendarsRequest.calendar_ids);
            protoWriter.writeBytes(fetchCalendarsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.FetchCalendarsRequest$a */
    public static final class C15624a extends Message.Builder<FetchCalendarsRequest, C15624a> {

        /* renamed from: a */
        public List<String> f41380a = Internal.newMutableList();

        /* renamed from: a */
        public FetchCalendarsRequest build() {
            return new FetchCalendarsRequest(this.f41380a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15624a mo56634a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41380a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15624a newBuilder() {
        C15624a aVar = new C15624a();
        aVar.f41380a = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "FetchCalendarsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "FetchCalendarsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FetchCalendarsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public FetchCalendarsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
    }
}
