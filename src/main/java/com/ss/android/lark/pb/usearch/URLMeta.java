package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class URLMeta extends Message<URLMeta, C50248a> {
    public static final ProtoAdapter<URLMeta> ADAPTER = new C50249b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final Long mcreate_time;
    public final String mfrom_id;
    public final String micon_url;
    public final String mid;
    public final String mmessage_id;
    public final Integer mmessage_position;
    public final Integer mthread_chat_position;
    public final String mthread_id;
    public final Integer mthread_position;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.usearch.URLMeta$b */
    private static final class C50249b extends ProtoAdapter<URLMeta> {
        C50249b() {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uRLMeta.mid);
            int i10 = 0;
            if (uRLMeta.mcreate_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, uRLMeta.mcreate_time);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (uRLMeta.mmessage_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, uRLMeta.mmessage_id);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (uRLMeta.mmessage_position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, uRLMeta.mmessage_position);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (uRLMeta.mchat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, uRLMeta.mchat_id);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (uRLMeta.mfrom_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, uRLMeta.mfrom_id);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (uRLMeta.murl != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, uRLMeta.murl);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (uRLMeta.micon_url != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, uRLMeta.micon_url);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (uRLMeta.mthread_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, uRLMeta.mthread_id);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (uRLMeta.mthread_position != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, uRLMeta.mthread_position);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (uRLMeta.mthread_chat_position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, uRLMeta.mthread_chat_position);
            }
            return i19 + i10 + uRLMeta.unknownFields().size();
        }

        /* renamed from: a */
        public URLMeta decode(ProtoReader protoReader) throws IOException {
            C50248a aVar = new C50248a();
            aVar.f125562a = "";
            aVar.f125563b = 0L;
            aVar.f125564c = "";
            aVar.f125565d = 0;
            aVar.f125566e = "";
            aVar.f125567f = "";
            aVar.f125568g = "";
            aVar.f125569h = "";
            aVar.f125570i = "";
            aVar.f125571j = 0;
            aVar.f125572k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125562a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125563b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125564c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125565d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125566e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125567f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125568g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125569h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125570i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125571j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125572k = ProtoAdapter.INT32.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uRLMeta.mid);
            if (uRLMeta.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, uRLMeta.mcreate_time);
            }
            if (uRLMeta.mmessage_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uRLMeta.mmessage_id);
            }
            if (uRLMeta.mmessage_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, uRLMeta.mmessage_position);
            }
            if (uRLMeta.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, uRLMeta.mchat_id);
            }
            if (uRLMeta.mfrom_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, uRLMeta.mfrom_id);
            }
            if (uRLMeta.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, uRLMeta.murl);
            }
            if (uRLMeta.micon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, uRLMeta.micon_url);
            }
            if (uRLMeta.mthread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, uRLMeta.mthread_id);
            }
            if (uRLMeta.mthread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, uRLMeta.mthread_position);
            }
            if (uRLMeta.mthread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, uRLMeta.mthread_chat_position);
            }
            protoWriter.writeBytes(uRLMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.URLMeta$a */
    public static final class C50248a extends Message.Builder<URLMeta, C50248a> {

        /* renamed from: a */
        public String f125562a;

        /* renamed from: b */
        public Long f125563b;

        /* renamed from: c */
        public String f125564c;

        /* renamed from: d */
        public Integer f125565d;

        /* renamed from: e */
        public String f125566e;

        /* renamed from: f */
        public String f125567f;

        /* renamed from: g */
        public String f125568g;

        /* renamed from: h */
        public String f125569h;

        /* renamed from: i */
        public String f125570i;

        /* renamed from: j */
        public Integer f125571j;

        /* renamed from: k */
        public Integer f125572k;

        /* renamed from: a */
        public URLMeta build() {
            String str = this.f125562a;
            if (str != null) {
                return new URLMeta(str, this.f125563b, this.f125564c, this.f125565d, this.f125566e, this.f125567f, this.f125568g, this.f125569h, this.f125570i, this.f125571j, this.f125572k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50248a newBuilder() {
        C50248a aVar = new C50248a();
        aVar.f125562a = this.mid;
        aVar.f125563b = this.mcreate_time;
        aVar.f125564c = this.mmessage_id;
        aVar.f125565d = this.mmessage_position;
        aVar.f125566e = this.mchat_id;
        aVar.f125567f = this.mfrom_id;
        aVar.f125568g = this.murl;
        aVar.f125569h = this.micon_url;
        aVar.f125570i = this.mthread_id;
        aVar.f125571j = this.mthread_position;
        aVar.f125572k = this.mthread_chat_position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        if (this.mmessage_id != null) {
            sb.append(", message_id=");
            sb.append(this.mmessage_id);
        }
        if (this.mmessage_position != null) {
            sb.append(", message_position=");
            sb.append(this.mmessage_position);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mfrom_id != null) {
            sb.append(", from_id=");
            sb.append(this.mfrom_id);
        }
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.micon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.micon_url);
        }
        if (this.mthread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.mthread_id);
        }
        if (this.mthread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.mthread_position);
        }
        if (this.mthread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.mthread_chat_position);
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
        this.mid = str;
        this.mcreate_time = l;
        this.mmessage_id = str2;
        this.mmessage_position = num;
        this.mchat_id = str3;
        this.mfrom_id = str4;
        this.murl = str5;
        this.micon_url = str6;
        this.mthread_id = str7;
        this.mthread_position = num2;
        this.mthread_chat_position = num3;
    }
}
