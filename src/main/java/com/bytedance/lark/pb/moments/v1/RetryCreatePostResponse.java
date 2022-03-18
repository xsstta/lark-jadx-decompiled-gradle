package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RetryCreatePostResponse extends Message<RetryCreatePostResponse, C18540a> {
    public static final ProtoAdapter<RetryCreatePostResponse> ADAPTER = new C18541b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final Post post;

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreatePostResponse$b */
    private static final class C18541b extends ProtoAdapter<RetryCreatePostResponse> {
        C18541b() {
            super(FieldEncoding.LENGTH_DELIMITED, RetryCreatePostResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RetryCreatePostResponse retryCreatePostResponse) {
            int i;
            int i2 = 0;
            if (retryCreatePostResponse.post != null) {
                i = Post.ADAPTER.encodedSizeWithTag(1, retryCreatePostResponse.post);
            } else {
                i = 0;
            }
            if (retryCreatePostResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, retryCreatePostResponse.entities);
            }
            return i + i2 + retryCreatePostResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RetryCreatePostResponse decode(ProtoReader protoReader) throws IOException {
            C18540a aVar = new C18540a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46025a = Post.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46026b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RetryCreatePostResponse retryCreatePostResponse) throws IOException {
            if (retryCreatePostResponse.post != null) {
                Post.ADAPTER.encodeWithTag(protoWriter, 1, retryCreatePostResponse.post);
            }
            if (retryCreatePostResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, retryCreatePostResponse.entities);
            }
            protoWriter.writeBytes(retryCreatePostResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreatePostResponse$a */
    public static final class C18540a extends Message.Builder<RetryCreatePostResponse, C18540a> {

        /* renamed from: a */
        public Post f46025a;

        /* renamed from: b */
        public Entities f46026b;

        /* renamed from: a */
        public RetryCreatePostResponse build() {
            return new RetryCreatePostResponse(this.f46025a, this.f46026b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18540a newBuilder() {
        C18540a aVar = new C18540a();
        aVar.f46025a = this.post;
        aVar.f46026b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "RetryCreatePostResponse");
        StringBuilder sb = new StringBuilder();
        if (this.post != null) {
            sb.append(", post=");
            sb.append(this.post);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "RetryCreatePostResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RetryCreatePostResponse(Post post2, Entities entities2) {
        this(post2, entities2, ByteString.EMPTY);
    }

    public RetryCreatePostResponse(Post post2, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post = post2;
        this.entities = entities2;
    }
}
