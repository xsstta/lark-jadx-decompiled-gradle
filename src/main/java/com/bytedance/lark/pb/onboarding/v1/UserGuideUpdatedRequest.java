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

public final class UserGuideUpdatedRequest extends Message<UserGuideUpdatedRequest, C18626a> {
    public static final ProtoAdapter<UserGuideUpdatedRequest> ADAPTER = new C18627b();
    private static final long serialVersionUID = 0;
    public final List<UserGuideViewAreaPair> ordered_pairs;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.UserGuideUpdatedRequest$b */
    private static final class C18627b extends ProtoAdapter<UserGuideUpdatedRequest> {
        C18627b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserGuideUpdatedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UserGuideUpdatedRequest userGuideUpdatedRequest) {
            return UserGuideViewAreaPair.ADAPTER.asRepeated().encodedSizeWithTag(1, userGuideUpdatedRequest.ordered_pairs) + userGuideUpdatedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UserGuideUpdatedRequest decode(ProtoReader protoReader) throws IOException {
            C18626a aVar = new C18626a();
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
                    aVar.f46135a.add(UserGuideViewAreaPair.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserGuideUpdatedRequest userGuideUpdatedRequest) throws IOException {
            UserGuideViewAreaPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, userGuideUpdatedRequest.ordered_pairs);
            protoWriter.writeBytes(userGuideUpdatedRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.UserGuideUpdatedRequest$a */
    public static final class C18626a extends Message.Builder<UserGuideUpdatedRequest, C18626a> {

        /* renamed from: a */
        public List<UserGuideViewAreaPair> f46135a = Internal.newMutableList();

        /* renamed from: a */
        public UserGuideUpdatedRequest build() {
            return new UserGuideUpdatedRequest(this.f46135a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18626a newBuilder() {
        C18626a aVar = new C18626a();
        aVar.f46135a = Internal.copyOf("ordered_pairs", this.ordered_pairs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "UserGuideUpdatedRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ordered_pairs.isEmpty()) {
            sb.append(", ordered_pairs=");
            sb.append(this.ordered_pairs);
        }
        StringBuilder replace = sb.replace(0, 2, "UserGuideUpdatedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UserGuideUpdatedRequest(List<UserGuideViewAreaPair> list) {
        this(list, ByteString.EMPTY);
    }

    public UserGuideUpdatedRequest(List<UserGuideViewAreaPair> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ordered_pairs = Internal.immutableCopyOf("ordered_pairs", list);
    }
}
