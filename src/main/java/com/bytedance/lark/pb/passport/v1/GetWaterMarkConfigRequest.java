package com.bytedance.lark.pb.passport.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetWaterMarkConfigRequest extends Message<GetWaterMarkConfigRequest, C18733a> {
    public static final ProtoAdapter<GetWaterMarkConfigRequest> ADAPTER = new C18734b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetWaterMarkConfigRequest$b */
    private static final class C18734b extends ProtoAdapter<GetWaterMarkConfigRequest> {
        C18734b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetWaterMarkConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetWaterMarkConfigRequest getWaterMarkConfigRequest) {
            return getWaterMarkConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetWaterMarkConfigRequest decode(ProtoReader protoReader) throws IOException {
            C18733a aVar = new C18733a();
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
        public void encode(ProtoWriter protoWriter, GetWaterMarkConfigRequest getWaterMarkConfigRequest) throws IOException {
            protoWriter.writeBytes(getWaterMarkConfigRequest.unknownFields());
        }
    }

    public GetWaterMarkConfigRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetWaterMarkConfigRequest$a */
    public static final class C18733a extends Message.Builder<GetWaterMarkConfigRequest, C18733a> {
        /* renamed from: a */
        public GetWaterMarkConfigRequest build() {
            return new GetWaterMarkConfigRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18733a newBuilder() {
        C18733a aVar = new C18733a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("passport", "GetWaterMarkConfigRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetWaterMarkConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetWaterMarkConfigRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
