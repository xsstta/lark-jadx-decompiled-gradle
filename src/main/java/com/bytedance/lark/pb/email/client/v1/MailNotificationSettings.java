package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailNotificationSettings extends Message<MailNotificationSettings, C16846a> {
    public static final ProtoAdapter<MailNotificationSettings> ADAPTER = new C16847b();
    public static final Boolean DEFAULT_MAIL_NOTIFICATION_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mail_notification_enabled;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNotificationSettings$b */
    private static final class C16847b extends ProtoAdapter<MailNotificationSettings> {
        C16847b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailNotificationSettings.class);
        }

        /* renamed from: a */
        public int encodedSize(MailNotificationSettings mailNotificationSettings) {
            int i;
            if (mailNotificationSettings.mail_notification_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailNotificationSettings.mail_notification_enabled);
            } else {
                i = 0;
            }
            return i + mailNotificationSettings.unknownFields().size();
        }

        /* renamed from: a */
        public MailNotificationSettings decode(ProtoReader protoReader) throws IOException {
            C16846a aVar = new C16846a();
            aVar.f43312a = false;
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
                    aVar.f43312a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailNotificationSettings mailNotificationSettings) throws IOException {
            if (mailNotificationSettings.mail_notification_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailNotificationSettings.mail_notification_enabled);
            }
            protoWriter.writeBytes(mailNotificationSettings.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNotificationSettings$a */
    public static final class C16846a extends Message.Builder<MailNotificationSettings, C16846a> {

        /* renamed from: a */
        public Boolean f43312a;

        /* renamed from: a */
        public MailNotificationSettings build() {
            return new MailNotificationSettings(this.f43312a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16846a newBuilder() {
        C16846a aVar = new C16846a();
        aVar.f43312a = this.mail_notification_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailNotificationSettings");
        StringBuilder sb = new StringBuilder();
        if (this.mail_notification_enabled != null) {
            sb.append(", mail_notification_enabled=");
            sb.append(this.mail_notification_enabled);
        }
        StringBuilder replace = sb.replace(0, 2, "MailNotificationSettings{");
        replace.append('}');
        return replace.toString();
    }

    public MailNotificationSettings(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailNotificationSettings(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mail_notification_enabled = bool;
    }
}
