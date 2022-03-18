package com.ss.android.lark.pb.ai;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EntityCard extends Message<EntityCard, C49445a> {
    public static final ProtoAdapter<EntityCard> ADAPTER = new C49446b();
    public static final Integer DEFAULT_DISLIKE_COUNT = 0;
    public static final Boolean DEFAULT_EDIT_PERMISSION = false;
    public static final Boolean DEFAULT_IS_DISLIKED = false;
    public static final Boolean DEFAULT_IS_LIKED = false;
    public static final Integer DEFAULT_LIKE_COUNT = 0;
    public static final Long DEFAULT_UPDATE_AT = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> malias;
    public final List<EntityChangeSet> mcontributors;
    public final Integer mdislike_count;
    public final Boolean medit_permission;
    public final String medit_url;
    public final EquivalentKeys mequivalent_keys;
    public final InternalExtra mextra;
    public final String mhome_url;
    public final String mid;
    public final Boolean mis_disliked;
    public final Boolean mis_liked;
    public final EntityChangeSet mlast_change;
    public final Integer mlike_count;
    public final String mlink_url;
    public final List<EntityCardSection> msections;
    public final String msource;
    public final String msummary;
    public final Long mupdate_at;

    /* renamed from: com.ss.android.lark.pb.ai.EntityCard$b */
    private static final class C49446b extends ProtoAdapter<EntityCard> {
        C49446b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCard.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCard entityCard) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entityCard.mid) + EntityCardSection.ADAPTER.asRepeated().encodedSizeWithTag(2, entityCard.msections) + ProtoAdapter.STRING.encodedSizeWithTag(3, entityCard.msource);
            int i13 = 0;
            if (entityCard.medit_permission != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, entityCard.medit_permission);
            } else {
                i = 0;
            }
            int i14 = encodedSizeWithTag + i;
            if (entityCard.msummary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, entityCard.msummary);
            } else {
                i2 = 0;
            }
            int i15 = i14 + i2;
            if (entityCard.mlike_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(6, entityCard.mlike_count);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (entityCard.mdislike_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(7, entityCard.mdislike_count);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (entityCard.mis_liked != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(8, entityCard.mis_liked);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (entityCard.mis_disliked != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(9, entityCard.mis_disliked);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (entityCard.mlink_url != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, entityCard.mlink_url);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (entityCard.medit_url != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, entityCard.medit_url);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (entityCard.mhome_url != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, entityCard.mhome_url);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (entityCard.mlast_change != null) {
                i10 = EntityChangeSet.ADAPTER.encodedSizeWithTag(13, entityCard.mlast_change);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag2 = i22 + i10 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(14, entityCard.malias);
            if (entityCard.mequivalent_keys != null) {
                i11 = EquivalentKeys.ADAPTER.encodedSizeWithTag(15, entityCard.mequivalent_keys);
            } else {
                i11 = 0;
            }
            int i23 = encodedSizeWithTag2 + i11;
            if (entityCard.mextra != null) {
                i12 = InternalExtra.ADAPTER.encodedSizeWithTag(16, entityCard.mextra);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag3 = i23 + i12 + EntityChangeSet.ADAPTER.asRepeated().encodedSizeWithTag(17, entityCard.mcontributors);
            if (entityCard.mupdate_at != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(18, entityCard.mupdate_at);
            }
            return encodedSizeWithTag3 + i13 + entityCard.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCard decode(ProtoReader protoReader) throws IOException {
            C49445a aVar = new C49445a();
            aVar.f124003a = "";
            aVar.f124005c = "";
            aVar.f124006d = false;
            aVar.f124007e = "";
            aVar.f124008f = 0;
            aVar.f124009g = 0;
            aVar.f124010h = false;
            aVar.f124011i = false;
            aVar.f124012j = "";
            aVar.f124013k = "";
            aVar.f124014l = "";
            aVar.f124020r = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124003a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124004b.add(EntityCardSection.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f124005c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124006d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124007e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124008f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124009g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124010h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124011i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124012j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124013k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124014l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124015m = EntityChangeSet.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f124016n.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            aVar.f124017o = EquivalentKeys.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f124018p = InternalExtra.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f124019q.add(EntityChangeSet.ADAPTER.decode(protoReader));
                            break;
                        case 18:
                            aVar.f124020r = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, EntityCard entityCard) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCard.mid);
            EntityCardSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, entityCard.msections);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, entityCard.msource);
            if (entityCard.medit_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, entityCard.medit_permission);
            }
            if (entityCard.msummary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, entityCard.msummary);
            }
            if (entityCard.mlike_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, entityCard.mlike_count);
            }
            if (entityCard.mdislike_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, entityCard.mdislike_count);
            }
            if (entityCard.mis_liked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, entityCard.mis_liked);
            }
            if (entityCard.mis_disliked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, entityCard.mis_disliked);
            }
            if (entityCard.mlink_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, entityCard.mlink_url);
            }
            if (entityCard.medit_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, entityCard.medit_url);
            }
            if (entityCard.mhome_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, entityCard.mhome_url);
            }
            if (entityCard.mlast_change != null) {
                EntityChangeSet.ADAPTER.encodeWithTag(protoWriter, 13, entityCard.mlast_change);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 14, entityCard.malias);
            if (entityCard.mequivalent_keys != null) {
                EquivalentKeys.ADAPTER.encodeWithTag(protoWriter, 15, entityCard.mequivalent_keys);
            }
            if (entityCard.mextra != null) {
                InternalExtra.ADAPTER.encodeWithTag(protoWriter, 16, entityCard.mextra);
            }
            EntityChangeSet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 17, entityCard.mcontributors);
            if (entityCard.mupdate_at != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 18, entityCard.mupdate_at);
            }
            protoWriter.writeBytes(entityCard.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.EntityCard$a */
    public static final class C49445a extends Message.Builder<EntityCard, C49445a> {

        /* renamed from: a */
        public String f124003a;

        /* renamed from: b */
        public List<EntityCardSection> f124004b = Internal.newMutableList();

        /* renamed from: c */
        public String f124005c;

        /* renamed from: d */
        public Boolean f124006d;

        /* renamed from: e */
        public String f124007e;

        /* renamed from: f */
        public Integer f124008f;

        /* renamed from: g */
        public Integer f124009g;

        /* renamed from: h */
        public Boolean f124010h;

        /* renamed from: i */
        public Boolean f124011i;

        /* renamed from: j */
        public String f124012j;

        /* renamed from: k */
        public String f124013k;

        /* renamed from: l */
        public String f124014l;

        /* renamed from: m */
        public EntityChangeSet f124015m;

        /* renamed from: n */
        public List<String> f124016n = Internal.newMutableList();

        /* renamed from: o */
        public EquivalentKeys f124017o;

        /* renamed from: p */
        public InternalExtra f124018p;

        /* renamed from: q */
        public List<EntityChangeSet> f124019q = Internal.newMutableList();

        /* renamed from: r */
        public Long f124020r;

        /* renamed from: a */
        public EntityCard build() {
            String str;
            String str2 = this.f124003a;
            if (str2 != null && (str = this.f124005c) != null) {
                return new EntityCard(str2, this.f124004b, str, this.f124006d, this.f124007e, this.f124008f, this.f124009g, this.f124010h, this.f124011i, this.f124012j, this.f124013k, this.f124014l, this.f124015m, this.f124016n, this.f124017o, this.f124018p, this.f124019q, this.f124020r, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "mid", this.f124005c, "msource");
        }

        /* renamed from: a */
        public C49445a mo172535a(String str) {
            this.f124003a = str;
            return this;
        }

        /* renamed from: b */
        public C49445a mo172538b(String str) {
            this.f124005c = str;
            return this;
        }

        /* renamed from: c */
        public C49445a mo172539c(String str) {
            this.f124012j = str;
            return this;
        }

        /* renamed from: a */
        public C49445a mo172536a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124016n = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49445a newBuilder() {
        C49445a aVar = new C49445a();
        aVar.f124003a = this.mid;
        aVar.f124004b = Internal.copyOf("msections", this.msections);
        aVar.f124005c = this.msource;
        aVar.f124006d = this.medit_permission;
        aVar.f124007e = this.msummary;
        aVar.f124008f = this.mlike_count;
        aVar.f124009g = this.mdislike_count;
        aVar.f124010h = this.mis_liked;
        aVar.f124011i = this.mis_disliked;
        aVar.f124012j = this.mlink_url;
        aVar.f124013k = this.medit_url;
        aVar.f124014l = this.mhome_url;
        aVar.f124015m = this.mlast_change;
        aVar.f124016n = Internal.copyOf("malias", this.malias);
        aVar.f124017o = this.mequivalent_keys;
        aVar.f124018p = this.mextra;
        aVar.f124019q = Internal.copyOf("mcontributors", this.mcontributors);
        aVar.f124020r = this.mupdate_at;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (!this.msections.isEmpty()) {
            sb.append(", sections=");
            sb.append(this.msections);
        }
        sb.append(", source=");
        sb.append(this.msource);
        if (this.medit_permission != null) {
            sb.append(", edit_permission=");
            sb.append(this.medit_permission);
        }
        if (this.msummary != null) {
            sb.append(", summary=");
            sb.append(this.msummary);
        }
        if (this.mlike_count != null) {
            sb.append(", like_count=");
            sb.append(this.mlike_count);
        }
        if (this.mdislike_count != null) {
            sb.append(", dislike_count=");
            sb.append(this.mdislike_count);
        }
        if (this.mis_liked != null) {
            sb.append(", is_liked=");
            sb.append(this.mis_liked);
        }
        if (this.mis_disliked != null) {
            sb.append(", is_disliked=");
            sb.append(this.mis_disliked);
        }
        if (this.mlink_url != null) {
            sb.append(", link_url=");
            sb.append(this.mlink_url);
        }
        if (this.medit_url != null) {
            sb.append(", edit_url=");
            sb.append(this.medit_url);
        }
        if (this.mhome_url != null) {
            sb.append(", home_url=");
            sb.append(this.mhome_url);
        }
        if (this.mlast_change != null) {
            sb.append(", last_change=");
            sb.append(this.mlast_change);
        }
        if (!this.malias.isEmpty()) {
            sb.append(", alias=");
            sb.append(this.malias);
        }
        if (this.mequivalent_keys != null) {
            sb.append(", equivalent_keys=");
            sb.append(this.mequivalent_keys);
        }
        if (this.mextra != null) {
            sb.append(", extra=");
            sb.append(this.mextra);
        }
        if (!this.mcontributors.isEmpty()) {
            sb.append(", contributors=");
            sb.append(this.mcontributors);
        }
        if (this.mupdate_at != null) {
            sb.append(", update_at=");
            sb.append(this.mupdate_at);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityCard{");
        replace.append('}');
        return replace.toString();
    }

    public EntityCard(String str, List<EntityCardSection> list, String str2, Boolean bool, String str3, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str4, String str5, String str6, EntityChangeSet entityChangeSet, List<String> list2, EquivalentKeys equivalentKeys, InternalExtra internalExtra, List<EntityChangeSet> list3, Long l) {
        this(str, list, str2, bool, str3, num, num2, bool2, bool3, str4, str5, str6, entityChangeSet, list2, equivalentKeys, internalExtra, list3, l, ByteString.EMPTY);
    }

    public EntityCard(String str, List<EntityCardSection> list, String str2, Boolean bool, String str3, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str4, String str5, String str6, EntityChangeSet entityChangeSet, List<String> list2, EquivalentKeys equivalentKeys, InternalExtra internalExtra, List<EntityChangeSet> list3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.msections = Internal.immutableCopyOf("msections", list);
        this.msource = str2;
        this.medit_permission = bool;
        this.msummary = str3;
        this.mlike_count = num;
        this.mdislike_count = num2;
        this.mis_liked = bool2;
        this.mis_disliked = bool3;
        this.mlink_url = str4;
        this.medit_url = str5;
        this.mhome_url = str6;
        this.mlast_change = entityChangeSet;
        this.malias = Internal.immutableCopyOf("malias", list2);
        this.mequivalent_keys = equivalentKeys;
        this.mextra = internalExtra;
        this.mcontributors = Internal.immutableCopyOf("mcontributors", list3);
        this.mupdate_at = l;
    }
}
