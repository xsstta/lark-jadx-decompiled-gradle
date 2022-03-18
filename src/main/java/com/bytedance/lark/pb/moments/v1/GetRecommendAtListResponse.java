package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetRecommendAtListResponse extends Message<GetRecommendAtListResponse, C18390a> {
    public static final ProtoAdapter<GetRecommendAtListResponse> ADAPTER = new C18391b();
    private static final long serialVersionUID = 0;
    public final List<MomentUser> moment_users;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetRecommendAtListResponse$b */
    private static final class C18391b extends ProtoAdapter<GetRecommendAtListResponse> {
        C18391b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecommendAtListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecommendAtListResponse getRecommendAtListResponse) {
            return MomentUser.ADAPTER.asRepeated().encodedSizeWithTag(1, getRecommendAtListResponse.moment_users) + getRecommendAtListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecommendAtListResponse decode(ProtoReader protoReader) throws IOException {
            C18390a aVar = new C18390a();
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
                    aVar.f45768a.add(MomentUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRecommendAtListResponse getRecommendAtListResponse) throws IOException {
            MomentUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getRecommendAtListResponse.moment_users);
            protoWriter.writeBytes(getRecommendAtListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetRecommendAtListResponse$a */
    public static final class C18390a extends Message.Builder<GetRecommendAtListResponse, C18390a> {

        /* renamed from: a */
        public List<MomentUser> f45768a = Internal.newMutableList();

        /* renamed from: a */
        public GetRecommendAtListResponse build() {
            return new GetRecommendAtListResponse(this.f45768a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18390a newBuilder() {
        C18390a aVar = new C18390a();
        aVar.f45768a = Internal.copyOf("moment_users", this.moment_users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetRecommendAtListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.moment_users.isEmpty()) {
            sb.append(", moment_users=");
            sb.append(this.moment_users);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRecommendAtListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecommendAtListResponse(List<MomentUser> list) {
        this(list, ByteString.EMPTY);
    }

    public GetRecommendAtListResponse(List<MomentUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.moment_users = Internal.immutableCopyOf("moment_users", list);
    }
}
