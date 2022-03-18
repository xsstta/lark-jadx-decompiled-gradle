package com.ss.android.lark.pb.todo_comments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteTodoCommentReactionResponse extends Message<DeleteTodoCommentReactionResponse, C50084a> {
    public static final ProtoAdapter<DeleteTodoCommentReactionResponse> ADAPTER = new C50085b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.todo_comments.DeleteTodoCommentReactionResponse$b */
    private static final class C50085b extends ProtoAdapter<DeleteTodoCommentReactionResponse> {
        C50085b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteTodoCommentReactionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteTodoCommentReactionResponse deleteTodoCommentReactionResponse) {
            return deleteTodoCommentReactionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteTodoCommentReactionResponse decode(ProtoReader protoReader) throws IOException {
            C50084a aVar = new C50084a();
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
        public void encode(ProtoWriter protoWriter, DeleteTodoCommentReactionResponse deleteTodoCommentReactionResponse) throws IOException {
            protoWriter.writeBytes(deleteTodoCommentReactionResponse.unknownFields());
        }
    }

    public DeleteTodoCommentReactionResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.todo_comments.DeleteTodoCommentReactionResponse$a */
    public static final class C50084a extends Message.Builder<DeleteTodoCommentReactionResponse, C50084a> {
        /* renamed from: a */
        public DeleteTodoCommentReactionResponse build() {
            return new DeleteTodoCommentReactionResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50084a newBuilder() {
        C50084a aVar = new C50084a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteTodoCommentReactionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteTodoCommentReactionResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
