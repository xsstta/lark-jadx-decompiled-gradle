package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UserMeta extends Message<UserMeta, C50252a> {
    public static final ProtoAdapter<UserMeta> ADAPTER = new C50253b();
    public static final Boolean DEFAULT_ACCEPT_SMS_PHONE_URGENT = false;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_REGISTERED = false;
    private static final long serialVersionUID = 0;
    public final Boolean maccept_sms_phone_urgent;
    public final String mchat_id;
    public final Long mdo_not_disturb_end_time;
    public final String menterprise_mail_address;
    public final ExtraFields mextraFields;
    public final String mid;
    public final Boolean mis_registered;
    public final String mmail_address;
    public final String mtenant_id;

    public static final class ExtraFields extends Message<ExtraFields, C50250a> {
        public static final ProtoAdapter<ExtraFields> ADAPTER = new C50251b();
        public static final Boolean DEFAULT_IS_IN_CHAT = false;
        public static final Boolean DEFAULT_IS_READ_MESSAGE = false;
        private static final long serialVersionUID = 0;
        public final Boolean mis_in_chat;
        public final Boolean mis_read_message;

        /* renamed from: com.ss.android.lark.pb.usearch.UserMeta$ExtraFields$b */
        private static final class C50251b extends ProtoAdapter<ExtraFields> {
            C50251b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtraFields.class);
            }

            /* renamed from: a */
            public int encodedSize(ExtraFields extraFields) {
                int i;
                int i2 = 0;
                if (extraFields.mis_in_chat != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, extraFields.mis_in_chat);
                } else {
                    i = 0;
                }
                if (extraFields.mis_read_message != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, extraFields.mis_read_message);
                }
                return i + i2 + extraFields.unknownFields().size();
            }

            /* renamed from: a */
            public ExtraFields decode(ProtoReader protoReader) throws IOException {
                C50250a aVar = new C50250a();
                aVar.f125573a = false;
                aVar.f125574b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125573a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125574b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExtraFields extraFields) throws IOException {
                if (extraFields.mis_in_chat != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, extraFields.mis_in_chat);
                }
                if (extraFields.mis_read_message != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, extraFields.mis_read_message);
                }
                protoWriter.writeBytes(extraFields.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.UserMeta$ExtraFields$a */
        public static final class C50250a extends Message.Builder<ExtraFields, C50250a> {

            /* renamed from: a */
            public Boolean f125573a;

            /* renamed from: b */
            public Boolean f125574b;

            /* renamed from: a */
            public ExtraFields build() {
                return new ExtraFields(this.f125573a, this.f125574b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50250a newBuilder() {
            C50250a aVar = new C50250a();
            aVar.f125573a = this.mis_in_chat;
            aVar.f125574b = this.mis_read_message;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mis_in_chat != null) {
                sb.append(", is_in_chat=");
                sb.append(this.mis_in_chat);
            }
            if (this.mis_read_message != null) {
                sb.append(", is_read_message=");
                sb.append(this.mis_read_message);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtraFields{");
            replace.append('}');
            return replace.toString();
        }

        public ExtraFields(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public ExtraFields(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mis_in_chat = bool;
            this.mis_read_message = bool2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.UserMeta$b */
    private static final class C50253b extends ProtoAdapter<UserMeta> {
        C50253b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(UserMeta userMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, userMeta.mid);
            int i8 = 0;
            if (userMeta.mis_registered != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, userMeta.mis_registered);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (userMeta.mtenant_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, userMeta.mtenant_id);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (userMeta.mmail_address != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, userMeta.mmail_address);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (userMeta.mdo_not_disturb_end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(5, userMeta.mdo_not_disturb_end_time);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (userMeta.maccept_sms_phone_urgent != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, userMeta.maccept_sms_phone_urgent);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (userMeta.mchat_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, userMeta.mchat_id);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (userMeta.mextraFields != null) {
                i7 = ExtraFields.ADAPTER.encodedSizeWithTag(8, userMeta.mextraFields);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (userMeta.menterprise_mail_address != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, userMeta.menterprise_mail_address);
            }
            return i15 + i8 + userMeta.unknownFields().size();
        }

        /* renamed from: a */
        public UserMeta decode(ProtoReader protoReader) throws IOException {
            C50252a aVar = new C50252a();
            aVar.f125575a = "";
            aVar.f125576b = false;
            aVar.f125577c = "";
            aVar.f125578d = "";
            aVar.f125579e = 0L;
            aVar.f125580f = false;
            aVar.f125581g = "";
            aVar.f125583i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125575a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125576b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125577c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125578d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125579e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125580f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125581g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125582h = ExtraFields.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125583i = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UserMeta userMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userMeta.mid);
            if (userMeta.mis_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, userMeta.mis_registered);
            }
            if (userMeta.mtenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userMeta.mtenant_id);
            }
            if (userMeta.mmail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userMeta.mmail_address);
            }
            if (userMeta.mdo_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, userMeta.mdo_not_disturb_end_time);
            }
            if (userMeta.maccept_sms_phone_urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, userMeta.maccept_sms_phone_urgent);
            }
            if (userMeta.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, userMeta.mchat_id);
            }
            if (userMeta.mextraFields != null) {
                ExtraFields.ADAPTER.encodeWithTag(protoWriter, 8, userMeta.mextraFields);
            }
            if (userMeta.menterprise_mail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, userMeta.menterprise_mail_address);
            }
            protoWriter.writeBytes(userMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.UserMeta$a */
    public static final class C50252a extends Message.Builder<UserMeta, C50252a> {

        /* renamed from: a */
        public String f125575a;

        /* renamed from: b */
        public Boolean f125576b;

        /* renamed from: c */
        public String f125577c;

        /* renamed from: d */
        public String f125578d;

        /* renamed from: e */
        public Long f125579e;

        /* renamed from: f */
        public Boolean f125580f;

        /* renamed from: g */
        public String f125581g;

        /* renamed from: h */
        public ExtraFields f125582h;

        /* renamed from: i */
        public String f125583i;

        /* renamed from: a */
        public UserMeta build() {
            String str = this.f125575a;
            if (str != null) {
                return new UserMeta(str, this.f125576b, this.f125577c, this.f125578d, this.f125579e, this.f125580f, this.f125581g, this.f125582h, this.f125583i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50252a newBuilder() {
        C50252a aVar = new C50252a();
        aVar.f125575a = this.mid;
        aVar.f125576b = this.mis_registered;
        aVar.f125577c = this.mtenant_id;
        aVar.f125578d = this.mmail_address;
        aVar.f125579e = this.mdo_not_disturb_end_time;
        aVar.f125580f = this.maccept_sms_phone_urgent;
        aVar.f125581g = this.mchat_id;
        aVar.f125582h = this.mextraFields;
        aVar.f125583i = this.menterprise_mail_address;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mis_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.mis_registered);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        if (this.mmail_address != null) {
            sb.append(", mail_address=");
            sb.append(this.mmail_address);
        }
        if (this.mdo_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.mdo_not_disturb_end_time);
        }
        if (this.maccept_sms_phone_urgent != null) {
            sb.append(", accept_sms_phone_urgent=");
            sb.append(this.maccept_sms_phone_urgent);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mextraFields != null) {
            sb.append(", extraFields=");
            sb.append(this.mextraFields);
        }
        if (this.menterprise_mail_address != null) {
            sb.append(", enterprise_mail_address=");
            sb.append(this.menterprise_mail_address);
        }
        StringBuilder replace = sb.replace(0, 2, "UserMeta{");
        replace.append('}');
        return replace.toString();
    }

    public UserMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2, String str4, ExtraFields extraFields, String str5) {
        this(str, bool, str2, str3, l, bool2, str4, extraFields, str5, ByteString.EMPTY);
    }

    public UserMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2, String str4, ExtraFields extraFields, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mis_registered = bool;
        this.mtenant_id = str2;
        this.mmail_address = str3;
        this.mdo_not_disturb_end_time = l;
        this.maccept_sms_phone_urgent = bool2;
        this.mchat_id = str4;
        this.mextraFields = extraFields;
        this.menterprise_mail_address = str5;
    }
}
