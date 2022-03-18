package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCorrectionSettingResponse extends Message<GetCorrectionSettingResponse, C49469a> {
    public static final ProtoAdapter<GetCorrectionSettingResponse> ADAPTER = new C49470b();
    private static final long serialVersionUID = 0;
    public final CorrectionSetting mcorrection_setting;

    /* renamed from: com.ss.android.lark.pb.ai.GetCorrectionSettingResponse$b */
    private static final class C49470b extends ProtoAdapter<GetCorrectionSettingResponse> {
        C49470b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCorrectionSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCorrectionSettingResponse getCorrectionSettingResponse) {
            int i;
            if (getCorrectionSettingResponse.mcorrection_setting != null) {
                i = CorrectionSetting.ADAPTER.encodedSizeWithTag(1, getCorrectionSettingResponse.mcorrection_setting);
            } else {
                i = 0;
            }
            return i + getCorrectionSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCorrectionSettingResponse decode(ProtoReader protoReader) throws IOException {
            C49469a aVar = new C49469a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124060a = CorrectionSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCorrectionSettingResponse getCorrectionSettingResponse) throws IOException {
            if (getCorrectionSettingResponse.mcorrection_setting != null) {
                CorrectionSetting.ADAPTER.encodeWithTag(protoWriter, 1, getCorrectionSettingResponse.mcorrection_setting);
            }
            protoWriter.writeBytes(getCorrectionSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetCorrectionSettingResponse$a */
    public static final class C49469a extends Message.Builder<GetCorrectionSettingResponse, C49469a> {

        /* renamed from: a */
        public CorrectionSetting f124060a;

        /* renamed from: a */
        public GetCorrectionSettingResponse build() {
            return new GetCorrectionSettingResponse(this.f124060a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49469a newBuilder() {
        C49469a aVar = new C49469a();
        aVar.f124060a = this.mcorrection_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcorrection_setting != null) {
            sb.append(", correction_setting=");
            sb.append(this.mcorrection_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCorrectionSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCorrectionSettingResponse(CorrectionSetting correctionSetting) {
        this(correctionSetting, ByteString.EMPTY);
    }

    public GetCorrectionSettingResponse(CorrectionSetting correctionSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcorrection_setting = correctionSetting;
    }
}
