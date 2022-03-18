package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CalendarMemberCommit extends Message<CalendarMemberCommit, C15552a> {
    public static final ProtoAdapter<CalendarMemberCommit> ADAPTER = new C15553b();
    public static final Calendar.AccessRole DEFAULT_ACCESS_ROLE = Calendar.AccessRole.FREE_BUSY_READER;
    public static final CalendarMemberType DEFAULT_MEMBER_TYPE = CalendarMemberType.INDIVIDUAL;
    private static final long serialVersionUID = 0;
    public final Calendar.AccessRole access_role;
    public final Group group;
    public final CalendarMemberType member_type;
    public final User user;

    public enum CalendarMemberType implements WireEnum {
        INDIVIDUAL(1),
        GROUP(2);
        
        public static final ProtoAdapter<CalendarMemberType> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarMemberType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CalendarMemberType fromValue(int i) {
            if (i == 1) {
                return INDIVIDUAL;
            }
            if (i != 2) {
                return null;
            }
            return GROUP;
        }

        private CalendarMemberType(int i) {
            this.value = i;
        }
    }

    public static final class Group extends Message<Group, C15548a> {
        public static final ProtoAdapter<Group> ADAPTER = new C15549b();
        private static final long serialVersionUID = 0;
        public final String group_id;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit$Group$b */
        private static final class C15549b extends ProtoAdapter<Group> {
            C15549b() {
                super(FieldEncoding.LENGTH_DELIMITED, Group.class);
            }

            /* renamed from: a */
            public int encodedSize(Group group) {
                int i;
                if (group.group_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, group.group_id);
                } else {
                    i = 0;
                }
                return i + group.unknownFields().size();
            }

            /* renamed from: a */
            public Group decode(ProtoReader protoReader) throws IOException {
                C15548a aVar = new C15548a();
                aVar.f41228a = "";
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
                        aVar.f41228a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Group group) throws IOException {
                if (group.group_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, group.group_id);
                }
                protoWriter.writeBytes(group.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit$Group$a */
        public static final class C15548a extends Message.Builder<Group, C15548a> {

            /* renamed from: a */
            public String f41228a;

            /* renamed from: a */
            public Group build() {
                return new Group(this.f41228a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15548a mo56404a(String str) {
                this.f41228a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15548a newBuilder() {
            C15548a aVar = new C15548a();
            aVar.f41228a = this.group_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "Group");
            StringBuilder sb = new StringBuilder();
            if (this.group_id != null) {
                sb.append(", group_id=");
                sb.append(this.group_id);
            }
            StringBuilder replace = sb.replace(0, 2, "Group{");
            replace.append('}');
            return replace.toString();
        }

        public Group(String str) {
            this(str, ByteString.EMPTY);
        }

        public Group(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.group_id = str;
        }
    }

    public static final class User extends Message<User, C15550a> {
        public static final ProtoAdapter<User> ADAPTER = new C15551b();
        private static final long serialVersionUID = 0;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit$User$b */
        private static final class C15551b extends ProtoAdapter<User> {
            C15551b() {
                super(FieldEncoding.LENGTH_DELIMITED, User.class);
            }

            /* renamed from: a */
            public int encodedSize(User user) {
                int i;
                if (user.user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, user.user_id);
                } else {
                    i = 0;
                }
                return i + user.unknownFields().size();
            }

            /* renamed from: a */
            public User decode(ProtoReader protoReader) throws IOException {
                C15550a aVar = new C15550a();
                aVar.f41229a = "";
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
                        aVar.f41229a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, User user) throws IOException {
                if (user.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, user.user_id);
                }
                protoWriter.writeBytes(user.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit$User$a */
        public static final class C15550a extends Message.Builder<User, C15550a> {

            /* renamed from: a */
            public String f41229a;

            /* renamed from: a */
            public User build() {
                return new User(this.f41229a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15550a mo56409a(String str) {
                this.f41229a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15550a newBuilder() {
            C15550a aVar = new C15550a();
            aVar.f41229a = this.user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "User");
            StringBuilder sb = new StringBuilder();
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            StringBuilder replace = sb.replace(0, 2, "User{");
            replace.append('}');
            return replace.toString();
        }

        public User(String str) {
            this(str, ByteString.EMPTY);
        }

        public User(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit$b */
    private static final class C15553b extends ProtoAdapter<CalendarMemberCommit> {
        C15553b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarMemberCommit.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarMemberCommit calendarMemberCommit) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (calendarMemberCommit.member_type != null) {
                i = CalendarMemberType.ADAPTER.encodedSizeWithTag(1, calendarMemberCommit.member_type);
            } else {
                i = 0;
            }
            if (calendarMemberCommit.access_role != null) {
                i2 = Calendar.AccessRole.ADAPTER.encodedSizeWithTag(2, calendarMemberCommit.access_role);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (calendarMemberCommit.user != null) {
                i3 = User.ADAPTER.encodedSizeWithTag(100, calendarMemberCommit.user);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (calendarMemberCommit.group != null) {
                i4 = Group.ADAPTER.encodedSizeWithTag(101, calendarMemberCommit.group);
            }
            return i6 + i4 + calendarMemberCommit.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarMemberCommit decode(ProtoReader protoReader) throws IOException {
            C15552a aVar = new C15552a();
            aVar.f41230a = CalendarMemberType.INDIVIDUAL;
            aVar.f41231b = Calendar.AccessRole.FREE_BUSY_READER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f41230a = CalendarMemberType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f41231b = Calendar.AccessRole.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 100) {
                    aVar.mo56417a(User.ADAPTER.decode(protoReader));
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo56416a(Group.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarMemberCommit calendarMemberCommit) throws IOException {
            if (calendarMemberCommit.member_type != null) {
                CalendarMemberType.ADAPTER.encodeWithTag(protoWriter, 1, calendarMemberCommit.member_type);
            }
            if (calendarMemberCommit.access_role != null) {
                Calendar.AccessRole.ADAPTER.encodeWithTag(protoWriter, 2, calendarMemberCommit.access_role);
            }
            if (calendarMemberCommit.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter, 100, calendarMemberCommit.user);
            }
            if (calendarMemberCommit.group != null) {
                Group.ADAPTER.encodeWithTag(protoWriter, 101, calendarMemberCommit.group);
            }
            protoWriter.writeBytes(calendarMemberCommit.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15552a newBuilder() {
        C15552a aVar = new C15552a();
        aVar.f41230a = this.member_type;
        aVar.f41231b = this.access_role;
        aVar.f41232c = this.user;
        aVar.f41233d = this.group;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit$a */
    public static final class C15552a extends Message.Builder<CalendarMemberCommit, C15552a> {

        /* renamed from: a */
        public CalendarMemberType f41230a;

        /* renamed from: b */
        public Calendar.AccessRole f41231b;

        /* renamed from: c */
        public User f41232c;

        /* renamed from: d */
        public Group f41233d;

        /* renamed from: a */
        public CalendarMemberCommit build() {
            return new CalendarMemberCommit(this.f41230a, this.f41231b, this.f41232c, this.f41233d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15552a mo56414a(Calendar.AccessRole accessRole) {
            this.f41231b = accessRole;
            return this;
        }

        /* renamed from: a */
        public C15552a mo56415a(CalendarMemberType calendarMemberType) {
            this.f41230a = calendarMemberType;
            return this;
        }

        /* renamed from: a */
        public C15552a mo56416a(Group group) {
            this.f41233d = group;
            this.f41232c = null;
            return this;
        }

        /* renamed from: a */
        public C15552a mo56417a(User user) {
            this.f41232c = user;
            this.f41233d = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarMemberCommit");
        StringBuilder sb = new StringBuilder();
        if (this.member_type != null) {
            sb.append(", member_type=");
            sb.append(this.member_type);
        }
        if (this.access_role != null) {
            sb.append(", access_role=");
            sb.append(this.access_role);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.group != null) {
            sb.append(", group=");
            sb.append(this.group);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarMemberCommit{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarMemberCommit(CalendarMemberType calendarMemberType, Calendar.AccessRole accessRole, User user2, Group group2) {
        this(calendarMemberType, accessRole, user2, group2, ByteString.EMPTY);
    }

    public CalendarMemberCommit(CalendarMemberType calendarMemberType, Calendar.AccessRole accessRole, User user2, Group group2, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(user2, group2) <= 1) {
            this.member_type = calendarMemberType;
            this.access_role = accessRole;
            this.user = user2;
            this.group = group2;
            return;
        }
        throw new IllegalArgumentException("at most one of user, group may be non-null");
    }
}
