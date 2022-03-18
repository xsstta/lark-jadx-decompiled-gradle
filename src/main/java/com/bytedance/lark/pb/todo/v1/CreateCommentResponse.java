package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateCommentResponse extends Message<CreateCommentResponse, C19479a> {
    public static final ProtoAdapter<CreateCommentResponse> ADAPTER = new C19480b();
    private static final long serialVersionUID = 0;
    public final TodoComment comment;

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateCommentResponse$b */
    private static final class C19480b extends ProtoAdapter<CreateCommentResponse> {
        C19480b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCommentResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCommentResponse createCommentResponse) {
            int i;
            if (createCommentResponse.comment != null) {
                i = TodoComment.ADAPTER.encodedSizeWithTag(1, createCommentResponse.comment);
            } else {
                i = 0;
            }
            return i + createCommentResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCommentResponse decode(ProtoReader protoReader) throws IOException {
            C19479a aVar = new C19479a();
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
                    aVar.f47833a = TodoComment.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCommentResponse createCommentResponse) throws IOException {
            if (createCommentResponse.comment != null) {
                TodoComment.ADAPTER.encodeWithTag(protoWriter, 1, createCommentResponse.comment);
            }
            protoWriter.writeBytes(createCommentResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateCommentResponse$a */
    public static final class C19479a extends Message.Builder<CreateCommentResponse, C19479a> {

        /* renamed from: a */
        public TodoComment f47833a;

        /* renamed from: a */
        public CreateCommentResponse build() {
            return new CreateCommentResponse(this.f47833a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19479a newBuilder() {
        C19479a aVar = new C19479a();
        aVar.f47833a = this.comment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "CreateCommentResponse");
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCommentResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCommentResponse(TodoComment todoComment) {
        this(todoComment, ByteString.EMPTY);
    }

    public CreateCommentResponse(TodoComment todoComment, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = todoComment;
    }
}
