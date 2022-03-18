package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetDepartmentCombineChatResponse extends Message<GetDepartmentCombineChatResponse, C16226a> {
    public static final ProtoAdapter<GetDepartmentCombineChatResponse> ADAPTER = new C16227b();
    public static final Boolean DEFAULT_IS_SHOW_MEMBER_COUNT = true;
    private static final long serialVersionUID = 0;
    public final DepartmentStructure department_structure;
    public final List<Integer> display_order;
    public final ExtendFields extend_fields;
    public final List<String> in_chat_chatter_ids;
    public final Boolean is_show_member_count;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentCombineChatResponse$b */
    private static final class C16227b extends ProtoAdapter<GetDepartmentCombineChatResponse> {
        C16227b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDepartmentCombineChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDepartmentCombineChatResponse getDepartmentCombineChatResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getDepartmentCombineChatResponse.department_structure != null) {
                i = DepartmentStructure.ADAPTER.encodedSizeWithTag(1, getDepartmentCombineChatResponse.department_structure);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getDepartmentCombineChatResponse.in_chat_chatter_ids);
            if (getDepartmentCombineChatResponse.extend_fields != null) {
                i2 = ExtendFields.ADAPTER.encodedSizeWithTag(3, getDepartmentCombineChatResponse.extend_fields);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (getDepartmentCombineChatResponse.is_show_member_count != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getDepartmentCombineChatResponse.is_show_member_count);
            }
            return i4 + i3 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(5, getDepartmentCombineChatResponse.display_order) + getDepartmentCombineChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDepartmentCombineChatResponse decode(ProtoReader protoReader) throws IOException {
            C16226a aVar = new C16226a();
            aVar.f42414d = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42411a = DepartmentStructure.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42412b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f42413c = ExtendFields.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42414d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42415e.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDepartmentCombineChatResponse getDepartmentCombineChatResponse) throws IOException {
            if (getDepartmentCombineChatResponse.department_structure != null) {
                DepartmentStructure.ADAPTER.encodeWithTag(protoWriter, 1, getDepartmentCombineChatResponse.department_structure);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getDepartmentCombineChatResponse.in_chat_chatter_ids);
            if (getDepartmentCombineChatResponse.extend_fields != null) {
                ExtendFields.ADAPTER.encodeWithTag(protoWriter, 3, getDepartmentCombineChatResponse.extend_fields);
            }
            if (getDepartmentCombineChatResponse.is_show_member_count != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getDepartmentCombineChatResponse.is_show_member_count);
            }
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 5, getDepartmentCombineChatResponse.display_order);
            protoWriter.writeBytes(getDepartmentCombineChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentCombineChatResponse$a */
    public static final class C16226a extends Message.Builder<GetDepartmentCombineChatResponse, C16226a> {

        /* renamed from: a */
        public DepartmentStructure f42411a;

        /* renamed from: b */
        public List<String> f42412b = Internal.newMutableList();

        /* renamed from: c */
        public ExtendFields f42413c;

        /* renamed from: d */
        public Boolean f42414d;

        /* renamed from: e */
        public List<Integer> f42415e = Internal.newMutableList();

        /* renamed from: a */
        public GetDepartmentCombineChatResponse build() {
            return new GetDepartmentCombineChatResponse(this.f42411a, this.f42412b, this.f42413c, this.f42414d, this.f42415e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16226a newBuilder() {
        C16226a aVar = new C16226a();
        aVar.f42411a = this.department_structure;
        aVar.f42412b = Internal.copyOf("in_chat_chatter_ids", this.in_chat_chatter_ids);
        aVar.f42413c = this.extend_fields;
        aVar.f42414d = this.is_show_member_count;
        aVar.f42415e = Internal.copyOf("display_order", this.display_order);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDepartmentCombineChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.department_structure != null) {
            sb.append(", department_structure=");
            sb.append(this.department_structure);
        }
        if (!this.in_chat_chatter_ids.isEmpty()) {
            sb.append(", in_chat_chatter_ids=");
            sb.append(this.in_chat_chatter_ids);
        }
        if (this.extend_fields != null) {
            sb.append(", extend_fields=");
            sb.append(this.extend_fields);
        }
        if (this.is_show_member_count != null) {
            sb.append(", is_show_member_count=");
            sb.append(this.is_show_member_count);
        }
        if (!this.display_order.isEmpty()) {
            sb.append(", display_order=");
            sb.append(this.display_order);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDepartmentCombineChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDepartmentCombineChatResponse(DepartmentStructure departmentStructure, List<String> list, ExtendFields extendFields, Boolean bool, List<Integer> list2) {
        this(departmentStructure, list, extendFields, bool, list2, ByteString.EMPTY);
    }

    public GetDepartmentCombineChatResponse(DepartmentStructure departmentStructure, List<String> list, ExtendFields extendFields, Boolean bool, List<Integer> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_structure = departmentStructure;
        this.in_chat_chatter_ids = Internal.immutableCopyOf("in_chat_chatter_ids", list);
        this.extend_fields = extendFields;
        this.is_show_member_count = bool;
        this.display_order = Internal.immutableCopyOf("display_order", list2);
    }
}
