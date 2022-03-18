package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateCommentResponse extends Message<CreateCommentResponse, C18348a> {
    public static final ProtoAdapter<CreateCommentResponse> ADAPTER = new C18349b();
    private static final long serialVersionUID = 0;
    public final Comment comment;
    public final Entities entities;
    public final CommentSet modified_comment_set;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateCommentResponse$b */
    private static final class C18349b extends ProtoAdapter<CreateCommentResponse> {
        C18349b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCommentResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCommentResponse createCommentResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (createCommentResponse.comment != null) {
                i = Comment.ADAPTER.encodedSizeWithTag(1, createCommentResponse.comment);
            } else {
                i = 0;
            }
            if (createCommentResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, createCommentResponse.entities);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (createCommentResponse.modified_comment_set != null) {
                i3 = CommentSet.ADAPTER.encodedSizeWithTag(41, createCommentResponse.modified_comment_set);
            }
            return i4 + i3 + createCommentResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCommentResponse decode(ProtoReader protoReader) throws IOException {
            C18348a aVar = new C18348a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45709a = Comment.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45710b = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 41) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45711c = CommentSet.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCommentResponse createCommentResponse) throws IOException {
            if (createCommentResponse.comment != null) {
                Comment.ADAPTER.encodeWithTag(protoWriter, 1, createCommentResponse.comment);
            }
            if (createCommentResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, createCommentResponse.entities);
            }
            if (createCommentResponse.modified_comment_set != null) {
                CommentSet.ADAPTER.encodeWithTag(protoWriter, 41, createCommentResponse.modified_comment_set);
            }
            protoWriter.writeBytes(createCommentResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateCommentResponse$a */
    public static final class C18348a extends Message.Builder<CreateCommentResponse, C18348a> {

        /* renamed from: a */
        public Comment f45709a;

        /* renamed from: b */
        public Entities f45710b;

        /* renamed from: c */
        public CommentSet f45711c;

        /* renamed from: a */
        public CreateCommentResponse build() {
            return new CreateCommentResponse(this.f45709a, this.f45710b, this.f45711c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18348a newBuilder() {
        C18348a aVar = new C18348a();
        aVar.f45709a = this.comment;
        aVar.f45710b = this.entities;
        aVar.f45711c = this.modified_comment_set;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CreateCommentResponse");
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.modified_comment_set != null) {
            sb.append(", modified_comment_set=");
            sb.append(this.modified_comment_set);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCommentResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCommentResponse(Comment comment2, Entities entities2, CommentSet commentSet) {
        this(comment2, entities2, commentSet, ByteString.EMPTY);
    }

    public CreateCommentResponse(Comment comment2, Entities entities2, CommentSet commentSet, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = comment2;
        this.entities = entities2;
        this.modified_comment_set = commentSet;
    }
}
