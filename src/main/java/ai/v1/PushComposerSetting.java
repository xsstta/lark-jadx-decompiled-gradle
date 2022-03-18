package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushComposerSetting extends Message<PushComposerSetting, C0071a> {
    public static final ProtoAdapter<PushComposerSetting> ADAPTER = new C0072b();
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final ComposerSetting composer_setting;
    public final Long update_time;

    /* renamed from: ai.v1.PushComposerSetting$b */
    private static final class C0072b extends ProtoAdapter<PushComposerSetting> {
        C0072b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushComposerSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PushComposerSetting pushComposerSetting) {
            int i;
            int i2 = 0;
            if (pushComposerSetting.composer_setting != null) {
                i = ComposerSetting.ADAPTER.encodedSizeWithTag(1, pushComposerSetting.composer_setting);
            } else {
                i = 0;
            }
            if (pushComposerSetting.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, pushComposerSetting.update_time);
            }
            return i + i2 + pushComposerSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PushComposerSetting decode(ProtoReader protoReader) throws IOException {
            C0071a aVar = new C0071a();
            aVar.f125b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124a = ComposerSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushComposerSetting pushComposerSetting) throws IOException {
            if (pushComposerSetting.composer_setting != null) {
                ComposerSetting.ADAPTER.encodeWithTag(protoWriter, 1, pushComposerSetting.composer_setting);
            }
            if (pushComposerSetting.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pushComposerSetting.update_time);
            }
            protoWriter.writeBytes(pushComposerSetting.unknownFields());
        }
    }

    /* renamed from: ai.v1.PushComposerSetting$a */
    public static final class C0071a extends Message.Builder<PushComposerSetting, C0071a> {

        /* renamed from: a */
        public ComposerSetting f124a;

        /* renamed from: b */
        public Long f125b;

        /* renamed from: a */
        public PushComposerSetting build() {
            return new PushComposerSetting(this.f124a, this.f125b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0071a newBuilder() {
        C0071a aVar = new C0071a();
        aVar.f124a = this.composer_setting;
        aVar.f125b = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "PushComposerSetting");
        StringBuilder sb = new StringBuilder();
        if (this.composer_setting != null) {
            sb.append(", composer_setting=");
            sb.append(this.composer_setting);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PushComposerSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PushComposerSetting(ComposerSetting composerSetting, Long l) {
        this(composerSetting, l, ByteString.EMPTY);
    }

    public PushComposerSetting(ComposerSetting composerSetting, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.composer_setting = composerSetting;
        this.update_time = l;
    }
}
