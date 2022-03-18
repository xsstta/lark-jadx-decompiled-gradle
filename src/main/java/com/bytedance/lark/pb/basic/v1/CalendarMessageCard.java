package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarMessageCard extends Message<CalendarMessageCard, C14716a> {
    public static final ProtoAdapter<CalendarMessageCard> ADAPTER = new C14717b();
    public static final Boolean DEFAULT_IS_PRIMARY = false;
    public static final Calendar.AccessRole DEFAULT_SELF_ACCESS_ROLE = Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
    public static final Integer DEFAULT_TYPE = 1;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String inviter_user_id;
    public final Boolean is_primary;
    public final Calendar.AccessRole self_access_role;
    public final String summary;
    public final Integer type;

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarMessageCard$b */
    private static final class C14717b extends ProtoAdapter<CalendarMessageCard> {
        C14717b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarMessageCard.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarMessageCard calendarMessageCard) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (calendarMessageCard.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarMessageCard.calendar_id);
            } else {
                i = 0;
            }
            if (calendarMessageCard.inviter_user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarMessageCard.inviter_user_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (calendarMessageCard.summary != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, calendarMessageCard.summary);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (calendarMessageCard.type != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, calendarMessageCard.type);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (calendarMessageCard.is_primary != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, calendarMessageCard.is_primary);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (calendarMessageCard.self_access_role != null) {
                i6 = Calendar.AccessRole.ADAPTER.encodedSizeWithTag(6, calendarMessageCard.self_access_role);
            }
            return i10 + i6 + calendarMessageCard.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarMessageCard decode(ProtoReader protoReader) throws IOException {
            C14716a aVar = new C14716a();
            aVar.f38934a = "";
            aVar.f38935b = "";
            aVar.f38936c = "";
            aVar.f38937d = 1;
            aVar.f38938e = false;
            aVar.f38939f = Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38934a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38935b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38936c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38937d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38938e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f38939f = Calendar.AccessRole.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, CalendarMessageCard calendarMessageCard) throws IOException {
            if (calendarMessageCard.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarMessageCard.calendar_id);
            }
            if (calendarMessageCard.inviter_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarMessageCard.inviter_user_id);
            }
            if (calendarMessageCard.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarMessageCard.summary);
            }
            if (calendarMessageCard.type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, calendarMessageCard.type);
            }
            if (calendarMessageCard.is_primary != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, calendarMessageCard.is_primary);
            }
            if (calendarMessageCard.self_access_role != null) {
                Calendar.AccessRole.ADAPTER.encodeWithTag(protoWriter, 6, calendarMessageCard.self_access_role);
            }
            protoWriter.writeBytes(calendarMessageCard.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarMessageCard$a */
    public static final class C14716a extends Message.Builder<CalendarMessageCard, C14716a> {

        /* renamed from: a */
        public String f38934a;

        /* renamed from: b */
        public String f38935b;

        /* renamed from: c */
        public String f38936c;

        /* renamed from: d */
        public Integer f38937d;

        /* renamed from: e */
        public Boolean f38938e;

        /* renamed from: f */
        public Calendar.AccessRole f38939f;

        /* renamed from: a */
        public CalendarMessageCard build() {
            return new CalendarMessageCard(this.f38934a, this.f38935b, this.f38936c, this.f38937d, this.f38938e, this.f38939f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14716a newBuilder() {
        C14716a aVar = new C14716a();
        aVar.f38934a = this.calendar_id;
        aVar.f38935b = this.inviter_user_id;
        aVar.f38936c = this.summary;
        aVar.f38937d = this.type;
        aVar.f38938e = this.is_primary;
        aVar.f38939f = this.self_access_role;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CalendarMessageCard");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.inviter_user_id != null) {
            sb.append(", inviter_user_id=");
            sb.append(this.inviter_user_id);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.is_primary != null) {
            sb.append(", is_primary=");
            sb.append(this.is_primary);
        }
        if (this.self_access_role != null) {
            sb.append(", self_access_role=");
            sb.append(this.self_access_role);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarMessageCard{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarMessageCard(String str, String str2, String str3, Integer num, Boolean bool, Calendar.AccessRole accessRole) {
        this(str, str2, str3, num, bool, accessRole, ByteString.EMPTY);
    }

    public CalendarMessageCard(String str, String str2, String str3, Integer num, Boolean bool, Calendar.AccessRole accessRole, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.inviter_user_id = str2;
        this.summary = str3;
        this.type = num;
        this.is_primary = bool;
        this.self_access_role = accessRole;
    }
}
