package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSetNotificationSettingsRequest extends Message<MailSetNotificationSettingsRequest, C16888a> {
    public static final ProtoAdapter<MailSetNotificationSettingsRequest> ADAPTER = new C16889b();
    private static final long serialVersionUID = 0;
    public final MailNotificationSettings notification_settings;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSetNotificationSettingsRequest$b */
    private static final class C16889b extends ProtoAdapter<MailSetNotificationSettingsRequest> {
        C16889b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSetNotificationSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSetNotificationSettingsRequest mailSetNotificationSettingsRequest) {
            int i;
            if (mailSetNotificationSettingsRequest.notification_settings != null) {
                i = MailNotificationSettings.ADAPTER.encodedSizeWithTag(1, mailSetNotificationSettingsRequest.notification_settings);
            } else {
                i = 0;
            }
            return i + mailSetNotificationSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSetNotificationSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C16888a aVar = new C16888a();
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
                    aVar.f43361a = MailNotificationSettings.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSetNotificationSettingsRequest mailSetNotificationSettingsRequest) throws IOException {
            if (mailSetNotificationSettingsRequest.notification_settings != null) {
                MailNotificationSettings.ADAPTER.encodeWithTag(protoWriter, 1, mailSetNotificationSettingsRequest.notification_settings);
            }
            protoWriter.writeBytes(mailSetNotificationSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSetNotificationSettingsRequest$a */
    public static final class C16888a extends Message.Builder<MailSetNotificationSettingsRequest, C16888a> {

        /* renamed from: a */
        public MailNotificationSettings f43361a;

        /* renamed from: a */
        public MailSetNotificationSettingsRequest build() {
            return new MailSetNotificationSettingsRequest(this.f43361a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16888a newBuilder() {
        C16888a aVar = new C16888a();
        aVar.f43361a = this.notification_settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSetNotificationSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.notification_settings != null) {
            sb.append(", notification_settings=");
            sb.append(this.notification_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSetNotificationSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSetNotificationSettingsRequest(MailNotificationSettings mailNotificationSettings) {
        this(mailNotificationSettings, ByteString.EMPTY);
    }

    public MailSetNotificationSettingsRequest(MailNotificationSettings mailNotificationSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notification_settings = mailNotificationSettings;
    }
}
