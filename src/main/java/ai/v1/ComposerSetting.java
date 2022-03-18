package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ComposerSetting extends Message<ComposerSetting, C0041a> {
    public static final ProtoAdapter<ComposerSetting> ADAPTER = new C0042b();
    public static final Boolean DEFAULT_CAN_PERSONALIZE = false;
    public static final Boolean DEFAULT_IS_DOCS_ENABLED = false;
    public static final Boolean DEFAULT_IS_ENABLED = false;
    public static final Boolean DEFAULT_IS_MAIL_ENABLED = false;
    public static final Boolean DEFAULT_IS_MESSENGER_ENABLED = false;
    public static final Integer DEFAULT_TRIGGER_DELAY_MS = 100;
    private static final long serialVersionUID = 0;
    public final Boolean can_personalize;
    public final Boolean is_docs_enabled;
    public final Boolean is_enabled;
    public final Boolean is_mail_enabled;
    public final Boolean is_messenger_enabled;
    public final Integer trigger_delay_ms;

    /* renamed from: ai.v1.ComposerSetting$b */
    private static final class C0042b extends ProtoAdapter<ComposerSetting> {
        C0042b() {
            super(FieldEncoding.LENGTH_DELIMITED, ComposerSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(ComposerSetting composerSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (composerSetting.is_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, composerSetting.is_enabled);
            } else {
                i = 0;
            }
            if (composerSetting.can_personalize != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, composerSetting.can_personalize);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (composerSetting.trigger_delay_ms != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, composerSetting.trigger_delay_ms);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (composerSetting.is_messenger_enabled != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, composerSetting.is_messenger_enabled);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (composerSetting.is_docs_enabled != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, composerSetting.is_docs_enabled);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (composerSetting.is_mail_enabled != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, composerSetting.is_mail_enabled);
            }
            return i10 + i6 + composerSetting.unknownFields().size();
        }

        /* renamed from: a */
        public ComposerSetting decode(ProtoReader protoReader) throws IOException {
            C0041a aVar = new C0041a();
            aVar.f67a = false;
            aVar.f68b = false;
            aVar.f69c = 100;
            aVar.f70d = false;
            aVar.f71e = false;
            aVar.f72f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f67a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f68b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f69c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f70d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f71e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f72f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ComposerSetting composerSetting) throws IOException {
            if (composerSetting.is_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, composerSetting.is_enabled);
            }
            if (composerSetting.can_personalize != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, composerSetting.can_personalize);
            }
            if (composerSetting.trigger_delay_ms != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, composerSetting.trigger_delay_ms);
            }
            if (composerSetting.is_messenger_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, composerSetting.is_messenger_enabled);
            }
            if (composerSetting.is_docs_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, composerSetting.is_docs_enabled);
            }
            if (composerSetting.is_mail_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, composerSetting.is_mail_enabled);
            }
            protoWriter.writeBytes(composerSetting.unknownFields());
        }
    }

    /* renamed from: ai.v1.ComposerSetting$a */
    public static final class C0041a extends Message.Builder<ComposerSetting, C0041a> {

        /* renamed from: a */
        public Boolean f67a;

        /* renamed from: b */
        public Boolean f68b;

        /* renamed from: c */
        public Integer f69c;

        /* renamed from: d */
        public Boolean f70d;

        /* renamed from: e */
        public Boolean f71e;

        /* renamed from: f */
        public Boolean f72f;

        /* renamed from: a */
        public ComposerSetting build() {
            return new ComposerSetting(this.f67a, this.f68b, this.f69c, this.f70d, this.f71e, this.f72f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0041a newBuilder() {
        C0041a aVar = new C0041a();
        aVar.f67a = this.is_enabled;
        aVar.f68b = this.can_personalize;
        aVar.f69c = this.trigger_delay_ms;
        aVar.f70d = this.is_messenger_enabled;
        aVar.f71e = this.is_docs_enabled;
        aVar.f72f = this.is_mail_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "ComposerSetting");
        StringBuilder sb = new StringBuilder();
        if (this.is_enabled != null) {
            sb.append(", is_enabled=");
            sb.append(this.is_enabled);
        }
        if (this.can_personalize != null) {
            sb.append(", can_personalize=");
            sb.append(this.can_personalize);
        }
        if (this.trigger_delay_ms != null) {
            sb.append(", trigger_delay_ms=");
            sb.append(this.trigger_delay_ms);
        }
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
        StringBuilder replace = sb.replace(0, 2, "ComposerSetting{");
        replace.append('}');
        return replace.toString();
    }

    public ComposerSetting(Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(bool, bool2, num, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public ComposerSetting(Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_enabled = bool;
        this.can_personalize = bool2;
        this.trigger_delay_ms = num;
        this.is_messenger_enabled = bool3;
        this.is_docs_enabled = bool4;
        this.is_mail_enabled = bool5;
    }
}
