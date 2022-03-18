package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserAttendeeBaseInfo extends Message<UserAttendeeBaseInfo, C16112a> {
    public static final ProtoAdapter<UserAttendeeBaseInfo> ADAPTER = new C16113b();
    private static final long serialVersionUID = 0;
    public final String attendee_calendar_id;
    public final String avatar_key;
    public final String avatar_path;
    public final String display_name;
    public final String timezone_id;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UserAttendeeBaseInfo$b */
    private static final class C16113b extends ProtoAdapter<UserAttendeeBaseInfo> {
        C16113b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserAttendeeBaseInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UserAttendeeBaseInfo userAttendeeBaseInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (userAttendeeBaseInfo.attendee_calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, userAttendeeBaseInfo.attendee_calendar_id);
            } else {
                i = 0;
            }
            if (userAttendeeBaseInfo.display_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, userAttendeeBaseInfo.display_name);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (userAttendeeBaseInfo.avatar_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, userAttendeeBaseInfo.avatar_key);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (userAttendeeBaseInfo.avatar_path != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, userAttendeeBaseInfo.avatar_path);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (userAttendeeBaseInfo.timezone_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, userAttendeeBaseInfo.timezone_id);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (userAttendeeBaseInfo.user_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, userAttendeeBaseInfo.user_id);
            }
            return i10 + i6 + userAttendeeBaseInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UserAttendeeBaseInfo decode(ProtoReader protoReader) throws IOException {
            C16112a aVar = new C16112a();
            aVar.f42198a = "";
            aVar.f42199b = "";
            aVar.f42200c = "";
            aVar.f42201d = "";
            aVar.f42202e = "";
            aVar.f42203f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42198a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42199b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42200c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42201d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42202e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42203f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UserAttendeeBaseInfo userAttendeeBaseInfo) throws IOException {
            if (userAttendeeBaseInfo.attendee_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userAttendeeBaseInfo.attendee_calendar_id);
            }
            if (userAttendeeBaseInfo.display_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userAttendeeBaseInfo.display_name);
            }
            if (userAttendeeBaseInfo.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userAttendeeBaseInfo.avatar_key);
            }
            if (userAttendeeBaseInfo.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userAttendeeBaseInfo.avatar_path);
            }
            if (userAttendeeBaseInfo.timezone_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, userAttendeeBaseInfo.timezone_id);
            }
            if (userAttendeeBaseInfo.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, userAttendeeBaseInfo.user_id);
            }
            protoWriter.writeBytes(userAttendeeBaseInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UserAttendeeBaseInfo$a */
    public static final class C16112a extends Message.Builder<UserAttendeeBaseInfo, C16112a> {

        /* renamed from: a */
        public String f42198a;

        /* renamed from: b */
        public String f42199b;

        /* renamed from: c */
        public String f42200c;

        /* renamed from: d */
        public String f42201d;

        /* renamed from: e */
        public String f42202e;

        /* renamed from: f */
        public String f42203f;

        /* renamed from: a */
        public UserAttendeeBaseInfo build() {
            return new UserAttendeeBaseInfo(this.f42198a, this.f42199b, this.f42200c, this.f42201d, this.f42202e, this.f42203f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16112a newBuilder() {
        C16112a aVar = new C16112a();
        aVar.f42198a = this.attendee_calendar_id;
        aVar.f42199b = this.display_name;
        aVar.f42200c = this.avatar_key;
        aVar.f42201d = this.avatar_path;
        aVar.f42202e = this.timezone_id;
        aVar.f42203f = this.user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UserAttendeeBaseInfo");
        StringBuilder sb = new StringBuilder();
        if (this.attendee_calendar_id != null) {
            sb.append(", attendee_calendar_id=");
            sb.append(this.attendee_calendar_id);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.timezone_id != null) {
            sb.append(", timezone_id=");
            sb.append(this.timezone_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "UserAttendeeBaseInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UserAttendeeBaseInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public UserAttendeeBaseInfo(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.attendee_calendar_id = str;
        this.display_name = str2;
        this.avatar_key = str3;
        this.avatar_path = str4;
        this.timezone_id = str5;
        this.user_id = str6;
    }
}
