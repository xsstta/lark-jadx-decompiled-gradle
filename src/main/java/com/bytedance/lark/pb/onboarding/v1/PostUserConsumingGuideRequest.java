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

public final class PostUserConsumingGuideRequest extends Message<PostUserConsumingGuideRequest, C18604a> {
    public static final ProtoAdapter<PostUserConsumingGuideRequest> ADAPTER = new C18605b();
    private static final long serialVersionUID = 0;
    public final List<String> keys;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PostUserConsumingGuideRequest$b */
    private static final class C18605b extends ProtoAdapter<PostUserConsumingGuideRequest> {
        C18605b() {
            super(FieldEncoding.LENGTH_DELIMITED, PostUserConsumingGuideRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PostUserConsumingGuideRequest postUserConsumingGuideRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, postUserConsumingGuideRequest.keys) + postUserConsumingGuideRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PostUserConsumingGuideRequest decode(ProtoReader protoReader) throws IOException {
            C18604a aVar = new C18604a();
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
                    aVar.f46106a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PostUserConsumingGuideRequest postUserConsumingGuideRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, postUserConsumingGuideRequest.keys);
            protoWriter.writeBytes(postUserConsumingGuideRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PostUserConsumingGuideRequest$a */
    public static final class C18604a extends Message.Builder<PostUserConsumingGuideRequest, C18604a> {

        /* renamed from: a */
        public List<String> f46106a = Internal.newMutableList();

        /* renamed from: a */
        public PostUserConsumingGuideRequest build() {
            return new PostUserConsumingGuideRequest(this.f46106a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18604a mo64113a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f46106a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18604a newBuilder() {
        C18604a aVar = new C18604a();
        aVar.f46106a = Internal.copyOf("keys", this.keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "PostUserConsumingGuideRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        StringBuilder replace = sb.replace(0, 2, "PostUserConsumingGuideRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PostUserConsumingGuideRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PostUserConsumingGuideRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
    }
}
