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

public final class GetCalendarsRequest extends Message<GetCalendarsRequest, C15672a> {
    public static final ProtoAdapter<GetCalendarsRequest> ADAPTER = new C15673b();
    private static final long serialVersionUID = 0;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarsRequest$b */
    private static final class C15673b extends ProtoAdapter<GetCalendarsRequest> {
        C15673b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarsRequest getCalendarsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getCalendarsRequest.ids) + getCalendarsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarsRequest decode(ProtoReader protoReader) throws IOException {
            C15672a aVar = new C15672a();
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
                    aVar.f41436a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarsRequest getCalendarsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getCalendarsRequest.ids);
            protoWriter.writeBytes(getCalendarsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarsRequest$a */
    public static final class C15672a extends Message.Builder<GetCalendarsRequest, C15672a> {

        /* renamed from: a */
        public List<String> f41436a = Internal.newMutableList();

        /* renamed from: a */
        public GetCalendarsRequest build() {
            return new GetCalendarsRequest(this.f41436a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15672a mo56751a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41436a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15672a newBuilder() {
        C15672a aVar = new C15672a();
        aVar.f41436a = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetCalendarsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
