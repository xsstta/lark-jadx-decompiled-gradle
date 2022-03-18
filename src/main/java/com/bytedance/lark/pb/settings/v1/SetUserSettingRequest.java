package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetUserSettingRequest extends Message<SetUserSettingRequest, C19209a> {
    public static final ProtoAdapter<SetUserSettingRequest> ADAPTER = new C19210b();
    public static final Boolean DEFAULT_AUTO_AUDIO_TO_TEXT = false;
    public static final Boolean DEFAULT_AUTO_UPDATE_WORK_STATUS = true;
    public static final BadgeStyle DEFAULT_BADGE_STYLE = BadgeStyle.WEAK_REMIND;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_MESSAGE_NOTIFICATIONS_OFF_DURING_CALLS = false;
    public static final Boolean DEFAULT_NAVIGATION_SHOW_MUTE_BADGE = false;
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

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetUserSettingRequest$b */
    private static final class C19210b extends ProtoAdapter<SetUserSettingRequest> {
        C19210b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserSettingRequest setUserSettingRequest) {
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
            int i11 = 0;
            if (setUserSettingRequest.auto_update_work_status != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, setUserSettingRequest.auto_update_work_status);
            } else {
                i = 0;
            }
            if (setUserSettingRequest.badge_style != null) {
                i2 = BadgeStyle.ADAPTER.encodedSizeWithTag(2, setUserSettingRequest.badge_style);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (setUserSettingRequest.notification_setting != null) {
                i3 = NotificationSetting.ADAPTER.encodedSizeWithTag(3, setUserSettingRequest.notification_setting);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (setUserSettingRequest.time_format != null) {
                i4 = TimeFormatSetting.ADAPTER.encodedSizeWithTag(4, setUserSettingRequest.time_format);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (setUserSettingRequest.auto_audio_to_text != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, setUserSettingRequest.auto_audio_to_text);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (setUserSettingRequest.do_not_disturb_end_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, setUserSettingRequest.do_not_disturb_end_time);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (setUserSettingRequest.sms_phone_urgent_setting != null) {
                i7 = SmsPhoneUrgentSetting.ADAPTER.encodedSizeWithTag(7, setUserSettingRequest.sms_phone_urgent_setting);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (setUserSettingRequest.feed_setting != null) {
                i8 = FeedSetting.ADAPTER.encodedSizeWithTag(8, setUserSettingRequest.feed_setting);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (setUserSettingRequest.notification_setting_v2 != null) {
                i9 = NotificationSettingV2.ADAPTER.encodedSizeWithTag(9, setUserSettingRequest.notification_setting_v2);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (setUserSettingRequest.message_notifications_off_during_calls != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, setUserSettingRequest.message_notifications_off_during_calls);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (setUserSettingRequest.navigation_show_mute_badge != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, setUserSettingRequest.navigation_show_mute_badge);
            }
            return i20 + i11 + setUserSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19209a aVar = new C19209a();
            aVar.f47373a = true;
            aVar.f47374b = BadgeStyle.WEAK_REMIND;
            aVar.f47377e = false;
            aVar.f47378f = 0L;
            aVar.f47382j = false;
            aVar.f47383k = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47373a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f47374b = BadgeStyle.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47375c = NotificationSetting.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47376d = TimeFormatSetting.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47377e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47378f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47379g = SmsPhoneUrgentSetting.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47380h = FeedSetting.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47381i = NotificationSettingV2.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47382j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47383k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetUserSettingRequest setUserSettingRequest) throws IOException {
            if (setUserSettingRequest.auto_update_work_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setUserSettingRequest.auto_update_work_status);
            }
            if (setUserSettingRequest.badge_style != null) {
                BadgeStyle.ADAPTER.encodeWithTag(protoWriter, 2, setUserSettingRequest.badge_style);
            }
            if (setUserSettingRequest.notification_setting != null) {
                NotificationSetting.ADAPTER.encodeWithTag(protoWriter, 3, setUserSettingRequest.notification_setting);
            }
            if (setUserSettingRequest.time_format != null) {
                TimeFormatSetting.ADAPTER.encodeWithTag(protoWriter, 4, setUserSettingRequest.time_format);
            }
            if (setUserSettingRequest.auto_audio_to_text != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, setUserSettingRequest.auto_audio_to_text);
            }
            if (setUserSettingRequest.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, setUserSettingRequest.do_not_disturb_end_time);
            }
            if (setUserSettingRequest.sms_phone_urgent_setting != null) {
                SmsPhoneUrgentSetting.ADAPTER.encodeWithTag(protoWriter, 7, setUserSettingRequest.sms_phone_urgent_setting);
            }
            if (setUserSettingRequest.feed_setting != null) {
                FeedSetting.ADAPTER.encodeWithTag(protoWriter, 8, setUserSettingRequest.feed_setting);
            }
            if (setUserSettingRequest.notification_setting_v2 != null) {
                NotificationSettingV2.ADAPTER.encodeWithTag(protoWriter, 9, setUserSettingRequest.notification_setting_v2);
            }
            if (setUserSettingRequest.message_notifications_off_during_calls != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, setUserSettingRequest.message_notifications_off_during_calls);
            }
            if (setUserSettingRequest.navigation_show_mute_badge != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, setUserSettingRequest.navigation_show_mute_badge);
            }
            protoWriter.writeBytes(setUserSettingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19209a newBuilder() {
        C19209a aVar = new C19209a();
        aVar.f47373a = this.auto_update_work_status;
        aVar.f47374b = this.badge_style;
        aVar.f47375c = this.notification_setting;
        aVar.f47376d = this.time_format;
        aVar.f47377e = this.auto_audio_to_text;
        aVar.f47378f = this.do_not_disturb_end_time;
        aVar.f47379g = this.sms_phone_urgent_setting;
        aVar.f47380h = this.feed_setting;
        aVar.f47381i = this.notification_setting_v2;
        aVar.f47382j = this.message_notifications_off_during_calls;
        aVar.f47383k = this.navigation_show_mute_badge;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetUserSettingRequest$a */
    public static final class C19209a extends Message.Builder<SetUserSettingRequest, C19209a> {

        /* renamed from: a */
        public Boolean f47373a;

        /* renamed from: b */
        public BadgeStyle f47374b;

        /* renamed from: c */
        public NotificationSetting f47375c;

        /* renamed from: d */
        public TimeFormatSetting f47376d;

        /* renamed from: e */
        public Boolean f47377e;

        /* renamed from: f */
        public Long f47378f;

        /* renamed from: g */
        public SmsPhoneUrgentSetting f47379g;

        /* renamed from: h */
        public FeedSetting f47380h;

        /* renamed from: i */
        public NotificationSettingV2 f47381i;

        /* renamed from: j */
        public Boolean f47382j;

        /* renamed from: k */
        public Boolean f47383k;

        /* renamed from: a */
        public SetUserSettingRequest build() {
            return new SetUserSettingRequest(this.f47373a, this.f47374b, this.f47375c, this.f47376d, this.f47377e, this.f47378f, this.f47379g, this.f47380h, this.f47381i, this.f47382j, this.f47383k, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19209a mo65586a(BadgeStyle badgeStyle) {
            this.f47374b = badgeStyle;
            return this;
        }

        /* renamed from: b */
        public C19209a mo65593b(Boolean bool) {
            this.f47377e = bool;
            return this;
        }

        /* renamed from: c */
        public C19209a mo65594c(Boolean bool) {
            this.f47382j = bool;
            return this;
        }

        /* renamed from: d */
        public C19209a mo65595d(Boolean bool) {
            this.f47383k = bool;
            return this;
        }

        /* renamed from: a */
        public C19209a mo65587a(NotificationSettingV2 notificationSettingV2) {
            this.f47381i = notificationSettingV2;
            return this;
        }

        /* renamed from: a */
        public C19209a mo65588a(SmsPhoneUrgentSetting smsPhoneUrgentSetting) {
            this.f47379g = smsPhoneUrgentSetting;
            return this;
        }

        /* renamed from: a */
        public C19209a mo65589a(TimeFormatSetting timeFormatSetting) {
            this.f47376d = timeFormatSetting;
            return this;
        }

        /* renamed from: a */
        public C19209a mo65590a(Boolean bool) {
            this.f47373a = bool;
            return this;
        }

        /* renamed from: a */
        public C19209a mo65591a(Long l) {
            this.f47378f = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SetUserSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.auto_update_work_status != null) {
            sb.append(", auto_update_work_status=");
            sb.append(this.auto_update_work_status);
        }
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
        if (this.navigation_show_mute_badge != null) {
            sb.append(", navigation_show_mute_badge=");
            sb.append(this.navigation_show_mute_badge);
        }
        StringBuilder replace = sb.replace(0, 2, "SetUserSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserSettingRequest(Boolean bool, BadgeStyle badgeStyle, NotificationSetting notificationSetting, TimeFormatSetting timeFormatSetting, Boolean bool2, Long l, SmsPhoneUrgentSetting smsPhoneUrgentSetting, FeedSetting feedSetting, NotificationSettingV2 notificationSettingV2, Boolean bool3, Boolean bool4) {
        this(bool, badgeStyle, notificationSetting, timeFormatSetting, bool2, l, smsPhoneUrgentSetting, feedSetting, notificationSettingV2, bool3, bool4, ByteString.EMPTY);
    }

    public SetUserSettingRequest(Boolean bool, BadgeStyle badgeStyle, NotificationSetting notificationSetting, TimeFormatSetting timeFormatSetting, Boolean bool2, Long l, SmsPhoneUrgentSetting smsPhoneUrgentSetting, FeedSetting feedSetting, NotificationSettingV2 notificationSettingV2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.auto_update_work_status = bool;
        this.badge_style = badgeStyle;
        this.notification_setting = notificationSetting;
        this.time_format = timeFormatSetting;
        this.auto_audio_to_text = bool2;
        this.do_not_disturb_end_time = l;
        this.sms_phone_urgent_setting = smsPhoneUrgentSetting;
        this.feed_setting = feedSetting;
        this.notification_setting_v2 = notificationSettingV2;
        this.message_notifications_off_during_calls = bool3;
        this.navigation_show_mute_badge = bool4;
    }
}
