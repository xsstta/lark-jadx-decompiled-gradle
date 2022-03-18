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

public final class GetAccountBadgeResponse extends Message<GetAccountBadgeResponse, C14957a> {
    public static final ProtoAdapter<GetAccountBadgeResponse> ADAPTER = new C14958b();
    private static final long serialVersionUID = 0;
    public final Map<String, Integer> user_badge_map;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAccountBadgeResponse$a */
    public static final class C14957a extends Message.Builder<GetAccountBadgeResponse, C14957a> {

        /* renamed from: a */
        public Map<String, Integer> f39610a = Internal.newMutableMap();

        /* renamed from: a */
        public GetAccountBadgeResponse build() {
            return new GetAccountBadgeResponse(this.f39610a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAccountBadgeResponse$b */
    private static final class C14958b extends ProtoAdapter<GetAccountBadgeResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f39611a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        C14958b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAccountBadgeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAccountBadgeResponse getAccountBadgeResponse) {
            return this.f39611a.encodedSizeWithTag(1, getAccountBadgeResponse.user_badge_map) + getAccountBadgeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAccountBadgeResponse decode(ProtoReader protoReader) throws IOException {
            C14957a aVar = new C14957a();
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
                    aVar.f39610a.putAll(this.f39611a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAccountBadgeResponse getAccountBadgeResponse) throws IOException {
            this.f39611a.encodeWithTag(protoWriter, 1, getAccountBadgeResponse.user_badge_map);
            protoWriter.writeBytes(getAccountBadgeResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14957a newBuilder() {
        C14957a aVar = new C14957a();
        aVar.f39610a = Internal.copyOf("user_badge_map", this.user_badge_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetAccountBadgeResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.user_badge_map.isEmpty()) {
            sb.append(", user_badge_map=");
            sb.append(this.user_badge_map);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAccountBadgeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAccountBadgeResponse(Map<String, Integer> map) {
        this(map, ByteString.EMPTY);
    }

    public GetAccountBadgeResponse(Map<String, Integer> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_badge_map = Internal.immutableCopyOf("user_badge_map", map);
    }
}
