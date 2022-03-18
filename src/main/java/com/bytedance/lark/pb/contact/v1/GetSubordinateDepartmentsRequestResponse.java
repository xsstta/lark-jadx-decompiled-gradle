package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class GetSubordinateDepartmentsRequestResponse extends Message<GetSubordinateDepartmentsRequestResponse, C16270a> {
    public static final ProtoAdapter<GetSubordinateDepartmentsRequestResponse> ADAPTER = new C16271b();
    public static final Boolean DEFAULT_IS_SHOW_MEMBER_COUNT = false;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<Department> departments;
    public final Boolean is_show_member_count;
    public final Integer member_count;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetSubordinateDepartmentsRequestResponse$b */
    private static final class C16271b extends ProtoAdapter<GetSubordinateDepartmentsRequestResponse> {
        C16271b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSubordinateDepartmentsRequestResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSubordinateDepartmentsRequestResponse getSubordinateDepartmentsRequestResponse) {
            int i;
            int encodedSizeWithTag = Department.ADAPTER.asRepeated().encodedSizeWithTag(1, getSubordinateDepartmentsRequestResponse.departments);
            int i2 = 0;
            if (getSubordinateDepartmentsRequestResponse.member_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getSubordinateDepartmentsRequestResponse.member_count);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getSubordinateDepartmentsRequestResponse.is_show_member_count != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getSubordinateDepartmentsRequestResponse.is_show_member_count);
            }
            return i3 + i2 + getSubordinateDepartmentsRequestResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSubordinateDepartmentsRequestResponse decode(ProtoReader protoReader) throws IOException {
            C16270a aVar = new C16270a();
            aVar.f42468b = 0;
            aVar.f42469c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42467a.add(Department.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42468b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42469c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSubordinateDepartmentsRequestResponse getSubordinateDepartmentsRequestResponse) throws IOException {
            Department.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getSubordinateDepartmentsRequestResponse.departments);
            if (getSubordinateDepartmentsRequestResponse.member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getSubordinateDepartmentsRequestResponse.member_count);
            }
            if (getSubordinateDepartmentsRequestResponse.is_show_member_count != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getSubordinateDepartmentsRequestResponse.is_show_member_count);
            }
            protoWriter.writeBytes(getSubordinateDepartmentsRequestResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetSubordinateDepartmentsRequestResponse$a */
    public static final class C16270a extends Message.Builder<GetSubordinateDepartmentsRequestResponse, C16270a> {

        /* renamed from: a */
        public List<Department> f42467a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f42468b;

        /* renamed from: c */
        public Boolean f42469c;

        /* renamed from: a */
        public GetSubordinateDepartmentsRequestResponse build() {
            return new GetSubordinateDepartmentsRequestResponse(this.f42467a, this.f42468b, this.f42469c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16270a newBuilder() {
        C16270a aVar = new C16270a();
        aVar.f42467a = Internal.copyOf("departments", this.departments);
        aVar.f42468b = this.member_count;
        aVar.f42469c = this.is_show_member_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetSubordinateDepartmentsRequestResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.departments.isEmpty()) {
            sb.append(", departments=");
            sb.append(this.departments);
        }
        if (this.member_count != null) {
            sb.append(", member_count=");
            sb.append(this.member_count);
        }
        if (this.is_show_member_count != null) {
            sb.append(", is_show_member_count=");
            sb.append(this.is_show_member_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSubordinateDepartmentsRequestResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSubordinateDepartmentsRequestResponse(List<Department> list, Integer num, Boolean bool) {
        this(list, num, bool, ByteString.EMPTY);
    }

    public GetSubordinateDepartmentsRequestResponse(List<Department> list, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.departments = Internal.immutableCopyOf("departments", list);
        this.member_count = num;
        this.is_show_member_count = bool;
    }
}
