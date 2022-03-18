package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AppFeedData extends Message<AppFeedData, C14688a> {
    public static final ProtoAdapter<AppFeedData> ADAPTER = new C14689b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String android_schema;
    public final String avatar_key;
    public final String avatar_path;
    public final Channel channel;
    public final Long create_time;
    public final String ios_schema;
    public final String last_notification_seq_id;
    public final String message_id;
    public final String pc_schema;

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppFeedData$b */
    private static final class C14689b extends ProtoAdapter<AppFeedData> {
        C14689b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppFeedData.class);
        }

        /* renamed from: a */
        public int encodedSize(AppFeedData appFeedData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (appFeedData.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, appFeedData.message_id);
            } else {
                i = 0;
            }
            if (appFeedData.create_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, appFeedData.create_time);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (appFeedData.avatar_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, appFeedData.avatar_key);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (appFeedData.avatar_path != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, appFeedData.avatar_path);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (appFeedData.android_schema != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, appFeedData.android_schema);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (appFeedData.ios_schema != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, appFeedData.ios_schema);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (appFeedData.pc_schema != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, appFeedData.pc_schema);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (appFeedData.last_notification_seq_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, appFeedData.last_notification_seq_id);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (appFeedData.channel != null) {
                i9 = Channel.ADAPTER.encodedSizeWithTag(9, appFeedData.channel);
            }
            return i16 + i9 + appFeedData.unknownFields().size();
        }

        /* renamed from: a */
        public AppFeedData decode(ProtoReader protoReader) throws IOException {
            C14688a aVar = new C14688a();
            aVar.f38829a = "";
            aVar.f38830b = 0L;
            aVar.f38831c = "";
            aVar.f38832d = "";
            aVar.f38833e = "";
            aVar.f38834f = "";
            aVar.f38835g = "";
            aVar.f38836h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38829a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38830b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38831c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38832d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38833e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38834f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38835g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38836h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f38837i = Channel.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, AppFeedData appFeedData) throws IOException {
            if (appFeedData.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appFeedData.message_id);
            }
            if (appFeedData.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, appFeedData.create_time);
            }
            if (appFeedData.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, appFeedData.avatar_key);
            }
            if (appFeedData.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, appFeedData.avatar_path);
            }
            if (appFeedData.android_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, appFeedData.android_schema);
            }
            if (appFeedData.ios_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, appFeedData.ios_schema);
            }
            if (appFeedData.pc_schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, appFeedData.pc_schema);
            }
            if (appFeedData.last_notification_seq_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, appFeedData.last_notification_seq_id);
            }
            if (appFeedData.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 9, appFeedData.channel);
            }
            protoWriter.writeBytes(appFeedData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppFeedData$a */
    public static final class C14688a extends Message.Builder<AppFeedData, C14688a> {

        /* renamed from: a */
        public String f38829a;

        /* renamed from: b */
        public Long f38830b;

        /* renamed from: c */
        public String f38831c;

        /* renamed from: d */
        public String f38832d;

        /* renamed from: e */
        public String f38833e;

        /* renamed from: f */
        public String f38834f;

        /* renamed from: g */
        public String f38835g;

        /* renamed from: h */
        public String f38836h;

        /* renamed from: i */
        public Channel f38837i;

        /* renamed from: a */
        public AppFeedData build() {
            return new AppFeedData(this.f38829a, this.f38830b, this.f38831c, this.f38832d, this.f38833e, this.f38834f, this.f38835g, this.f38836h, this.f38837i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14688a newBuilder() {
        C14688a aVar = new C14688a();
        aVar.f38829a = this.message_id;
        aVar.f38830b = this.create_time;
        aVar.f38831c = this.avatar_key;
        aVar.f38832d = this.avatar_path;
        aVar.f38833e = this.android_schema;
        aVar.f38834f = this.ios_schema;
        aVar.f38835g = this.pc_schema;
        aVar.f38836h = this.last_notification_seq_id;
        aVar.f38837i = this.channel;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AppFeedData");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
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
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        StringBuilder replace = sb.replace(0, 2, "AppFeedData{");
        replace.append('}');
        return replace.toString();
    }

    public AppFeedData(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, Channel channel2) {
        this(str, l, str2, str3, str4, str5, str6, str7, channel2, ByteString.EMPTY);
    }

    public AppFeedData(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, Channel channel2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.create_time = l;
        this.avatar_key = str2;
        this.avatar_path = str3;
        this.android_schema = str4;
        this.ios_schema = str5;
        this.pc_schema = str6;
        this.last_notification_seq_id = str7;
        this.channel = channel2;
    }
}
