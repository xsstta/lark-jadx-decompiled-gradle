package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateCommentRequest extends Message<CreateCommentRequest, C19477a> {
    public static final ProtoAdapter<CreateCommentRequest> ADAPTER = new C19478b();
    public static final TodoComment.Type DEFAULT_TYPE = TodoComment.Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final List<TodoAttachment> attachments;
    public final String cid;
    public final RichContent content;
    public final String reply_parent_id;
    public final String reply_root_id;
    public final String todo_guid;
    public final TodoComment.Type type;

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateCommentRequest$b */
    private static final class C19478b extends ProtoAdapter<CreateCommentRequest> {
        C19478b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCommentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCommentRequest createCommentRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (createCommentRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createCommentRequest.todo_guid);
            } else {
                i = 0;
            }
            if (createCommentRequest.content != null) {
                i2 = RichContent.ADAPTER.encodedSizeWithTag(2, createCommentRequest.content);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (createCommentRequest.reply_parent_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, createCommentRequest.reply_parent_id);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (createCommentRequest.reply_root_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, createCommentRequest.reply_root_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (createCommentRequest.cid != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, createCommentRequest.cid);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i9 + i5 + TodoAttachment.ADAPTER.asRepeated().encodedSizeWithTag(6, createCommentRequest.attachments);
            if (createCommentRequest.type != null) {
                i6 = TodoComment.Type.ADAPTER.encodedSizeWithTag(7, createCommentRequest.type);
            }
            return encodedSizeWithTag + i6 + createCommentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCommentRequest decode(ProtoReader protoReader) throws IOException {
            C19477a aVar = new C19477a();
            aVar.f47826a = "";
            aVar.f47828c = "";
            aVar.f47829d = "";
            aVar.f47830e = "";
            aVar.f47832g = TodoComment.Type.UNKNOWN_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47826a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47827b = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47828c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47829d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47830e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47831f.add(TodoAttachment.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            try {
                                aVar.f47832g = TodoComment.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCommentRequest createCommentRequest) throws IOException {
            if (createCommentRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createCommentRequest.todo_guid);
            }
            if (createCommentRequest.content != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 2, createCommentRequest.content);
            }
            if (createCommentRequest.reply_parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createCommentRequest.reply_parent_id);
            }
            if (createCommentRequest.reply_root_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createCommentRequest.reply_root_id);
            }
            if (createCommentRequest.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, createCommentRequest.cid);
            }
            TodoAttachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, createCommentRequest.attachments);
            if (createCommentRequest.type != null) {
                TodoComment.Type.ADAPTER.encodeWithTag(protoWriter, 7, createCommentRequest.type);
            }
            protoWriter.writeBytes(createCommentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateCommentRequest$a */
    public static final class C19477a extends Message.Builder<CreateCommentRequest, C19477a> {

        /* renamed from: a */
        public String f47826a;

        /* renamed from: b */
        public RichContent f47827b;

        /* renamed from: c */
        public String f47828c;

        /* renamed from: d */
        public String f47829d;

        /* renamed from: e */
        public String f47830e;

        /* renamed from: f */
        public List<TodoAttachment> f47831f = Internal.newMutableList();

        /* renamed from: g */
        public TodoComment.Type f47832g;

        /* renamed from: a */
        public CreateCommentRequest build() {
            return new CreateCommentRequest(this.f47826a, this.f47827b, this.f47828c, this.f47829d, this.f47830e, this.f47831f, this.f47832g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19477a newBuilder() {
        C19477a aVar = new C19477a();
        aVar.f47826a = this.todo_guid;
        aVar.f47827b = this.content;
        aVar.f47828c = this.reply_parent_id;
        aVar.f47829d = this.reply_root_id;
        aVar.f47830e = this.cid;
        aVar.f47831f = Internal.copyOf("attachments", this.attachments);
        aVar.f47832g = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "CreateCommentRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.reply_parent_id != null) {
            sb.append(", reply_parent_id=");
            sb.append(this.reply_parent_id);
        }
        if (this.reply_root_id != null) {
            sb.append(", reply_root_id=");
            sb.append(this.reply_root_id);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCommentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCommentRequest(String str, RichContent richContent, String str2, String str3, String str4, List<TodoAttachment> list, TodoComment.Type type2) {
        this(str, richContent, str2, str3, str4, list, type2, ByteString.EMPTY);
    }

    public CreateCommentRequest(String str, RichContent richContent, String str2, String str3, String str4, List<TodoAttachment> list, TodoComment.Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.content = richContent;
        this.reply_parent_id = str2;
        this.reply_root_id = str3;
        this.cid = str4;
        this.attachments = Internal.immutableCopyOf("attachments", list);
        this.type = type2;
    }
}
