package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateClientTabSettingResponse extends Message<MailUpdateClientTabSettingResponse, C16936a> {
    public static final ProtoAdapter<MailUpdateClientTabSettingResponse> ADAPTER = new C16937b();
    private static final long serialVersionUID = 0;
    public final MailAccount account;
    public final Setting setting;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateClientTabSettingResponse$b */
    private static final class C16937b extends ProtoAdapter<MailUpdateClientTabSettingResponse> {
        C16937b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateClientTabSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateClientTabSettingResponse mailUpdateClientTabSettingResponse) {
            int i;
            int i2 = 0;
            if (mailUpdateClientTabSettingResponse.setting != null) {
                i = Setting.ADAPTER.encodedSizeWithTag(1, mailUpdateClientTabSettingResponse.setting);
            } else {
                i = 0;
            }
            if (mailUpdateClientTabSettingResponse.account != null) {
                i2 = MailAccount.ADAPTER.encodedSizeWithTag(2, mailUpdateClientTabSettingResponse.account);
            }
            return i + i2 + mailUpdateClientTabSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateClientTabSettingResponse decode(ProtoReader protoReader) throws IOException {
            C16936a aVar = new C16936a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43426a = Setting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43427b = MailAccount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateClientTabSettingResponse mailUpdateClientTabSettingResponse) throws IOException {
            if (mailUpdateClientTabSettingResponse.setting != null) {
                Setting.ADAPTER.encodeWithTag(protoWriter, 1, mailUpdateClientTabSettingResponse.setting);
            }
            if (mailUpdateClientTabSettingResponse.account != null) {
                MailAccount.ADAPTER.encodeWithTag(protoWriter, 2, mailUpdateClientTabSettingResponse.account);
            }
            protoWriter.writeBytes(mailUpdateClientTabSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateClientTabSettingResponse$a */
    public static final class C16936a extends Message.Builder<MailUpdateClientTabSettingResponse, C16936a> {

        /* renamed from: a */
        public Setting f43426a;

        /* renamed from: b */
        public MailAccount f43427b;

        /* renamed from: a */
        public MailUpdateClientTabSettingResponse build() {
            return new MailUpdateClientTabSettingResponse(this.f43426a, this.f43427b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16936a newBuilder() {
        C16936a aVar = new C16936a();
        aVar.f43426a = this.setting;
        aVar.f43427b = this.account;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateClientTabSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.setting != null) {
            sb.append(", setting=");
            sb.append(this.setting);
        }
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateClientTabSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateClientTabSettingResponse(Setting setting2, MailAccount mailAccount) {
        this(setting2, mailAccount, ByteString.EMPTY);
    }

    public MailUpdateClientTabSettingResponse(Setting setting2, MailAccount mailAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = setting2;
        this.account = mailAccount;
    }
}
