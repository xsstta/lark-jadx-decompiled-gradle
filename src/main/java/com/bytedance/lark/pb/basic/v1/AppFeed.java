package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AppFeed extends Message<AppFeed, C14686a> {
    public static final ProtoAdapter<AppFeed> ADAPTER = new C14687b();
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Boolean DEFAULT_NOTIFICATION_ON = false;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String android_schema;
    public final String app_name;
    public final String avatar_key;
    public final String avatar_url;
    public final String id;
    public final String ios_schema;
    public final Boolean is_remind;
    public final String last_notification_seq_id;
    public final Boolean notification_on;
    public final String pc_schema;
    public final String summary;
    public final String tag;
    public final Integer unread_count;

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppFeed$b */
    private static final class C14687b extends ProtoAdapter<AppFeed> {
        C14687b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppFeed.class);
        }

        /* renamed from: a */
        public int encodedSize(AppFeed appFeed) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, appFeed.id);
            int i12 = 0;
            if (appFeed.avatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, appFeed.avatar_key);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (appFeed.avatar_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, appFeed.avatar_url);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (appFeed.app_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, appFeed.app_name);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (appFeed.tag != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, appFeed.tag);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (appFeed.summary != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, appFeed.summary);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (appFeed.pc_schema != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, appFeed.pc_schema);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (appFeed.ios_schema != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, appFeed.ios_schema);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (appFeed.android_schema != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, appFeed.android_schema);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (appFeed.last_notification_seq_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, appFeed.last_notification_seq_id);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (appFeed.unread_count != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, appFeed.unread_count);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (appFeed.notification_on != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, appFeed.notification_on);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (appFeed.is_remind != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(13, appFeed.is_remind);
            }
            return i23 + i12 + appFeed.unknownFields().size();
        }

        /* renamed from: a */
        public AppFeed decode(ProtoReader protoReader) throws IOException {
            C14686a aVar = new C14686a();
            aVar.f38816a = "";
            aVar.f38817b = "";
            aVar.f38818c = "";
            aVar.f38819d = "";
            aVar.f38820e = "";
            aVar.f38821f = "";
            aVar.f38822g = "";
            aVar.f38823h = "";
            aVar.f38824i = "";
            aVar.f38825j = "";
            aVar.f38826k = 0;
            aVar.f38827l = false;
            aVar.f38828m = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38816a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38817b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38818c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38819d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38820e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38821f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38822g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38823h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f38824i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f38825j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f38826k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f38827l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f38828m = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, AppFeed appFeed) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appFeed.id);
            if (appFeed.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, appFeed.avatar_key);
            }
            if (appFeed.avatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, appFeed.avatar_url);
            }
            if (appFeed.app_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, appFeed.app_name);
            }
            if (appFeed.tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, appFeed.tag);
            }
            if (appFeed.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, appFeed.summary);
            }
            if (appFeed.pc_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, appFeed.pc_schema);
            }
            if (appFeed.ios_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, appFeed.ios_schema);
            }
            if (appFeed.android_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, appFeed.android_schema);
            }
            if (appFeed.last_notification_seq_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, appFeed.last_notification_seq_id);
            }
            if (appFeed.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, appFeed.unread_count);
            }
            if (appFeed.notification_on != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, appFeed.notification_on);
            }
            if (appFeed.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, appFeed.is_remind);
            }
            protoWriter.writeBytes(appFeed.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppFeed$a */
    public static final class C14686a extends Message.Builder<AppFeed, C14686a> {

        /* renamed from: a */
        public String f38816a;

        /* renamed from: b */
        public String f38817b;

        /* renamed from: c */
        public String f38818c;

        /* renamed from: d */
        public String f38819d;

        /* renamed from: e */
        public String f38820e;

        /* renamed from: f */
        public String f38821f;

        /* renamed from: g */
        public String f38822g;

        /* renamed from: h */
        public String f38823h;

        /* renamed from: i */
        public String f38824i;

        /* renamed from: j */
        public String f38825j;

        /* renamed from: k */
        public Integer f38826k;

        /* renamed from: l */
        public Boolean f38827l;

        /* renamed from: m */
        public Boolean f38828m;

        /* renamed from: a */
        public AppFeed build() {
            String str = this.f38816a;
            if (str != null) {
                return new AppFeed(str, this.f38817b, this.f38818c, this.f38819d, this.f38820e, this.f38821f, this.f38822g, this.f38823h, this.f38824i, this.f38825j, this.f38826k, this.f38827l, this.f38828m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14686a newBuilder() {
        C14686a aVar = new C14686a();
        aVar.f38816a = this.id;
        aVar.f38817b = this.avatar_key;
        aVar.f38818c = this.avatar_url;
        aVar.f38819d = this.app_name;
        aVar.f38820e = this.tag;
        aVar.f38821f = this.summary;
        aVar.f38822g = this.pc_schema;
        aVar.f38823h = this.ios_schema;
        aVar.f38824i = this.android_schema;
        aVar.f38825j = this.last_notification_seq_id;
        aVar.f38826k = this.unread_count;
        aVar.f38827l = this.notification_on;
        aVar.f38828m = this.is_remind;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AppFeed");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (this.app_name != null) {
            sb.append(", app_name=");
            sb.append(this.app_name);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.pc_schema != null) {
            sb.append(", pc_schema=");
            sb.append(this.pc_schema);
        }
        if (this.ios_schema != null) {
            sb.append(", ios_schema=");
            sb.append(this.ios_schema);
        }
        if (this.android_schema != null) {
            sb.append(", android_schema=");
            sb.append(this.android_schema);
        }
        if (this.last_notification_seq_id != null) {
            sb.append(", last_notification_seq_id=");
            sb.append(this.last_notification_seq_id);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.notification_on != null) {
            sb.append(", notification_on=");
            sb.append(this.notification_on);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        StringBuilder replace = sb.replace(0, 2, "AppFeed{");
        replace.append('}');
        return replace.toString();
    }

    public AppFeed(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, num, bool, bool2, ByteString.EMPTY);
    }

    public AppFeed(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.avatar_key = str2;
        this.avatar_url = str3;
        this.app_name = str4;
        this.tag = str5;
        this.summary = str6;
        this.pc_schema = str7;
        this.ios_schema = str8;
        this.android_schema = str9;
        this.last_notification_seq_id = str10;
        this.unread_count = num;
        this.notification_on = bool;
        this.is_remind = bool2;
    }
}
