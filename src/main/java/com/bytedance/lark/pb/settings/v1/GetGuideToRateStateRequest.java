package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetGuideToRateStateRequest extends Message<GetGuideToRateStateRequest, C19139a> {
    public static final ProtoAdapter<GetGuideToRateStateRequest> ADAPTER = new C19140b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetGuideToRateStateRequest$b */
    private static final class C19140b extends ProtoAdapter<GetGuideToRateStateRequest> {
        C19140b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGuideToRateStateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGuideToRateStateRequest getGuideToRateStateRequest) {
            return getGuideToRateStateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetGuideToRateStateRequest decode(ProtoReader protoReader) throws IOException {
            C19139a aVar = new C19139a();
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
        public void encode(ProtoWriter protoWriter, GetGuideToRateStateRequest getGuideToRateStateRequest) throws IOException {
            protoWriter.writeBytes(getGuideToRateStateRequest.unknownFields());
        }
    }

    public GetGuideToRateStateRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetGuideToRateStateRequest$a */
    public static final class C19139a extends Message.Builder<GetGuideToRateStateRequest, C19139a> {
        /* renamed from: a */
        public GetGuideToRateStateRequest build() {
            return new GetGuideToRateStateRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19139a newBuilder() {
        C19139a aVar = new C19139a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetGuideToRateStateRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetGuideToRateStateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetGuideToRateStateRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
