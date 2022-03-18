package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class EmailClientConfig extends Message<EmailClientConfig, C16614a> {
    public static final ProtoAdapter<EmailClientConfig> ADAPTER = new C16615b();
    public static final ConfigStatus DEFAULT_CONFIG_STATUS = ConfigStatus.NOT_APPLICABLE;
    public static final Boolean DEFAULT_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final ConfigStatus config_status;
    public final String email_address;
    public final Boolean enabled;

    public enum ConfigStatus implements WireEnum {
        NOT_APPLICABLE(0),
        VALID(1),
        EXPIRED(2),
        DELETED(3);
        
        public static final ProtoAdapter<ConfigStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ConfigStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ConfigStatus fromValue(int i) {
            if (i == 0) {
                return NOT_APPLICABLE;
            }
            if (i == 1) {
                return VALID;
            }
            if (i == 2) {
                return EXPIRED;
            }
            if (i != 3) {
                return null;
            }
            return DELETED;
        }

        private ConfigStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.EmailClientConfig$b */
    private static final class C16615b extends ProtoAdapter<EmailClientConfig> {
        C16615b() {
            super(FieldEncoding.LENGTH_DELIMITED, EmailClientConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(EmailClientConfig emailClientConfig) {
            int i;
            int i2;
            int i3 = 0;
            if (emailClientConfig.enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, emailClientConfig.enabled);
            } else {
                i = 0;
            }
            if (emailClientConfig.email_address != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, emailClientConfig.email_address);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (emailClientConfig.config_status != null) {
                i3 = ConfigStatus.ADAPTER.encodedSizeWithTag(4, emailClientConfig.config_status);
            }
            return i4 + i3 + emailClientConfig.unknownFields().size();
        }

        /* renamed from: a */
        public EmailClientConfig decode(ProtoReader protoReader) throws IOException {
            C16614a aVar = new C16614a();
            aVar.f43027a = false;
            aVar.f43028b = "";
            aVar.f43029c = ConfigStatus.NOT_APPLICABLE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f43027a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43028b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43029c = ConfigStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EmailClientConfig emailClientConfig) throws IOException {
            if (emailClientConfig.enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, emailClientConfig.enabled);
            }
            if (emailClientConfig.email_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, emailClientConfig.email_address);
            }
            if (emailClientConfig.config_status != null) {
                ConfigStatus.ADAPTER.encodeWithTag(protoWriter, 4, emailClientConfig.config_status);
            }
            protoWriter.writeBytes(emailClientConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.EmailClientConfig$a */
    public static final class C16614a extends Message.Builder<EmailClientConfig, C16614a> {

        /* renamed from: a */
        public Boolean f43027a;

        /* renamed from: b */
        public String f43028b;

        /* renamed from: c */
        public ConfigStatus f43029c;

        /* renamed from: a */
        public EmailClientConfig build() {
            return new EmailClientConfig(this.f43027a, this.f43028b, this.f43029c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16614a newBuilder() {
        C16614a aVar = new C16614a();
        aVar.f43027a = this.enabled;
        aVar.f43028b = this.email_address;
        aVar.f43029c = this.config_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "EmailClientConfig");
        StringBuilder sb = new StringBuilder();
        if (this.enabled != null) {
            sb.append(", enabled=");
            sb.append(this.enabled);
        }
        if (this.email_address != null) {
            sb.append(", email_address=");
            sb.append(this.email_address);
        }
        if (this.config_status != null) {
            sb.append(", config_status=");
            sb.append(this.config_status);
        }
        StringBuilder replace = sb.replace(0, 2, "EmailClientConfig{");
        replace.append('}');
        return replace.toString();
    }

    public EmailClientConfig(Boolean bool, String str, ConfigStatus configStatus) {
        this(bool, str, configStatus, ByteString.EMPTY);
    }

    public EmailClientConfig(Boolean bool, String str, ConfigStatus configStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enabled = bool;
        this.email_address = str;
        this.config_status = configStatus;
    }
}
