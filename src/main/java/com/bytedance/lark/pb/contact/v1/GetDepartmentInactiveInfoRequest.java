package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetDepartmentInactiveInfoRequest extends Message<GetDepartmentInactiveInfoRequest, C16228a> {
    public static final ProtoAdapter<GetDepartmentInactiveInfoRequest> ADAPTER = new C16229b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String department_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoRequest$b */
    private static final class C16229b extends ProtoAdapter<GetDepartmentInactiveInfoRequest> {
        C16229b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDepartmentInactiveInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDepartmentInactiveInfoRequest getDepartmentInactiveInfoRequest) {
            int i;
            int i2 = 0;
            if (getDepartmentInactiveInfoRequest.department_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getDepartmentInactiveInfoRequest.department_id);
            } else {
                i = 0;
            }
            if (getDepartmentInactiveInfoRequest.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getDepartmentInactiveInfoRequest.chat_id);
            }
            return i + i2 + getDepartmentInactiveInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDepartmentInactiveInfoRequest decode(ProtoReader protoReader) throws IOException {
            C16228a aVar = new C16228a();
            aVar.f42416a = "";
            aVar.f42417b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42416a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42417b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDepartmentInactiveInfoRequest getDepartmentInactiveInfoRequest) throws IOException {
            if (getDepartmentInactiveInfoRequest.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getDepartmentInactiveInfoRequest.department_id);
            }
            if (getDepartmentInactiveInfoRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getDepartmentInactiveInfoRequest.chat_id);
            }
            protoWriter.writeBytes(getDepartmentInactiveInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoRequest$a */
    public static final class C16228a extends Message.Builder<GetDepartmentInactiveInfoRequest, C16228a> {

        /* renamed from: a */
        public String f42416a;

        /* renamed from: b */
        public String f42417b;

        /* renamed from: a */
        public GetDepartmentInactiveInfoRequest build() {
            return new GetDepartmentInactiveInfoRequest(this.f42416a, this.f42417b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16228a mo58154a(String str) {
            this.f42416a = str;
            return this;
        }

        /* renamed from: b */
        public C16228a mo58156b(String str) {
            this.f42417b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16228a newBuilder() {
        C16228a aVar = new C16228a();
        aVar.f42416a = this.department_id;
        aVar.f42417b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDepartmentInactiveInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDepartmentInactiveInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDepartmentInactiveInfoRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetDepartmentInactiveInfoRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_id = str;
        this.chat_id = str2;
    }
}
