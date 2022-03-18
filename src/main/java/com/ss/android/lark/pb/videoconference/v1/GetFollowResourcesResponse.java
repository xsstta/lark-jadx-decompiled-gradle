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

public final class GetFollowResourcesResponse extends Message<GetFollowResourcesResponse, C50649a> {
    public static final ProtoAdapter<GetFollowResourcesResponse> ADAPTER = new C50650b();
    private static final long serialVersionUID = 0;
    public final Map<String, FollowResource> resources;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFollowResourcesResponse$a */
    public static final class C50649a extends Message.Builder<GetFollowResourcesResponse, C50649a> {

        /* renamed from: a */
        public Map<String, FollowResource> f126384a = Internal.newMutableMap();

        /* renamed from: a */
        public GetFollowResourcesResponse build() {
            return new GetFollowResourcesResponse(this.f126384a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFollowResourcesResponse$b */
    private static final class C50650b extends ProtoAdapter<GetFollowResourcesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, FollowResource>> f126385a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FollowResource.ADAPTER);

        C50650b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFollowResourcesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFollowResourcesResponse getFollowResourcesResponse) {
            return this.f126385a.encodedSizeWithTag(1, getFollowResourcesResponse.resources) + getFollowResourcesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFollowResourcesResponse decode(ProtoReader protoReader) throws IOException {
            C50649a aVar = new C50649a();
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
                    aVar.f126384a.putAll(this.f126385a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFollowResourcesResponse getFollowResourcesResponse) throws IOException {
            this.f126385a.encodeWithTag(protoWriter, 1, getFollowResourcesResponse.resources);
            protoWriter.writeBytes(getFollowResourcesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50649a newBuilder() {
        C50649a aVar = new C50649a();
        aVar.f126384a = Internal.copyOf("resources", this.resources);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetFollowResourcesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFollowResourcesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFollowResourcesResponse(Map<String, FollowResource> map) {
        this(map, ByteString.EMPTY);
    }

    public GetFollowResourcesResponse(Map<String, FollowResource> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resources = Internal.immutableCopyOf("resources", map);
    }
}
