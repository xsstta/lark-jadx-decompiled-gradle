package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushCorrectionSetting extends Message<PushCorrectionSetting, C49503a> {
    public static final ProtoAdapter<PushCorrectionSetting> ADAPTER = new C49504b();
    private static final long serialVersionUID = 0;
    public final CorrectionSetting mcorrection_setting;

    /* renamed from: com.ss.android.lark.pb.ai.PushCorrectionSetting$b */
    private static final class C49504b extends ProtoAdapter<PushCorrectionSetting> {
        C49504b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCorrectionSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCorrectionSetting pushCorrectionSetting) {
            int i;
            if (pushCorrectionSetting.mcorrection_setting != null) {
                i = CorrectionSetting.ADAPTER.encodedSizeWithTag(1, pushCorrectionSetting.mcorrection_setting);
            } else {
                i = 0;
            }
            return i + pushCorrectionSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PushCorrectionSetting decode(ProtoReader protoReader) throws IOException {
            C49503a aVar = new C49503a();
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
                    aVar.f124101a = CorrectionSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCorrectionSetting pushCorrectionSetting) throws IOException {
            if (pushCorrectionSetting.mcorrection_setting != null) {
                CorrectionSetting.ADAPTER.encodeWithTag(protoWriter, 1, pushCorrectionSetting.mcorrection_setting);
            }
            protoWriter.writeBytes(pushCorrectionSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.PushCorrectionSetting$a */
    public static final class C49503a extends Message.Builder<PushCorrectionSetting, C49503a> {

        /* renamed from: a */
        public CorrectionSetting f124101a;

        /* renamed from: a */
        public PushCorrectionSetting build() {
            return new PushCorrectionSetting(this.f124101a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49503a newBuilder() {
        C49503a aVar = new C49503a();
        aVar.f124101a = this.mcorrection_setting;
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
        StringBuilder replace = sb.replace(0, 2, "PushCorrectionSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PushCorrectionSetting(CorrectionSetting correctionSetting) {
        this(correctionSetting, ByteString.EMPTY);
    }

    public PushCorrectionSetting(CorrectionSetting correctionSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcorrection_setting = correctionSetting;
    }
}
