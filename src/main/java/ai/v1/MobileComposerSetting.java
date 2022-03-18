package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MobileComposerSetting extends Message<MobileComposerSetting, C0069a> {
    public static final ProtoAdapter<MobileComposerSetting> ADAPTER = new C0070b();
    public static final Boolean DEFAULT_IS_DOCS_ENABLED = false;
    public static final Boolean DEFAULT_IS_MAIL_ENABLED = false;
    public static final Boolean DEFAULT_IS_MESSENGER_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_docs_enabled;
    public final Boolean is_mail_enabled;
    public final Boolean is_messenger_enabled;

    /* renamed from: ai.v1.MobileComposerSetting$b */
    private static final class C0070b extends ProtoAdapter<MobileComposerSetting> {
        C0070b() {
            super(FieldEncoding.LENGTH_DELIMITED, MobileComposerSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(MobileComposerSetting mobileComposerSetting) {
            int i;
            int i2;
            int i3 = 0;
            if (mobileComposerSetting.is_messenger_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mobileComposerSetting.is_messenger_enabled);
            } else {
                i = 0;
            }
            if (mobileComposerSetting.is_docs_enabled != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mobileComposerSetting.is_docs_enabled);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mobileComposerSetting.is_mail_enabled != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mobileComposerSetting.is_mail_enabled);
            }
            return i4 + i3 + mobileComposerSetting.unknownFields().size();
        }

        /* renamed from: a */
        public MobileComposerSetting decode(ProtoReader protoReader) throws IOException {
            C0069a aVar = new C0069a();
            aVar.f121a = false;
            aVar.f122b = false;
            aVar.f123c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f121a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f122b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MobileComposerSetting mobileComposerSetting) throws IOException {
            if (mobileComposerSetting.is_messenger_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mobileComposerSetting.is_messenger_enabled);
            }
            if (mobileComposerSetting.is_docs_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mobileComposerSetting.is_docs_enabled);
            }
            if (mobileComposerSetting.is_mail_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mobileComposerSetting.is_mail_enabled);
            }
            protoWriter.writeBytes(mobileComposerSetting.unknownFields());
        }
    }

    /* renamed from: ai.v1.MobileComposerSetting$a */
    public static final class C0069a extends Message.Builder<MobileComposerSetting, C0069a> {

        /* renamed from: a */
        public Boolean f121a;

        /* renamed from: b */
        public Boolean f122b;

        /* renamed from: c */
        public Boolean f123c;

        /* renamed from: a */
        public MobileComposerSetting build() {
            return new MobileComposerSetting(this.f121a, this.f122b, this.f123c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0069a newBuilder() {
        C0069a aVar = new C0069a();
        aVar.f121a = this.is_messenger_enabled;
        aVar.f122b = this.is_docs_enabled;
        aVar.f123c = this.is_mail_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "MobileComposerSetting");
        StringBuilder sb = new StringBuilder();
        if (this.is_messenger_enabled != null) {
            sb.append(", is_messenger_enabled=");
            sb.append(this.is_messenger_enabled);
        }
        if (this.is_docs_enabled != null) {
            sb.append(", is_docs_enabled=");
            sb.append(this.is_docs_enabled);
        }
        if (this.is_mail_enabled != null) {
            sb.append(", is_mail_enabled=");
            sb.append(this.is_mail_enabled);
        }
        StringBuilder replace = sb.replace(0, 2, "MobileComposerSetting{");
        replace.append('}');
        return replace.toString();
    }

    public MobileComposerSetting(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public MobileComposerSetting(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_messenger_enabled = bool;
        this.is_docs_enabled = bool2;
        this.is_mail_enabled = bool3;
    }
}
