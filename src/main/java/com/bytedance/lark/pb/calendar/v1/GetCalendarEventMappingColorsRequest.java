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

public final class GetCalendarEventMappingColorsRequest extends Message<GetCalendarEventMappingColorsRequest, C15656a> {
    public static final ProtoAdapter<GetCalendarEventMappingColorsRequest> ADAPTER = new C15657b();
    private static final long serialVersionUID = 0;
    public final List<Integer> colors;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventMappingColorsRequest$b */
    private static final class C15657b extends ProtoAdapter<GetCalendarEventMappingColorsRequest> {
        C15657b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarEventMappingColorsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarEventMappingColorsRequest getCalendarEventMappingColorsRequest) {
            return ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, getCalendarEventMappingColorsRequest.colors) + getCalendarEventMappingColorsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarEventMappingColorsRequest decode(ProtoReader protoReader) throws IOException {
            C15656a aVar = new C15656a();
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
                    aVar.f41420a.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarEventMappingColorsRequest getCalendarEventMappingColorsRequest) throws IOException {
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 1, getCalendarEventMappingColorsRequest.colors);
            protoWriter.writeBytes(getCalendarEventMappingColorsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventMappingColorsRequest$a */
    public static final class C15656a extends Message.Builder<GetCalendarEventMappingColorsRequest, C15656a> {

        /* renamed from: a */
        public List<Integer> f41420a = Internal.newMutableList();

        /* renamed from: a */
        public GetCalendarEventMappingColorsRequest build() {
            return new GetCalendarEventMappingColorsRequest(this.f41420a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15656a mo56711a(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.f41420a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15656a newBuilder() {
        C15656a aVar = new C15656a();
        aVar.f41420a = Internal.copyOf("colors", this.colors);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarEventMappingColorsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.colors.isEmpty()) {
            sb.append(", colors=");
            sb.append(this.colors);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarEventMappingColorsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarEventMappingColorsRequest(List<Integer> list) {
        this(list, ByteString.EMPTY);
    }

    public GetCalendarEventMappingColorsRequest(List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.colors = Internal.immutableCopyOf("colors", list);
    }
}
