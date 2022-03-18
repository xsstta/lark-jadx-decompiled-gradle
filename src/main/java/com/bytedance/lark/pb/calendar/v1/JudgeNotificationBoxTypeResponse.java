package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class JudgeNotificationBoxTypeResponse extends Message<JudgeNotificationBoxTypeResponse, C15830a> {
    public static final ProtoAdapter<JudgeNotificationBoxTypeResponse> ADAPTER = new C15831b();
    public static final NotificationBoxType DEFAULT_BOX_TYPE = NotificationBoxType.NO_NOTIFICATION_BOX;
    public static final EmailAttendeeInvitationBoxType DEFAULT_EMAIL_ATTENDEE_INVITATION_BOX_TYPE = EmailAttendeeInvitationBoxType.NO_NEED;
    public static final MailAttendeeSpecialRule DEFAULT_MAIL_RULE = MailAttendeeSpecialRule.MAIL_RULE_NOTHING;
    public static final MeetingEventSpecialRule DEFAULT_MEETING_RULE = MeetingEventSpecialRule.NOTHING;
    private static final long serialVersionUID = 0;
    public final NotificationBoxType box_type;
    public final EmailAttendeeInvitationBoxType email_attendee_invitation_box_type;
    public final List<String> email_attendees_emails;
    public final List<CalendarExternalAccount> external_accounts;
    public final MailAttendeeSpecialRule mail_rule;
    public final MeetingEventSpecialRule meeting_rule;

    public enum EmailAttendeeInvitationBoxType implements WireEnum {
        NO_NEED(0),
        INVITATION_EMAIL_ENABLE(1),
        SELECT_INVITATION_EMAIL(2),
        IMPORT_INVITATION_EMAIL(3);
        
        public static final ProtoAdapter<EmailAttendeeInvitationBoxType> ADAPTER = ProtoAdapter.newEnumAdapter(EmailAttendeeInvitationBoxType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EmailAttendeeInvitationBoxType fromValue(int i) {
            if (i == 0) {
                return NO_NEED;
            }
            if (i == 1) {
                return INVITATION_EMAIL_ENABLE;
            }
            if (i == 2) {
                return SELECT_INVITATION_EMAIL;
            }
            if (i != 3) {
                return null;
            }
            return IMPORT_INVITATION_EMAIL;
        }

        private EmailAttendeeInvitationBoxType(int i) {
            this.value = i;
        }
    }

    public enum MailAttendeeSpecialRule implements WireEnum {
        MAIL_RULE_NOTHING(0),
        ADD_MAIL_ATTENDEES_DEFAULT_RECEIVE_NOTIFICATION_SUBTITILE(1);
        
        public static final ProtoAdapter<MailAttendeeSpecialRule> ADAPTER = ProtoAdapter.newEnumAdapter(MailAttendeeSpecialRule.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MailAttendeeSpecialRule fromValue(int i) {
            if (i == 0) {
                return MAIL_RULE_NOTHING;
            }
            if (i != 1) {
                return null;
            }
            return ADD_MAIL_ATTENDEES_DEFAULT_RECEIVE_NOTIFICATION_SUBTITILE;
        }

        private MailAttendeeSpecialRule(int i) {
            this.value = i;
        }
    }

    public enum MeetingEventSpecialRule implements WireEnum {
        NOTHING(0),
        ADD_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_SUBTITLE(1),
        POP_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_BOX(2);
        
        public static final ProtoAdapter<MeetingEventSpecialRule> ADAPTER = ProtoAdapter.newEnumAdapter(MeetingEventSpecialRule.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MeetingEventSpecialRule fromValue(int i) {
            if (i == 0) {
                return NOTHING;
            }
            if (i == 1) {
                return ADD_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_SUBTITLE;
            }
            if (i != 2) {
                return null;
            }
            return POP_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_BOX;
        }

        private MeetingEventSpecialRule(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeNotificationBoxTypeResponse$b */
    private static final class C15831b extends ProtoAdapter<JudgeNotificationBoxTypeResponse> {
        C15831b() {
            super(FieldEncoding.LENGTH_DELIMITED, JudgeNotificationBoxTypeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JudgeNotificationBoxTypeResponse judgeNotificationBoxTypeResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = NotificationBoxType.ADAPTER.encodedSizeWithTag(1, judgeNotificationBoxTypeResponse.box_type);
            int i3 = 0;
            if (judgeNotificationBoxTypeResponse.meeting_rule != null) {
                i = MeetingEventSpecialRule.ADAPTER.encodedSizeWithTag(2, judgeNotificationBoxTypeResponse.meeting_rule);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (judgeNotificationBoxTypeResponse.mail_rule != null) {
                i2 = MailAttendeeSpecialRule.ADAPTER.encodedSizeWithTag(3, judgeNotificationBoxTypeResponse.mail_rule);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (judgeNotificationBoxTypeResponse.email_attendee_invitation_box_type != null) {
                i3 = EmailAttendeeInvitationBoxType.ADAPTER.encodedSizeWithTag(4, judgeNotificationBoxTypeResponse.email_attendee_invitation_box_type);
            }
            return i5 + i3 + CalendarExternalAccount.ADAPTER.asRepeated().encodedSizeWithTag(5, judgeNotificationBoxTypeResponse.external_accounts) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, judgeNotificationBoxTypeResponse.email_attendees_emails) + judgeNotificationBoxTypeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JudgeNotificationBoxTypeResponse decode(ProtoReader protoReader) throws IOException {
            C15830a aVar = new C15830a();
            aVar.f41632a = NotificationBoxType.NO_NOTIFICATION_BOX;
            aVar.f41633b = MeetingEventSpecialRule.NOTHING;
            aVar.f41634c = MailAttendeeSpecialRule.MAIL_RULE_NOTHING;
            aVar.f41635d = EmailAttendeeInvitationBoxType.NO_NEED;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f41632a = NotificationBoxType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            try {
                                aVar.f41633b = MeetingEventSpecialRule.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f41634c = MailAttendeeSpecialRule.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f41635d = EmailAttendeeInvitationBoxType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 5:
                            aVar.f41636e.add(CalendarExternalAccount.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f41637f.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, JudgeNotificationBoxTypeResponse judgeNotificationBoxTypeResponse) throws IOException {
            NotificationBoxType.ADAPTER.encodeWithTag(protoWriter, 1, judgeNotificationBoxTypeResponse.box_type);
            if (judgeNotificationBoxTypeResponse.meeting_rule != null) {
                MeetingEventSpecialRule.ADAPTER.encodeWithTag(protoWriter, 2, judgeNotificationBoxTypeResponse.meeting_rule);
            }
            if (judgeNotificationBoxTypeResponse.mail_rule != null) {
                MailAttendeeSpecialRule.ADAPTER.encodeWithTag(protoWriter, 3, judgeNotificationBoxTypeResponse.mail_rule);
            }
            if (judgeNotificationBoxTypeResponse.email_attendee_invitation_box_type != null) {
                EmailAttendeeInvitationBoxType.ADAPTER.encodeWithTag(protoWriter, 4, judgeNotificationBoxTypeResponse.email_attendee_invitation_box_type);
            }
            CalendarExternalAccount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, judgeNotificationBoxTypeResponse.external_accounts);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, judgeNotificationBoxTypeResponse.email_attendees_emails);
            protoWriter.writeBytes(judgeNotificationBoxTypeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeNotificationBoxTypeResponse$a */
    public static final class C15830a extends Message.Builder<JudgeNotificationBoxTypeResponse, C15830a> {

        /* renamed from: a */
        public NotificationBoxType f41632a;

        /* renamed from: b */
        public MeetingEventSpecialRule f41633b;

        /* renamed from: c */
        public MailAttendeeSpecialRule f41634c;

        /* renamed from: d */
        public EmailAttendeeInvitationBoxType f41635d;

        /* renamed from: e */
        public List<CalendarExternalAccount> f41636e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f41637f = Internal.newMutableList();

        /* renamed from: a */
        public JudgeNotificationBoxTypeResponse build() {
            NotificationBoxType notificationBoxType = this.f41632a;
            if (notificationBoxType != null) {
                return new JudgeNotificationBoxTypeResponse(notificationBoxType, this.f41633b, this.f41634c, this.f41635d, this.f41636e, this.f41637f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(notificationBoxType, "box_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C15830a newBuilder() {
        C15830a aVar = new C15830a();
        aVar.f41632a = this.box_type;
        aVar.f41633b = this.meeting_rule;
        aVar.f41634c = this.mail_rule;
        aVar.f41635d = this.email_attendee_invitation_box_type;
        aVar.f41636e = Internal.copyOf("external_accounts", this.external_accounts);
        aVar.f41637f = Internal.copyOf("email_attendees_emails", this.email_attendees_emails);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "JudgeNotificationBoxTypeResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", box_type=");
        sb.append(this.box_type);
        if (this.meeting_rule != null) {
            sb.append(", meeting_rule=");
            sb.append(this.meeting_rule);
        }
        if (this.mail_rule != null) {
            sb.append(", mail_rule=");
            sb.append(this.mail_rule);
        }
        if (this.email_attendee_invitation_box_type != null) {
            sb.append(", email_attendee_invitation_box_type=");
            sb.append(this.email_attendee_invitation_box_type);
        }
        if (!this.external_accounts.isEmpty()) {
            sb.append(", external_accounts=");
            sb.append(this.external_accounts);
        }
        if (!this.email_attendees_emails.isEmpty()) {
            sb.append(", email_attendees_emails=");
            sb.append(this.email_attendees_emails);
        }
        StringBuilder replace = sb.replace(0, 2, "JudgeNotificationBoxTypeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JudgeNotificationBoxTypeResponse(NotificationBoxType notificationBoxType, MeetingEventSpecialRule meetingEventSpecialRule, MailAttendeeSpecialRule mailAttendeeSpecialRule, EmailAttendeeInvitationBoxType emailAttendeeInvitationBoxType, List<CalendarExternalAccount> list, List<String> list2) {
        this(notificationBoxType, meetingEventSpecialRule, mailAttendeeSpecialRule, emailAttendeeInvitationBoxType, list, list2, ByteString.EMPTY);
    }

    public JudgeNotificationBoxTypeResponse(NotificationBoxType notificationBoxType, MeetingEventSpecialRule meetingEventSpecialRule, MailAttendeeSpecialRule mailAttendeeSpecialRule, EmailAttendeeInvitationBoxType emailAttendeeInvitationBoxType, List<CalendarExternalAccount> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.box_type = notificationBoxType;
        this.meeting_rule = meetingEventSpecialRule;
        this.mail_rule = mailAttendeeSpecialRule;
        this.email_attendee_invitation_box_type = emailAttendeeInvitationBoxType;
        this.external_accounts = Internal.immutableCopyOf("external_accounts", list);
        this.email_attendees_emails = Internal.immutableCopyOf("email_attendees_emails", list2);
    }
}
