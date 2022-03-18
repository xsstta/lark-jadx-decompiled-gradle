package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUGSDKSettingsRequest extends Message<GetUGSDKSettingsRequest, C19773a> {
    public static final ProtoAdapter<GetUGSDKSettingsRequest> ADAPTER = new C19774b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsRequest$b */
    private static final class C19774b extends ProtoAdapter<GetUGSDKSettingsRequest> {
        C19774b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGSDKSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGSDKSettingsRequest getUGSDKSettingsRequest) {
            return getUGSDKSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGSDKSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C19773a aVar = new C19773a();
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
        public void encode(ProtoWriter protoWriter, GetUGSDKSettingsRequest getUGSDKSettingsRequest) throws IOException {
            protoWriter.writeBytes(getUGSDKSettingsRequest.unknownFields());
        }
    }

    public GetUGSDKSettingsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsRequest$a */
    public static final class C19773a extends Message.Builder<GetUGSDKSettingsRequest, C19773a> {
        /* renamed from: a */
        public GetUGSDKSettingsRequest build() {
            return new GetUGSDKSettingsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19773a newBuilder() {
        C19773a aVar = new C19773a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGSDKSettingsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUGSDKSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGSDKSettingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
