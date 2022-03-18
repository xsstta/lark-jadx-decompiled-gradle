package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteCommentRequest extends Message<DeleteCommentRequest, C19491a> {
    public static final ProtoAdapter<DeleteCommentRequest> ADAPTER = new C19492b();
    private static final long serialVersionUID = 0;
    public final String comment_id;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteCommentRequest$b */
    private static final class C19492b extends ProtoAdapter<DeleteCommentRequest> {
        C19492b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteCommentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteCommentRequest deleteCommentRequest) {
            int i;
            int i2 = 0;
            if (deleteCommentRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteCommentRequest.todo_guid);
            } else {
                i = 0;
            }
            if (deleteCommentRequest.comment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, deleteCommentRequest.comment_id);
            }
            return i + i2 + deleteCommentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteCommentRequest decode(ProtoReader protoReader) throws IOException {
            C19491a aVar = new C19491a();
            aVar.f47845a = "";
            aVar.f47846b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47845a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47846b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteCommentRequest deleteCommentRequest) throws IOException {
            if (deleteCommentRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteCommentRequest.todo_guid);
            }
            if (deleteCommentRequest.comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteCommentRequest.comment_id);
            }
            protoWriter.writeBytes(deleteCommentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteCommentRequest$a */
    public static final class C19491a extends Message.Builder<DeleteCommentRequest, C19491a> {

        /* renamed from: a */
        public String f47845a;

        /* renamed from: b */
        public String f47846b;

        /* renamed from: a */
        public DeleteCommentRequest build() {
            return new DeleteCommentRequest(this.f47845a, this.f47846b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19491a newBuilder() {
        C19491a aVar = new C19491a();
        aVar.f47845a = this.todo_guid;
        aVar.f47846b = this.comment_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "DeleteCommentRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteCommentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteCommentRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DeleteCommentRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.comment_id = str2;
    }
}
