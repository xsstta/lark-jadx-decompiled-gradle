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

public final class GetBuildingsResponse extends Message<GetBuildingsResponse, C15650a> {
    public static final ProtoAdapter<GetBuildingsResponse> ADAPTER = new C15651b();
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarBuilding> buildings;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetBuildingsResponse$a */
    public static final class C15650a extends Message.Builder<GetBuildingsResponse, C15650a> {

        /* renamed from: a */
        public Map<String, CalendarBuilding> f41413a = Internal.newMutableMap();

        /* renamed from: a */
        public GetBuildingsResponse build() {
            return new GetBuildingsResponse(this.f41413a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetBuildingsResponse$b */
    private static final class C15651b extends ProtoAdapter<GetBuildingsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarBuilding>> f41414a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarBuilding.ADAPTER);

        C15651b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBuildingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBuildingsResponse getBuildingsResponse) {
            return this.f41414a.encodedSizeWithTag(1, getBuildingsResponse.buildings) + getBuildingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBuildingsResponse decode(ProtoReader protoReader) throws IOException {
            C15650a aVar = new C15650a();
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
                    aVar.f41413a.putAll(this.f41414a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBuildingsResponse getBuildingsResponse) throws IOException {
            this.f41414a.encodeWithTag(protoWriter, 1, getBuildingsResponse.buildings);
            protoWriter.writeBytes(getBuildingsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15650a newBuilder() {
        C15650a aVar = new C15650a();
        aVar.f41413a = Internal.copyOf("buildings", this.buildings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetBuildingsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.buildings.isEmpty()) {
            sb.append(", buildings=");
            sb.append(this.buildings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBuildingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBuildingsResponse(Map<String, CalendarBuilding> map) {
        this(map, ByteString.EMPTY);
    }

    public GetBuildingsResponse(Map<String, CalendarBuilding> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.buildings = Internal.immutableCopyOf("buildings", map);
    }
}
