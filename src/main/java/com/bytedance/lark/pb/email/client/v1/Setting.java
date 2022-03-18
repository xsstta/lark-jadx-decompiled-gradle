package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Setting extends Message<Setting, C16982a> {
    public static final ProtoAdapter<Setting> ADAPTER = new C16983b();
    public static final Boolean DEFAULT_ACCOUNT_REVOKE_NOTIFY_POPUP_VISIBLE = false;
    public static final Boolean DEFAULT_ADMIN_ENABLE_AUTO_TRANSFER = false;
    public static final Boolean DEFAULT_ALL_NEW_MAIL_NOTIFICATION_SWITCH = true;
    public static final Boolean DEFAULT_CLIENT_TAB_VISIBLE = true;
    public static final Boolean DEFAULT_EMAIL_RECALL = false;
    public static final Boolean DEFAULT_ENABLE_CONVERSATION_MODE = true;
    public static final Boolean DEFAULT_GRAMMAR_CHECKER_ENABLED = true;
    public static final Long DEFAULT_LAST_ONBOARDING_PROMPT_DISPLAY_TIMESTAMP = 0L;
    public static final Long DEFAULT_LAST_VISIT_IMPORTANT_LABEL_TIMESTAMP = 0L;
    public static final Long DEFAULT_LAST_VISIT_OTHER_LABEL_TIMESTAMP = 0L;
    public static final LayoutStyle DEFAULT_LAYOUT_STYLE = LayoutStyle.SPLIT;
    public static final MailOnboardStatus DEFAULT_MAIL_ONBOARD_STATUS = MailOnboardStatus.ACTIVE;
    public static final Boolean DEFAULT_MESSAGE_DISPLAY_RANK_MODE = false;
    public static final RenderState DEFAULT_MESSAGE_DISPLAY_RANK_RENDER_STATE = RenderState.STAGE_1_NO_RENDER;
    public static final Boolean DEFAULT_MOBILE_USE_PC_SIGNATURE = false;
    public static final Boolean DEFAULT_NEW_MAIL_NOTIFICATION = false;
    public static final Integer DEFAULT_NEW_MAIL_NOTIFICATION_CHANNEL = 0;
    public static final OnboardingState DEFAULT_ONBOARDING_STATE = OnboardingState.UNKNOWN;
    public static final ReplyLanguage DEFAULT_REPLY_LANGUAGE = ReplyLanguage.AUTO;
    public static final Boolean DEFAULT_SHOW_API_ONBOARDING_PAGE = false;
    public static final Boolean DEFAULT_SMART_COMPOSE_ENABLED = true;
    public static final Boolean DEFAULT_SMART_COMPOSE_PERSONALIZATION = false;
    public static final Boolean DEFAULT_SMART_INBOX_MODE = true;
    public static final Boolean DEFAULT_SMART_INBOX_VISIBLE = false;
    public static final Boolean DEFAULT_SMART_REPLY_OPEN = true;
    public static final Boolean DEFAULT_STATUS_IS_MIGRATION_DONE_PROMPT_RENDERED = false;
    public static final Boolean DEFAULT_UNDO_SEND_ENABLE = false;
    public static final Long DEFAULT_UNDO_TIME = 0L;
    public static final Boolean DEFAULT_USER_ENABLE_AUTO_TRANSFER = false;
    public static final UserType DEFAULT_USER_TYPE = UserType.LARK_SERVER;
    private static final long serialVersionUID = 0;
    public final Boolean account_revoke_notify_popup_visible;
    public final Boolean admin_enable_auto_transfer;
    public final Boolean all_new_mail_notification_switch;
    public final Boolean client_tab_visible;
    public final EmailAlias email_alias;
    public final List<EmailClientConfig> email_client_configs;
    public final Boolean email_recall;
    public final Boolean enable_conversation_mode;
    public final Boolean grammar_checker_enabled;
    public final Long last_onboarding_prompt_display_timestamp;
    public final Long last_visit_important_label_timestamp;
    public final Long last_visit_other_label_timestamp;
    public final LayoutStyle layout_style;
    public final MailOnboardStatus mail_onboard_status;
    public final Boolean message_display_rank_mode;
    public final RenderState message_display_rank_render_state;
    public final Boolean mobile_use_pc_signature;
    public final Boolean new_mail_notification;
    public final Integer new_mail_notification_channel;
    public final OnboardingState onboarding_state;
    public final Signature pc_signature;
    public final ReplyLanguage reply_language;
    public final List<MailAccount> shared_accounts;
    public final Boolean show_api_onboarding_page;
    public final Signature signature;
    public final Boolean smart_compose_enabled;
    public final Boolean smart_compose_personalization;
    public final Boolean smart_inbox_mode;
    public final Boolean smart_inbox_visible;
    public final Boolean smart_reply_open;
    public final Boolean status_is_migration_done_prompt_rendered;
    public final SmartInboxOnboarding status_smart_inbox_onboarding;
    public final StorageLimitNotify storageLimitNotify;
    public final List<String> translation_recommendation_skip_language;
    public final Boolean undo_send_enable;
    public final Long undo_time;
    public final Boolean user_enable_auto_transfer;
    public final UserType user_type;
    public final MailVacationResponder vacation_responder;

    public enum ChannelPosition implements WireEnum {
        PUSH(0),
        BOT(1);
        
        public static final ProtoAdapter<ChannelPosition> ADAPTER = ProtoAdapter.newEnumAdapter(ChannelPosition.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChannelPosition fromValue(int i) {
            if (i == 0) {
                return PUSH;
            }
            if (i != 1) {
                return null;
            }
            return BOT;
        }

        private ChannelPosition(int i) {
            this.value = i;
        }
    }

    public enum LayoutStyle implements WireEnum {
        SPLIT(0),
        NO_SPLIT(1);
        
        public static final ProtoAdapter<LayoutStyle> ADAPTER = ProtoAdapter.newEnumAdapter(LayoutStyle.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LayoutStyle fromValue(int i) {
            if (i == 0) {
                return SPLIT;
            }
            if (i != 1) {
                return null;
            }
            return NO_SPLIT;
        }

        private LayoutStyle(int i) {
            this.value = i;
        }
    }

    public enum MailOnboardStatus implements WireEnum {
        ACTIVE(0),
        SMTP_ACTIVE(1),
        FORCE_INPUT(2),
        SOFT_INPUT(3);
        
        public static final ProtoAdapter<MailOnboardStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MailOnboardStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MailOnboardStatus fromValue(int i) {
            if (i == 0) {
                return ACTIVE;
            }
            if (i == 1) {
                return SMTP_ACTIVE;
            }
            if (i == 2) {
                return FORCE_INPUT;
            }
            if (i != 3) {
                return null;
            }
            return SOFT_INPUT;
        }

        private MailOnboardStatus(int i) {
            this.value = i;
        }
    }

    public enum OnboardingState implements WireEnum {
        UNKNOWN(0),
        PHASE_1_ACCEPTED(1),
        PHASE_1_DECLINED(2),
        PHASE_2A_ACCEPTED(3),
        PHASE_2A_DECLINED(4),
        PHASE_2_ENFORCED(5);
        
        public static final ProtoAdapter<OnboardingState> ADAPTER = ProtoAdapter.newEnumAdapter(OnboardingState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OnboardingState fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PHASE_1_ACCEPTED;
            }
            if (i == 2) {
                return PHASE_1_DECLINED;
            }
            if (i == 3) {
                return PHASE_2A_ACCEPTED;
            }
            if (i == 4) {
                return PHASE_2A_DECLINED;
            }
            if (i != 5) {
                return null;
            }
            return PHASE_2_ENFORCED;
        }

        private OnboardingState(int i) {
            this.value = i;
        }
    }

    public enum RenderState implements WireEnum {
        STAGE_1_NO_RENDER(0),
        STAGE_2_NEED_RENDER(1),
        STAGE_3_RENDERED(2);
        
        public static final ProtoAdapter<RenderState> ADAPTER = ProtoAdapter.newEnumAdapter(RenderState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RenderState fromValue(int i) {
            if (i == 0) {
                return STAGE_1_NO_RENDER;
            }
            if (i == 1) {
                return STAGE_2_NEED_RENDER;
            }
            if (i != 2) {
                return null;
            }
            return STAGE_3_RENDERED;
        }

        private RenderState(int i) {
            this.value = i;
        }
    }

    public enum ReplyLanguage implements WireEnum {
        AUTO(0),
        ZH(1),
        US(2),
        FOLLOW_APP(3);
        
        public static final ProtoAdapter<ReplyLanguage> ADAPTER = ProtoAdapter.newEnumAdapter(ReplyLanguage.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ReplyLanguage fromValue(int i) {
            if (i == 0) {
                return AUTO;
            }
            if (i == 1) {
                return ZH;
            }
            if (i == 2) {
                return US;
            }
            if (i != 3) {
                return null;
            }
            return FOLLOW_APP;
        }

        private ReplyLanguage(int i) {
            this.value = i;
        }
    }

    public enum UserType implements WireEnum {
        LARK_SERVER(0),
        NEW_USER(1),
        OAUTH_CLIENT(2),
        EXCHANGE_CLIENT(3),
        LARK_SERVER_UNBIND(4),
        SERVICE_ACCOUNT_CLIENT(5),
        EXCHANGE_CLIENT_NEW_USER(6),
        GMAIL_API_CLIENT(7),
        EXCHANGE_API_CLIENT(8),
        NO_PRIMARY_ADDRESS_USER(9);
        
        public static final ProtoAdapter<UserType> ADAPTER = ProtoAdapter.newEnumAdapter(UserType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UserType fromValue(int i) {
            switch (i) {
                case 0:
                    return LARK_SERVER;
                case 1:
                    return NEW_USER;
                case 2:
                    return OAUTH_CLIENT;
                case 3:
                    return EXCHANGE_CLIENT;
                case 4:
                    return LARK_SERVER_UNBIND;
                case 5:
                    return SERVICE_ACCOUNT_CLIENT;
                case 6:
                    return EXCHANGE_CLIENT_NEW_USER;
                case 7:
                    return GMAIL_API_CLIENT;
                case 8:
                    return EXCHANGE_API_CLIENT;
                case 9:
                    return NO_PRIMARY_ADDRESS_USER;
                default:
                    return null;
            }
        }

        private UserType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Setting$a */
    public static final class C16982a extends Message.Builder<Setting, C16982a> {

        /* renamed from: A */
        public Boolean f43550A;

        /* renamed from: B */
        public Boolean f43551B;

        /* renamed from: C */
        public Long f43552C;

        /* renamed from: D */
        public List<String> f43553D = Internal.newMutableList();

        /* renamed from: E */
        public MailOnboardStatus f43554E;

        /* renamed from: F */
        public ReplyLanguage f43555F;

        /* renamed from: G */
        public StorageLimitNotify f43556G;

        /* renamed from: H */
        public Boolean f43557H;

        /* renamed from: I */
        public Boolean f43558I;

        /* renamed from: J */
        public Boolean f43559J;

        /* renamed from: K */
        public Boolean f43560K;

        /* renamed from: L */
        public Boolean f43561L;

        /* renamed from: M */
        public Integer f43562M;

        /* renamed from: a */
        public Boolean f43563a;

        /* renamed from: b */
        public Signature f43564b;

        /* renamed from: c */
        public Boolean f43565c;

        /* renamed from: d */
        public Boolean f43566d;

        /* renamed from: e */
        public List<EmailClientConfig> f43567e = Internal.newMutableList();

        /* renamed from: f */
        public UserType f43568f;

        /* renamed from: g */
        public EmailAlias f43569g;

        /* renamed from: h */
        public Boolean f43570h;

        /* renamed from: i */
        public Signature f43571i;

        /* renamed from: j */
        public OnboardingState f43572j;

        /* renamed from: k */
        public Long f43573k;

        /* renamed from: l */
        public MailVacationResponder f43574l;

        /* renamed from: m */
        public Boolean f43575m;

        /* renamed from: n */
        public Long f43576n;

        /* renamed from: o */
        public Long f43577o;

        /* renamed from: p */
        public Boolean f43578p;

        /* renamed from: q */
        public Boolean f43579q;

        /* renamed from: r */
        public LayoutStyle f43580r;

        /* renamed from: s */
        public Boolean f43581s;

        /* renamed from: t */
        public Boolean f43582t;

        /* renamed from: u */
        public List<MailAccount> f43583u = Internal.newMutableList();

        /* renamed from: v */
        public Boolean f43584v;

        /* renamed from: w */
        public Boolean f43585w;

        /* renamed from: x */
        public Boolean f43586x;

        /* renamed from: y */
        public RenderState f43587y;

        /* renamed from: z */
        public SmartInboxOnboarding f43588z;

        /* renamed from: a */
        public C16982a mo59986a(List<EmailClientConfig> list) {
            Internal.checkElementsNotNull(list);
            this.f43567e = list;
            return this;
        }

        /* renamed from: a */
        public Setting build() {
            return new Setting(this.f43563a, this.f43564b, this.f43565c, this.f43566d, this.f43567e, this.f43568f, this.f43569g, this.f43570h, this.f43571i, this.f43572j, this.f43573k, this.f43574l, this.f43575m, this.f43576n, this.f43577o, this.f43578p, this.f43579q, this.f43580r, this.f43581s, this.f43582t, this.f43583u, this.f43584v, this.f43585w, this.f43586x, this.f43587y, this.f43588z, this.f43550A, this.f43551B, this.f43552C, this.f43553D, this.f43554E, this.f43555F, this.f43556G, this.f43557H, this.f43558I, this.f43559J, this.f43560K, this.f43561L, this.f43562M, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16982a mo59975a(EmailAlias emailAlias) {
            this.f43569g = emailAlias;
            return this;
        }

        /* renamed from: b */
        public C16982a mo59988b(Signature signature) {
            this.f43571i = signature;
            return this;
        }

        /* renamed from: c */
        public C16982a mo59992c(Boolean bool) {
            this.f43566d = bool;
            return this;
        }

        /* renamed from: d */
        public C16982a mo59994d(Boolean bool) {
            this.f43570h = bool;
            return this;
        }

        /* renamed from: e */
        public C16982a mo59996e(Boolean bool) {
            this.f43575m = bool;
            return this;
        }

        /* renamed from: f */
        public C16982a mo59997f(Boolean bool) {
            this.f43578p = bool;
            return this;
        }

        /* renamed from: g */
        public C16982a mo59998g(Boolean bool) {
            this.f43581s = bool;
            return this;
        }

        /* renamed from: h */
        public C16982a mo59999h(Boolean bool) {
            this.f43582t = bool;
            return this;
        }

        /* renamed from: i */
        public C16982a mo60000i(Boolean bool) {
            this.f43550A = bool;
            return this;
        }

        /* renamed from: j */
        public C16982a mo60001j(Boolean bool) {
            this.f43551B = bool;
            return this;
        }

        /* renamed from: k */
        public C16982a mo60002k(Boolean bool) {
            this.f43559J = bool;
            return this;
        }

        /* renamed from: l */
        public C16982a mo60003l(Boolean bool) {
            this.f43560K = bool;
            return this;
        }

        /* renamed from: m */
        public C16982a mo60004m(Boolean bool) {
            this.f43561L = bool;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59976a(MailVacationResponder mailVacationResponder) {
            this.f43574l = mailVacationResponder;
            return this;
        }

        /* renamed from: b */
        public C16982a mo59989b(Boolean bool) {
            this.f43565c = bool;
            return this;
        }

        /* renamed from: c */
        public C16982a mo59993c(Long l) {
            this.f43577o = l;
            return this;
        }

        /* renamed from: d */
        public C16982a mo59995d(Long l) {
            this.f43552C = l;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59977a(OnboardingState onboardingState) {
            this.f43572j = onboardingState;
            return this;
        }

        /* renamed from: b */
        public C16982a mo59990b(Long l) {
            this.f43576n = l;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59978a(ReplyLanguage replyLanguage) {
            this.f43555F = replyLanguage;
            return this;
        }

        /* renamed from: b */
        public C16982a mo59991b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43553D = list;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59979a(UserType userType) {
            this.f43568f = userType;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59980a(Signature signature) {
            this.f43564b = signature;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59981a(SmartInboxOnboarding smartInboxOnboarding) {
            this.f43588z = smartInboxOnboarding;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59982a(StorageLimitNotify storageLimitNotify) {
            this.f43556G = storageLimitNotify;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59983a(Boolean bool) {
            this.f43563a = bool;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59984a(Integer num) {
            this.f43562M = num;
            return this;
        }

        /* renamed from: a */
        public C16982a mo59985a(Long l) {
            this.f43573k = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Setting$b */
    private static final class C16983b extends ProtoAdapter<Setting> {
        C16983b() {
            super(FieldEncoding.LENGTH_DELIMITED, Setting.class);
        }

        /* renamed from: a */
        public int encodedSize(Setting setting) {
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
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36 = 0;
            if (setting.new_mail_notification != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, setting.new_mail_notification);
            } else {
                i = 0;
            }
            if (setting.signature != null) {
                i2 = Signature.ADAPTER.encodedSizeWithTag(2, setting.signature);
            } else {
                i2 = 0;
            }
            int i37 = i + i2;
            if (setting.smart_inbox_mode != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, setting.smart_inbox_mode);
            } else {
                i3 = 0;
            }
            int i38 = i37 + i3;
            if (setting.client_tab_visible != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, setting.client_tab_visible);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i38 + i4 + EmailClientConfig.ADAPTER.asRepeated().encodedSizeWithTag(6, setting.email_client_configs);
            if (setting.user_type != null) {
                i5 = UserType.ADAPTER.encodedSizeWithTag(7, setting.user_type);
            } else {
                i5 = 0;
            }
            int i39 = encodedSizeWithTag + i5;
            if (setting.email_alias != null) {
                i6 = EmailAlias.ADAPTER.encodedSizeWithTag(8, setting.email_alias);
            } else {
                i6 = 0;
            }
            int i40 = i39 + i6;
            if (setting.mobile_use_pc_signature != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, setting.mobile_use_pc_signature);
            } else {
                i7 = 0;
            }
            int i41 = i40 + i7;
            if (setting.pc_signature != null) {
                i8 = Signature.ADAPTER.encodedSizeWithTag(10, setting.pc_signature);
            } else {
                i8 = 0;
            }
            int i42 = i41 + i8;
            if (setting.onboarding_state != null) {
                i9 = OnboardingState.ADAPTER.encodedSizeWithTag(11, setting.onboarding_state);
            } else {
                i9 = 0;
            }
            int i43 = i42 + i9;
            if (setting.last_onboarding_prompt_display_timestamp != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(12, setting.last_onboarding_prompt_display_timestamp);
            } else {
                i10 = 0;
            }
            int i44 = i43 + i10;
            if (setting.vacation_responder != null) {
                i11 = MailVacationResponder.ADAPTER.encodedSizeWithTag(13, setting.vacation_responder);
            } else {
                i11 = 0;
            }
            int i45 = i44 + i11;
            if (setting.smart_inbox_visible != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, setting.smart_inbox_visible);
            } else {
                i12 = 0;
            }
            int i46 = i45 + i12;
            if (setting.last_visit_important_label_timestamp != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(15, setting.last_visit_important_label_timestamp);
            } else {
                i13 = 0;
            }
            int i47 = i46 + i13;
            if (setting.last_visit_other_label_timestamp != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(16, setting.last_visit_other_label_timestamp);
            } else {
                i14 = 0;
            }
            int i48 = i47 + i14;
            if (setting.status_is_migration_done_prompt_rendered != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(17, setting.status_is_migration_done_prompt_rendered);
            } else {
                i15 = 0;
            }
            int i49 = i48 + i15;
            if (setting.grammar_checker_enabled != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(18, setting.grammar_checker_enabled);
            } else {
                i16 = 0;
            }
            int i50 = i49 + i16;
            if (setting.layout_style != null) {
                i17 = LayoutStyle.ADAPTER.encodedSizeWithTag(19, setting.layout_style);
            } else {
                i17 = 0;
            }
            int i51 = i50 + i17;
            if (setting.smart_reply_open != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(20, setting.smart_reply_open);
            } else {
                i18 = 0;
            }
            int i52 = i51 + i18;
            if (setting.account_revoke_notify_popup_visible != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(21, setting.account_revoke_notify_popup_visible);
            } else {
                i19 = 0;
            }
            int encodedSizeWithTag2 = i52 + i19 + MailAccount.ADAPTER.asRepeated().encodedSizeWithTag(22, setting.shared_accounts);
            if (setting.smart_compose_enabled != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(23, setting.smart_compose_enabled);
            } else {
                i20 = 0;
            }
            int i53 = encodedSizeWithTag2 + i20;
            if (setting.smart_compose_personalization != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(24, setting.smart_compose_personalization);
            } else {
                i21 = 0;
            }
            int i54 = i53 + i21;
            if (setting.message_display_rank_mode != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(25, setting.message_display_rank_mode);
            } else {
                i22 = 0;
            }
            int i55 = i54 + i22;
            if (setting.message_display_rank_render_state != null) {
                i23 = RenderState.ADAPTER.encodedSizeWithTag(26, setting.message_display_rank_render_state);
            } else {
                i23 = 0;
            }
            int i56 = i55 + i23;
            if (setting.status_smart_inbox_onboarding != null) {
                i24 = SmartInboxOnboarding.ADAPTER.encodedSizeWithTag(27, setting.status_smart_inbox_onboarding);
            } else {
                i24 = 0;
            }
            int i57 = i56 + i24;
            if (setting.email_recall != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(28, setting.email_recall);
            } else {
                i25 = 0;
            }
            int i58 = i57 + i25;
            if (setting.undo_send_enable != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(29, setting.undo_send_enable);
            } else {
                i26 = 0;
            }
            int i59 = i58 + i26;
            if (setting.undo_time != null) {
                i27 = ProtoAdapter.INT64.encodedSizeWithTag(30, setting.undo_time);
            } else {
                i27 = 0;
            }
            int encodedSizeWithTag3 = i59 + i27 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(31, setting.translation_recommendation_skip_language);
            if (setting.mail_onboard_status != null) {
                i28 = MailOnboardStatus.ADAPTER.encodedSizeWithTag(32, setting.mail_onboard_status);
            } else {
                i28 = 0;
            }
            int i60 = encodedSizeWithTag3 + i28;
            if (setting.reply_language != null) {
                i29 = ReplyLanguage.ADAPTER.encodedSizeWithTag(33, setting.reply_language);
            } else {
                i29 = 0;
            }
            int i61 = i60 + i29;
            if (setting.storageLimitNotify != null) {
                i30 = StorageLimitNotify.ADAPTER.encodedSizeWithTag(34, setting.storageLimitNotify);
            } else {
                i30 = 0;
            }
            int i62 = i61 + i30;
            if (setting.admin_enable_auto_transfer != null) {
                i31 = ProtoAdapter.BOOL.encodedSizeWithTag(35, setting.admin_enable_auto_transfer);
            } else {
                i31 = 0;
            }
            int i63 = i62 + i31;
            if (setting.user_enable_auto_transfer != null) {
                i32 = ProtoAdapter.BOOL.encodedSizeWithTag(36, setting.user_enable_auto_transfer);
            } else {
                i32 = 0;
            }
            int i64 = i63 + i32;
            if (setting.show_api_onboarding_page != null) {
                i33 = ProtoAdapter.BOOL.encodedSizeWithTag(37, setting.show_api_onboarding_page);
            } else {
                i33 = 0;
            }
            int i65 = i64 + i33;
            if (setting.enable_conversation_mode != null) {
                i34 = ProtoAdapter.BOOL.encodedSizeWithTag(38, setting.enable_conversation_mode);
            } else {
                i34 = 0;
            }
            int i66 = i65 + i34;
            if (setting.all_new_mail_notification_switch != null) {
                i35 = ProtoAdapter.BOOL.encodedSizeWithTag(39, setting.all_new_mail_notification_switch);
            } else {
                i35 = 0;
            }
            int i67 = i66 + i35;
            if (setting.new_mail_notification_channel != null) {
                i36 = ProtoAdapter.INT32.encodedSizeWithTag(40, setting.new_mail_notification_channel);
            }
            return i67 + i36 + setting.unknownFields().size();
        }

        /* renamed from: a */
        public Setting decode(ProtoReader protoReader) throws IOException {
            C16982a aVar = new C16982a();
            aVar.f43563a = false;
            aVar.f43565c = true;
            aVar.f43566d = true;
            aVar.f43568f = UserType.LARK_SERVER;
            aVar.f43570h = false;
            aVar.f43572j = OnboardingState.UNKNOWN;
            aVar.f43573k = 0L;
            aVar.f43575m = false;
            aVar.f43576n = 0L;
            aVar.f43577o = 0L;
            aVar.f43578p = false;
            aVar.f43579q = true;
            aVar.f43580r = LayoutStyle.SPLIT;
            aVar.f43581s = true;
            aVar.f43582t = false;
            aVar.f43584v = true;
            aVar.f43585w = false;
            aVar.f43586x = false;
            aVar.f43587y = RenderState.STAGE_1_NO_RENDER;
            aVar.f43550A = false;
            aVar.f43551B = false;
            aVar.f43552C = 0L;
            aVar.f43554E = MailOnboardStatus.ACTIVE;
            aVar.f43555F = ReplyLanguage.AUTO;
            aVar.f43557H = false;
            aVar.f43558I = false;
            aVar.f43559J = false;
            aVar.f43560K = true;
            aVar.f43561L = true;
            aVar.f43562M = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43563a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43564b = Signature.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43565c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 5:
                            aVar.f43566d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43567e.add(EmailClientConfig.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            try {
                                aVar.f43568f = UserType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 8:
                            aVar.f43569g = EmailAlias.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43570h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43571i = Signature.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f43572j = OnboardingState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43573k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f43574l = MailVacationResponder.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f43575m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f43576n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            aVar.f43577o = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 17:
                            aVar.f43578p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f43579q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            try {
                                aVar.f43580r = LayoutStyle.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 20:
                            aVar.f43581s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            aVar.f43582t = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f43583u.add(MailAccount.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            aVar.f43584v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f43585w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f43586x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            try {
                                aVar.f43587y = RenderState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f43588z = SmartInboxOnboarding.ADAPTER.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f43550A = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            aVar.f43551B = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            aVar.f43552C = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f43553D.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 32:
                            try {
                                aVar.f43554E = MailOnboardStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 33:
                            try {
                                aVar.f43555F = ReplyLanguage.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 34:
                            aVar.f43556G = StorageLimitNotify.ADAPTER.decode(protoReader);
                            break;
                        case 35:
                            aVar.f43557H = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 36:
                            aVar.f43558I = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 37:
                            aVar.f43559J = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 38:
                            aVar.f43560K = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 39:
                            aVar.f43561L = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            aVar.f43562M = ProtoAdapter.INT32.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Setting setting) throws IOException {
            if (setting.new_mail_notification != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setting.new_mail_notification);
            }
            if (setting.signature != null) {
                Signature.ADAPTER.encodeWithTag(protoWriter, 2, setting.signature);
            }
            if (setting.smart_inbox_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, setting.smart_inbox_mode);
            }
            if (setting.client_tab_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, setting.client_tab_visible);
            }
            EmailClientConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, setting.email_client_configs);
            if (setting.user_type != null) {
                UserType.ADAPTER.encodeWithTag(protoWriter, 7, setting.user_type);
            }
            if (setting.email_alias != null) {
                EmailAlias.ADAPTER.encodeWithTag(protoWriter, 8, setting.email_alias);
            }
            if (setting.mobile_use_pc_signature != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, setting.mobile_use_pc_signature);
            }
            if (setting.pc_signature != null) {
                Signature.ADAPTER.encodeWithTag(protoWriter, 10, setting.pc_signature);
            }
            if (setting.onboarding_state != null) {
                OnboardingState.ADAPTER.encodeWithTag(protoWriter, 11, setting.onboarding_state);
            }
            if (setting.last_onboarding_prompt_display_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, setting.last_onboarding_prompt_display_timestamp);
            }
            if (setting.vacation_responder != null) {
                MailVacationResponder.ADAPTER.encodeWithTag(protoWriter, 13, setting.vacation_responder);
            }
            if (setting.smart_inbox_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, setting.smart_inbox_visible);
            }
            if (setting.last_visit_important_label_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 15, setting.last_visit_important_label_timestamp);
            }
            if (setting.last_visit_other_label_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, setting.last_visit_other_label_timestamp);
            }
            if (setting.status_is_migration_done_prompt_rendered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, setting.status_is_migration_done_prompt_rendered);
            }
            if (setting.grammar_checker_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, setting.grammar_checker_enabled);
            }
            if (setting.layout_style != null) {
                LayoutStyle.ADAPTER.encodeWithTag(protoWriter, 19, setting.layout_style);
            }
            if (setting.smart_reply_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, setting.smart_reply_open);
            }
            if (setting.account_revoke_notify_popup_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, setting.account_revoke_notify_popup_visible);
            }
            MailAccount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, setting.shared_accounts);
            if (setting.smart_compose_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, setting.smart_compose_enabled);
            }
            if (setting.smart_compose_personalization != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, setting.smart_compose_personalization);
            }
            if (setting.message_display_rank_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, setting.message_display_rank_mode);
            }
            if (setting.message_display_rank_render_state != null) {
                RenderState.ADAPTER.encodeWithTag(protoWriter, 26, setting.message_display_rank_render_state);
            }
            if (setting.status_smart_inbox_onboarding != null) {
                SmartInboxOnboarding.ADAPTER.encodeWithTag(protoWriter, 27, setting.status_smart_inbox_onboarding);
            }
            if (setting.email_recall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, setting.email_recall);
            }
            if (setting.undo_send_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, setting.undo_send_enable);
            }
            if (setting.undo_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 30, setting.undo_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 31, setting.translation_recommendation_skip_language);
            if (setting.mail_onboard_status != null) {
                MailOnboardStatus.ADAPTER.encodeWithTag(protoWriter, 32, setting.mail_onboard_status);
            }
            if (setting.reply_language != null) {
                ReplyLanguage.ADAPTER.encodeWithTag(protoWriter, 33, setting.reply_language);
            }
            if (setting.storageLimitNotify != null) {
                StorageLimitNotify.ADAPTER.encodeWithTag(protoWriter, 34, setting.storageLimitNotify);
            }
            if (setting.admin_enable_auto_transfer != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 35, setting.admin_enable_auto_transfer);
            }
            if (setting.user_enable_auto_transfer != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, setting.user_enable_auto_transfer);
            }
            if (setting.show_api_onboarding_page != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, setting.show_api_onboarding_page);
            }
            if (setting.enable_conversation_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, setting.enable_conversation_mode);
            }
            if (setting.all_new_mail_notification_switch != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, setting.all_new_mail_notification_switch);
            }
            if (setting.new_mail_notification_channel != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 40, setting.new_mail_notification_channel);
            }
            protoWriter.writeBytes(setting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16982a newBuilder() {
        C16982a aVar = new C16982a();
        aVar.f43563a = this.new_mail_notification;
        aVar.f43564b = this.signature;
        aVar.f43565c = this.smart_inbox_mode;
        aVar.f43566d = this.client_tab_visible;
        aVar.f43567e = Internal.copyOf("email_client_configs", this.email_client_configs);
        aVar.f43568f = this.user_type;
        aVar.f43569g = this.email_alias;
        aVar.f43570h = this.mobile_use_pc_signature;
        aVar.f43571i = this.pc_signature;
        aVar.f43572j = this.onboarding_state;
        aVar.f43573k = this.last_onboarding_prompt_display_timestamp;
        aVar.f43574l = this.vacation_responder;
        aVar.f43575m = this.smart_inbox_visible;
        aVar.f43576n = this.last_visit_important_label_timestamp;
        aVar.f43577o = this.last_visit_other_label_timestamp;
        aVar.f43578p = this.status_is_migration_done_prompt_rendered;
        aVar.f43579q = this.grammar_checker_enabled;
        aVar.f43580r = this.layout_style;
        aVar.f43581s = this.smart_reply_open;
        aVar.f43582t = this.account_revoke_notify_popup_visible;
        aVar.f43583u = Internal.copyOf("shared_accounts", this.shared_accounts);
        aVar.f43584v = this.smart_compose_enabled;
        aVar.f43585w = this.smart_compose_personalization;
        aVar.f43586x = this.message_display_rank_mode;
        aVar.f43587y = this.message_display_rank_render_state;
        aVar.f43588z = this.status_smart_inbox_onboarding;
        aVar.f43550A = this.email_recall;
        aVar.f43551B = this.undo_send_enable;
        aVar.f43552C = this.undo_time;
        aVar.f43553D = Internal.copyOf("translation_recommendation_skip_language", this.translation_recommendation_skip_language);
        aVar.f43554E = this.mail_onboard_status;
        aVar.f43555F = this.reply_language;
        aVar.f43556G = this.storageLimitNotify;
        aVar.f43557H = this.admin_enable_auto_transfer;
        aVar.f43558I = this.user_enable_auto_transfer;
        aVar.f43559J = this.show_api_onboarding_page;
        aVar.f43560K = this.enable_conversation_mode;
        aVar.f43561L = this.all_new_mail_notification_switch;
        aVar.f43562M = this.new_mail_notification_channel;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Setting");
        StringBuilder sb = new StringBuilder();
        if (this.new_mail_notification != null) {
            sb.append(", new_mail_notification=");
            sb.append(this.new_mail_notification);
        }
        if (this.signature != null) {
            sb.append(", signature=");
            sb.append(this.signature);
        }
        if (this.smart_inbox_mode != null) {
            sb.append(", smart_inbox_mode=");
            sb.append(this.smart_inbox_mode);
        }
        if (this.client_tab_visible != null) {
            sb.append(", client_tab_visible=");
            sb.append(this.client_tab_visible);
        }
        if (!this.email_client_configs.isEmpty()) {
            sb.append(", email_client_configs=");
            sb.append(this.email_client_configs);
        }
        if (this.user_type != null) {
            sb.append(", user_type=");
            sb.append(this.user_type);
        }
        if (this.email_alias != null) {
            sb.append(", email_alias=");
            sb.append(this.email_alias);
        }
        if (this.mobile_use_pc_signature != null) {
            sb.append(", mobile_use_pc_signature=");
            sb.append(this.mobile_use_pc_signature);
        }
        if (this.pc_signature != null) {
            sb.append(", pc_signature=");
            sb.append(this.pc_signature);
        }
        if (this.onboarding_state != null) {
            sb.append(", onboarding_state=");
            sb.append(this.onboarding_state);
        }
        if (this.last_onboarding_prompt_display_timestamp != null) {
            sb.append(", last_onboarding_prompt_display_timestamp=");
            sb.append(this.last_onboarding_prompt_display_timestamp);
        }
        if (this.vacation_responder != null) {
            sb.append(", vacation_responder=");
            sb.append(this.vacation_responder);
        }
        if (this.smart_inbox_visible != null) {
            sb.append(", smart_inbox_visible=");
            sb.append(this.smart_inbox_visible);
        }
        if (this.last_visit_important_label_timestamp != null) {
            sb.append(", last_visit_important_label_timestamp=");
            sb.append(this.last_visit_important_label_timestamp);
        }
        if (this.last_visit_other_label_timestamp != null) {
            sb.append(", last_visit_other_label_timestamp=");
            sb.append(this.last_visit_other_label_timestamp);
        }
        if (this.status_is_migration_done_prompt_rendered != null) {
            sb.append(", status_is_migration_done_prompt_rendered=");
            sb.append(this.status_is_migration_done_prompt_rendered);
        }
        if (this.grammar_checker_enabled != null) {
            sb.append(", grammar_checker_enabled=");
            sb.append(this.grammar_checker_enabled);
        }
        if (this.layout_style != null) {
            sb.append(", layout_style=");
            sb.append(this.layout_style);
        }
        if (this.smart_reply_open != null) {
            sb.append(", smart_reply_open=");
            sb.append(this.smart_reply_open);
        }
        if (this.account_revoke_notify_popup_visible != null) {
            sb.append(", account_revoke_notify_popup_visible=");
            sb.append(this.account_revoke_notify_popup_visible);
        }
        if (!this.shared_accounts.isEmpty()) {
            sb.append(", shared_accounts=");
            sb.append(this.shared_accounts);
        }
        if (this.smart_compose_enabled != null) {
            sb.append(", smart_compose_enabled=");
            sb.append(this.smart_compose_enabled);
        }
        if (this.smart_compose_personalization != null) {
            sb.append(", smart_compose_personalization=");
            sb.append(this.smart_compose_personalization);
        }
        if (this.message_display_rank_mode != null) {
            sb.append(", message_display_rank_mode=");
            sb.append(this.message_display_rank_mode);
        }
        if (this.message_display_rank_render_state != null) {
            sb.append(", message_display_rank_render_state=");
            sb.append(this.message_display_rank_render_state);
        }
        if (this.status_smart_inbox_onboarding != null) {
            sb.append(", status_smart_inbox_onboarding=");
            sb.append(this.status_smart_inbox_onboarding);
        }
        if (this.email_recall != null) {
            sb.append(", email_recall=");
            sb.append(this.email_recall);
        }
        if (this.undo_send_enable != null) {
            sb.append(", undo_send_enable=");
            sb.append(this.undo_send_enable);
        }
        if (this.undo_time != null) {
            sb.append(", undo_time=");
            sb.append(this.undo_time);
        }
        if (!this.translation_recommendation_skip_language.isEmpty()) {
            sb.append(", translation_recommendation_skip_language=");
            sb.append(this.translation_recommendation_skip_language);
        }
        if (this.mail_onboard_status != null) {
            sb.append(", mail_onboard_status=");
            sb.append(this.mail_onboard_status);
        }
        if (this.reply_language != null) {
            sb.append(", reply_language=");
            sb.append(this.reply_language);
        }
        if (this.storageLimitNotify != null) {
            sb.append(", storageLimitNotify=");
            sb.append(this.storageLimitNotify);
        }
        if (this.admin_enable_auto_transfer != null) {
            sb.append(", admin_enable_auto_transfer=");
            sb.append(this.admin_enable_auto_transfer);
        }
        if (this.user_enable_auto_transfer != null) {
            sb.append(", user_enable_auto_transfer=");
            sb.append(this.user_enable_auto_transfer);
        }
        if (this.show_api_onboarding_page != null) {
            sb.append(", show_api_onboarding_page=");
            sb.append(this.show_api_onboarding_page);
        }
        if (this.enable_conversation_mode != null) {
            sb.append(", enable_conversation_mode=");
            sb.append(this.enable_conversation_mode);
        }
        if (this.all_new_mail_notification_switch != null) {
            sb.append(", all_new_mail_notification_switch=");
            sb.append(this.all_new_mail_notification_switch);
        }
        if (this.new_mail_notification_channel != null) {
            sb.append(", new_mail_notification_channel=");
            sb.append(this.new_mail_notification_channel);
        }
        StringBuilder replace = sb.replace(0, 2, "Setting{");
        replace.append('}');
        return replace.toString();
    }

    public Setting(Boolean bool, Signature signature2, Boolean bool2, Boolean bool3, List<EmailClientConfig> list, UserType userType, EmailAlias emailAlias, Boolean bool4, Signature signature3, OnboardingState onboardingState, Long l, MailVacationResponder mailVacationResponder, Boolean bool5, Long l2, Long l3, Boolean bool6, Boolean bool7, LayoutStyle layoutStyle, Boolean bool8, Boolean bool9, List<MailAccount> list2, Boolean bool10, Boolean bool11, Boolean bool12, RenderState renderState, SmartInboxOnboarding smartInboxOnboarding, Boolean bool13, Boolean bool14, Long l4, List<String> list3, MailOnboardStatus mailOnboardStatus, ReplyLanguage replyLanguage, StorageLimitNotify storageLimitNotify2, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Integer num) {
        this(bool, signature2, bool2, bool3, list, userType, emailAlias, bool4, signature3, onboardingState, l, mailVacationResponder, bool5, l2, l3, bool6, bool7, layoutStyle, bool8, bool9, list2, bool10, bool11, bool12, renderState, smartInboxOnboarding, bool13, bool14, l4, list3, mailOnboardStatus, replyLanguage, storageLimitNotify2, bool15, bool16, bool17, bool18, bool19, num, ByteString.EMPTY);
    }

    public Setting(Boolean bool, Signature signature2, Boolean bool2, Boolean bool3, List<EmailClientConfig> list, UserType userType, EmailAlias emailAlias, Boolean bool4, Signature signature3, OnboardingState onboardingState, Long l, MailVacationResponder mailVacationResponder, Boolean bool5, Long l2, Long l3, Boolean bool6, Boolean bool7, LayoutStyle layoutStyle, Boolean bool8, Boolean bool9, List<MailAccount> list2, Boolean bool10, Boolean bool11, Boolean bool12, RenderState renderState, SmartInboxOnboarding smartInboxOnboarding, Boolean bool13, Boolean bool14, Long l4, List<String> list3, MailOnboardStatus mailOnboardStatus, ReplyLanguage replyLanguage, StorageLimitNotify storageLimitNotify2, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.new_mail_notification = bool;
        this.signature = signature2;
        this.smart_inbox_mode = bool2;
        this.client_tab_visible = bool3;
        this.email_client_configs = Internal.immutableCopyOf("email_client_configs", list);
        this.user_type = userType;
        this.email_alias = emailAlias;
        this.mobile_use_pc_signature = bool4;
        this.pc_signature = signature3;
        this.onboarding_state = onboardingState;
        this.last_onboarding_prompt_display_timestamp = l;
        this.vacation_responder = mailVacationResponder;
        this.smart_inbox_visible = bool5;
        this.last_visit_important_label_timestamp = l2;
        this.last_visit_other_label_timestamp = l3;
        this.status_is_migration_done_prompt_rendered = bool6;
        this.grammar_checker_enabled = bool7;
        this.layout_style = layoutStyle;
        this.smart_reply_open = bool8;
        this.account_revoke_notify_popup_visible = bool9;
        this.shared_accounts = Internal.immutableCopyOf("shared_accounts", list2);
        this.smart_compose_enabled = bool10;
        this.smart_compose_personalization = bool11;
        this.message_display_rank_mode = bool12;
        this.message_display_rank_render_state = renderState;
        this.status_smart_inbox_onboarding = smartInboxOnboarding;
        this.email_recall = bool13;
        this.undo_send_enable = bool14;
        this.undo_time = l4;
        this.translation_recommendation_skip_language = Internal.immutableCopyOf("translation_recommendation_skip_language", list3);
        this.mail_onboard_status = mailOnboardStatus;
        this.reply_language = replyLanguage;
        this.storageLimitNotify = storageLimitNotify2;
        this.admin_enable_auto_transfer = bool15;
        this.user_enable_auto_transfer = bool16;
        this.show_api_onboarding_page = bool17;
        this.enable_conversation_mode = bool18;
        this.all_new_mail_notification_switch = bool19;
        this.new_mail_notification_channel = num;
    }
}
