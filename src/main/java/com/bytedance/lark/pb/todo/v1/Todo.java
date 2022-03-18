package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Todo extends Message<Todo, C19637a> {
    public static final ProtoAdapter<Todo> ADAPTER = new C19638b();
    public static final Long DEFAULT_COMPLETED_MILLI_TIME = 0L;
    public static final Long DEFAULT_CREATE_MILLI_TIME = 0L;
    public static final Long DEFAULT_DELETED_MILLI_TIME = 0L;
    public static final Long DEFAULT_DISPLAY_COMPLETED_MILLI_TIME = 0L;
    public static final Long DEFAULT_DUE_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_NOT_MINE = false;
    public static final TodoSource DEFAULT_SOURCE = TodoSource.TODO;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<TodoAssignee> assignees;
    public final TodoUser assigner;
    public final String block_id;
    public final Long completed_milli_time;
    public final Long create_milli_time;
    public final TodoUser creator;
    public final String creator_id;
    public final CustomComplete custom_complete;
    public final Long deleted_milli_time;
    public final String description;
    public final Long display_completed_milli_time;
    public final String doc_description;
    public final Long due_time;
    public final String due_timezone;
    public final TodoExtra extra;
    public final List<TodoFollower> followers;
    public final String guid;
    public final Boolean is_all_day;
    public final Boolean is_not_mine;
    public final String item_max_version;
    public final TodoOrigin origin;
    public final List<String> refer_resource_ids;
    public final List<TodoReminder> reminders;
    public final RichContent rich_description;
    public final RichContent rich_summary;
    public final TodoItemPermission self_permission;
    public final TodoSource source;
    public final TodoSourceHref source_href;
    public final Long start_time;
    public final String start_timezone;
    public final String summary;

    /* renamed from: com.bytedance.lark.pb.todo.v1.Todo$b */
    private static final class C19638b extends ProtoAdapter<Todo> {
        C19638b() {
            super(FieldEncoding.LENGTH_DELIMITED, Todo.class);
        }

        /* renamed from: a */
        public int encodedSize(Todo todo) {
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
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27 = 0;
            if (todo.guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todo.guid);
            } else {
                i = 0;
            }
            if (todo.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, todo.summary);
            } else {
                i2 = 0;
            }
            int i28 = i + i2;
            if (todo.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, todo.description);
            } else {
                i3 = 0;
            }
            int i29 = i28 + i3;
            if (todo.doc_description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, todo.doc_description);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i29 + i4 + TodoReminder.ADAPTER.asRepeated().encodedSizeWithTag(5, todo.reminders);
            if (todo.source != null) {
                i5 = TodoSource.ADAPTER.encodedSizeWithTag(6, todo.source);
            } else {
                i5 = 0;
            }
            int i30 = encodedSizeWithTag + i5;
            if (todo.block_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, todo.block_id);
            } else {
                i6 = 0;
            }
            int i31 = i30 + i6;
            if (todo.start_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, todo.start_time);
            } else {
                i7 = 0;
            }
            int i32 = i31 + i7;
            if (todo.start_timezone != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, todo.start_timezone);
            } else {
                i8 = 0;
            }
            int i33 = i32 + i8;
            if (todo.due_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(10, todo.due_time);
            } else {
                i9 = 0;
            }
            int i34 = i33 + i9;
            if (todo.due_timezone != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, todo.due_timezone);
            } else {
                i10 = 0;
            }
            int i35 = i34 + i10;
            if (todo.is_all_day != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, todo.is_all_day);
            } else {
                i11 = 0;
            }
            int i36 = i35 + i11;
            if (todo.self_permission != null) {
                i12 = TodoItemPermission.ADAPTER.encodedSizeWithTag(13, todo.self_permission);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag2 = i36 + i12 + TodoAssignee.ADAPTER.asRepeated().encodedSizeWithTag(14, todo.assignees);
            if (todo.completed_milli_time != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(15, todo.completed_milli_time);
            } else {
                i13 = 0;
            }
            int i37 = encodedSizeWithTag2 + i13;
            if (todo.deleted_milli_time != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(16, todo.deleted_milli_time);
            } else {
                i14 = 0;
            }
            int i38 = i37 + i14;
            if (todo.creator_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(17, todo.creator_id);
            } else {
                i15 = 0;
            }
            int i39 = i38 + i15;
            if (todo.create_milli_time != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(18, todo.create_milli_time);
            } else {
                i16 = 0;
            }
            int i40 = i39 + i16;
            if (todo.creator != null) {
                i17 = TodoUser.ADAPTER.encodedSizeWithTag(19, todo.creator);
            } else {
                i17 = 0;
            }
            int i41 = i40 + i17;
            if (todo.item_max_version != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(20, todo.item_max_version);
            } else {
                i18 = 0;
            }
            int i42 = i41 + i18;
            if (todo.extra != null) {
                i19 = TodoExtra.ADAPTER.encodedSizeWithTag(21, todo.extra);
            } else {
                i19 = 0;
            }
            int i43 = i42 + i19;
            if (todo.is_not_mine != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(22, todo.is_not_mine);
            } else {
                i20 = 0;
            }
            int i44 = i43 + i20;
            if (todo.assigner != null) {
                i21 = TodoUser.ADAPTER.encodedSizeWithTag(23, todo.assigner);
            } else {
                i21 = 0;
            }
            int i45 = i44 + i21;
            if (todo.rich_summary != null) {
                i22 = RichContent.ADAPTER.encodedSizeWithTag(24, todo.rich_summary);
            } else {
                i22 = 0;
            }
            int encodedSizeWithTag3 = i45 + i22 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(25, todo.refer_resource_ids) + TodoFollower.ADAPTER.asRepeated().encodedSizeWithTag(26, todo.followers);
            if (todo.rich_description != null) {
                i23 = RichContent.ADAPTER.encodedSizeWithTag(27, todo.rich_description);
            } else {
                i23 = 0;
            }
            int i46 = encodedSizeWithTag3 + i23;
            if (todo.source_href != null) {
                i24 = TodoSourceHref.ADAPTER.encodedSizeWithTag(28, todo.source_href);
            } else {
                i24 = 0;
            }
            int i47 = i46 + i24;
            if (todo.origin != null) {
                i25 = TodoOrigin.ADAPTER.encodedSizeWithTag(29, todo.origin);
            } else {
                i25 = 0;
            }
            int i48 = i47 + i25;
            if (todo.display_completed_milli_time != null) {
                i26 = ProtoAdapter.INT64.encodedSizeWithTag(30, todo.display_completed_milli_time);
            } else {
                i26 = 0;
            }
            int i49 = i48 + i26;
            if (todo.custom_complete != null) {
                i27 = CustomComplete.ADAPTER.encodedSizeWithTag(31, todo.custom_complete);
            }
            return i49 + i27 + todo.unknownFields().size();
        }

        /* renamed from: a */
        public Todo decode(ProtoReader protoReader) throws IOException {
            C19637a aVar = new C19637a();
            aVar.f48019a = "";
            aVar.f48020b = "";
            aVar.f48021c = "";
            aVar.f48022d = "";
            aVar.f48024f = TodoSource.TODO;
            aVar.f48025g = "";
            aVar.f48026h = 0L;
            aVar.f48027i = "";
            aVar.f48028j = 0L;
            aVar.f48029k = "";
            aVar.f48030l = false;
            aVar.f48033o = 0L;
            aVar.f48034p = 0L;
            aVar.f48035q = "";
            aVar.f48036r = 0L;
            aVar.f48038t = "";
            aVar.f48040v = false;
            aVar.f48017D = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48019a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f48020b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f48021c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f48022d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f48023e.add(TodoReminder.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            try {
                                aVar.f48024f = TodoSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f48025g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f48026h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f48027i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f48028j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f48029k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f48030l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f48031m = TodoItemPermission.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f48032n.add(TodoAssignee.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            aVar.f48033o = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            aVar.f48034p = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 17:
                            aVar.f48035q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f48036r = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 19:
                            aVar.f48037s = TodoUser.ADAPTER.decode(protoReader);
                            break;
                        case 20:
                            aVar.f48038t = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            aVar.f48039u = TodoExtra.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            aVar.f48040v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f48041w = TodoUser.ADAPTER.decode(protoReader);
                            break;
                        case 24:
                            aVar.f48042x = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f48043y.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            aVar.f48044z.add(TodoFollower.ADAPTER.decode(protoReader));
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f48014A = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f48015B = TodoSourceHref.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            aVar.f48016C = TodoOrigin.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            aVar.f48017D = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f48018E = CustomComplete.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Todo todo) throws IOException {
            if (todo.guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todo.guid);
            }
            if (todo.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, todo.summary);
            }
            if (todo.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, todo.description);
            }
            if (todo.doc_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, todo.doc_description);
            }
            TodoReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, todo.reminders);
            if (todo.source != null) {
                TodoSource.ADAPTER.encodeWithTag(protoWriter, 6, todo.source);
            }
            if (todo.block_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, todo.block_id);
            }
            if (todo.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, todo.start_time);
            }
            if (todo.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, todo.start_timezone);
            }
            if (todo.due_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, todo.due_time);
            }
            if (todo.due_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, todo.due_timezone);
            }
            if (todo.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, todo.is_all_day);
            }
            if (todo.self_permission != null) {
                TodoItemPermission.ADAPTER.encodeWithTag(protoWriter, 13, todo.self_permission);
            }
            TodoAssignee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, todo.assignees);
            if (todo.completed_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 15, todo.completed_milli_time);
            }
            if (todo.deleted_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, todo.deleted_milli_time);
            }
            if (todo.creator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, todo.creator_id);
            }
            if (todo.create_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 18, todo.create_milli_time);
            }
            if (todo.creator != null) {
                TodoUser.ADAPTER.encodeWithTag(protoWriter, 19, todo.creator);
            }
            if (todo.item_max_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, todo.item_max_version);
            }
            if (todo.extra != null) {
                TodoExtra.ADAPTER.encodeWithTag(protoWriter, 21, todo.extra);
            }
            if (todo.is_not_mine != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, todo.is_not_mine);
            }
            if (todo.assigner != null) {
                TodoUser.ADAPTER.encodeWithTag(protoWriter, 23, todo.assigner);
            }
            if (todo.rich_summary != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 24, todo.rich_summary);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 25, todo.refer_resource_ids);
            TodoFollower.ADAPTER.asRepeated().encodeWithTag(protoWriter, 26, todo.followers);
            if (todo.rich_description != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 27, todo.rich_description);
            }
            if (todo.source_href != null) {
                TodoSourceHref.ADAPTER.encodeWithTag(protoWriter, 28, todo.source_href);
            }
            if (todo.origin != null) {
                TodoOrigin.ADAPTER.encodeWithTag(protoWriter, 29, todo.origin);
            }
            if (todo.display_completed_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 30, todo.display_completed_milli_time);
            }
            if (todo.custom_complete != null) {
                CustomComplete.ADAPTER.encodeWithTag(protoWriter, 31, todo.custom_complete);
            }
            protoWriter.writeBytes(todo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.Todo$a */
    public static final class C19637a extends Message.Builder<Todo, C19637a> {

        /* renamed from: A */
        public RichContent f48014A;

        /* renamed from: B */
        public TodoSourceHref f48015B;

        /* renamed from: C */
        public TodoOrigin f48016C;

        /* renamed from: D */
        public Long f48017D;

        /* renamed from: E */
        public CustomComplete f48018E;

        /* renamed from: a */
        public String f48019a;

        /* renamed from: b */
        public String f48020b;

        /* renamed from: c */
        public String f48021c;

        /* renamed from: d */
        public String f48022d;

        /* renamed from: e */
        public List<TodoReminder> f48023e = Internal.newMutableList();

        /* renamed from: f */
        public TodoSource f48024f;

        /* renamed from: g */
        public String f48025g;

        /* renamed from: h */
        public Long f48026h;

        /* renamed from: i */
        public String f48027i;

        /* renamed from: j */
        public Long f48028j;

        /* renamed from: k */
        public String f48029k;

        /* renamed from: l */
        public Boolean f48030l;

        /* renamed from: m */
        public TodoItemPermission f48031m;

        /* renamed from: n */
        public List<TodoAssignee> f48032n = Internal.newMutableList();

        /* renamed from: o */
        public Long f48033o;

        /* renamed from: p */
        public Long f48034p;

        /* renamed from: q */
        public String f48035q;

        /* renamed from: r */
        public Long f48036r;

        /* renamed from: s */
        public TodoUser f48037s;

        /* renamed from: t */
        public String f48038t;

        /* renamed from: u */
        public TodoExtra f48039u;

        /* renamed from: v */
        public Boolean f48040v;

        /* renamed from: w */
        public TodoUser f48041w;

        /* renamed from: x */
        public RichContent f48042x;

        /* renamed from: y */
        public List<String> f48043y = Internal.newMutableList();

        /* renamed from: z */
        public List<TodoFollower> f48044z = Internal.newMutableList();

        /* renamed from: a */
        public Todo build() {
            return new Todo(this.f48019a, this.f48020b, this.f48021c, this.f48022d, this.f48023e, this.f48024f, this.f48025g, this.f48026h, this.f48027i, this.f48028j, this.f48029k, this.f48030l, this.f48031m, this.f48032n, this.f48033o, this.f48034p, this.f48035q, this.f48036r, this.f48037s, this.f48038t, this.f48039u, this.f48040v, this.f48041w, this.f48042x, this.f48043y, this.f48044z, this.f48014A, this.f48015B, this.f48016C, this.f48017D, this.f48018E, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19637a mo66621a(TodoSourceHref todoSourceHref) {
            this.f48015B = todoSourceHref;
            return this;
        }

        /* renamed from: a */
        public C19637a mo66622a(Long l) {
            this.f48033o = l;
            return this;
        }

        /* renamed from: b */
        public C19637a mo66625b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f48043y = list;
            return this;
        }

        /* renamed from: a */
        public C19637a mo66623a(List<TodoAssignee> list) {
            Internal.checkElementsNotNull(list);
            this.f48032n = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19637a newBuilder() {
        C19637a aVar = new C19637a();
        aVar.f48019a = this.guid;
        aVar.f48020b = this.summary;
        aVar.f48021c = this.description;
        aVar.f48022d = this.doc_description;
        aVar.f48023e = Internal.copyOf("reminders", this.reminders);
        aVar.f48024f = this.source;
        aVar.f48025g = this.block_id;
        aVar.f48026h = this.start_time;
        aVar.f48027i = this.start_timezone;
        aVar.f48028j = this.due_time;
        aVar.f48029k = this.due_timezone;
        aVar.f48030l = this.is_all_day;
        aVar.f48031m = this.self_permission;
        aVar.f48032n = Internal.copyOf("assignees", this.assignees);
        aVar.f48033o = this.completed_milli_time;
        aVar.f48034p = this.deleted_milli_time;
        aVar.f48035q = this.creator_id;
        aVar.f48036r = this.create_milli_time;
        aVar.f48037s = this.creator;
        aVar.f48038t = this.item_max_version;
        aVar.f48039u = this.extra;
        aVar.f48040v = this.is_not_mine;
        aVar.f48041w = this.assigner;
        aVar.f48042x = this.rich_summary;
        aVar.f48043y = Internal.copyOf("refer_resource_ids", this.refer_resource_ids);
        aVar.f48044z = Internal.copyOf("followers", this.followers);
        aVar.f48014A = this.rich_description;
        aVar.f48015B = this.source_href;
        aVar.f48016C = this.origin;
        aVar.f48017D = this.display_completed_milli_time;
        aVar.f48018E = this.custom_complete;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "Todo");
        StringBuilder sb = new StringBuilder();
        if (this.guid != null) {
            sb.append(", guid=");
            sb.append(this.guid);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.doc_description != null) {
            sb.append(", doc_description=");
            sb.append(this.doc_description);
        }
        if (!this.reminders.isEmpty()) {
            sb.append(", reminders=");
            sb.append(this.reminders);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.block_id != null) {
            sb.append(", block_id=");
            sb.append(this.block_id);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
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
        if (this.self_permission != null) {
            sb.append(", self_permission=");
            sb.append(this.self_permission);
        }
        if (!this.assignees.isEmpty()) {
            sb.append(", assignees=");
            sb.append(this.assignees);
        }
        if (this.completed_milli_time != null) {
            sb.append(", completed_milli_time=");
            sb.append(this.completed_milli_time);
        }
        if (this.deleted_milli_time != null) {
            sb.append(", deleted_milli_time=");
            sb.append(this.deleted_milli_time);
        }
        if (this.creator_id != null) {
            sb.append(", creator_id=");
            sb.append(this.creator_id);
        }
        if (this.create_milli_time != null) {
            sb.append(", create_milli_time=");
            sb.append(this.create_milli_time);
        }
        if (this.creator != null) {
            sb.append(", creator=");
            sb.append(this.creator);
        }
        if (this.item_max_version != null) {
            sb.append(", item_max_version=");
            sb.append(this.item_max_version);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.is_not_mine != null) {
            sb.append(", is_not_mine=");
            sb.append(this.is_not_mine);
        }
        if (this.assigner != null) {
            sb.append(", assigner=");
            sb.append(this.assigner);
        }
        if (this.rich_summary != null) {
            sb.append(", rich_summary=");
            sb.append(this.rich_summary);
        }
        if (!this.refer_resource_ids.isEmpty()) {
            sb.append(", refer_resource_ids=");
            sb.append(this.refer_resource_ids);
        }
        if (!this.followers.isEmpty()) {
            sb.append(", followers=");
            sb.append(this.followers);
        }
        if (this.rich_description != null) {
            sb.append(", rich_description=");
            sb.append(this.rich_description);
        }
        if (this.source_href != null) {
            sb.append(", source_href=");
            sb.append(this.source_href);
        }
        if (this.origin != null) {
            sb.append(", origin=");
            sb.append(this.origin);
        }
        if (this.display_completed_milli_time != null) {
            sb.append(", display_completed_milli_time=");
            sb.append(this.display_completed_milli_time);
        }
        if (this.custom_complete != null) {
            sb.append(", custom_complete=");
            sb.append(this.custom_complete);
        }
        StringBuilder replace = sb.replace(0, 2, "Todo{");
        replace.append('}');
        return replace.toString();
    }

    public Todo(String str, String str2, String str3, String str4, List<TodoReminder> list, TodoSource todoSource, String str5, Long l, String str6, Long l2, String str7, Boolean bool, TodoItemPermission todoItemPermission, List<TodoAssignee> list2, Long l3, Long l4, String str8, Long l5, TodoUser todoUser, String str9, TodoExtra todoExtra, Boolean bool2, TodoUser todoUser2, RichContent richContent, List<String> list3, List<TodoFollower> list4, RichContent richContent2, TodoSourceHref todoSourceHref, TodoOrigin todoOrigin, Long l6, CustomComplete customComplete) {
        this(str, str2, str3, str4, list, todoSource, str5, l, str6, l2, str7, bool, todoItemPermission, list2, l3, l4, str8, l5, todoUser, str9, todoExtra, bool2, todoUser2, richContent, list3, list4, richContent2, todoSourceHref, todoOrigin, l6, customComplete, ByteString.EMPTY);
    }

    public Todo(String str, String str2, String str3, String str4, List<TodoReminder> list, TodoSource todoSource, String str5, Long l, String str6, Long l2, String str7, Boolean bool, TodoItemPermission todoItemPermission, List<TodoAssignee> list2, Long l3, Long l4, String str8, Long l5, TodoUser todoUser, String str9, TodoExtra todoExtra, Boolean bool2, TodoUser todoUser2, RichContent richContent, List<String> list3, List<TodoFollower> list4, RichContent richContent2, TodoSourceHref todoSourceHref, TodoOrigin todoOrigin, Long l6, CustomComplete customComplete, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guid = str;
        this.summary = str2;
        this.description = str3;
        this.doc_description = str4;
        this.reminders = Internal.immutableCopyOf("reminders", list);
        this.source = todoSource;
        this.block_id = str5;
        this.start_time = l;
        this.start_timezone = str6;
        this.due_time = l2;
        this.due_timezone = str7;
        this.is_all_day = bool;
        this.self_permission = todoItemPermission;
        this.assignees = Internal.immutableCopyOf("assignees", list2);
        this.completed_milli_time = l3;
        this.deleted_milli_time = l4;
        this.creator_id = str8;
        this.create_milli_time = l5;
        this.creator = todoUser;
        this.item_max_version = str9;
        this.extra = todoExtra;
        this.is_not_mine = bool2;
        this.assigner = todoUser2;
        this.rich_summary = richContent;
        this.refer_resource_ids = Internal.immutableCopyOf("refer_resource_ids", list3);
        this.followers = Internal.immutableCopyOf("followers", list4);
        this.rich_description = richContent2;
        this.source_href = todoSourceHref;
        this.origin = todoOrigin;
        this.display_completed_milli_time = l6;
        this.custom_complete = customComplete;
    }
}
