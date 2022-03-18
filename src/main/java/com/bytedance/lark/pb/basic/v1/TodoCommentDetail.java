package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.todo.v1.TodoCommentReaction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class TodoCommentDetail extends Message<TodoCommentDetail, C15332a> {
    public static final ProtoAdapter<TodoCommentDetail> ADAPTER = new C15333b();
    public static final TodoCommentType DEFAULT_COMMENT_TYPE = TodoCommentType.UNKNOWN_TYPE;
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final List<TodoAttachmentInfo> attachments;
    public final String comment_id;
    public final TodoCommentType comment_type;
    public final TodoCommentReaction newly_added_reaction;
    public final Integer position;
    public final RichContent rich_content;

    public enum TodoCommentType implements WireEnum {
        UNKNOWN_TYPE(0),
        RICH_TEXT(1);
        
        public static final ProtoAdapter<TodoCommentType> ADAPTER = ProtoAdapter.newEnumAdapter(TodoCommentType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TodoCommentType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return RICH_TEXT;
        }

        private TodoCommentType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoCommentDetail$b */
    private static final class C15333b extends ProtoAdapter<TodoCommentDetail> {
        C15333b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoCommentDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoCommentDetail todoCommentDetail) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (todoCommentDetail.comment_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoCommentDetail.comment_id);
            } else {
                i = 0;
            }
            if (todoCommentDetail.comment_type != null) {
                i2 = TodoCommentType.ADAPTER.encodedSizeWithTag(2, todoCommentDetail.comment_type);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (todoCommentDetail.rich_content != null) {
                i3 = RichContent.ADAPTER.encodedSizeWithTag(3, todoCommentDetail.rich_content);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (todoCommentDetail.position != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, todoCommentDetail.position);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i7 + i4 + TodoAttachmentInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, todoCommentDetail.attachments);
            if (todoCommentDetail.newly_added_reaction != null) {
                i5 = TodoCommentReaction.ADAPTER.encodedSizeWithTag(6, todoCommentDetail.newly_added_reaction);
            }
            return encodedSizeWithTag + i5 + todoCommentDetail.unknownFields().size();
        }

        /* renamed from: a */
        public TodoCommentDetail decode(ProtoReader protoReader) throws IOException {
            C15332a aVar = new C15332a();
            aVar.f40609a = "";
            aVar.f40610b = TodoCommentType.UNKNOWN_TYPE;
            aVar.f40612d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40609a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f40610b = TodoCommentType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f40611c = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40612d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40613e.add(TodoAttachmentInfo.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f40614f = TodoCommentReaction.ADAPTER.decode(protoReader);
                            break;
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
        public void encode(ProtoWriter protoWriter, TodoCommentDetail todoCommentDetail) throws IOException {
            if (todoCommentDetail.comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoCommentDetail.comment_id);
            }
            if (todoCommentDetail.comment_type != null) {
                TodoCommentType.ADAPTER.encodeWithTag(protoWriter, 2, todoCommentDetail.comment_type);
            }
            if (todoCommentDetail.rich_content != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 3, todoCommentDetail.rich_content);
            }
            if (todoCommentDetail.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, todoCommentDetail.position);
            }
            TodoAttachmentInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, todoCommentDetail.attachments);
            if (todoCommentDetail.newly_added_reaction != null) {
                TodoCommentReaction.ADAPTER.encodeWithTag(protoWriter, 6, todoCommentDetail.newly_added_reaction);
            }
            protoWriter.writeBytes(todoCommentDetail.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoCommentDetail$a */
    public static final class C15332a extends Message.Builder<TodoCommentDetail, C15332a> {

        /* renamed from: a */
        public String f40609a;

        /* renamed from: b */
        public TodoCommentType f40610b;

        /* renamed from: c */
        public RichContent f40611c;

        /* renamed from: d */
        public Integer f40612d;

        /* renamed from: e */
        public List<TodoAttachmentInfo> f40613e = Internal.newMutableList();

        /* renamed from: f */
        public TodoCommentReaction f40614f;

        /* renamed from: a */
        public TodoCommentDetail build() {
            return new TodoCommentDetail(this.f40609a, this.f40610b, this.f40611c, this.f40612d, this.f40613e, this.f40614f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15332a newBuilder() {
        C15332a aVar = new C15332a();
        aVar.f40609a = this.comment_id;
        aVar.f40610b = this.comment_type;
        aVar.f40611c = this.rich_content;
        aVar.f40612d = this.position;
        aVar.f40613e = Internal.copyOf("attachments", this.attachments);
        aVar.f40614f = this.newly_added_reaction;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TodoCommentDetail");
        StringBuilder sb = new StringBuilder();
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (this.comment_type != null) {
            sb.append(", comment_type=");
            sb.append(this.comment_type);
        }
        if (this.rich_content != null) {
            sb.append(", rich_content=");
            sb.append(this.rich_content);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (this.newly_added_reaction != null) {
            sb.append(", newly_added_reaction=");
            sb.append(this.newly_added_reaction);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoCommentDetail{");
        replace.append('}');
        return replace.toString();
    }

    public TodoCommentDetail(String str, TodoCommentType todoCommentType, RichContent richContent, Integer num, List<TodoAttachmentInfo> list, TodoCommentReaction todoCommentReaction) {
        this(str, todoCommentType, richContent, num, list, todoCommentReaction, ByteString.EMPTY);
    }

    public TodoCommentDetail(String str, TodoCommentType todoCommentType, RichContent richContent, Integer num, List<TodoAttachmentInfo> list, TodoCommentReaction todoCommentReaction, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment_id = str;
        this.comment_type = todoCommentType;
        this.rich_content = richContent;
        this.position = num;
        this.attachments = Internal.immutableCopyOf("attachments", list);
        this.newly_added_reaction = todoCommentReaction;
    }
}
