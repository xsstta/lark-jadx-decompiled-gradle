package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.todo.v1.TodoUser;
import com.huawei.hms.adapter.internal.AvailableCode;
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

public final class TodoOperationContent extends Message<TodoOperationContent, C15340a> {
    public static final ProtoAdapter<TodoOperationContent> ADAPTER = new C15341b();
    public static final CompleteType DEFAULT_COMPLETE_TYPE = CompleteType.UNKNOWN_COMPLETE_TYPE;
    public static final MsgStatus DEFAULT_MSG_STATUS = MsgStatus.ACTIVE;
    public static final Type DEFAULT_OPERATION_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final CompleteType complete_type;
    public final TodoDailyRemind daily_remind;
    public final MsgStatus msg_status;
    public final Type operation_type;
    public final TodoUser operator;
    public final List<TodoUser> target_users;
    public final TodoCommentDetail todo_comment_detail;
    public final TodoDetail todo_detail;
    public final List<UpdateField> update_fields;

    public enum CompleteType implements WireEnum {
        UNKNOWN_COMPLETE_TYPE(0),
        COMPLETE_WHOLE_TODO(1),
        COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEE_SELF(2),
        COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEES(3),
        COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEE_YOURSELF(4),
        COMPLETE_WHOLE_TODO_AFTER_COMPLETE_ASSIGNEES(5),
        COMPLETE_WHOLE_TODO_AFTER_COMPLETE_ASSIGNEE_YOURSELF(6),
        RESTORE_WHOLE_TODO(21),
        RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEE_SELF(22),
        RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEES(23),
        RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEES_YOURSELF(24),
        RESTORE_WHOLE_TODO_AFTER_RESTORE_SELF(25),
        RESTORE_WHOLE_TODO_AFTER_RESTORE_ASSIGNEE(26),
        RESTORE_WHOLE_TODO_AFTER_RESTORE_ASSIGNEE_YOURSELF(27);
        
        public static final ProtoAdapter<CompleteType> ADAPTER = ProtoAdapter.newEnumAdapter(CompleteType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CompleteType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_COMPLETE_TYPE;
                case 1:
                    return COMPLETE_WHOLE_TODO;
                case 2:
                    return COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEE_SELF;
                case 3:
                    return COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEES;
                case 4:
                    return COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEE_YOURSELF;
                case 5:
                    return COMPLETE_WHOLE_TODO_AFTER_COMPLETE_ASSIGNEES;
                case 6:
                    return COMPLETE_WHOLE_TODO_AFTER_COMPLETE_ASSIGNEE_YOURSELF;
                default:
                    switch (i) {
                        case 21:
                            return RESTORE_WHOLE_TODO;
                        case 22:
                            return RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEE_SELF;
                        case 23:
                            return RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEES;
                        case 24:
                            return RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEES_YOURSELF;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            return RESTORE_WHOLE_TODO_AFTER_RESTORE_SELF;
                        case 26:
                            return RESTORE_WHOLE_TODO_AFTER_RESTORE_ASSIGNEE;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            return RESTORE_WHOLE_TODO_AFTER_RESTORE_ASSIGNEE_YOURSELF;
                        default:
                            return null;
                    }
            }
        }

        private CompleteType(int i) {
            this.value = i;
        }
    }

    public enum MsgStatus implements WireEnum {
        ACTIVE(0),
        DELETED(1);
        
        public static final ProtoAdapter<MsgStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MsgStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MsgStatus fromValue(int i) {
            if (i == 0) {
                return ACTIVE;
            }
            if (i != 1) {
                return null;
            }
            return DELETED;
        }

        private MsgStatus(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        UPDATE(1),
        ASSIGN(2),
        COMPLETE(3),
        CANCEL(4),
        DELETE(5),
        CREATE(6),
        INCOMPLETE(7),
        SHARE(8),
        CREATE_COMMENT(9),
        REPLY_COMMENT(10),
        DAILY_REMIND(11),
        FOLLOW(12),
        UNFOLLOW(13),
        REACT_COMMENT(14),
        COMPLETE_ASSIGNEE(15),
        COMPLETE_SELF(16),
        RESTORE_ASSIGNEE(17),
        RESTORE_SELF(18);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return UPDATE;
                case 2:
                    return ASSIGN;
                case 3:
                    return COMPLETE;
                case 4:
                    return CANCEL;
                case 5:
                    return DELETE;
                case 6:
                    return CREATE;
                case 7:
                    return INCOMPLETE;
                case 8:
                    return SHARE;
                case 9:
                    return CREATE_COMMENT;
                case 10:
                    return REPLY_COMMENT;
                case 11:
                    return DAILY_REMIND;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return FOLLOW;
                case 13:
                    return UNFOLLOW;
                case 14:
                    return REACT_COMMENT;
                case 15:
                    return COMPLETE_ASSIGNEE;
                case 16:
                    return COMPLETE_SELF;
                case 17:
                    return RESTORE_ASSIGNEE;
                case 18:
                    return RESTORE_SELF;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public enum UpdateField implements WireEnum {
        SUMMARY(0),
        DUE_TIME(1);
        
        public static final ProtoAdapter<UpdateField> ADAPTER = ProtoAdapter.newEnumAdapter(UpdateField.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UpdateField fromValue(int i) {
            if (i == 0) {
                return SUMMARY;
            }
            if (i != 1) {
                return null;
            }
            return DUE_TIME;
        }

        private UpdateField(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoOperationContent$b */
    private static final class C15341b extends ProtoAdapter<TodoOperationContent> {
        C15341b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoOperationContent.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoOperationContent todoOperationContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (todoOperationContent.operation_type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, todoOperationContent.operation_type);
            } else {
                i = 0;
            }
            if (todoOperationContent.operator != null) {
                i2 = TodoUser.ADAPTER.encodedSizeWithTag(2, todoOperationContent.operator);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (todoOperationContent.todo_detail != null) {
                i3 = TodoDetail.ADAPTER.encodedSizeWithTag(3, todoOperationContent.todo_detail);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i8 + i3 + UpdateField.ADAPTER.asRepeated().encodedSizeWithTag(4, todoOperationContent.update_fields);
            if (todoOperationContent.msg_status != null) {
                i4 = MsgStatus.ADAPTER.encodedSizeWithTag(5, todoOperationContent.msg_status);
            } else {
                i4 = 0;
            }
            int i9 = encodedSizeWithTag + i4;
            if (todoOperationContent.todo_comment_detail != null) {
                i5 = TodoCommentDetail.ADAPTER.encodedSizeWithTag(6, todoOperationContent.todo_comment_detail);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (todoOperationContent.daily_remind != null) {
                i6 = TodoDailyRemind.ADAPTER.encodedSizeWithTag(7, todoOperationContent.daily_remind);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i10 + i6 + TodoUser.ADAPTER.asRepeated().encodedSizeWithTag(8, todoOperationContent.target_users);
            if (todoOperationContent.complete_type != null) {
                i7 = CompleteType.ADAPTER.encodedSizeWithTag(9, todoOperationContent.complete_type);
            }
            return encodedSizeWithTag2 + i7 + todoOperationContent.unknownFields().size();
        }

        /* renamed from: a */
        public TodoOperationContent decode(ProtoReader protoReader) throws IOException {
            C15340a aVar = new C15340a();
            aVar.f40637a = Type.UNKNOWN;
            aVar.f40641e = MsgStatus.ACTIVE;
            aVar.f40645i = CompleteType.UNKNOWN_COMPLETE_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f40637a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f40638b = TodoUser.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40639c = TodoDetail.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f40640d.add(UpdateField.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f40641e = MsgStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 6:
                            aVar.f40642f = TodoCommentDetail.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40643g = TodoDailyRemind.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40644h.add(TodoUser.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            try {
                                aVar.f40645i = CompleteType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
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
        public void encode(ProtoWriter protoWriter, TodoOperationContent todoOperationContent) throws IOException {
            if (todoOperationContent.operation_type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, todoOperationContent.operation_type);
            }
            if (todoOperationContent.operator != null) {
                TodoUser.ADAPTER.encodeWithTag(protoWriter, 2, todoOperationContent.operator);
            }
            if (todoOperationContent.todo_detail != null) {
                TodoDetail.ADAPTER.encodeWithTag(protoWriter, 3, todoOperationContent.todo_detail);
            }
            UpdateField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, todoOperationContent.update_fields);
            if (todoOperationContent.msg_status != null) {
                MsgStatus.ADAPTER.encodeWithTag(protoWriter, 5, todoOperationContent.msg_status);
            }
            if (todoOperationContent.todo_comment_detail != null) {
                TodoCommentDetail.ADAPTER.encodeWithTag(protoWriter, 6, todoOperationContent.todo_comment_detail);
            }
            if (todoOperationContent.daily_remind != null) {
                TodoDailyRemind.ADAPTER.encodeWithTag(protoWriter, 7, todoOperationContent.daily_remind);
            }
            TodoUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, todoOperationContent.target_users);
            if (todoOperationContent.complete_type != null) {
                CompleteType.ADAPTER.encodeWithTag(protoWriter, 9, todoOperationContent.complete_type);
            }
            protoWriter.writeBytes(todoOperationContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoOperationContent$a */
    public static final class C15340a extends Message.Builder<TodoOperationContent, C15340a> {

        /* renamed from: a */
        public Type f40637a;

        /* renamed from: b */
        public TodoUser f40638b;

        /* renamed from: c */
        public TodoDetail f40639c;

        /* renamed from: d */
        public List<UpdateField> f40640d = Internal.newMutableList();

        /* renamed from: e */
        public MsgStatus f40641e;

        /* renamed from: f */
        public TodoCommentDetail f40642f;

        /* renamed from: g */
        public TodoDailyRemind f40643g;

        /* renamed from: h */
        public List<TodoUser> f40644h = Internal.newMutableList();

        /* renamed from: i */
        public CompleteType f40645i;

        /* renamed from: a */
        public TodoOperationContent build() {
            return new TodoOperationContent(this.f40637a, this.f40638b, this.f40639c, this.f40640d, this.f40641e, this.f40642f, this.f40643g, this.f40644h, this.f40645i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15340a newBuilder() {
        C15340a aVar = new C15340a();
        aVar.f40637a = this.operation_type;
        aVar.f40638b = this.operator;
        aVar.f40639c = this.todo_detail;
        aVar.f40640d = Internal.copyOf("update_fields", this.update_fields);
        aVar.f40641e = this.msg_status;
        aVar.f40642f = this.todo_comment_detail;
        aVar.f40643g = this.daily_remind;
        aVar.f40644h = Internal.copyOf("target_users", this.target_users);
        aVar.f40645i = this.complete_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TodoOperationContent");
        StringBuilder sb = new StringBuilder();
        if (this.operation_type != null) {
            sb.append(", operation_type=");
            sb.append(this.operation_type);
        }
        if (this.operator != null) {
            sb.append(", operator=");
            sb.append(this.operator);
        }
        if (this.todo_detail != null) {
            sb.append(", todo_detail=");
            sb.append(this.todo_detail);
        }
        if (!this.update_fields.isEmpty()) {
            sb.append(", update_fields=");
            sb.append(this.update_fields);
        }
        if (this.msg_status != null) {
            sb.append(", msg_status=");
            sb.append(this.msg_status);
        }
        if (this.todo_comment_detail != null) {
            sb.append(", todo_comment_detail=");
            sb.append(this.todo_comment_detail);
        }
        if (this.daily_remind != null) {
            sb.append(", daily_remind=");
            sb.append(this.daily_remind);
        }
        if (!this.target_users.isEmpty()) {
            sb.append(", target_users=");
            sb.append(this.target_users);
        }
        if (this.complete_type != null) {
            sb.append(", complete_type=");
            sb.append(this.complete_type);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoOperationContent{");
        replace.append('}');
        return replace.toString();
    }

    public TodoOperationContent(Type type, TodoUser todoUser, TodoDetail todoDetail, List<UpdateField> list, MsgStatus msgStatus, TodoCommentDetail todoCommentDetail, TodoDailyRemind todoDailyRemind, List<TodoUser> list2, CompleteType completeType) {
        this(type, todoUser, todoDetail, list, msgStatus, todoCommentDetail, todoDailyRemind, list2, completeType, ByteString.EMPTY);
    }

    public TodoOperationContent(Type type, TodoUser todoUser, TodoDetail todoDetail, List<UpdateField> list, MsgStatus msgStatus, TodoCommentDetail todoCommentDetail, TodoDailyRemind todoDailyRemind, List<TodoUser> list2, CompleteType completeType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operation_type = type;
        this.operator = todoUser;
        this.todo_detail = todoDetail;
        this.update_fields = Internal.immutableCopyOf("update_fields", list);
        this.msg_status = msgStatus;
        this.todo_comment_detail = todoCommentDetail;
        this.daily_remind = todoDailyRemind;
        this.target_users = Internal.immutableCopyOf("target_users", list2);
        this.complete_type = completeType;
    }
}
