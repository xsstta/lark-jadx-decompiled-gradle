package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class NotificationSettingV2 extends Message<NotificationSettingV2, C19181a> {
    public static final ProtoAdapter<NotificationSettingV2> ADAPTER = new C19182b();
    private static final long serialVersionUID = 0;
    public final DriveNotificationSetting drive_notification_setting;
    public final MessengerNotificationSetting messenger_notification_setting;

    /* renamed from: com.bytedance.lark.pb.settings.v1.NotificationSettingV2$b */
    private static final class C19182b extends ProtoAdapter<NotificationSettingV2> {
        C19182b() {
            super(FieldEncoding.LENGTH_DELIMITED, NotificationSettingV2.class);
        }

        /* renamed from: a */
        public int encodedSize(NotificationSettingV2 notificationSettingV2) {
            int i;
            int i2 = 0;
            if (notificationSettingV2.messenger_notification_setting != null) {
                i = MessengerNotificationSetting.ADAPTER.encodedSizeWithTag(1, notificationSettingV2.messenger_notification_setting);
            } else {
                i = 0;
            }
            if (notificationSettingV2.drive_notification_setting != null) {
                i2 = DriveNotificationSetting.ADAPTER.encodedSizeWithTag(2, notificationSettingV2.drive_notification_setting);
            }
            return i + i2 + notificationSettingV2.unknownFields().size();
        }

        /* renamed from: a */
        public NotificationSettingV2 decode(ProtoReader protoReader) throws IOException {
            C19181a aVar = new C19181a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47339a = MessengerNotificationSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47340b = DriveNotificationSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NotificationSettingV2 notificationSettingV2) throws IOException {
            if (notificationSettingV2.messenger_notification_setting != null) {
                MessengerNotificationSetting.ADAPTER.encodeWithTag(protoWriter, 1, notificationSettingV2.messenger_notification_setting);
            }
            if (notificationSettingV2.drive_notification_setting != null) {
                DriveNotificationSetting.ADAPTER.encodeWithTag(protoWriter, 2, notificationSettingV2.drive_notification_setting);
            }
            protoWriter.writeBytes(notificationSettingV2.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.NotificationSettingV2$a */
    public static final class C19181a extends Message.Builder<NotificationSettingV2, C19181a> {

        /* renamed from: a */
        public MessengerNotificationSetting f47339a;

        /* renamed from: b */
        public DriveNotificationSetting f47340b;

        /* renamed from: a */
        public NotificationSettingV2 build() {
            return new NotificationSettingV2(this.f47339a, this.f47340b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19181a newBuilder() {
        C19181a aVar = new C19181a();
        aVar.f47339a = this.messenger_notification_setting;
        aVar.f47340b = this.drive_notification_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "NotificationSettingV2");
        StringBuilder sb = new StringBuilder();
        if (this.messenger_notification_setting != null) {
            sb.append(", messenger_notification_setting=");
            sb.append(this.messenger_notification_setting);
        }
        if (this.drive_notification_setting != null) {
            sb.append(", drive_notification_setting=");
            sb.append(this.drive_notification_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "NotificationSettingV2{");
        replace.append('}');
        return replace.toString();
    }

    public NotificationSettingV2(MessengerNotificationSetting messengerNotificationSetting, DriveNotificationSetting driveNotificationSetting) {
        this(messengerNotificationSetting, driveNotificationSetting, ByteString.EMPTY);
    }

    public NotificationSettingV2(MessengerNotificationSetting messengerNotificationSetting, DriveNotificationSetting driveNotificationSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messenger_notification_setting = messengerNotificationSetting;
        this.drive_notification_setting = driveNotificationSetting;
    }
}
