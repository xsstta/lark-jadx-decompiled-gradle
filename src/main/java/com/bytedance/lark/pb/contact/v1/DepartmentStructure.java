package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Department;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DepartmentStructure extends Message<DepartmentStructure, C16166a> {
    public static final ProtoAdapter<DepartmentStructure> ADAPTER = new C16167b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Boolean DEFAULT_HAS_MORE_DEPARTMENT = false;
    private static final long serialVersionUID = 0;
    public final List<String> administrator;
    public final ChatInfo chat_info;
    public final List<Chatter> chatters;
    public final Department department;
    public final Boolean has_more;
    public final Boolean has_more_department;
    public final Chatter leader;
    public final List<Department> sub_departments;
    public final List<String> super_administrator;

    /* renamed from: com.bytedance.lark.pb.contact.v1.DepartmentStructure$b */
    private static final class C16167b extends ProtoAdapter<DepartmentStructure> {
        C16167b() {
            super(FieldEncoding.LENGTH_DELIMITED, DepartmentStructure.class);
        }

        /* renamed from: a */
        public int encodedSize(DepartmentStructure departmentStructure) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (departmentStructure.department != null) {
                i = Department.ADAPTER.encodedSizeWithTag(1, departmentStructure.department);
            } else {
                i = 0;
            }
            if (departmentStructure.leader != null) {
                i2 = Chatter.ADAPTER.encodedSizeWithTag(2, departmentStructure.leader);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + Department.ADAPTER.asRepeated().encodedSizeWithTag(3, departmentStructure.sub_departments) + Chatter.ADAPTER.asRepeated().encodedSizeWithTag(4, departmentStructure.chatters);
            if (departmentStructure.has_more != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, departmentStructure.has_more);
            } else {
                i3 = 0;
            }
            int i6 = encodedSizeWithTag + i3;
            if (departmentStructure.chat_info != null) {
                i4 = ChatInfo.ADAPTER.encodedSizeWithTag(6, departmentStructure.chat_info);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i6 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, departmentStructure.administrator) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, departmentStructure.super_administrator);
            if (departmentStructure.has_more_department != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(9, departmentStructure.has_more_department);
            }
            return encodedSizeWithTag2 + i5 + departmentStructure.unknownFields().size();
        }

        /* renamed from: a */
        public DepartmentStructure decode(ProtoReader protoReader) throws IOException {
            C16166a aVar = new C16166a();
            aVar.f42287e = false;
            aVar.f42291i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42283a = Department.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42284b = Chatter.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42285c.add(Department.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f42286d.add(Chatter.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f42287e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42288f = ChatInfo.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42289g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f42290h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f42291i = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DepartmentStructure departmentStructure) throws IOException {
            if (departmentStructure.department != null) {
                Department.ADAPTER.encodeWithTag(protoWriter, 1, departmentStructure.department);
            }
            if (departmentStructure.leader != null) {
                Chatter.ADAPTER.encodeWithTag(protoWriter, 2, departmentStructure.leader);
            }
            Department.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, departmentStructure.sub_departments);
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, departmentStructure.chatters);
            if (departmentStructure.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, departmentStructure.has_more);
            }
            if (departmentStructure.chat_info != null) {
                ChatInfo.ADAPTER.encodeWithTag(protoWriter, 6, departmentStructure.chat_info);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, departmentStructure.administrator);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, departmentStructure.super_administrator);
            if (departmentStructure.has_more_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, departmentStructure.has_more_department);
            }
            protoWriter.writeBytes(departmentStructure.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.DepartmentStructure$a */
    public static final class C16166a extends Message.Builder<DepartmentStructure, C16166a> {

        /* renamed from: a */
        public Department f42283a;

        /* renamed from: b */
        public Chatter f42284b;

        /* renamed from: c */
        public List<Department> f42285c = Internal.newMutableList();

        /* renamed from: d */
        public List<Chatter> f42286d = Internal.newMutableList();

        /* renamed from: e */
        public Boolean f42287e;

        /* renamed from: f */
        public ChatInfo f42288f;

        /* renamed from: g */
        public List<String> f42289g = Internal.newMutableList();

        /* renamed from: h */
        public List<String> f42290h = Internal.newMutableList();

        /* renamed from: i */
        public Boolean f42291i;

        /* renamed from: a */
        public DepartmentStructure build() {
            return new DepartmentStructure(this.f42283a, this.f42284b, this.f42285c, this.f42286d, this.f42287e, this.f42288f, this.f42289g, this.f42290h, this.f42291i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16166a newBuilder() {
        C16166a aVar = new C16166a();
        aVar.f42283a = this.department;
        aVar.f42284b = this.leader;
        aVar.f42285c = Internal.copyOf("sub_departments", this.sub_departments);
        aVar.f42286d = Internal.copyOf("chatters", this.chatters);
        aVar.f42287e = this.has_more;
        aVar.f42288f = this.chat_info;
        aVar.f42289g = Internal.copyOf("administrator", this.administrator);
        aVar.f42290h = Internal.copyOf("super_administrator", this.super_administrator);
        aVar.f42291i = this.has_more_department;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "DepartmentStructure");
        StringBuilder sb = new StringBuilder();
        if (this.department != null) {
            sb.append(", department=");
            sb.append(this.department);
        }
        if (this.leader != null) {
            sb.append(", leader=");
            sb.append(this.leader);
        }
        if (!this.sub_departments.isEmpty()) {
            sb.append(", sub_departments=");
            sb.append(this.sub_departments);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.chat_info != null) {
            sb.append(", chat_info=");
            sb.append(this.chat_info);
        }
        if (!this.administrator.isEmpty()) {
            sb.append(", administrator=");
            sb.append(this.administrator);
        }
        if (!this.super_administrator.isEmpty()) {
            sb.append(", super_administrator=");
            sb.append(this.super_administrator);
        }
        if (this.has_more_department != null) {
            sb.append(", has_more_department=");
            sb.append(this.has_more_department);
        }
        StringBuilder replace = sb.replace(0, 2, "DepartmentStructure{");
        replace.append('}');
        return replace.toString();
    }

    public DepartmentStructure(Department department2, Chatter chatter, List<Department> list, List<Chatter> list2, Boolean bool, ChatInfo chatInfo, List<String> list3, List<String> list4, Boolean bool2) {
        this(department2, chatter, list, list2, bool, chatInfo, list3, list4, bool2, ByteString.EMPTY);
    }

    public DepartmentStructure(Department department2, Chatter chatter, List<Department> list, List<Chatter> list2, Boolean bool, ChatInfo chatInfo, List<String> list3, List<String> list4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department = department2;
        this.leader = chatter;
        this.sub_departments = Internal.immutableCopyOf("sub_departments", list);
        this.chatters = Internal.immutableCopyOf("chatters", list2);
        this.has_more = bool;
        this.chat_info = chatInfo;
        this.administrator = Internal.immutableCopyOf("administrator", list3);
        this.super_administrator = Internal.immutableCopyOf("super_administrator", list4);
        this.has_more_department = bool2;
    }
}
