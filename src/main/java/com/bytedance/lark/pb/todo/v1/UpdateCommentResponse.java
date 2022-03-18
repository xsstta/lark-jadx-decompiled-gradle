package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateCommentResponse extends Message<UpdateCommentResponse, C19677a> {
    public static final ProtoAdapter<UpdateCommentResponse> ADAPTER = new C19678b();
    private static final long serialVersionUID = 0;
    public final TodoComment comment;

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateCommentResponse$b */
    private static final class C19678b extends ProtoAdapter<UpdateCommentResponse> {
        C19678b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateCommentResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateCommentResponse updateCommentResponse) {
            int i;
            if (updateCommentResponse.comment != null) {
                i = TodoComment.ADAPTER.encodedSizeWithTag(1, updateCommentResponse.comment);
            } else {
                i = 0;
            }
            return i + updateCommentResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateCommentResponse decode(ProtoReader protoReader) throws IOException {
            C19677a aVar = new C19677a();
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
                    aVar.f48124a = TodoComment.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateCommentResponse updateCommentResponse) throws IOException {
            if (updateCommentResponse.comment != null) {
                TodoComment.ADAPTER.encodeWithTag(protoWriter, 1, updateCommentResponse.comment);
            }
            protoWriter.writeBytes(updateCommentResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateCommentResponse$a */
    public static final class C19677a extends Message.Builder<UpdateCommentResponse, C19677a> {

        /* renamed from: a */
        public TodoComment f48124a;

        /* renamed from: a */
        public UpdateCommentResponse build() {
            return new UpdateCommentResponse(this.f48124a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19677a newBuilder() {
        C19677a aVar = new C19677a();
        aVar.f48124a = this.comment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "UpdateCommentResponse");
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateCommentResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateCommentResponse(TodoComment todoComment) {
        this(todoComment, ByteString.EMPTY);
    }

    public UpdateCommentResponse(TodoComment todoComment, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = todoComment;
    }
}
