package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserUpdateNamePermissionRequest extends Message<GetUserUpdateNamePermissionRequest, C16306a> {
    public static final ProtoAdapter<GetUserUpdateNamePermissionRequest> ADAPTER = new C16307b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserUpdateNamePermissionRequest$b */
    private static final class C16307b extends ProtoAdapter<GetUserUpdateNamePermissionRequest> {
        C16307b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserUpdateNamePermissionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserUpdateNamePermissionRequest getUserUpdateNamePermissionRequest) {
            return getUserUpdateNamePermissionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserUpdateNamePermissionRequest decode(ProtoReader protoReader) throws IOException {
            C16306a aVar = new C16306a();
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
        public void encode(ProtoWriter protoWriter, GetUserUpdateNamePermissionRequest getUserUpdateNamePermissionRequest) throws IOException {
            protoWriter.writeBytes(getUserUpdateNamePermissionRequest.unknownFields());
        }
    }

    public GetUserUpdateNamePermissionRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserUpdateNamePermissionRequest$a */
    public static final class C16306a extends Message.Builder<GetUserUpdateNamePermissionRequest, C16306a> {
        /* renamed from: a */
        public GetUserUpdateNamePermissionRequest build() {
            return new GetUserUpdateNamePermissionRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16306a newBuilder() {
        C16306a aVar = new C16306a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserUpdateNamePermissionRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUserUpdateNamePermissionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserUpdateNamePermissionRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
