package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class CalendarEventAttendee extends Message<CalendarEventAttendee, C15528a> {
    public static final ProtoAdapter<CalendarEventAttendee> ADAPTER = new C15529b();
    public static final Integer DEFAULT_ADDITIONAL_GUESTS_COUNT = 0;
    public static final Category DEFAULT_CATEGORY = Category.USER;
    public static final Boolean DEFAULT_IS_EDITABLE = false;
    public static final Boolean DEFAULT_IS_OPTIONAL = false;
    public static final Boolean DEFAULT_IS_ORGANIZER = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Status DEFAULT_STATUS = Status.NEEDS_ACTION;
    private static final long serialVersionUID = 0;
    public final Integer additional_guests_count;
    public final String attendee_calendar_id;
    public final CalendarSchemaCollection attendee_schema;
    public final String avatar_key;
    public final String avatar_path;
    public final Category category;
    public final String display_name;
    public final Group group;
    public final String id;
    public final String inviter_calendar_id;
    public final Boolean is_editable;
    public final Boolean is_optional;
    public final Boolean is_organizer;
    public final String key;
    public final Long original_time;
    public final Resource resource;
    public final SchemaExtraData schema_extra_data;
    public final Status status;
    public final ThirdPartyUser third_party_user;
    public final User user;

    public enum Category implements WireEnum {
        USER(1),
        GROUP(2),
        RESOURCE(3),
        THIRD_PARTY_USER(4);
        
        public static final ProtoAdapter<Category> ADAPTER = ProtoAdapter.newEnumAdapter(Category.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Category fromValue(int i) {
            if (i == 1) {
                return USER;
            }
            if (i == 2) {
                return GROUP;
            }
            if (i == 3) {
                return RESOURCE;
            }
            if (i != 4) {
                return null;
            }
            return THIRD_PARTY_USER;
        }

        private Category(int i) {
            this.value = i;
        }
    }

    public enum ResourceStatus implements WireEnum {
        NORMAL(0),
        RELEASED_EARLY(1);
        
        public static final ProtoAdapter<ResourceStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ResourceStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ResourceStatus fromValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i != 1) {
                return null;
            }
            return RELEASED_EARLY;
        }

        private ResourceStatus(int i) {
            this.value = i;
        }
    }

    public enum Status implements WireEnum {
        NEEDS_ACTION(1),
        ACCEPT(2),
        TENTATIVE(3),
        DECLINE(4),
        REMOVED(5);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return NEEDS_ACTION;
            }
            if (i == 2) {
                return ACCEPT;
            }
            if (i == 3) {
                return TENTATIVE;
            }
            if (i == 4) {
                return DECLINE;
            }
            if (i != 5) {
                return null;
            }
            return REMOVED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$a */
    public static final class C15528a extends Message.Builder<CalendarEventAttendee, C15528a> {

        /* renamed from: a */
        public String f41116a;

        /* renamed from: b */
        public String f41117b;

        /* renamed from: c */
        public Long f41118c;

        /* renamed from: d */
        public String f41119d;

        /* renamed from: e */
        public String f41120e;

        /* renamed from: f */
        public Boolean f41121f;

        /* renamed from: g */
        public Boolean f41122g;

        /* renamed from: h */
        public Status f41123h;

        /* renamed from: i */
        public Integer f41124i;

        /* renamed from: j */
        public Boolean f41125j;

        /* renamed from: k */
        public String f41126k;

        /* renamed from: l */
        public String f41127l;

        /* renamed from: m */
        public Category f41128m;

        /* renamed from: n */
        public String f41129n;

        /* renamed from: o */
        public CalendarSchemaCollection f41130o;

        /* renamed from: p */
        public SchemaExtraData f41131p;

        /* renamed from: q */
        public User f41132q;

        /* renamed from: r */
        public Group f41133r;

        /* renamed from: s */
        public Resource f41134s;

        /* renamed from: t */
        public ThirdPartyUser f41135t;

        /* renamed from: a */
        public C15528a mo56297a(String str) {
            this.f41116a = str;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56296a(Long l) {
            this.f41118c = l;
            return this;
        }

        /* renamed from: a */
        public CalendarEventAttendee build() {
            String str;
            String str2 = this.f41116a;
            if (str2 != null && (str = this.f41120e) != null) {
                return new CalendarEventAttendee(str2, this.f41117b, this.f41118c, this.f41119d, str, this.f41121f, this.f41122g, this.f41123h, this.f41124i, this.f41125j, this.f41126k, this.f41127l, this.f41128m, this.f41129n, this.f41130o, this.f41131p, this.f41132q, this.f41133r, this.f41134s, this.f41135t, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f41120e, "attendee_calendar_id");
        }

        /* renamed from: a */
        public C15528a mo56286a(Category category) {
            this.f41128m = category;
            return this;
        }

        /* renamed from: b */
        public C15528a mo56299b(Boolean bool) {
            this.f41122g = bool;
            return this;
        }

        /* renamed from: c */
        public C15528a mo56301c(Boolean bool) {
            this.f41125j = bool;
            return this;
        }

        /* renamed from: d */
        public C15528a mo56303d(String str) {
            this.f41120e = str;
            return this;
        }

        /* renamed from: e */
        public C15528a mo56304e(String str) {
            this.f41126k = str;
            return this;
        }

        /* renamed from: f */
        public C15528a mo56305f(String str) {
            this.f41127l = str;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56289a(Status status) {
            this.f41123h = status;
            return this;
        }

        /* renamed from: b */
        public C15528a mo56300b(String str) {
            this.f41117b = str;
            return this;
        }

        /* renamed from: c */
        public C15528a mo56302c(String str) {
            this.f41119d = str;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56287a(Group group) {
            this.f41133r = group;
            this.f41132q = null;
            this.f41134s = null;
            this.f41135t = null;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56288a(Resource resource) {
            this.f41134s = resource;
            this.f41132q = null;
            this.f41133r = null;
            this.f41135t = null;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56290a(ThirdPartyUser thirdPartyUser) {
            this.f41135t = thirdPartyUser;
            this.f41132q = null;
            this.f41133r = null;
            this.f41134s = null;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56291a(User user) {
            this.f41132q = user;
            this.f41133r = null;
            this.f41134s = null;
            this.f41135t = null;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56292a(CalendarSchemaCollection calendarSchemaCollection) {
            this.f41130o = calendarSchemaCollection;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56293a(SchemaExtraData schemaExtraData) {
            this.f41131p = schemaExtraData;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56294a(Boolean bool) {
            this.f41121f = bool;
            return this;
        }

        /* renamed from: a */
        public C15528a mo56295a(Integer num) {
            this.f41124i = num;
            return this;
        }
    }

    public static final class Group extends Message<Group, C15520a> {
        public static final ProtoAdapter<Group> ADAPTER = new C15521b();
        public static final Boolean DEFAULT_IS_ANY_REMOVED = false;
        public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
        public static final Boolean DEFAULT_IS_SELF_IN_GROUP = false;
        public static final Boolean DEFAULT_OPEN_SECURITY = false;
        public static final Integer DEFAULT_SHOW_MEMBER_LIMIT = 0;
        public static final Integer DEFAULT_VALID_MEMBER_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final String group_id;
        public final Boolean is_any_removed;
        public final Boolean is_cross_tenant;
        public final Boolean is_self_in_group;
        public final List<CalendarEventAttendee> members;
        public final Boolean open_security;
        public final Integer show_member_limit;
        public final String tenant_id;
        public final Integer valid_member_count;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$Group$b */
        private static final class C15521b extends ProtoAdapter<Group> {
            C15521b() {
                super(FieldEncoding.LENGTH_DELIMITED, Group.class);
            }

            /* renamed from: a */
            public int encodedSize(Group group) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8 = 0;
                if (group.group_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, group.group_id);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(2, group.members);
                if (group.tenant_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, group.tenant_id);
                } else {
                    i2 = 0;
                }
                int i9 = encodedSizeWithTag + i2;
                if (group.is_cross_tenant != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, group.is_cross_tenant);
                } else {
                    i3 = 0;
                }
                int i10 = i9 + i3;
                if (group.open_security != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, group.open_security);
                } else {
                    i4 = 0;
                }
                int i11 = i10 + i4;
                if (group.show_member_limit != null) {
                    i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, group.show_member_limit);
                } else {
                    i5 = 0;
                }
                int i12 = i11 + i5;
                if (group.valid_member_count != null) {
                    i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, group.valid_member_count);
                } else {
                    i6 = 0;
                }
                int i13 = i12 + i6;
                if (group.is_any_removed != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, group.is_any_removed);
                } else {
                    i7 = 0;
                }
                int i14 = i13 + i7;
                if (group.is_self_in_group != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, group.is_self_in_group);
                }
                return i14 + i8 + group.unknownFields().size();
            }

            /* renamed from: a */
            public Group decode(ProtoReader protoReader) throws IOException {
                C15520a aVar = new C15520a();
                aVar.f41099a = "";
                aVar.f41101c = "";
                aVar.f41102d = false;
                aVar.f41103e = false;
                aVar.f41104f = 0;
                aVar.f41105g = 0;
                aVar.f41106h = false;
                aVar.f41107i = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f41099a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f41100b.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                aVar.f41101c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f41102d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f41103e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f41104f = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 7:
                                aVar.f41105g = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                aVar.f41106h = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 9:
                                aVar.f41107i = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Group group) throws IOException {
                if (group.group_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, group.group_id);
                }
                CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, group.members);
                if (group.tenant_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, group.tenant_id);
                }
                if (group.is_cross_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, group.is_cross_tenant);
                }
                if (group.open_security != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, group.open_security);
                }
                if (group.show_member_limit != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, group.show_member_limit);
                }
                if (group.valid_member_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, group.valid_member_count);
                }
                if (group.is_any_removed != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, group.is_any_removed);
                }
                if (group.is_self_in_group != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, group.is_self_in_group);
                }
                protoWriter.writeBytes(group.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$Group$a */
        public static final class C15520a extends Message.Builder<Group, C15520a> {

            /* renamed from: a */
            public String f41099a;

            /* renamed from: b */
            public List<CalendarEventAttendee> f41100b = Internal.newMutableList();

            /* renamed from: c */
            public String f41101c;

            /* renamed from: d */
            public Boolean f41102d;

            /* renamed from: e */
            public Boolean f41103e;

            /* renamed from: f */
            public Integer f41104f;

            /* renamed from: g */
            public Integer f41105g;

            /* renamed from: h */
            public Boolean f41106h;

            /* renamed from: i */
            public Boolean f41107i;

            /* renamed from: a */
            public Group build() {
                return new Group(this.f41099a, this.f41100b, this.f41101c, this.f41102d, this.f41103e, this.f41104f, this.f41105g, this.f41106h, this.f41107i, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15520a mo56268a(List<CalendarEventAttendee> list) {
                Internal.checkElementsNotNull(list);
                this.f41100b = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15520a newBuilder() {
            C15520a aVar = new C15520a();
            aVar.f41099a = this.group_id;
            aVar.f41100b = Internal.copyOf("members", this.members);
            aVar.f41101c = this.tenant_id;
            aVar.f41102d = this.is_cross_tenant;
            aVar.f41103e = this.open_security;
            aVar.f41104f = this.show_member_limit;
            aVar.f41105g = this.valid_member_count;
            aVar.f41106h = this.is_any_removed;
            aVar.f41107i = this.is_self_in_group;
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
            if (!this.members.isEmpty()) {
                sb.append(", members=");
                sb.append(this.members);
            }
            if (this.tenant_id != null) {
                sb.append(", tenant_id=");
                sb.append(this.tenant_id);
            }
            if (this.is_cross_tenant != null) {
                sb.append(", is_cross_tenant=");
                sb.append(this.is_cross_tenant);
            }
            if (this.open_security != null) {
                sb.append(", open_security=");
                sb.append(this.open_security);
            }
            if (this.show_member_limit != null) {
                sb.append(", show_member_limit=");
                sb.append(this.show_member_limit);
            }
            if (this.valid_member_count != null) {
                sb.append(", valid_member_count=");
                sb.append(this.valid_member_count);
            }
            if (this.is_any_removed != null) {
                sb.append(", is_any_removed=");
                sb.append(this.is_any_removed);
            }
            if (this.is_self_in_group != null) {
                sb.append(", is_self_in_group=");
                sb.append(this.is_self_in_group);
            }
            StringBuilder replace = sb.replace(0, 2, "Group{");
            replace.append('}');
            return replace.toString();
        }

        public Group(String str, List<CalendarEventAttendee> list, String str2, Boolean bool, Boolean bool2, Integer num, Integer num2, Boolean bool3, Boolean bool4) {
            this(str, list, str2, bool, bool2, num, num2, bool3, bool4, ByteString.EMPTY);
        }

        public Group(String str, List<CalendarEventAttendee> list, String str2, Boolean bool, Boolean bool2, Integer num, Integer num2, Boolean bool3, Boolean bool4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.group_id = str;
            this.members = Internal.immutableCopyOf("members", list);
            this.tenant_id = str2;
            this.is_cross_tenant = bool;
            this.open_security = bool2;
            this.show_member_limit = num;
            this.valid_member_count = num2;
            this.is_any_removed = bool3;
            this.is_self_in_group = bool4;
        }
    }

    public static final class Resource extends Message<Resource, C15522a> {
        public static final ProtoAdapter<Resource> ADAPTER = new C15523b();
        public static final Boolean DEFAULT_IS_DISABLED = false;
        public static final ResourceStatus DEFAULT_RESOURCE_STATUS = ResourceStatus.NORMAL;
        private static final long serialVersionUID = 0;
        public final Boolean is_disabled;
        public final ResourceStatus resource_status;
        public final String tenant_id;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$Resource$b */
        private static final class C15523b extends ProtoAdapter<Resource> {
            C15523b() {
                super(FieldEncoding.LENGTH_DELIMITED, Resource.class);
            }

            /* renamed from: a */
            public int encodedSize(Resource resource) {
                int i;
                int i2;
                int i3 = 0;
                if (resource.tenant_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, resource.tenant_id);
                } else {
                    i = 0;
                }
                if (resource.is_disabled != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, resource.is_disabled);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (resource.resource_status != null) {
                    i3 = ResourceStatus.ADAPTER.encodedSizeWithTag(3, resource.resource_status);
                }
                return i4 + i3 + resource.unknownFields().size();
            }

            /* renamed from: a */
            public Resource decode(ProtoReader protoReader) throws IOException {
                C15522a aVar = new C15522a();
                aVar.f41108a = "";
                aVar.f41109b = false;
                aVar.f41110c = ResourceStatus.NORMAL;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f41108a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f41109b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f41110c = ResourceStatus.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Resource resource) throws IOException {
                if (resource.tenant_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resource.tenant_id);
                }
                if (resource.is_disabled != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, resource.is_disabled);
                }
                if (resource.resource_status != null) {
                    ResourceStatus.ADAPTER.encodeWithTag(protoWriter, 3, resource.resource_status);
                }
                protoWriter.writeBytes(resource.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$Resource$a */
        public static final class C15522a extends Message.Builder<Resource, C15522a> {

            /* renamed from: a */
            public String f41108a;

            /* renamed from: b */
            public Boolean f41109b;

            /* renamed from: c */
            public ResourceStatus f41110c;

            /* renamed from: a */
            public Resource build() {
                return new Resource(this.f41108a, this.f41109b, this.f41110c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15522a newBuilder() {
            C15522a aVar = new C15522a();
            aVar.f41108a = this.tenant_id;
            aVar.f41109b = this.is_disabled;
            aVar.f41110c = this.resource_status;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "Resource");
            StringBuilder sb = new StringBuilder();
            if (this.tenant_id != null) {
                sb.append(", tenant_id=");
                sb.append(this.tenant_id);
            }
            if (this.is_disabled != null) {
                sb.append(", is_disabled=");
                sb.append(this.is_disabled);
            }
            if (this.resource_status != null) {
                sb.append(", resource_status=");
                sb.append(this.resource_status);
            }
            StringBuilder replace = sb.replace(0, 2, "Resource{");
            replace.append('}');
            return replace.toString();
        }

        public Resource(String str, Boolean bool, ResourceStatus resourceStatus) {
            this(str, bool, resourceStatus, ByteString.EMPTY);
        }

        public Resource(String str, Boolean bool, ResourceStatus resourceStatus, ByteString byteString) {
            super(ADAPTER, byteString);
            this.tenant_id = str;
            this.is_disabled = bool;
            this.resource_status = resourceStatus;
        }
    }

    public static final class ThirdPartyUser extends Message<ThirdPartyUser, C15524a> {
        public static final ProtoAdapter<ThirdPartyUser> ADAPTER = new C15525b();
        private static final long serialVersionUID = 0;
        public final String email;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$ThirdPartyUser$b */
        private static final class C15525b extends ProtoAdapter<ThirdPartyUser> {
            C15525b() {
                super(FieldEncoding.LENGTH_DELIMITED, ThirdPartyUser.class);
            }

            /* renamed from: a */
            public int encodedSize(ThirdPartyUser thirdPartyUser) {
                int i;
                if (thirdPartyUser.email != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, thirdPartyUser.email);
                } else {
                    i = 0;
                }
                return i + thirdPartyUser.unknownFields().size();
            }

            /* renamed from: a */
            public ThirdPartyUser decode(ProtoReader protoReader) throws IOException {
                C15524a aVar = new C15524a();
                aVar.f41111a = "";
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
                        aVar.f41111a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ThirdPartyUser thirdPartyUser) throws IOException {
                if (thirdPartyUser.email != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, thirdPartyUser.email);
                }
                protoWriter.writeBytes(thirdPartyUser.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$ThirdPartyUser$a */
        public static final class C15524a extends Message.Builder<ThirdPartyUser, C15524a> {

            /* renamed from: a */
            public String f41111a;

            /* renamed from: a */
            public ThirdPartyUser build() {
                return new ThirdPartyUser(this.f41111a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15524a mo56277a(String str) {
                this.f41111a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15524a newBuilder() {
            C15524a aVar = new C15524a();
            aVar.f41111a = this.email;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ThirdPartyUser");
            StringBuilder sb = new StringBuilder();
            if (this.email != null) {
                sb.append(", email=");
                sb.append(this.email);
            }
            StringBuilder replace = sb.replace(0, 2, "ThirdPartyUser{");
            replace.append('}');
            return replace.toString();
        }

        public ThirdPartyUser(String str) {
            this(str, ByteString.EMPTY);
        }

        public ThirdPartyUser(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.email = str;
        }
    }

    public static final class User extends Message<User, C15526a> {
        public static final ProtoAdapter<User> ADAPTER = new C15527b();
        private static final long serialVersionUID = 0;
        public final String tags;
        public final String tenant_id;
        public final String timezone_id;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$User$b */
        private static final class C15527b extends ProtoAdapter<User> {
            C15527b() {
                super(FieldEncoding.LENGTH_DELIMITED, User.class);
            }

            /* renamed from: a */
            public int encodedSize(User user) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (user.user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, user.user_id);
                } else {
                    i = 0;
                }
                if (user.tenant_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, user.tenant_id);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (user.tags != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, user.tags);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (user.timezone_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, user.timezone_id);
                }
                return i6 + i4 + user.unknownFields().size();
            }

            /* renamed from: a */
            public User decode(ProtoReader protoReader) throws IOException {
                C15526a aVar = new C15526a();
                aVar.f41112a = "";
                aVar.f41113b = "";
                aVar.f41114c = "";
                aVar.f41115d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f41112a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f41113b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f41114c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41115d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, User user) throws IOException {
                if (user.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, user.user_id);
                }
                if (user.tenant_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, user.tenant_id);
                }
                if (user.tags != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, user.tags);
                }
                if (user.timezone_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, user.timezone_id);
                }
                protoWriter.writeBytes(user.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$User$a */
        public static final class C15526a extends Message.Builder<User, C15526a> {

            /* renamed from: a */
            public String f41112a;

            /* renamed from: b */
            public String f41113b;

            /* renamed from: c */
            public String f41114c;

            /* renamed from: d */
            public String f41115d;

            /* renamed from: a */
            public User build() {
                return new User(this.f41112a, this.f41113b, this.f41114c, this.f41115d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15526a newBuilder() {
            C15526a aVar = new C15526a();
            aVar.f41112a = this.user_id;
            aVar.f41113b = this.tenant_id;
            aVar.f41114c = this.tags;
            aVar.f41115d = this.timezone_id;
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
            if (this.tenant_id != null) {
                sb.append(", tenant_id=");
                sb.append(this.tenant_id);
            }
            if (this.tags != null) {
                sb.append(", tags=");
                sb.append(this.tags);
            }
            if (this.timezone_id != null) {
                sb.append(", timezone_id=");
                sb.append(this.timezone_id);
            }
            StringBuilder replace = sb.replace(0, 2, "User{");
            replace.append('}');
            return replace.toString();
        }

        public User(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, ByteString.EMPTY);
        }

        public User(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
            this.tenant_id = str2;
            this.tags = str3;
            this.timezone_id = str4;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee$b */
    private static final class C15529b extends ProtoAdapter<CalendarEventAttendee> {
        C15529b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventAttendee.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventAttendee calendarEventAttendee) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarEventAttendee.id);
            int i18 = 0;
            if (calendarEventAttendee.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarEventAttendee.key);
            } else {
                i = 0;
            }
            int i19 = encodedSizeWithTag + i;
            if (calendarEventAttendee.original_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, calendarEventAttendee.original_time);
            } else {
                i2 = 0;
            }
            int i20 = i19 + i2;
            if (calendarEventAttendee.display_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, calendarEventAttendee.display_name);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i20 + i3 + ProtoAdapter.STRING.encodedSizeWithTag(5, calendarEventAttendee.attendee_calendar_id);
            if (calendarEventAttendee.is_organizer != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, calendarEventAttendee.is_organizer);
            } else {
                i4 = 0;
            }
            int i21 = encodedSizeWithTag2 + i4;
            if (calendarEventAttendee.is_optional != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, calendarEventAttendee.is_optional);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (calendarEventAttendee.status != null) {
                i6 = Status.ADAPTER.encodedSizeWithTag(8, calendarEventAttendee.status);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (calendarEventAttendee.additional_guests_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(9, calendarEventAttendee.additional_guests_count);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (calendarEventAttendee.is_editable != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(10, calendarEventAttendee.is_editable);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (calendarEventAttendee.inviter_calendar_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(11, calendarEventAttendee.inviter_calendar_id);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (calendarEventAttendee.avatar_key != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(12, calendarEventAttendee.avatar_key);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (calendarEventAttendee.category != null) {
                i11 = Category.ADAPTER.encodedSizeWithTag(13, calendarEventAttendee.category);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (calendarEventAttendee.avatar_path != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(14, calendarEventAttendee.avatar_path);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (calendarEventAttendee.attendee_schema != null) {
                i13 = CalendarSchemaCollection.ADAPTER.encodedSizeWithTag(15, calendarEventAttendee.attendee_schema);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (calendarEventAttendee.schema_extra_data != null) {
                i14 = SchemaExtraData.ADAPTER.encodedSizeWithTag(16, calendarEventAttendee.schema_extra_data);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (calendarEventAttendee.user != null) {
                i15 = User.ADAPTER.encodedSizeWithTag(100, calendarEventAttendee.user);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (calendarEventAttendee.group != null) {
                i16 = Group.ADAPTER.encodedSizeWithTag(101, calendarEventAttendee.group);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (calendarEventAttendee.resource != null) {
                i17 = Resource.ADAPTER.encodedSizeWithTag(102, calendarEventAttendee.resource);
            } else {
                i17 = 0;
            }
            int i34 = i33 + i17;
            if (calendarEventAttendee.third_party_user != null) {
                i18 = ThirdPartyUser.ADAPTER.encodedSizeWithTag(103, calendarEventAttendee.third_party_user);
            }
            return i34 + i18 + calendarEventAttendee.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventAttendee decode(ProtoReader protoReader) throws IOException {
            C15528a aVar = new C15528a();
            aVar.f41116a = "";
            aVar.f41117b = "";
            aVar.f41118c = 0L;
            aVar.f41119d = "";
            aVar.f41120e = "";
            aVar.f41121f = false;
            aVar.f41122g = false;
            aVar.f41123h = Status.NEEDS_ACTION;
            aVar.f41124i = 0;
            aVar.f41125j = false;
            aVar.f41126k = "";
            aVar.f41127l = "";
            aVar.f41128m = Category.USER;
            aVar.f41129n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41116a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41117b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41118c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41119d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41120e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41121f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41122g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f41123h = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            aVar.f41124i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41125j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41126k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41127l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f41128m = Category.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f41129n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41130o = CalendarSchemaCollection.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f41131p = SchemaExtraData.ADAPTER.decode(protoReader);
                            break;
                        default:
                            switch (nextTag) {
                                case 100:
                                    aVar.mo56291a(User.ADAPTER.decode(protoReader));
                                    continue;
                                case 101:
                                    aVar.mo56287a(Group.ADAPTER.decode(protoReader));
                                    continue;
                                case 102:
                                    aVar.mo56288a(Resource.ADAPTER.decode(protoReader));
                                    continue;
                                case 103:
                                    aVar.mo56290a(ThirdPartyUser.ADAPTER.decode(protoReader));
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarEventAttendee calendarEventAttendee) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarEventAttendee.id);
            if (calendarEventAttendee.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarEventAttendee.key);
            }
            if (calendarEventAttendee.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, calendarEventAttendee.original_time);
            }
            if (calendarEventAttendee.display_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, calendarEventAttendee.display_name);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, calendarEventAttendee.attendee_calendar_id);
            if (calendarEventAttendee.is_organizer != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, calendarEventAttendee.is_organizer);
            }
            if (calendarEventAttendee.is_optional != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, calendarEventAttendee.is_optional);
            }
            if (calendarEventAttendee.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 8, calendarEventAttendee.status);
            }
            if (calendarEventAttendee.additional_guests_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, calendarEventAttendee.additional_guests_count);
            }
            if (calendarEventAttendee.is_editable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, calendarEventAttendee.is_editable);
            }
            if (calendarEventAttendee.inviter_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, calendarEventAttendee.inviter_calendar_id);
            }
            if (calendarEventAttendee.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, calendarEventAttendee.avatar_key);
            }
            if (calendarEventAttendee.category != null) {
                Category.ADAPTER.encodeWithTag(protoWriter, 13, calendarEventAttendee.category);
            }
            if (calendarEventAttendee.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, calendarEventAttendee.avatar_path);
            }
            if (calendarEventAttendee.attendee_schema != null) {
                CalendarSchemaCollection.ADAPTER.encodeWithTag(protoWriter, 15, calendarEventAttendee.attendee_schema);
            }
            if (calendarEventAttendee.schema_extra_data != null) {
                SchemaExtraData.ADAPTER.encodeWithTag(protoWriter, 16, calendarEventAttendee.schema_extra_data);
            }
            if (calendarEventAttendee.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter, 100, calendarEventAttendee.user);
            }
            if (calendarEventAttendee.group != null) {
                Group.ADAPTER.encodeWithTag(protoWriter, 101, calendarEventAttendee.group);
            }
            if (calendarEventAttendee.resource != null) {
                Resource.ADAPTER.encodeWithTag(protoWriter, 102, calendarEventAttendee.resource);
            }
            if (calendarEventAttendee.third_party_user != null) {
                ThirdPartyUser.ADAPTER.encodeWithTag(protoWriter, 103, calendarEventAttendee.third_party_user);
            }
            protoWriter.writeBytes(calendarEventAttendee.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15528a newBuilder() {
        C15528a aVar = new C15528a();
        aVar.f41116a = this.id;
        aVar.f41117b = this.key;
        aVar.f41118c = this.original_time;
        aVar.f41119d = this.display_name;
        aVar.f41120e = this.attendee_calendar_id;
        aVar.f41121f = this.is_organizer;
        aVar.f41122g = this.is_optional;
        aVar.f41123h = this.status;
        aVar.f41124i = this.additional_guests_count;
        aVar.f41125j = this.is_editable;
        aVar.f41126k = this.inviter_calendar_id;
        aVar.f41127l = this.avatar_key;
        aVar.f41128m = this.category;
        aVar.f41129n = this.avatar_path;
        aVar.f41130o = this.attendee_schema;
        aVar.f41131p = this.schema_extra_data;
        aVar.f41132q = this.user;
        aVar.f41133r = this.group;
        aVar.f41134s = this.resource;
        aVar.f41135t = this.third_party_user;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEventAttendee");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        sb.append(", attendee_calendar_id=");
        sb.append(this.attendee_calendar_id);
        if (this.is_organizer != null) {
            sb.append(", is_organizer=");
            sb.append(this.is_organizer);
        }
        if (this.is_optional != null) {
            sb.append(", is_optional=");
            sb.append(this.is_optional);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.additional_guests_count != null) {
            sb.append(", additional_guests_count=");
            sb.append(this.additional_guests_count);
        }
        if (this.is_editable != null) {
            sb.append(", is_editable=");
            sb.append(this.is_editable);
        }
        if (this.inviter_calendar_id != null) {
            sb.append(", inviter_calendar_id=");
            sb.append(this.inviter_calendar_id);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.attendee_schema != null) {
            sb.append(", attendee_schema=");
            sb.append(this.attendee_schema);
        }
        if (this.schema_extra_data != null) {
            sb.append(", schema_extra_data=");
            sb.append(this.schema_extra_data);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.group != null) {
            sb.append(", group=");
            sb.append(this.group);
        }
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        if (this.third_party_user != null) {
            sb.append(", third_party_user=");
            sb.append(this.third_party_user);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarEventAttendee{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventAttendee(String str, String str2, Long l, String str3, String str4, Boolean bool, Boolean bool2, Status status2, Integer num, Boolean bool3, String str5, String str6, Category category2, String str7, CalendarSchemaCollection calendarSchemaCollection, SchemaExtraData schemaExtraData, User user2, Group group2, Resource resource2, ThirdPartyUser thirdPartyUser) {
        this(str, str2, l, str3, str4, bool, bool2, status2, num, bool3, str5, str6, category2, str7, calendarSchemaCollection, schemaExtraData, user2, group2, resource2, thirdPartyUser, ByteString.EMPTY);
    }

    public CalendarEventAttendee(String str, String str2, Long l, String str3, String str4, Boolean bool, Boolean bool2, Status status2, Integer num, Boolean bool3, String str5, String str6, Category category2, String str7, CalendarSchemaCollection calendarSchemaCollection, SchemaExtraData schemaExtraData, User user2, Group group2, Resource resource2, ThirdPartyUser thirdPartyUser, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(user2, group2, resource2, thirdPartyUser, new Object[0]) <= 1) {
            this.id = str;
            this.key = str2;
            this.original_time = l;
            this.display_name = str3;
            this.attendee_calendar_id = str4;
            this.is_organizer = bool;
            this.is_optional = bool2;
            this.status = status2;
            this.additional_guests_count = num;
            this.is_editable = bool3;
            this.inviter_calendar_id = str5;
            this.avatar_key = str6;
            this.category = category2;
            this.avatar_path = str7;
            this.attendee_schema = calendarSchemaCollection;
            this.schema_extra_data = schemaExtraData;
            this.user = user2;
            this.group = group2;
            this.resource = resource2;
            this.third_party_user = thirdPartyUser;
            return;
        }
        throw new IllegalArgumentException("at most one of user, group, resource, third_party_user may be non-null");
    }
}
