package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteCommentDraftRequest extends Message<DeleteCommentDraftRequest, C19489a> {
    public static final ProtoAdapter<DeleteCommentDraftRequest> ADAPTER = new C19490b();
    private static final long serialVersionUID = 0;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteCommentDraftRequest$b */
    private static final class C19490b extends ProtoAdapter<DeleteCommentDraftRequest> {
        C19490b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteCommentDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteCommentDraftRequest deleteCommentDraftRequest) {
            int i;
            if (deleteCommentDraftRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteCommentDraftRequest.todo_guid);
            } else {
                i = 0;
            }
            return i + deleteCommentDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteCommentDraftRequest decode(ProtoReader protoReader) throws IOException {
            C19489a aVar = new C19489a();
            aVar.f47844a = "";
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
                    aVar.f47844a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteCommentDraftRequest deleteCommentDraftRequest) throws IOException {
            if (deleteCommentDraftRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteCommentDraftRequest.todo_guid);
            }
            protoWriter.writeBytes(deleteCommentDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteCommentDraftRequest$a */
    public static final class C19489a extends Message.Builder<DeleteCommentDraftRequest, C19489a> {

        /* renamed from: a */
        public String f47844a;

        /* renamed from: a */
        public DeleteCommentDraftRequest build() {
            return new DeleteCommentDraftRequest(this.f47844a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19489a newBuilder() {
        C19489a aVar = new C19489a();
        aVar.f47844a = this.todo_guid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "DeleteCommentDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteCommentDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteCommentDraftRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteCommentDraftRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
    }
}
