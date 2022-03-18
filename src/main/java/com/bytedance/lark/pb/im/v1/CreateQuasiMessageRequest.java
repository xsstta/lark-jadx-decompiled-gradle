package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiContent;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class CreateQuasiMessageRequest extends Message<CreateQuasiMessageRequest, C17374a> {
    public static final ProtoAdapter<CreateQuasiMessageRequest> ADAPTER = new C17375b();
    public static final Long DEFAULT_IMAGE_COMPRESSED_SIZE_KB = 0L;
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Boolean DEFAULT_SHOULD_NOTIFY = true;
    public static final Message.Type DEFAULT_TYPE = Message.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final String chat_id;
    public final String cid;
    public final QuasiContent content;
    public final Long image_compressed_size_kb;
    public final Boolean is_anonymous;
    public final String parent_id;
    public final Integer position;
    public final String root_id;
    public final Boolean should_notify;
    public final String thread_id;
    public final Message.Type type;
    public final String upload_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateQuasiMessageRequest$b */
    private static final class C17375b extends ProtoAdapter<CreateQuasiMessageRequest> {
        C17375b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateQuasiMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateQuasiMessageRequest createQuasiMessageRequest) {
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
            int encodedSizeWithTag = Message.Type.ADAPTER.encodedSizeWithTag(1, createQuasiMessageRequest.type);
            int i11 = 0;
            if (createQuasiMessageRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, createQuasiMessageRequest.chat_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + QuasiContent.ADAPTER.encodedSizeWithTag(3, createQuasiMessageRequest.content);
            if (createQuasiMessageRequest.root_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, createQuasiMessageRequest.root_id);
            } else {
                i2 = 0;
            }
            int i12 = encodedSizeWithTag2 + i2;
            if (createQuasiMessageRequest.parent_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, createQuasiMessageRequest.parent_id);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (createQuasiMessageRequest.should_notify != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, createQuasiMessageRequest.should_notify);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (createQuasiMessageRequest.image_compressed_size_kb != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(7, createQuasiMessageRequest.image_compressed_size_kb);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (createQuasiMessageRequest.channel != null) {
                i6 = Channel.ADAPTER.encodedSizeWithTag(8, createQuasiMessageRequest.channel);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (createQuasiMessageRequest.thread_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, createQuasiMessageRequest.thread_id);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (createQuasiMessageRequest.upload_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, createQuasiMessageRequest.upload_id);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (createQuasiMessageRequest.is_anonymous != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(11, createQuasiMessageRequest.is_anonymous);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (createQuasiMessageRequest.position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(12, createQuasiMessageRequest.position);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (createQuasiMessageRequest.cid != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(13, createQuasiMessageRequest.cid);
            }
            return i20 + i11 + createQuasiMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateQuasiMessageRequest decode(ProtoReader protoReader) throws IOException {
            C17374a aVar = new C17374a();
            aVar.f44257a = Message.Type.UNKNOWN;
            aVar.f44258b = "";
            aVar.f44260d = "";
            aVar.f44261e = "";
            aVar.f44262f = true;
            aVar.f44263g = 0L;
            aVar.f44265i = "";
            aVar.f44266j = "";
            aVar.f44267k = false;
            aVar.f44268l = 0;
            aVar.f44269m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f44257a = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f44258b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44259c = QuasiContent.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44260d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44261e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44262f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44263g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44264h = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44265i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f44266j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f44267k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f44268l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f44269m = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CreateQuasiMessageRequest createQuasiMessageRequest) throws IOException {
            Message.Type.ADAPTER.encodeWithTag(protoWriter, 1, createQuasiMessageRequest.type);
            if (createQuasiMessageRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createQuasiMessageRequest.chat_id);
            }
            QuasiContent.ADAPTER.encodeWithTag(protoWriter, 3, createQuasiMessageRequest.content);
            if (createQuasiMessageRequest.root_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createQuasiMessageRequest.root_id);
            }
            if (createQuasiMessageRequest.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, createQuasiMessageRequest.parent_id);
            }
            if (createQuasiMessageRequest.should_notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, createQuasiMessageRequest.should_notify);
            }
            if (createQuasiMessageRequest.image_compressed_size_kb != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, createQuasiMessageRequest.image_compressed_size_kb);
            }
            if (createQuasiMessageRequest.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 8, createQuasiMessageRequest.channel);
            }
            if (createQuasiMessageRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, createQuasiMessageRequest.thread_id);
            }
            if (createQuasiMessageRequest.upload_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, createQuasiMessageRequest.upload_id);
            }
            if (createQuasiMessageRequest.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, createQuasiMessageRequest.is_anonymous);
            }
            if (createQuasiMessageRequest.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, createQuasiMessageRequest.position);
            }
            if (createQuasiMessageRequest.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, createQuasiMessageRequest.cid);
            }
            protoWriter.writeBytes(createQuasiMessageRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17374a newBuilder() {
        C17374a aVar = new C17374a();
        aVar.f44257a = this.type;
        aVar.f44258b = this.chat_id;
        aVar.f44259c = this.content;
        aVar.f44260d = this.root_id;
        aVar.f44261e = this.parent_id;
        aVar.f44262f = this.should_notify;
        aVar.f44263g = this.image_compressed_size_kb;
        aVar.f44264h = this.channel;
        aVar.f44265i = this.thread_id;
        aVar.f44266j = this.upload_id;
        aVar.f44267k = this.is_anonymous;
        aVar.f44268l = this.position;
        aVar.f44269m = this.cid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateQuasiMessageRequest$a */
    public static final class C17374a extends Message.Builder<CreateQuasiMessageRequest, C17374a> {

        /* renamed from: a */
        public Message.Type f44257a;

        /* renamed from: b */
        public String f44258b;

        /* renamed from: c */
        public QuasiContent f44259c;

        /* renamed from: d */
        public String f44260d;

        /* renamed from: e */
        public String f44261e;

        /* renamed from: f */
        public Boolean f44262f;

        /* renamed from: g */
        public Long f44263g;

        /* renamed from: h */
        public Channel f44264h;

        /* renamed from: i */
        public String f44265i;

        /* renamed from: j */
        public String f44266j;

        /* renamed from: k */
        public Boolean f44267k;

        /* renamed from: l */
        public Integer f44268l;

        /* renamed from: m */
        public String f44269m;

        /* renamed from: a */
        public CreateQuasiMessageRequest build() {
            QuasiContent quasiContent;
            Message.Type type = this.f44257a;
            if (type != null && (quasiContent = this.f44259c) != null) {
                return new CreateQuasiMessageRequest(type, this.f44258b, quasiContent, this.f44260d, this.f44261e, this.f44262f, this.f44263g, this.f44264h, this.f44265i, this.f44266j, this.f44267k, this.f44268l, this.f44269m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f44259c, "content");
        }

        /* renamed from: a */
        public C17374a mo60979a(Channel channel) {
            this.f44264h = channel;
            return this;
        }

        /* renamed from: b */
        public C17374a mo60986b(String str) {
            this.f44260d = str;
            return this;
        }

        /* renamed from: c */
        public C17374a mo60987c(String str) {
            this.f44261e = str;
            return this;
        }

        /* renamed from: d */
        public C17374a mo60988d(String str) {
            this.f44265i = str;
            return this;
        }

        /* renamed from: e */
        public C17374a mo60989e(String str) {
            this.f44266j = str;
            return this;
        }

        /* renamed from: f */
        public C17374a mo60990f(String str) {
            this.f44269m = str;
            return this;
        }

        /* renamed from: a */
        public C17374a mo60980a(Message.Type type) {
            this.f44257a = type;
            return this;
        }

        /* renamed from: a */
        public C17374a mo60981a(QuasiContent quasiContent) {
            this.f44259c = quasiContent;
            return this;
        }

        /* renamed from: a */
        public C17374a mo60982a(Boolean bool) {
            this.f44267k = bool;
            return this;
        }

        /* renamed from: a */
        public C17374a mo60983a(Long l) {
            this.f44263g = l;
            return this;
        }

        /* renamed from: a */
        public C17374a mo60984a(String str) {
            this.f44258b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateQuasiMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        sb.append(", content=");
        sb.append(this.content);
        if (this.root_id != null) {
            sb.append(", root_id=");
            sb.append(this.root_id);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.should_notify != null) {
            sb.append(", should_notify=");
            sb.append(this.should_notify);
        }
        if (this.image_compressed_size_kb != null) {
            sb.append(", image_compressed_size_kb=");
            sb.append(this.image_compressed_size_kb);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.upload_id != null) {
            sb.append(", upload_id=");
            sb.append(this.upload_id);
        }
        if (this.is_anonymous != null) {
            sb.append(", is_anonymous=");
            sb.append(this.is_anonymous);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateQuasiMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateQuasiMessageRequest(Message.Type type2, String str, QuasiContent quasiContent, String str2, String str3, Boolean bool, Long l, Channel channel2, String str4, String str5, Boolean bool2, Integer num, String str6) {
        this(type2, str, quasiContent, str2, str3, bool, l, channel2, str4, str5, bool2, num, str6, ByteString.EMPTY);
    }

    public CreateQuasiMessageRequest(Message.Type type2, String str, QuasiContent quasiContent, String str2, String str3, Boolean bool, Long l, Channel channel2, String str4, String str5, Boolean bool2, Integer num, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.chat_id = str;
        this.content = quasiContent;
        this.root_id = str2;
        this.parent_id = str3;
        this.should_notify = bool;
        this.image_compressed_size_kb = l;
        this.channel = channel2;
        this.thread_id = str4;
        this.upload_id = str5;
        this.is_anonymous = bool2;
        this.position = num;
        this.cid = str6;
    }
}
