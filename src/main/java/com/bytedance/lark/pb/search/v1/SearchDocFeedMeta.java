package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DocFeed;
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

public final class SearchDocFeedMeta extends Message<SearchDocFeedMeta, C18867a> {
    public static final ProtoAdapter<SearchDocFeedMeta> ADAPTER = new C18868b();
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_DELAYED = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final DocFeed.Type DEFAULT_TYPE = DocFeed.Type.DOC;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Boolean is_cross_tenant;
    public final Boolean is_delayed;
    public final Boolean is_remind;
    public final Integer new_message_count;
    public final List<Tag> tags;
    public final DocFeed.Type type;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchDocFeedMeta$b */
    private static final class C18868b extends ProtoAdapter<SearchDocFeedMeta> {
        C18868b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchDocFeedMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchDocFeedMeta searchDocFeedMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchDocFeedMeta.id);
            int i5 = 0;
            if (searchDocFeedMeta.new_message_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, searchDocFeedMeta.new_message_count);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (searchDocFeedMeta.is_remind != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, searchDocFeedMeta.is_remind);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (searchDocFeedMeta.type != null) {
                i3 = DocFeed.Type.ADAPTER.encodedSizeWithTag(4, searchDocFeedMeta.type);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (searchDocFeedMeta.is_delayed != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, searchDocFeedMeta.is_delayed);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (searchDocFeedMeta.is_cross_tenant != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, searchDocFeedMeta.is_cross_tenant);
            }
            return i9 + i5 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(7, searchDocFeedMeta.tags) + searchDocFeedMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchDocFeedMeta decode(ProtoReader protoReader) throws IOException {
            C18867a aVar = new C18867a();
            aVar.f46633a = "";
            aVar.f46634b = 0;
            aVar.f46635c = true;
            aVar.f46636d = DocFeed.Type.DOC;
            aVar.f46637e = false;
            aVar.f46638f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46633a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46634b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46635c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f46636d = DocFeed.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f46637e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46638f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f46639g.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, SearchDocFeedMeta searchDocFeedMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchDocFeedMeta.id);
            if (searchDocFeedMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchDocFeedMeta.new_message_count);
            }
            if (searchDocFeedMeta.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, searchDocFeedMeta.is_remind);
            }
            if (searchDocFeedMeta.type != null) {
                DocFeed.Type.ADAPTER.encodeWithTag(protoWriter, 4, searchDocFeedMeta.type);
            }
            if (searchDocFeedMeta.is_delayed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, searchDocFeedMeta.is_delayed);
            }
            if (searchDocFeedMeta.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, searchDocFeedMeta.is_cross_tenant);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, searchDocFeedMeta.tags);
            protoWriter.writeBytes(searchDocFeedMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchDocFeedMeta$a */
    public static final class C18867a extends Message.Builder<SearchDocFeedMeta, C18867a> {

        /* renamed from: a */
        public String f46633a;

        /* renamed from: b */
        public Integer f46634b;

        /* renamed from: c */
        public Boolean f46635c;

        /* renamed from: d */
        public DocFeed.Type f46636d;

        /* renamed from: e */
        public Boolean f46637e;

        /* renamed from: f */
        public Boolean f46638f;

        /* renamed from: g */
        public List<Tag> f46639g = Internal.newMutableList();

        /* renamed from: a */
        public SearchDocFeedMeta build() {
            String str = this.f46633a;
            if (str != null) {
                return new SearchDocFeedMeta(str, this.f46634b, this.f46635c, this.f46636d, this.f46637e, this.f46638f, this.f46639g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18867a newBuilder() {
        C18867a aVar = new C18867a();
        aVar.f46633a = this.id;
        aVar.f46634b = this.new_message_count;
        aVar.f46635c = this.is_remind;
        aVar.f46636d = this.type;
        aVar.f46637e = this.is_delayed;
        aVar.f46638f = this.is_cross_tenant;
        aVar.f46639g = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchDocFeedMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.is_delayed != null) {
            sb.append(", is_delayed=");
            sb.append(this.is_delayed);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchDocFeedMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchDocFeedMeta(String str, Integer num, Boolean bool, DocFeed.Type type2, Boolean bool2, Boolean bool3, List<Tag> list) {
        this(str, num, bool, type2, bool2, bool3, list, ByteString.EMPTY);
    }

    public SearchDocFeedMeta(String str, Integer num, Boolean bool, DocFeed.Type type2, Boolean bool2, Boolean bool3, List<Tag> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.new_message_count = num;
        this.is_remind = bool;
        this.type = type2;
        this.is_delayed = bool2;
        this.is_cross_tenant = bool3;
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
