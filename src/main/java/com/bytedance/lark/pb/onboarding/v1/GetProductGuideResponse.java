package com.bytedance.lark.pb.onboarding.v1;

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

public final class GetProductGuideResponse extends Message<GetProductGuideResponse, C18592a> {
    public static final ProtoAdapter<GetProductGuideResponse> ADAPTER = new C18593b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> guides;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetProductGuideResponse$a */
    public static final class C18592a extends Message.Builder<GetProductGuideResponse, C18592a> {

        /* renamed from: a */
        public Map<String, Boolean> f46099a = Internal.newMutableMap();

        /* renamed from: a */
        public GetProductGuideResponse build() {
            return new GetProductGuideResponse(this.f46099a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetProductGuideResponse$b */
    private static final class C18593b extends ProtoAdapter<GetProductGuideResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f46100a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C18593b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetProductGuideResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetProductGuideResponse getProductGuideResponse) {
            return this.f46100a.encodedSizeWithTag(1, getProductGuideResponse.guides) + getProductGuideResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetProductGuideResponse decode(ProtoReader protoReader) throws IOException {
            C18592a aVar = new C18592a();
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
                    aVar.f46099a.putAll(this.f46100a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetProductGuideResponse getProductGuideResponse) throws IOException {
            this.f46100a.encodeWithTag(protoWriter, 1, getProductGuideResponse.guides);
            protoWriter.writeBytes(getProductGuideResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18592a newBuilder() {
        C18592a aVar = new C18592a();
        aVar.f46099a = Internal.copyOf("guides", this.guides);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetProductGuideResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.guides.isEmpty()) {
            sb.append(", guides=");
            sb.append(this.guides);
        }
        StringBuilder replace = sb.replace(0, 2, "GetProductGuideResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetProductGuideResponse(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public GetProductGuideResponse(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guides = Internal.immutableCopyOf("guides", map);
    }
}
