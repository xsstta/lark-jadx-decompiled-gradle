package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Message;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class QuasiMessage extends Message<QuasiMessage, C15139a> {
    public static final ProtoAdapter<QuasiMessage> ADAPTER = new C15140b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_IMAGE_COMPRESSED_SIZE_KB = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_READ_COUNT = 1;
    public static final Boolean DEFAULT_SHOULD_NOTIFY = false;
    public static final Status DEFAULT_STATUS = Status.PENDING;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Message.Type DEFAULT_TYPE = Message.Type.UNKNOWN;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final String chat_id;
    public final String cid;
    public final Content content;
    public final Long create_time;
    public final String crypto_token;
    public final String from_id;
    public final String id;
    public final Long image_compressed_size_kb;
    public final String parent_id;
    public final String parent_source_id;
    public final Integer position;
    public final Integer read_count;
    public final String root_id;
    public final String root_source_id;
    public final Boolean should_notify;
    public final Status status;
    public final String thread_id;
    public final Integer thread_position;
    public final Message.Type type;
    public final List<String> unread_chatter_ids;
    public final Integer unread_count;
    public final Integer version;

    public enum Status implements WireEnum {
        PENDING(1),
        FAILED(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return PENDING;
            }
            if (i != 2) {
                return null;
            }
            return FAILED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.QuasiMessage$b */
    private static final class C15140b extends ProtoAdapter<QuasiMessage> {
        C15140b() {
            super(FieldEncoding.LENGTH_DELIMITED, QuasiMessage.class);
        }

        /* renamed from: a */
        public int encodedSize(QuasiMessage quasiMessage) {
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
            int i12;
            int i13;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, quasiMessage.cid) + ProtoAdapter.STRING.encodedSizeWithTag(2, quasiMessage.chat_id);
            int i14 = 0;
            if (quasiMessage.root_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, quasiMessage.root_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + Message.Type.ADAPTER.encodedSizeWithTag(4, quasiMessage.type) + ProtoAdapter.BOOL.encodedSizeWithTag(5, quasiMessage.should_notify);
            if (quasiMessage.position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(6, quasiMessage.position);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i2 + Content.ADAPTER.encodedSizeWithTag(7, quasiMessage.content);
            if (quasiMessage.parent_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(8, quasiMessage.parent_id);
            } else {
                i3 = 0;
            }
            int i15 = encodedSizeWithTag3 + i3;
            if (quasiMessage.parent_source_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(9, quasiMessage.parent_source_id);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (quasiMessage.root_source_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(10, quasiMessage.root_source_id);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag4 = i16 + i5 + ProtoAdapter.STRING.encodedSizeWithTag(11, quasiMessage.id) + ProtoAdapter.STRING.encodedSizeWithTag(12, quasiMessage.from_id) + ProtoAdapter.INT64.encodedSizeWithTag(13, quasiMessage.create_time);
            if (quasiMessage.unread_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(14, quasiMessage.unread_count);
            } else {
                i6 = 0;
            }
            int i17 = encodedSizeWithTag4 + i6;
            if (quasiMessage.read_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(15, quasiMessage.read_count);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag5 = i17 + i7 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(16, quasiMessage.unread_chatter_ids);
            if (quasiMessage.image_compressed_size_kb != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(17, quasiMessage.image_compressed_size_kb);
            } else {
                i8 = 0;
            }
            int i18 = encodedSizeWithTag5 + i8;
            if (quasiMessage.status != null) {
                i9 = Status.ADAPTER.encodedSizeWithTag(18, quasiMessage.status);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (quasiMessage.version != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(19, quasiMessage.version);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (quasiMessage.channel != null) {
                i11 = Channel.ADAPTER.encodedSizeWithTag(20, quasiMessage.channel);
            } else {
                i11 = 0;
            }
            int i21 = i20 + i11;
            if (quasiMessage.thread_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(21, quasiMessage.thread_id);
            } else {
                i12 = 0;
            }
            int i22 = i21 + i12;
            if (quasiMessage.thread_position != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(22, quasiMessage.thread_position);
            } else {
                i13 = 0;
            }
            int i23 = i22 + i13;
            if (quasiMessage.crypto_token != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(23, quasiMessage.crypto_token);
            }
            return i23 + i14 + quasiMessage.unknownFields().size();
        }

        /* renamed from: a */
        public QuasiMessage decode(ProtoReader protoReader) throws IOException {
            C15139a aVar = new C15139a();
            aVar.f40155a = "";
            aVar.f40156b = "";
            aVar.f40157c = "";
            aVar.f40158d = Message.Type.UNKNOWN;
            aVar.f40159e = false;
            aVar.f40160f = 0;
            aVar.f40162h = "";
            aVar.f40163i = "";
            aVar.f40164j = "";
            aVar.f40165k = "";
            aVar.f40166l = "";
            aVar.f40167m = 0L;
            aVar.f40168n = 0;
            aVar.f40169o = 1;
            aVar.f40171q = 0L;
            aVar.f40172r = Status.PENDING;
            aVar.f40173s = 0;
            aVar.f40175u = "";
            aVar.f40176v = 0;
            aVar.f40177w = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40155a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40156b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40157c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f40158d = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f40159e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40160f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40161g = Content.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40162h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40163i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f40164j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f40165k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f40166l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f40167m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            aVar.f40168n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f40169o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f40170p.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            aVar.f40171q = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 18:
                            try {
                                aVar.f40172r = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 19:
                            aVar.f40173s = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 20:
                            aVar.f40174t = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            aVar.f40175u = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            aVar.f40176v = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            aVar.f40177w = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, QuasiMessage quasiMessage) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quasiMessage.cid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, quasiMessage.chat_id);
            if (quasiMessage.root_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, quasiMessage.root_id);
            }
            Message.Type.ADAPTER.encodeWithTag(protoWriter, 4, quasiMessage.type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, quasiMessage.should_notify);
            if (quasiMessage.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, quasiMessage.position);
            }
            Content.ADAPTER.encodeWithTag(protoWriter, 7, quasiMessage.content);
            if (quasiMessage.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, quasiMessage.parent_id);
            }
            if (quasiMessage.parent_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, quasiMessage.parent_source_id);
            }
            if (quasiMessage.root_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, quasiMessage.root_source_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, quasiMessage.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, quasiMessage.from_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, quasiMessage.create_time);
            if (quasiMessage.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, quasiMessage.unread_count);
            }
            if (quasiMessage.read_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, quasiMessage.read_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 16, quasiMessage.unread_chatter_ids);
            if (quasiMessage.image_compressed_size_kb != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, quasiMessage.image_compressed_size_kb);
            }
            if (quasiMessage.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 18, quasiMessage.status);
            }
            if (quasiMessage.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, quasiMessage.version);
            }
            if (quasiMessage.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 20, quasiMessage.channel);
            }
            if (quasiMessage.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, quasiMessage.thread_id);
            }
            if (quasiMessage.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, quasiMessage.thread_position);
            }
            if (quasiMessage.crypto_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, quasiMessage.crypto_token);
            }
            protoWriter.writeBytes(quasiMessage.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15139a newBuilder() {
        C15139a aVar = new C15139a();
        aVar.f40155a = this.cid;
        aVar.f40156b = this.chat_id;
        aVar.f40157c = this.root_id;
        aVar.f40158d = this.type;
        aVar.f40159e = this.should_notify;
        aVar.f40160f = this.position;
        aVar.f40161g = this.content;
        aVar.f40162h = this.parent_id;
        aVar.f40163i = this.parent_source_id;
        aVar.f40164j = this.root_source_id;
        aVar.f40165k = this.id;
        aVar.f40166l = this.from_id;
        aVar.f40167m = this.create_time;
        aVar.f40168n = this.unread_count;
        aVar.f40169o = this.read_count;
        aVar.f40170p = Internal.copyOf("unread_chatter_ids", this.unread_chatter_ids);
        aVar.f40171q = this.image_compressed_size_kb;
        aVar.f40172r = this.status;
        aVar.f40173s = this.version;
        aVar.f40174t = this.channel;
        aVar.f40175u = this.thread_id;
        aVar.f40176v = this.thread_position;
        aVar.f40177w = this.crypto_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.QuasiMessage$a */
    public static final class C15139a extends Message.Builder<QuasiMessage, C15139a> {

        /* renamed from: a */
        public String f40155a;

        /* renamed from: b */
        public String f40156b;

        /* renamed from: c */
        public String f40157c;

        /* renamed from: d */
        public Message.Type f40158d;

        /* renamed from: e */
        public Boolean f40159e;

        /* renamed from: f */
        public Integer f40160f;

        /* renamed from: g */
        public Content f40161g;

        /* renamed from: h */
        public String f40162h;

        /* renamed from: i */
        public String f40163i;

        /* renamed from: j */
        public String f40164j;

        /* renamed from: k */
        public String f40165k;

        /* renamed from: l */
        public String f40166l;

        /* renamed from: m */
        public Long f40167m;

        /* renamed from: n */
        public Integer f40168n;

        /* renamed from: o */
        public Integer f40169o;

        /* renamed from: p */
        public List<String> f40170p = Internal.newMutableList();

        /* renamed from: q */
        public Long f40171q;

        /* renamed from: r */
        public Status f40172r;

        /* renamed from: s */
        public Integer f40173s;

        /* renamed from: t */
        public Channel f40174t;

        /* renamed from: u */
        public String f40175u;

        /* renamed from: v */
        public Integer f40176v;

        /* renamed from: w */
        public String f40177w;

        /* renamed from: a */
        public QuasiMessage build() {
            String str;
            Message.Type type;
            Boolean bool;
            Content content;
            String str2;
            String str3;
            Long l;
            String str4 = this.f40155a;
            if (str4 != null && (str = this.f40156b) != null && (type = this.f40158d) != null && (bool = this.f40159e) != null && (content = this.f40161g) != null && (str2 = this.f40165k) != null && (str3 = this.f40166l) != null && (l = this.f40167m) != null) {
                return new QuasiMessage(str4, str, this.f40157c, type, bool, this.f40160f, content, this.f40162h, this.f40163i, this.f40164j, str2, str3, l, this.f40168n, this.f40169o, this.f40170p, this.f40171q, this.f40172r, this.f40173s, this.f40174t, this.f40175u, this.f40176v, this.f40177w, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "cid", this.f40156b, "chat_id", this.f40158d, ShareHitPoint.f121869d, this.f40159e, "should_notify", this.f40161g, "content", this.f40165k, "id", this.f40166l, "from_id", this.f40167m, "create_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "QuasiMessage");
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.cid);
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.root_id != null) {
            sb.append(", root_id=");
            sb.append(this.root_id);
        }
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", should_notify=");
        sb.append(this.should_notify);
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        sb.append(", content=");
        sb.append(this.content);
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.parent_source_id != null) {
            sb.append(", parent_source_id=");
            sb.append(this.parent_source_id);
        }
        if (this.root_source_id != null) {
            sb.append(", root_source_id=");
            sb.append(this.root_source_id);
        }
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", from_id=");
        sb.append(this.from_id);
        sb.append(", create_time=");
        sb.append(this.create_time);
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.read_count != null) {
            sb.append(", read_count=");
            sb.append(this.read_count);
        }
        if (!this.unread_chatter_ids.isEmpty()) {
            sb.append(", unread_chatter_ids=");
            sb.append(this.unread_chatter_ids);
        }
        if (this.image_compressed_size_kb != null) {
            sb.append(", image_compressed_size_kb=");
            sb.append(this.image_compressed_size_kb);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.crypto_token != null) {
            sb.append(", crypto_token=");
            sb.append(this.crypto_token);
        }
        StringBuilder replace = sb.replace(0, 2, "QuasiMessage{");
        replace.append('}');
        return replace.toString();
    }

    public QuasiMessage(String str, String str2, String str3, Message.Type type2, Boolean bool, Integer num, Content content2, String str4, String str5, String str6, String str7, String str8, Long l, Integer num2, Integer num3, List<String> list, Long l2, Status status2, Integer num4, Channel channel2, String str9, Integer num5, String str10) {
        this(str, str2, str3, type2, bool, num, content2, str4, str5, str6, str7, str8, l, num2, num3, list, l2, status2, num4, channel2, str9, num5, str10, ByteString.EMPTY);
    }

    public QuasiMessage(String str, String str2, String str3, Message.Type type2, Boolean bool, Integer num, Content content2, String str4, String str5, String str6, String str7, String str8, Long l, Integer num2, Integer num3, List<String> list, Long l2, Status status2, Integer num4, Channel channel2, String str9, Integer num5, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.chat_id = str2;
        this.root_id = str3;
        this.type = type2;
        this.should_notify = bool;
        this.position = num;
        this.content = content2;
        this.parent_id = str4;
        this.parent_source_id = str5;
        this.root_source_id = str6;
        this.id = str7;
        this.from_id = str8;
        this.create_time = l;
        this.unread_count = num2;
        this.read_count = num3;
        this.unread_chatter_ids = Internal.immutableCopyOf("unread_chatter_ids", list);
        this.image_compressed_size_kb = l2;
        this.status = status2;
        this.version = num4;
        this.channel = channel2;
        this.thread_id = str9;
        this.thread_position = num5;
        this.crypto_token = str10;
    }
}
