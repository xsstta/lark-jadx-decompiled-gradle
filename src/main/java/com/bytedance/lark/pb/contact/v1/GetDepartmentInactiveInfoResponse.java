package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetDepartmentInactiveInfoResponse extends Message<GetDepartmentInactiveInfoResponse, C16230a> {
    public static final ProtoAdapter<GetDepartmentInactiveInfoResponse> ADAPTER = new C16231b();
    public static final Boolean DEFAULT_HAS_INVITE_PERMISSION = false;
    public static final Integer DEFAULT_INACTIVE_MEMBER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String department_alias_name;
    public final Boolean has_invite_permission;
    public final Integer inactive_member_count;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoResponse$b */
    private static final class C16231b extends ProtoAdapter<GetDepartmentInactiveInfoResponse> {
        C16231b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDepartmentInactiveInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDepartmentInactiveInfoResponse getDepartmentInactiveInfoResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getDepartmentInactiveInfoResponse.has_invite_permission != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getDepartmentInactiveInfoResponse.has_invite_permission);
            } else {
                i = 0;
            }
            if (getDepartmentInactiveInfoResponse.inactive_member_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getDepartmentInactiveInfoResponse.inactive_member_count);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getDepartmentInactiveInfoResponse.department_alias_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getDepartmentInactiveInfoResponse.department_alias_name);
            }
            return i4 + i3 + getDepartmentInactiveInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDepartmentInactiveInfoResponse decode(ProtoReader protoReader) throws IOException {
            C16230a aVar = new C16230a();
            aVar.f42418a = false;
            aVar.f42419b = 0;
            aVar.f42420c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42418a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42419b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42420c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDepartmentInactiveInfoResponse getDepartmentInactiveInfoResponse) throws IOException {
            if (getDepartmentInactiveInfoResponse.has_invite_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getDepartmentInactiveInfoResponse.has_invite_permission);
            }
            if (getDepartmentInactiveInfoResponse.inactive_member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getDepartmentInactiveInfoResponse.inactive_member_count);
            }
            if (getDepartmentInactiveInfoResponse.department_alias_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getDepartmentInactiveInfoResponse.department_alias_name);
            }
            protoWriter.writeBytes(getDepartmentInactiveInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoResponse$a */
    public static final class C16230a extends Message.Builder<GetDepartmentInactiveInfoResponse, C16230a> {

        /* renamed from: a */
        public Boolean f42418a;

        /* renamed from: b */
        public Integer f42419b;

        /* renamed from: c */
        public String f42420c;

        /* renamed from: a */
        public GetDepartmentInactiveInfoResponse build() {
            return new GetDepartmentInactiveInfoResponse(this.f42418a, this.f42419b, this.f42420c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16230a newBuilder() {
        C16230a aVar = new C16230a();
        aVar.f42418a = this.has_invite_permission;
        aVar.f42419b = this.inactive_member_count;
        aVar.f42420c = this.department_alias_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDepartmentInactiveInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.has_invite_permission != null) {
            sb.append(", has_invite_permission=");
            sb.append(this.has_invite_permission);
        }
        if (this.inactive_member_count != null) {
            sb.append(", inactive_member_count=");
            sb.append(this.inactive_member_count);
        }
        if (this.department_alias_name != null) {
            sb.append(", department_alias_name=");
            sb.append(this.department_alias_name);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDepartmentInactiveInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDepartmentInactiveInfoResponse(Boolean bool, Integer num, String str) {
        this(bool, num, str, ByteString.EMPTY);
    }

    public GetDepartmentInactiveInfoResponse(Boolean bool, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_invite_permission = bool;
        this.inactive_member_count = num;
        this.department_alias_name = str;
    }
}
