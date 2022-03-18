package com.bytedance.lark.pb.onboarding.v1;

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

public final class GetUserGuideResponse extends Message<GetUserGuideResponse, C18600a> {
    public static final ProtoAdapter<GetUserGuideResponse> ADAPTER = new C18601b();
    private static final long serialVersionUID = 0;
    public final List<UserGuideViewAreaPair> ordered_pairs;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetUserGuideResponse$b */
    private static final class C18601b extends ProtoAdapter<GetUserGuideResponse> {
        C18601b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserGuideResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserGuideResponse getUserGuideResponse) {
            return UserGuideViewAreaPair.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserGuideResponse.ordered_pairs) + getUserGuideResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserGuideResponse decode(ProtoReader protoReader) throws IOException {
            C18600a aVar = new C18600a();
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
                    aVar.f46103a.add(UserGuideViewAreaPair.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserGuideResponse getUserGuideResponse) throws IOException {
            UserGuideViewAreaPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUserGuideResponse.ordered_pairs);
            protoWriter.writeBytes(getUserGuideResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetUserGuideResponse$a */
    public static final class C18600a extends Message.Builder<GetUserGuideResponse, C18600a> {

        /* renamed from: a */
        public List<UserGuideViewAreaPair> f46103a = Internal.newMutableList();

        /* renamed from: a */
        public GetUserGuideResponse build() {
            return new GetUserGuideResponse(this.f46103a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18600a newBuilder() {
        C18600a aVar = new C18600a();
        aVar.f46103a = Internal.copyOf("ordered_pairs", this.ordered_pairs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetUserGuideResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.ordered_pairs.isEmpty()) {
            sb.append(", ordered_pairs=");
            sb.append(this.ordered_pairs);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserGuideResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserGuideResponse(List<UserGuideViewAreaPair> list) {
        this(list, ByteString.EMPTY);
    }

    public GetUserGuideResponse(List<UserGuideViewAreaPair> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ordered_pairs = Internal.immutableCopyOf("ordered_pairs", list);
    }
}
