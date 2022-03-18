package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetAdminSettingsResponse extends Message<GetAdminSettingsResponse, C50595a> {
    public static final ProtoAdapter<GetAdminSettingsResponse> ADAPTER = new C50596b();
    public static final Boolean DEFAULT_CAN_PERSONAL_INSTALL = false;
    public static final Boolean DEFAULT_ENABLE_CHECK_SCREEN_SHARE = false;
    public static final Boolean DEFAULT_ENABLE_CUSTOM_MEETING_BACKGROUND = false;
    public static final Boolean DEFAULT_ENABLE_MEETING_BACKGROUND = false;
    public static final Boolean DEFAULT_ENABLE_RECORD = false;
    public static final Boolean DEFAULT_ENABLE_SIP = false;
    public static final Boolean DEFAULT_ENABLE_SUBTITLE = false;
    public static final Boolean DEFAULT_ENABLE_VIRTUAL_AVATAR = false;
    public static final Boolean DEFAULT_PSTN_ENABLE_INCOMING_CALL = false;
    public static final Boolean DEFAULT_PSTN_ENABLE_OUTGOING_CALL = false;
    public static final Boolean DEFAULT_PSTN_HIDE_PHONE_NUMBER = false;
    public static final Boolean DEFAULT_PSTN_JOIN_MEETING_PROMPT = false;
    public static final Boolean DEFAULT_RECORD_NEED_APPROVE = false;
    public static final Integer DEFAULT_SIP_DEFAULT_LAYOUT = 0;
    public static final Boolean DEFAULT_SIP_ENABLE_DUAL_STREAM = false;
    public static final Boolean DEFAULT_SIP_ENABLE_ENTER_LEAVE_PROMPT = false;
    public static final Boolean DEFAULT_SIP_ENABLE_FECC = false;
    public static final Boolean DEFAULT_SIP_ENABLE_IM = false;
    public static final Boolean DEFAULT_SIP_ENABLE_SHOW_NAME = false;
    public static final Boolean DEFAULT_SIP_LIVE_NEED_APPROVE = false;
    public static final Boolean DEFAULT_SIP_NEED_ENCRYPT = false;
    public static final Boolean DEFAULT_SIP_RECORD_NEED_APPROVE = false;
    public static final Integer DEFAULT_SIP_VIDEO_LOOP_INTERVAL = 0;
    private static final long serialVersionUID = 0;
    public final Boolean can_personal_install;
    public final Boolean enable_check_screen_share;
    public final Boolean enable_custom_meeting_background;
    public final Boolean enable_meeting_background;
    public final Boolean enable_record;
    public final Boolean enable_sip;
    public final Boolean enable_subtitle;
    public final Boolean enable_virtual_avatar;
    public final List<MeetingBackground> meeting_background_list;
    public final Boolean pstn_enable_incoming_call;
    public final Boolean pstn_enable_outgoing_call;
    public final Boolean pstn_hide_phone_number;
    public final List<String> pstn_incoming_call_country_default;
    public final List<PSTNPhone> pstn_incoming_call_phone_list;
    public final Boolean pstn_join_meeting_prompt;
    public final List<String> pstn_outgoing_call_country_default;
    public final List<String> pstn_outgoing_call_country_list;
    public final Boolean record_need_approve;
    public final RTCProxy rtc_proxy;
    public final Integer sip_default_layout;
    public final Boolean sip_enable_dual_stream;
    public final Boolean sip_enable_enter_leave_prompt;
    public final Boolean sip_enable_fecc;
    public final Boolean sip_enable_im;
    public final Boolean sip_enable_show_name;
    public final Boolean sip_live_need_approve;
    public final Boolean sip_need_encrypt;
    public final String sip_prompt_language;
    public final Boolean sip_record_need_approve;
    public final Integer sip_video_loop_interval;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse$b */
    private static final class C50596b extends ProtoAdapter<GetAdminSettingsResponse> {
        C50596b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAdminSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAdminSettingsResponse getAdminSettingsResponse) {
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
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25 = 0;
            if (getAdminSettingsResponse.enable_record != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getAdminSettingsResponse.enable_record);
            } else {
                i = 0;
            }
            if (getAdminSettingsResponse.enable_subtitle != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getAdminSettingsResponse.enable_subtitle);
            } else {
                i2 = 0;
            }
            int i26 = i + i2;
            if (getAdminSettingsResponse.record_need_approve != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getAdminSettingsResponse.record_need_approve);
            } else {
                i3 = 0;
            }
            int i27 = i26 + i3;
            if (getAdminSettingsResponse.pstn_enable_outgoing_call != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getAdminSettingsResponse.pstn_enable_outgoing_call);
            } else {
                i4 = 0;
            }
            int i28 = i27 + i4;
            if (getAdminSettingsResponse.pstn_hide_phone_number != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getAdminSettingsResponse.pstn_hide_phone_number);
            } else {
                i5 = 0;
            }
            int i29 = i28 + i5;
            if (getAdminSettingsResponse.pstn_enable_incoming_call != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, getAdminSettingsResponse.pstn_enable_incoming_call);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i29 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, getAdminSettingsResponse.pstn_incoming_call_country_default) + PSTNPhone.ADAPTER.asRepeated().encodedSizeWithTag(8, getAdminSettingsResponse.pstn_incoming_call_phone_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, getAdminSettingsResponse.pstn_outgoing_call_country_default) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, getAdminSettingsResponse.pstn_outgoing_call_country_list);
            if (getAdminSettingsResponse.pstn_join_meeting_prompt != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(11, getAdminSettingsResponse.pstn_join_meeting_prompt);
            } else {
                i7 = 0;
            }
            int i30 = encodedSizeWithTag + i7;
            if (getAdminSettingsResponse.sip_need_encrypt != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(12, getAdminSettingsResponse.sip_need_encrypt);
            } else {
                i8 = 0;
            }
            int i31 = i30 + i8;
            if (getAdminSettingsResponse.sip_prompt_language != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(13, getAdminSettingsResponse.sip_prompt_language);
            } else {
                i9 = 0;
            }
            int i32 = i31 + i9;
            if (getAdminSettingsResponse.sip_record_need_approve != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(14, getAdminSettingsResponse.sip_record_need_approve);
            } else {
                i10 = 0;
            }
            int i33 = i32 + i10;
            if (getAdminSettingsResponse.sip_live_need_approve != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(15, getAdminSettingsResponse.sip_live_need_approve);
            } else {
                i11 = 0;
            }
            int i34 = i33 + i11;
            if (getAdminSettingsResponse.sip_enable_dual_stream != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(16, getAdminSettingsResponse.sip_enable_dual_stream);
            } else {
                i12 = 0;
            }
            int i35 = i34 + i12;
            if (getAdminSettingsResponse.sip_enable_im != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(17, getAdminSettingsResponse.sip_enable_im);
            } else {
                i13 = 0;
            }
            int i36 = i35 + i13;
            if (getAdminSettingsResponse.sip_enable_enter_leave_prompt != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(18, getAdminSettingsResponse.sip_enable_enter_leave_prompt);
            } else {
                i14 = 0;
            }
            int i37 = i36 + i14;
            if (getAdminSettingsResponse.sip_enable_show_name != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(19, getAdminSettingsResponse.sip_enable_show_name);
            } else {
                i15 = 0;
            }
            int i38 = i37 + i15;
            if (getAdminSettingsResponse.sip_default_layout != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(20, getAdminSettingsResponse.sip_default_layout);
            } else {
                i16 = 0;
            }
            int i39 = i38 + i16;
            if (getAdminSettingsResponse.sip_video_loop_interval != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(21, getAdminSettingsResponse.sip_video_loop_interval);
            } else {
                i17 = 0;
            }
            int i40 = i39 + i17;
            if (getAdminSettingsResponse.sip_enable_fecc != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(22, getAdminSettingsResponse.sip_enable_fecc);
            } else {
                i18 = 0;
            }
            int i41 = i40 + i18;
            if (getAdminSettingsResponse.enable_meeting_background != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(23, getAdminSettingsResponse.enable_meeting_background);
            } else {
                i19 = 0;
            }
            int i42 = i41 + i19;
            if (getAdminSettingsResponse.enable_custom_meeting_background != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(24, getAdminSettingsResponse.enable_custom_meeting_background);
            } else {
                i20 = 0;
            }
            int encodedSizeWithTag2 = i42 + i20 + MeetingBackground.ADAPTER.asRepeated().encodedSizeWithTag(25, getAdminSettingsResponse.meeting_background_list);
            if (getAdminSettingsResponse.enable_virtual_avatar != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(26, getAdminSettingsResponse.enable_virtual_avatar);
            } else {
                i21 = 0;
            }
            int i43 = encodedSizeWithTag2 + i21;
            if (getAdminSettingsResponse.rtc_proxy != null) {
                i22 = RTCProxy.ADAPTER.encodedSizeWithTag(27, getAdminSettingsResponse.rtc_proxy);
            } else {
                i22 = 0;
            }
            int i44 = i43 + i22;
            if (getAdminSettingsResponse.enable_sip != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(28, getAdminSettingsResponse.enable_sip);
            } else {
                i23 = 0;
            }
            int i45 = i44 + i23;
            if (getAdminSettingsResponse.can_personal_install != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(29, getAdminSettingsResponse.can_personal_install);
            } else {
                i24 = 0;
            }
            int i46 = i45 + i24;
            if (getAdminSettingsResponse.enable_check_screen_share != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(30, getAdminSettingsResponse.enable_check_screen_share);
            }
            return i46 + i25 + getAdminSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAdminSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C50595a aVar = new C50595a();
            aVar.f126297a = false;
            aVar.f126298b = false;
            aVar.f126299c = false;
            aVar.f126300d = false;
            aVar.f126301e = false;
            aVar.f126302f = false;
            aVar.f126307k = false;
            aVar.f126308l = false;
            aVar.f126309m = "";
            aVar.f126310n = false;
            aVar.f126311o = false;
            aVar.f126312p = false;
            aVar.f126313q = false;
            aVar.f126314r = false;
            aVar.f126315s = false;
            aVar.f126316t = 0;
            aVar.f126317u = 0;
            aVar.f126318v = false;
            aVar.f126319w = false;
            aVar.f126320x = false;
            aVar.f126322z = false;
            aVar.f126294B = false;
            aVar.f126295C = false;
            aVar.f126296D = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126297a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126298b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126299c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126300d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126301e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126302f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126303g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f126304h.add(PSTNPhone.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f126305i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            aVar.f126306j.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            aVar.f126307k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126308l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f126309m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f126310n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f126311o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f126312p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f126313q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f126314r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f126315s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f126316t = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            aVar.f126317u = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 22:
                            aVar.f126318v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f126319w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f126320x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f126321y.add(MeetingBackground.ADAPTER.decode(protoReader));
                            break;
                        case 26:
                            aVar.f126322z = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f126293A = RTCProxy.ADAPTER.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f126294B = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            aVar.f126295C = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            aVar.f126296D = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetAdminSettingsResponse getAdminSettingsResponse) throws IOException {
            if (getAdminSettingsResponse.enable_record != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getAdminSettingsResponse.enable_record);
            }
            if (getAdminSettingsResponse.enable_subtitle != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getAdminSettingsResponse.enable_subtitle);
            }
            if (getAdminSettingsResponse.record_need_approve != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getAdminSettingsResponse.record_need_approve);
            }
            if (getAdminSettingsResponse.pstn_enable_outgoing_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getAdminSettingsResponse.pstn_enable_outgoing_call);
            }
            if (getAdminSettingsResponse.pstn_hide_phone_number != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getAdminSettingsResponse.pstn_hide_phone_number);
            }
            if (getAdminSettingsResponse.pstn_enable_incoming_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, getAdminSettingsResponse.pstn_enable_incoming_call);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, getAdminSettingsResponse.pstn_incoming_call_country_default);
            PSTNPhone.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, getAdminSettingsResponse.pstn_incoming_call_phone_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, getAdminSettingsResponse.pstn_outgoing_call_country_default);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, getAdminSettingsResponse.pstn_outgoing_call_country_list);
            if (getAdminSettingsResponse.pstn_join_meeting_prompt != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, getAdminSettingsResponse.pstn_join_meeting_prompt);
            }
            if (getAdminSettingsResponse.sip_need_encrypt != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, getAdminSettingsResponse.sip_need_encrypt);
            }
            if (getAdminSettingsResponse.sip_prompt_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, getAdminSettingsResponse.sip_prompt_language);
            }
            if (getAdminSettingsResponse.sip_record_need_approve != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, getAdminSettingsResponse.sip_record_need_approve);
            }
            if (getAdminSettingsResponse.sip_live_need_approve != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, getAdminSettingsResponse.sip_live_need_approve);
            }
            if (getAdminSettingsResponse.sip_enable_dual_stream != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, getAdminSettingsResponse.sip_enable_dual_stream);
            }
            if (getAdminSettingsResponse.sip_enable_im != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, getAdminSettingsResponse.sip_enable_im);
            }
            if (getAdminSettingsResponse.sip_enable_enter_leave_prompt != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, getAdminSettingsResponse.sip_enable_enter_leave_prompt);
            }
            if (getAdminSettingsResponse.sip_enable_show_name != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, getAdminSettingsResponse.sip_enable_show_name);
            }
            if (getAdminSettingsResponse.sip_default_layout != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, getAdminSettingsResponse.sip_default_layout);
            }
            if (getAdminSettingsResponse.sip_video_loop_interval != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, getAdminSettingsResponse.sip_video_loop_interval);
            }
            if (getAdminSettingsResponse.sip_enable_fecc != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, getAdminSettingsResponse.sip_enable_fecc);
            }
            if (getAdminSettingsResponse.enable_meeting_background != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, getAdminSettingsResponse.enable_meeting_background);
            }
            if (getAdminSettingsResponse.enable_custom_meeting_background != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, getAdminSettingsResponse.enable_custom_meeting_background);
            }
            MeetingBackground.ADAPTER.asRepeated().encodeWithTag(protoWriter, 25, getAdminSettingsResponse.meeting_background_list);
            if (getAdminSettingsResponse.enable_virtual_avatar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, getAdminSettingsResponse.enable_virtual_avatar);
            }
            if (getAdminSettingsResponse.rtc_proxy != null) {
                RTCProxy.ADAPTER.encodeWithTag(protoWriter, 27, getAdminSettingsResponse.rtc_proxy);
            }
            if (getAdminSettingsResponse.enable_sip != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, getAdminSettingsResponse.enable_sip);
            }
            if (getAdminSettingsResponse.can_personal_install != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, getAdminSettingsResponse.can_personal_install);
            }
            if (getAdminSettingsResponse.enable_check_screen_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, getAdminSettingsResponse.enable_check_screen_share);
            }
            protoWriter.writeBytes(getAdminSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse$a */
    public static final class C50595a extends Message.Builder<GetAdminSettingsResponse, C50595a> {

        /* renamed from: A */
        public RTCProxy f126293A;

        /* renamed from: B */
        public Boolean f126294B;

        /* renamed from: C */
        public Boolean f126295C;

        /* renamed from: D */
        public Boolean f126296D;

        /* renamed from: a */
        public Boolean f126297a;

        /* renamed from: b */
        public Boolean f126298b;

        /* renamed from: c */
        public Boolean f126299c;

        /* renamed from: d */
        public Boolean f126300d;

        /* renamed from: e */
        public Boolean f126301e;

        /* renamed from: f */
        public Boolean f126302f;

        /* renamed from: g */
        public List<String> f126303g = Internal.newMutableList();

        /* renamed from: h */
        public List<PSTNPhone> f126304h = Internal.newMutableList();

        /* renamed from: i */
        public List<String> f126305i = Internal.newMutableList();

        /* renamed from: j */
        public List<String> f126306j = Internal.newMutableList();

        /* renamed from: k */
        public Boolean f126307k;

        /* renamed from: l */
        public Boolean f126308l;

        /* renamed from: m */
        public String f126309m;

        /* renamed from: n */
        public Boolean f126310n;

        /* renamed from: o */
        public Boolean f126311o;

        /* renamed from: p */
        public Boolean f126312p;

        /* renamed from: q */
        public Boolean f126313q;

        /* renamed from: r */
        public Boolean f126314r;

        /* renamed from: s */
        public Boolean f126315s;

        /* renamed from: t */
        public Integer f126316t;

        /* renamed from: u */
        public Integer f126317u;

        /* renamed from: v */
        public Boolean f126318v;

        /* renamed from: w */
        public Boolean f126319w;

        /* renamed from: x */
        public Boolean f126320x;

        /* renamed from: y */
        public List<MeetingBackground> f126321y = Internal.newMutableList();

        /* renamed from: z */
        public Boolean f126322z;

        /* renamed from: a */
        public GetAdminSettingsResponse build() {
            return new GetAdminSettingsResponse(this.f126297a, this.f126298b, this.f126299c, this.f126300d, this.f126301e, this.f126302f, this.f126303g, this.f126304h, this.f126305i, this.f126306j, this.f126307k, this.f126308l, this.f126309m, this.f126310n, this.f126311o, this.f126312p, this.f126313q, this.f126314r, this.f126315s, this.f126316t, this.f126317u, this.f126318v, this.f126319w, this.f126320x, this.f126321y, this.f126322z, this.f126293A, this.f126294B, this.f126295C, this.f126296D, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50595a newBuilder() {
        C50595a aVar = new C50595a();
        aVar.f126297a = this.enable_record;
        aVar.f126298b = this.enable_subtitle;
        aVar.f126299c = this.record_need_approve;
        aVar.f126300d = this.pstn_enable_outgoing_call;
        aVar.f126301e = this.pstn_hide_phone_number;
        aVar.f126302f = this.pstn_enable_incoming_call;
        aVar.f126303g = Internal.copyOf("pstn_incoming_call_country_default", this.pstn_incoming_call_country_default);
        aVar.f126304h = Internal.copyOf("pstn_incoming_call_phone_list", this.pstn_incoming_call_phone_list);
        aVar.f126305i = Internal.copyOf("pstn_outgoing_call_country_default", this.pstn_outgoing_call_country_default);
        aVar.f126306j = Internal.copyOf("pstn_outgoing_call_country_list", this.pstn_outgoing_call_country_list);
        aVar.f126307k = this.pstn_join_meeting_prompt;
        aVar.f126308l = this.sip_need_encrypt;
        aVar.f126309m = this.sip_prompt_language;
        aVar.f126310n = this.sip_record_need_approve;
        aVar.f126311o = this.sip_live_need_approve;
        aVar.f126312p = this.sip_enable_dual_stream;
        aVar.f126313q = this.sip_enable_im;
        aVar.f126314r = this.sip_enable_enter_leave_prompt;
        aVar.f126315s = this.sip_enable_show_name;
        aVar.f126316t = this.sip_default_layout;
        aVar.f126317u = this.sip_video_loop_interval;
        aVar.f126318v = this.sip_enable_fecc;
        aVar.f126319w = this.enable_meeting_background;
        aVar.f126320x = this.enable_custom_meeting_background;
        aVar.f126321y = Internal.copyOf("meeting_background_list", this.meeting_background_list);
        aVar.f126322z = this.enable_virtual_avatar;
        aVar.f126293A = this.rtc_proxy;
        aVar.f126294B = this.enable_sip;
        aVar.f126295C = this.can_personal_install;
        aVar.f126296D = this.enable_check_screen_share;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAdminSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.enable_record != null) {
            sb.append(", enable_record=");
            sb.append(this.enable_record);
        }
        if (this.enable_subtitle != null) {
            sb.append(", enable_subtitle=");
            sb.append(this.enable_subtitle);
        }
        if (this.record_need_approve != null) {
            sb.append(", record_need_approve=");
            sb.append(this.record_need_approve);
        }
        if (this.pstn_enable_outgoing_call != null) {
            sb.append(", pstn_enable_outgoing_call=");
            sb.append(this.pstn_enable_outgoing_call);
        }
        if (this.pstn_hide_phone_number != null) {
            sb.append(", pstn_hide_phone_number=");
            sb.append(this.pstn_hide_phone_number);
        }
        if (this.pstn_enable_incoming_call != null) {
            sb.append(", pstn_enable_incoming_call=");
            sb.append(this.pstn_enable_incoming_call);
        }
        if (!this.pstn_incoming_call_country_default.isEmpty()) {
            sb.append(", pstn_incoming_call_country_default=");
            sb.append(this.pstn_incoming_call_country_default);
        }
        if (!this.pstn_incoming_call_phone_list.isEmpty()) {
            sb.append(", pstn_incoming_call_phone_list=");
            sb.append(this.pstn_incoming_call_phone_list);
        }
        if (!this.pstn_outgoing_call_country_default.isEmpty()) {
            sb.append(", pstn_outgoing_call_country_default=");
            sb.append(this.pstn_outgoing_call_country_default);
        }
        if (!this.pstn_outgoing_call_country_list.isEmpty()) {
            sb.append(", pstn_outgoing_call_country_list=");
            sb.append(this.pstn_outgoing_call_country_list);
        }
        if (this.pstn_join_meeting_prompt != null) {
            sb.append(", pstn_join_meeting_prompt=");
            sb.append(this.pstn_join_meeting_prompt);
        }
        if (this.sip_need_encrypt != null) {
            sb.append(", sip_need_encrypt=");
            sb.append(this.sip_need_encrypt);
        }
        if (this.sip_prompt_language != null) {
            sb.append(", sip_prompt_language=");
            sb.append(this.sip_prompt_language);
        }
        if (this.sip_record_need_approve != null) {
            sb.append(", sip_record_need_approve=");
            sb.append(this.sip_record_need_approve);
        }
        if (this.sip_live_need_approve != null) {
            sb.append(", sip_live_need_approve=");
            sb.append(this.sip_live_need_approve);
        }
        if (this.sip_enable_dual_stream != null) {
            sb.append(", sip_enable_dual_stream=");
            sb.append(this.sip_enable_dual_stream);
        }
        if (this.sip_enable_im != null) {
            sb.append(", sip_enable_im=");
            sb.append(this.sip_enable_im);
        }
        if (this.sip_enable_enter_leave_prompt != null) {
            sb.append(", sip_enable_enter_leave_prompt=");
            sb.append(this.sip_enable_enter_leave_prompt);
        }
        if (this.sip_enable_show_name != null) {
            sb.append(", sip_enable_show_name=");
            sb.append(this.sip_enable_show_name);
        }
        if (this.sip_default_layout != null) {
            sb.append(", sip_default_layout=");
            sb.append(this.sip_default_layout);
        }
        if (this.sip_video_loop_interval != null) {
            sb.append(", sip_video_loop_interval=");
            sb.append(this.sip_video_loop_interval);
        }
        if (this.sip_enable_fecc != null) {
            sb.append(", sip_enable_fecc=");
            sb.append(this.sip_enable_fecc);
        }
        if (this.enable_meeting_background != null) {
            sb.append(", enable_meeting_background=");
            sb.append(this.enable_meeting_background);
        }
        if (this.enable_custom_meeting_background != null) {
            sb.append(", enable_custom_meeting_background=");
            sb.append(this.enable_custom_meeting_background);
        }
        if (!this.meeting_background_list.isEmpty()) {
            sb.append(", meeting_background_list=");
            sb.append(this.meeting_background_list);
        }
        if (this.enable_virtual_avatar != null) {
            sb.append(", enable_virtual_avatar=");
            sb.append(this.enable_virtual_avatar);
        }
        if (this.rtc_proxy != null) {
            sb.append(", rtc_proxy=");
            sb.append(this.rtc_proxy);
        }
        if (this.enable_sip != null) {
            sb.append(", enable_sip=");
            sb.append(this.enable_sip);
        }
        if (this.can_personal_install != null) {
            sb.append(", can_personal_install=");
            sb.append(this.can_personal_install);
        }
        if (this.enable_check_screen_share != null) {
            sb.append(", enable_check_screen_share=");
            sb.append(this.enable_check_screen_share);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAdminSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAdminSettingsResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<String> list, List<PSTNPhone> list2, List<String> list3, List<String> list4, Boolean bool7, Boolean bool8, String str, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num, Integer num2, Boolean bool15, Boolean bool16, Boolean bool17, List<MeetingBackground> list5, Boolean bool18, RTCProxy rTCProxy, Boolean bool19, Boolean bool20, Boolean bool21) {
        this(bool, bool2, bool3, bool4, bool5, bool6, list, list2, list3, list4, bool7, bool8, str, bool9, bool10, bool11, bool12, bool13, bool14, num, num2, bool15, bool16, bool17, list5, bool18, rTCProxy, bool19, bool20, bool21, ByteString.EMPTY);
    }

    public GetAdminSettingsResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<String> list, List<PSTNPhone> list2, List<String> list3, List<String> list4, Boolean bool7, Boolean bool8, String str, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num, Integer num2, Boolean bool15, Boolean bool16, Boolean bool17, List<MeetingBackground> list5, Boolean bool18, RTCProxy rTCProxy, Boolean bool19, Boolean bool20, Boolean bool21, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_record = bool;
        this.enable_subtitle = bool2;
        this.record_need_approve = bool3;
        this.pstn_enable_outgoing_call = bool4;
        this.pstn_hide_phone_number = bool5;
        this.pstn_enable_incoming_call = bool6;
        this.pstn_incoming_call_country_default = Internal.immutableCopyOf("pstn_incoming_call_country_default", list);
        this.pstn_incoming_call_phone_list = Internal.immutableCopyOf("pstn_incoming_call_phone_list", list2);
        this.pstn_outgoing_call_country_default = Internal.immutableCopyOf("pstn_outgoing_call_country_default", list3);
        this.pstn_outgoing_call_country_list = Internal.immutableCopyOf("pstn_outgoing_call_country_list", list4);
        this.pstn_join_meeting_prompt = bool7;
        this.sip_need_encrypt = bool8;
        this.sip_prompt_language = str;
        this.sip_record_need_approve = bool9;
        this.sip_live_need_approve = bool10;
        this.sip_enable_dual_stream = bool11;
        this.sip_enable_im = bool12;
        this.sip_enable_enter_leave_prompt = bool13;
        this.sip_enable_show_name = bool14;
        this.sip_default_layout = num;
        this.sip_video_loop_interval = num2;
        this.sip_enable_fecc = bool15;
        this.enable_meeting_background = bool16;
        this.enable_custom_meeting_background = bool17;
        this.meeting_background_list = Internal.immutableCopyOf("meeting_background_list", list5);
        this.enable_virtual_avatar = bool18;
        this.rtc_proxy = rTCProxy;
        this.enable_sip = bool19;
        this.can_personal_install = bool20;
        this.enable_check_screen_share = bool21;
    }
}
