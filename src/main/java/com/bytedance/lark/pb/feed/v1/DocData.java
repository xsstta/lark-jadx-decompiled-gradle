package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DocFeed;
import com.bytedance.lark.pb.basic.v1.DocMessage;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttm.player.MediaPlayer;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DocData extends Message<DocData, C17116a> {
    public static final ProtoAdapter<DocData> ADAPTER = new C17117b();
    public static final Boolean DEFAULT_CROSS_TENANT = false;
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final DocMessage.Type DEFAULT_DOC_MESSAGE_TYPE = DocMessage.Type.UNKNOWN_TYPE;
    public static final DocFeed.Type DEFAULT_DOC_TYPE = DocFeed.Type.UNKNOWN;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Boolean DEFAULT_IS_SHORTCUT = false;
    public static final Long DEFAULT_RANK_TIME = 0L;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean cross_tenant;
    public final Long display_time;
    public final DocMessage.Type doc_message_type;
    public final DocFeed.Type doc_type;
    public final String doc_url;
    public final DraftPreview draft_preview;
    public final Boolean is_remind;
    public final Boolean is_shortcut;
    public final String last_doc_message_id;
    public final String localized_digest_message;
    public final String name;
    public final Long rank_time;
    public final List<Message.Reaction> reactions;
    public final List<Tag> tags;
    public final Integer unread_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.DocData$b */
    private static final class C17117b extends ProtoAdapter<DocData> {
        C17117b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocData.class);
        }

        /* renamed from: a */
        public int encodedSize(DocData docData) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, docData.name);
            int i11 = 0;
            if (docData.unread_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, docData.unread_count);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.BOOL.encodedSizeWithTag(3, docData.is_remind);
            if (docData.is_shortcut != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, docData.is_shortcut);
            } else {
                i2 = 0;
            }
            int i12 = encodedSizeWithTag2 + i2;
            if (docData.draft_preview != null) {
                i3 = DraftPreview.ADAPTER.encodedSizeWithTag(5, docData.draft_preview);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (docData.localized_digest_message != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, docData.localized_digest_message);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (docData.display_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(7, docData.display_time);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (docData.rank_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(8, docData.rank_time);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (docData.cross_tenant != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, docData.cross_tenant);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag3 = i16 + i7 + Message.Reaction.ADAPTER.asRepeated().encodedSizeWithTag(10, docData.reactions);
            if (docData.doc_type != null) {
                i8 = DocFeed.Type.ADAPTER.encodedSizeWithTag(11, docData.doc_type);
            } else {
                i8 = 0;
            }
            int i17 = encodedSizeWithTag3 + i8;
            if (docData.doc_url != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, docData.doc_url);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (docData.doc_message_type != null) {
                i10 = DocMessage.Type.ADAPTER.encodedSizeWithTag(13, docData.doc_message_type);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (docData.last_doc_message_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(14, docData.last_doc_message_id);
            }
            return i19 + i11 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, docData.tags) + docData.unknownFields().size();
        }

        /* renamed from: a */
        public DocData decode(ProtoReader protoReader) throws IOException {
            C17116a aVar = new C17116a();
            aVar.f43843a = "";
            aVar.f43844b = 0;
            aVar.f43845c = false;
            aVar.f43846d = false;
            aVar.f43848f = "";
            aVar.f43849g = 0L;
            aVar.f43850h = 0L;
            aVar.f43851i = false;
            aVar.f43853k = DocFeed.Type.UNKNOWN;
            aVar.f43854l = "";
            aVar.f43855m = DocMessage.Type.UNKNOWN_TYPE;
            aVar.f43856n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 400) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43843a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f43844b = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f43845c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f43846d = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f43847e = DraftPreview.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f43848f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f43849g = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f43850h = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f43851i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f43852j.add(Message.Reaction.ADAPTER.decode(protoReader));
                            continue;
                        case 11:
                            try {
                                aVar.f43853k = DocFeed.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43854l = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 13:
                            try {
                                aVar.f43855m = DocMessage.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f43856n = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    try {
                        aVar.f43857o.add(Tag.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocData docData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docData.name);
            if (docData.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, docData.unread_count);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, docData.is_remind);
            if (docData.is_shortcut != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, docData.is_shortcut);
            }
            if (docData.draft_preview != null) {
                DraftPreview.ADAPTER.encodeWithTag(protoWriter, 5, docData.draft_preview);
            }
            if (docData.localized_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, docData.localized_digest_message);
            }
            if (docData.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, docData.display_time);
            }
            if (docData.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, docData.rank_time);
            }
            if (docData.cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, docData.cross_tenant);
            }
            Message.Reaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, docData.reactions);
            if (docData.doc_type != null) {
                DocFeed.Type.ADAPTER.encodeWithTag(protoWriter, 11, docData.doc_type);
            }
            if (docData.doc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, docData.doc_url);
            }
            if (docData.doc_message_type != null) {
                DocMessage.Type.ADAPTER.encodeWithTag(protoWriter, 13, docData.doc_message_type);
            }
            if (docData.last_doc_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, docData.last_doc_message_id);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, docData.tags);
            protoWriter.writeBytes(docData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.DocData$a */
    public static final class C17116a extends Message.Builder<DocData, C17116a> {

        /* renamed from: a */
        public String f43843a;

        /* renamed from: b */
        public Integer f43844b;

        /* renamed from: c */
        public Boolean f43845c;

        /* renamed from: d */
        public Boolean f43846d;

        /* renamed from: e */
        public DraftPreview f43847e;

        /* renamed from: f */
        public String f43848f;

        /* renamed from: g */
        public Long f43849g;

        /* renamed from: h */
        public Long f43850h;

        /* renamed from: i */
        public Boolean f43851i;

        /* renamed from: j */
        public List<Message.Reaction> f43852j = Internal.newMutableList();

        /* renamed from: k */
        public DocFeed.Type f43853k;

        /* renamed from: l */
        public String f43854l;

        /* renamed from: m */
        public DocMessage.Type f43855m;

        /* renamed from: n */
        public String f43856n;

        /* renamed from: o */
        public List<Tag> f43857o = Internal.newMutableList();

        /* renamed from: a */
        public DocData build() {
            Boolean bool;
            String str = this.f43843a;
            if (str != null && (bool = this.f43845c) != null) {
                return new DocData(str, this.f43844b, bool, this.f43846d, this.f43847e, this.f43848f, this.f43849g, this.f43850h, this.f43851i, this.f43852j, this.f43853k, this.f43854l, this.f43855m, this.f43856n, this.f43857o, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "name", this.f43845c, "is_remind");
        }
    }

    @Override // com.squareup.wire.Message
    public C17116a newBuilder() {
        C17116a aVar = new C17116a();
        aVar.f43843a = this.name;
        aVar.f43844b = this.unread_count;
        aVar.f43845c = this.is_remind;
        aVar.f43846d = this.is_shortcut;
        aVar.f43847e = this.draft_preview;
        aVar.f43848f = this.localized_digest_message;
        aVar.f43849g = this.display_time;
        aVar.f43850h = this.rank_time;
        aVar.f43851i = this.cross_tenant;
        aVar.f43852j = Internal.copyOf("reactions", this.reactions);
        aVar.f43853k = this.doc_type;
        aVar.f43854l = this.doc_url;
        aVar.f43855m = this.doc_message_type;
        aVar.f43856n = this.last_doc_message_id;
        aVar.f43857o = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "DocData");
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        sb.append(", is_remind=");
        sb.append(this.is_remind);
        if (this.is_shortcut != null) {
            sb.append(", is_shortcut=");
            sb.append(this.is_shortcut);
        }
        if (this.draft_preview != null) {
            sb.append(", draft_preview=");
            sb.append(this.draft_preview);
        }
        if (this.localized_digest_message != null) {
            sb.append(", localized_digest_message=");
            sb.append(this.localized_digest_message);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.cross_tenant != null) {
            sb.append(", cross_tenant=");
            sb.append(this.cross_tenant);
        }
        if (!this.reactions.isEmpty()) {
            sb.append(", reactions=");
            sb.append(this.reactions);
        }
        if (this.doc_type != null) {
            sb.append(", doc_type=");
            sb.append(this.doc_type);
        }
        if (this.doc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.doc_url);
        }
        if (this.doc_message_type != null) {
            sb.append(", doc_message_type=");
            sb.append(this.doc_message_type);
        }
        if (this.last_doc_message_id != null) {
            sb.append(", last_doc_message_id=");
            sb.append(this.last_doc_message_id);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "DocData{");
        replace.append('}');
        return replace.toString();
    }

    public DocData(String str, Integer num, Boolean bool, Boolean bool2, DraftPreview draftPreview, String str2, Long l, Long l2, Boolean bool3, List<Message.Reaction> list, DocFeed.Type type, String str3, DocMessage.Type type2, String str4, List<Tag> list2) {
        this(str, num, bool, bool2, draftPreview, str2, l, l2, bool3, list, type, str3, type2, str4, list2, ByteString.EMPTY);
    }

    public DocData(String str, Integer num, Boolean bool, Boolean bool2, DraftPreview draftPreview, String str2, Long l, Long l2, Boolean bool3, List<Message.Reaction> list, DocFeed.Type type, String str3, DocMessage.Type type2, String str4, List<Tag> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.unread_count = num;
        this.is_remind = bool;
        this.is_shortcut = bool2;
        this.draft_preview = draftPreview;
        this.localized_digest_message = str2;
        this.display_time = l;
        this.rank_time = l2;
        this.cross_tenant = bool3;
        this.reactions = Internal.immutableCopyOf("reactions", list);
        this.doc_type = type;
        this.doc_url = str3;
        this.doc_message_type = type2;
        this.last_doc_message_id = str4;
        this.tags = Internal.immutableCopyOf("tags", list2);
    }
}
