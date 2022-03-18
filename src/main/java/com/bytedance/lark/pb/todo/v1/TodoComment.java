package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.huawei.hms.android.HwBuildEx;
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

public final class TodoComment extends Message<TodoComment, C19645a> {
    public static final ProtoAdapter<TodoComment> ADAPTER = new C19646b();
    public static final Long DEFAULT_CREATE_MILLI_TIME = 0L;
    public static final FromType DEFAULT_FROM_TYPE = FromType.UNKNOWN_FROM_TYPE;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Status DEFAULT_STATUS = Status.UNKNOWN_STATUS;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN_TYPE;
    public static final Long DEFAULT_UPDATE_MILLI_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<TodoAttachment> attachments;
    public final String cid;
    public final Long create_milli_time;
    public final FromType from_type;
    public final TodoUser from_user;
    public final String id;
    public final Integer position;
    public final List<TodoCommentReaction> reactions;
    public final String reply_parent_id;
    public final String reply_root_id;
    public final RichContent rich_content;
    public final Status status;
    public final Type type;
    public final Long update_milli_time;

    public enum FromType implements WireEnum {
        UNKNOWN_FROM_TYPE(0),
        USER(1);
        
        public static final ProtoAdapter<FromType> ADAPTER = ProtoAdapter.newEnumAdapter(FromType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FromType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_FROM_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return USER;
        }

        private FromType(int i) {
            this.value = i;
        }
    }

    public enum Status implements WireEnum {
        UNKNOWN_STATUS(0),
        NORMAL(1),
        EDITED(2),
        DELETED(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return EDITED;
            }
            if (i != 3) {
                return null;
            }
            return DELETED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        RICH_TEXT(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return RICH_TEXT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoComment$b */
    private static final class C19646b extends ProtoAdapter<TodoComment> {
        C19646b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoComment.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoComment todoComment) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 0;
            if (todoComment.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoComment.id);
            } else {
                i = 0;
            }
            if (todoComment.rich_content != null) {
                i2 = RichContent.ADAPTER.encodedSizeWithTag(2, todoComment.rich_content);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (todoComment.from_type != null) {
                i3 = FromType.ADAPTER.encodedSizeWithTag(3, todoComment.from_type);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (todoComment.from_user != null) {
                i4 = TodoUser.ADAPTER.encodedSizeWithTag(4, todoComment.from_user);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (todoComment.status != null) {
                i5 = Status.ADAPTER.encodedSizeWithTag(5, todoComment.status);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (todoComment.create_milli_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, todoComment.create_milli_time);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (todoComment.update_milli_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, todoComment.update_milli_time);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (todoComment.reply_parent_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, todoComment.reply_parent_id);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (todoComment.reply_root_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, todoComment.reply_root_id);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (todoComment.position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(10, todoComment.position);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (todoComment.cid != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, todoComment.cid);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (todoComment.type != null) {
                i12 = Type.ADAPTER.encodedSizeWithTag(12, todoComment.type);
            }
            return i22 + i12 + TodoAttachment.ADAPTER.asRepeated().encodedSizeWithTag(13, todoComment.attachments) + TodoCommentReaction.ADAPTER.asRepeated().encodedSizeWithTag(14, todoComment.reactions) + todoComment.unknownFields().size();
        }

        /* renamed from: a */
        public TodoComment decode(ProtoReader protoReader) throws IOException {
            C19645a aVar = new C19645a();
            aVar.f48061a = "";
            aVar.f48063c = FromType.UNKNOWN_FROM_TYPE;
            aVar.f48065e = Status.UNKNOWN_STATUS;
            aVar.f48066f = 0L;
            aVar.f48067g = 0L;
            aVar.f48068h = "";
            aVar.f48069i = "";
            aVar.f48070j = 0;
            aVar.f48071k = "";
            aVar.f48072l = Type.UNKNOWN_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48061a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f48062b = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f48063c = FromType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f48064d = TodoUser.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f48065e = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f48066f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f48067g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f48068h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f48069i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f48070j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f48071k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f48072l = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 13:
                            aVar.f48073m.add(TodoAttachment.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            aVar.f48074n.add(TodoCommentReaction.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, TodoComment todoComment) throws IOException {
            if (todoComment.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoComment.id);
            }
            if (todoComment.rich_content != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 2, todoComment.rich_content);
            }
            if (todoComment.from_type != null) {
                FromType.ADAPTER.encodeWithTag(protoWriter, 3, todoComment.from_type);
            }
            if (todoComment.from_user != null) {
                TodoUser.ADAPTER.encodeWithTag(protoWriter, 4, todoComment.from_user);
            }
            if (todoComment.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 5, todoComment.status);
            }
            if (todoComment.create_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, todoComment.create_milli_time);
            }
            if (todoComment.update_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, todoComment.update_milli_time);
            }
            if (todoComment.reply_parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, todoComment.reply_parent_id);
            }
            if (todoComment.reply_root_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, todoComment.reply_root_id);
            }
            if (todoComment.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, todoComment.position);
            }
            if (todoComment.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, todoComment.cid);
            }
            if (todoComment.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 12, todoComment.type);
            }
            TodoAttachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, todoComment.attachments);
            TodoCommentReaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, todoComment.reactions);
            protoWriter.writeBytes(todoComment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoComment$a */
    public static final class C19645a extends Message.Builder<TodoComment, C19645a> {

        /* renamed from: a */
        public String f48061a;

        /* renamed from: b */
        public RichContent f48062b;

        /* renamed from: c */
        public FromType f48063c;

        /* renamed from: d */
        public TodoUser f48064d;

        /* renamed from: e */
        public Status f48065e;

        /* renamed from: f */
        public Long f48066f;

        /* renamed from: g */
        public Long f48067g;

        /* renamed from: h */
        public String f48068h;

        /* renamed from: i */
        public String f48069i;

        /* renamed from: j */
        public Integer f48070j;

        /* renamed from: k */
        public String f48071k;

        /* renamed from: l */
        public Type f48072l;

        /* renamed from: m */
        public List<TodoAttachment> f48073m = Internal.newMutableList();

        /* renamed from: n */
        public List<TodoCommentReaction> f48074n = Internal.newMutableList();

        /* renamed from: a */
        public TodoComment build() {
            return new TodoComment(this.f48061a, this.f48062b, this.f48063c, this.f48064d, this.f48065e, this.f48066f, this.f48067g, this.f48068h, this.f48069i, this.f48070j, this.f48071k, this.f48072l, this.f48073m, this.f48074n, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19645a mo66654a(RichContent richContent) {
            this.f48062b = richContent;
            return this;
        }

        /* renamed from: a */
        public C19645a mo66655a(String str) {
            this.f48061a = str;
            return this;
        }

        /* renamed from: a */
        public C19645a mo66656a(List<TodoAttachment> list) {
            Internal.checkElementsNotNull(list);
            this.f48073m = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19645a newBuilder() {
        C19645a aVar = new C19645a();
        aVar.f48061a = this.id;
        aVar.f48062b = this.rich_content;
        aVar.f48063c = this.from_type;
        aVar.f48064d = this.from_user;
        aVar.f48065e = this.status;
        aVar.f48066f = this.create_milli_time;
        aVar.f48067g = this.update_milli_time;
        aVar.f48068h = this.reply_parent_id;
        aVar.f48069i = this.reply_root_id;
        aVar.f48070j = this.position;
        aVar.f48071k = this.cid;
        aVar.f48072l = this.type;
        aVar.f48073m = Internal.copyOf("attachments", this.attachments);
        aVar.f48074n = Internal.copyOf("reactions", this.reactions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoComment");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.rich_content != null) {
            sb.append(", rich_content=");
            sb.append(this.rich_content);
        }
        if (this.from_type != null) {
            sb.append(", from_type=");
            sb.append(this.from_type);
        }
        if (this.from_user != null) {
            sb.append(", from_user=");
            sb.append(this.from_user);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.create_milli_time != null) {
            sb.append(", create_milli_time=");
            sb.append(this.create_milli_time);
        }
        if (this.update_milli_time != null) {
            sb.append(", update_milli_time=");
            sb.append(this.update_milli_time);
        }
        if (this.reply_parent_id != null) {
            sb.append(", reply_parent_id=");
            sb.append(this.reply_parent_id);
        }
        if (this.reply_root_id != null) {
            sb.append(", reply_root_id=");
            sb.append(this.reply_root_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (!this.reactions.isEmpty()) {
            sb.append(", reactions=");
            sb.append(this.reactions);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoComment{");
        replace.append('}');
        return replace.toString();
    }

    public TodoComment(String str, RichContent richContent, FromType fromType, TodoUser todoUser, Status status2, Long l, Long l2, String str2, String str3, Integer num, String str4, Type type2, List<TodoAttachment> list, List<TodoCommentReaction> list2) {
        this(str, richContent, fromType, todoUser, status2, l, l2, str2, str3, num, str4, type2, list, list2, ByteString.EMPTY);
    }

    public TodoComment(String str, RichContent richContent, FromType fromType, TodoUser todoUser, Status status2, Long l, Long l2, String str2, String str3, Integer num, String str4, Type type2, List<TodoAttachment> list, List<TodoCommentReaction> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.rich_content = richContent;
        this.from_type = fromType;
        this.from_user = todoUser;
        this.status = status2;
        this.create_milli_time = l;
        this.update_milli_time = l2;
        this.reply_parent_id = str2;
        this.reply_root_id = str3;
        this.position = num;
        this.cid = str4;
        this.type = type2;
        this.attachments = Internal.immutableCopyOf("attachments", list);
        this.reactions = Internal.immutableCopyOf("reactions", list2);
    }
}
