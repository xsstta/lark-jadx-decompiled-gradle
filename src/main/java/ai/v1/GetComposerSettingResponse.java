package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetComposerSettingResponse extends Message<GetComposerSettingResponse, C0055a> {
    public static final ProtoAdapter<GetComposerSettingResponse> ADAPTER = new C0056b();
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final ComposerSetting composer_setting;
    public final MobileComposerSetting mobile_composer_setting;
    public final Long update_time;

    /* renamed from: ai.v1.GetComposerSettingResponse$b */
    private static final class C0056b extends ProtoAdapter<GetComposerSettingResponse> {
        C0056b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetComposerSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetComposerSettingResponse getComposerSettingResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getComposerSettingResponse.composer_setting != null) {
                i = ComposerSetting.ADAPTER.encodedSizeWithTag(1, getComposerSettingResponse.composer_setting);
            } else {
                i = 0;
            }
            if (getComposerSettingResponse.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getComposerSettingResponse.update_time);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getComposerSettingResponse.mobile_composer_setting != null) {
                i3 = MobileComposerSetting.ADAPTER.encodedSizeWithTag(3, getComposerSettingResponse.mobile_composer_setting);
            }
            return i4 + i3 + getComposerSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetComposerSettingResponse decode(ProtoReader protoReader) throws IOException {
            C0055a aVar = new C0055a();
            aVar.f95b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f94a = ComposerSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f95b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f96c = MobileComposerSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetComposerSettingResponse getComposerSettingResponse) throws IOException {
            if (getComposerSettingResponse.composer_setting != null) {
                ComposerSetting.ADAPTER.encodeWithTag(protoWriter, 1, getComposerSettingResponse.composer_setting);
            }
            if (getComposerSettingResponse.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getComposerSettingResponse.update_time);
            }
            if (getComposerSettingResponse.mobile_composer_setting != null) {
                MobileComposerSetting.ADAPTER.encodeWithTag(protoWriter, 3, getComposerSettingResponse.mobile_composer_setting);
            }
            protoWriter.writeBytes(getComposerSettingResponse.unknownFields());
        }
    }

    /* renamed from: ai.v1.GetComposerSettingResponse$a */
    public static final class C0055a extends Message.Builder<GetComposerSettingResponse, C0055a> {

        /* renamed from: a */
        public ComposerSetting f94a;

        /* renamed from: b */
        public Long f95b;

        /* renamed from: c */
        public MobileComposerSetting f96c;

        /* renamed from: a */
        public GetComposerSettingResponse build() {
            return new GetComposerSettingResponse(this.f94a, this.f95b, this.f96c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0055a newBuilder() {
        C0055a aVar = new C0055a();
        aVar.f94a = this.composer_setting;
        aVar.f95b = this.update_time;
        aVar.f96c = this.mobile_composer_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetComposerSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.composer_setting != null) {
            sb.append(", composer_setting=");
            sb.append(this.composer_setting);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.mobile_composer_setting != null) {
            sb.append(", mobile_composer_setting=");
            sb.append(this.mobile_composer_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "GetComposerSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetComposerSettingResponse(ComposerSetting composerSetting, Long l, MobileComposerSetting mobileComposerSetting) {
        this(composerSetting, l, mobileComposerSetting, ByteString.EMPTY);
    }

    public GetComposerSettingResponse(ComposerSetting composerSetting, Long l, MobileComposerSetting mobileComposerSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.composer_setting = composerSetting;
        this.update_time = l;
        this.mobile_composer_setting = mobileComposerSetting;
    }
}
