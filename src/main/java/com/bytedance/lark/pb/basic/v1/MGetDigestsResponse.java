package com.bytedance.lark.pb.basic.v1;

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

public final class MGetDigestsResponse extends Message<MGetDigestsResponse, C15045a> {
    public static final ProtoAdapter<MGetDigestsResponse> ADAPTER = new C15046b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> digests;

    /* renamed from: com.bytedance.lark.pb.basic.v1.MGetDigestsResponse$a */
    public static final class C15045a extends Message.Builder<MGetDigestsResponse, C15045a> {

        /* renamed from: a */
        public Map<String, String> f39798a = Internal.newMutableMap();

        /* renamed from: a */
        public MGetDigestsResponse build() {
            return new MGetDigestsResponse(this.f39798a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MGetDigestsResponse$b */
    private static final class C15046b extends ProtoAdapter<MGetDigestsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f39799a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15046b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetDigestsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetDigestsResponse mGetDigestsResponse) {
            return this.f39799a.encodedSizeWithTag(1, mGetDigestsResponse.digests) + mGetDigestsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetDigestsResponse decode(ProtoReader protoReader) throws IOException {
            C15045a aVar = new C15045a();
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
                    aVar.f39798a.putAll(this.f39799a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetDigestsResponse mGetDigestsResponse) throws IOException {
            this.f39799a.encodeWithTag(protoWriter, 1, mGetDigestsResponse.digests);
            protoWriter.writeBytes(mGetDigestsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15045a newBuilder() {
        C15045a aVar = new C15045a();
        aVar.f39798a = Internal.copyOf("digests", this.digests);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MGetDigestsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.digests.isEmpty()) {
            sb.append(", digests=");
            sb.append(this.digests);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetDigestsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetDigestsResponse(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public MGetDigestsResponse(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.digests = Internal.immutableCopyOf("digests", map);
    }
}
