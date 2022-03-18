package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Department extends Message<Department, C14860a> {
    public static final ProtoAdapter<Department> ADAPTER = new C14861b();
    public static final Boolean DEFAULT_CAN_CREATE_DEPARTMENT = false;
    public static final Boolean DEFAULT_HAS_SUB_DEPARTMENTS = false;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean can_create_department;
    public final String chat_id;
    public final Boolean has_sub_departments;
    public final String id;
    public final String leader_id;
    public final Integer member_count;
    public final String name;
    public final String parent_id;
    public final String ref_parent_id;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Department$b */
    private static final class C14861b extends ProtoAdapter<Department> {
        C14861b() {
            super(FieldEncoding.LENGTH_DELIMITED, Department.class);
        }

        /* renamed from: a */
        public int encodedSize(Department department) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, department.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, department.name);
            int i7 = 0;
            if (department.parent_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, department.parent_id);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (department.leader_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, department.leader_id);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (department.member_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, department.member_count);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (department.ref_parent_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, department.ref_parent_id);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (department.chat_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, department.chat_id);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (department.has_sub_departments != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(8, department.has_sub_departments);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (department.can_create_department != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, department.can_create_department);
            }
            return i13 + i7 + department.unknownFields().size();
        }

        /* renamed from: a */
        public Department decode(ProtoReader protoReader) throws IOException {
            C14860a aVar = new C14860a();
            aVar.f39291a = "";
            aVar.f39292b = "";
            aVar.f39293c = "";
            aVar.f39294d = "";
            aVar.f39295e = 0;
            aVar.f39296f = "";
            aVar.f39297g = "";
            aVar.f39298h = false;
            aVar.f39299i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39291a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39292b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39293c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39294d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39295e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39296f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39297g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39298h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39299i = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Department department) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, department.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, department.name);
            if (department.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, department.parent_id);
            }
            if (department.leader_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, department.leader_id);
            }
            if (department.member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, department.member_count);
            }
            if (department.ref_parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, department.ref_parent_id);
            }
            if (department.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, department.chat_id);
            }
            if (department.has_sub_departments != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, department.has_sub_departments);
            }
            if (department.can_create_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, department.can_create_department);
            }
            protoWriter.writeBytes(department.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Department$a */
    public static final class C14860a extends Message.Builder<Department, C14860a> {

        /* renamed from: a */
        public String f39291a;

        /* renamed from: b */
        public String f39292b;

        /* renamed from: c */
        public String f39293c;

        /* renamed from: d */
        public String f39294d;

        /* renamed from: e */
        public Integer f39295e;

        /* renamed from: f */
        public String f39296f;

        /* renamed from: g */
        public String f39297g;

        /* renamed from: h */
        public Boolean f39298h;

        /* renamed from: i */
        public Boolean f39299i;

        /* renamed from: a */
        public Department build() {
            String str;
            String str2 = this.f39291a;
            if (str2 != null && (str = this.f39292b) != null) {
                return new Department(str2, str, this.f39293c, this.f39294d, this.f39295e, this.f39296f, this.f39297g, this.f39298h, this.f39299i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f39292b, "name");
        }
    }

    @Override // com.squareup.wire.Message
    public C14860a newBuilder() {
        C14860a aVar = new C14860a();
        aVar.f39291a = this.id;
        aVar.f39292b = this.name;
        aVar.f39293c = this.parent_id;
        aVar.f39294d = this.leader_id;
        aVar.f39295e = this.member_count;
        aVar.f39296f = this.ref_parent_id;
        aVar.f39297g = this.chat_id;
        aVar.f39298h = this.has_sub_departments;
        aVar.f39299i = this.can_create_department;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Department");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.leader_id != null) {
            sb.append(", leader_id=");
            sb.append(this.leader_id);
        }
        if (this.member_count != null) {
            sb.append(", member_count=");
            sb.append(this.member_count);
        }
        if (this.ref_parent_id != null) {
            sb.append(", ref_parent_id=");
            sb.append(this.ref_parent_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.has_sub_departments != null) {
            sb.append(", has_sub_departments=");
            sb.append(this.has_sub_departments);
        }
        if (this.can_create_department != null) {
            sb.append(", can_create_department=");
            sb.append(this.can_create_department);
        }
        StringBuilder replace = sb.replace(0, 2, "Department{");
        replace.append('}');
        return replace.toString();
    }

    public Department(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, num, str5, str6, bool, bool2, ByteString.EMPTY);
    }

    public Department(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.parent_id = str3;
        this.leader_id = str4;
        this.member_count = num;
        this.ref_parent_id = str5;
        this.chat_id = str6;
        this.has_sub_departments = bool;
        this.can_create_department = bool2;
    }
}
