package com.ss.android.lark.pb.role;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetAdminPermissionInfoResponse extends Message<GetAdminPermissionInfoResponse, C50004a> {
    public static final ProtoAdapter<GetAdminPermissionInfoResponse> ADAPTER = new C50005b();
    public static final Boolean DEFAULT_ISDEPARTMENTADMINISTRATOR = false;
    public static final Boolean DEFAULT_ISSUPERADMINISTRATOR = false;
    private static final long serialVersionUID = 0;
    public final Boolean misDepartmentAdministrator;
    public final Boolean misSuperAdministrator;

    /* renamed from: com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse$b */
    private static final class C50005b extends ProtoAdapter<GetAdminPermissionInfoResponse> {
        C50005b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAdminPermissionInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getAdminPermissionInfoResponse.misSuperAdministrator);
            if (getAdminPermissionInfoResponse.misDepartmentAdministrator != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getAdminPermissionInfoResponse.misDepartmentAdministrator);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getAdminPermissionInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAdminPermissionInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50004a aVar = new C50004a();
            aVar.f125055a = false;
            aVar.f125056b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125055a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125056b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getAdminPermissionInfoResponse.misSuperAdministrator);
            if (getAdminPermissionInfoResponse.misDepartmentAdministrator != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getAdminPermissionInfoResponse.misDepartmentAdministrator);
            }
            protoWriter.writeBytes(getAdminPermissionInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse$a */
    public static final class C50004a extends Message.Builder<GetAdminPermissionInfoResponse, C50004a> {

        /* renamed from: a */
        public Boolean f125055a;

        /* renamed from: b */
        public Boolean f125056b;

        /* renamed from: a */
        public GetAdminPermissionInfoResponse build() {
            Boolean bool = this.f125055a;
            if (bool != null) {
                return new GetAdminPermissionInfoResponse(bool, this.f125056b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "misSuperAdministrator");
        }
    }

    @Override // com.squareup.wire.Message
    public C50004a newBuilder() {
        C50004a aVar = new C50004a();
        aVar.f125055a = this.misSuperAdministrator;
        aVar.f125056b = this.misDepartmentAdministrator;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", isSuperAdministrator=");
        sb.append(this.misSuperAdministrator);
        if (this.misDepartmentAdministrator != null) {
            sb.append(", isDepartmentAdministrator=");
            sb.append(this.misDepartmentAdministrator);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAdminPermissionInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAdminPermissionInfoResponse(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public GetAdminPermissionInfoResponse(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.misSuperAdministrator = bool;
        this.misDepartmentAdministrator = bool2;
    }
}
