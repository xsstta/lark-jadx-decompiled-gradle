package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetComposerSettingRequest extends Message<SetComposerSettingRequest, C0073a> {
    public static final ProtoAdapter<SetComposerSettingRequest> ADAPTER = new C0074b();
    private static final long serialVersionUID = 0;
    public final ComposerSetting composer_setting;
    public final MobileComposerSetting mobile_composer_setting;

    /* renamed from: ai.v1.SetComposerSettingRequest$b */
    private static final class C0074b extends ProtoAdapter<SetComposerSettingRequest> {
        C0074b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetComposerSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetComposerSettingRequest setComposerSettingRequest) {
            int i;
            int encodedSizeWithTag = ComposerSetting.ADAPTER.encodedSizeWithTag(1, setComposerSettingRequest.composer_setting);
            if (setComposerSettingRequest.mobile_composer_setting != null) {
                i = MobileComposerSetting.ADAPTER.encodedSizeWithTag(2, setComposerSettingRequest.mobile_composer_setting);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setComposerSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetComposerSettingRequest decode(ProtoReader protoReader) throws IOException {
            C0073a aVar = new C0073a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126a = ComposerSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127b = MobileComposerSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetComposerSettingRequest setComposerSettingRequest) throws IOException {
            ComposerSetting.ADAPTER.encodeWithTag(protoWriter, 1, setComposerSettingRequest.composer_setting);
            if (setComposerSettingRequest.mobile_composer_setting != null) {
                MobileComposerSetting.ADAPTER.encodeWithTag(protoWriter, 2, setComposerSettingRequest.mobile_composer_setting);
            }
            protoWriter.writeBytes(setComposerSettingRequest.unknownFields());
        }
    }

    /* renamed from: ai.v1.SetComposerSettingRequest$a */
    public static final class C0073a extends Message.Builder<SetComposerSettingRequest, C0073a> {

        /* renamed from: a */
        public ComposerSetting f126a;

        /* renamed from: b */
        public MobileComposerSetting f127b;

        /* renamed from: a */
        public SetComposerSettingRequest build() {
            ComposerSetting composerSetting = this.f126a;
            if (composerSetting != null) {
                return new SetComposerSettingRequest(composerSetting, this.f127b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(composerSetting, "composer_setting");
        }

        /* renamed from: a */
        public C0073a mo122a(ComposerSetting composerSetting) {
            this.f126a = composerSetting;
            return this;
        }

        /* renamed from: a */
        public C0073a mo123a(MobileComposerSetting mobileComposerSetting) {
            this.f127b = mobileComposerSetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C0073a newBuilder() {
        C0073a aVar = new C0073a();
        aVar.f126a = this.composer_setting;
        aVar.f127b = this.mobile_composer_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "SetComposerSettingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", composer_setting=");
        sb.append(this.composer_setting);
        if (this.mobile_composer_setting != null) {
            sb.append(", mobile_composer_setting=");
            sb.append(this.mobile_composer_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "SetComposerSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetComposerSettingRequest(ComposerSetting composerSetting, MobileComposerSetting mobileComposerSetting) {
        this(composerSetting, mobileComposerSetting, ByteString.EMPTY);
    }

    public SetComposerSettingRequest(ComposerSetting composerSetting, MobileComposerSetting mobileComposerSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.composer_setting = composerSetting;
        this.mobile_composer_setting = mobileComposerSetting;
    }
}
