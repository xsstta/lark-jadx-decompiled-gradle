package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpdateCommentRequest extends Message<UpdateCommentRequest, C19675a> {
    public static final ProtoAdapter<UpdateCommentRequest> ADAPTER = new C19676b();
    private static final long serialVersionUID = 0;
    public final List<TodoAttachment> attachments;
    public final String comment_id;
    public final RichContent content;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateCommentRequest$b */
    private static final class C19676b extends ProtoAdapter<UpdateCommentRequest> {
        C19676b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateCommentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateCommentRequest updateCommentRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (updateCommentRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateCommentRequest.todo_guid);
            } else {
                i = 0;
            }
            if (updateCommentRequest.comment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, updateCommentRequest.comment_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (updateCommentRequest.content != null) {
                i3 = RichContent.ADAPTER.encodedSizeWithTag(3, updateCommentRequest.content);
            }
            return i4 + i3 + TodoAttachment.ADAPTER.asRepeated().encodedSizeWithTag(4, updateCommentRequest.attachments) + updateCommentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateCommentRequest decode(ProtoReader protoReader) throws IOException {
            C19675a aVar = new C19675a();
            aVar.f48120a = "";
            aVar.f48121b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48120a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48121b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48122c = RichContent.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48123d.add(TodoAttachment.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateCommentRequest updateCommentRequest) throws IOException {
            if (updateCommentRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateCommentRequest.todo_guid);
            }
            if (updateCommentRequest.comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateCommentRequest.comment_id);
            }
            if (updateCommentRequest.content != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 3, updateCommentRequest.content);
            }
            TodoAttachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, updateCommentRequest.attachments);
            protoWriter.writeBytes(updateCommentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateCommentRequest$a */
    public static final class C19675a extends Message.Builder<UpdateCommentRequest, C19675a> {

        /* renamed from: a */
        public String f48120a;

        /* renamed from: b */
        public String f48121b;

        /* renamed from: c */
        public RichContent f48122c;

        /* renamed from: d */
        public List<TodoAttachment> f48123d = Internal.newMutableList();

        /* renamed from: a */
        public UpdateCommentRequest build() {
            return new UpdateCommentRequest(this.f48120a, this.f48121b, this.f48122c, this.f48123d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19675a newBuilder() {
        C19675a aVar = new C19675a();
        aVar.f48120a = this.todo_guid;
        aVar.f48121b = this.comment_id;
        aVar.f48122c = this.content;
        aVar.f48123d = Internal.copyOf("attachments", this.attachments);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "UpdateCommentRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateCommentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateCommentRequest(String str, String str2, RichContent richContent, List<TodoAttachment> list) {
        this(str, str2, richContent, list, ByteString.EMPTY);
    }

    public UpdateCommentRequest(String str, String str2, RichContent richContent, List<TodoAttachment> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.comment_id = str2;
        this.content = richContent;
        this.attachments = Internal.immutableCopyOf("attachments", list);
    }
}
