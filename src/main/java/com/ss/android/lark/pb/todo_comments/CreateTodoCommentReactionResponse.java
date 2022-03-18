package com.ss.android.lark.pb.todo_comments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateTodoCommentReactionResponse extends Message<CreateTodoCommentReactionResponse, C50080a> {
    public static final ProtoAdapter<CreateTodoCommentReactionResponse> ADAPTER = new C50081b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.todo_comments.CreateTodoCommentReactionResponse$b */
    private static final class C50081b extends ProtoAdapter<CreateTodoCommentReactionResponse> {
        C50081b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTodoCommentReactionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTodoCommentReactionResponse createTodoCommentReactionResponse) {
            return createTodoCommentReactionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTodoCommentReactionResponse decode(ProtoReader protoReader) throws IOException {
            C50080a aVar = new C50080a();
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
        public void encode(ProtoWriter protoWriter, CreateTodoCommentReactionResponse createTodoCommentReactionResponse) throws IOException {
            protoWriter.writeBytes(createTodoCommentReactionResponse.unknownFields());
        }
    }

    public CreateTodoCommentReactionResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.todo_comments.CreateTodoCommentReactionResponse$a */
    public static final class C50080a extends Message.Builder<CreateTodoCommentReactionResponse, C50080a> {
        /* renamed from: a */
        public CreateTodoCommentReactionResponse build() {
            return new CreateTodoCommentReactionResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50080a newBuilder() {
        C50080a aVar = new C50080a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "CreateTodoCommentReactionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTodoCommentReactionResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
