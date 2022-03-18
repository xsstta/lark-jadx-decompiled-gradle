package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DocFeed extends Message<DocFeed, C14874a> {
    public static final ProtoAdapter<DocFeed> ADAPTER = new C14875b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final FeedCard.FeedType DEFAULT_FEED_TYPE = FeedCard.FeedType.INBOX;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_DELETED = false;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Boolean DEFAULT_IS_SHORTCUT = false;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Type DEFAULT_TYPE = Type.DOC;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long create_time;
    public final List<String> doc_message_ids;
    public final String doc_url;
    public final FeedCard.FeedType feed_type;
    public final String icon_key;
    public final String id;
    public final Boolean is_cross_tenant;
    public final Boolean is_deleted;
    public final Boolean is_remind;
    public final Boolean is_shortcut;
    public final Integer new_message_count;
    public final String owner_id;
    public final List<Tag> tags;
    public final String title;
    public final Type type;
    public final Long update_time;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        DOC(1),
        SHEET(2),
        BITABLE(3),
        MINDNOTE(4),
        FILE(5),
        SLIDE(6),
        WIKI(7),
        DOCX(8);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return DOC;
                case 2:
                    return SHEET;
                case 3:
                    return BITABLE;
                case 4:
                    return MINDNOTE;
                case 5:
                    return FILE;
                case 6:
                    return SLIDE;
                case 7:
                    return WIKI;
                case 8:
                    return DOCX;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocFeed$b */
    private static final class C14875b extends ProtoAdapter<DocFeed> {
        C14875b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocFeed.class);
        }

        /* renamed from: a */
        public int encodedSize(DocFeed docFeed) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, docFeed.id);
            int i13 = 0;
            if (docFeed.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, docFeed.title);
            } else {
                i = 0;
            }
            int i14 = encodedSizeWithTag + i;
            if (docFeed.type != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(3, docFeed.type);
            } else {
                i2 = 0;
            }
            int i15 = i14 + i2;
            if (docFeed.icon_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, docFeed.icon_key);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (docFeed.doc_url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, docFeed.doc_url);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (docFeed.create_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(6, docFeed.create_time);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (docFeed.update_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, docFeed.update_time);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (docFeed.owner_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, docFeed.owner_id);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (docFeed.new_message_count != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(9, docFeed.new_message_count);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag2 = i20 + i8 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, docFeed.doc_message_ids);
            if (docFeed.is_deleted != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(11, docFeed.is_deleted);
            } else {
                i9 = 0;
            }
            int i21 = encodedSizeWithTag2 + i9;
            if (docFeed.is_remind != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(12, docFeed.is_remind);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (docFeed.feed_type != null) {
                i11 = FeedCard.FeedType.ADAPTER.encodedSizeWithTag(13, docFeed.feed_type);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (docFeed.is_cross_tenant != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, docFeed.is_cross_tenant);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (docFeed.is_shortcut != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(15, docFeed.is_shortcut);
            }
            return i24 + i13 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(16, docFeed.tags) + docFeed.unknownFields().size();
        }

        /* renamed from: a */
        public DocFeed decode(ProtoReader protoReader) throws IOException {
            C14874a aVar = new C14874a();
            aVar.f39334a = "";
            aVar.f39335b = "";
            aVar.f39336c = Type.DOC;
            aVar.f39337d = "";
            aVar.f39338e = "";
            aVar.f39339f = 0L;
            aVar.f39340g = 0L;
            aVar.f39341h = "";
            aVar.f39342i = 0;
            aVar.f39344k = false;
            aVar.f39345l = false;
            aVar.f39346m = FeedCard.FeedType.INBOX;
            aVar.f39347n = false;
            aVar.f39348o = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39334a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39335b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f39336c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f39337d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39338e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39339f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39340g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39341h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39342i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39343j.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            aVar.f39344k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39345l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f39346m = FeedCard.FeedType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f39347n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f39348o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            try {
                                aVar.f39349p.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
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
        public void encode(ProtoWriter protoWriter, DocFeed docFeed) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docFeed.id);
            if (docFeed.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docFeed.title);
            }
            if (docFeed.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, docFeed.type);
            }
            if (docFeed.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, docFeed.icon_key);
            }
            if (docFeed.doc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, docFeed.doc_url);
            }
            if (docFeed.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, docFeed.create_time);
            }
            if (docFeed.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, docFeed.update_time);
            }
            if (docFeed.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, docFeed.owner_id);
            }
            if (docFeed.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, docFeed.new_message_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, docFeed.doc_message_ids);
            if (docFeed.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, docFeed.is_deleted);
            }
            if (docFeed.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, docFeed.is_remind);
            }
            if (docFeed.feed_type != null) {
                FeedCard.FeedType.ADAPTER.encodeWithTag(protoWriter, 13, docFeed.feed_type);
            }
            if (docFeed.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, docFeed.is_cross_tenant);
            }
            if (docFeed.is_shortcut != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, docFeed.is_shortcut);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, docFeed.tags);
            protoWriter.writeBytes(docFeed.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocFeed$a */
    public static final class C14874a extends Message.Builder<DocFeed, C14874a> {

        /* renamed from: a */
        public String f39334a;

        /* renamed from: b */
        public String f39335b;

        /* renamed from: c */
        public Type f39336c;

        /* renamed from: d */
        public String f39337d;

        /* renamed from: e */
        public String f39338e;

        /* renamed from: f */
        public Long f39339f;

        /* renamed from: g */
        public Long f39340g;

        /* renamed from: h */
        public String f39341h;

        /* renamed from: i */
        public Integer f39342i;

        /* renamed from: j */
        public List<String> f39343j = Internal.newMutableList();

        /* renamed from: k */
        public Boolean f39344k;

        /* renamed from: l */
        public Boolean f39345l;

        /* renamed from: m */
        public FeedCard.FeedType f39346m;

        /* renamed from: n */
        public Boolean f39347n;

        /* renamed from: o */
        public Boolean f39348o;

        /* renamed from: p */
        public List<Tag> f39349p = Internal.newMutableList();

        /* renamed from: a */
        public DocFeed build() {
            String str = this.f39334a;
            if (str != null) {
                return new DocFeed(str, this.f39335b, this.f39336c, this.f39337d, this.f39338e, this.f39339f, this.f39340g, this.f39341h, this.f39342i, this.f39343j, this.f39344k, this.f39345l, this.f39346m, this.f39347n, this.f39348o, this.f39349p, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14874a newBuilder() {
        C14874a aVar = new C14874a();
        aVar.f39334a = this.id;
        aVar.f39335b = this.title;
        aVar.f39336c = this.type;
        aVar.f39337d = this.icon_key;
        aVar.f39338e = this.doc_url;
        aVar.f39339f = this.create_time;
        aVar.f39340g = this.update_time;
        aVar.f39341h = this.owner_id;
        aVar.f39342i = this.new_message_count;
        aVar.f39343j = Internal.copyOf("doc_message_ids", this.doc_message_ids);
        aVar.f39344k = this.is_deleted;
        aVar.f39345l = this.is_remind;
        aVar.f39346m = this.feed_type;
        aVar.f39347n = this.is_cross_tenant;
        aVar.f39348o = this.is_shortcut;
        aVar.f39349p = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DocFeed");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.doc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.doc_url);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (!this.doc_message_ids.isEmpty()) {
            sb.append(", doc_message_ids=");
            sb.append(this.doc_message_ids);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        if (this.feed_type != null) {
            sb.append(", feed_type=");
            sb.append(this.feed_type);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.is_shortcut != null) {
            sb.append(", is_shortcut=");
            sb.append(this.is_shortcut);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "DocFeed{");
        replace.append('}');
        return replace.toString();
    }

    public DocFeed(String str, String str2, Type type2, String str3, String str4, Long l, Long l2, String str5, Integer num, List<String> list, Boolean bool, Boolean bool2, FeedCard.FeedType feedType, Boolean bool3, Boolean bool4, List<Tag> list2) {
        this(str, str2, type2, str3, str4, l, l2, str5, num, list, bool, bool2, feedType, bool3, bool4, list2, ByteString.EMPTY);
    }

    public DocFeed(String str, String str2, Type type2, String str3, String str4, Long l, Long l2, String str5, Integer num, List<String> list, Boolean bool, Boolean bool2, FeedCard.FeedType feedType, Boolean bool3, Boolean bool4, List<Tag> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.title = str2;
        this.type = type2;
        this.icon_key = str3;
        this.doc_url = str4;
        this.create_time = l;
        this.update_time = l2;
        this.owner_id = str5;
        this.new_message_count = num;
        this.doc_message_ids = Internal.immutableCopyOf("doc_message_ids", list);
        this.is_deleted = bool;
        this.is_remind = bool2;
        this.feed_type = feedType;
        this.is_cross_tenant = bool3;
        this.is_shortcut = bool4;
        this.tags = Internal.immutableCopyOf("tags", list2);
    }
}
