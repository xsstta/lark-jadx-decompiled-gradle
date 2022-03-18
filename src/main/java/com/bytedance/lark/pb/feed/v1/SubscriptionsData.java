package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SubscriptionsData extends Message<SubscriptionsData, C17234a> {
    public static final ProtoAdapter<SubscriptionsData> ADAPTER = new C17235b();
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Boolean DEFAULT_IS_SHORTCUT = false;
    public static final Long DEFAULT_RANK_TIME = 0L;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final Long display_time;
    public final Boolean is_remind;
    public final Boolean is_shortcut;
    public final String localized_digest_message;
    public final String name;
    public final Long rank_time;
    public final String schema;
    public final Integer unread_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.SubscriptionsData$b */
    private static final class C17235b extends ProtoAdapter<SubscriptionsData> {
        C17235b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscriptionsData.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscriptionsData subscriptionsData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (subscriptionsData.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, subscriptionsData.name);
            } else {
                i = 0;
            }
            if (subscriptionsData.avatar_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, subscriptionsData.avatar_key);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (subscriptionsData.localized_digest_message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, subscriptionsData.localized_digest_message);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (subscriptionsData.schema != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, subscriptionsData.schema);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (subscriptionsData.unread_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, subscriptionsData.unread_count);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (subscriptionsData.is_remind != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, subscriptionsData.is_remind);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (subscriptionsData.is_shortcut != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, subscriptionsData.is_shortcut);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (subscriptionsData.display_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, subscriptionsData.display_time);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (subscriptionsData.rank_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, subscriptionsData.rank_time);
            }
            return i16 + i9 + subscriptionsData.unknownFields().size();
        }

        /* renamed from: a */
        public SubscriptionsData decode(ProtoReader protoReader) throws IOException {
            C17234a aVar = new C17234a();
            aVar.f44037a = "";
            aVar.f44038b = "";
            aVar.f44039c = "";
            aVar.f44040d = "";
            aVar.f44041e = 0;
            aVar.f44042f = false;
            aVar.f44043g = false;
            aVar.f44044h = 0L;
            aVar.f44045i = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44037a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44038b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44039c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44040d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44041e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44042f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44043g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44044h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44045i = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SubscriptionsData subscriptionsData) throws IOException {
            if (subscriptionsData.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subscriptionsData.name);
            }
            if (subscriptionsData.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subscriptionsData.avatar_key);
            }
            if (subscriptionsData.localized_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, subscriptionsData.localized_digest_message);
            }
            if (subscriptionsData.schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, subscriptionsData.schema);
            }
            if (subscriptionsData.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, subscriptionsData.unread_count);
            }
            if (subscriptionsData.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, subscriptionsData.is_remind);
            }
            if (subscriptionsData.is_shortcut != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, subscriptionsData.is_shortcut);
            }
            if (subscriptionsData.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, subscriptionsData.display_time);
            }
            if (subscriptionsData.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, subscriptionsData.rank_time);
            }
            protoWriter.writeBytes(subscriptionsData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.SubscriptionsData$a */
    public static final class C17234a extends Message.Builder<SubscriptionsData, C17234a> {

        /* renamed from: a */
        public String f44037a;

        /* renamed from: b */
        public String f44038b;

        /* renamed from: c */
        public String f44039c;

        /* renamed from: d */
        public String f44040d;

        /* renamed from: e */
        public Integer f44041e;

        /* renamed from: f */
        public Boolean f44042f;

        /* renamed from: g */
        public Boolean f44043g;

        /* renamed from: h */
        public Long f44044h;

        /* renamed from: i */
        public Long f44045i;

        /* renamed from: a */
        public SubscriptionsData build() {
            return new SubscriptionsData(this.f44037a, this.f44038b, this.f44039c, this.f44040d, this.f44041e, this.f44042f, this.f44043g, this.f44044h, this.f44045i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17234a newBuilder() {
        C17234a aVar = new C17234a();
        aVar.f44037a = this.name;
        aVar.f44038b = this.avatar_key;
        aVar.f44039c = this.localized_digest_message;
        aVar.f44040d = this.schema;
        aVar.f44041e = this.unread_count;
        aVar.f44042f = this.is_remind;
        aVar.f44043g = this.is_shortcut;
        aVar.f44044h = this.display_time;
        aVar.f44045i = this.rank_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "SubscriptionsData");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.localized_digest_message != null) {
            sb.append(", localized_digest_message=");
            sb.append(this.localized_digest_message);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        if (this.is_shortcut != null) {
            sb.append(", is_shortcut=");
            sb.append(this.is_shortcut);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscriptionsData{");
        replace.append('}');
        return replace.toString();
    }

    public SubscriptionsData(String str, String str2, String str3, String str4, Integer num, Boolean bool, Boolean bool2, Long l, Long l2) {
        this(str, str2, str3, str4, num, bool, bool2, l, l2, ByteString.EMPTY);
    }

    public SubscriptionsData(String str, String str2, String str3, String str4, Integer num, Boolean bool, Boolean bool2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.avatar_key = str2;
        this.localized_digest_message = str3;
        this.schema = str4;
        this.unread_count = num;
        this.is_remind = bool;
        this.is_shortcut = bool2;
        this.display_time = l;
        this.rank_time = l2;
    }
}
