package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserGlobalConfigAndSettingsRequest extends Message<GetUserGlobalConfigAndSettingsRequest, C18396a> {
    public static final ProtoAdapter<GetUserGlobalConfigAndSettingsRequest> ADAPTER = new C18397b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserGlobalConfigAndSettingsRequest$b */
    private static final class C18397b extends ProtoAdapter<GetUserGlobalConfigAndSettingsRequest> {
        C18397b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserGlobalConfigAndSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserGlobalConfigAndSettingsRequest getUserGlobalConfigAndSettingsRequest) {
            return getUserGlobalConfigAndSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserGlobalConfigAndSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C18396a aVar = new C18396a();
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
        public void encode(ProtoWriter protoWriter, GetUserGlobalConfigAndSettingsRequest getUserGlobalConfigAndSettingsRequest) throws IOException {
            protoWriter.writeBytes(getUserGlobalConfigAndSettingsRequest.unknownFields());
        }
    }

    public GetUserGlobalConfigAndSettingsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserGlobalConfigAndSettingsRequest$a */
    public static final class C18396a extends Message.Builder<GetUserGlobalConfigAndSettingsRequest, C18396a> {
        /* renamed from: a */
        public GetUserGlobalConfigAndSettingsRequest build() {
            return new GetUserGlobalConfigAndSettingsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18396a newBuilder() {
        C18396a aVar = new C18396a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetUserGlobalConfigAndSettingsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUserGlobalConfigAndSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserGlobalConfigAndSettingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
