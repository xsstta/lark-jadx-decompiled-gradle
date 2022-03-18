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

public final class CollaborationDepartmentStructure extends Message<CollaborationDepartmentStructure, C16142a> {
    public static final ProtoAdapter<CollaborationDepartmentStructure> ADAPTER = new C16143b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Boolean DEFAULT_HAS_MORE_DEPARTMENT = false;
    private static final long serialVersionUID = 0;
    public final List<Chatter> chatters;
    public final Department department;
    public final Boolean has_more;
    public final Boolean has_more_department;
    public final Chatter leader;
    public final List<Department> sub_departments;

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationDepartmentStructure$b */
    private static final class C16143b extends ProtoAdapter<CollaborationDepartmentStructure> {
        C16143b() {
            super(FieldEncoding.LENGTH_DELIMITED, CollaborationDepartmentStructure.class);
        }

        /* renamed from: a */
        public int encodedSize(CollaborationDepartmentStructure collaborationDepartmentStructure) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (collaborationDepartmentStructure.department != null) {
                i = Department.ADAPTER.encodedSizeWithTag(1, collaborationDepartmentStructure.department);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Chatter.ADAPTER.asRepeated().encodedSizeWithTag(2, collaborationDepartmentStructure.chatters) + Department.ADAPTER.asRepeated().encodedSizeWithTag(3, collaborationDepartmentStructure.sub_departments);
            if (collaborationDepartmentStructure.leader != null) {
                i2 = Chatter.ADAPTER.encodedSizeWithTag(4, collaborationDepartmentStructure.leader);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (collaborationDepartmentStructure.has_more != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, collaborationDepartmentStructure.has_more);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (collaborationDepartmentStructure.has_more_department != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, collaborationDepartmentStructure.has_more_department);
            }
            return i6 + i4 + collaborationDepartmentStructure.unknownFields().size();
        }

        /* renamed from: a */
        public CollaborationDepartmentStructure decode(ProtoReader protoReader) throws IOException {
            C16142a aVar = new C16142a();
            aVar.f42261e = false;
            aVar.f42262f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42257a = Department.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42258b.add(Chatter.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f42259c.add(Department.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f42260d = Chatter.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42261e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42262f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CollaborationDepartmentStructure collaborationDepartmentStructure) throws IOException {
            if (collaborationDepartmentStructure.department != null) {
                Department.ADAPTER.encodeWithTag(protoWriter, 1, collaborationDepartmentStructure.department);
            }
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, collaborationDepartmentStructure.chatters);
            Department.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, collaborationDepartmentStructure.sub_departments);
            if (collaborationDepartmentStructure.leader != null) {
                Chatter.ADAPTER.encodeWithTag(protoWriter, 4, collaborationDepartmentStructure.leader);
            }
            if (collaborationDepartmentStructure.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, collaborationDepartmentStructure.has_more);
            }
            if (collaborationDepartmentStructure.has_more_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, collaborationDepartmentStructure.has_more_department);
            }
            protoWriter.writeBytes(collaborationDepartmentStructure.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationDepartmentStructure$a */
    public static final class C16142a extends Message.Builder<CollaborationDepartmentStructure, C16142a> {

        /* renamed from: a */
        public Department f42257a;

        /* renamed from: b */
        public List<Chatter> f42258b = Internal.newMutableList();

        /* renamed from: c */
        public List<Department> f42259c = Internal.newMutableList();

        /* renamed from: d */
        public Chatter f42260d;

        /* renamed from: e */
        public Boolean f42261e;

        /* renamed from: f */
        public Boolean f42262f;

        /* renamed from: a */
        public CollaborationDepartmentStructure build() {
            return new CollaborationDepartmentStructure(this.f42257a, this.f42258b, this.f42259c, this.f42260d, this.f42261e, this.f42262f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16142a newBuilder() {
        C16142a aVar = new C16142a();
        aVar.f42257a = this.department;
        aVar.f42258b = Internal.copyOf("chatters", this.chatters);
        aVar.f42259c = Internal.copyOf("sub_departments", this.sub_departments);
        aVar.f42260d = this.leader;
        aVar.f42261e = this.has_more;
        aVar.f42262f = this.has_more_department;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "CollaborationDepartmentStructure");
        StringBuilder sb = new StringBuilder();
        if (this.department != null) {
            sb.append(", department=");
            sb.append(this.department);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (!this.sub_departments.isEmpty()) {
            sb.append(", sub_departments=");
            sb.append(this.sub_departments);
        }
        if (this.leader != null) {
            sb.append(", leader=");
            sb.append(this.leader);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.has_more_department != null) {
            sb.append(", has_more_department=");
            sb.append(this.has_more_department);
        }
        StringBuilder replace = sb.replace(0, 2, "CollaborationDepartmentStructure{");
        replace.append('}');
        return replace.toString();
    }

    public CollaborationDepartmentStructure(Department department2, List<Chatter> list, List<Department> list2, Chatter chatter, Boolean bool, Boolean bool2) {
        this(department2, list, list2, chatter, bool, bool2, ByteString.EMPTY);
    }

    public CollaborationDepartmentStructure(Department department2, List<Chatter> list, List<Department> list2, Chatter chatter, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department = department2;
        this.chatters = Internal.immutableCopyOf("chatters", list);
        this.sub_departments = Internal.immutableCopyOf("sub_departments", list2);
        this.leader = chatter;
        this.has_more = bool;
        this.has_more_department = bool2;
    }
}
