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

public final class GetCalendarEventMappingColorsResponse extends Message<GetCalendarEventMappingColorsResponse, C15658a> {
    public static final ProtoAdapter<GetCalendarEventMappingColorsResponse> ADAPTER = new C15659b();
    private static final long serialVersionUID = 0;
    public final Map<String, MappingColor> colors;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventMappingColorsResponse$a */
    public static final class C15658a extends Message.Builder<GetCalendarEventMappingColorsResponse, C15658a> {

        /* renamed from: a */
        public Map<String, MappingColor> f41421a = Internal.newMutableMap();

        /* renamed from: a */
        public GetCalendarEventMappingColorsResponse build() {
            return new GetCalendarEventMappingColorsResponse(this.f41421a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventMappingColorsResponse$b */
    private static final class C15659b extends ProtoAdapter<GetCalendarEventMappingColorsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, MappingColor>> f41422a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, MappingColor.ADAPTER);

        C15659b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarEventMappingColorsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarEventMappingColorsResponse getCalendarEventMappingColorsResponse) {
            return this.f41422a.encodedSizeWithTag(1, getCalendarEventMappingColorsResponse.colors) + getCalendarEventMappingColorsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarEventMappingColorsResponse decode(ProtoReader protoReader) throws IOException {
            C15658a aVar = new C15658a();
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
                    aVar.f41421a.putAll(this.f41422a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarEventMappingColorsResponse getCalendarEventMappingColorsResponse) throws IOException {
            this.f41422a.encodeWithTag(protoWriter, 1, getCalendarEventMappingColorsResponse.colors);
            protoWriter.writeBytes(getCalendarEventMappingColorsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15658a newBuilder() {
        C15658a aVar = new C15658a();
        aVar.f41421a = Internal.copyOf("colors", this.colors);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarEventMappingColorsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.colors.isEmpty()) {
            sb.append(", colors=");
            sb.append(this.colors);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarEventMappingColorsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarEventMappingColorsResponse(Map<String, MappingColor> map) {
        this(map, ByteString.EMPTY);
    }

    public GetCalendarEventMappingColorsResponse(Map<String, MappingColor> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.colors = Internal.immutableCopyOf("colors", map);
    }
}
