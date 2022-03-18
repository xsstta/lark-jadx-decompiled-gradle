package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetNotificationSettingsResponse extends Message<MailGetNotificationSettingsResponse, C16756a> {
    public static final ProtoAdapter<MailGetNotificationSettingsResponse> ADAPTER = new C16757b();
    private static final long serialVersionUID = 0;
    public final MailNotificationSettings notification_settings;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetNotificationSettingsResponse$b */
    private static final class C16757b extends ProtoAdapter<MailGetNotificationSettingsResponse> {
        C16757b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetNotificationSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetNotificationSettingsResponse mailGetNotificationSettingsResponse) {
            int i;
            if (mailGetNotificationSettingsResponse.notification_settings != null) {
                i = MailNotificationSettings.ADAPTER.encodedSizeWithTag(1, mailGetNotificationSettingsResponse.notification_settings);
            } else {
                i = 0;
            }
            return i + mailGetNotificationSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetNotificationSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C16756a aVar = new C16756a();
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
                    aVar.f43227a = MailNotificationSettings.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetNotificationSettingsResponse mailGetNotificationSettingsResponse) throws IOException {
            if (mailGetNotificationSettingsResponse.notification_settings != null) {
                MailNotificationSettings.ADAPTER.encodeWithTag(protoWriter, 1, mailGetNotificationSettingsResponse.notification_settings);
            }
            protoWriter.writeBytes(mailGetNotificationSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetNotificationSettingsResponse$a */
    public static final class C16756a extends Message.Builder<MailGetNotificationSettingsResponse, C16756a> {

        /* renamed from: a */
        public MailNotificationSettings f43227a;

        /* renamed from: a */
        public MailGetNotificationSettingsResponse build() {
            return new MailGetNotificationSettingsResponse(this.f43227a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16756a newBuilder() {
        C16756a aVar = new C16756a();
        aVar.f43227a = this.notification_settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetNotificationSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.notification_settings != null) {
            sb.append(", notification_settings=");
            sb.append(this.notification_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetNotificationSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetNotificationSettingsResponse(MailNotificationSettings mailNotificationSettings) {
        this(mailNotificationSettings, ByteString.EMPTY);
    }

    public MailGetNotificationSettingsResponse(MailNotificationSettings mailNotificationSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notification_settings = mailNotificationSettings;
    }
}
