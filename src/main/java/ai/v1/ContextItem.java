package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ContextItem extends Message<ContextItem, C0043a> {
    public static final ProtoAdapter<ContextItem> ADAPTER = new C0044b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Message.Type DEFAULT_TYPE = Message.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String content;
    public final Long create_time;
    public final String from_id;
    public final String id;
    public final String message_language;
    public final RichText rich_text;
    public final Message.Type type;

    /* renamed from: ai.v1.ContextItem$b */
    private static final class C0044b extends ProtoAdapter<ContextItem> {
        C0044b() {
            super(FieldEncoding.LENGTH_DELIMITED, ContextItem.class);
        }

        /* renamed from: a */
        public int encodedSize(ContextItem contextItem) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (contextItem.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, contextItem.id);
            } else {
                i = 0;
            }
            if (contextItem.type != null) {
                i2 = Message.Type.ADAPTER.encodedSizeWithTag(2, contextItem.type);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (contextItem.from_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, contextItem.from_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (contextItem.create_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, contextItem.create_time);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (contextItem.message_language != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, contextItem.message_language);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (contextItem.content != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, contextItem.content);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (contextItem.rich_text != null) {
                i7 = RichText.ADAPTER.encodedSizeWithTag(7, contextItem.rich_text);
            }
            return i12 + i7 + contextItem.unknownFields().size();
        }

        /* renamed from: a */
        public ContextItem decode(ProtoReader protoReader) throws IOException {
            C0043a aVar = new C0043a();
            aVar.f73a = "";
            aVar.f74b = Message.Type.UNKNOWN;
            aVar.f75c = "";
            aVar.f76d = 0L;
            aVar.f77e = "";
            aVar.f78f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f73a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f74b = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f75c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f76d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f77e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f78f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f79g = RichText.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ContextItem contextItem) throws IOException {
            if (contextItem.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contextItem.id);
            }
            if (contextItem.type != null) {
                Message.Type.ADAPTER.encodeWithTag(protoWriter, 2, contextItem.type);
            }
            if (contextItem.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, contextItem.from_id);
            }
            if (contextItem.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, contextItem.create_time);
            }
            if (contextItem.message_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, contextItem.message_language);
            }
            if (contextItem.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, contextItem.content);
            }
            if (contextItem.rich_text != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 7, contextItem.rich_text);
            }
            protoWriter.writeBytes(contextItem.unknownFields());
        }
    }

    /* renamed from: ai.v1.ContextItem$a */
    public static final class C0043a extends Message.Builder<ContextItem, C0043a> {

        /* renamed from: a */
        public String f73a;

        /* renamed from: b */
        public Message.Type f74b;

        /* renamed from: c */
        public String f75c;

        /* renamed from: d */
        public Long f76d;

        /* renamed from: e */
        public String f77e;

        /* renamed from: f */
        public String f78f;

        /* renamed from: g */
        public RichText f79g;

        /* renamed from: a */
        public ContextItem build() {
            return new ContextItem(this.f73a, this.f74b, this.f75c, this.f76d, this.f77e, this.f78f, this.f79g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0043a newBuilder() {
        C0043a aVar = new C0043a();
        aVar.f73a = this.id;
        aVar.f74b = this.type;
        aVar.f75c = this.from_id;
        aVar.f76d = this.create_time;
        aVar.f77e = this.message_language;
        aVar.f78f = this.content;
        aVar.f79g = this.rich_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "ContextItem");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.message_language != null) {
            sb.append(", message_language=");
            sb.append(this.message_language);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.rich_text != null) {
            sb.append(", rich_text=");
            sb.append(this.rich_text);
        }
        StringBuilder replace = sb.replace(0, 2, "ContextItem{");
        replace.append('}');
        return replace.toString();
    }

    public ContextItem(String str, Message.Type type2, String str2, Long l, String str3, String str4, RichText richText) {
        this(str, type2, str2, l, str3, str4, richText, ByteString.EMPTY);
    }

    public ContextItem(String str, Message.Type type2, String str2, Long l, String str3, String str4, RichText richText, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.from_id = str2;
        this.create_time = l;
        this.message_language = str3;
        this.content = str4;
        this.rich_text = richText;
    }
}
