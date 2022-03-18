package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreatePostResponse extends Message<CreatePostResponse, C18352a> {
    public static final ProtoAdapter<CreatePostResponse> ADAPTER = new C18353b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final Post post;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreatePostResponse$b */
    private static final class C18353b extends ProtoAdapter<CreatePostResponse> {
        C18353b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreatePostResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreatePostResponse createPostResponse) {
            int i;
            int i2 = 0;
            if (createPostResponse.post != null) {
                i = Post.ADAPTER.encodedSizeWithTag(1, createPostResponse.post);
            } else {
                i = 0;
            }
            if (createPostResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, createPostResponse.entities);
            }
            return i + i2 + createPostResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreatePostResponse decode(ProtoReader protoReader) throws IOException {
            C18352a aVar = new C18352a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45718a = Post.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45719b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreatePostResponse createPostResponse) throws IOException {
            if (createPostResponse.post != null) {
                Post.ADAPTER.encodeWithTag(protoWriter, 1, createPostResponse.post);
            }
            if (createPostResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, createPostResponse.entities);
            }
            protoWriter.writeBytes(createPostResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreatePostResponse$a */
    public static final class C18352a extends Message.Builder<CreatePostResponse, C18352a> {

        /* renamed from: a */
        public Post f45718a;

        /* renamed from: b */
        public Entities f45719b;

        /* renamed from: a */
        public CreatePostResponse build() {
            return new CreatePostResponse(this.f45718a, this.f45719b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18352a newBuilder() {
        C18352a aVar = new C18352a();
        aVar.f45718a = this.post;
        aVar.f45719b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CreatePostResponse");
        StringBuilder sb = new StringBuilder();
        if (this.post != null) {
            sb.append(", post=");
            sb.append(this.post);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "CreatePostResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreatePostResponse(Post post2, Entities entities2) {
        this(post2, entities2, ByteString.EMPTY);
    }

    public CreatePostResponse(Post post2, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post = post2;
        this.entities = entities2;
    }
}
