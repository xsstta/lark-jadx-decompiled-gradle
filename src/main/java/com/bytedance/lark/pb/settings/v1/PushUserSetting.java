package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushUserSetting extends Message<PushUserSetting, C19193a> {
    public static final ProtoAdapter<PushUserSetting> ADAPTER = new C19194b();
    public static final Boolean DEFAULT_AUTO_AUDIO_TO_TEXT = false;
    public static final Boolean DEFAULT_AUTO_UPDATE_WORK_STATUS = true;
    public static final BadgeStyle DEFAULT_BADGE_STYLE = BadgeStyle.WEAK_REMIND;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_MESSAGE_NOTIFICATIONS_OFF_DURING_CALLS = false;
    public static final Boolean DEFAULT_NAVIGATION_SHOW_MUTE_BADGE = false;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean auto_audio_to_text;
    public final Boolean auto_update_work_status;
    public final BadgeStyle badge_style;
    public final Long do_not_disturb_end_time;
    public final FeedSetting feed_setting;
    public final Boolean message_notifications_off_during_calls;
    public final Boolean navigation_show_mute_badge;
    public final NotificationSetting notification_setting;
    public final NotificationSettingV2 notification_setting_v2;
    public final SmsPhoneUrgentSetting sms_phone_urgent_setting;
    public final TimeFormatSetting time_format;
    public final Long update_time;

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushUserSetting$b */
    private static final class C19194b extends ProtoAdapter<PushUserSetting> {
        C19194b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUserSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUserSetting pushUserSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 0;
            if (pushUserSetting.badge_style != null) {
                i = BadgeStyle.ADAPTER.encodedSizeWithTag(1, pushUserSetting.badge_style);
            } else {
                i = 0;
            }
            if (pushUserSetting.notification_setting != null) {
                i2 = NotificationSetting.ADAPTER.encodedSizeWithTag(2, pushUserSetting.notification_setting);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (pushUserSetting.time_format != null) {
                i3 = TimeFormatSetting.ADAPTER.encodedSizeWithTag(3, pushUserSetting.time_format);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (pushUserSetting.auto_audio_to_text != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pushUserSetting.auto_audio_to_text);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (pushUserSetting.do_not_disturb_end_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, pushUserSetting.do_not_disturb_end_time);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (pushUserSetting.sms_phone_urgent_setting != null) {
                i6 = SmsPhoneUrgentSetting.ADAPTER.encodedSizeWithTag(6, pushUserSetting.sms_phone_urgent_setting);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (pushUserSetting.feed_setting != null) {
                i7 = FeedSetting.ADAPTER.encodedSizeWithTag(7, pushUserSetting.feed_setting);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (pushUserSetting.notification_setting_v2 != null) {
                i8 = NotificationSettingV2.ADAPTER.encodedSizeWithTag(8, pushUserSetting.notification_setting_v2);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (pushUserSetting.message_notifications_off_during_calls != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, pushUserSetting.message_notifications_off_during_calls);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (pushUserSetting.auto_update_work_status != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, pushUserSetting.auto_update_work_status);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (pushUserSetting.navigation_show_mute_badge != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, pushUserSetting.navigation_show_mute_badge);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (pushUserSetting.update_time != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(20, pushUserSetting.update_time);
            }
            return i22 + i12 + pushUserSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PushUserSetting decode(ProtoReader protoReader) throws IOException {
            C19193a aVar = new C19193a();
            aVar.f47350a = BadgeStyle.WEAK_REMIND;
            aVar.f47353d = false;
            aVar.f47354e = 0L;
            aVar.f47358i = false;
            aVar.f47359j = true;
            aVar.f47360k = false;
            aVar.f47361l = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 20) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f47350a = BadgeStyle.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f47351b = NotificationSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f47352c = TimeFormatSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f47353d = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f47354e = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f47355f = SmsPhoneUrgentSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f47356g = FeedSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f47357h = NotificationSettingV2.ADAPTER.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f47358i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f47359j = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f47360k = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f47361l = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUserSetting pushUserSetting) throws IOException {
            if (pushUserSetting.badge_style != null) {
                BadgeStyle.ADAPTER.encodeWithTag(protoWriter, 1, pushUserSetting.badge_style);
            }
            if (pushUserSetting.notification_setting != null) {
                NotificationSetting.ADAPTER.encodeWithTag(protoWriter, 2, pushUserSetting.notification_setting);
            }
            if (pushUserSetting.time_format != null) {
                TimeFormatSetting.ADAPTER.encodeWithTag(protoWriter, 3, pushUserSetting.time_format);
            }
            if (pushUserSetting.auto_audio_to_text != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pushUserSetting.auto_audio_to_text);
            }
            if (pushUserSetting.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, pushUserSetting.do_not_disturb_end_time);
            }
            if (pushUserSetting.sms_phone_urgent_setting != null) {
                SmsPhoneUrgentSetting.ADAPTER.encodeWithTag(protoWriter, 6, pushUserSetting.sms_phone_urgent_setting);
            }
            if (pushUserSetting.feed_setting != null) {
                FeedSetting.ADAPTER.encodeWithTag(protoWriter, 7, pushUserSetting.feed_setting);
            }
            if (pushUserSetting.notification_setting_v2 != null) {
                NotificationSettingV2.ADAPTER.encodeWithTag(protoWriter, 8, pushUserSetting.notification_setting_v2);
            }
            if (pushUserSetting.message_notifications_off_during_calls != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, pushUserSetting.message_notifications_off_during_calls);
            }
            if (pushUserSetting.auto_update_work_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, pushUserSetting.auto_update_work_status);
            }
            if (pushUserSetting.navigation_show_mute_badge != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, pushUserSetting.navigation_show_mute_badge);
            }
            if (pushUserSetting.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, pushUserSetting.update_time);
            }
            protoWriter.writeBytes(pushUserSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushUserSetting$a */
    public static final class C19193a extends Message.Builder<PushUserSetting, C19193a> {

        /* renamed from: a */
        public BadgeStyle f47350a;

        /* renamed from: b */
        public NotificationSetting f47351b;

        /* renamed from: c */
        public TimeFormatSetting f47352c;

        /* renamed from: d */
        public Boolean f47353d;

        /* renamed from: e */
        public Long f47354e;

        /* renamed from: f */
        public SmsPhoneUrgentSetting f47355f;

        /* renamed from: g */
        public FeedSetting f47356g;

        /* renamed from: h */
        public NotificationSettingV2 f47357h;

        /* renamed from: i */
        public Boolean f47358i;

        /* renamed from: j */
        public Boolean f47359j;

        /* renamed from: k */
        public Boolean f47360k;

        /* renamed from: l */
        public Long f47361l;

        /* renamed from: a */
        public PushUserSetting build() {
            return new PushUserSetting(this.f47350a, this.f47351b, this.f47352c, this.f47353d, this.f47354e, this.f47355f, this.f47356g, this.f47357h, this.f47358i, this.f47359j, this.f47360k, this.f47361l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19193a newBuilder() {
        C19193a aVar = new C19193a();
        aVar.f47350a = this.badge_style;
        aVar.f47351b = this.notification_setting;
        aVar.f47352c = this.time_format;
        aVar.f47353d = this.auto_audio_to_text;
        aVar.f47354e = this.do_not_disturb_end_time;
        aVar.f47355f = this.sms_phone_urgent_setting;
        aVar.f47356g = this.feed_setting;
        aVar.f47357h = this.notification_setting_v2;
        aVar.f47358i = this.message_notifications_off_during_calls;
        aVar.f47359j = this.auto_update_work_status;
        aVar.f47360k = this.navigation_show_mute_badge;
        aVar.f47361l = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "PushUserSetting");
        StringBuilder sb = new StringBuilder();
        if (this.badge_style != null) {
            sb.append(", badge_style=");
            sb.append(this.badge_style);
        }
        if (this.notification_setting != null) {
            sb.append(", notification_setting=");
            sb.append(this.notification_setting);
        }
        if (this.time_format != null) {
            sb.append(", time_format=");
            sb.append(this.time_format);
        }
        if (this.auto_audio_to_text != null) {
            sb.append(", auto_audio_to_text=");
            sb.append(this.auto_audio_to_text);
        }
        if (this.do_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.do_not_disturb_end_time);
        }
        if (this.sms_phone_urgent_setting != null) {
            sb.append(", sms_phone_urgent_setting=");
            sb.append(this.sms_phone_urgent_setting);
        }
        if (this.feed_setting != null) {
            sb.append(", feed_setting=");
            sb.append(this.feed_setting);
        }
        if (this.notification_setting_v2 != null) {
            sb.append(", notification_setting_v2=");
            sb.append(this.notification_setting_v2);
        }
        if (this.message_notifications_off_during_calls != null) {
            sb.append(", message_notifications_off_during_calls=");
            sb.append(this.message_notifications_off_during_calls);
        }
        if (this.auto_update_work_status != null) {
            sb.append(", auto_update_work_status=");
            sb.append(this.auto_update_work_status);
        }
        if (this.navigation_show_mute_badge != null) {
            sb.append(", navigation_show_mute_badge=");
            sb.append(this.navigation_show_mute_badge);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUserSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PushUserSetting(BadgeStyle badgeStyle, NotificationSetting notificationSetting, TimeFormatSetting timeFormatSetting, Boolean bool, Long l, SmsPhoneUrgentSetting smsPhoneUrgentSetting, FeedSetting feedSetting, NotificationSettingV2 notificationSettingV2, Boolean bool2, Boolean bool3, Boolean bool4, Long l2) {
        this(badgeStyle, notificationSetting, timeFormatSetting, bool, l, smsPhoneUrgentSetting, feedSetting, notificationSettingV2, bool2, bool3, bool4, l2, ByteString.EMPTY);
    }

    public PushUserSetting(BadgeStyle badgeStyle, NotificationSetting notificationSetting, TimeFormatSetting timeFormatSetting, Boolean bool, Long l, SmsPhoneUrgentSetting smsPhoneUrgentSetting, FeedSetting feedSetting, NotificationSettingV2 notificationSettingV2, Boolean bool2, Boolean bool3, Boolean bool4, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.badge_style = badgeStyle;
        this.notification_setting = notificationSetting;
        this.time_format = timeFormatSetting;
        this.auto_audio_to_text = bool;
        this.do_not_disturb_end_time = l;
        this.sms_phone_urgent_setting = smsPhoneUrgentSetting;
        this.feed_setting = feedSetting;
        this.notification_setting_v2 = notificationSettingV2;
        this.message_notifications_off_during_calls = bool2;
        this.auto_update_work_status = bool3;
        this.navigation_show_mute_badge = bool4;
        this.update_time = l2;
    }
}
