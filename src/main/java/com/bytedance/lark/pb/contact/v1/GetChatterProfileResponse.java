package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetChatterProfileResponse extends Message<GetChatterProfileResponse, C16206a> {
    public static final ProtoAdapter<GetChatterProfileResponse> ADAPTER = new C16207b();
    private static final long serialVersionUID = 0;
    public final Chatter.AccessInfo access_info;
    public final Company company;
    public final Leader leader;
    public final Personal personal;
    public final WorkStatus work_status;

    public static final class Leader extends Message<Leader, C16202a> {
        public static final ProtoAdapter<Leader> ADAPTER = new C16203b();
        private static final long serialVersionUID = 0;
        public final String en_name;
        public final String id;
        public final String name;
        public final String profile_url;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$Leader$b */
        private static final class C16203b extends ProtoAdapter<Leader> {
            C16203b() {
                super(FieldEncoding.LENGTH_DELIMITED, Leader.class);
            }

            /* renamed from: a */
            public int encodedSize(Leader leader) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
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
                int i5 = i + i2;
                if (leader.en_name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, leader.en_name);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (leader.profile_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, leader.profile_url);
                }
                return i6 + i4 + leader.unknownFields().size();
            }

            /* renamed from: a */
            public Leader decode(ProtoReader protoReader) throws IOException {
                C16202a aVar = new C16202a();
                aVar.f42361a = "";
                aVar.f42362b = "";
                aVar.f42363c = "";
                aVar.f42364d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42361a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42362b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f42363c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42364d = ProtoAdapter.STRING.decode(protoReader);
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
                protoWriter.writeBytes(leader.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$Leader$a */
        public static final class C16202a extends Message.Builder<Leader, C16202a> {

            /* renamed from: a */
            public String f42361a;

            /* renamed from: b */
            public String f42362b;

            /* renamed from: c */
            public String f42363c;

            /* renamed from: d */
            public String f42364d;

            /* renamed from: a */
            public Leader build() {
                return new Leader(this.f42361a, this.f42362b, this.f42363c, this.f42364d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16202a newBuilder() {
            C16202a aVar = new C16202a();
            aVar.f42361a = this.id;
            aVar.f42362b = this.name;
            aVar.f42363c = this.en_name;
            aVar.f42364d = this.profile_url;
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
            StringBuilder replace = sb.replace(0, 2, "Leader{");
            replace.append('}');
            return replace.toString();
        }

        public Leader(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, ByteString.EMPTY);
        }

        public Leader(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.name = str2;
            this.en_name = str3;
            this.profile_url = str4;
        }
    }

    public static final class Personal extends Message<Personal, C16204a> {
        public static final ProtoAdapter<Personal> ADAPTER = new C16205b();
        public static final Chatter.Description.Type DEFAULT_DESCRIPTION_TYPE = Chatter.Description.Type.ON_DEFAULT;
        private static final long serialVersionUID = 0;
        public final String city;
        public final String description;
        public final Chatter.Description.Type description_type;
        public final String email;
        public final String employee_id;
        public final String en_name;
        public final String gender;
        public final String malaita_profile_url;
        public final String name;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$Personal$b */
        private static final class C16205b extends ProtoAdapter<Personal> {
            C16205b() {
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
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, personal.name);
                int i8 = 0;
                if (personal.description != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, personal.description);
                } else {
                    i = 0;
                }
                int i9 = encodedSizeWithTag + i;
                if (personal.email != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, personal.email);
                } else {
                    i2 = 0;
                }
                int i10 = i9 + i2;
                if (personal.gender != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, personal.gender);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (personal.malaita_profile_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, personal.malaita_profile_url);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (personal.description_type != null) {
                    i5 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(6, personal.description_type);
                } else {
                    i5 = 0;
                }
                int i13 = i12 + i5;
                if (personal.city != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, personal.city);
                } else {
                    i6 = 0;
                }
                int i14 = i13 + i6;
                if (personal.employee_id != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, personal.employee_id);
                } else {
                    i7 = 0;
                }
                int i15 = i14 + i7;
                if (personal.en_name != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, personal.en_name);
                }
                return i15 + i8 + personal.unknownFields().size();
            }

            /* renamed from: a */
            public Personal decode(ProtoReader protoReader) throws IOException {
                C16204a aVar = new C16204a();
                aVar.f42365a = "";
                aVar.f42366b = "";
                aVar.f42367c = "";
                aVar.f42368d = "";
                aVar.f42369e = "";
                aVar.f42370f = Chatter.Description.Type.ON_DEFAULT;
                aVar.f42371g = "";
                aVar.f42372h = "";
                aVar.f42373i = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f42365a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f42366b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f42367c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f42368d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f42369e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                try {
                                    aVar.f42370f = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 7:
                                aVar.f42371g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f42372h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f42373i = ProtoAdapter.STRING.decode(protoReader);
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
                protoWriter.writeBytes(personal.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$Personal$a */
        public static final class C16204a extends Message.Builder<Personal, C16204a> {

            /* renamed from: a */
            public String f42365a;

            /* renamed from: b */
            public String f42366b;

            /* renamed from: c */
            public String f42367c;

            /* renamed from: d */
            public String f42368d;

            /* renamed from: e */
            public String f42369e;

            /* renamed from: f */
            public Chatter.Description.Type f42370f;

            /* renamed from: g */
            public String f42371g;

            /* renamed from: h */
            public String f42372h;

            /* renamed from: i */
            public String f42373i;

            /* renamed from: a */
            public Personal build() {
                String str = this.f42365a;
                if (str != null) {
                    return new Personal(str, this.f42366b, this.f42367c, this.f42368d, this.f42369e, this.f42370f, this.f42371g, this.f42372h, this.f42373i, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "name");
            }
        }

        @Override // com.squareup.wire.Message
        public C16204a newBuilder() {
            C16204a aVar = new C16204a();
            aVar.f42365a = this.name;
            aVar.f42366b = this.description;
            aVar.f42367c = this.email;
            aVar.f42368d = this.gender;
            aVar.f42369e = this.malaita_profile_url;
            aVar.f42370f = this.description_type;
            aVar.f42371g = this.city;
            aVar.f42372h = this.employee_id;
            aVar.f42373i = this.en_name;
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
            StringBuilder replace = sb.replace(0, 2, "Personal{");
            replace.append('}');
            return replace.toString();
        }

        public Personal(String str, String str2, String str3, String str4, String str5, Chatter.Description.Type type, String str6, String str7, String str8) {
            this(str, str2, str3, str4, str5, type, str6, str7, str8, ByteString.EMPTY);
        }

        public Personal(String str, String str2, String str3, String str4, String str5, Chatter.Description.Type type, String str6, String str7, String str8, ByteString byteString) {
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
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$b */
    private static final class C16207b extends ProtoAdapter<GetChatterProfileResponse> {
        C16207b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterProfileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterProfileResponse getChatterProfileResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getChatterProfileResponse.company != null) {
                i = Company.ADAPTER.encodedSizeWithTag(1, getChatterProfileResponse.company);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Personal.ADAPTER.encodedSizeWithTag(2, getChatterProfileResponse.personal);
            if (getChatterProfileResponse.leader != null) {
                i2 = Leader.ADAPTER.encodedSizeWithTag(3, getChatterProfileResponse.leader);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (getChatterProfileResponse.work_status != null) {
                i3 = WorkStatus.ADAPTER.encodedSizeWithTag(4, getChatterProfileResponse.work_status);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getChatterProfileResponse.access_info != null) {
                i4 = Chatter.AccessInfo.ADAPTER.encodedSizeWithTag(5, getChatterProfileResponse.access_info);
            }
            return i6 + i4 + getChatterProfileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterProfileResponse decode(ProtoReader protoReader) throws IOException {
            C16206a aVar = new C16206a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42374a = Company.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42375b = Personal.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42376c = Leader.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42377d = WorkStatus.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42378e = Chatter.AccessInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterProfileResponse getChatterProfileResponse) throws IOException {
            if (getChatterProfileResponse.company != null) {
                Company.ADAPTER.encodeWithTag(protoWriter, 1, getChatterProfileResponse.company);
            }
            Personal.ADAPTER.encodeWithTag(protoWriter, 2, getChatterProfileResponse.personal);
            if (getChatterProfileResponse.leader != null) {
                Leader.ADAPTER.encodeWithTag(protoWriter, 3, getChatterProfileResponse.leader);
            }
            if (getChatterProfileResponse.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 4, getChatterProfileResponse.work_status);
            }
            if (getChatterProfileResponse.access_info != null) {
                Chatter.AccessInfo.ADAPTER.encodeWithTag(protoWriter, 5, getChatterProfileResponse.access_info);
            }
            protoWriter.writeBytes(getChatterProfileResponse.unknownFields());
        }
    }

    public static final class Company extends Message<Company, C16200a> {
        public static final ProtoAdapter<Company> ADAPTER = new C16201b();
        private static final long serialVersionUID = 0;
        public final String department_name;
        public final Map<String, String> leader;
        public final String organization_name;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$Company$a */
        public static final class C16200a extends Message.Builder<Company, C16200a> {

            /* renamed from: a */
            public String f42357a;

            /* renamed from: b */
            public String f42358b;

            /* renamed from: c */
            public Map<String, String> f42359c = Internal.newMutableMap();

            /* renamed from: a */
            public Company build() {
                return new Company(this.f42357a, this.f42358b, this.f42359c, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$Company$b */
        private static final class C16201b extends ProtoAdapter<Company> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f42360a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C16201b() {
                super(FieldEncoding.LENGTH_DELIMITED, Company.class);
            }

            /* renamed from: a */
            public int encodedSize(Company company) {
                int i;
                int i2 = 0;
                if (company.department_name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, company.department_name);
                } else {
                    i = 0;
                }
                if (company.organization_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, company.organization_name);
                }
                return i + i2 + this.f42360a.encodedSizeWithTag(3, company.leader) + company.unknownFields().size();
            }

            /* renamed from: a */
            public Company decode(ProtoReader protoReader) throws IOException {
                C16200a aVar = new C16200a();
                aVar.f42357a = "";
                aVar.f42358b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42357a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42358b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42359c.putAll(this.f42360a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Company company) throws IOException {
                if (company.department_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, company.department_name);
                }
                if (company.organization_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, company.organization_name);
                }
                this.f42360a.encodeWithTag(protoWriter, 3, company.leader);
                protoWriter.writeBytes(company.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16200a newBuilder() {
            C16200a aVar = new C16200a();
            aVar.f42357a = this.department_name;
            aVar.f42358b = this.organization_name;
            aVar.f42359c = Internal.copyOf("leader", this.leader);
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
            if (this.organization_name != null) {
                sb.append(", organization_name=");
                sb.append(this.organization_name);
            }
            if (!this.leader.isEmpty()) {
                sb.append(", leader=");
                sb.append(this.leader);
            }
            StringBuilder replace = sb.replace(0, 2, "Company{");
            replace.append('}');
            return replace.toString();
        }

        public Company(String str, String str2, Map<String, String> map) {
            this(str, str2, map, ByteString.EMPTY);
        }

        public Company(String str, String str2, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.department_name = str;
            this.organization_name = str2;
            this.leader = Internal.immutableCopyOf("leader", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse$a */
    public static final class C16206a extends Message.Builder<GetChatterProfileResponse, C16206a> {

        /* renamed from: a */
        public Company f42374a;

        /* renamed from: b */
        public Personal f42375b;

        /* renamed from: c */
        public Leader f42376c;

        /* renamed from: d */
        public WorkStatus f42377d;

        /* renamed from: e */
        public Chatter.AccessInfo f42378e;

        /* renamed from: a */
        public GetChatterProfileResponse build() {
            Personal personal = this.f42375b;
            if (personal != null) {
                return new GetChatterProfileResponse(this.f42374a, personal, this.f42376c, this.f42377d, this.f42378e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(personal, "personal");
        }
    }

    @Override // com.squareup.wire.Message
    public C16206a newBuilder() {
        C16206a aVar = new C16206a();
        aVar.f42374a = this.company;
        aVar.f42375b = this.personal;
        aVar.f42376c = this.leader;
        aVar.f42377d = this.work_status;
        aVar.f42378e = this.access_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterProfileResponse");
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
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        if (this.access_info != null) {
            sb.append(", access_info=");
            sb.append(this.access_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatterProfileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterProfileResponse(Company company2, Personal personal2, Leader leader2, WorkStatus workStatus, Chatter.AccessInfo accessInfo) {
        this(company2, personal2, leader2, workStatus, accessInfo, ByteString.EMPTY);
    }

    public GetChatterProfileResponse(Company company2, Personal personal2, Leader leader2, WorkStatus workStatus, Chatter.AccessInfo accessInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.company = company2;
        this.personal = personal2;
        this.leader = leader2;
        this.work_status = workStatus;
        this.access_info = accessInfo;
    }
}
