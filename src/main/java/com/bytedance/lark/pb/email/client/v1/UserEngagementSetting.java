package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class UserEngagementSetting extends Message<UserEngagementSetting, C16996a> {
    public static final ProtoAdapter<UserEngagementSetting> ADAPTER = new C16997b();
    public static final Boolean DEFAULT_EMAIL_RECALL = false;
    public static final Long DEFAULT_LAST_ONBOARDING_PROMPT_DISPLAY_TIMESTAMP = 0L;
    public static final Long DEFAULT_LAST_VISIT_IMPORTANT_LABEL_TIMESTAMP = 0L;
    public static final Long DEFAULT_LAST_VISIT_OTHER_LABEL_TIMESTAMP = 0L;
    public static final OnboardingState DEFAULT_ONBOARDING_STATE = OnboardingState.UNKNOWN;
    public static final Boolean DEFAULT_STATUS_IS_MIGRATION_DONE_PROMPT_RENDERED = false;
    private static final long serialVersionUID = 0;
    public final Boolean email_recall;
    public final Long last_onboarding_prompt_display_timestamp;
    public final Long last_visit_important_label_timestamp;
    public final Long last_visit_other_label_timestamp;
    public final OnboardingState onboarding_state;
    public final Boolean status_is_migration_done_prompt_rendered;
    public final SmartInboxOnboarding status_smart_inbox_onboarding;

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

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UserEngagementSetting$b */
    private static final class C16997b extends ProtoAdapter<UserEngagementSetting> {
        C16997b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserEngagementSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(UserEngagementSetting userEngagementSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (userEngagementSetting.onboarding_state != null) {
                i = OnboardingState.ADAPTER.encodedSizeWithTag(1, userEngagementSetting.onboarding_state);
            } else {
                i = 0;
            }
            if (userEngagementSetting.last_onboarding_prompt_display_timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, userEngagementSetting.last_onboarding_prompt_display_timestamp);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (userEngagementSetting.last_visit_important_label_timestamp != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, userEngagementSetting.last_visit_important_label_timestamp);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (userEngagementSetting.last_visit_other_label_timestamp != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, userEngagementSetting.last_visit_other_label_timestamp);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (userEngagementSetting.status_is_migration_done_prompt_rendered != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, userEngagementSetting.status_is_migration_done_prompt_rendered);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (userEngagementSetting.status_smart_inbox_onboarding != null) {
                i6 = SmartInboxOnboarding.ADAPTER.encodedSizeWithTag(6, userEngagementSetting.status_smart_inbox_onboarding);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (userEngagementSetting.email_recall != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, userEngagementSetting.email_recall);
            }
            return i12 + i7 + userEngagementSetting.unknownFields().size();
        }

        /* renamed from: a */
        public UserEngagementSetting decode(ProtoReader protoReader) throws IOException {
            C16996a aVar = new C16996a();
            aVar.f43620a = OnboardingState.UNKNOWN;
            aVar.f43621b = 0L;
            aVar.f43622c = 0L;
            aVar.f43623d = 0L;
            aVar.f43624e = false;
            aVar.f43626g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f43620a = OnboardingState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f43621b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43622c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43623d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43624e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43625f = SmartInboxOnboarding.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43626g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UserEngagementSetting userEngagementSetting) throws IOException {
            if (userEngagementSetting.onboarding_state != null) {
                OnboardingState.ADAPTER.encodeWithTag(protoWriter, 1, userEngagementSetting.onboarding_state);
            }
            if (userEngagementSetting.last_onboarding_prompt_display_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, userEngagementSetting.last_onboarding_prompt_display_timestamp);
            }
            if (userEngagementSetting.last_visit_important_label_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, userEngagementSetting.last_visit_important_label_timestamp);
            }
            if (userEngagementSetting.last_visit_other_label_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, userEngagementSetting.last_visit_other_label_timestamp);
            }
            if (userEngagementSetting.status_is_migration_done_prompt_rendered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, userEngagementSetting.status_is_migration_done_prompt_rendered);
            }
            if (userEngagementSetting.status_smart_inbox_onboarding != null) {
                SmartInboxOnboarding.ADAPTER.encodeWithTag(protoWriter, 6, userEngagementSetting.status_smart_inbox_onboarding);
            }
            if (userEngagementSetting.email_recall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, userEngagementSetting.email_recall);
            }
            protoWriter.writeBytes(userEngagementSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UserEngagementSetting$a */
    public static final class C16996a extends Message.Builder<UserEngagementSetting, C16996a> {

        /* renamed from: a */
        public OnboardingState f43620a;

        /* renamed from: b */
        public Long f43621b;

        /* renamed from: c */
        public Long f43622c;

        /* renamed from: d */
        public Long f43623d;

        /* renamed from: e */
        public Boolean f43624e;

        /* renamed from: f */
        public SmartInboxOnboarding f43625f;

        /* renamed from: g */
        public Boolean f43626g;

        /* renamed from: a */
        public UserEngagementSetting build() {
            return new UserEngagementSetting(this.f43620a, this.f43621b, this.f43622c, this.f43623d, this.f43624e, this.f43625f, this.f43626g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16996a newBuilder() {
        C16996a aVar = new C16996a();
        aVar.f43620a = this.onboarding_state;
        aVar.f43621b = this.last_onboarding_prompt_display_timestamp;
        aVar.f43622c = this.last_visit_important_label_timestamp;
        aVar.f43623d = this.last_visit_other_label_timestamp;
        aVar.f43624e = this.status_is_migration_done_prompt_rendered;
        aVar.f43625f = this.status_smart_inbox_onboarding;
        aVar.f43626g = this.email_recall;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "UserEngagementSetting");
        StringBuilder sb = new StringBuilder();
        if (this.onboarding_state != null) {
            sb.append(", onboarding_state=");
            sb.append(this.onboarding_state);
        }
        if (this.last_onboarding_prompt_display_timestamp != null) {
            sb.append(", last_onboarding_prompt_display_timestamp=");
            sb.append(this.last_onboarding_prompt_display_timestamp);
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
        if (this.status_smart_inbox_onboarding != null) {
            sb.append(", status_smart_inbox_onboarding=");
            sb.append(this.status_smart_inbox_onboarding);
        }
        if (this.email_recall != null) {
            sb.append(", email_recall=");
            sb.append(this.email_recall);
        }
        StringBuilder replace = sb.replace(0, 2, "UserEngagementSetting{");
        replace.append('}');
        return replace.toString();
    }

    public UserEngagementSetting(OnboardingState onboardingState, Long l, Long l2, Long l3, Boolean bool, SmartInboxOnboarding smartInboxOnboarding, Boolean bool2) {
        this(onboardingState, l, l2, l3, bool, smartInboxOnboarding, bool2, ByteString.EMPTY);
    }

    public UserEngagementSetting(OnboardingState onboardingState, Long l, Long l2, Long l3, Boolean bool, SmartInboxOnboarding smartInboxOnboarding, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.onboarding_state = onboardingState;
        this.last_onboarding_prompt_display_timestamp = l;
        this.last_visit_important_label_timestamp = l2;
        this.last_visit_other_label_timestamp = l3;
        this.status_is_migration_done_prompt_rendered = bool;
        this.status_smart_inbox_onboarding = smartInboxOnboarding;
        this.email_recall = bool2;
    }
}
