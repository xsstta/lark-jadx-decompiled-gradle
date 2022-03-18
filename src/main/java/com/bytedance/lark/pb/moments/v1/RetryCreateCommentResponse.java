package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RetryCreateCommentResponse extends Message<RetryCreateCommentResponse, C18536a> {
    public static final ProtoAdapter<RetryCreateCommentResponse> ADAPTER = new C18537b();
    private static final long serialVersionUID = 0;
    public final Comment comment;
    public final Entities entities;

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreateCommentResponse$b */
    private static final class C18537b extends ProtoAdapter<RetryCreateCommentResponse> {
        C18537b() {
            super(FieldEncoding.LENGTH_DELIMITED, RetryCreateCommentResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RetryCreateCommentResponse retryCreateCommentResponse) {
            int i;
            int i2 = 0;
            if (retryCreateCommentResponse.comment != null) {
                i = Comment.ADAPTER.encodedSizeWithTag(1, retryCreateCommentResponse.comment);
            } else {
                i = 0;
            }
            if (retryCreateCommentResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, retryCreateCommentResponse.entities);
            }
            return i + i2 + retryCreateCommentResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RetryCreateCommentResponse decode(ProtoReader protoReader) throws IOException {
            C18536a aVar = new C18536a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46022a = Comment.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46023b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RetryCreateCommentResponse retryCreateCommentResponse) throws IOException {
            if (retryCreateCommentResponse.comment != null) {
                Comment.ADAPTER.encodeWithTag(protoWriter, 1, retryCreateCommentResponse.comment);
            }
            if (retryCreateCommentResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, retryCreateCommentResponse.entities);
            }
            protoWriter.writeBytes(retryCreateCommentResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreateCommentResponse$a */
    public static final class C18536a extends Message.Builder<RetryCreateCommentResponse, C18536a> {

        /* renamed from: a */
        public Comment f46022a;

        /* renamed from: b */
        public Entities f46023b;

        /* renamed from: a */
        public RetryCreateCommentResponse build() {
            return new RetryCreateCommentResponse(this.f46022a, this.f46023b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18536a newBuilder() {
        C18536a aVar = new C18536a();
        aVar.f46022a = this.comment;
        aVar.f46023b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "RetryCreateCommentResponse");
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "RetryCreateCommentResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RetryCreateCommentResponse(Comment comment2, Entities entities2) {
        this(comment2, entities2, ByteString.EMPTY);
    }

    public RetryCreateCommentResponse(Comment comment2, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = comment2;
        this.entities = entities2;
    }
}
