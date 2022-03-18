package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class EventAttendeeInfo extends Message<EventAttendeeInfo, C15606a> {
    public static final ProtoAdapter<EventAttendeeInfo> ADAPTER = new C15607b();
    public static final Integer DEFAULT_ACCEPT_NO = 0;
    public static final Boolean DEFAULT_ALL_INDIVIDUAL_ATTENDEE = false;
    public static final Integer DEFAULT_DECLINE_NO = 0;
    public static final Integer DEFAULT_NEED_ACTION_NO = 0;
    public static final Integer DEFAULT_TENTATIVE_NO = 0;
    public static final Integer DEFAULT_TOTAL_NO = 0;
    private static final long serialVersionUID = 0;
    public final Integer accept_no;
    public final Boolean all_individual_attendee;
    public final Integer decline_no;
    public final Integer need_action_no;
    public final String snapshot_page_token;
    public final Integer tentative_no;
    public final Integer total_no;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventAttendeeInfo$b */
    private static final class C15607b extends ProtoAdapter<EventAttendeeInfo> {
        C15607b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventAttendeeInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(EventAttendeeInfo eventAttendeeInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (eventAttendeeInfo.total_no != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, eventAttendeeInfo.total_no);
            } else {
                i = 0;
            }
            if (eventAttendeeInfo.accept_no != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, eventAttendeeInfo.accept_no);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (eventAttendeeInfo.decline_no != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, eventAttendeeInfo.decline_no);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (eventAttendeeInfo.tentative_no != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, eventAttendeeInfo.tentative_no);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (eventAttendeeInfo.need_action_no != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, eventAttendeeInfo.need_action_no);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (eventAttendeeInfo.all_individual_attendee != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, eventAttendeeInfo.all_individual_attendee);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (eventAttendeeInfo.snapshot_page_token != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, eventAttendeeInfo.snapshot_page_token);
            }
            return i12 + i7 + eventAttendeeInfo.unknownFields().size();
        }

        /* renamed from: a */
        public EventAttendeeInfo decode(ProtoReader protoReader) throws IOException {
            C15606a aVar = new C15606a();
            aVar.f41337a = 0;
            aVar.f41338b = 0;
            aVar.f41339c = 0;
            aVar.f41340d = 0;
            aVar.f41341e = 0;
            aVar.f41342f = false;
            aVar.f41343g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41337a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41338b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41339c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41340d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41341e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41342f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41343g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, EventAttendeeInfo eventAttendeeInfo) throws IOException {
            if (eventAttendeeInfo.total_no != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, eventAttendeeInfo.total_no);
            }
            if (eventAttendeeInfo.accept_no != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, eventAttendeeInfo.accept_no);
            }
            if (eventAttendeeInfo.decline_no != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, eventAttendeeInfo.decline_no);
            }
            if (eventAttendeeInfo.tentative_no != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, eventAttendeeInfo.tentative_no);
            }
            if (eventAttendeeInfo.need_action_no != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, eventAttendeeInfo.need_action_no);
            }
            if (eventAttendeeInfo.all_individual_attendee != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, eventAttendeeInfo.all_individual_attendee);
            }
            if (eventAttendeeInfo.snapshot_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, eventAttendeeInfo.snapshot_page_token);
            }
            protoWriter.writeBytes(eventAttendeeInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventAttendeeInfo$a */
    public static final class C15606a extends Message.Builder<EventAttendeeInfo, C15606a> {

        /* renamed from: a */
        public Integer f41337a;

        /* renamed from: b */
        public Integer f41338b;

        /* renamed from: c */
        public Integer f41339c;

        /* renamed from: d */
        public Integer f41340d;

        /* renamed from: e */
        public Integer f41341e;

        /* renamed from: f */
        public Boolean f41342f;

        /* renamed from: g */
        public String f41343g;

        /* renamed from: a */
        public EventAttendeeInfo build() {
            return new EventAttendeeInfo(this.f41337a, this.f41338b, this.f41339c, this.f41340d, this.f41341e, this.f41342f, this.f41343g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15606a mo56585a(Boolean bool) {
            this.f41342f = bool;
            return this;
        }

        /* renamed from: b */
        public C15606a mo56589b(Integer num) {
            this.f41338b = num;
            return this;
        }

        /* renamed from: c */
        public C15606a mo56590c(Integer num) {
            this.f41339c = num;
            return this;
        }

        /* renamed from: d */
        public C15606a mo56591d(Integer num) {
            this.f41340d = num;
            return this;
        }

        /* renamed from: e */
        public C15606a mo56592e(Integer num) {
            this.f41341e = num;
            return this;
        }

        /* renamed from: a */
        public C15606a mo56586a(Integer num) {
            this.f41337a = num;
            return this;
        }

        /* renamed from: a */
        public C15606a mo56587a(String str) {
            this.f41343g = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15606a newBuilder() {
        C15606a aVar = new C15606a();
        aVar.f41337a = this.total_no;
        aVar.f41338b = this.accept_no;
        aVar.f41339c = this.decline_no;
        aVar.f41340d = this.tentative_no;
        aVar.f41341e = this.need_action_no;
        aVar.f41342f = this.all_individual_attendee;
        aVar.f41343g = this.snapshot_page_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EventAttendeeInfo");
        StringBuilder sb = new StringBuilder();
        if (this.total_no != null) {
            sb.append(", total_no=");
            sb.append(this.total_no);
        }
        if (this.accept_no != null) {
            sb.append(", accept_no=");
            sb.append(this.accept_no);
        }
        if (this.decline_no != null) {
            sb.append(", decline_no=");
            sb.append(this.decline_no);
        }
        if (this.tentative_no != null) {
            sb.append(", tentative_no=");
            sb.append(this.tentative_no);
        }
        if (this.need_action_no != null) {
            sb.append(", need_action_no=");
            sb.append(this.need_action_no);
        }
        if (this.all_individual_attendee != null) {
            sb.append(", all_individual_attendee=");
            sb.append(this.all_individual_attendee);
        }
        if (this.snapshot_page_token != null) {
            sb.append(", snapshot_page_token=");
            sb.append(this.snapshot_page_token);
        }
        StringBuilder replace = sb.replace(0, 2, "EventAttendeeInfo{");
        replace.append('}');
        return replace.toString();
    }

    public EventAttendeeInfo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, String str) {
        this(num, num2, num3, num4, num5, bool, str, ByteString.EMPTY);
    }

    public EventAttendeeInfo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_no = num;
        this.accept_no = num2;
        this.decline_no = num3;
        this.tentative_no = num4;
        this.need_action_no = num5;
        this.all_individual_attendee = bool;
        this.snapshot_page_token = str;
    }
}
