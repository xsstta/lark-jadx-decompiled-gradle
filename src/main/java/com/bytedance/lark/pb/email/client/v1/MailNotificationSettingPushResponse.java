package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailNotificationSettingPushResponse extends Message<MailNotificationSettingPushResponse, C16844a> {
    public static final ProtoAdapter<MailNotificationSettingPushResponse> ADAPTER = new C16845b();
    private static final long serialVersionUID = 0;
    public final MailNotificationSettings notification_settings;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNotificationSettingPushResponse$b */
    private static final class C16845b extends ProtoAdapter<MailNotificationSettingPushResponse> {
        C16845b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailNotificationSettingPushResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailNotificationSettingPushResponse mailNotificationSettingPushResponse) {
            int i;
            if (mailNotificationSettingPushResponse.notification_settings != null) {
                i = MailNotificationSettings.ADAPTER.encodedSizeWithTag(1, mailNotificationSettingPushResponse.notification_settings);
            } else {
                i = 0;
            }
            return i + mailNotificationSettingPushResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailNotificationSettingPushResponse decode(ProtoReader protoReader) throws IOException {
            C16844a aVar = new C16844a();
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
                    aVar.f43311a = MailNotificationSettings.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailNotificationSettingPushResponse mailNotificationSettingPushResponse) throws IOException {
            if (mailNotificationSettingPushResponse.notification_settings != null) {
                MailNotificationSettings.ADAPTER.encodeWithTag(protoWriter, 1, mailNotificationSettingPushResponse.notification_settings);
            }
            protoWriter.writeBytes(mailNotificationSettingPushResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNotificationSettingPushResponse$a */
    public static final class C16844a extends Message.Builder<MailNotificationSettingPushResponse, C16844a> {

        /* renamed from: a */
        public MailNotificationSettings f43311a;

        /* renamed from: a */
        public MailNotificationSettingPushResponse build() {
            return new MailNotificationSettingPushResponse(this.f43311a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16844a newBuilder() {
        C16844a aVar = new C16844a();
        aVar.f43311a = this.notification_settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailNotificationSettingPushResponse");
        StringBuilder sb = new StringBuilder();
        if (this.notification_settings != null) {
            sb.append(", notification_settings=");
            sb.append(this.notification_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "MailNotificationSettingPushResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailNotificationSettingPushResponse(MailNotificationSettings mailNotificationSettings) {
        this(mailNotificationSettings, ByteString.EMPTY);
    }

    public MailNotificationSettingPushResponse(MailNotificationSettings mailNotificationSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notification_settings = mailNotificationSettings;
    }
}
