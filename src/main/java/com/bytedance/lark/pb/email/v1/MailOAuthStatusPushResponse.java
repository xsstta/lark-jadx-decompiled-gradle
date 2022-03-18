package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.MailAccount;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailOAuthStatusPushResponse extends Message<MailOAuthStatusPushResponse, C17030a> {
    public static final ProtoAdapter<MailOAuthStatusPushResponse> ADAPTER = new C17031b();
    public static final Status DEFAULT_STATUS = Status.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final MailAccount account;
    public final String email_address;
    public final Setting setting;
    public final Status status;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        SUCCESS(1),
        FAIL(2),
        REVOKE(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return FAIL;
            }
            if (i != 3) {
                return null;
            }
            return REVOKE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailOAuthStatusPushResponse$b */
    private static final class C17031b extends ProtoAdapter<MailOAuthStatusPushResponse> {
        C17031b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailOAuthStatusPushResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailOAuthStatusPushResponse mailOAuthStatusPushResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailOAuthStatusPushResponse.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, mailOAuthStatusPushResponse.status);
            } else {
                i = 0;
            }
            if (mailOAuthStatusPushResponse.email_address != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailOAuthStatusPushResponse.email_address);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailOAuthStatusPushResponse.setting != null) {
                i3 = Setting.ADAPTER.encodedSizeWithTag(3, mailOAuthStatusPushResponse.setting);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailOAuthStatusPushResponse.account != null) {
                i4 = MailAccount.ADAPTER.encodedSizeWithTag(4, mailOAuthStatusPushResponse.account);
            }
            return i6 + i4 + mailOAuthStatusPushResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailOAuthStatusPushResponse decode(ProtoReader protoReader) throws IOException {
            C17030a aVar = new C17030a();
            aVar.f43679a = Status.UNKNOWN;
            aVar.f43680b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f43679a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f43680b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43681c = Setting.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43682d = MailAccount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailOAuthStatusPushResponse mailOAuthStatusPushResponse) throws IOException {
            if (mailOAuthStatusPushResponse.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, mailOAuthStatusPushResponse.status);
            }
            if (mailOAuthStatusPushResponse.email_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailOAuthStatusPushResponse.email_address);
            }
            if (mailOAuthStatusPushResponse.setting != null) {
                Setting.ADAPTER.encodeWithTag(protoWriter, 3, mailOAuthStatusPushResponse.setting);
            }
            if (mailOAuthStatusPushResponse.account != null) {
                MailAccount.ADAPTER.encodeWithTag(protoWriter, 4, mailOAuthStatusPushResponse.account);
            }
            protoWriter.writeBytes(mailOAuthStatusPushResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailOAuthStatusPushResponse$a */
    public static final class C17030a extends Message.Builder<MailOAuthStatusPushResponse, C17030a> {

        /* renamed from: a */
        public Status f43679a;

        /* renamed from: b */
        public String f43680b;

        /* renamed from: c */
        public Setting f43681c;

        /* renamed from: d */
        public MailAccount f43682d;

        /* renamed from: a */
        public MailOAuthStatusPushResponse build() {
            return new MailOAuthStatusPushResponse(this.f43679a, this.f43680b, this.f43681c, this.f43682d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17030a newBuilder() {
        C17030a aVar = new C17030a();
        aVar.f43679a = this.status;
        aVar.f43680b = this.email_address;
        aVar.f43681c = this.setting;
        aVar.f43682d = this.account;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailOAuthStatusPushResponse");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.email_address != null) {
            sb.append(", email_address=");
            sb.append(this.email_address);
        }
        if (this.setting != null) {
            sb.append(", setting=");
            sb.append(this.setting);
        }
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        StringBuilder replace = sb.replace(0, 2, "MailOAuthStatusPushResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailOAuthStatusPushResponse(Status status2, String str, Setting setting2, MailAccount mailAccount) {
        this(status2, str, setting2, mailAccount, ByteString.EMPTY);
    }

    public MailOAuthStatusPushResponse(Status status2, String str, Setting setting2, MailAccount mailAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.email_address = str;
        this.setting = setting2;
        this.account = mailAccount;
    }
}
