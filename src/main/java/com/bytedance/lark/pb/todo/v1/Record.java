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
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Record extends Message<Record, C19623a> {
    public static final ProtoAdapter<Record> ADAPTER = new C19624b();
    public static final Long DEFAULT_DUE_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Long DEFAULT_RECORD_MILLI_TIME = 0L;
    public static final RecordType DEFAULT_RECORD_TYPE = RecordType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final AssigneeRecord assignee_record;
    public final List<TodoAssignee> assignees;
    public final String commit_guid;
    public final TodoCompletedTimeRecord completed_milli_time;
    public final String description;
    public final Long due_time;
    public final String due_timezone;
    public final FollowerRecord follower_record;
    public final Boolean is_all_day;
    public final TodoUser operator;
    public final Long record_milli_time;
    public final RecordType record_type;
    public final ReminderRecord reminder_record;
    public final List<TodoReminder> reminders;
    public final RichContent rich_description;
    public final RichContent rich_summary;
    public final String summary;
    public final List<UserCompletedTimeRecord> users_completed_milli_time;

    public enum RecordType implements WireEnum {
        UNKNOWN(0, null),
        USER_ADDED_TODO(1, null),
        USER_COMPLETE_TODO(2, null),
        USER_DELETED_TODO(3, null),
        USER_CANCEL_COMPLETED_TODO(4, null),
        USER_CANCEL_DELETED_TODO(5, null),
        USER_ADDED_ASSIGNEES(11, true),
        USER_DELETED_ASSIGNEES(12, true),
        ASSIGNEES(13, null),
        USER_UPDATED_SUMMARY(21, null),
        USER_UPDATED_RICH_SUMMARY(22, null),
        USER_ADDED_DESCRIPTION(31, null),
        USER_UPDATED_DESCRIPTION(32, null),
        USER_DELETED_DESCRIPTION(33, null),
        USER_ADDED_DUE_TIME(41, null),
        USER_UPDATED_DUE_TIME(42, null),
        USER_DELETED_DUE_TIME(43, null),
        USERS_COMPLETED_MILLI_TIME(44, null),
        USER_ADDED_REMINDERS(51, true),
        USER_UPDATED_REMINDERS(52, true),
        USER_DELETED_REMINDERS(53, true),
        REMINDERS(54, null),
        USER_DELETED_REFER_CONTEXT(62, null),
        FOLLOWERS(71, null);
        
        public static final ProtoAdapter<RecordType> ADAPTER = ProtoAdapter.newEnumAdapter(RecordType.class);
        public final Boolean deprecated;
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecordType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USER_ADDED_TODO;
            }
            if (i == 2) {
                return USER_COMPLETE_TODO;
            }
            if (i == 3) {
                return USER_DELETED_TODO;
            }
            if (i == 4) {
                return USER_CANCEL_COMPLETED_TODO;
            }
            if (i == 5) {
                return USER_CANCEL_DELETED_TODO;
            }
            if (i == 21) {
                return USER_UPDATED_SUMMARY;
            }
            if (i == 22) {
                return USER_UPDATED_RICH_SUMMARY;
            }
            if (i == 62) {
                return USER_DELETED_REFER_CONTEXT;
            }
            if (i == 71) {
                return FOLLOWERS;
            }
            switch (i) {
                case 11:
                    return USER_ADDED_ASSIGNEES;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return USER_DELETED_ASSIGNEES;
                case 13:
                    return ASSIGNEES;
                default:
                    switch (i) {
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            return USER_ADDED_DESCRIPTION;
                        case 32:
                            return USER_UPDATED_DESCRIPTION;
                        case 33:
                            return USER_DELETED_DESCRIPTION;
                        default:
                            switch (i) {
                                case 41:
                                    return USER_ADDED_DUE_TIME;
                                case 42:
                                    return USER_UPDATED_DUE_TIME;
                                case 43:
                                    return USER_DELETED_DUE_TIME;
                                case 44:
                                    return USERS_COMPLETED_MILLI_TIME;
                                default:
                                    switch (i) {
                                        case 51:
                                            return USER_ADDED_REMINDERS;
                                        case 52:
                                            return USER_UPDATED_REMINDERS;
                                        case 53:
                                            return USER_DELETED_REMINDERS;
                                        case 54:
                                            return REMINDERS;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        private RecordType(int i, Boolean bool) {
            this.value = i;
            this.deprecated = bool;
        }
    }

    public static final class AssigneeRecord extends Message<AssigneeRecord, C19613a> {
        public static final ProtoAdapter<AssigneeRecord> ADAPTER = new C19614b();
        private static final long serialVersionUID = 0;
        public final List<TodoAssignee> added_assignees;
        public final List<TodoAssignee> deleted_assignees;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$AssigneeRecord$b */
        private static final class C19614b extends ProtoAdapter<AssigneeRecord> {
            C19614b() {
                super(FieldEncoding.LENGTH_DELIMITED, AssigneeRecord.class);
            }

            /* renamed from: a */
            public int encodedSize(AssigneeRecord assigneeRecord) {
                return TodoAssignee.ADAPTER.asRepeated().encodedSizeWithTag(1, assigneeRecord.added_assignees) + TodoAssignee.ADAPTER.asRepeated().encodedSizeWithTag(2, assigneeRecord.deleted_assignees) + assigneeRecord.unknownFields().size();
            }

            /* renamed from: a */
            public AssigneeRecord decode(ProtoReader protoReader) throws IOException {
                C19613a aVar = new C19613a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47965a.add(TodoAssignee.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47966b.add(TodoAssignee.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AssigneeRecord assigneeRecord) throws IOException {
                TodoAssignee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, assigneeRecord.added_assignees);
                TodoAssignee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, assigneeRecord.deleted_assignees);
                protoWriter.writeBytes(assigneeRecord.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$AssigneeRecord$a */
        public static final class C19613a extends Message.Builder<AssigneeRecord, C19613a> {

            /* renamed from: a */
            public List<TodoAssignee> f47965a = Internal.newMutableList();

            /* renamed from: b */
            public List<TodoAssignee> f47966b = Internal.newMutableList();

            /* renamed from: a */
            public AssigneeRecord build() {
                return new AssigneeRecord(this.f47965a, this.f47966b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19613a newBuilder() {
            C19613a aVar = new C19613a();
            aVar.f47965a = Internal.copyOf("added_assignees", this.added_assignees);
            aVar.f47966b = Internal.copyOf("deleted_assignees", this.deleted_assignees);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "AssigneeRecord");
            StringBuilder sb = new StringBuilder();
            if (!this.added_assignees.isEmpty()) {
                sb.append(", added_assignees=");
                sb.append(this.added_assignees);
            }
            if (!this.deleted_assignees.isEmpty()) {
                sb.append(", deleted_assignees=");
                sb.append(this.deleted_assignees);
            }
            StringBuilder replace = sb.replace(0, 2, "AssigneeRecord{");
            replace.append('}');
            return replace.toString();
        }

        public AssigneeRecord(List<TodoAssignee> list, List<TodoAssignee> list2) {
            this(list, list2, ByteString.EMPTY);
        }

        public AssigneeRecord(List<TodoAssignee> list, List<TodoAssignee> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.added_assignees = Internal.immutableCopyOf("added_assignees", list);
            this.deleted_assignees = Internal.immutableCopyOf("deleted_assignees", list2);
        }
    }

    public static final class FollowerRecord extends Message<FollowerRecord, C19615a> {
        public static final ProtoAdapter<FollowerRecord> ADAPTER = new C19616b();
        private static final long serialVersionUID = 0;
        public final List<TodoFollower> added_followers;
        public final List<TodoFollower> deleted_followers;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$FollowerRecord$b */
        private static final class C19616b extends ProtoAdapter<FollowerRecord> {
            C19616b() {
                super(FieldEncoding.LENGTH_DELIMITED, FollowerRecord.class);
            }

            /* renamed from: a */
            public int encodedSize(FollowerRecord followerRecord) {
                return TodoFollower.ADAPTER.asRepeated().encodedSizeWithTag(1, followerRecord.added_followers) + TodoFollower.ADAPTER.asRepeated().encodedSizeWithTag(2, followerRecord.deleted_followers) + followerRecord.unknownFields().size();
            }

            /* renamed from: a */
            public FollowerRecord decode(ProtoReader protoReader) throws IOException {
                C19615a aVar = new C19615a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47967a.add(TodoFollower.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47968b.add(TodoFollower.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FollowerRecord followerRecord) throws IOException {
                TodoFollower.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, followerRecord.added_followers);
                TodoFollower.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, followerRecord.deleted_followers);
                protoWriter.writeBytes(followerRecord.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$FollowerRecord$a */
        public static final class C19615a extends Message.Builder<FollowerRecord, C19615a> {

            /* renamed from: a */
            public List<TodoFollower> f47967a = Internal.newMutableList();

            /* renamed from: b */
            public List<TodoFollower> f47968b = Internal.newMutableList();

            /* renamed from: a */
            public FollowerRecord build() {
                return new FollowerRecord(this.f47967a, this.f47968b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19615a newBuilder() {
            C19615a aVar = new C19615a();
            aVar.f47967a = Internal.copyOf("added_followers", this.added_followers);
            aVar.f47968b = Internal.copyOf("deleted_followers", this.deleted_followers);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "FollowerRecord");
            StringBuilder sb = new StringBuilder();
            if (!this.added_followers.isEmpty()) {
                sb.append(", added_followers=");
                sb.append(this.added_followers);
            }
            if (!this.deleted_followers.isEmpty()) {
                sb.append(", deleted_followers=");
                sb.append(this.deleted_followers);
            }
            StringBuilder replace = sb.replace(0, 2, "FollowerRecord{");
            replace.append('}');
            return replace.toString();
        }

        public FollowerRecord(List<TodoFollower> list, List<TodoFollower> list2) {
            this(list, list2, ByteString.EMPTY);
        }

        public FollowerRecord(List<TodoFollower> list, List<TodoFollower> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.added_followers = Internal.immutableCopyOf("added_followers", list);
            this.deleted_followers = Internal.immutableCopyOf("deleted_followers", list2);
        }
    }

    public static final class ReminderRecord extends Message<ReminderRecord, C19617a> {
        public static final ProtoAdapter<ReminderRecord> ADAPTER = new C19618b();
        public static final Boolean DEFAULT_ADDED_IS_ALL_DAY = false;
        public static final Boolean DEFAULT_DELETED_IS_ALL_DAY = false;
        public static final Boolean DEFAULT_UPDATED_IS_ALL_DAY = false;
        private static final long serialVersionUID = 0;
        public final Boolean added_is_all_day;
        public final List<TodoReminder> added_reminders;
        public final Boolean deleted_is_all_day;
        public final List<TodoReminder> deleted_reminders;
        public final Boolean updated_is_all_day;
        public final List<TodoReminder> updated_reminders;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$ReminderRecord$b */
        private static final class C19618b extends ProtoAdapter<ReminderRecord> {
            C19618b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReminderRecord.class);
            }

            /* renamed from: a */
            public int encodedSize(ReminderRecord reminderRecord) {
                int i;
                int i2;
                int encodedSizeWithTag = TodoReminder.ADAPTER.asRepeated().encodedSizeWithTag(1, reminderRecord.added_reminders) + TodoReminder.ADAPTER.asRepeated().encodedSizeWithTag(2, reminderRecord.deleted_reminders) + TodoReminder.ADAPTER.asRepeated().encodedSizeWithTag(3, reminderRecord.updated_reminders);
                int i3 = 0;
                if (reminderRecord.added_is_all_day != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(4, reminderRecord.added_is_all_day);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (reminderRecord.deleted_is_all_day != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, reminderRecord.deleted_is_all_day);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (reminderRecord.updated_is_all_day != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, reminderRecord.updated_is_all_day);
                }
                return i5 + i3 + reminderRecord.unknownFields().size();
            }

            /* renamed from: a */
            public ReminderRecord decode(ProtoReader protoReader) throws IOException {
                C19617a aVar = new C19617a();
                aVar.f47972d = false;
                aVar.f47973e = false;
                aVar.f47974f = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f47969a.add(TodoReminder.ADAPTER.decode(protoReader));
                                break;
                            case 2:
                                aVar.f47970b.add(TodoReminder.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                aVar.f47971c.add(TodoReminder.ADAPTER.decode(protoReader));
                                break;
                            case 4:
                                aVar.f47972d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f47973e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f47974f = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ReminderRecord reminderRecord) throws IOException {
                TodoReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, reminderRecord.added_reminders);
                TodoReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, reminderRecord.deleted_reminders);
                TodoReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, reminderRecord.updated_reminders);
                if (reminderRecord.added_is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, reminderRecord.added_is_all_day);
                }
                if (reminderRecord.deleted_is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, reminderRecord.deleted_is_all_day);
                }
                if (reminderRecord.updated_is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, reminderRecord.updated_is_all_day);
                }
                protoWriter.writeBytes(reminderRecord.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$ReminderRecord$a */
        public static final class C19617a extends Message.Builder<ReminderRecord, C19617a> {

            /* renamed from: a */
            public List<TodoReminder> f47969a = Internal.newMutableList();

            /* renamed from: b */
            public List<TodoReminder> f47970b = Internal.newMutableList();

            /* renamed from: c */
            public List<TodoReminder> f47971c = Internal.newMutableList();

            /* renamed from: d */
            public Boolean f47972d;

            /* renamed from: e */
            public Boolean f47973e;

            /* renamed from: f */
            public Boolean f47974f;

            /* renamed from: a */
            public ReminderRecord build() {
                return new ReminderRecord(this.f47969a, this.f47970b, this.f47971c, this.f47972d, this.f47973e, this.f47974f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19617a newBuilder() {
            C19617a aVar = new C19617a();
            aVar.f47969a = Internal.copyOf("added_reminders", this.added_reminders);
            aVar.f47970b = Internal.copyOf("deleted_reminders", this.deleted_reminders);
            aVar.f47971c = Internal.copyOf("updated_reminders", this.updated_reminders);
            aVar.f47972d = this.added_is_all_day;
            aVar.f47973e = this.deleted_is_all_day;
            aVar.f47974f = this.updated_is_all_day;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "ReminderRecord");
            StringBuilder sb = new StringBuilder();
            if (!this.added_reminders.isEmpty()) {
                sb.append(", added_reminders=");
                sb.append(this.added_reminders);
            }
            if (!this.deleted_reminders.isEmpty()) {
                sb.append(", deleted_reminders=");
                sb.append(this.deleted_reminders);
            }
            if (!this.updated_reminders.isEmpty()) {
                sb.append(", updated_reminders=");
                sb.append(this.updated_reminders);
            }
            if (this.added_is_all_day != null) {
                sb.append(", added_is_all_day=");
                sb.append(this.added_is_all_day);
            }
            if (this.deleted_is_all_day != null) {
                sb.append(", deleted_is_all_day=");
                sb.append(this.deleted_is_all_day);
            }
            if (this.updated_is_all_day != null) {
                sb.append(", updated_is_all_day=");
                sb.append(this.updated_is_all_day);
            }
            StringBuilder replace = sb.replace(0, 2, "ReminderRecord{");
            replace.append('}');
            return replace.toString();
        }

        public ReminderRecord(List<TodoReminder> list, List<TodoReminder> list2, List<TodoReminder> list3, Boolean bool, Boolean bool2, Boolean bool3) {
            this(list, list2, list3, bool, bool2, bool3, ByteString.EMPTY);
        }

        public ReminderRecord(List<TodoReminder> list, List<TodoReminder> list2, List<TodoReminder> list3, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.added_reminders = Internal.immutableCopyOf("added_reminders", list);
            this.deleted_reminders = Internal.immutableCopyOf("deleted_reminders", list2);
            this.updated_reminders = Internal.immutableCopyOf("updated_reminders", list3);
            this.added_is_all_day = bool;
            this.deleted_is_all_day = bool2;
            this.updated_is_all_day = bool3;
        }
    }

    public static final class TodoCompletedTimeRecord extends Message<TodoCompletedTimeRecord, C19619a> {
        public static final ProtoAdapter<TodoCompletedTimeRecord> ADAPTER = new C19620b();
        public static final Long DEFAULT_ADDED_COMPLETED_MILLI_TIME = 0L;
        public static final Long DEFAULT_DELETED_COMPLETED_MILLI_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long added_completed_milli_time;
        public final Long deleted_completed_milli_time;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$TodoCompletedTimeRecord$b */
        private static final class C19620b extends ProtoAdapter<TodoCompletedTimeRecord> {
            C19620b() {
                super(FieldEncoding.LENGTH_DELIMITED, TodoCompletedTimeRecord.class);
            }

            /* renamed from: a */
            public int encodedSize(TodoCompletedTimeRecord todoCompletedTimeRecord) {
                int i;
                int i2 = 0;
                if (todoCompletedTimeRecord.added_completed_milli_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, todoCompletedTimeRecord.added_completed_milli_time);
                } else {
                    i = 0;
                }
                if (todoCompletedTimeRecord.deleted_completed_milli_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, todoCompletedTimeRecord.deleted_completed_milli_time);
                }
                return i + i2 + todoCompletedTimeRecord.unknownFields().size();
            }

            /* renamed from: a */
            public TodoCompletedTimeRecord decode(ProtoReader protoReader) throws IOException {
                C19619a aVar = new C19619a();
                aVar.f47975a = 0L;
                aVar.f47976b = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47975a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47976b = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TodoCompletedTimeRecord todoCompletedTimeRecord) throws IOException {
                if (todoCompletedTimeRecord.added_completed_milli_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, todoCompletedTimeRecord.added_completed_milli_time);
                }
                if (todoCompletedTimeRecord.deleted_completed_milli_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, todoCompletedTimeRecord.deleted_completed_milli_time);
                }
                protoWriter.writeBytes(todoCompletedTimeRecord.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$TodoCompletedTimeRecord$a */
        public static final class C19619a extends Message.Builder<TodoCompletedTimeRecord, C19619a> {

            /* renamed from: a */
            public Long f47975a;

            /* renamed from: b */
            public Long f47976b;

            /* renamed from: a */
            public TodoCompletedTimeRecord build() {
                return new TodoCompletedTimeRecord(this.f47975a, this.f47976b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19619a newBuilder() {
            C19619a aVar = new C19619a();
            aVar.f47975a = this.added_completed_milli_time;
            aVar.f47976b = this.deleted_completed_milli_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "TodoCompletedTimeRecord");
            StringBuilder sb = new StringBuilder();
            if (this.added_completed_milli_time != null) {
                sb.append(", added_completed_milli_time=");
                sb.append(this.added_completed_milli_time);
            }
            if (this.deleted_completed_milli_time != null) {
                sb.append(", deleted_completed_milli_time=");
                sb.append(this.deleted_completed_milli_time);
            }
            StringBuilder replace = sb.replace(0, 2, "TodoCompletedTimeRecord{");
            replace.append('}');
            return replace.toString();
        }

        public TodoCompletedTimeRecord(Long l, Long l2) {
            this(l, l2, ByteString.EMPTY);
        }

        public TodoCompletedTimeRecord(Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.added_completed_milli_time = l;
            this.deleted_completed_milli_time = l2;
        }
    }

    public static final class UserCompletedTimeRecord extends Message<UserCompletedTimeRecord, C19621a> {
        public static final ProtoAdapter<UserCompletedTimeRecord> ADAPTER = new C19622b();
        public static final Long DEFAULT_COMPLETED_MILLI_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long completed_milli_time;
        public final TodoUser user;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$UserCompletedTimeRecord$b */
        private static final class C19622b extends ProtoAdapter<UserCompletedTimeRecord> {
            C19622b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserCompletedTimeRecord.class);
            }

            /* renamed from: a */
            public int encodedSize(UserCompletedTimeRecord userCompletedTimeRecord) {
                int i;
                int i2 = 0;
                if (userCompletedTimeRecord.user != null) {
                    i = TodoUser.ADAPTER.encodedSizeWithTag(1, userCompletedTimeRecord.user);
                } else {
                    i = 0;
                }
                if (userCompletedTimeRecord.completed_milli_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, userCompletedTimeRecord.completed_milli_time);
                }
                return i + i2 + userCompletedTimeRecord.unknownFields().size();
            }

            /* renamed from: a */
            public UserCompletedTimeRecord decode(ProtoReader protoReader) throws IOException {
                C19621a aVar = new C19621a();
                aVar.f47978b = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47977a = TodoUser.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47978b = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserCompletedTimeRecord userCompletedTimeRecord) throws IOException {
                if (userCompletedTimeRecord.user != null) {
                    TodoUser.ADAPTER.encodeWithTag(protoWriter, 1, userCompletedTimeRecord.user);
                }
                if (userCompletedTimeRecord.completed_milli_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, userCompletedTimeRecord.completed_milli_time);
                }
                protoWriter.writeBytes(userCompletedTimeRecord.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Record$UserCompletedTimeRecord$a */
        public static final class C19621a extends Message.Builder<UserCompletedTimeRecord, C19621a> {

            /* renamed from: a */
            public TodoUser f47977a;

            /* renamed from: b */
            public Long f47978b;

            /* renamed from: a */
            public UserCompletedTimeRecord build() {
                return new UserCompletedTimeRecord(this.f47977a, this.f47978b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19621a newBuilder() {
            C19621a aVar = new C19621a();
            aVar.f47977a = this.user;
            aVar.f47978b = this.completed_milli_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "UserCompletedTimeRecord");
            StringBuilder sb = new StringBuilder();
            if (this.user != null) {
                sb.append(", user=");
                sb.append(this.user);
            }
            if (this.completed_milli_time != null) {
                sb.append(", completed_milli_time=");
                sb.append(this.completed_milli_time);
            }
            StringBuilder replace = sb.replace(0, 2, "UserCompletedTimeRecord{");
            replace.append('}');
            return replace.toString();
        }

        public UserCompletedTimeRecord(TodoUser todoUser, Long l) {
            this(todoUser, l, ByteString.EMPTY);
        }

        public UserCompletedTimeRecord(TodoUser todoUser, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user = todoUser;
            this.completed_milli_time = l;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.Record$b */
    private static final class C19624b extends ProtoAdapter<Record> {
        C19624b() {
            super(FieldEncoding.LENGTH_DELIMITED, Record.class);
        }

        /* renamed from: a */
        public int encodedSize(Record record) {
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
            int i15 = 0;
            if (record.commit_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, record.commit_guid);
            } else {
                i = 0;
            }
            if (record.record_milli_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, record.record_milli_time);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (record.record_type != null) {
                i3 = RecordType.ADAPTER.encodedSizeWithTag(3, record.record_type);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (record.operator != null) {
                i4 = TodoUser.ADAPTER.encodedSizeWithTag(4, record.operator);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i17 + i4 + TodoAssignee.ADAPTER.asRepeated().encodedSizeWithTag(5, record.assignees);
            if (record.summary != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, record.summary);
            } else {
                i5 = 0;
            }
            int i18 = encodedSizeWithTag + i5;
            if (record.description != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, record.description);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (record.due_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, record.due_time);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (record.due_timezone != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, record.due_timezone);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (record.is_all_day != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, record.is_all_day);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag2 = i21 + i9 + TodoReminder.ADAPTER.asRepeated().encodedSizeWithTag(11, record.reminders);
            if (record.assignee_record != null) {
                i10 = AssigneeRecord.ADAPTER.encodedSizeWithTag(12, record.assignee_record);
            } else {
                i10 = 0;
            }
            int i22 = encodedSizeWithTag2 + i10;
            if (record.reminder_record != null) {
                i11 = ReminderRecord.ADAPTER.encodedSizeWithTag(13, record.reminder_record);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (record.rich_summary != null) {
                i12 = RichContent.ADAPTER.encodedSizeWithTag(15, record.rich_summary);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (record.follower_record != null) {
                i13 = FollowerRecord.ADAPTER.encodedSizeWithTag(16, record.follower_record);
            } else {
                i13 = 0;
            }
            int i25 = i24 + i13;
            if (record.rich_description != null) {
                i14 = RichContent.ADAPTER.encodedSizeWithTag(17, record.rich_description);
            } else {
                i14 = 0;
            }
            int i26 = i25 + i14;
            if (record.completed_milli_time != null) {
                i15 = TodoCompletedTimeRecord.ADAPTER.encodedSizeWithTag(18, record.completed_milli_time);
            }
            return i26 + i15 + UserCompletedTimeRecord.ADAPTER.asRepeated().encodedSizeWithTag(19, record.users_completed_milli_time) + record.unknownFields().size();
        }

        /* renamed from: a */
        public Record decode(ProtoReader protoReader) throws IOException {
            C19623a aVar = new C19623a();
            aVar.f47979a = "";
            aVar.f47980b = 0L;
            aVar.f47981c = RecordType.UNKNOWN;
            aVar.f47984f = "";
            aVar.f47985g = "";
            aVar.f47986h = 0L;
            aVar.f47987i = "";
            aVar.f47988j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47979a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47980b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f47981c = RecordType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f47982d = TodoUser.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47983e.add(TodoAssignee.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f47984f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47985g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47986h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47987i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47988j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47989k.add(TodoReminder.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47990l = AssigneeRecord.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f47991m = ReminderRecord.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 15:
                            aVar.f47992n = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f47993o = FollowerRecord.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f47994p = RichContent.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                            aVar.f47995q = TodoCompletedTimeRecord.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            aVar.f47996r.add(UserCompletedTimeRecord.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Record record) throws IOException {
            if (record.commit_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, record.commit_guid);
            }
            if (record.record_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, record.record_milli_time);
            }
            if (record.record_type != null) {
                RecordType.ADAPTER.encodeWithTag(protoWriter, 3, record.record_type);
            }
            if (record.operator != null) {
                TodoUser.ADAPTER.encodeWithTag(protoWriter, 4, record.operator);
            }
            TodoAssignee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, record.assignees);
            if (record.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, record.summary);
            }
            if (record.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, record.description);
            }
            if (record.due_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, record.due_time);
            }
            if (record.due_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, record.due_timezone);
            }
            if (record.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, record.is_all_day);
            }
            TodoReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, record.reminders);
            if (record.assignee_record != null) {
                AssigneeRecord.ADAPTER.encodeWithTag(protoWriter, 12, record.assignee_record);
            }
            if (record.reminder_record != null) {
                ReminderRecord.ADAPTER.encodeWithTag(protoWriter, 13, record.reminder_record);
            }
            if (record.rich_summary != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 15, record.rich_summary);
            }
            if (record.follower_record != null) {
                FollowerRecord.ADAPTER.encodeWithTag(protoWriter, 16, record.follower_record);
            }
            if (record.rich_description != null) {
                RichContent.ADAPTER.encodeWithTag(protoWriter, 17, record.rich_description);
            }
            if (record.completed_milli_time != null) {
                TodoCompletedTimeRecord.ADAPTER.encodeWithTag(protoWriter, 18, record.completed_milli_time);
            }
            UserCompletedTimeRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, record.users_completed_milli_time);
            protoWriter.writeBytes(record.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.Record$a */
    public static final class C19623a extends Message.Builder<Record, C19623a> {

        /* renamed from: a */
        public String f47979a;

        /* renamed from: b */
        public Long f47980b;

        /* renamed from: c */
        public RecordType f47981c;

        /* renamed from: d */
        public TodoUser f47982d;

        /* renamed from: e */
        public List<TodoAssignee> f47983e = Internal.newMutableList();

        /* renamed from: f */
        public String f47984f;

        /* renamed from: g */
        public String f47985g;

        /* renamed from: h */
        public Long f47986h;

        /* renamed from: i */
        public String f47987i;

        /* renamed from: j */
        public Boolean f47988j;

        /* renamed from: k */
        public List<TodoReminder> f47989k = Internal.newMutableList();

        /* renamed from: l */
        public AssigneeRecord f47990l;

        /* renamed from: m */
        public ReminderRecord f47991m;

        /* renamed from: n */
        public RichContent f47992n;

        /* renamed from: o */
        public FollowerRecord f47993o;

        /* renamed from: p */
        public RichContent f47994p;

        /* renamed from: q */
        public TodoCompletedTimeRecord f47995q;

        /* renamed from: r */
        public List<UserCompletedTimeRecord> f47996r = Internal.newMutableList();

        /* renamed from: a */
        public Record build() {
            return new Record(this.f47979a, this.f47980b, this.f47981c, this.f47982d, this.f47983e, this.f47984f, this.f47985g, this.f47986h, this.f47987i, this.f47988j, this.f47989k, this.f47990l, this.f47991m, this.f47992n, this.f47993o, this.f47994p, this.f47995q, this.f47996r, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19623a newBuilder() {
        C19623a aVar = new C19623a();
        aVar.f47979a = this.commit_guid;
        aVar.f47980b = this.record_milli_time;
        aVar.f47981c = this.record_type;
        aVar.f47982d = this.operator;
        aVar.f47983e = Internal.copyOf("assignees", this.assignees);
        aVar.f47984f = this.summary;
        aVar.f47985g = this.description;
        aVar.f47986h = this.due_time;
        aVar.f47987i = this.due_timezone;
        aVar.f47988j = this.is_all_day;
        aVar.f47989k = Internal.copyOf("reminders", this.reminders);
        aVar.f47990l = this.assignee_record;
        aVar.f47991m = this.reminder_record;
        aVar.f47992n = this.rich_summary;
        aVar.f47993o = this.follower_record;
        aVar.f47994p = this.rich_description;
        aVar.f47995q = this.completed_milli_time;
        aVar.f47996r = Internal.copyOf("users_completed_milli_time", this.users_completed_milli_time);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "Record");
        StringBuilder sb = new StringBuilder();
        if (this.commit_guid != null) {
            sb.append(", commit_guid=");
            sb.append(this.commit_guid);
        }
        if (this.record_milli_time != null) {
            sb.append(", record_milli_time=");
            sb.append(this.record_milli_time);
        }
        if (this.record_type != null) {
            sb.append(", record_type=");
            sb.append(this.record_type);
        }
        if (this.operator != null) {
            sb.append(", operator=");
            sb.append(this.operator);
        }
        if (!this.assignees.isEmpty()) {
            sb.append(", assignees=");
            sb.append(this.assignees);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
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
        if (!this.reminders.isEmpty()) {
            sb.append(", reminders=");
            sb.append(this.reminders);
        }
        if (this.assignee_record != null) {
            sb.append(", assignee_record=");
            sb.append(this.assignee_record);
        }
        if (this.reminder_record != null) {
            sb.append(", reminder_record=");
            sb.append(this.reminder_record);
        }
        if (this.rich_summary != null) {
            sb.append(", rich_summary=");
            sb.append(this.rich_summary);
        }
        if (this.follower_record != null) {
            sb.append(", follower_record=");
            sb.append(this.follower_record);
        }
        if (this.rich_description != null) {
            sb.append(", rich_description=");
            sb.append(this.rich_description);
        }
        if (this.completed_milli_time != null) {
            sb.append(", completed_milli_time=");
            sb.append(this.completed_milli_time);
        }
        if (!this.users_completed_milli_time.isEmpty()) {
            sb.append(", users_completed_milli_time=");
            sb.append(this.users_completed_milli_time);
        }
        StringBuilder replace = sb.replace(0, 2, "Record{");
        replace.append('}');
        return replace.toString();
    }

    public Record(String str, Long l, RecordType recordType, TodoUser todoUser, List<TodoAssignee> list, String str2, String str3, Long l2, String str4, Boolean bool, List<TodoReminder> list2, AssigneeRecord assigneeRecord, ReminderRecord reminderRecord, RichContent richContent, FollowerRecord followerRecord, RichContent richContent2, TodoCompletedTimeRecord todoCompletedTimeRecord, List<UserCompletedTimeRecord> list3) {
        this(str, l, recordType, todoUser, list, str2, str3, l2, str4, bool, list2, assigneeRecord, reminderRecord, richContent, followerRecord, richContent2, todoCompletedTimeRecord, list3, ByteString.EMPTY);
    }

    public Record(String str, Long l, RecordType recordType, TodoUser todoUser, List<TodoAssignee> list, String str2, String str3, Long l2, String str4, Boolean bool, List<TodoReminder> list2, AssigneeRecord assigneeRecord, ReminderRecord reminderRecord, RichContent richContent, FollowerRecord followerRecord, RichContent richContent2, TodoCompletedTimeRecord todoCompletedTimeRecord, List<UserCompletedTimeRecord> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.commit_guid = str;
        this.record_milli_time = l;
        this.record_type = recordType;
        this.operator = todoUser;
        this.assignees = Internal.immutableCopyOf("assignees", list);
        this.summary = str2;
        this.description = str3;
        this.due_time = l2;
        this.due_timezone = str4;
        this.is_all_day = bool;
        this.reminders = Internal.immutableCopyOf("reminders", list2);
        this.assignee_record = assigneeRecord;
        this.reminder_record = reminderRecord;
        this.rich_summary = richContent;
        this.follower_record = followerRecord;
        this.rich_description = richContent2;
        this.completed_milli_time = todoCompletedTimeRecord;
        this.users_completed_milli_time = Internal.immutableCopyOf("users_completed_milli_time", list3);
    }
}
