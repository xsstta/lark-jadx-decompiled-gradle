package com.bytedance.lark.pb.basic.v1;

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

public final class Email extends Message<Email, C14900a> {
    public static final ProtoAdapter<Email> ADAPTER = new C14901b();
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Role DEFAULT_ROLE = Role.TO;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String last_message_id;
    public final Integer last_message_position;
    public final Integer new_message_count;
    public final String owner_id;
    public final List<String> reply_draft_ids;
    public final Role role;
    public final String subject;
    public final Long update_time;

    public enum Role implements WireEnum {
        TO(1),
        CC(2),
        STRANGER(3);
        
        public static final ProtoAdapter<Role> ADAPTER = ProtoAdapter.newEnumAdapter(Role.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Role fromValue(int i) {
            if (i == 1) {
                return TO;
            }
            if (i == 2) {
                return CC;
            }
            if (i != 3) {
                return null;
            }
            return STRANGER;
        }

        private Role(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Email$b */
    private static final class C14901b extends ProtoAdapter<Email> {
        C14901b() {
            super(FieldEncoding.LENGTH_DELIMITED, Email.class);
        }

        /* renamed from: a */
        public int encodedSize(Email email) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, email.id);
            int i7 = 0;
            if (email.owner_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, email.owner_id);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (email.last_message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, email.last_message_id);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (email.new_message_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, email.new_message_count);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (email.last_message_position != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, email.last_message_position);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (email.role != null) {
                i5 = Role.ADAPTER.encodedSizeWithTag(6, email.role);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag2 = i11 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, email.reply_draft_ids);
            if (email.subject != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, email.subject);
            } else {
                i6 = 0;
            }
            int i12 = encodedSizeWithTag2 + i6;
            if (email.update_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(9, email.update_time);
            }
            return i12 + i7 + email.unknownFields().size();
        }

        /* renamed from: a */
        public Email decode(ProtoReader protoReader) throws IOException {
            C14900a aVar = new C14900a();
            aVar.f39418a = "";
            aVar.f39419b = "";
            aVar.f39420c = "";
            aVar.f39421d = 0;
            aVar.f39422e = 0;
            aVar.f39423f = Role.TO;
            aVar.f39425h = "";
            aVar.f39426i = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39418a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39419b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39420c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39421d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39422e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f39423f = Role.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f39424g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f39425h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39426i = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Email email) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, email.id);
            if (email.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, email.owner_id);
            }
            if (email.last_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, email.last_message_id);
            }
            if (email.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, email.new_message_count);
            }
            if (email.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, email.last_message_position);
            }
            if (email.role != null) {
                Role.ADAPTER.encodeWithTag(protoWriter, 6, email.role);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, email.reply_draft_ids);
            if (email.subject != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, email.subject);
            }
            if (email.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, email.update_time);
            }
            protoWriter.writeBytes(email.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Email$a */
    public static final class C14900a extends Message.Builder<Email, C14900a> {

        /* renamed from: a */
        public String f39418a;

        /* renamed from: b */
        public String f39419b;

        /* renamed from: c */
        public String f39420c;

        /* renamed from: d */
        public Integer f39421d;

        /* renamed from: e */
        public Integer f39422e;

        /* renamed from: f */
        public Role f39423f;

        /* renamed from: g */
        public List<String> f39424g = Internal.newMutableList();

        /* renamed from: h */
        public String f39425h;

        /* renamed from: i */
        public Long f39426i;

        /* renamed from: a */
        public Email build() {
            String str = this.f39418a;
            if (str != null) {
                return new Email(str, this.f39419b, this.f39420c, this.f39421d, this.f39422e, this.f39423f, this.f39424g, this.f39425h, this.f39426i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14900a newBuilder() {
        C14900a aVar = new C14900a();
        aVar.f39418a = this.id;
        aVar.f39419b = this.owner_id;
        aVar.f39420c = this.last_message_id;
        aVar.f39421d = this.new_message_count;
        aVar.f39422e = this.last_message_position;
        aVar.f39423f = this.role;
        aVar.f39424g = Internal.copyOf("reply_draft_ids", this.reply_draft_ids);
        aVar.f39425h = this.subject;
        aVar.f39426i = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Email");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.last_message_id != null) {
            sb.append(", last_message_id=");
            sb.append(this.last_message_id);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.last_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.last_message_position);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (!this.reply_draft_ids.isEmpty()) {
            sb.append(", reply_draft_ids=");
            sb.append(this.reply_draft_ids);
        }
        if (this.subject != null) {
            sb.append(", subject=");
            sb.append(this.subject);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "Email{");
        replace.append('}');
        return replace.toString();
    }

    public Email(String str, String str2, String str3, Integer num, Integer num2, Role role2, List<String> list, String str4, Long l) {
        this(str, str2, str3, num, num2, role2, list, str4, l, ByteString.EMPTY);
    }

    public Email(String str, String str2, String str3, Integer num, Integer num2, Role role2, List<String> list, String str4, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.owner_id = str2;
        this.last_message_id = str3;
        this.new_message_count = num;
        this.last_message_position = num2;
        this.role = role2;
        this.reply_draft_ids = Internal.immutableCopyOf("reply_draft_ids", list);
        this.subject = str4;
        this.update_time = l;
    }
}
