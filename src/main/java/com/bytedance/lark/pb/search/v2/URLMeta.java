package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class URLMeta extends Message<URLMeta, C19047a> {
    public static final ProtoAdapter<URLMeta> ADAPTER = new C19048b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long create_time;
    public final String from_id;
    public final String icon_url;
    public final String id;
    public final String message_id;
    public final Integer message_position;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.search.v2.URLMeta$b */
    private static final class C19048b extends ProtoAdapter<URLMeta> {
        C19048b() {
            super(FieldEncoding.LENGTH_DELIMITED, URLMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(URLMeta uRLMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uRLMeta.id);
            int i10 = 0;
            if (uRLMeta.create_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, uRLMeta.create_time);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (uRLMeta.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, uRLMeta.message_id);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (uRLMeta.message_position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, uRLMeta.message_position);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (uRLMeta.chat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, uRLMeta.chat_id);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (uRLMeta.from_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, uRLMeta.from_id);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (uRLMeta.url != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, uRLMeta.url);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (uRLMeta.icon_url != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, uRLMeta.icon_url);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (uRLMeta.thread_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, uRLMeta.thread_id);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (uRLMeta.thread_position != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, uRLMeta.thread_position);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (uRLMeta.thread_chat_position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, uRLMeta.thread_chat_position);
            }
            return i19 + i10 + uRLMeta.unknownFields().size();
        }

        /* renamed from: a */
        public URLMeta decode(ProtoReader protoReader) throws IOException {
            C19047a aVar = new C19047a();
            aVar.f47118a = "";
            aVar.f47119b = 0L;
            aVar.f47120c = "";
            aVar.f47121d = 0;
            aVar.f47122e = "";
            aVar.f47123f = "";
            aVar.f47124g = "";
            aVar.f47125h = "";
            aVar.f47126i = "";
            aVar.f47127j = 0;
            aVar.f47128k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47118a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47119b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47120c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47121d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47122e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47123f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47124g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47125h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47126i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47127j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47128k = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, URLMeta uRLMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uRLMeta.id);
            if (uRLMeta.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, uRLMeta.create_time);
            }
            if (uRLMeta.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uRLMeta.message_id);
            }
            if (uRLMeta.message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, uRLMeta.message_position);
            }
            if (uRLMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, uRLMeta.chat_id);
            }
            if (uRLMeta.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, uRLMeta.from_id);
            }
            if (uRLMeta.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, uRLMeta.url);
            }
            if (uRLMeta.icon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, uRLMeta.icon_url);
            }
            if (uRLMeta.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, uRLMeta.thread_id);
            }
            if (uRLMeta.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, uRLMeta.thread_position);
            }
            if (uRLMeta.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, uRLMeta.thread_chat_position);
            }
            protoWriter.writeBytes(uRLMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.URLMeta$a */
    public static final class C19047a extends Message.Builder<URLMeta, C19047a> {

        /* renamed from: a */
        public String f47118a;

        /* renamed from: b */
        public Long f47119b;

        /* renamed from: c */
        public String f47120c;

        /* renamed from: d */
        public Integer f47121d;

        /* renamed from: e */
        public String f47122e;

        /* renamed from: f */
        public String f47123f;

        /* renamed from: g */
        public String f47124g;

        /* renamed from: h */
        public String f47125h;

        /* renamed from: i */
        public String f47126i;

        /* renamed from: j */
        public Integer f47127j;

        /* renamed from: k */
        public Integer f47128k;

        /* renamed from: a */
        public URLMeta build() {
            String str = this.f47118a;
            if (str != null) {
                return new URLMeta(str, this.f47119b, this.f47120c, this.f47121d, this.f47122e, this.f47123f, this.f47124g, this.f47125h, this.f47126i, this.f47127j, this.f47128k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C19047a newBuilder() {
        C19047a aVar = new C19047a();
        aVar.f47118a = this.id;
        aVar.f47119b = this.create_time;
        aVar.f47120c = this.message_id;
        aVar.f47121d = this.message_position;
        aVar.f47122e = this.chat_id;
        aVar.f47123f = this.from_id;
        aVar.f47124g = this.url;
        aVar.f47125h = this.icon_url;
        aVar.f47126i = this.thread_id;
        aVar.f47127j = this.thread_position;
        aVar.f47128k = this.thread_chat_position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "URLMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.message_position != null) {
            sb.append(", message_position=");
            sb.append(this.message_position);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.thread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.thread_chat_position);
        }
        StringBuilder replace = sb.replace(0, 2, "URLMeta{");
        replace.append('}');
        return replace.toString();
    }

    public URLMeta(String str, Long l, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3) {
        this(str, l, str2, num, str3, str4, str5, str6, str7, num2, num3, ByteString.EMPTY);
    }

    public URLMeta(String str, Long l, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.create_time = l;
        this.message_id = str2;
        this.message_position = num;
        this.chat_id = str3;
        this.from_id = str4;
        this.url = str5;
        this.icon_url = str6;
        this.thread_id = str7;
        this.thread_position = num2;
        this.thread_chat_position = num3;
    }
}
