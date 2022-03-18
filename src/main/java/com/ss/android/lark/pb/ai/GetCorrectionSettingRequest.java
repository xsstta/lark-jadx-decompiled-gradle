package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCorrectionSettingRequest extends Message<GetCorrectionSettingRequest, C49467a> {
    public static final ProtoAdapter<GetCorrectionSettingRequest> ADAPTER = new C49468b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.ai.GetCorrectionSettingRequest$b */
    private static final class C49468b extends ProtoAdapter<GetCorrectionSettingRequest> {
        C49468b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCorrectionSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCorrectionSettingRequest getCorrectionSettingRequest) {
            return getCorrectionSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCorrectionSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49467a aVar = new C49467a();
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
        public void encode(ProtoWriter protoWriter, GetCorrectionSettingRequest getCorrectionSettingRequest) throws IOException {
            protoWriter.writeBytes(getCorrectionSettingRequest.unknownFields());
        }
    }

    public GetCorrectionSettingRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetCorrectionSettingRequest$a */
    public static final class C49467a extends Message.Builder<GetCorrectionSettingRequest, C49467a> {
        /* renamed from: a */
        public GetCorrectionSettingRequest build() {
            return new GetCorrectionSettingRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49467a newBuilder() {
        C49467a aVar = new C49467a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetCorrectionSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCorrectionSettingRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
