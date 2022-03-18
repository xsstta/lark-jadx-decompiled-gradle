package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetFollowResourcesRequest extends Message<GetFollowResourcesRequest, C50647a> {
    public static final ProtoAdapter<GetFollowResourcesRequest> ADAPTER = new C50648b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> resources;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFollowResourcesRequest$a */
    public static final class C50647a extends Message.Builder<GetFollowResourcesRequest, C50647a> {

        /* renamed from: a */
        public Map<String, String> f126382a = Internal.newMutableMap();

        /* renamed from: a */
        public GetFollowResourcesRequest build() {
            return new GetFollowResourcesRequest(this.f126382a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFollowResourcesRequest$b */
    private static final class C50648b extends ProtoAdapter<GetFollowResourcesRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f126383a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C50648b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFollowResourcesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFollowResourcesRequest getFollowResourcesRequest) {
            return this.f126383a.encodedSizeWithTag(1, getFollowResourcesRequest.resources) + getFollowResourcesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFollowResourcesRequest decode(ProtoReader protoReader) throws IOException {
            C50647a aVar = new C50647a();
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
                    aVar.f126382a.putAll(this.f126383a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFollowResourcesRequest getFollowResourcesRequest) throws IOException {
            this.f126383a.encodeWithTag(protoWriter, 1, getFollowResourcesRequest.resources);
            protoWriter.writeBytes(getFollowResourcesRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50647a newBuilder() {
        C50647a aVar = new C50647a();
        aVar.f126382a = Internal.copyOf("resources", this.resources);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetFollowResourcesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFollowResourcesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFollowResourcesRequest(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public GetFollowResourcesRequest(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resources = Internal.immutableCopyOf("resources", map);
    }
}
