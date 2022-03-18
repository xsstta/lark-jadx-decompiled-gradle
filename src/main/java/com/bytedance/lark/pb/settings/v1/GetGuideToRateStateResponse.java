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

public final class GetGuideToRateStateResponse extends Message<GetGuideToRateStateResponse, C19141a> {
    public static final ProtoAdapter<GetGuideToRateStateResponse> ADAPTER = new C19142b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> switches;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetGuideToRateStateResponse$a */
    public static final class C19141a extends Message.Builder<GetGuideToRateStateResponse, C19141a> {

        /* renamed from: a */
        public Map<String, Boolean> f47280a = Internal.newMutableMap();

        /* renamed from: a */
        public GetGuideToRateStateResponse build() {
            return new GetGuideToRateStateResponse(this.f47280a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetGuideToRateStateResponse$b */
    private static final class C19142b extends ProtoAdapter<GetGuideToRateStateResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f47281a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C19142b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGuideToRateStateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGuideToRateStateResponse getGuideToRateStateResponse) {
            return this.f47281a.encodedSizeWithTag(1, getGuideToRateStateResponse.switches) + getGuideToRateStateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetGuideToRateStateResponse decode(ProtoReader protoReader) throws IOException {
            C19141a aVar = new C19141a();
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
                    aVar.f47280a.putAll(this.f47281a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetGuideToRateStateResponse getGuideToRateStateResponse) throws IOException {
            this.f47281a.encodeWithTag(protoWriter, 1, getGuideToRateStateResponse.switches);
            protoWriter.writeBytes(getGuideToRateStateResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19141a newBuilder() {
        C19141a aVar = new C19141a();
        aVar.f47280a = Internal.copyOf("switches", this.switches);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetGuideToRateStateResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.switches.isEmpty()) {
            sb.append(", switches=");
            sb.append(this.switches);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGuideToRateStateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetGuideToRateStateResponse(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public GetGuideToRateStateResponse(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switches = Internal.immutableCopyOf("switches", map);
    }
}
