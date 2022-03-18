package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserSettingResponse extends Message<GetUserSettingResponse, C19169a> {
    public static final ProtoAdapter<GetUserSettingResponse> ADAPTER = new C19170b();
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

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSettingResponse$b */
    private static final class C19170b extends ProtoAdapter<GetUserSettingResponse> {
        C19170b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserSettingResponse getUserSettingResponse) {
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
            if (getUserSettingResponse.auto_update_work_status != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getUserSettingResponse.auto_update_work_status);
            } else {
                i = 0;
            }
            if (getUserSettingResponse.badge_style != null) {
                i2 = BadgeStyle.ADAPTER.encodedSizeWithTag(2, getUserSettingResponse.badge_style);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (getUserSettingResponse.notification_setting != null) {
                i3 = NotificationSetting.ADAPTER.encodedSizeWithTag(3, getUserSettingResponse.notification_setting);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (getUserSettingResponse.time_format != null) {
                i4 = TimeFormatSetting.ADAPTER.encodedSizeWithTag(4, getUserSettingResponse.time_format);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (getUserSettingResponse.auto_audio_to_text != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getUserSettingResponse.auto_audio_to_text);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (getUserSettingResponse.do_not_disturb_end_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, getUserSettingResponse.do_not_disturb_end_time);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (getUserSettingResponse.sms_phone_urgent_setting != null) {
                i7 = SmsPhoneUrgentSetting.ADAPTER.encodedSizeWithTag(7, getUserSettingResponse.sms_phone_urgent_setting);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (getUserSettingResponse.feed_setting != null) {
                i8 = FeedSetting.ADAPTER.encodedSizeWithTag(8, getUserSettingResponse.feed_setting);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (getUserSettingResponse.notification_setting_v2 != null) {
                i9 = NotificationSettingV2.ADAPTER.encodedSizeWithTag(9, getUserSettingResponse.notification_setting_v2);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (getUserSettingResponse.message_notifications_off_during_calls != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, getUserSettingResponse.message_notifications_off_during_calls);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (getUserSettingResponse.navigation_show_mute_badge != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, getUserSettingResponse.navigation_show_mute_badge);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (getUserSettingResponse.update_time != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(20, getUserSettingResponse.update_time);
            }
            return i22 + i12 + getUserSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserSettingResponse decode(ProtoReader protoReader) throws IOException {
            C19169a aVar = new C19169a();
            aVar.f47306a = true;
            aVar.f47307b = BadgeStyle.WEAK_REMIND;
            aVar.f47310e = false;
            aVar.f47311f = 0L;
            aVar.f47315j = false;
            aVar.f47316k = false;
            aVar.f47317l = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 20) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47306a = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f47307b = BadgeStyle.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47308c = NotificationSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f47309d = TimeFormatSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f47310e = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f47311f = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f47312g = SmsPhoneUrgentSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f47313h = FeedSetting.ADAPTER.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f47314i = NotificationSettingV2.ADAPTER.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f47315j = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f47316k = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f47317l = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserSettingResponse getUserSettingResponse) throws IOException {
            if (getUserSettingResponse.auto_update_work_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getUserSettingResponse.auto_update_work_status);
            }
            if (getUserSettingResponse.badge_style != null) {
                BadgeStyle.ADAPTER.encodeWithTag(protoWriter, 2, getUserSettingResponse.badge_style);
            }
            if (getUserSettingResponse.notification_setting != null) {
                NotificationSetting.ADAPTER.encodeWithTag(protoWriter, 3, getUserSettingResponse.notification_setting);
            }
            if (getUserSettingResponse.time_format != null) {
                TimeFormatSetting.ADAPTER.encodeWithTag(protoWriter, 4, getUserSettingResponse.time_format);
            }
            if (getUserSettingResponse.auto_audio_to_text != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getUserSettingResponse.auto_audio_to_text);
            }
            if (getUserSettingResponse.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, getUserSettingResponse.do_not_disturb_end_time);
            }
            if (getUserSettingResponse.sms_phone_urgent_setting != null) {
                SmsPhoneUrgentSetting.ADAPTER.encodeWithTag(protoWriter, 7, getUserSettingResponse.sms_phone_urgent_setting);
            }
            if (getUserSettingResponse.feed_setting != null) {
                FeedSetting.ADAPTER.encodeWithTag(protoWriter, 8, getUserSettingResponse.feed_setting);
            }
            if (getUserSettingResponse.notification_setting_v2 != null) {
                NotificationSettingV2.ADAPTER.encodeWithTag(protoWriter, 9, getUserSettingResponse.notification_setting_v2);
            }
            if (getUserSettingResponse.message_notifications_off_during_calls != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, getUserSettingResponse.message_notifications_off_during_calls);
            }
            if (getUserSettingResponse.navigation_show_mute_badge != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, getUserSettingResponse.navigation_show_mute_badge);
            }
            if (getUserSettingResponse.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, getUserSettingResponse.update_time);
            }
            protoWriter.writeBytes(getUserSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSettingResponse$a */
    public static final class C19169a extends Message.Builder<GetUserSettingResponse, C19169a> {

        /* renamed from: a */
        public Boolean f47306a;

        /* renamed from: b */
        public BadgeStyle f47307b;

        /* renamed from: c */
        public NotificationSetting f47308c;

        /* renamed from: d */
        public TimeFormatSetting f47309d;

        /* renamed from: e */
        public Boolean f47310e;

        /* renamed from: f */
        public Long f47311f;

        /* renamed from: g */
        public SmsPhoneUrgentSetting f47312g;

        /* renamed from: h */
        public FeedSetting f47313h;

        /* renamed from: i */
        public NotificationSettingV2 f47314i;

        /* renamed from: j */
        public Boolean f47315j;

        /* renamed from: k */
        public Boolean f47316k;

        /* renamed from: l */
        public Long f47317l;

        /* renamed from: a */
        public GetUserSettingResponse build() {
            return new GetUserSettingResponse(this.f47306a, this.f47307b, this.f47308c, this.f47309d, this.f47310e, this.f47311f, this.f47312g, this.f47313h, this.f47314i, this.f47315j, this.f47316k, this.f47317l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19169a newBuilder() {
        C19169a aVar = new C19169a();
        aVar.f47306a = this.auto_update_work_status;
        aVar.f47307b = this.badge_style;
        aVar.f47308c = this.notification_setting;
        aVar.f47309d = this.time_format;
        aVar.f47310e = this.auto_audio_to_text;
        aVar.f47311f = this.do_not_disturb_end_time;
        aVar.f47312g = this.sms_phone_urgent_setting;
        aVar.f47313h = this.feed_setting;
        aVar.f47314i = this.notification_setting_v2;
        aVar.f47315j = this.message_notifications_off_during_calls;
        aVar.f47316k = this.navigation_show_mute_badge;
        aVar.f47317l = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetUserSettingResponse");
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
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserSettingResponse(Boolean bool, BadgeStyle badgeStyle, NotificationSetting notificationSetting, TimeFormatSetting timeFormatSetting, Boolean bool2, Long l, SmsPhoneUrgentSetting smsPhoneUrgentSetting, FeedSetting feedSetting, NotificationSettingV2 notificationSettingV2, Boolean bool3, Boolean bool4, Long l2) {
        this(bool, badgeStyle, notificationSetting, timeFormatSetting, bool2, l, smsPhoneUrgentSetting, feedSetting, notificationSettingV2, bool3, bool4, l2, ByteString.EMPTY);
    }

    public GetUserSettingResponse(Boolean bool, BadgeStyle badgeStyle, NotificationSetting notificationSetting, TimeFormatSetting timeFormatSetting, Boolean bool2, Long l, SmsPhoneUrgentSetting smsPhoneUrgentSetting, FeedSetting feedSetting, NotificationSettingV2 notificationSettingV2, Boolean bool3, Boolean bool4, Long l2, ByteString byteString) {
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
        this.update_time = l2;
    }
}
