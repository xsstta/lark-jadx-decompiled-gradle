package com.bytedance.lark.pb.settings.v1;

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

public final class GetSettingsResponse extends Message<GetSettingsResponse, C19157a> {
    public static final ProtoAdapter<GetSettingsResponse> ADAPTER = new C19158b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> field_groups;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetSettingsResponse$a */
    public static final class C19157a extends Message.Builder<GetSettingsResponse, C19157a> {

        /* renamed from: a */
        public Map<String, String> f47296a = Internal.newMutableMap();

        /* renamed from: a */
        public GetSettingsResponse build() {
            return new GetSettingsResponse(this.f47296a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetSettingsResponse$b */
    private static final class C19158b extends ProtoAdapter<GetSettingsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47297a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19158b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSettingsResponse getSettingsResponse) {
            return this.f47297a.encodedSizeWithTag(1, getSettingsResponse.field_groups) + getSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C19157a aVar = new C19157a();
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
                    aVar.f47296a.putAll(this.f47297a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSettingsResponse getSettingsResponse) throws IOException {
            this.f47297a.encodeWithTag(protoWriter, 1, getSettingsResponse.field_groups);
            protoWriter.writeBytes(getSettingsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19157a newBuilder() {
        C19157a aVar = new C19157a();
        aVar.f47296a = Internal.copyOf("field_groups", this.field_groups);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.field_groups.isEmpty()) {
            sb.append(", field_groups=");
            sb.append(this.field_groups);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSettingsResponse(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public GetSettingsResponse(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.field_groups = Internal.immutableCopyOf("field_groups", map);
    }
}
