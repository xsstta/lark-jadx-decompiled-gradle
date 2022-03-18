package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.protobuf.MessageOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class CalendarExternalAccount extends Message<CalendarExternalAccount, C15542a> {
    public static final ProtoAdapter<CalendarExternalAccount> ADAPTER = new C15543b();
    public static final Boolean DEFAULT_ENABLE_CALENDAR = false;
    public static final Boolean DEFAULT_ENABLE_EMAIL_ATTENDEE_INVITATION = false;
    public static final Boolean DEFAULT_HAS_GMAIL_SCOPE = false;
    public static final TYPE DEFAULT_TYPE = TYPE.GOOGLE;
    public static final MessageOptions MESSAGE_OPTIONS = new MessageOptions.C23078a().mo80177a(true).build();
    private static final long serialVersionUID = 0;
    public final String email;
    public final Boolean enable_calendar;
    public final Boolean enable_email_attendee_invitation;
    public final Boolean has_gmail_scope;
    public final String id;
    public final TYPE type;

    public enum TYPE implements WireEnum {
        GOOGLE(1),
        EXCHANGE(2);
        
        public static final ProtoAdapter<TYPE> ADAPTER = ProtoAdapter.newEnumAdapter(TYPE.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TYPE fromValue(int i) {
            if (i == 1) {
                return GOOGLE;
            }
            if (i != 2) {
                return null;
            }
            return EXCHANGE;
        }

        private TYPE(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarExternalAccount$b */
    private static final class C15543b extends ProtoAdapter<CalendarExternalAccount> {
        C15543b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarExternalAccount.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarExternalAccount calendarExternalAccount) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarExternalAccount.id) + TYPE.ADAPTER.encodedSizeWithTag(2, calendarExternalAccount.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, calendarExternalAccount.email);
            int i3 = 0;
            if (calendarExternalAccount.enable_calendar != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, calendarExternalAccount.enable_calendar);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (calendarExternalAccount.enable_email_attendee_invitation != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, calendarExternalAccount.enable_email_attendee_invitation);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (calendarExternalAccount.has_gmail_scope != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, calendarExternalAccount.has_gmail_scope);
            }
            return i5 + i3 + calendarExternalAccount.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarExternalAccount decode(ProtoReader protoReader) throws IOException {
            C15542a aVar = new C15542a();
            aVar.f41203a = "";
            aVar.f41204b = TYPE.GOOGLE;
            aVar.f41205c = "";
            aVar.f41206d = false;
            aVar.f41207e = false;
            aVar.f41208f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41203a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f41204b = TYPE.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f41205c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41206d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41207e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41208f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CalendarExternalAccount calendarExternalAccount) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarExternalAccount.id);
            TYPE.ADAPTER.encodeWithTag(protoWriter, 2, calendarExternalAccount.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarExternalAccount.email);
            if (calendarExternalAccount.enable_calendar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, calendarExternalAccount.enable_calendar);
            }
            if (calendarExternalAccount.enable_email_attendee_invitation != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, calendarExternalAccount.enable_email_attendee_invitation);
            }
            if (calendarExternalAccount.has_gmail_scope != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, calendarExternalAccount.has_gmail_scope);
            }
            protoWriter.writeBytes(calendarExternalAccount.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15542a newBuilder() {
        C15542a aVar = new C15542a();
        aVar.f41203a = this.id;
        aVar.f41204b = this.type;
        aVar.f41205c = this.email;
        aVar.f41206d = this.enable_calendar;
        aVar.f41207e = this.enable_email_attendee_invitation;
        aVar.f41208f = this.has_gmail_scope;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarExternalAccount$a */
    public static final class C15542a extends Message.Builder<CalendarExternalAccount, C15542a> {

        /* renamed from: a */
        public String f41203a;

        /* renamed from: b */
        public TYPE f41204b;

        /* renamed from: c */
        public String f41205c;

        /* renamed from: d */
        public Boolean f41206d;

        /* renamed from: e */
        public Boolean f41207e;

        /* renamed from: f */
        public Boolean f41208f;

        /* renamed from: a */
        public CalendarExternalAccount build() {
            TYPE type;
            String str;
            String str2 = this.f41203a;
            if (str2 != null && (type = this.f41204b) != null && (str = this.f41205c) != null) {
                return new CalendarExternalAccount(str2, type, str, this.f41206d, this.f41207e, this.f41208f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f41204b, ShareHitPoint.f121869d, this.f41205c, "email");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarExternalAccount");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", email=");
        sb.append(this.email);
        if (this.enable_calendar != null) {
            sb.append(", enable_calendar=");
            sb.append(this.enable_calendar);
        }
        if (this.enable_email_attendee_invitation != null) {
            sb.append(", enable_email_attendee_invitation=");
            sb.append(this.enable_email_attendee_invitation);
        }
        if (this.has_gmail_scope != null) {
            sb.append(", has_gmail_scope=");
            sb.append(this.has_gmail_scope);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarExternalAccount{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarExternalAccount(String str, TYPE type2, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        this(str, type2, str2, bool, bool2, bool3, ByteString.EMPTY);
    }

    public CalendarExternalAccount(String str, TYPE type2, String str2, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.email = str2;
        this.enable_calendar = bool;
        this.enable_email_attendee_invitation = bool2;
        this.has_gmail_scope = bool3;
    }
}
