package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class Commit extends Message<Commit, C19473a> {
    public static final ProtoAdapter<Commit> ADAPTER = new C19474b();
    public static final ByteString DEFAULT_ADDED = ByteString.EMPTY;
    public static final Long DEFAULT_CLIENT_MILLI_TIME = 0L;
    public static final DataType DEFAULT_DATA_TYPE = DataType.UNKNOWN_DATA_TYPE;
    public static final ByteString DEFAULT_DELETED = ByteString.EMPTY;
    public static final Key DEFAULT_KEY = Key.UNKNOWN_KEY;
    public static final ObjType DEFAULT_OBJ_TYPE = ObjType.UNKNOWN_OBJ_TYPE;
    public static final OwnerType DEFAULT_OWNER_TYPE = OwnerType.UNKNOWN_OWNER_TYPE;
    public static final Platform DEFAULT_PLATFORM = Platform.UNKNOWN_PLATFORM;
    public static final Long DEFAULT_SERVER_MILLI_TIME = 0L;
    public static final TodoSource DEFAULT_SOURCE = TodoSource.TODO;
    private static final long serialVersionUID = 0;
    public final ByteString added;
    public final Long client_milli_time;
    public final DataType data_type;
    public final ByteString deleted;
    public final String guid;
    public final Key key;
    public final String obj_guid;
    public final ObjType obj_type;
    public final String operation_guid;
    public final String owner_id;
    public final OwnerType owner_type;
    public final Platform platform;
    public final Long server_milli_time;
    public final TodoSource source;
    public final String version;

    public enum DataType implements WireEnum {
        UNKNOWN_DATA_TYPE(0),
        INT_32(1),
        INT_64(2),
        STRING(3),
        BOOL(4),
        BYTES(5),
        VEC(6),
        DUE_TIME(7),
        REMINDER(8),
        ORIGIN(9);
        
        public static final ProtoAdapter<DataType> ADAPTER = ProtoAdapter.newEnumAdapter(DataType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DataType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_DATA_TYPE;
                case 1:
                    return INT_32;
                case 2:
                    return INT_64;
                case 3:
                    return STRING;
                case 4:
                    return BOOL;
                case 5:
                    return BYTES;
                case 6:
                    return VEC;
                case 7:
                    return DUE_TIME;
                case 8:
                    return REMINDER;
                case 9:
                    return ORIGIN;
                default:
                    return null;
            }
        }

        private DataType(int i) {
            this.value = i;
        }
    }

    public enum Key implements WireEnum {
        UNKNOWN_KEY(0),
        TODO_GUID(1),
        TODO_SUMMARY(2),
        TODO_DESCRIPTION(3),
        TODO_DOC_DESCRIPTION(4),
        TODO_ASSIGNEES(5),
        TODO_REMINDERS(6),
        TODO_DUE_TIME(7),
        TODO_DELETED_TIME(8),
        TODO_COMPLETED_TIME(9),
        TODO_COMPLETE_MODE(10),
        TODO_EXTRA(11),
        TODO_ITEMS(12),
        TODO_BLOCK_ID(13),
        TODO_SOURCE(14),
        TODO_SOURCE_ID(15),
        TODO_RICH_SUMMARY(17),
        TODO_RICH_DESCRIPTION(18),
        TODO_REFER_RESOURCE_IDS(19),
        TODO_FOLLOWERS(20),
        TODO_ORIGIN(21),
        TODO_CAN_EDIT(22),
        TODO_COMPLETED_MILLI_TIME(23),
        TODO_USERS_COMPLETED_MILLI_TIME(24),
        TODO_CUSTOM(25),
        TODO_LIST_GUID(501),
        TODO_LIST_SUMMARY(502),
        TODO_LIST_ITEMS(503),
        TODO_LIST_TYPE(504),
        TODO_LIST_MEMBERS(505),
        TODO_LIST_RICH_SUMMARY(506),
        TODO_LIST_RICH_DESCRIPTION(507);
        
        public static final ProtoAdapter<Key> ADAPTER = ProtoAdapter.newEnumAdapter(Key.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Key fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEY;
                case 1:
                    return TODO_GUID;
                case 2:
                    return TODO_SUMMARY;
                case 3:
                    return TODO_DESCRIPTION;
                case 4:
                    return TODO_DOC_DESCRIPTION;
                case 5:
                    return TODO_ASSIGNEES;
                case 6:
                    return TODO_REMINDERS;
                case 7:
                    return TODO_DUE_TIME;
                case 8:
                    return TODO_DELETED_TIME;
                case 9:
                    return TODO_COMPLETED_TIME;
                case 10:
                    return TODO_COMPLETE_MODE;
                case 11:
                    return TODO_EXTRA;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return TODO_ITEMS;
                case 13:
                    return TODO_BLOCK_ID;
                case 14:
                    return TODO_SOURCE;
                case 15:
                    return TODO_SOURCE_ID;
                default:
                    switch (i) {
                        case 17:
                            return TODO_RICH_SUMMARY;
                        case 18:
                            return TODO_RICH_DESCRIPTION;
                        case 19:
                            return TODO_REFER_RESOURCE_IDS;
                        case 20:
                            return TODO_FOLLOWERS;
                        case 21:
                            return TODO_ORIGIN;
                        case 22:
                            return TODO_CAN_EDIT;
                        case 23:
                            return TODO_COMPLETED_MILLI_TIME;
                        case 24:
                            return TODO_USERS_COMPLETED_MILLI_TIME;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            return TODO_CUSTOM;
                        default:
                            switch (i) {
                                case 501:
                                    return TODO_LIST_GUID;
                                case 502:
                                    return TODO_LIST_SUMMARY;
                                case 503:
                                    return TODO_LIST_ITEMS;
                                case 504:
                                    return TODO_LIST_TYPE;
                                case 505:
                                    return TODO_LIST_MEMBERS;
                                case 506:
                                    return TODO_LIST_RICH_SUMMARY;
                                case 507:
                                    return TODO_LIST_RICH_DESCRIPTION;
                                default:
                                    return null;
                            }
                    }
            }
        }

        private Key(int i) {
            this.value = i;
        }
    }

    public enum ObjType implements WireEnum {
        UNKNOWN_OBJ_TYPE(0),
        TODO(1),
        TODO_LIST(2);
        
        public static final ProtoAdapter<ObjType> ADAPTER = ProtoAdapter.newEnumAdapter(ObjType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ObjType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_OBJ_TYPE;
            }
            if (i == 1) {
                return TODO;
            }
            if (i != 2) {
                return null;
            }
            return TODO_LIST;
        }

        private ObjType(int i) {
            this.value = i;
        }
    }

    public enum OwnerType implements WireEnum {
        UNKNOWN_OWNER_TYPE(0),
        USER(1),
        BOT(2);
        
        public static final ProtoAdapter<OwnerType> ADAPTER = ProtoAdapter.newEnumAdapter(OwnerType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OwnerType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_OWNER_TYPE;
            }
            if (i == 1) {
                return USER;
            }
            if (i != 2) {
                return null;
            }
            return BOT;
        }

        private OwnerType(int i) {
            this.value = i;
        }
    }

    public enum Platform implements WireEnum {
        UNKNOWN_PLATFORM(0),
        MAC(1),
        WINDOWS(2),
        IPHONE(3),
        ANDROID(4),
        LINUX(5),
        WEB(6),
        OPEN_PLATFORM(7);
        
        public static final ProtoAdapter<Platform> ADAPTER = ProtoAdapter.newEnumAdapter(Platform.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Platform fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_PLATFORM;
                case 1:
                    return MAC;
                case 2:
                    return WINDOWS;
                case 3:
                    return IPHONE;
                case 4:
                    return ANDROID;
                case 5:
                    return LINUX;
                case 6:
                    return WEB;
                case 7:
                    return OPEN_PLATFORM;
                default:
                    return null;
            }
        }

        private Platform(int i) {
            this.value = i;
        }
    }

    public static final class DataTypeBool extends Message<DataTypeBool, C19457a> {
        public static final ProtoAdapter<DataTypeBool> ADAPTER = new C19458b();
        public static final Boolean DEFAULT_VALUE = false;
        private static final long serialVersionUID = 0;
        public final Boolean value;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeBool$b */
        private static final class C19458b extends ProtoAdapter<DataTypeBool> {
            C19458b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeBool.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeBool dataTypeBool) {
                int i;
                if (dataTypeBool.value != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, dataTypeBool.value);
                } else {
                    i = 0;
                }
                return i + dataTypeBool.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeBool decode(ProtoReader protoReader) throws IOException {
                C19457a aVar = new C19457a();
                aVar.f47793a = false;
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
                        aVar.f47793a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeBool dataTypeBool) throws IOException {
                if (dataTypeBool.value != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, dataTypeBool.value);
                }
                protoWriter.writeBytes(dataTypeBool.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeBool$a */
        public static final class C19457a extends Message.Builder<DataTypeBool, C19457a> {

            /* renamed from: a */
            public Boolean f47793a;

            /* renamed from: a */
            public DataTypeBool build() {
                return new DataTypeBool(this.f47793a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19457a newBuilder() {
            C19457a aVar = new C19457a();
            aVar.f47793a = this.value;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeBool");
            StringBuilder sb = new StringBuilder();
            if (this.value != null) {
                sb.append(", value=");
                sb.append(this.value);
            }
            StringBuilder replace = sb.replace(0, 2, "DataTypeBool{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeBool(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public DataTypeBool(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.value = bool;
        }
    }

    public static final class DataTypeDueTime extends Message<DataTypeDueTime, C19459a> {
        public static final ProtoAdapter<DataTypeDueTime> ADAPTER = new C19460b();
        public static final Long DEFAULT_DUE_TIME = 0L;
        public static final Boolean DEFAULT_IS_ALL_DAY = false;
        private static final long serialVersionUID = 0;
        public final Long due_time;
        public final String due_timezone;
        public final Boolean is_all_day;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeDueTime$b */
        private static final class C19460b extends ProtoAdapter<DataTypeDueTime> {
            C19460b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeDueTime.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeDueTime dataTypeDueTime) {
                int i;
                int i2;
                int i3 = 0;
                if (dataTypeDueTime.due_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, dataTypeDueTime.due_time);
                } else {
                    i = 0;
                }
                if (dataTypeDueTime.due_timezone != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, dataTypeDueTime.due_timezone);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (dataTypeDueTime.is_all_day != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, dataTypeDueTime.is_all_day);
                }
                return i4 + i3 + dataTypeDueTime.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeDueTime decode(ProtoReader protoReader) throws IOException {
                C19459a aVar = new C19459a();
                aVar.f47794a = 0L;
                aVar.f47795b = "";
                aVar.f47796c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47794a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f47795b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47796c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeDueTime dataTypeDueTime) throws IOException {
                if (dataTypeDueTime.due_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, dataTypeDueTime.due_time);
                }
                if (dataTypeDueTime.due_timezone != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, dataTypeDueTime.due_timezone);
                }
                if (dataTypeDueTime.is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, dataTypeDueTime.is_all_day);
                }
                protoWriter.writeBytes(dataTypeDueTime.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeDueTime$a */
        public static final class C19459a extends Message.Builder<DataTypeDueTime, C19459a> {

            /* renamed from: a */
            public Long f47794a;

            /* renamed from: b */
            public String f47795b;

            /* renamed from: c */
            public Boolean f47796c;

            /* renamed from: a */
            public DataTypeDueTime build() {
                return new DataTypeDueTime(this.f47794a, this.f47795b, this.f47796c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19459a newBuilder() {
            C19459a aVar = new C19459a();
            aVar.f47794a = this.due_time;
            aVar.f47795b = this.due_timezone;
            aVar.f47796c = this.is_all_day;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeDueTime");
            StringBuilder sb = new StringBuilder();
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
            StringBuilder replace = sb.replace(0, 2, "DataTypeDueTime{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeDueTime(Long l, String str, Boolean bool) {
            this(l, str, bool, ByteString.EMPTY);
        }

        public DataTypeDueTime(Long l, String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.due_time = l;
            this.due_timezone = str;
            this.is_all_day = bool;
        }
    }

    public static final class DataTypeInt32 extends Message<DataTypeInt32, C19461a> {
        public static final ProtoAdapter<DataTypeInt32> ADAPTER = new C19462b();
        public static final Integer DEFAULT_VALUE = 0;
        private static final long serialVersionUID = 0;
        public final Integer value;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeInt32$b */
        private static final class C19462b extends ProtoAdapter<DataTypeInt32> {
            C19462b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeInt32.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeInt32 dataTypeInt32) {
                int i;
                if (dataTypeInt32.value != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, dataTypeInt32.value);
                } else {
                    i = 0;
                }
                return i + dataTypeInt32.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeInt32 decode(ProtoReader protoReader) throws IOException {
                C19461a aVar = new C19461a();
                aVar.f47797a = 0;
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
                        aVar.f47797a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeInt32 dataTypeInt32) throws IOException {
                if (dataTypeInt32.value != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, dataTypeInt32.value);
                }
                protoWriter.writeBytes(dataTypeInt32.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeInt32$a */
        public static final class C19461a extends Message.Builder<DataTypeInt32, C19461a> {

            /* renamed from: a */
            public Integer f47797a;

            /* renamed from: a */
            public DataTypeInt32 build() {
                return new DataTypeInt32(this.f47797a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19461a newBuilder() {
            C19461a aVar = new C19461a();
            aVar.f47797a = this.value;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeInt32");
            StringBuilder sb = new StringBuilder();
            if (this.value != null) {
                sb.append(", value=");
                sb.append(this.value);
            }
            StringBuilder replace = sb.replace(0, 2, "DataTypeInt32{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeInt32(Integer num) {
            this(num, ByteString.EMPTY);
        }

        public DataTypeInt32(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.value = num;
        }
    }

    public static final class DataTypeInt64 extends Message<DataTypeInt64, C19463a> {
        public static final ProtoAdapter<DataTypeInt64> ADAPTER = new C19464b();
        private static final long serialVersionUID = 0;
        public final String value;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeInt64$b */
        private static final class C19464b extends ProtoAdapter<DataTypeInt64> {
            C19464b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeInt64.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeInt64 dataTypeInt64) {
                int i;
                if (dataTypeInt64.value != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, dataTypeInt64.value);
                } else {
                    i = 0;
                }
                return i + dataTypeInt64.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeInt64 decode(ProtoReader protoReader) throws IOException {
                C19463a aVar = new C19463a();
                aVar.f47798a = "";
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
                        aVar.f47798a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeInt64 dataTypeInt64) throws IOException {
                if (dataTypeInt64.value != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dataTypeInt64.value);
                }
                protoWriter.writeBytes(dataTypeInt64.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeInt64$a */
        public static final class C19463a extends Message.Builder<DataTypeInt64, C19463a> {

            /* renamed from: a */
            public String f47798a;

            /* renamed from: a */
            public DataTypeInt64 build() {
                return new DataTypeInt64(this.f47798a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19463a newBuilder() {
            C19463a aVar = new C19463a();
            aVar.f47798a = this.value;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeInt64");
            StringBuilder sb = new StringBuilder();
            if (this.value != null) {
                sb.append(", value=");
                sb.append(this.value);
            }
            StringBuilder replace = sb.replace(0, 2, "DataTypeInt64{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeInt64(String str) {
            this(str, ByteString.EMPTY);
        }

        public DataTypeInt64(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.value = str;
        }
    }

    public static final class DataTypeReminder extends Message<DataTypeReminder, C19465a> {
        public static final ProtoAdapter<DataTypeReminder> ADAPTER = new C19466b();
        public static final Boolean DEFAULT_IS_ALL_DAY = false;
        private static final long serialVersionUID = 0;
        public final Boolean is_all_day;
        public final List<TodoReminder> reminders;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeReminder$b */
        private static final class C19466b extends ProtoAdapter<DataTypeReminder> {
            C19466b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeReminder.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeReminder dataTypeReminder) {
                int i;
                int encodedSizeWithTag = TodoReminder.ADAPTER.asRepeated().encodedSizeWithTag(1, dataTypeReminder.reminders);
                if (dataTypeReminder.is_all_day != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(2, dataTypeReminder.is_all_day);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + dataTypeReminder.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeReminder decode(ProtoReader protoReader) throws IOException {
                C19465a aVar = new C19465a();
                aVar.f47800b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47799a.add(TodoReminder.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47800b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeReminder dataTypeReminder) throws IOException {
                TodoReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, dataTypeReminder.reminders);
                if (dataTypeReminder.is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, dataTypeReminder.is_all_day);
                }
                protoWriter.writeBytes(dataTypeReminder.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeReminder$a */
        public static final class C19465a extends Message.Builder<DataTypeReminder, C19465a> {

            /* renamed from: a */
            public List<TodoReminder> f47799a = Internal.newMutableList();

            /* renamed from: b */
            public Boolean f47800b;

            /* renamed from: a */
            public DataTypeReminder build() {
                return new DataTypeReminder(this.f47799a, this.f47800b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19465a newBuilder() {
            C19465a aVar = new C19465a();
            aVar.f47799a = Internal.copyOf("reminders", this.reminders);
            aVar.f47800b = this.is_all_day;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeReminder");
            StringBuilder sb = new StringBuilder();
            if (!this.reminders.isEmpty()) {
                sb.append(", reminders=");
                sb.append(this.reminders);
            }
            if (this.is_all_day != null) {
                sb.append(", is_all_day=");
                sb.append(this.is_all_day);
            }
            StringBuilder replace = sb.replace(0, 2, "DataTypeReminder{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeReminder(List<TodoReminder> list, Boolean bool) {
            this(list, bool, ByteString.EMPTY);
        }

        public DataTypeReminder(List<TodoReminder> list, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.reminders = Internal.immutableCopyOf("reminders", list);
            this.is_all_day = bool;
        }
    }

    public static final class DataTypeString extends Message<DataTypeString, C19467a> {
        public static final ProtoAdapter<DataTypeString> ADAPTER = new C19468b();
        private static final long serialVersionUID = 0;
        public final String value;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeString$b */
        private static final class C19468b extends ProtoAdapter<DataTypeString> {
            C19468b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeString.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeString dataTypeString) {
                int i;
                if (dataTypeString.value != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, dataTypeString.value);
                } else {
                    i = 0;
                }
                return i + dataTypeString.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeString decode(ProtoReader protoReader) throws IOException {
                C19467a aVar = new C19467a();
                aVar.f47801a = "";
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
                        aVar.f47801a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeString dataTypeString) throws IOException {
                if (dataTypeString.value != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dataTypeString.value);
                }
                protoWriter.writeBytes(dataTypeString.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeString$a */
        public static final class C19467a extends Message.Builder<DataTypeString, C19467a> {

            /* renamed from: a */
            public String f47801a;

            /* renamed from: a */
            public DataTypeString build() {
                return new DataTypeString(this.f47801a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19467a newBuilder() {
            C19467a aVar = new C19467a();
            aVar.f47801a = this.value;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeString");
            StringBuilder sb = new StringBuilder();
            if (this.value != null) {
                sb.append(", value=");
                sb.append(this.value);
            }
            StringBuilder replace = sb.replace(0, 2, "DataTypeString{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeString(String str) {
            this(str, ByteString.EMPTY);
        }

        public DataTypeString(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.value = str;
        }
    }

    public static final class DataTypeUserCompletedMilliTime extends Message<DataTypeUserCompletedMilliTime, C19469a> {
        public static final ProtoAdapter<DataTypeUserCompletedMilliTime> ADAPTER = new C19470b();
        public static final Long DEFAULT_COMPLETED_MILLI_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long completed_milli_time;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeUserCompletedMilliTime$b */
        private static final class C19470b extends ProtoAdapter<DataTypeUserCompletedMilliTime> {
            C19470b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeUserCompletedMilliTime.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeUserCompletedMilliTime dataTypeUserCompletedMilliTime) {
                int i;
                int i2 = 0;
                if (dataTypeUserCompletedMilliTime.user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, dataTypeUserCompletedMilliTime.user_id);
                } else {
                    i = 0;
                }
                if (dataTypeUserCompletedMilliTime.completed_milli_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, dataTypeUserCompletedMilliTime.completed_milli_time);
                }
                return i + i2 + dataTypeUserCompletedMilliTime.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeUserCompletedMilliTime decode(ProtoReader protoReader) throws IOException {
                C19469a aVar = new C19469a();
                aVar.f47802a = "";
                aVar.f47803b = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47802a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47803b = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeUserCompletedMilliTime dataTypeUserCompletedMilliTime) throws IOException {
                if (dataTypeUserCompletedMilliTime.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dataTypeUserCompletedMilliTime.user_id);
                }
                if (dataTypeUserCompletedMilliTime.completed_milli_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, dataTypeUserCompletedMilliTime.completed_milli_time);
                }
                protoWriter.writeBytes(dataTypeUserCompletedMilliTime.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeUserCompletedMilliTime$a */
        public static final class C19469a extends Message.Builder<DataTypeUserCompletedMilliTime, C19469a> {

            /* renamed from: a */
            public String f47802a;

            /* renamed from: b */
            public Long f47803b;

            /* renamed from: a */
            public DataTypeUserCompletedMilliTime build() {
                return new DataTypeUserCompletedMilliTime(this.f47802a, this.f47803b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19469a newBuilder() {
            C19469a aVar = new C19469a();
            aVar.f47802a = this.user_id;
            aVar.f47803b = this.completed_milli_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeUserCompletedMilliTime");
            StringBuilder sb = new StringBuilder();
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.completed_milli_time != null) {
                sb.append(", completed_milli_time=");
                sb.append(this.completed_milli_time);
            }
            StringBuilder replace = sb.replace(0, 2, "DataTypeUserCompletedMilliTime{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeUserCompletedMilliTime(String str, Long l) {
            this(str, l, ByteString.EMPTY);
        }

        public DataTypeUserCompletedMilliTime(String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
            this.completed_milli_time = l;
        }
    }

    public static final class DataTypeVec extends Message<DataTypeVec, C19471a> {
        public static final ProtoAdapter<DataTypeVec> ADAPTER = new C19472b();
        private static final long serialVersionUID = 0;
        public final List<ByteString> values;

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeVec$b */
        private static final class C19472b extends ProtoAdapter<DataTypeVec> {
            C19472b() {
                super(FieldEncoding.LENGTH_DELIMITED, DataTypeVec.class);
            }

            /* renamed from: a */
            public int encodedSize(DataTypeVec dataTypeVec) {
                return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(1, dataTypeVec.values) + dataTypeVec.unknownFields().size();
            }

            /* renamed from: a */
            public DataTypeVec decode(ProtoReader protoReader) throws IOException {
                C19471a aVar = new C19471a();
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
                        aVar.f47804a.add(ProtoAdapter.BYTES.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DataTypeVec dataTypeVec) throws IOException {
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 1, dataTypeVec.values);
                protoWriter.writeBytes(dataTypeVec.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$DataTypeVec$a */
        public static final class C19471a extends Message.Builder<DataTypeVec, C19471a> {

            /* renamed from: a */
            public List<ByteString> f47804a = Internal.newMutableList();

            /* renamed from: a */
            public DataTypeVec build() {
                return new DataTypeVec(this.f47804a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19471a newBuilder() {
            C19471a aVar = new C19471a();
            aVar.f47804a = Internal.copyOf("values", this.values);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "DataTypeVec");
            StringBuilder sb = new StringBuilder();
            if (!this.values.isEmpty()) {
                sb.append(", values=");
                sb.append(this.values);
            }
            StringBuilder replace = sb.replace(0, 2, "DataTypeVec{");
            replace.append('}');
            return replace.toString();
        }

        public DataTypeVec(List<ByteString> list) {
            this(list, ByteString.EMPTY);
        }

        public DataTypeVec(List<ByteString> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.values = Internal.immutableCopyOf("values", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$b */
    private static final class C19474b extends ProtoAdapter<Commit> {
        C19474b() {
            super(FieldEncoding.LENGTH_DELIMITED, Commit.class);
        }

        /* renamed from: a */
        public int encodedSize(Commit commit) {
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
            if (commit.guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, commit.guid);
            } else {
                i = 0;
            }
            if (commit.version != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, commit.version);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (commit.obj_type != null) {
                i3 = ObjType.ADAPTER.encodedSizeWithTag(3, commit.obj_type);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (commit.obj_guid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, commit.obj_guid);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (commit.key != null) {
                i5 = Key.ADAPTER.encodedSizeWithTag(5, commit.key);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (commit.data_type != null) {
                i6 = DataType.ADAPTER.encodedSizeWithTag(6, commit.data_type);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (commit.deleted != null) {
                i7 = ProtoAdapter.BYTES.encodedSizeWithTag(7, commit.deleted);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (commit.added != null) {
                i8 = ProtoAdapter.BYTES.encodedSizeWithTag(8, commit.added);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (commit.client_milli_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, commit.client_milli_time);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (commit.platform != null) {
                i10 = Platform.ADAPTER.encodedSizeWithTag(10, commit.platform);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (commit.owner_type != null) {
                i11 = OwnerType.ADAPTER.encodedSizeWithTag(11, commit.owner_type);
            } else {
                i11 = 0;
            }
            int i25 = i24 + i11;
            if (commit.owner_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, commit.owner_id);
            } else {
                i12 = 0;
            }
            int i26 = i25 + i12;
            if (commit.operation_guid != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, commit.operation_guid);
            } else {
                i13 = 0;
            }
            int i27 = i26 + i13;
            if (commit.server_milli_time != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(14, commit.server_milli_time);
            } else {
                i14 = 0;
            }
            int i28 = i27 + i14;
            if (commit.source != null) {
                i15 = TodoSource.ADAPTER.encodedSizeWithTag(15, commit.source);
            }
            return i28 + i15 + commit.unknownFields().size();
        }

        /* renamed from: a */
        public Commit decode(ProtoReader protoReader) throws IOException {
            C19473a aVar = new C19473a();
            aVar.f47805a = "";
            aVar.f47806b = "";
            aVar.f47807c = ObjType.UNKNOWN_OBJ_TYPE;
            aVar.f47808d = "";
            aVar.f47809e = Key.UNKNOWN_KEY;
            aVar.f47810f = DataType.UNKNOWN_DATA_TYPE;
            aVar.f47811g = ByteString.EMPTY;
            aVar.f47812h = ByteString.EMPTY;
            aVar.f47813i = 0L;
            aVar.f47814j = Platform.UNKNOWN_PLATFORM;
            aVar.f47815k = OwnerType.UNKNOWN_OWNER_TYPE;
            aVar.f47816l = "";
            aVar.f47817m = "";
            aVar.f47818n = 0L;
            aVar.f47819o = TodoSource.TODO;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47805a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47806b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f47807c = ObjType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f47808d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f47809e = Key.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f47810f = DataType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 7:
                            aVar.f47811g = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47812h = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47813i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f47814j = Platform.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 11:
                            try {
                                aVar.f47815k = OwnerType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47816l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f47817m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f47818n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            try {
                                aVar.f47819o = TodoSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
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
        public void encode(ProtoWriter protoWriter, Commit commit) throws IOException {
            if (commit.guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commit.guid);
            }
            if (commit.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commit.version);
            }
            if (commit.obj_type != null) {
                ObjType.ADAPTER.encodeWithTag(protoWriter, 3, commit.obj_type);
            }
            if (commit.obj_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commit.obj_guid);
            }
            if (commit.key != null) {
                Key.ADAPTER.encodeWithTag(protoWriter, 5, commit.key);
            }
            if (commit.data_type != null) {
                DataType.ADAPTER.encodeWithTag(protoWriter, 6, commit.data_type);
            }
            if (commit.deleted != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, commit.deleted);
            }
            if (commit.added != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, commit.added);
            }
            if (commit.client_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, commit.client_milli_time);
            }
            if (commit.platform != null) {
                Platform.ADAPTER.encodeWithTag(protoWriter, 10, commit.platform);
            }
            if (commit.owner_type != null) {
                OwnerType.ADAPTER.encodeWithTag(protoWriter, 11, commit.owner_type);
            }
            if (commit.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, commit.owner_id);
            }
            if (commit.operation_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, commit.operation_guid);
            }
            if (commit.server_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, commit.server_milli_time);
            }
            if (commit.source != null) {
                TodoSource.ADAPTER.encodeWithTag(protoWriter, 15, commit.source);
            }
            protoWriter.writeBytes(commit.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.Commit$a */
    public static final class C19473a extends Message.Builder<Commit, C19473a> {

        /* renamed from: a */
        public String f47805a;

        /* renamed from: b */
        public String f47806b;

        /* renamed from: c */
        public ObjType f47807c;

        /* renamed from: d */
        public String f47808d;

        /* renamed from: e */
        public Key f47809e;

        /* renamed from: f */
        public DataType f47810f;

        /* renamed from: g */
        public ByteString f47811g;

        /* renamed from: h */
        public ByteString f47812h;

        /* renamed from: i */
        public Long f47813i;

        /* renamed from: j */
        public Platform f47814j;

        /* renamed from: k */
        public OwnerType f47815k;

        /* renamed from: l */
        public String f47816l;

        /* renamed from: m */
        public String f47817m;

        /* renamed from: n */
        public Long f47818n;

        /* renamed from: o */
        public TodoSource f47819o;

        /* renamed from: a */
        public Commit build() {
            return new Commit(this.f47805a, this.f47806b, this.f47807c, this.f47808d, this.f47809e, this.f47810f, this.f47811g, this.f47812h, this.f47813i, this.f47814j, this.f47815k, this.f47816l, this.f47817m, this.f47818n, this.f47819o, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19473a newBuilder() {
        C19473a aVar = new C19473a();
        aVar.f47805a = this.guid;
        aVar.f47806b = this.version;
        aVar.f47807c = this.obj_type;
        aVar.f47808d = this.obj_guid;
        aVar.f47809e = this.key;
        aVar.f47810f = this.data_type;
        aVar.f47811g = this.deleted;
        aVar.f47812h = this.added;
        aVar.f47813i = this.client_milli_time;
        aVar.f47814j = this.platform;
        aVar.f47815k = this.owner_type;
        aVar.f47816l = this.owner_id;
        aVar.f47817m = this.operation_guid;
        aVar.f47818n = this.server_milli_time;
        aVar.f47819o = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "Commit");
        StringBuilder sb = new StringBuilder();
        if (this.guid != null) {
            sb.append(", guid=");
            sb.append(this.guid);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.obj_type != null) {
            sb.append(", obj_type=");
            sb.append(this.obj_type);
        }
        if (this.obj_guid != null) {
            sb.append(", obj_guid=");
            sb.append(this.obj_guid);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.data_type != null) {
            sb.append(", data_type=");
            sb.append(this.data_type);
        }
        if (this.deleted != null) {
            sb.append(", deleted=");
            sb.append(this.deleted);
        }
        if (this.added != null) {
            sb.append(", added=");
            sb.append(this.added);
        }
        if (this.client_milli_time != null) {
            sb.append(", client_milli_time=");
            sb.append(this.client_milli_time);
        }
        if (this.platform != null) {
            sb.append(", platform=");
            sb.append(this.platform);
        }
        if (this.owner_type != null) {
            sb.append(", owner_type=");
            sb.append(this.owner_type);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.operation_guid != null) {
            sb.append(", operation_guid=");
            sb.append(this.operation_guid);
        }
        if (this.server_milli_time != null) {
            sb.append(", server_milli_time=");
            sb.append(this.server_milli_time);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "Commit{");
        replace.append('}');
        return replace.toString();
    }

    public Commit(String str, String str2, ObjType objType, String str3, Key key2, DataType dataType, ByteString byteString, ByteString byteString2, Long l, Platform platform2, OwnerType ownerType, String str4, String str5, Long l2, TodoSource todoSource) {
        this(str, str2, objType, str3, key2, dataType, byteString, byteString2, l, platform2, ownerType, str4, str5, l2, todoSource, ByteString.EMPTY);
    }

    public Commit(String str, String str2, ObjType objType, String str3, Key key2, DataType dataType, ByteString byteString, ByteString byteString2, Long l, Platform platform2, OwnerType ownerType, String str4, String str5, Long l2, TodoSource todoSource, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.guid = str;
        this.version = str2;
        this.obj_type = objType;
        this.obj_guid = str3;
        this.key = key2;
        this.data_type = dataType;
        this.deleted = byteString;
        this.added = byteString2;
        this.client_milli_time = l;
        this.platform = platform2;
        this.owner_type = ownerType;
        this.owner_id = str4;
        this.operation_guid = str5;
        this.server_milli_time = l2;
        this.source = todoSource;
    }
}
