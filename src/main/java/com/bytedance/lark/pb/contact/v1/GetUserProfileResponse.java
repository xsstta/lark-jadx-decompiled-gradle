package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
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

public final class GetUserProfileResponse extends Message<GetUserProfileResponse, C16304a> {
    public static final ProtoAdapter<GetUserProfileResponse> ADAPTER = new C16305b();
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Chatter.AccessInfo access_info;
    public final AdminInfo admin_info;
    public final Company company;
    public final Long do_not_disturb_end_time;
    public final Leader leader;
    public final Personal personal;
    public final WorkStatus work_status;

    public static final class Company extends Message<Company, C16292a> {
        public static final ProtoAdapter<Company> ADAPTER = new C16293b();
        private static final long serialVersionUID = 0;
        public final String department_name;
        public final DepartmentList departments;
        public final OrgUnit org_unit;
        public final Position position;
        public final String tenant_name;

        public static final class DepartmentList extends Message<DepartmentList, C16284a> {
            public static final ProtoAdapter<DepartmentList> ADAPTER = new C16285b();
            private static final long serialVersionUID = 0;
            public final List<DepartmentMeta> dept_metas;

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$DepartmentList$b */
            private static final class C16285b extends ProtoAdapter<DepartmentList> {
                C16285b() {
                    super(FieldEncoding.LENGTH_DELIMITED, DepartmentList.class);
                }

                /* renamed from: a */
                public int encodedSize(DepartmentList departmentList) {
                    return DepartmentMeta.ADAPTER.asRepeated().encodedSizeWithTag(1, departmentList.dept_metas) + departmentList.unknownFields().size();
                }

                /* renamed from: a */
                public DepartmentList decode(ProtoReader protoReader) throws IOException {
                    C16284a aVar = new C16284a();
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
                            aVar.f42482a.add(DepartmentMeta.ADAPTER.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, DepartmentList departmentList) throws IOException {
                    DepartmentMeta.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, departmentList.dept_metas);
                    protoWriter.writeBytes(departmentList.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$DepartmentList$a */
            public static final class C16284a extends Message.Builder<DepartmentList, C16284a> {

                /* renamed from: a */
                public List<DepartmentMeta> f42482a = Internal.newMutableList();

                /* renamed from: a */
                public DepartmentList build() {
                    return new DepartmentList(this.f42482a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C16284a newBuilder() {
                C16284a aVar = new C16284a();
                aVar.f42482a = Internal.copyOf("dept_metas", this.dept_metas);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "DepartmentList");
                StringBuilder sb = new StringBuilder();
                if (!this.dept_metas.isEmpty()) {
                    sb.append(", dept_metas=");
                    sb.append(this.dept_metas);
                }
                StringBuilder replace = sb.replace(0, 2, "DepartmentList{");
                replace.append('}');
                return replace.toString();
            }

            public DepartmentList(List<DepartmentMeta> list) {
                this(list, ByteString.EMPTY);
            }

            public DepartmentList(List<DepartmentMeta> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.dept_metas = Internal.immutableCopyOf("dept_metas", list);
            }
        }

        public static final class DepartmentMeta extends Message<DepartmentMeta, C16286a> {
            public static final ProtoAdapter<DepartmentMeta> ADAPTER = new C16287b();
            private static final long serialVersionUID = 0;
            public final String id;
            public final String name;

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$DepartmentMeta$b */
            private static final class C16287b extends ProtoAdapter<DepartmentMeta> {
                C16287b() {
                    super(FieldEncoding.LENGTH_DELIMITED, DepartmentMeta.class);
                }

                /* renamed from: a */
                public int encodedSize(DepartmentMeta departmentMeta) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, departmentMeta.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, departmentMeta.name) + departmentMeta.unknownFields().size();
                }

                /* renamed from: a */
                public DepartmentMeta decode(ProtoReader protoReader) throws IOException {
                    C16286a aVar = new C16286a();
                    aVar.f42483a = "";
                    aVar.f42484b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f42483a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f42484b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, DepartmentMeta departmentMeta) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, departmentMeta.id);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, departmentMeta.name);
                    protoWriter.writeBytes(departmentMeta.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C16286a newBuilder() {
                C16286a aVar = new C16286a();
                aVar.f42483a = this.id;
                aVar.f42484b = this.name;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$DepartmentMeta$a */
            public static final class C16286a extends Message.Builder<DepartmentMeta, C16286a> {

                /* renamed from: a */
                public String f42483a;

                /* renamed from: b */
                public String f42484b;

                /* renamed from: a */
                public DepartmentMeta build() {
                    String str;
                    String str2 = this.f42483a;
                    if (str2 != null && (str = this.f42484b) != null) {
                        return new DepartmentMeta(str2, str, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str2, "id", this.f42484b, "name");
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "DepartmentMeta");
                StringBuilder sb = new StringBuilder();
                sb.append(", id=");
                sb.append(this.id);
                sb.append(", name=");
                sb.append(this.name);
                StringBuilder replace = sb.replace(0, 2, "DepartmentMeta{");
                replace.append('}');
                return replace.toString();
            }

            public DepartmentMeta(String str, String str2) {
                this(str, str2, ByteString.EMPTY);
            }

            public DepartmentMeta(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.id = str;
                this.name = str2;
            }
        }

        public static final class OrgUnit extends Message<OrgUnit, C16288a> {
            public static final ProtoAdapter<OrgUnit> ADAPTER = new C16289b();
            private static final long serialVersionUID = 0;
            public final String name;

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$OrgUnit$b */
            private static final class C16289b extends ProtoAdapter<OrgUnit> {
                C16289b() {
                    super(FieldEncoding.LENGTH_DELIMITED, OrgUnit.class);
                }

                /* renamed from: a */
                public int encodedSize(OrgUnit orgUnit) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, orgUnit.name) + orgUnit.unknownFields().size();
                }

                /* renamed from: a */
                public OrgUnit decode(ProtoReader protoReader) throws IOException {
                    C16288a aVar = new C16288a();
                    aVar.f42485a = "";
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
                            aVar.f42485a = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, OrgUnit orgUnit) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, orgUnit.name);
                    protoWriter.writeBytes(orgUnit.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$OrgUnit$a */
            public static final class C16288a extends Message.Builder<OrgUnit, C16288a> {

                /* renamed from: a */
                public String f42485a;

                /* renamed from: a */
                public OrgUnit build() {
                    String str = this.f42485a;
                    if (str != null) {
                        return new OrgUnit(str, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, "name");
                }
            }

            @Override // com.squareup.wire.Message
            public C16288a newBuilder() {
                C16288a aVar = new C16288a();
                aVar.f42485a = this.name;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "OrgUnit");
                StringBuilder sb = new StringBuilder();
                sb.append(", name=");
                sb.append(this.name);
                StringBuilder replace = sb.replace(0, 2, "OrgUnit{");
                replace.append('}');
                return replace.toString();
            }

            public OrgUnit(String str) {
                this(str, ByteString.EMPTY);
            }

            public OrgUnit(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.name = str;
            }
        }

        public static final class Position extends Message<Position, C16290a> {
            public static final ProtoAdapter<Position> ADAPTER = new C16291b();
            private static final long serialVersionUID = 0;
            public final String name;

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$Position$b */
            private static final class C16291b extends ProtoAdapter<Position> {
                C16291b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Position.class);
                }

                /* renamed from: a */
                public int encodedSize(Position position) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, position.name) + position.unknownFields().size();
                }

                /* renamed from: a */
                public Position decode(ProtoReader protoReader) throws IOException {
                    C16290a aVar = new C16290a();
                    aVar.f42486a = "";
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
                            aVar.f42486a = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Position position) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, position.name);
                    protoWriter.writeBytes(position.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$Position$a */
            public static final class C16290a extends Message.Builder<Position, C16290a> {

                /* renamed from: a */
                public String f42486a;

                /* renamed from: a */
                public Position build() {
                    String str = this.f42486a;
                    if (str != null) {
                        return new Position(str, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, "name");
                }
            }

            @Override // com.squareup.wire.Message
            public C16290a newBuilder() {
                C16290a aVar = new C16290a();
                aVar.f42486a = this.name;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "Position");
                StringBuilder sb = new StringBuilder();
                sb.append(", name=");
                sb.append(this.name);
                StringBuilder replace = sb.replace(0, 2, "Position{");
                replace.append('}');
                return replace.toString();
            }

            public Position(String str) {
                this(str, ByteString.EMPTY);
            }

            public Position(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.name = str;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$b */
        private static final class C16293b extends ProtoAdapter<Company> {
            C16293b() {
                super(FieldEncoding.LENGTH_DELIMITED, Company.class);
            }

            /* renamed from: a */
            public int encodedSize(Company company) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (company.department_name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, company.department_name);
                } else {
                    i = 0;
                }
                if (company.tenant_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, company.tenant_name);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (company.position != null) {
                    i3 = Position.ADAPTER.encodedSizeWithTag(3, company.position);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (company.org_unit != null) {
                    i4 = OrgUnit.ADAPTER.encodedSizeWithTag(4, company.org_unit);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (company.departments != null) {
                    i5 = DepartmentList.ADAPTER.encodedSizeWithTag(5, company.departments);
                }
                return i8 + i5 + company.unknownFields().size();
            }

            /* renamed from: a */
            public Company decode(ProtoReader protoReader) throws IOException {
                C16292a aVar = new C16292a();
                aVar.f42487a = "";
                aVar.f42488b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42487a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42488b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f42489c = Position.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f42490d = OrgUnit.ADAPTER.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42491e = DepartmentList.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Company company) throws IOException {
                if (company.department_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, company.department_name);
                }
                if (company.tenant_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, company.tenant_name);
                }
                if (company.position != null) {
                    Position.ADAPTER.encodeWithTag(protoWriter, 3, company.position);
                }
                if (company.org_unit != null) {
                    OrgUnit.ADAPTER.encodeWithTag(protoWriter, 4, company.org_unit);
                }
                if (company.departments != null) {
                    DepartmentList.ADAPTER.encodeWithTag(protoWriter, 5, company.departments);
                }
                protoWriter.writeBytes(company.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Company$a */
        public static final class C16292a extends Message.Builder<Company, C16292a> {

            /* renamed from: a */
            public String f42487a;

            /* renamed from: b */
            public String f42488b;

            /* renamed from: c */
            public Position f42489c;

            /* renamed from: d */
            public OrgUnit f42490d;

            /* renamed from: e */
            public DepartmentList f42491e;

            /* renamed from: a */
            public Company build() {
                return new Company(this.f42487a, this.f42488b, this.f42489c, this.f42490d, this.f42491e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16292a newBuilder() {
            C16292a aVar = new C16292a();
            aVar.f42487a = this.department_name;
            aVar.f42488b = this.tenant_name;
            aVar.f42489c = this.position;
            aVar.f42490d = this.org_unit;
            aVar.f42491e = this.departments;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Company");
            StringBuilder sb = new StringBuilder();
            if (this.department_name != null) {
                sb.append(", department_name=");
                sb.append(this.department_name);
            }
            if (this.tenant_name != null) {
                sb.append(", tenant_name=");
                sb.append(this.tenant_name);
            }
            if (this.position != null) {
                sb.append(", position=");
                sb.append(this.position);
            }
            if (this.org_unit != null) {
                sb.append(", org_unit=");
                sb.append(this.org_unit);
            }
            if (this.departments != null) {
                sb.append(", departments=");
                sb.append(this.departments);
            }
            StringBuilder replace = sb.replace(0, 2, "Company{");
            replace.append('}');
            return replace.toString();
        }

        public Company(String str, String str2, Position position2, OrgUnit orgUnit, DepartmentList departmentList) {
            this(str, str2, position2, orgUnit, departmentList, ByteString.EMPTY);
        }

        public Company(String str, String str2, Position position2, OrgUnit orgUnit, DepartmentList departmentList, ByteString byteString) {
            super(ADAPTER, byteString);
            this.department_name = str;
            this.tenant_name = str2;
            this.position = position2;
            this.org_unit = orgUnit;
            this.departments = departmentList;
        }
    }

    public static final class AdminInfo extends Message<AdminInfo, C16282a> {
        public static final ProtoAdapter<AdminInfo> ADAPTER = new C16283b();
        public static final Boolean DEFAULT_IS_ADMIN = false;
        public static final Boolean DEFAULT_IS_TOPIC_GROUP_ADMIN = false;
        private static final long serialVersionUID = 0;
        public final String admin_url;
        public final Boolean is_admin;
        public final Boolean is_topic_group_admin;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$AdminInfo$b */
        private static final class C16283b extends ProtoAdapter<AdminInfo> {
            C16283b() {
                super(FieldEncoding.LENGTH_DELIMITED, AdminInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(AdminInfo adminInfo) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, adminInfo.is_admin);
                int i2 = 0;
                if (adminInfo.admin_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, adminInfo.admin_url);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (adminInfo.is_topic_group_admin != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, adminInfo.is_topic_group_admin);
                }
                return i3 + i2 + adminInfo.unknownFields().size();
            }

            /* renamed from: a */
            public AdminInfo decode(ProtoReader protoReader) throws IOException {
                C16282a aVar = new C16282a();
                aVar.f42479a = false;
                aVar.f42480b = "";
                aVar.f42481c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42479a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42480b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42481c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AdminInfo adminInfo) throws IOException {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, adminInfo.is_admin);
                if (adminInfo.admin_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, adminInfo.admin_url);
                }
                if (adminInfo.is_topic_group_admin != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, adminInfo.is_topic_group_admin);
                }
                protoWriter.writeBytes(adminInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16282a newBuilder() {
            C16282a aVar = new C16282a();
            aVar.f42479a = this.is_admin;
            aVar.f42480b = this.admin_url;
            aVar.f42481c = this.is_topic_group_admin;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$AdminInfo$a */
        public static final class C16282a extends Message.Builder<AdminInfo, C16282a> {

            /* renamed from: a */
            public Boolean f42479a;

            /* renamed from: b */
            public String f42480b;

            /* renamed from: c */
            public Boolean f42481c;

            /* renamed from: a */
            public AdminInfo build() {
                Boolean bool = this.f42479a;
                if (bool != null) {
                    return new AdminInfo(bool, this.f42480b, this.f42481c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(bool, "is_admin");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "AdminInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", is_admin=");
            sb.append(this.is_admin);
            if (this.admin_url != null) {
                sb.append(", admin_url=");
                sb.append(this.admin_url);
            }
            if (this.is_topic_group_admin != null) {
                sb.append(", is_topic_group_admin=");
                sb.append(this.is_topic_group_admin);
            }
            StringBuilder replace = sb.replace(0, 2, "AdminInfo{");
            replace.append('}');
            return replace.toString();
        }

        public AdminInfo(Boolean bool, String str, Boolean bool2) {
            this(bool, str, bool2, ByteString.EMPTY);
        }

        public AdminInfo(Boolean bool, String str, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_admin = bool;
            this.admin_url = str;
            this.is_topic_group_admin = bool2;
        }
    }

    public static final class Leader extends Message<Leader, C16294a> {
        public static final ProtoAdapter<Leader> ADAPTER = new C16295b();
        private static final long serialVersionUID = 0;
        public final String en_name;
        public final String id;
        public final String localized_name;
        public final String name;
        public final String profile_url;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Leader$b */
        private static final class C16295b extends ProtoAdapter<Leader> {
            C16295b() {
                super(FieldEncoding.LENGTH_DELIMITED, Leader.class);
            }

            /* renamed from: a */
            public int encodedSize(Leader leader) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (leader.id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, leader.id);
                } else {
                    i = 0;
                }
                if (leader.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, leader.name);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (leader.en_name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, leader.en_name);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (leader.profile_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, leader.profile_url);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (leader.localized_name != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, leader.localized_name);
                }
                return i8 + i5 + leader.unknownFields().size();
            }

            /* renamed from: a */
            public Leader decode(ProtoReader protoReader) throws IOException {
                C16294a aVar = new C16294a();
                aVar.f42492a = "";
                aVar.f42493b = "";
                aVar.f42494c = "";
                aVar.f42495d = "";
                aVar.f42496e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42492a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42493b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f42494c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f42495d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42496e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Leader leader) throws IOException {
                if (leader.id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, leader.id);
                }
                if (leader.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, leader.name);
                }
                if (leader.en_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, leader.en_name);
                }
                if (leader.profile_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, leader.profile_url);
                }
                if (leader.localized_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, leader.localized_name);
                }
                protoWriter.writeBytes(leader.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Leader$a */
        public static final class C16294a extends Message.Builder<Leader, C16294a> {

            /* renamed from: a */
            public String f42492a;

            /* renamed from: b */
            public String f42493b;

            /* renamed from: c */
            public String f42494c;

            /* renamed from: d */
            public String f42495d;

            /* renamed from: e */
            public String f42496e;

            /* renamed from: a */
            public Leader build() {
                return new Leader(this.f42492a, this.f42493b, this.f42494c, this.f42495d, this.f42496e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16294a newBuilder() {
            C16294a aVar = new C16294a();
            aVar.f42492a = this.id;
            aVar.f42493b = this.name;
            aVar.f42494c = this.en_name;
            aVar.f42495d = this.profile_url;
            aVar.f42496e = this.localized_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Leader");
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.en_name != null) {
                sb.append(", en_name=");
                sb.append(this.en_name);
            }
            if (this.profile_url != null) {
                sb.append(", profile_url=");
                sb.append(this.profile_url);
            }
            if (this.localized_name != null) {
                sb.append(", localized_name=");
                sb.append(this.localized_name);
            }
            StringBuilder replace = sb.replace(0, 2, "Leader{");
            replace.append('}');
            return replace.toString();
        }

        public Leader(String str, String str2, String str3, String str4, String str5) {
            this(str, str2, str3, str4, str5, ByteString.EMPTY);
        }

        public Leader(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.name = str2;
            this.en_name = str3;
            this.profile_url = str4;
            this.localized_name = str5;
        }
    }

    public static final class Personal extends Message<Personal, C16302a> {
        public static final ProtoAdapter<Personal> ADAPTER = new C16303b();
        public static final Chatter.Description.Type DEFAULT_DESCRIPTION_TYPE = Chatter.Description.Type.ON_DEFAULT;
        public static final Boolean DEFAULT_IS_FRIEND = false;
        public static final Boolean DEFAULT_IS_RESIGNED = false;
        public static final Boolean DEFAULT_REQUEST_USER_APPLY = false;
        public static final Boolean DEFAULT_TARGET_USER_APPLY = false;
        private static final long serialVersionUID = 0;
        public final String alias;
        public final String application_reason;
        public final String avatar_key;
        public final String avatar_path;
        public final String city;
        public final String contact_application_id;
        public final String contact_token;
        public final String description;
        public final Chatter.Description.Type description_type;
        public final String email;
        public final String employee_id;
        public final String en_name;
        public final String gender;
        public final Boolean is_friend;
        public final Boolean is_resigned;
        public final String localized_name;
        public final String malaita_profile_url;
        public final String microapp_profile_url;
        public final String name;
        public final ProfileValue profile_value;
        public final Boolean request_user_apply;
        public final Boolean target_user_apply;
        public final String tenant_id;
        public final String user_id;

        public static final class ProfileField extends Message<ProfileField, C16296a> {
            public static final ProtoAdapter<ProfileField> ADAPTER = new C16297b();
            public static final FieldType DEFAULT_FIELD_TYPE = FieldType.UNKNOWN;
            public static final FieldValueType DEFAULT_FIELD_VALUE_TYPE = FieldValueType.UNKNOWN_TYPE;
            public static final Boolean DEFAULT_VISIBLE = false;
            private static final long serialVersionUID = 0;
            public final String default_locale;
            public final FieldType field_type;
            public final FieldValueType field_value_type;
            public final String i18n_field_name;
            public final Map<String, String> i18n_names;
            public final String key;
            public final Boolean visible;

            public enum FieldType implements WireEnum {
                UNKNOWN(0),
                DEFAULT(1),
                CUSTOM(2);
                
                public static final ProtoAdapter<FieldType> ADAPTER = ProtoAdapter.newEnumAdapter(FieldType.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static FieldType fromValue(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return DEFAULT;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return CUSTOM;
                }

                private FieldType(int i) {
                    this.value = i;
                }
            }

            public enum FieldValueType implements WireEnum {
                UNKNOWN_TYPE(0),
                TEXT(1),
                HREF(2);
                
                public static final ProtoAdapter<FieldValueType> ADAPTER = ProtoAdapter.newEnumAdapter(FieldValueType.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static FieldValueType fromValue(int i) {
                    if (i == 0) {
                        return UNKNOWN_TYPE;
                    }
                    if (i == 1) {
                        return TEXT;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return HREF;
                }

                private FieldValueType(int i) {
                    this.value = i;
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$ProfileField$b */
            private static final class C16297b extends ProtoAdapter<ProfileField> {

                /* renamed from: a */
                private final ProtoAdapter<Map<String, String>> f42504a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

                C16297b() {
                    super(FieldEncoding.LENGTH_DELIMITED, ProfileField.class);
                }

                /* renamed from: a */
                public int encodedSize(ProfileField profileField) {
                    int i;
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, profileField.key) + this.f42504a.encodedSizeWithTag(2, profileField.i18n_names) + ProtoAdapter.BOOL.encodedSizeWithTag(3, profileField.visible) + FieldType.ADAPTER.encodedSizeWithTag(4, profileField.field_type) + ProtoAdapter.STRING.encodedSizeWithTag(5, profileField.default_locale) + ProtoAdapter.STRING.encodedSizeWithTag(6, profileField.i18n_field_name);
                    if (profileField.field_value_type != null) {
                        i = FieldValueType.ADAPTER.encodedSizeWithTag(7, profileField.field_value_type);
                    } else {
                        i = 0;
                    }
                    return encodedSizeWithTag + i + profileField.unknownFields().size();
                }

                /* renamed from: a */
                public ProfileField decode(ProtoReader protoReader) throws IOException {
                    C16296a aVar = new C16296a();
                    aVar.f42497a = "";
                    aVar.f42499c = false;
                    aVar.f42500d = FieldType.UNKNOWN;
                    aVar.f42501e = "";
                    aVar.f42502f = "";
                    aVar.f42503g = FieldValueType.UNKNOWN_TYPE;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f42497a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f42498b.putAll(this.f42504a.decode(protoReader));
                                    break;
                                case 3:
                                    aVar.f42499c = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 4:
                                    try {
                                        aVar.f42500d = FieldType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 5:
                                    aVar.f42501e = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 6:
                                    aVar.f42502f = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 7:
                                    try {
                                        aVar.f42503g = FieldValueType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
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
                public void encode(ProtoWriter protoWriter, ProfileField profileField) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, profileField.key);
                    this.f42504a.encodeWithTag(protoWriter, 2, profileField.i18n_names);
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, profileField.visible);
                    FieldType.ADAPTER.encodeWithTag(protoWriter, 4, profileField.field_type);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, profileField.default_locale);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, profileField.i18n_field_name);
                    if (profileField.field_value_type != null) {
                        FieldValueType.ADAPTER.encodeWithTag(protoWriter, 7, profileField.field_value_type);
                    }
                    protoWriter.writeBytes(profileField.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C16296a newBuilder() {
                C16296a aVar = new C16296a();
                aVar.f42497a = this.key;
                aVar.f42498b = Internal.copyOf("i18n_names", this.i18n_names);
                aVar.f42499c = this.visible;
                aVar.f42500d = this.field_type;
                aVar.f42501e = this.default_locale;
                aVar.f42502f = this.i18n_field_name;
                aVar.f42503g = this.field_value_type;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$ProfileField$a */
            public static final class C16296a extends Message.Builder<ProfileField, C16296a> {

                /* renamed from: a */
                public String f42497a;

                /* renamed from: b */
                public Map<String, String> f42498b = Internal.newMutableMap();

                /* renamed from: c */
                public Boolean f42499c;

                /* renamed from: d */
                public FieldType f42500d;

                /* renamed from: e */
                public String f42501e;

                /* renamed from: f */
                public String f42502f;

                /* renamed from: g */
                public FieldValueType f42503g;

                /* renamed from: a */
                public ProfileField build() {
                    Boolean bool;
                    FieldType fieldType;
                    String str;
                    String str2;
                    String str3 = this.f42497a;
                    if (str3 != null && (bool = this.f42499c) != null && (fieldType = this.f42500d) != null && (str = this.f42501e) != null && (str2 = this.f42502f) != null) {
                        return new ProfileField(str3, this.f42498b, bool, fieldType, str, str2, this.f42503g, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str3, "key", this.f42499c, "visible", this.f42500d, "field_type", this.f42501e, "default_locale", this.f42502f, "i18n_field_name");
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "ProfileField");
                StringBuilder sb = new StringBuilder();
                sb.append(", key=");
                sb.append(this.key);
                if (!this.i18n_names.isEmpty()) {
                    sb.append(", i18n_names=");
                    sb.append(this.i18n_names);
                }
                sb.append(", visible=");
                sb.append(this.visible);
                sb.append(", field_type=");
                sb.append(this.field_type);
                sb.append(", default_locale=");
                sb.append(this.default_locale);
                sb.append(", i18n_field_name=");
                sb.append(this.i18n_field_name);
                if (this.field_value_type != null) {
                    sb.append(", field_value_type=");
                    sb.append(this.field_value_type);
                }
                StringBuilder replace = sb.replace(0, 2, "ProfileField{");
                replace.append('}');
                return replace.toString();
            }

            public ProfileField(String str, Map<String, String> map, Boolean bool, FieldType fieldType, String str2, String str3, FieldValueType fieldValueType) {
                this(str, map, bool, fieldType, str2, str3, fieldValueType, ByteString.EMPTY);
            }

            public ProfileField(String str, Map<String, String> map, Boolean bool, FieldType fieldType, String str2, String str3, FieldValueType fieldValueType, ByteString byteString) {
                super(ADAPTER, byteString);
                this.key = str;
                this.i18n_names = Internal.immutableCopyOf("i18n_names", map);
                this.visible = bool;
                this.field_type = fieldType;
                this.default_locale = str2;
                this.i18n_field_name = str3;
                this.field_value_type = fieldValueType;
            }
        }

        public static final class ProfileValue extends Message<ProfileValue, C16300a> {
            public static final ProtoAdapter<ProfileValue> ADAPTER = new C16301b();
            public static final Gender DEFAULT_GENDER_ENUM = Gender.DEFAULT;
            private static final long serialVersionUID = 0;
            public final Map<String, String> custom_field_values;
            public final Map<String, FieldValue> custom_field_values_v2;
            public final Gender gender_enum;
            public final List<ProfileField> profile_fields_order;

            public enum Gender implements WireEnum {
                DEFAULT(0),
                MAN(1),
                WOMAN(2);
                
                public static final ProtoAdapter<Gender> ADAPTER = ProtoAdapter.newEnumAdapter(Gender.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static Gender fromValue(int i) {
                    if (i == 0) {
                        return DEFAULT;
                    }
                    if (i == 1) {
                        return MAN;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return WOMAN;
                }

                private Gender(int i) {
                    this.value = i;
                }
            }

            public static final class FieldValue extends Message<FieldValue, C16298a> {
                public static final ProtoAdapter<FieldValue> ADAPTER = new C16299b();
                private static final long serialVersionUID = 0;
                public final String TEXT;
                public final String URL;

                /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$ProfileValue$FieldValue$b */
                private static final class C16299b extends ProtoAdapter<FieldValue> {
                    C16299b() {
                        super(FieldEncoding.LENGTH_DELIMITED, FieldValue.class);
                    }

                    /* renamed from: a */
                    public int encodedSize(FieldValue fieldValue) {
                        int i;
                        int i2 = 0;
                        if (fieldValue.TEXT != null) {
                            i = ProtoAdapter.STRING.encodedSizeWithTag(1, fieldValue.TEXT);
                        } else {
                            i = 0;
                        }
                        if (fieldValue.URL != null) {
                            i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, fieldValue.URL);
                        }
                        return i + i2 + fieldValue.unknownFields().size();
                    }

                    /* renamed from: a */
                    public FieldValue decode(ProtoReader protoReader) throws IOException {
                        C16298a aVar = new C16298a();
                        aVar.f42505a = "";
                        aVar.f42506b = "";
                        long beginMessage = protoReader.beginMessage();
                        while (true) {
                            int nextTag = protoReader.nextTag();
                            if (nextTag == -1) {
                                protoReader.endMessage(beginMessage);
                                return aVar.build();
                            } else if (nextTag == 1) {
                                aVar.f42505a = ProtoAdapter.STRING.decode(protoReader);
                            } else if (nextTag != 2) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                aVar.f42506b = ProtoAdapter.STRING.decode(protoReader);
                            }
                        }
                    }

                    /* renamed from: a */
                    public void encode(ProtoWriter protoWriter, FieldValue fieldValue) throws IOException {
                        if (fieldValue.TEXT != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fieldValue.TEXT);
                        }
                        if (fieldValue.URL != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fieldValue.URL);
                        }
                        protoWriter.writeBytes(fieldValue.unknownFields());
                    }
                }

                /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$ProfileValue$FieldValue$a */
                public static final class C16298a extends Message.Builder<FieldValue, C16298a> {

                    /* renamed from: a */
                    public String f42505a;

                    /* renamed from: b */
                    public String f42506b;

                    /* renamed from: a */
                    public FieldValue build() {
                        return new FieldValue(this.f42505a, this.f42506b, super.buildUnknownFields());
                    }
                }

                @Override // com.squareup.wire.Message
                public C16298a newBuilder() {
                    C16298a aVar = new C16298a();
                    aVar.f42505a = this.TEXT;
                    aVar.f42506b = this.URL;
                    aVar.addUnknownFields(unknownFields());
                    return aVar;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    C1911a.m8540a("contact", "FieldValue");
                    StringBuilder sb = new StringBuilder();
                    if (this.TEXT != null) {
                        sb.append(", TEXT=");
                        sb.append(this.TEXT);
                    }
                    if (this.URL != null) {
                        sb.append(", URL=");
                        sb.append(this.URL);
                    }
                    StringBuilder replace = sb.replace(0, 2, "FieldValue{");
                    replace.append('}');
                    return replace.toString();
                }

                public FieldValue(String str, String str2) {
                    this(str, str2, ByteString.EMPTY);
                }

                public FieldValue(String str, String str2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    this.TEXT = str;
                    this.URL = str2;
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$ProfileValue$a */
            public static final class C16300a extends Message.Builder<ProfileValue, C16300a> {

                /* renamed from: a */
                public Map<String, String> f42507a = Internal.newMutableMap();

                /* renamed from: b */
                public List<ProfileField> f42508b = Internal.newMutableList();

                /* renamed from: c */
                public Gender f42509c;

                /* renamed from: d */
                public Map<String, FieldValue> f42510d = Internal.newMutableMap();

                /* renamed from: a */
                public ProfileValue build() {
                    return new ProfileValue(this.f42507a, this.f42508b, this.f42509c, this.f42510d, super.buildUnknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$ProfileValue$b */
            private static final class C16301b extends ProtoAdapter<ProfileValue> {

                /* renamed from: a */
                private final ProtoAdapter<Map<String, String>> f42511a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

                /* renamed from: b */
                private final ProtoAdapter<Map<String, FieldValue>> f42512b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FieldValue.ADAPTER);

                C16301b() {
                    super(FieldEncoding.LENGTH_DELIMITED, ProfileValue.class);
                }

                /* renamed from: a */
                public int encodedSize(ProfileValue profileValue) {
                    int i;
                    int encodedSizeWithTag = this.f42511a.encodedSizeWithTag(1, profileValue.custom_field_values) + ProfileField.ADAPTER.asRepeated().encodedSizeWithTag(2, profileValue.profile_fields_order);
                    if (profileValue.gender_enum != null) {
                        i = Gender.ADAPTER.encodedSizeWithTag(3, profileValue.gender_enum);
                    } else {
                        i = 0;
                    }
                    return encodedSizeWithTag + i + this.f42512b.encodedSizeWithTag(4, profileValue.custom_field_values_v2) + profileValue.unknownFields().size();
                }

                /* renamed from: a */
                public ProfileValue decode(ProtoReader protoReader) throws IOException {
                    C16300a aVar = new C16300a();
                    aVar.f42509c = Gender.DEFAULT;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f42507a.putAll(this.f42511a.decode(protoReader));
                        } else if (nextTag == 2) {
                            aVar.f42508b.add(ProfileField.ADAPTER.decode(protoReader));
                        } else if (nextTag == 3) {
                            try {
                                aVar.f42509c = Gender.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        } else if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f42510d.putAll(this.f42512b.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, ProfileValue profileValue) throws IOException {
                    this.f42511a.encodeWithTag(protoWriter, 1, profileValue.custom_field_values);
                    ProfileField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, profileValue.profile_fields_order);
                    if (profileValue.gender_enum != null) {
                        Gender.ADAPTER.encodeWithTag(protoWriter, 3, profileValue.gender_enum);
                    }
                    this.f42512b.encodeWithTag(protoWriter, 4, profileValue.custom_field_values_v2);
                    protoWriter.writeBytes(profileValue.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C16300a newBuilder() {
                C16300a aVar = new C16300a();
                aVar.f42507a = Internal.copyOf("custom_field_values", this.custom_field_values);
                aVar.f42508b = Internal.copyOf("profile_fields_order", this.profile_fields_order);
                aVar.f42509c = this.gender_enum;
                aVar.f42510d = Internal.copyOf("custom_field_values_v2", this.custom_field_values_v2);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "ProfileValue");
                StringBuilder sb = new StringBuilder();
                if (!this.custom_field_values.isEmpty()) {
                    sb.append(", custom_field_values=");
                    sb.append(this.custom_field_values);
                }
                if (!this.profile_fields_order.isEmpty()) {
                    sb.append(", profile_fields_order=");
                    sb.append(this.profile_fields_order);
                }
                if (this.gender_enum != null) {
                    sb.append(", gender_enum=");
                    sb.append(this.gender_enum);
                }
                if (!this.custom_field_values_v2.isEmpty()) {
                    sb.append(", custom_field_values_v2=");
                    sb.append(this.custom_field_values_v2);
                }
                StringBuilder replace = sb.replace(0, 2, "ProfileValue{");
                replace.append('}');
                return replace.toString();
            }

            public ProfileValue(Map<String, String> map, List<ProfileField> list, Gender gender, Map<String, FieldValue> map2) {
                this(map, list, gender, map2, ByteString.EMPTY);
            }

            public ProfileValue(Map<String, String> map, List<ProfileField> list, Gender gender, Map<String, FieldValue> map2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.custom_field_values = Internal.immutableCopyOf("custom_field_values", map);
                this.profile_fields_order = Internal.immutableCopyOf("profile_fields_order", list);
                this.gender_enum = gender;
                this.custom_field_values_v2 = Internal.immutableCopyOf("custom_field_values_v2", map2);
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$b */
        private static final class C16303b extends ProtoAdapter<Personal> {
            C16303b() {
                super(FieldEncoding.LENGTH_DELIMITED, Personal.class);
            }

            /* renamed from: a */
            public int encodedSize(Personal personal) {
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
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, personal.name);
                int i23 = 0;
                if (personal.description != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, personal.description);
                } else {
                    i = 0;
                }
                int i24 = encodedSizeWithTag + i;
                if (personal.email != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, personal.email);
                } else {
                    i2 = 0;
                }
                int i25 = i24 + i2;
                if (personal.gender != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, personal.gender);
                } else {
                    i3 = 0;
                }
                int i26 = i25 + i3;
                if (personal.malaita_profile_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, personal.malaita_profile_url);
                } else {
                    i4 = 0;
                }
                int i27 = i26 + i4;
                if (personal.description_type != null) {
                    i5 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(6, personal.description_type);
                } else {
                    i5 = 0;
                }
                int i28 = i27 + i5;
                if (personal.city != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, personal.city);
                } else {
                    i6 = 0;
                }
                int i29 = i28 + i6;
                if (personal.employee_id != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, personal.employee_id);
                } else {
                    i7 = 0;
                }
                int i30 = i29 + i7;
                if (personal.en_name != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, personal.en_name);
                } else {
                    i8 = 0;
                }
                int i31 = i30 + i8;
                if (personal.is_friend != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, personal.is_friend);
                } else {
                    i9 = 0;
                }
                int i32 = i31 + i9;
                if (personal.request_user_apply != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, personal.request_user_apply);
                } else {
                    i10 = 0;
                }
                int i33 = i32 + i10;
                if (personal.target_user_apply != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, personal.target_user_apply);
                } else {
                    i11 = 0;
                }
                int i34 = i33 + i11;
                if (personal.contact_token != null) {
                    i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, personal.contact_token);
                } else {
                    i12 = 0;
                }
                int i35 = i34 + i12;
                if (personal.contact_application_id != null) {
                    i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, personal.contact_application_id);
                } else {
                    i13 = 0;
                }
                int i36 = i35 + i13;
                if (personal.application_reason != null) {
                    i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, personal.application_reason);
                } else {
                    i14 = 0;
                }
                int i37 = i36 + i14;
                if (personal.user_id != null) {
                    i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, personal.user_id);
                } else {
                    i15 = 0;
                }
                int i38 = i37 + i15;
                if (personal.tenant_id != null) {
                    i16 = ProtoAdapter.STRING.encodedSizeWithTag(17, personal.tenant_id);
                } else {
                    i16 = 0;
                }
                int i39 = i38 + i16;
                if (personal.avatar_key != null) {
                    i17 = ProtoAdapter.STRING.encodedSizeWithTag(18, personal.avatar_key);
                } else {
                    i17 = 0;
                }
                int i40 = i39 + i17;
                if (personal.is_resigned != null) {
                    i18 = ProtoAdapter.BOOL.encodedSizeWithTag(19, personal.is_resigned);
                } else {
                    i18 = 0;
                }
                int i41 = i40 + i18;
                if (personal.localized_name != null) {
                    i19 = ProtoAdapter.STRING.encodedSizeWithTag(20, personal.localized_name);
                } else {
                    i19 = 0;
                }
                int i42 = i41 + i19;
                if (personal.alias != null) {
                    i20 = ProtoAdapter.STRING.encodedSizeWithTag(21, personal.alias);
                } else {
                    i20 = 0;
                }
                int i43 = i42 + i20;
                if (personal.microapp_profile_url != null) {
                    i21 = ProtoAdapter.STRING.encodedSizeWithTag(22, personal.microapp_profile_url);
                } else {
                    i21 = 0;
                }
                int i44 = i43 + i21;
                if (personal.profile_value != null) {
                    i22 = ProfileValue.ADAPTER.encodedSizeWithTag(23, personal.profile_value);
                } else {
                    i22 = 0;
                }
                int i45 = i44 + i22;
                if (personal.avatar_path != null) {
                    i23 = ProtoAdapter.STRING.encodedSizeWithTag(24, personal.avatar_path);
                }
                return i45 + i23 + personal.unknownFields().size();
            }

            /* renamed from: a */
            public Personal decode(ProtoReader protoReader) throws IOException {
                C16302a aVar = new C16302a();
                aVar.f42513a = "";
                aVar.f42514b = "";
                aVar.f42515c = "";
                aVar.f42516d = "";
                aVar.f42517e = "";
                aVar.f42518f = Chatter.Description.Type.ON_DEFAULT;
                aVar.f42519g = "";
                aVar.f42520h = "";
                aVar.f42521i = "";
                aVar.f42522j = false;
                aVar.f42523k = false;
                aVar.f42524l = false;
                aVar.f42525m = "";
                aVar.f42526n = "";
                aVar.f42527o = "";
                aVar.f42528p = "";
                aVar.f42529q = "";
                aVar.f42530r = "";
                aVar.f42531s = false;
                aVar.f42532t = "";
                aVar.f42533u = "";
                aVar.f42534v = "";
                aVar.f42536x = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f42513a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f42514b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f42515c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f42516d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f42517e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                try {
                                    aVar.f42518f = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 7:
                                aVar.f42519g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f42520h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f42521i = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 10:
                                aVar.f42522j = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f42523k = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f42524l = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 13:
                                aVar.f42525m = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                aVar.f42526n = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 15:
                                aVar.f42527o = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 16:
                                aVar.f42528p = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 17:
                                aVar.f42529q = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 18:
                                aVar.f42530r = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                aVar.f42531s = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 20:
                                aVar.f42532t = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 21:
                                aVar.f42533u = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 22:
                                aVar.f42534v = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 23:
                                aVar.f42535w = ProfileValue.ADAPTER.decode(protoReader);
                                break;
                            case 24:
                                aVar.f42536x = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Personal personal) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, personal.name);
                if (personal.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, personal.description);
                }
                if (personal.email != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, personal.email);
                }
                if (personal.gender != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, personal.gender);
                }
                if (personal.malaita_profile_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, personal.malaita_profile_url);
                }
                if (personal.description_type != null) {
                    Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 6, personal.description_type);
                }
                if (personal.city != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, personal.city);
                }
                if (personal.employee_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, personal.employee_id);
                }
                if (personal.en_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, personal.en_name);
                }
                if (personal.is_friend != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, personal.is_friend);
                }
                if (personal.request_user_apply != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, personal.request_user_apply);
                }
                if (personal.target_user_apply != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, personal.target_user_apply);
                }
                if (personal.contact_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, personal.contact_token);
                }
                if (personal.contact_application_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, personal.contact_application_id);
                }
                if (personal.application_reason != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, personal.application_reason);
                }
                if (personal.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, personal.user_id);
                }
                if (personal.tenant_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, personal.tenant_id);
                }
                if (personal.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, personal.avatar_key);
                }
                if (personal.is_resigned != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, personal.is_resigned);
                }
                if (personal.localized_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, personal.localized_name);
                }
                if (personal.alias != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, personal.alias);
                }
                if (personal.microapp_profile_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, personal.microapp_profile_url);
                }
                if (personal.profile_value != null) {
                    ProfileValue.ADAPTER.encodeWithTag(protoWriter, 23, personal.profile_value);
                }
                if (personal.avatar_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, personal.avatar_path);
                }
                protoWriter.writeBytes(personal.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$Personal$a */
        public static final class C16302a extends Message.Builder<Personal, C16302a> {

            /* renamed from: a */
            public String f42513a;

            /* renamed from: b */
            public String f42514b;

            /* renamed from: c */
            public String f42515c;

            /* renamed from: d */
            public String f42516d;

            /* renamed from: e */
            public String f42517e;

            /* renamed from: f */
            public Chatter.Description.Type f42518f;

            /* renamed from: g */
            public String f42519g;

            /* renamed from: h */
            public String f42520h;

            /* renamed from: i */
            public String f42521i;

            /* renamed from: j */
            public Boolean f42522j;

            /* renamed from: k */
            public Boolean f42523k;

            /* renamed from: l */
            public Boolean f42524l;

            /* renamed from: m */
            public String f42525m;

            /* renamed from: n */
            public String f42526n;

            /* renamed from: o */
            public String f42527o;

            /* renamed from: p */
            public String f42528p;

            /* renamed from: q */
            public String f42529q;

            /* renamed from: r */
            public String f42530r;

            /* renamed from: s */
            public Boolean f42531s;

            /* renamed from: t */
            public String f42532t;

            /* renamed from: u */
            public String f42533u;

            /* renamed from: v */
            public String f42534v;

            /* renamed from: w */
            public ProfileValue f42535w;

            /* renamed from: x */
            public String f42536x;

            /* renamed from: a */
            public Personal build() {
                String str = this.f42513a;
                if (str != null) {
                    return new Personal(str, this.f42514b, this.f42515c, this.f42516d, this.f42517e, this.f42518f, this.f42519g, this.f42520h, this.f42521i, this.f42522j, this.f42523k, this.f42524l, this.f42525m, this.f42526n, this.f42527o, this.f42528p, this.f42529q, this.f42530r, this.f42531s, this.f42532t, this.f42533u, this.f42534v, this.f42535w, this.f42536x, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "name");
            }
        }

        @Override // com.squareup.wire.Message
        public C16302a newBuilder() {
            C16302a aVar = new C16302a();
            aVar.f42513a = this.name;
            aVar.f42514b = this.description;
            aVar.f42515c = this.email;
            aVar.f42516d = this.gender;
            aVar.f42517e = this.malaita_profile_url;
            aVar.f42518f = this.description_type;
            aVar.f42519g = this.city;
            aVar.f42520h = this.employee_id;
            aVar.f42521i = this.en_name;
            aVar.f42522j = this.is_friend;
            aVar.f42523k = this.request_user_apply;
            aVar.f42524l = this.target_user_apply;
            aVar.f42525m = this.contact_token;
            aVar.f42526n = this.contact_application_id;
            aVar.f42527o = this.application_reason;
            aVar.f42528p = this.user_id;
            aVar.f42529q = this.tenant_id;
            aVar.f42530r = this.avatar_key;
            aVar.f42531s = this.is_resigned;
            aVar.f42532t = this.localized_name;
            aVar.f42533u = this.alias;
            aVar.f42534v = this.microapp_profile_url;
            aVar.f42535w = this.profile_value;
            aVar.f42536x = this.avatar_path;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Personal");
            StringBuilder sb = new StringBuilder();
            sb.append(", name=");
            sb.append(this.name);
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.email != null) {
                sb.append(", email=");
                sb.append(this.email);
            }
            if (this.gender != null) {
                sb.append(", gender=");
                sb.append(this.gender);
            }
            if (this.malaita_profile_url != null) {
                sb.append(", malaita_profile_url=");
                sb.append(this.malaita_profile_url);
            }
            if (this.description_type != null) {
                sb.append(", description_type=");
                sb.append(this.description_type);
            }
            if (this.city != null) {
                sb.append(", city=");
                sb.append(this.city);
            }
            if (this.employee_id != null) {
                sb.append(", employee_id=");
                sb.append(this.employee_id);
            }
            if (this.en_name != null) {
                sb.append(", en_name=");
                sb.append(this.en_name);
            }
            if (this.is_friend != null) {
                sb.append(", is_friend=");
                sb.append(this.is_friend);
            }
            if (this.request_user_apply != null) {
                sb.append(", request_user_apply=");
                sb.append(this.request_user_apply);
            }
            if (this.target_user_apply != null) {
                sb.append(", target_user_apply=");
                sb.append(this.target_user_apply);
            }
            if (this.contact_token != null) {
                sb.append(", contact_token=");
                sb.append(this.contact_token);
            }
            if (this.contact_application_id != null) {
                sb.append(", contact_application_id=");
                sb.append(this.contact_application_id);
            }
            if (this.application_reason != null) {
                sb.append(", application_reason=");
                sb.append(this.application_reason);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.tenant_id != null) {
                sb.append(", tenant_id=");
                sb.append(this.tenant_id);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.is_resigned != null) {
                sb.append(", is_resigned=");
                sb.append(this.is_resigned);
            }
            if (this.localized_name != null) {
                sb.append(", localized_name=");
                sb.append(this.localized_name);
            }
            if (this.alias != null) {
                sb.append(", alias=");
                sb.append(this.alias);
            }
            if (this.microapp_profile_url != null) {
                sb.append(", microapp_profile_url=");
                sb.append(this.microapp_profile_url);
            }
            if (this.profile_value != null) {
                sb.append(", profile_value=");
                sb.append(this.profile_value);
            }
            if (this.avatar_path != null) {
                sb.append(", avatar_path=");
                sb.append(this.avatar_path);
            }
            StringBuilder replace = sb.replace(0, 2, "Personal{");
            replace.append('}');
            return replace.toString();
        }

        public Personal(String str, String str2, String str3, String str4, String str5, Chatter.Description.Type type, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool4, String str15, String str16, String str17, ProfileValue profileValue, String str18) {
            this(str, str2, str3, str4, str5, type, str6, str7, str8, bool, bool2, bool3, str9, str10, str11, str12, str13, str14, bool4, str15, str16, str17, profileValue, str18, ByteString.EMPTY);
        }

        public Personal(String str, String str2, String str3, String str4, String str5, Chatter.Description.Type type, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool4, String str15, String str16, String str17, ProfileValue profileValue, String str18, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.description = str2;
            this.email = str3;
            this.gender = str4;
            this.malaita_profile_url = str5;
            this.description_type = type;
            this.city = str6;
            this.employee_id = str7;
            this.en_name = str8;
            this.is_friend = bool;
            this.request_user_apply = bool2;
            this.target_user_apply = bool3;
            this.contact_token = str9;
            this.contact_application_id = str10;
            this.application_reason = str11;
            this.user_id = str12;
            this.tenant_id = str13;
            this.avatar_key = str14;
            this.is_resigned = bool4;
            this.localized_name = str15;
            this.alias = str16;
            this.microapp_profile_url = str17;
            this.profile_value = profileValue;
            this.avatar_path = str18;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$b */
    private static final class C16305b extends ProtoAdapter<GetUserProfileResponse> {
        C16305b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserProfileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserProfileResponse getUserProfileResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (getUserProfileResponse.company != null) {
                i = Company.ADAPTER.encodedSizeWithTag(1, getUserProfileResponse.company);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Personal.ADAPTER.encodedSizeWithTag(2, getUserProfileResponse.personal);
            if (getUserProfileResponse.leader != null) {
                i2 = Leader.ADAPTER.encodedSizeWithTag(3, getUserProfileResponse.leader);
            } else {
                i2 = 0;
            }
            int i7 = encodedSizeWithTag + i2;
            if (getUserProfileResponse.admin_info != null) {
                i3 = AdminInfo.ADAPTER.encodedSizeWithTag(4, getUserProfileResponse.admin_info);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getUserProfileResponse.work_status != null) {
                i4 = WorkStatus.ADAPTER.encodedSizeWithTag(5, getUserProfileResponse.work_status);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getUserProfileResponse.access_info != null) {
                i5 = Chatter.AccessInfo.ADAPTER.encodedSizeWithTag(6, getUserProfileResponse.access_info);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (getUserProfileResponse.do_not_disturb_end_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, getUserProfileResponse.do_not_disturb_end_time);
            }
            return i10 + i6 + getUserProfileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserProfileResponse decode(ProtoReader protoReader) throws IOException {
            C16304a aVar = new C16304a();
            aVar.f42543g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42537a = Company.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42538b = Personal.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42539c = Leader.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42540d = AdminInfo.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42541e = WorkStatus.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42542f = Chatter.AccessInfo.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42543g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetUserProfileResponse getUserProfileResponse) throws IOException {
            if (getUserProfileResponse.company != null) {
                Company.ADAPTER.encodeWithTag(protoWriter, 1, getUserProfileResponse.company);
            }
            Personal.ADAPTER.encodeWithTag(protoWriter, 2, getUserProfileResponse.personal);
            if (getUserProfileResponse.leader != null) {
                Leader.ADAPTER.encodeWithTag(protoWriter, 3, getUserProfileResponse.leader);
            }
            if (getUserProfileResponse.admin_info != null) {
                AdminInfo.ADAPTER.encodeWithTag(protoWriter, 4, getUserProfileResponse.admin_info);
            }
            if (getUserProfileResponse.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 5, getUserProfileResponse.work_status);
            }
            if (getUserProfileResponse.access_info != null) {
                Chatter.AccessInfo.ADAPTER.encodeWithTag(protoWriter, 6, getUserProfileResponse.access_info);
            }
            if (getUserProfileResponse.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, getUserProfileResponse.do_not_disturb_end_time);
            }
            protoWriter.writeBytes(getUserProfileResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileResponse$a */
    public static final class C16304a extends Message.Builder<GetUserProfileResponse, C16304a> {

        /* renamed from: a */
        public Company f42537a;

        /* renamed from: b */
        public Personal f42538b;

        /* renamed from: c */
        public Leader f42539c;

        /* renamed from: d */
        public AdminInfo f42540d;

        /* renamed from: e */
        public WorkStatus f42541e;

        /* renamed from: f */
        public Chatter.AccessInfo f42542f;

        /* renamed from: g */
        public Long f42543g;

        /* renamed from: a */
        public GetUserProfileResponse build() {
            Personal personal = this.f42538b;
            if (personal != null) {
                return new GetUserProfileResponse(this.f42537a, personal, this.f42539c, this.f42540d, this.f42541e, this.f42542f, this.f42543g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(personal, "personal");
        }
    }

    @Override // com.squareup.wire.Message
    public C16304a newBuilder() {
        C16304a aVar = new C16304a();
        aVar.f42537a = this.company;
        aVar.f42538b = this.personal;
        aVar.f42539c = this.leader;
        aVar.f42540d = this.admin_info;
        aVar.f42541e = this.work_status;
        aVar.f42542f = this.access_info;
        aVar.f42543g = this.do_not_disturb_end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserProfileResponse");
        StringBuilder sb = new StringBuilder();
        if (this.company != null) {
            sb.append(", company=");
            sb.append(this.company);
        }
        sb.append(", personal=");
        sb.append(this.personal);
        if (this.leader != null) {
            sb.append(", leader=");
            sb.append(this.leader);
        }
        if (this.admin_info != null) {
            sb.append(", admin_info=");
            sb.append(this.admin_info);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        if (this.access_info != null) {
            sb.append(", access_info=");
            sb.append(this.access_info);
        }
        if (this.do_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.do_not_disturb_end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserProfileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserProfileResponse(Company company2, Personal personal2, Leader leader2, AdminInfo adminInfo, WorkStatus workStatus, Chatter.AccessInfo accessInfo, Long l) {
        this(company2, personal2, leader2, adminInfo, workStatus, accessInfo, l, ByteString.EMPTY);
    }

    public GetUserProfileResponse(Company company2, Personal personal2, Leader leader2, AdminInfo adminInfo, WorkStatus workStatus, Chatter.AccessInfo accessInfo, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.company = company2;
        this.personal = personal2;
        this.leader = leader2;
        this.admin_info = adminInfo;
        this.work_status = workStatus;
        this.access_info = accessInfo;
        this.do_not_disturb_end_time = l;
    }
}
