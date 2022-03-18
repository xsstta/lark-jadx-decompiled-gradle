package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchOncallMeta extends Message<SearchOncallMeta, C18897a> {
    public static final ProtoAdapter<SearchOncallMeta> ADAPTER = new C18898b();
    public static final Boolean DEFAULT_IS_OFFICIAL_ONCALL = false;
    private static final long serialVersionUID = 0;
    public final String bot_id;
    public final String chat_id;
    public final String cross_tag_info;
    public final String description;
    public final String faq_id;
    public final String faq_title;
    public final String id;
    public final Boolean is_official_oncall;
    public final String localized_name;
    public final List<String> tag_ids;
    public final List<Tag> tags;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchOncallMeta$b */
    private static final class C18898b extends ProtoAdapter<SearchOncallMeta> {
        C18898b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchOncallMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchOncallMeta searchOncallMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchOncallMeta.id);
            int i8 = 0;
            if (searchOncallMeta.localized_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, searchOncallMeta.localized_name);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (searchOncallMeta.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchOncallMeta.description);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (searchOncallMeta.bot_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchOncallMeta.bot_id);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (searchOncallMeta.chat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchOncallMeta.chat_id);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i11 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, searchOncallMeta.tag_ids);
            if (searchOncallMeta.is_official_oncall != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, searchOncallMeta.is_official_oncall);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i5 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(8, searchOncallMeta.tags);
            if (searchOncallMeta.faq_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, searchOncallMeta.faq_id);
            } else {
                i6 = 0;
            }
            int i12 = encodedSizeWithTag3 + i6;
            if (searchOncallMeta.faq_title != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchOncallMeta.faq_title);
            } else {
                i7 = 0;
            }
            int i13 = i12 + i7;
            if (searchOncallMeta.cross_tag_info != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, searchOncallMeta.cross_tag_info);
            }
            return i13 + i8 + searchOncallMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchOncallMeta decode(ProtoReader protoReader) throws IOException {
            C18897a aVar = new C18897a();
            aVar.f46721a = "";
            aVar.f46722b = "";
            aVar.f46723c = "";
            aVar.f46724d = "";
            aVar.f46725e = "";
            aVar.f46727g = false;
            aVar.f46729i = "";
            aVar.f46730j = "";
            aVar.f46731k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46721a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46722b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46723c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46724d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46725e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46726f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f46727g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f46728h.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            aVar.f46729i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46730j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46731k = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchOncallMeta searchOncallMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchOncallMeta.id);
            if (searchOncallMeta.localized_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchOncallMeta.localized_name);
            }
            if (searchOncallMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchOncallMeta.description);
            }
            if (searchOncallMeta.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchOncallMeta.bot_id);
            }
            if (searchOncallMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchOncallMeta.chat_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, searchOncallMeta.tag_ids);
            if (searchOncallMeta.is_official_oncall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, searchOncallMeta.is_official_oncall);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, searchOncallMeta.tags);
            if (searchOncallMeta.faq_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, searchOncallMeta.faq_id);
            }
            if (searchOncallMeta.faq_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchOncallMeta.faq_title);
            }
            if (searchOncallMeta.cross_tag_info != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, searchOncallMeta.cross_tag_info);
            }
            protoWriter.writeBytes(searchOncallMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchOncallMeta$a */
    public static final class C18897a extends Message.Builder<SearchOncallMeta, C18897a> {

        /* renamed from: a */
        public String f46721a;

        /* renamed from: b */
        public String f46722b;

        /* renamed from: c */
        public String f46723c;

        /* renamed from: d */
        public String f46724d;

        /* renamed from: e */
        public String f46725e;

        /* renamed from: f */
        public List<String> f46726f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f46727g;

        /* renamed from: h */
        public List<Tag> f46728h = Internal.newMutableList();

        /* renamed from: i */
        public String f46729i;

        /* renamed from: j */
        public String f46730j;

        /* renamed from: k */
        public String f46731k;

        /* renamed from: a */
        public SearchOncallMeta build() {
            String str = this.f46721a;
            if (str != null) {
                return new SearchOncallMeta(str, this.f46722b, this.f46723c, this.f46724d, this.f46725e, this.f46726f, this.f46727g, this.f46728h, this.f46729i, this.f46730j, this.f46731k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18897a newBuilder() {
        C18897a aVar = new C18897a();
        aVar.f46721a = this.id;
        aVar.f46722b = this.localized_name;
        aVar.f46723c = this.description;
        aVar.f46724d = this.bot_id;
        aVar.f46725e = this.chat_id;
        aVar.f46726f = Internal.copyOf("tag_ids", this.tag_ids);
        aVar.f46727g = this.is_official_oncall;
        aVar.f46728h = Internal.copyOf("tags", this.tags);
        aVar.f46729i = this.faq_id;
        aVar.f46730j = this.faq_title;
        aVar.f46731k = this.cross_tag_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchOncallMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.localized_name != null) {
            sb.append(", localized_name=");
            sb.append(this.localized_name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (!this.tag_ids.isEmpty()) {
            sb.append(", tag_ids=");
            sb.append(this.tag_ids);
        }
        if (this.is_official_oncall != null) {
            sb.append(", is_official_oncall=");
            sb.append(this.is_official_oncall);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.faq_id != null) {
            sb.append(", faq_id=");
            sb.append(this.faq_id);
        }
        if (this.faq_title != null) {
            sb.append(", faq_title=");
            sb.append(this.faq_title);
        }
        if (this.cross_tag_info != null) {
            sb.append(", cross_tag_info=");
            sb.append(this.cross_tag_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchOncallMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchOncallMeta(String str, String str2, String str3, String str4, String str5, List<String> list, Boolean bool, List<Tag> list2, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, list, bool, list2, str6, str7, str8, ByteString.EMPTY);
    }

    public SearchOncallMeta(String str, String str2, String str3, String str4, String str5, List<String> list, Boolean bool, List<Tag> list2, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.localized_name = str2;
        this.description = str3;
        this.bot_id = str4;
        this.chat_id = str5;
        this.tag_ids = Internal.immutableCopyOf("tag_ids", list);
        this.is_official_oncall = bool;
        this.tags = Internal.immutableCopyOf("tags", list2);
        this.faq_id = str6;
        this.faq_title = str7;
        this.cross_tag_info = str8;
    }
}
