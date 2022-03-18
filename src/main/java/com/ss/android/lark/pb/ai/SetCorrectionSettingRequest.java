package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetCorrectionSettingRequest extends Message<SetCorrectionSettingRequest, C49513a> {
    public static final ProtoAdapter<SetCorrectionSettingRequest> ADAPTER = new C49514b();
    private static final long serialVersionUID = 0;
    public final CorrectionSetting mcorrection_setting;

    /* renamed from: com.ss.android.lark.pb.ai.SetCorrectionSettingRequest$b */
    private static final class C49514b extends ProtoAdapter<SetCorrectionSettingRequest> {
        C49514b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCorrectionSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCorrectionSettingRequest setCorrectionSettingRequest) {
            return CorrectionSetting.ADAPTER.encodedSizeWithTag(1, setCorrectionSettingRequest.mcorrection_setting) + setCorrectionSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetCorrectionSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49513a aVar = new C49513a();
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
                    aVar.f124114a = CorrectionSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetCorrectionSettingRequest setCorrectionSettingRequest) throws IOException {
            CorrectionSetting.ADAPTER.encodeWithTag(protoWriter, 1, setCorrectionSettingRequest.mcorrection_setting);
            protoWriter.writeBytes(setCorrectionSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.SetCorrectionSettingRequest$a */
    public static final class C49513a extends Message.Builder<SetCorrectionSettingRequest, C49513a> {

        /* renamed from: a */
        public CorrectionSetting f124114a;

        /* renamed from: a */
        public SetCorrectionSettingRequest build() {
            CorrectionSetting correctionSetting = this.f124114a;
            if (correctionSetting != null) {
                return new SetCorrectionSettingRequest(correctionSetting, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(correctionSetting, "mcorrection_setting");
        }

        /* renamed from: a */
        public C49513a mo172701a(CorrectionSetting correctionSetting) {
            this.f124114a = correctionSetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49513a newBuilder() {
        C49513a aVar = new C49513a();
        aVar.f124114a = this.mcorrection_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", correction_setting=");
        sb.append(this.mcorrection_setting);
        StringBuilder replace = sb.replace(0, 2, "SetCorrectionSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetCorrectionSettingRequest(CorrectionSetting correctionSetting) {
        this(correctionSetting, ByteString.EMPTY);
    }

    public SetCorrectionSettingRequest(CorrectionSetting correctionSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcorrection_setting = correctionSetting;
    }
}
