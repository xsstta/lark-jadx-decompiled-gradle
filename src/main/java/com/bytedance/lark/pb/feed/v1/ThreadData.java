package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class ThreadData extends Message<ThreadData, C17236a> {
    public static final ProtoAdapter<ThreadData> ADAPTER = new C17237b();
    public static final Integer DEFAULT_AT_INFOS_COUNT = 0;
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final EntityStatus DEFAULT_ENTITY_STATUS = EntityStatus.NORMAL;
    public static final EntityType DEFAULT_ENTITY_TYPE = EntityType.THREAD;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Long DEFAULT_RANK_TIME = 0L;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final AtInfo at_info;
    public final List<AtInfo> at_infos;
    public final Integer at_infos_count;
    public final String avatar_key;
    public final String avatar_path;
    public final List<String> avatar_urls;
    public final String chat_id;
    public final Long display_time;
    public final DraftPreview draft_preview;
    public final EntityStatus entity_status;
    public final EntityType entity_type;
    public final Boolean is_remind;
    public final String localized_digest_message;
    public final String name;
    public final String original_digest_message;
    public final Long rank_time;
    public final Integer unread_count;

    public enum EntityType implements WireEnum {
        THREAD(1),
        TOPIC(2);
        
        public static final ProtoAdapter<EntityType> ADAPTER = ProtoAdapter.newEnumAdapter(EntityType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EntityType fromValue(int i) {
            if (i == 1) {
                return THREAD;
            }
            if (i != 2) {
                return null;
            }
            return TOPIC;
        }

        private EntityType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.ThreadData$b */
    private static final class C17237b extends ProtoAdapter<ThreadData> {
        C17237b() {
            super(FieldEncoding.LENGTH_DELIMITED, ThreadData.class);
        }

        /* renamed from: a */
        public int encodedSize(ThreadData threadData) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, threadData.name) + EntityType.ADAPTER.encodedSizeWithTag(2, threadData.entity_type);
            int i12 = 0;
            if (threadData.avatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, threadData.avatar_key);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (threadData.avatar_path != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, threadData.avatar_path);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i13 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, threadData.avatar_urls);
            if (threadData.unread_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(6, threadData.unread_count);
            } else {
                i3 = 0;
            }
            int i14 = encodedSizeWithTag2 + i3;
            if (threadData.draft_preview != null) {
                i4 = DraftPreview.ADAPTER.encodedSizeWithTag(7, threadData.draft_preview);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (threadData.at_info != null) {
                i5 = AtInfo.ADAPTER.encodedSizeWithTag(8, threadData.at_info);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag3 = i15 + i5 + AtInfo.ADAPTER.asRepeated().encodedSizeWithTag(9, threadData.at_infos);
            if (threadData.localized_digest_message != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(10, threadData.localized_digest_message);
            } else {
                i6 = 0;
            }
            int i16 = encodedSizeWithTag3 + i6;
            if (threadData.entity_status != null) {
                i7 = EntityStatus.ADAPTER.encodedSizeWithTag(11, threadData.entity_status);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (threadData.display_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(12, threadData.display_time);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (threadData.rank_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(13, threadData.rank_time);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (threadData.original_digest_message != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(14, threadData.original_digest_message);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (threadData.chat_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(15, threadData.chat_id);
            } else {
                i11 = 0;
            }
            int encodedSizeWithTag4 = i20 + i11 + ProtoAdapter.BOOL.encodedSizeWithTag(16, threadData.is_remind);
            if (threadData.at_infos_count != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(17, threadData.at_infos_count);
            }
            return encodedSizeWithTag4 + i12 + threadData.unknownFields().size();
        }

        /* renamed from: a */
        public ThreadData decode(ProtoReader protoReader) throws IOException {
            C17236a aVar = new C17236a();
            aVar.f44046a = "";
            aVar.f44047b = EntityType.THREAD;
            aVar.f44048c = "";
            aVar.f44049d = "";
            aVar.f44051f = 0;
            aVar.f44055j = "";
            aVar.f44056k = EntityStatus.NORMAL;
            aVar.f44057l = 0L;
            aVar.f44058m = 0L;
            aVar.f44059n = "";
            aVar.f44060o = "";
            aVar.f44061p = false;
            aVar.f44062q = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44046a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f44047b = EntityType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44048c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44049d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44050e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f44051f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44052g = DraftPreview.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44053h = AtInfo.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44054i.add(AtInfo.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f44055j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f44056k = EntityStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f44057l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f44058m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            aVar.f44059n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f44060o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f44061p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f44062q = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ThreadData threadData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, threadData.name);
            EntityType.ADAPTER.encodeWithTag(protoWriter, 2, threadData.entity_type);
            if (threadData.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, threadData.avatar_key);
            }
            if (threadData.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, threadData.avatar_path);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, threadData.avatar_urls);
            if (threadData.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, threadData.unread_count);
            }
            if (threadData.draft_preview != null) {
                DraftPreview.ADAPTER.encodeWithTag(protoWriter, 7, threadData.draft_preview);
            }
            if (threadData.at_info != null) {
                AtInfo.ADAPTER.encodeWithTag(protoWriter, 8, threadData.at_info);
            }
            AtInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, threadData.at_infos);
            if (threadData.localized_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, threadData.localized_digest_message);
            }
            if (threadData.entity_status != null) {
                EntityStatus.ADAPTER.encodeWithTag(protoWriter, 11, threadData.entity_status);
            }
            if (threadData.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, threadData.display_time);
            }
            if (threadData.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, threadData.rank_time);
            }
            if (threadData.original_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, threadData.original_digest_message);
            }
            if (threadData.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, threadData.chat_id);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, threadData.is_remind);
            if (threadData.at_infos_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, threadData.at_infos_count);
            }
            protoWriter.writeBytes(threadData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.ThreadData$a */
    public static final class C17236a extends Message.Builder<ThreadData, C17236a> {

        /* renamed from: a */
        public String f44046a;

        /* renamed from: b */
        public EntityType f44047b;

        /* renamed from: c */
        public String f44048c;

        /* renamed from: d */
        public String f44049d;

        /* renamed from: e */
        public List<String> f44050e = Internal.newMutableList();

        /* renamed from: f */
        public Integer f44051f;

        /* renamed from: g */
        public DraftPreview f44052g;

        /* renamed from: h */
        public AtInfo f44053h;

        /* renamed from: i */
        public List<AtInfo> f44054i = Internal.newMutableList();

        /* renamed from: j */
        public String f44055j;

        /* renamed from: k */
        public EntityStatus f44056k;

        /* renamed from: l */
        public Long f44057l;

        /* renamed from: m */
        public Long f44058m;

        /* renamed from: n */
        public String f44059n;

        /* renamed from: o */
        public String f44060o;

        /* renamed from: p */
        public Boolean f44061p;

        /* renamed from: q */
        public Integer f44062q;

        /* renamed from: a */
        public ThreadData build() {
            EntityType entityType;
            Boolean bool;
            String str = this.f44046a;
            if (str != null && (entityType = this.f44047b) != null && (bool = this.f44061p) != null) {
                return new ThreadData(str, entityType, this.f44048c, this.f44049d, this.f44050e, this.f44051f, this.f44052g, this.f44053h, this.f44054i, this.f44055j, this.f44056k, this.f44057l, this.f44058m, this.f44059n, this.f44060o, bool, this.f44062q, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "name", this.f44047b, "entity_type", this.f44061p, "is_remind");
        }
    }

    @Override // com.squareup.wire.Message
    public C17236a newBuilder() {
        C17236a aVar = new C17236a();
        aVar.f44046a = this.name;
        aVar.f44047b = this.entity_type;
        aVar.f44048c = this.avatar_key;
        aVar.f44049d = this.avatar_path;
        aVar.f44050e = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f44051f = this.unread_count;
        aVar.f44052g = this.draft_preview;
        aVar.f44053h = this.at_info;
        aVar.f44054i = Internal.copyOf("at_infos", this.at_infos);
        aVar.f44055j = this.localized_digest_message;
        aVar.f44056k = this.entity_status;
        aVar.f44057l = this.display_time;
        aVar.f44058m = this.rank_time;
        aVar.f44059n = this.original_digest_message;
        aVar.f44060o = this.chat_id;
        aVar.f44061p = this.is_remind;
        aVar.f44062q = this.at_infos_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "ThreadData");
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", entity_type=");
        sb.append(this.entity_type);
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.draft_preview != null) {
            sb.append(", draft_preview=");
            sb.append(this.draft_preview);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        if (!this.at_infos.isEmpty()) {
            sb.append(", at_infos=");
            sb.append(this.at_infos);
        }
        if (this.localized_digest_message != null) {
            sb.append(", localized_digest_message=");
            sb.append(this.localized_digest_message);
        }
        if (this.entity_status != null) {
            sb.append(", entity_status=");
            sb.append(this.entity_status);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.original_digest_message != null) {
            sb.append(", original_digest_message=");
            sb.append(this.original_digest_message);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        sb.append(", is_remind=");
        sb.append(this.is_remind);
        if (this.at_infos_count != null) {
            sb.append(", at_infos_count=");
            sb.append(this.at_infos_count);
        }
        StringBuilder replace = sb.replace(0, 2, "ThreadData{");
        replace.append('}');
        return replace.toString();
    }

    public ThreadData(String str, EntityType entityType, String str2, String str3, List<String> list, Integer num, DraftPreview draftPreview, AtInfo atInfo, List<AtInfo> list2, String str4, EntityStatus entityStatus, Long l, Long l2, String str5, String str6, Boolean bool, Integer num2) {
        this(str, entityType, str2, str3, list, num, draftPreview, atInfo, list2, str4, entityStatus, l, l2, str5, str6, bool, num2, ByteString.EMPTY);
    }

    public ThreadData(String str, EntityType entityType, String str2, String str3, List<String> list, Integer num, DraftPreview draftPreview, AtInfo atInfo, List<AtInfo> list2, String str4, EntityStatus entityStatus, Long l, Long l2, String str5, String str6, Boolean bool, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.entity_type = entityType;
        this.avatar_key = str2;
        this.avatar_path = str3;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.unread_count = num;
        this.draft_preview = draftPreview;
        this.at_info = atInfo;
        this.at_infos = Internal.immutableCopyOf("at_infos", list2);
        this.localized_digest_message = str4;
        this.entity_status = entityStatus;
        this.display_time = l;
        this.rank_time = l2;
        this.original_digest_message = str5;
        this.chat_id = str6;
        this.is_remind = bool;
        this.at_infos_count = num2;
    }
}
