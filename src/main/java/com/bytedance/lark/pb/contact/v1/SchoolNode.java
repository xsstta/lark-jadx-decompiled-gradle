package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class SchoolNode extends Message<SchoolNode, C16358a> {
    public static final ProtoAdapter<SchoolNode> ADAPTER = new C16359b();
    public static final Integer DEFAULT_ACTIVE_PARENT_COUNT = 0;
    public static final EduDepartmentLevel DEFAULT_DEPT_LEVEL = EduDepartmentLevel.UNKNOWN_DEPARTMENT_LEVEL;
    public static final Integer DEFAULT_INACTIVE_PARENT_COUNT = 0;
    public static final Boolean DEFAULT_IS_VIRTUAL_NODE = false;
    public static final Integer DEFAULT_STUDENT_COUNT = 0;
    public static final Integer DEFAULT_TEACHER_COUNT = 0;
    public static final VirtualNodeType DEFAULT_VNODE_TYPE = VirtualNodeType.UNKNOWN_VIRTUAL_NODE_TYPE;
    private static final long serialVersionUID = 0;
    public final Integer active_parent_count;
    public final List<SchoolNode> child_nodes;
    public final EduDepartmentLevel dept_level;
    public final String i18n_name;
    public final String id;
    public final Integer inactive_parent_count;
    public final List<InactiveParent> inactive_parents;
    public final Boolean is_virtual_node;
    public final String name;
    public final Map<String, ParentDisplayNames> parent_display_names;
    public final String parent_id;
    public final Integer student_count;
    public final Integer teacher_count;
    public final Map<String, ChatterTagInfo> user_tags;
    public final List<Chatter> users;
    public final VirtualNodeType vnode_type;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SchoolNode$b */
    private static final class C16359b extends ProtoAdapter<SchoolNode> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ChatterTagInfo>> f42618a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatterTagInfo.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, ParentDisplayNames>> f42619b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ParentDisplayNames.ADAPTER);

        C16359b() {
            super(FieldEncoding.LENGTH_DELIMITED, SchoolNode.class);
        }

        /* renamed from: a */
        public int encodedSize(SchoolNode schoolNode) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (schoolNode.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, schoolNode.id);
            } else {
                i = 0;
            }
            if (schoolNode.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, schoolNode.name);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.encodedSizeWithTag(3, schoolNode.i18n_name);
            if (schoolNode.parent_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, schoolNode.parent_id);
            } else {
                i3 = 0;
            }
            int i11 = encodedSizeWithTag + i3;
            if (schoolNode.is_virtual_node != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, schoolNode.is_virtual_node);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i11 + i4 + Chatter.ADAPTER.asRepeated().encodedSizeWithTag(6, schoolNode.users);
            if (schoolNode.student_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, schoolNode.student_count);
            } else {
                i5 = 0;
            }
            int i12 = encodedSizeWithTag2 + i5;
            if (schoolNode.teacher_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(8, schoolNode.teacher_count);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (schoolNode.active_parent_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(9, schoolNode.active_parent_count);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (schoolNode.inactive_parent_count != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(10, schoolNode.inactive_parent_count);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag3 = i14 + i8 + InactiveParent.ADAPTER.asRepeated().encodedSizeWithTag(11, schoolNode.inactive_parents) + SchoolNode.ADAPTER.asRepeated().encodedSizeWithTag(12, schoolNode.child_nodes) + this.f42618a.encodedSizeWithTag(13, schoolNode.user_tags);
            if (schoolNode.vnode_type != null) {
                i9 = VirtualNodeType.ADAPTER.encodedSizeWithTag(14, schoolNode.vnode_type);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + i9 + this.f42619b.encodedSizeWithTag(15, schoolNode.parent_display_names);
            if (schoolNode.dept_level != null) {
                i10 = EduDepartmentLevel.ADAPTER.encodedSizeWithTag(16, schoolNode.dept_level);
            }
            return encodedSizeWithTag4 + i10 + schoolNode.unknownFields().size();
        }

        /* renamed from: a */
        public SchoolNode decode(ProtoReader protoReader) throws IOException {
            C16358a aVar = new C16358a();
            aVar.f42602a = "";
            aVar.f42603b = "";
            aVar.f42604c = "";
            aVar.f42605d = "";
            aVar.f42606e = false;
            aVar.f42608g = 0;
            aVar.f42609h = 0;
            aVar.f42610i = 0;
            aVar.f42611j = 0;
            aVar.f42615n = VirtualNodeType.UNKNOWN_VIRTUAL_NODE_TYPE;
            aVar.f42617p = EduDepartmentLevel.UNKNOWN_DEPARTMENT_LEVEL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42602a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42603b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42604c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42605d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42606e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42607f.add(Chatter.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f42608g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42609h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42610i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f42611j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f42612k.add(InactiveParent.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f42613l.add(SchoolNode.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            aVar.f42614m.putAll(this.f42618a.decode(protoReader));
                            break;
                        case 14:
                            try {
                                aVar.f42615n = VirtualNodeType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 15:
                            aVar.f42616o.putAll(this.f42619b.decode(protoReader));
                            break;
                        case 16:
                            try {
                                aVar.f42617p = EduDepartmentLevel.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SchoolNode schoolNode) throws IOException {
            if (schoolNode.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, schoolNode.id);
            }
            if (schoolNode.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, schoolNode.name);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, schoolNode.i18n_name);
            if (schoolNode.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, schoolNode.parent_id);
            }
            if (schoolNode.is_virtual_node != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, schoolNode.is_virtual_node);
            }
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, schoolNode.users);
            if (schoolNode.student_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, schoolNode.student_count);
            }
            if (schoolNode.teacher_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, schoolNode.teacher_count);
            }
            if (schoolNode.active_parent_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, schoolNode.active_parent_count);
            }
            if (schoolNode.inactive_parent_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, schoolNode.inactive_parent_count);
            }
            InactiveParent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, schoolNode.inactive_parents);
            SchoolNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, schoolNode.child_nodes);
            this.f42618a.encodeWithTag(protoWriter, 13, schoolNode.user_tags);
            if (schoolNode.vnode_type != null) {
                VirtualNodeType.ADAPTER.encodeWithTag(protoWriter, 14, schoolNode.vnode_type);
            }
            this.f42619b.encodeWithTag(protoWriter, 15, schoolNode.parent_display_names);
            if (schoolNode.dept_level != null) {
                EduDepartmentLevel.ADAPTER.encodeWithTag(protoWriter, 16, schoolNode.dept_level);
            }
            protoWriter.writeBytes(schoolNode.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SchoolNode$a */
    public static final class C16358a extends Message.Builder<SchoolNode, C16358a> {

        /* renamed from: a */
        public String f42602a;

        /* renamed from: b */
        public String f42603b;

        /* renamed from: c */
        public String f42604c;

        /* renamed from: d */
        public String f42605d;

        /* renamed from: e */
        public Boolean f42606e;

        /* renamed from: f */
        public List<Chatter> f42607f = Internal.newMutableList();

        /* renamed from: g */
        public Integer f42608g;

        /* renamed from: h */
        public Integer f42609h;

        /* renamed from: i */
        public Integer f42610i;

        /* renamed from: j */
        public Integer f42611j;

        /* renamed from: k */
        public List<InactiveParent> f42612k = Internal.newMutableList();

        /* renamed from: l */
        public List<SchoolNode> f42613l = Internal.newMutableList();

        /* renamed from: m */
        public Map<String, ChatterTagInfo> f42614m = Internal.newMutableMap();

        /* renamed from: n */
        public VirtualNodeType f42615n;

        /* renamed from: o */
        public Map<String, ParentDisplayNames> f42616o = Internal.newMutableMap();

        /* renamed from: p */
        public EduDepartmentLevel f42617p;

        /* renamed from: a */
        public SchoolNode build() {
            String str = this.f42604c;
            if (str != null) {
                return new SchoolNode(this.f42602a, this.f42603b, str, this.f42605d, this.f42606e, this.f42607f, this.f42608g, this.f42609h, this.f42610i, this.f42611j, this.f42612k, this.f42613l, this.f42614m, this.f42615n, this.f42616o, this.f42617p, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "i18n_name");
        }
    }

    @Override // com.squareup.wire.Message
    public C16358a newBuilder() {
        C16358a aVar = new C16358a();
        aVar.f42602a = this.id;
        aVar.f42603b = this.name;
        aVar.f42604c = this.i18n_name;
        aVar.f42605d = this.parent_id;
        aVar.f42606e = this.is_virtual_node;
        aVar.f42607f = Internal.copyOf("users", this.users);
        aVar.f42608g = this.student_count;
        aVar.f42609h = this.teacher_count;
        aVar.f42610i = this.active_parent_count;
        aVar.f42611j = this.inactive_parent_count;
        aVar.f42612k = Internal.copyOf("inactive_parents", this.inactive_parents);
        aVar.f42613l = Internal.copyOf("child_nodes", this.child_nodes);
        aVar.f42614m = Internal.copyOf("user_tags", this.user_tags);
        aVar.f42615n = this.vnode_type;
        aVar.f42616o = Internal.copyOf("parent_display_names", this.parent_display_names);
        aVar.f42617p = this.dept_level;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SchoolNode");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        sb.append(", i18n_name=");
        sb.append(this.i18n_name);
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.is_virtual_node != null) {
            sb.append(", is_virtual_node=");
            sb.append(this.is_virtual_node);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (this.student_count != null) {
            sb.append(", student_count=");
            sb.append(this.student_count);
        }
        if (this.teacher_count != null) {
            sb.append(", teacher_count=");
            sb.append(this.teacher_count);
        }
        if (this.active_parent_count != null) {
            sb.append(", active_parent_count=");
            sb.append(this.active_parent_count);
        }
        if (this.inactive_parent_count != null) {
            sb.append(", inactive_parent_count=");
            sb.append(this.inactive_parent_count);
        }
        if (!this.inactive_parents.isEmpty()) {
            sb.append(", inactive_parents=");
            sb.append(this.inactive_parents);
        }
        if (!this.child_nodes.isEmpty()) {
            sb.append(", child_nodes=");
            sb.append(this.child_nodes);
        }
        if (!this.user_tags.isEmpty()) {
            sb.append(", user_tags=");
            sb.append(this.user_tags);
        }
        if (this.vnode_type != null) {
            sb.append(", vnode_type=");
            sb.append(this.vnode_type);
        }
        if (!this.parent_display_names.isEmpty()) {
            sb.append(", parent_display_names=");
            sb.append(this.parent_display_names);
        }
        if (this.dept_level != null) {
            sb.append(", dept_level=");
            sb.append(this.dept_level);
        }
        StringBuilder replace = sb.replace(0, 2, "SchoolNode{");
        replace.append('}');
        return replace.toString();
    }

    public SchoolNode(String str, String str2, String str3, String str4, Boolean bool, List<Chatter> list, Integer num, Integer num2, Integer num3, Integer num4, List<InactiveParent> list2, List<SchoolNode> list3, Map<String, ChatterTagInfo> map, VirtualNodeType virtualNodeType, Map<String, ParentDisplayNames> map2, EduDepartmentLevel eduDepartmentLevel) {
        this(str, str2, str3, str4, bool, list, num, num2, num3, num4, list2, list3, map, virtualNodeType, map2, eduDepartmentLevel, ByteString.EMPTY);
    }

    public SchoolNode(String str, String str2, String str3, String str4, Boolean bool, List<Chatter> list, Integer num, Integer num2, Integer num3, Integer num4, List<InactiveParent> list2, List<SchoolNode> list3, Map<String, ChatterTagInfo> map, VirtualNodeType virtualNodeType, Map<String, ParentDisplayNames> map2, EduDepartmentLevel eduDepartmentLevel, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.i18n_name = str3;
        this.parent_id = str4;
        this.is_virtual_node = bool;
        this.users = Internal.immutableCopyOf("users", list);
        this.student_count = num;
        this.teacher_count = num2;
        this.active_parent_count = num3;
        this.inactive_parent_count = num4;
        this.inactive_parents = Internal.immutableCopyOf("inactive_parents", list2);
        this.child_nodes = Internal.immutableCopyOf("child_nodes", list3);
        this.user_tags = Internal.immutableCopyOf("user_tags", map);
        this.vnode_type = virtualNodeType;
        this.parent_display_names = Internal.immutableCopyOf("parent_display_names", map2);
        this.dept_level = eduDepartmentLevel;
    }
}
