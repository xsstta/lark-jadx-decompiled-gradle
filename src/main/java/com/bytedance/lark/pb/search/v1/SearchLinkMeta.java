package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SearchLinkMeta extends Message<SearchLinkMeta, C18889a> {
    public static final ProtoAdapter<SearchLinkMeta> ADAPTER = new C18890b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long create_time;
    public final String from_id;
    public final String from_name;
    public final String id;
    public final String message_id;
    public final String original_url;
    public final Integer position;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchLinkMeta$b */
    private static final class C18890b extends ProtoAdapter<SearchLinkMeta> {
        C18890b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchLinkMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchLinkMeta searchLinkMeta) {
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
            int i11 = 0;
            if (searchLinkMeta.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, searchLinkMeta.id);
            } else {
                i = 0;
            }
            if (searchLinkMeta.original_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, searchLinkMeta.original_url);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (searchLinkMeta.from_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchLinkMeta.from_id);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (searchLinkMeta.from_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchLinkMeta.from_name);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (searchLinkMeta.create_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, searchLinkMeta.create_time);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (searchLinkMeta.chat_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchLinkMeta.chat_id);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (searchLinkMeta.message_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchLinkMeta.message_id);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (searchLinkMeta.thread_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, searchLinkMeta.thread_id);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (searchLinkMeta.position != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(9, searchLinkMeta.position);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (searchLinkMeta.thread_position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(10, searchLinkMeta.thread_position);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (searchLinkMeta.thread_chat_position != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, searchLinkMeta.thread_chat_position);
            }
            return i20 + i11 + searchLinkMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchLinkMeta decode(ProtoReader protoReader) throws IOException {
            C18889a aVar = new C18889a();
            aVar.f46687a = "";
            aVar.f46688b = "";
            aVar.f46689c = "";
            aVar.f46690d = "";
            aVar.f46691e = 0L;
            aVar.f46692f = "";
            aVar.f46693g = "";
            aVar.f46694h = "";
            aVar.f46695i = 0;
            aVar.f46696j = 0;
            aVar.f46697k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46687a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46688b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46689c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46690d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46691e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46692f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46693g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46694h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46695i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46696j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46697k = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchLinkMeta searchLinkMeta) throws IOException {
            if (searchLinkMeta.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchLinkMeta.id);
            }
            if (searchLinkMeta.original_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchLinkMeta.original_url);
            }
            if (searchLinkMeta.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchLinkMeta.from_id);
            }
            if (searchLinkMeta.from_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchLinkMeta.from_name);
            }
            if (searchLinkMeta.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, searchLinkMeta.create_time);
            }
            if (searchLinkMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchLinkMeta.chat_id);
            }
            if (searchLinkMeta.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchLinkMeta.message_id);
            }
            if (searchLinkMeta.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, searchLinkMeta.thread_id);
            }
            if (searchLinkMeta.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, searchLinkMeta.position);
            }
            if (searchLinkMeta.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, searchLinkMeta.thread_position);
            }
            if (searchLinkMeta.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, searchLinkMeta.thread_chat_position);
            }
            protoWriter.writeBytes(searchLinkMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchLinkMeta$a */
    public static final class C18889a extends Message.Builder<SearchLinkMeta, C18889a> {

        /* renamed from: a */
        public String f46687a;

        /* renamed from: b */
        public String f46688b;

        /* renamed from: c */
        public String f46689c;

        /* renamed from: d */
        public String f46690d;

        /* renamed from: e */
        public Long f46691e;

        /* renamed from: f */
        public String f46692f;

        /* renamed from: g */
        public String f46693g;

        /* renamed from: h */
        public String f46694h;

        /* renamed from: i */
        public Integer f46695i;

        /* renamed from: j */
        public Integer f46696j;

        /* renamed from: k */
        public Integer f46697k;

        /* renamed from: a */
        public SearchLinkMeta build() {
            return new SearchLinkMeta(this.f46687a, this.f46688b, this.f46689c, this.f46690d, this.f46691e, this.f46692f, this.f46693g, this.f46694h, this.f46695i, this.f46696j, this.f46697k, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18889a newBuilder() {
        C18889a aVar = new C18889a();
        aVar.f46687a = this.id;
        aVar.f46688b = this.original_url;
        aVar.f46689c = this.from_id;
        aVar.f46690d = this.from_name;
        aVar.f46691e = this.create_time;
        aVar.f46692f = this.chat_id;
        aVar.f46693g = this.message_id;
        aVar.f46694h = this.thread_id;
        aVar.f46695i = this.position;
        aVar.f46696j = this.thread_position;
        aVar.f46697k = this.thread_chat_position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchLinkMeta");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.original_url != null) {
            sb.append(", original_url=");
            sb.append(this.original_url);
        }
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.from_name != null) {
            sb.append(", from_name=");
            sb.append(this.from_name);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.thread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.thread_chat_position);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchLinkMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchLinkMeta(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, Integer num, Integer num2, Integer num3) {
        this(str, str2, str3, str4, l, str5, str6, str7, num, num2, num3, ByteString.EMPTY);
    }

    public SearchLinkMeta(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.original_url = str2;
        this.from_id = str3;
        this.from_name = str4;
        this.create_time = l;
        this.chat_id = str5;
        this.message_id = str6;
        this.thread_id = str7;
        this.position = num;
        this.thread_position = num2;
        this.thread_chat_position = num3;
    }
}
