package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetSmartWidgetRequest extends Message<GetSmartWidgetRequest, C49479a> {
    public static final ProtoAdapter<GetSmartWidgetRequest> ADAPTER = new C49480b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> mdata_params;

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartWidgetRequest$a */
    public static final class C49479a extends Message.Builder<GetSmartWidgetRequest, C49479a> {

        /* renamed from: a */
        public Map<String, String> f124074a = Internal.newMutableMap();

        /* renamed from: a */
        public GetSmartWidgetRequest build() {
            return new GetSmartWidgetRequest(this.f124074a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49479a mo172623a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f124074a = map;
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartWidgetRequest$b */
    private static final class C49480b extends ProtoAdapter<GetSmartWidgetRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124075a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49480b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartWidgetRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartWidgetRequest getSmartWidgetRequest) {
            return this.f124075a.encodedSizeWithTag(1, getSmartWidgetRequest.mdata_params) + getSmartWidgetRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartWidgetRequest decode(ProtoReader protoReader) throws IOException {
            C49479a aVar = new C49479a();
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
                    aVar.f124074a.putAll(this.f124075a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSmartWidgetRequest getSmartWidgetRequest) throws IOException {
            this.f124075a.encodeWithTag(protoWriter, 1, getSmartWidgetRequest.mdata_params);
            protoWriter.writeBytes(getSmartWidgetRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49479a newBuilder() {
        C49479a aVar = new C49479a();
        aVar.f124074a = Internal.copyOf("mdata_params", this.mdata_params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mdata_params.isEmpty()) {
            sb.append(", data_params=");
            sb.append(this.mdata_params);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSmartWidgetRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartWidgetRequest(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public GetSmartWidgetRequest(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdata_params = Internal.immutableCopyOf("mdata_params", map);
    }
}
