package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class OpenAppData extends Message<OpenAppData, C17196a> {
    public static final ProtoAdapter<OpenAppData> ADAPTER = new C17197b();
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Boolean DEFAULT_IS_SHORTCUT = false;
    public static final Long DEFAULT_RANK_TIME = 0L;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String android_schema;
    public final String avatar_key;
    public final List<String> avatar_urls;
    public final Long display_time;
    public final String ios_schema;
    public final Boolean is_remind;
    public final Boolean is_shortcut;
    public final String last_notification_seq_id;
    public final String localized_digest_message;
    public final String name;
    public final String pc_schema;
    public final Long rank_time;
    public final Integer unread_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.OpenAppData$b */
    private static final class C17197b extends ProtoAdapter<OpenAppData> {
        C17197b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenAppData.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenAppData openAppData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, openAppData.name);
            int i10 = 0;
            if (openAppData.avatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, openAppData.avatar_key);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (openAppData.unread_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, openAppData.unread_count);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i11 + i2 + ProtoAdapter.BOOL.encodedSizeWithTag(4, openAppData.is_remind);
            if (openAppData.is_shortcut != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, openAppData.is_shortcut);
            } else {
                i3 = 0;
            }
            int i12 = encodedSizeWithTag2 + i3;
            if (openAppData.localized_digest_message != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, openAppData.localized_digest_message);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (openAppData.display_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(7, openAppData.display_time);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (openAppData.rank_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(8, openAppData.rank_time);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag3 = i14 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, openAppData.avatar_urls);
            if (openAppData.android_schema != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, openAppData.android_schema);
            } else {
                i7 = 0;
            }
            int i15 = encodedSizeWithTag3 + i7;
            if (openAppData.ios_schema != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, openAppData.ios_schema);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (openAppData.pc_schema != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, openAppData.pc_schema);
            } else {
                i9 = 0;
            }
            int i17 = i16 + i9;
            if (openAppData.last_notification_seq_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(13, openAppData.last_notification_seq_id);
            }
            return i17 + i10 + openAppData.unknownFields().size();
        }

        /* renamed from: a */
        public OpenAppData decode(ProtoReader protoReader) throws IOException {
            C17196a aVar = new C17196a();
            aVar.f43970a = "";
            aVar.f43971b = "";
            aVar.f43972c = 0;
            aVar.f43973d = false;
            aVar.f43974e = false;
            aVar.f43975f = "";
            aVar.f43976g = 0L;
            aVar.f43977h = 0L;
            aVar.f43979j = "";
            aVar.f43980k = "";
            aVar.f43981l = "";
            aVar.f43982m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43970a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43971b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43972c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43973d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43974e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43975f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43976g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43977h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43978i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            aVar.f43979j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43980k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43981l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f43982m = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, OpenAppData openAppData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openAppData.name);
            if (openAppData.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, openAppData.avatar_key);
            }
            if (openAppData.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, openAppData.unread_count);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, openAppData.is_remind);
            if (openAppData.is_shortcut != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, openAppData.is_shortcut);
            }
            if (openAppData.localized_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, openAppData.localized_digest_message);
            }
            if (openAppData.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, openAppData.display_time);
            }
            if (openAppData.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, openAppData.rank_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, openAppData.avatar_urls);
            if (openAppData.android_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, openAppData.android_schema);
            }
            if (openAppData.ios_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, openAppData.ios_schema);
            }
            if (openAppData.pc_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, openAppData.pc_schema);
            }
            if (openAppData.last_notification_seq_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, openAppData.last_notification_seq_id);
            }
            protoWriter.writeBytes(openAppData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.OpenAppData$a */
    public static final class C17196a extends Message.Builder<OpenAppData, C17196a> {

        /* renamed from: a */
        public String f43970a;

        /* renamed from: b */
        public String f43971b;

        /* renamed from: c */
        public Integer f43972c;

        /* renamed from: d */
        public Boolean f43973d;

        /* renamed from: e */
        public Boolean f43974e;

        /* renamed from: f */
        public String f43975f;

        /* renamed from: g */
        public Long f43976g;

        /* renamed from: h */
        public Long f43977h;

        /* renamed from: i */
        public List<String> f43978i = Internal.newMutableList();

        /* renamed from: j */
        public String f43979j;

        /* renamed from: k */
        public String f43980k;

        /* renamed from: l */
        public String f43981l;

        /* renamed from: m */
        public String f43982m;

        /* renamed from: a */
        public OpenAppData build() {
            Boolean bool;
            String str = this.f43970a;
            if (str != null && (bool = this.f43973d) != null) {
                return new OpenAppData(str, this.f43971b, this.f43972c, bool, this.f43974e, this.f43975f, this.f43976g, this.f43977h, this.f43978i, this.f43979j, this.f43980k, this.f43981l, this.f43982m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "name", this.f43973d, "is_remind");
        }
    }

    @Override // com.squareup.wire.Message
    public C17196a newBuilder() {
        C17196a aVar = new C17196a();
        aVar.f43970a = this.name;
        aVar.f43971b = this.avatar_key;
        aVar.f43972c = this.unread_count;
        aVar.f43973d = this.is_remind;
        aVar.f43974e = this.is_shortcut;
        aVar.f43975f = this.localized_digest_message;
        aVar.f43976g = this.display_time;
        aVar.f43977h = this.rank_time;
        aVar.f43978i = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f43979j = this.android_schema;
        aVar.f43980k = this.ios_schema;
        aVar.f43981l = this.pc_schema;
        aVar.f43982m = this.last_notification_seq_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "OpenAppData");
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        sb.append(", is_remind=");
        sb.append(this.is_remind);
        if (this.is_shortcut != null) {
            sb.append(", is_shortcut=");
            sb.append(this.is_shortcut);
        }
        if (this.localized_digest_message != null) {
            sb.append(", localized_digest_message=");
            sb.append(this.localized_digest_message);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.android_schema != null) {
            sb.append(", android_schema=");
            sb.append(this.android_schema);
        }
        if (this.ios_schema != null) {
            sb.append(", ios_schema=");
            sb.append(this.ios_schema);
        }
        if (this.pc_schema != null) {
            sb.append(", pc_schema=");
            sb.append(this.pc_schema);
        }
        if (this.last_notification_seq_id != null) {
            sb.append(", last_notification_seq_id=");
            sb.append(this.last_notification_seq_id);
        }
        StringBuilder replace = sb.replace(0, 2, "OpenAppData{");
        replace.append('}');
        return replace.toString();
    }

    public OpenAppData(String str, String str2, Integer num, Boolean bool, Boolean bool2, String str3, Long l, Long l2, List<String> list, String str4, String str5, String str6, String str7) {
        this(str, str2, num, bool, bool2, str3, l, l2, list, str4, str5, str6, str7, ByteString.EMPTY);
    }

    public OpenAppData(String str, String str2, Integer num, Boolean bool, Boolean bool2, String str3, Long l, Long l2, List<String> list, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.avatar_key = str2;
        this.unread_count = num;
        this.is_remind = bool;
        this.is_shortcut = bool2;
        this.localized_digest_message = str3;
        this.display_time = l;
        this.rank_time = l2;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.android_schema = str4;
        this.ios_schema = str5;
        this.pc_schema = str6;
        this.last_notification_seq_id = str7;
    }
}
