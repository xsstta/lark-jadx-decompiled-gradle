package com.ss.android.lark.pb.todo_comments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteTodoCommentReactionRequest extends Message<DeleteTodoCommentReactionRequest, C50082a> {
    public static final ProtoAdapter<DeleteTodoCommentReactionRequest> ADAPTER = new C50083b();
    private static final long serialVersionUID = 0;
    public final String mcomment_id;
    public final String mreaction_type;
    public final String mtodo_guid;

    /* renamed from: com.ss.android.lark.pb.todo_comments.DeleteTodoCommentReactionRequest$b */
    private static final class C50083b extends ProtoAdapter<DeleteTodoCommentReactionRequest> {
        C50083b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteTodoCommentReactionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteTodoCommentReactionRequest deleteTodoCommentReactionRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (deleteTodoCommentReactionRequest.mtodo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteTodoCommentReactionRequest.mtodo_guid);
            } else {
                i = 0;
            }
            if (deleteTodoCommentReactionRequest.mcomment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, deleteTodoCommentReactionRequest.mcomment_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (deleteTodoCommentReactionRequest.mreaction_type != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, deleteTodoCommentReactionRequest.mreaction_type);
            }
            return i4 + i3 + deleteTodoCommentReactionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteTodoCommentReactionRequest decode(ProtoReader protoReader) throws IOException {
            C50082a aVar = new C50082a();
            aVar.f125201a = "";
            aVar.f125202b = "";
            aVar.f125203c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125201a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125202b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125203c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteTodoCommentReactionRequest deleteTodoCommentReactionRequest) throws IOException {
            if (deleteTodoCommentReactionRequest.mtodo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteTodoCommentReactionRequest.mtodo_guid);
            }
            if (deleteTodoCommentReactionRequest.mcomment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteTodoCommentReactionRequest.mcomment_id);
            }
            if (deleteTodoCommentReactionRequest.mreaction_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, deleteTodoCommentReactionRequest.mreaction_type);
            }
            protoWriter.writeBytes(deleteTodoCommentReactionRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.todo_comments.DeleteTodoCommentReactionRequest$a */
    public static final class C50082a extends Message.Builder<DeleteTodoCommentReactionRequest, C50082a> {

        /* renamed from: a */
        public String f125201a;

        /* renamed from: b */
        public String f125202b;

        /* renamed from: c */
        public String f125203c;

        /* renamed from: a */
        public DeleteTodoCommentReactionRequest build() {
            return new DeleteTodoCommentReactionRequest(this.f125201a, this.f125202b, this.f125203c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50082a newBuilder() {
        C50082a aVar = new C50082a();
        aVar.f125201a = this.mtodo_guid;
        aVar.f125202b = this.mcomment_id;
        aVar.f125203c = this.mreaction_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtodo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.mtodo_guid);
        }
        if (this.mcomment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.mcomment_id);
        }
        if (this.mreaction_type != null) {
            sb.append(", reaction_type=");
            sb.append(this.mreaction_type);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteTodoCommentReactionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteTodoCommentReactionRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public DeleteTodoCommentReactionRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtodo_guid = str;
        this.mcomment_id = str2;
        this.mreaction_type = str3;
    }
}
