package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetTabAndSettingStatusResponse extends Message<MailGetTabAndSettingStatusResponse, C16790a> {
    public static final ProtoAdapter<MailGetTabAndSettingStatusResponse> ADAPTER = new C16791b();
    private static final long serialVersionUID = 0;
    public final Setting setting;
    public final MailTabAndSettingStatus tab_and_setting_status;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTabAndSettingStatusResponse$b */
    private static final class C16791b extends ProtoAdapter<MailGetTabAndSettingStatusResponse> {
        C16791b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetTabAndSettingStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetTabAndSettingStatusResponse mailGetTabAndSettingStatusResponse) {
            int i;
            int i2 = 0;
            if (mailGetTabAndSettingStatusResponse.tab_and_setting_status != null) {
                i = MailTabAndSettingStatus.ADAPTER.encodedSizeWithTag(1, mailGetTabAndSettingStatusResponse.tab_and_setting_status);
            } else {
                i = 0;
            }
            if (mailGetTabAndSettingStatusResponse.setting != null) {
                i2 = Setting.ADAPTER.encodedSizeWithTag(2, mailGetTabAndSettingStatusResponse.setting);
            }
            return i + i2 + mailGetTabAndSettingStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetTabAndSettingStatusResponse decode(ProtoReader protoReader) throws IOException {
            C16790a aVar = new C16790a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43257a = MailTabAndSettingStatus.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43258b = Setting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetTabAndSettingStatusResponse mailGetTabAndSettingStatusResponse) throws IOException {
            if (mailGetTabAndSettingStatusResponse.tab_and_setting_status != null) {
                MailTabAndSettingStatus.ADAPTER.encodeWithTag(protoWriter, 1, mailGetTabAndSettingStatusResponse.tab_and_setting_status);
            }
            if (mailGetTabAndSettingStatusResponse.setting != null) {
                Setting.ADAPTER.encodeWithTag(protoWriter, 2, mailGetTabAndSettingStatusResponse.setting);
            }
            protoWriter.writeBytes(mailGetTabAndSettingStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTabAndSettingStatusResponse$a */
    public static final class C16790a extends Message.Builder<MailGetTabAndSettingStatusResponse, C16790a> {

        /* renamed from: a */
        public MailTabAndSettingStatus f43257a;

        /* renamed from: b */
        public Setting f43258b;

        /* renamed from: a */
        public MailGetTabAndSettingStatusResponse build() {
            return new MailGetTabAndSettingStatusResponse(this.f43257a, this.f43258b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16790a newBuilder() {
        C16790a aVar = new C16790a();
        aVar.f43257a = this.tab_and_setting_status;
        aVar.f43258b = this.setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetTabAndSettingStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (this.tab_and_setting_status != null) {
            sb.append(", tab_and_setting_status=");
            sb.append(this.tab_and_setting_status);
        }
        if (this.setting != null) {
            sb.append(", setting=");
            sb.append(this.setting);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetTabAndSettingStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetTabAndSettingStatusResponse(MailTabAndSettingStatus mailTabAndSettingStatus, Setting setting2) {
        this(mailTabAndSettingStatus, setting2, ByteString.EMPTY);
    }

    public MailGetTabAndSettingStatusResponse(MailTabAndSettingStatus mailTabAndSettingStatus, Setting setting2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tab_and_setting_status = mailTabAndSettingStatus;
        this.setting = setting2;
    }
}
