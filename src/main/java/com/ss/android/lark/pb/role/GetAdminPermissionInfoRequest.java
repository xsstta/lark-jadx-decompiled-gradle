package com.ss.android.lark.pb.role;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAdminPermissionInfoRequest extends Message<GetAdminPermissionInfoRequest, C50002a> {
    public static final ProtoAdapter<GetAdminPermissionInfoRequest> ADAPTER = new C50003b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.role.GetAdminPermissionInfoRequest$b */
    private static final class C50003b extends ProtoAdapter<GetAdminPermissionInfoRequest> {
        C50003b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAdminPermissionInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAdminPermissionInfoRequest getAdminPermissionInfoRequest) {
            return getAdminPermissionInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAdminPermissionInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50002a aVar = new C50002a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAdminPermissionInfoRequest getAdminPermissionInfoRequest) throws IOException {
            protoWriter.writeBytes(getAdminPermissionInfoRequest.unknownFields());
        }
    }

    public GetAdminPermissionInfoRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.role.GetAdminPermissionInfoRequest$a */
    public static final class C50002a extends Message.Builder<GetAdminPermissionInfoRequest, C50002a> {
        /* renamed from: a */
        public GetAdminPermissionInfoRequest build() {
            return new GetAdminPermissionInfoRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50002a newBuilder() {
        C50002a aVar = new C50002a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAdminPermissionInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAdminPermissionInfoRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
