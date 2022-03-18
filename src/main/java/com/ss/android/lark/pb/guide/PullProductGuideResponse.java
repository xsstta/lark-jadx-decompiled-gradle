package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PullProductGuideResponse extends Message<PullProductGuideResponse, C49792a> {
    public static final ProtoAdapter<PullProductGuideResponse> ADAPTER = new C49793b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> mguides;

    /* renamed from: com.ss.android.lark.pb.guide.PullProductGuideResponse$a */
    public static final class C49792a extends Message.Builder<PullProductGuideResponse, C49792a> {

        /* renamed from: a */
        public Map<String, Boolean> f124725a = Internal.newMutableMap();

        /* renamed from: a */
        public PullProductGuideResponse build() {
            return new PullProductGuideResponse(this.f124725a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.PullProductGuideResponse$b */
    private static final class C49793b extends ProtoAdapter<PullProductGuideResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f124726a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C49793b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullProductGuideResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullProductGuideResponse pullProductGuideResponse) {
            return this.f124726a.encodedSizeWithTag(2, pullProductGuideResponse.mguides) + pullProductGuideResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullProductGuideResponse decode(ProtoReader protoReader) throws IOException {
            C49792a aVar = new C49792a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124725a.putAll(this.f124726a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullProductGuideResponse pullProductGuideResponse) throws IOException {
            this.f124726a.encodeWithTag(protoWriter, 2, pullProductGuideResponse.mguides);
            protoWriter.writeBytes(pullProductGuideResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49792a newBuilder() {
        C49792a aVar = new C49792a();
        aVar.f124725a = Internal.copyOf("mguides", this.mguides);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mguides.isEmpty()) {
            sb.append(", guides=");
            sb.append(this.mguides);
        }
        StringBuilder replace = sb.replace(0, 2, "PullProductGuideResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullProductGuideResponse(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public PullProductGuideResponse(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mguides = Internal.immutableCopyOf("mguides", map);
    }
}
