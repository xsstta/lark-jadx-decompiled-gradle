package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UserInfo extends Message<UserInfo, C15432a> {
    public static final ProtoAdapter<UserInfo> ADAPTER = new C15433b();
    public static final Long DEFAULT_AGREE_TIME = 0L;
    public static final Integer DEFAULT_LAST_SEVEN_DAY_ONLINE_MINUTES = 0;
    private static final long serialVersionUID = 0;
    public final Long agree_time;
    public final String alias;
    public final String avatar_key;
    public final String description;
    public final Integer last_seven_day_online_minutes;
    public final String name_py;
    public final String tenant_id;
    public final String tenant_name;
    public final String user_id;
    public final String user_name;

    /* renamed from: com.bytedance.lark.pb.basic.v1.UserInfo$b */
    private static final class C15433b extends ProtoAdapter<UserInfo> {
        C15433b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UserInfo userInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, userInfo.avatar_key) + ProtoAdapter.STRING.encodedSizeWithTag(2, userInfo.user_name);
            int i7 = 0;
            if (userInfo.name_py != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, userInfo.name_py);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (userInfo.tenant_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, userInfo.tenant_name);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (userInfo.last_seven_day_online_minutes != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, userInfo.last_seven_day_online_minutes);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i9 + i3 + ProtoAdapter.STRING.encodedSizeWithTag(6, userInfo.user_id);
            if (userInfo.tenant_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, userInfo.tenant_id);
            } else {
                i4 = 0;
            }
            int i10 = encodedSizeWithTag2 + i4;
            if (userInfo.alias != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, userInfo.alias);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (userInfo.description != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, userInfo.description);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (userInfo.agree_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(10, userInfo.agree_time);
            }
            return i12 + i7 + userInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UserInfo decode(ProtoReader protoReader) throws IOException {
            C15432a aVar = new C15432a();
            aVar.f40842a = "";
            aVar.f40843b = "";
            aVar.f40844c = "";
            aVar.f40845d = "";
            aVar.f40846e = 0;
            aVar.f40847f = "";
            aVar.f40848g = "";
            aVar.f40849h = "";
            aVar.f40850i = "";
            aVar.f40851j = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40842a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40843b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40844c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40845d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40846e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40847f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40848g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40849h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40850i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f40851j = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userInfo.avatar_key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userInfo.user_name);
            if (userInfo.name_py != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userInfo.name_py);
            }
            if (userInfo.tenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userInfo.tenant_name);
            }
            if (userInfo.last_seven_day_online_minutes != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, userInfo.last_seven_day_online_minutes);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, userInfo.user_id);
            if (userInfo.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, userInfo.tenant_id);
            }
            if (userInfo.alias != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, userInfo.alias);
            }
            if (userInfo.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, userInfo.description);
            }
            if (userInfo.agree_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, userInfo.agree_time);
            }
            protoWriter.writeBytes(userInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15432a newBuilder() {
        C15432a aVar = new C15432a();
        aVar.f40842a = this.avatar_key;
        aVar.f40843b = this.user_name;
        aVar.f40844c = this.name_py;
        aVar.f40845d = this.tenant_name;
        aVar.f40846e = this.last_seven_day_online_minutes;
        aVar.f40847f = this.user_id;
        aVar.f40848g = this.tenant_id;
        aVar.f40849h = this.alias;
        aVar.f40850i = this.description;
        aVar.f40851j = this.agree_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.UserInfo$a */
    public static final class C15432a extends Message.Builder<UserInfo, C15432a> {

        /* renamed from: a */
        public String f40842a;

        /* renamed from: b */
        public String f40843b;

        /* renamed from: c */
        public String f40844c;

        /* renamed from: d */
        public String f40845d;

        /* renamed from: e */
        public Integer f40846e;

        /* renamed from: f */
        public String f40847f;

        /* renamed from: g */
        public String f40848g;

        /* renamed from: h */
        public String f40849h;

        /* renamed from: i */
        public String f40850i;

        /* renamed from: j */
        public Long f40851j;

        /* renamed from: a */
        public UserInfo build() {
            String str;
            String str2;
            String str3 = this.f40842a;
            if (str3 != null && (str = this.f40843b) != null && (str2 = this.f40847f) != null) {
                return new UserInfo(str3, str, this.f40844c, this.f40845d, this.f40846e, str2, this.f40848g, this.f40849h, this.f40850i, this.f40851j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "avatar_key", this.f40843b, "user_name", this.f40847f, "user_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "UserInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", avatar_key=");
        sb.append(this.avatar_key);
        sb.append(", user_name=");
        sb.append(this.user_name);
        if (this.name_py != null) {
            sb.append(", name_py=");
            sb.append(this.name_py);
        }
        if (this.tenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.tenant_name);
        }
        if (this.last_seven_day_online_minutes != null) {
            sb.append(", last_seven_day_online_minutes=");
            sb.append(this.last_seven_day_online_minutes);
        }
        sb.append(", user_id=");
        sb.append(this.user_id);
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.agree_time != null) {
            sb.append(", agree_time=");
            sb.append(this.agree_time);
        }
        StringBuilder replace = sb.replace(0, 2, "UserInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UserInfo(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Long l) {
        this(str, str2, str3, str4, num, str5, str6, str7, str8, l, ByteString.EMPTY);
    }

    public UserInfo(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar_key = str;
        this.user_name = str2;
        this.name_py = str3;
        this.tenant_name = str4;
        this.last_seven_day_online_minutes = num;
        this.user_id = str5;
        this.tenant_id = str6;
        this.alias = str7;
        this.description = str8;
        this.agree_time = l;
    }
}
