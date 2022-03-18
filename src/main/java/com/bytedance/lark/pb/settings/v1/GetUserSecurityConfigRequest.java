package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserSecurityConfigRequest extends Message<GetUserSecurityConfigRequest, C19163a> {
    public static final ProtoAdapter<GetUserSecurityConfigRequest> ADAPTER = new C19164b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSecurityConfigRequest$b */
    private static final class C19164b extends ProtoAdapter<GetUserSecurityConfigRequest> {
        C19164b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserSecurityConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserSecurityConfigRequest getUserSecurityConfigRequest) {
            return getUserSecurityConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserSecurityConfigRequest decode(ProtoReader protoReader) throws IOException {
            C19163a aVar = new C19163a();
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
        public void encode(ProtoWriter protoWriter, GetUserSecurityConfigRequest getUserSecurityConfigRequest) throws IOException {
            protoWriter.writeBytes(getUserSecurityConfigRequest.unknownFields());
        }
    }

    public GetUserSecurityConfigRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSecurityConfigRequest$a */
    public static final class C19163a extends Message.Builder<GetUserSecurityConfigRequest, C19163a> {
        /* renamed from: a */
        public GetUserSecurityConfigRequest build() {
            return new GetUserSecurityConfigRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19163a newBuilder() {
        C19163a aVar = new C19163a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetUserSecurityConfigRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUserSecurityConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserSecurityConfigRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
