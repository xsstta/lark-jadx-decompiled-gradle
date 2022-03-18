package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PostUserConsumingGuideResponse extends Message<PostUserConsumingGuideResponse, C18606a> {
    public static final ProtoAdapter<PostUserConsumingGuideResponse> ADAPTER = new C18607b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PostUserConsumingGuideResponse$b */
    private static final class C18607b extends ProtoAdapter<PostUserConsumingGuideResponse> {
        C18607b() {
            super(FieldEncoding.LENGTH_DELIMITED, PostUserConsumingGuideResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PostUserConsumingGuideResponse postUserConsumingGuideResponse) {
            return postUserConsumingGuideResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PostUserConsumingGuideResponse decode(ProtoReader protoReader) throws IOException {
            C18606a aVar = new C18606a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PostUserConsumingGuideResponse postUserConsumingGuideResponse) throws IOException {
            protoWriter.writeBytes(postUserConsumingGuideResponse.unknownFields());
        }
    }

    public PostUserConsumingGuideResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PostUserConsumingGuideResponse$a */
    public static final class C18606a extends Message.Builder<PostUserConsumingGuideResponse, C18606a> {
        /* renamed from: a */
        public PostUserConsumingGuideResponse build() {
            return new PostUserConsumingGuideResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18606a newBuilder() {
        C18606a aVar = new C18606a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "PostUserConsumingGuideResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PostUserConsumingGuideResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PostUserConsumingGuideResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
