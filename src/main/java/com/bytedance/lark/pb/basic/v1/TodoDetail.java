package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoFollower;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.TodoUser;
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
import java.util.Map;
import okio.ByteString;

public final class TodoDetail extends Message<TodoDetail, C15338a> {
    public static final ProtoAdapter<TodoDetail> ADAPTER = new C15339b();
    public static final Boolean DEFAULT_CAN_FOLLOW = false;
    public static final Long DEFAULT_COMPLETED_MILLI_TIME = 0L;
    public static final Long DEFAULT_DELETED_MILLI_TIME = 0L;
    public static final Long DEFAULT_DUE_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final MsgBelongTo DEFAULT_MSG_BELONG_TO = MsgBelongTo.UNKNOWN;
    public static final TodoSource DEFAULT_SOURCE = TodoSource.TODO;
    public static final Boolean DEFAULT_USER_COMPLETE_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final List<TodoAssignee> assignees;
    public final Boolean can_follow;
    public final Long completed_milli_time;
    public final TodoUser creator;
    public final CustomComplete custom_complete;
    public final Long deleted_milli_time;
    public final Long due_time;
    public final String due_timezone;
    public final List<TodoFollower> followers;
    public final String guid;
    public final Boolean is_all_day;
    public final MsgBelongTo msg_belong_to;
    public final RichContent rich_summary;
    public final TodoSource source;
    public final String summary;
    public final Boolean user_complete_enabled;
    public final Map<String, Permission> user_to_permission;

    public enum MsgBelongTo implements WireEnum {
        UNKNOWN(0),
        BOT(1),
        CHAT(2);
        
        public static final ProtoAdapter<MsgBelongTo> ADAPTER = ProtoAdapter.newEnumAdapter(MsgBelongTo.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MsgBelongTo fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return BOT;
            }
            if (i != 2) {
                return null;
            }
            return CHAT;
        }

        private MsgBelongTo(int i) {
            this.value = i;
        }
    }

    public static final class Permission extends Message<Permission, C15336a> {
        public static final ProtoAdapter<Permission> ADAPTER = new C15337b();
        public static final Boolean DEFAULT_CAN_COMPLETE_SELF = false;
        public static final Boolean DEFAULT_CAN_COMPLETE_TODO = false;
        public static final Boolean DEFAULT_CAN_FOLLOW = false;
        private static final long serialVersionUID = 0;
        public final Boolean can_complete_self;
        public final Boolean can_complete_todo;
        public final Boolean can_follow;

        /* renamed from: com.bytedance.lark.pb.basic.v1.TodoDetail$Permission$b */
        private static final class C15337b extends ProtoAdapter<Permission> {
            C15337b() {
                super(FieldEncoding.LENGTH_DELIMITED, Permission.class);
            }

            /* renamed from: a */
            public int encodedSize(Permission permission) {
                int i;
                int i2;
                int i3 = 0;
                if (permission.can_complete_todo != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, permission.can_complete_todo);
                } else {
                    i = 0;
                }
                if (permission.can_complete_self != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, permission.can_complete_self);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (permission.can_follow != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, permission.can_follow);
                }
                return i4 + i3 + permission.unknownFields().size();
            }

            /* renamed from: a */
            public Permission decode(ProtoReader protoReader) throws IOException {
                C15336a aVar = new C15336a();
                aVar.f40616a = false;
                aVar.f40617b = false;
                aVar.f40618c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40616a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40617b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40618c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Permission permission) throws IOException {
                if (permission.can_complete_todo != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, permission.can_complete_todo);
                }
                if (permission.can_complete_self != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, permission.can_complete_self);
                }
                if (permission.can_follow != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, permission.can_follow);
                }
                protoWriter.writeBytes(permission.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TodoDetail$Permission$a */
        public static final class C15336a extends Message.Builder<Permission, C15336a> {

            /* renamed from: a */
            public Boolean f40616a;

            /* renamed from: b */
            public Boolean f40617b;

            /* renamed from: c */
            public Boolean f40618c;

            /* renamed from: a */
            public Permission build() {
                return new Permission(this.f40616a, this.f40617b, this.f40618c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15336a newBuilder() {
            C15336a aVar = new C15336a();
            aVar.f40616a = this.can_complete_todo;
            aVar.f40617b = this.can_complete_self;
            aVar.f40618c = this.can_follow;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Permission");
            StringBuilder sb = new StringBuilder();
            if (this.can_complete_todo != null) {
                sb.append(", can_complete_todo=");
                sb.append(this.can_complete_todo);
            }
            if (this.can_complete_self != null) {
                sb.append(", can_complete_self=");
                sb.append(this.can_complete_self);
            }
            if (this.can_follow != null) {
                sb.append(", can_follow=");
                sb.append(this.can_follow);
            }
            StringBuilder replace = sb.replace(0, 2, "Permission{");
            replace.append('}');
            return replace.toString();
        }

        public Permission(Boolean bool, Boolean bool2, Boolean bool3) {
            this(bool, bool2, bool3, ByteString.EMPTY);
        }

        public Permission(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.can_complete_todo = bool;
            this.can_complete_self = bool2;
            this.can_follow = bool3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoDetail$b */
    private static final class C15339b extends ProtoAdapter<TodoDetail> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Permission>> f40636a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Permission.ADAPTER);

        C15339b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoDetail todoDetail) {
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
            int i12;
            int i13;
            int i14 = 0;
            if (todoDetail.guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoDetail.guid);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + TodoAssignee.ADAPTER.asRepeated().encodedSizeWithTag(2, todoDetail.assignees);
            if (todoDetail.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, todoDetail.summary);
            } else {
                i2 = 0;
            }
            int i15 = encodedSizeWithTag + i2;
            if (todoDetail.due_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, todoDetail.due_time);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (todoDetail.due_timezone != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, todoDetail.due_timezone);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (todoDetail.is_all_day != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, todoDetail.is_all_day);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (todoDetail.msg_belong_to != null) {
                i6 = MsgBelongTo.ADAPTER.encodedSizeWithTag(7, todoDetail.msg_belong_to);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (todoDetail.rich_summary != null) {
                i7 = RichContent.ADAPTER.encodedSizeWithTag(8, todoDetail.rich_summary);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag2 = i19 + i7 + TodoFollower.ADAPTER.asRepeated().encodedSizeWithTag(9, todoDetail.followers);
            if (todoDetail.creator != null) {
                i8 = TodoUser.ADAPTER.encodedSizeWithTag(10, todoDetail.creator);
            } else {
                i8 = 0;
            }
            int i20 = encodedSizeWithTag2 + i8;
            if (todoDetail.completed_milli_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(11, todoDetail.completed_milli_time);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (todoDetail.deleted_milli_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(12, todoDetail.deleted_milli_time);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (todoDetail.source != null) {
                i11 = TodoSource.ADAPTER.encodedSizeWithTag(13, todoDetail.source);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (todoDetail.can_follow != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, todoDetail.can_follow);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag3 = i23 + i12 + this.f40636a.encodedSizeWithTag(15, todoDetail.user_to_permission);
            if (todoDetail.user_complete_enabled != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(16, todoDetail.user_complete_enabled);
            } else {
                i13 = 0;
            }
            int i24 = encodedSizeWithTag3 + i13;
            if (todoDetail.custom_complete != null) {
                i14 = CustomComplete.ADAPTER.encodedSizeWithTag(17, todoDetail.custom_complete);
            }
            return i24 + i14 + todoDetail.unknownFields().size();
        }

        /* renamed from: a */
        public TodoDetail decode(ProtoReader protoReader) throws IOException {
            C15338a aVar = new C15338a();
            aVar.f40619a = "";
            aVar.f40621c = "";
            aVar.f40622d = 0L;
            aVar.f40623e = "";
            aVar.f40624f = false;
            aVar.f40625g = MsgBelongTo.UNKNOWN;
            aVar.f40629k = 0L;
            aVar.f40630l = 0L;
            aVar.f40631m = TodoSource.TODO;
            aVar.f40632n = false;
            aVar.f40634p = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40619a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40620b.add(TodoAssignee.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f40621c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40622d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40623e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40624f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f40625g = MsgBelongTo.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 8:
                            aVar.f40626h = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40627i.add(TodoFollower.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f40628j = TodoUser.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f40629k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f40630l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f40631m = TodoSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f40632n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f40633o.putAll(this.f40636a.decode(protoReader));
                            break;
                        case 16:
                            aVar.f40634p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f40635q = CustomComplete.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, TodoDetail todoDetail) throws IOException {
            if (todoDetail.guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoDetail.guid);
            }
            TodoAssignee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, todoDetail.assignees);
            if (todoDetail.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, todoDetail.summary);
            }
            if (todoDetail.due_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, todoDetail.due_time);
            }
            if (todoDetail.due_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, todoDetail.due_timezone);
            }
            if (todoDetail.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, todoDetail.is_all_day);
            }
            if (todoDetail.msg_belong_to != null) {
                MsgBelongTo.ADAPTER.encodeWithTag(protoWriter, 7, todoDetail.msg_belong_to);
            }
            if (todoDetail.rich_summary != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 8, todoDetail.rich_summary);
            }
            TodoFollower.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, todoDetail.followers);
            if (todoDetail.creator != null) {
                TodoUser.ADAPTER.encodeWithTag(protoWriter, 10, todoDetail.creator);
            }
            if (todoDetail.completed_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, todoDetail.completed_milli_time);
            }
            if (todoDetail.deleted_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, todoDetail.deleted_milli_time);
            }
            if (todoDetail.source != null) {
                TodoSource.ADAPTER.encodeWithTag(protoWriter, 13, todoDetail.source);
            }
            if (todoDetail.can_follow != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, todoDetail.can_follow);
            }
            this.f40636a.encodeWithTag(protoWriter, 15, todoDetail.user_to_permission);
            if (todoDetail.user_complete_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, todoDetail.user_complete_enabled);
            }
            if (todoDetail.custom_complete != null) {
                CustomComplete.ADAPTER.encodeWithTag(protoWriter, 17, todoDetail.custom_complete);
            }
            protoWriter.writeBytes(todoDetail.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoDetail$a */
    public static final class C15338a extends Message.Builder<TodoDetail, C15338a> {

        /* renamed from: a */
        public String f40619a;

        /* renamed from: b */
        public List<TodoAssignee> f40620b = Internal.newMutableList();

        /* renamed from: c */
        public String f40621c;

        /* renamed from: d */
        public Long f40622d;

        /* renamed from: e */
        public String f40623e;

        /* renamed from: f */
        public Boolean f40624f;

        /* renamed from: g */
        public MsgBelongTo f40625g;

        /* renamed from: h */
        public RichContent f40626h;

        /* renamed from: i */
        public List<TodoFollower> f40627i = Internal.newMutableList();

        /* renamed from: j */
        public TodoUser f40628j;

        /* renamed from: k */
        public Long f40629k;

        /* renamed from: l */
        public Long f40630l;

        /* renamed from: m */
        public TodoSource f40631m;

        /* renamed from: n */
        public Boolean f40632n;

        /* renamed from: o */
        public Map<String, Permission> f40633o = Internal.newMutableMap();

        /* renamed from: p */
        public Boolean f40634p;

        /* renamed from: q */
        public CustomComplete f40635q;

        /* renamed from: a */
        public TodoDetail build() {
            return new TodoDetail(this.f40619a, this.f40620b, this.f40621c, this.f40622d, this.f40623e, this.f40624f, this.f40625g, this.f40626h, this.f40627i, this.f40628j, this.f40629k, this.f40630l, this.f40631m, this.f40632n, this.f40633o, this.f40634p, this.f40635q, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15338a mo55731a(RichContent richContent) {
            this.f40626h = richContent;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15338a newBuilder() {
        C15338a aVar = new C15338a();
        aVar.f40619a = this.guid;
        aVar.f40620b = Internal.copyOf("assignees", this.assignees);
        aVar.f40621c = this.summary;
        aVar.f40622d = this.due_time;
        aVar.f40623e = this.due_timezone;
        aVar.f40624f = this.is_all_day;
        aVar.f40625g = this.msg_belong_to;
        aVar.f40626h = this.rich_summary;
        aVar.f40627i = Internal.copyOf("followers", this.followers);
        aVar.f40628j = this.creator;
        aVar.f40629k = this.completed_milli_time;
        aVar.f40630l = this.deleted_milli_time;
        aVar.f40631m = this.source;
        aVar.f40632n = this.can_follow;
        aVar.f40633o = Internal.copyOf("user_to_permission", this.user_to_permission);
        aVar.f40634p = this.user_complete_enabled;
        aVar.f40635q = this.custom_complete;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TodoDetail");
        StringBuilder sb = new StringBuilder();
        if (this.guid != null) {
            sb.append(", guid=");
            sb.append(this.guid);
        }
        if (!this.assignees.isEmpty()) {
            sb.append(", assignees=");
            sb.append(this.assignees);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.due_time != null) {
            sb.append(", due_time=");
            sb.append(this.due_time);
        }
        if (this.due_timezone != null) {
            sb.append(", due_timezone=");
            sb.append(this.due_timezone);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.msg_belong_to != null) {
            sb.append(", msg_belong_to=");
            sb.append(this.msg_belong_to);
        }
        if (this.rich_summary != null) {
            sb.append(", rich_summary=");
            sb.append(this.rich_summary);
        }
        if (!this.followers.isEmpty()) {
            sb.append(", followers=");
            sb.append(this.followers);
        }
        if (this.creator != null) {
            sb.append(", creator=");
            sb.append(this.creator);
        }
        if (this.completed_milli_time != null) {
            sb.append(", completed_milli_time=");
            sb.append(this.completed_milli_time);
        }
        if (this.deleted_milli_time != null) {
            sb.append(", deleted_milli_time=");
            sb.append(this.deleted_milli_time);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.can_follow != null) {
            sb.append(", can_follow=");
            sb.append(this.can_follow);
        }
        if (!this.user_to_permission.isEmpty()) {
            sb.append(", user_to_permission=");
            sb.append(this.user_to_permission);
        }
        if (this.user_complete_enabled != null) {
            sb.append(", user_complete_enabled=");
            sb.append(this.user_complete_enabled);
        }
        if (this.custom_complete != null) {
            sb.append(", custom_complete=");
            sb.append(this.custom_complete);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoDetail{");
        replace.append('}');
        return replace.toString();
    }

    public TodoDetail(String str, List<TodoAssignee> list, String str2, Long l, String str3, Boolean bool, MsgBelongTo msgBelongTo, RichContent richContent, List<TodoFollower> list2, TodoUser todoUser, Long l2, Long l3, TodoSource todoSource, Boolean bool2, Map<String, Permission> map, Boolean bool3, CustomComplete customComplete) {
        this(str, list, str2, l, str3, bool, msgBelongTo, richContent, list2, todoUser, l2, l3, todoSource, bool2, map, bool3, customComplete, ByteString.EMPTY);
    }

    public TodoDetail(String str, List<TodoAssignee> list, String str2, Long l, String str3, Boolean bool, MsgBelongTo msgBelongTo, RichContent richContent, List<TodoFollower> list2, TodoUser todoUser, Long l2, Long l3, TodoSource todoSource, Boolean bool2, Map<String, Permission> map, Boolean bool3, CustomComplete customComplete, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guid = str;
        this.assignees = Internal.immutableCopyOf("assignees", list);
        this.summary = str2;
        this.due_time = l;
        this.due_timezone = str3;
        this.is_all_day = bool;
        this.msg_belong_to = msgBelongTo;
        this.rich_summary = richContent;
        this.followers = Internal.immutableCopyOf("followers", list2);
        this.creator = todoUser;
        this.completed_milli_time = l2;
        this.deleted_milli_time = l3;
        this.source = todoSource;
        this.can_follow = bool2;
        this.user_to_permission = Internal.immutableCopyOf("user_to_permission", map);
        this.user_complete_enabled = bool3;
        this.custom_complete = customComplete;
    }
}
