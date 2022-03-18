package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.MailTabAndSettingStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailTabAndSettingStatusPushResponse extends Message<MailTabAndSettingStatusPushResponse, C17068a> {
    public static final ProtoAdapter<MailTabAndSettingStatusPushResponse> ADAPTER = new C17069b();
    private static final long serialVersionUID = 0;
    public final MailTabAndSettingStatus tab_and_setting_status;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailTabAndSettingStatusPushResponse$b */
    private static final class C17069b extends ProtoAdapter<MailTabAndSettingStatusPushResponse> {
        C17069b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailTabAndSettingStatusPushResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailTabAndSettingStatusPushResponse mailTabAndSettingStatusPushResponse) {
            int i;
            if (mailTabAndSettingStatusPushResponse.tab_and_setting_status != null) {
                i = MailTabAndSettingStatus.ADAPTER.encodedSizeWithTag(1, mailTabAndSettingStatusPushResponse.tab_and_setting_status);
            } else {
                i = 0;
            }
            return i + mailTabAndSettingStatusPushResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailTabAndSettingStatusPushResponse decode(ProtoReader protoReader) throws IOException {
            C17068a aVar = new C17068a();
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
                    aVar.f43731a = MailTabAndSettingStatus.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailTabAndSettingStatusPushResponse mailTabAndSettingStatusPushResponse) throws IOException {
            if (mailTabAndSettingStatusPushResponse.tab_and_setting_status != null) {
                MailTabAndSettingStatus.ADAPTER.encodeWithTag(protoWriter, 1, mailTabAndSettingStatusPushResponse.tab_and_setting_status);
            }
            protoWriter.writeBytes(mailTabAndSettingStatusPushResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailTabAndSettingStatusPushResponse$a */
    public static final class C17068a extends Message.Builder<MailTabAndSettingStatusPushResponse, C17068a> {

        /* renamed from: a */
        public MailTabAndSettingStatus f43731a;

        /* renamed from: a */
        public MailTabAndSettingStatusPushResponse build() {
            return new MailTabAndSettingStatusPushResponse(this.f43731a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17068a newBuilder() {
        C17068a aVar = new C17068a();
        aVar.f43731a = this.tab_and_setting_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailTabAndSettingStatusPushResponse");
        StringBuilder sb = new StringBuilder();
        if (this.tab_and_setting_status != null) {
            sb.append(", tab_and_setting_status=");
            sb.append(this.tab_and_setting_status);
        }
        StringBuilder replace = sb.replace(0, 2, "MailTabAndSettingStatusPushResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailTabAndSettingStatusPushResponse(MailTabAndSettingStatus mailTabAndSettingStatus) {
        this(mailTabAndSettingStatus, ByteString.EMPTY);
    }

    public MailTabAndSettingStatusPushResponse(MailTabAndSettingStatus mailTabAndSettingStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tab_and_setting_status = mailTabAndSettingStatus;
    }
}
