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

public final class CreateCommentInfo extends Message<CreateCommentInfo, C19475a> {
    public static final ProtoAdapter<CreateCommentInfo> ADAPTER = new C19476b();
    public static final TodoComment.Type DEFAULT_TYPE = TodoComment.Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final List<TodoAttachment> attachments;
    public final String cid;
    public final RichContent content;
    public final String reply_parent_id;
    public final String reply_root_id;
    public final TodoComment.Type type;

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateCommentInfo$b */
    private static final class C19476b extends ProtoAdapter<CreateCommentInfo> {
        C19476b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCommentInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCommentInfo createCommentInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (createCommentInfo.content != null) {
                i = RichContent.ADAPTER.encodedSizeWithTag(1, createCommentInfo.content);
            } else {
                i = 0;
            }
            if (createCommentInfo.reply_parent_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, createCommentInfo.reply_parent_id);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (createCommentInfo.reply_root_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, createCommentInfo.reply_root_id);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (createCommentInfo.cid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, createCommentInfo.cid);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i7 + i4 + TodoAttachment.ADAPTER.asRepeated().encodedSizeWithTag(5, createCommentInfo.attachments);
            if (createCommentInfo.type != null) {
                i5 = TodoComment.Type.ADAPTER.encodedSizeWithTag(6, createCommentInfo.type);
            }
            return encodedSizeWithTag + i5 + createCommentInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCommentInfo decode(ProtoReader protoReader) throws IOException {
            C19475a aVar = new C19475a();
            aVar.f47821b = "";
            aVar.f47822c = "";
            aVar.f47823d = "";
            aVar.f47825f = TodoComment.Type.UNKNOWN_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47820a = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47821b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47822c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47823d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47824e.add(TodoAttachment.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            try {
                                aVar.f47825f = TodoComment.Type.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CreateCommentInfo createCommentInfo) throws IOException {
            if (createCommentInfo.content != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 1, createCommentInfo.content);
            }
            if (createCommentInfo.reply_parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createCommentInfo.reply_parent_id);
            }
            if (createCommentInfo.reply_root_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createCommentInfo.reply_root_id);
            }
            if (createCommentInfo.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createCommentInfo.cid);
            }
            TodoAttachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, createCommentInfo.attachments);
            if (createCommentInfo.type != null) {
                TodoComment.Type.ADAPTER.encodeWithTag(protoWriter, 6, createCommentInfo.type);
            }
            protoWriter.writeBytes(createCommentInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateCommentInfo$a */
    public static final class C19475a extends Message.Builder<CreateCommentInfo, C19475a> {

        /* renamed from: a */
        public RichContent f47820a;

        /* renamed from: b */
        public String f47821b;

        /* renamed from: c */
        public String f47822c;

        /* renamed from: d */
        public String f47823d;

        /* renamed from: e */
        public List<TodoAttachment> f47824e = Internal.newMutableList();

        /* renamed from: f */
        public TodoComment.Type f47825f;

        /* renamed from: a */
        public CreateCommentInfo build() {
            return new CreateCommentInfo(this.f47820a, this.f47821b, this.f47822c, this.f47823d, this.f47824e, this.f47825f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19475a newBuilder() {
        C19475a aVar = new C19475a();
        aVar.f47820a = this.content;
        aVar.f47821b = this.reply_parent_id;
        aVar.f47822c = this.reply_root_id;
        aVar.f47823d = this.cid;
        aVar.f47824e = Internal.copyOf("attachments", this.attachments);
        aVar.f47825f = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "CreateCommentInfo");
        StringBuilder sb = new StringBuilder();
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
        StringBuilder replace = sb.replace(0, 2, "CreateCommentInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCommentInfo(RichContent richContent, String str, String str2, String str3, List<TodoAttachment> list, TodoComment.Type type2) {
        this(richContent, str, str2, str3, list, type2, ByteString.EMPTY);
    }

    public CreateCommentInfo(RichContent richContent, String str, String str2, String str3, List<TodoAttachment> list, TodoComment.Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content = richContent;
        this.reply_parent_id = str;
        this.reply_root_id = str2;
        this.cid = str3;
        this.attachments = Internal.immutableCopyOf("attachments", list);
        this.type = type2;
    }
}
