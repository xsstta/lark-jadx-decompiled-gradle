package com.ss.android.lark.pb.videoconference.v1;

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
import okio.ByteString;

public final class VcDocs extends Message<VcDocs, C51212a> {
    public static final ProtoAdapter<VcDocs> ADAPTER = new C51213b();
    public static final ContainerType DEFAULT_CONTAINER_TYPE = ContainerType.SPACE;
    public static final DocSubType DEFAULT_DOC_SUB_TYPE = DocSubType.UNKNOWN_DOC_SUBTYPE;
    public static final DocType DEFAULT_DOC_TYPE = DocType.UNKNOWN_DOC_TYPE;
    public static final Boolean DEFAULT_IN_MEETING_SPACE = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final ShareStatus DEFAULT_STATUS = ShareStatus.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String abstract_;
    public final ContainerType container_type;
    public final String create_time;
    public final String doc_label_url;
    public final DocSubType doc_sub_type;
    public final String doc_title;
    public final String doc_title_highlight;
    public final String doc_token;
    public final DocType doc_type;
    public final String doc_url;
    public final String edit_user_id;
    public final Boolean in_meeting_space;
    public final Boolean is_cross_tenant;
    public final String owner_id;
    public final String owner_name;
    public final ShareStatus status;
    public final ThumbnailDetail thumbnail;
    public final String update_time;

    public enum ContainerType implements WireEnum {
        SPACE(0),
        WIKI2(1);
        
        public static final ProtoAdapter<ContainerType> ADAPTER = ProtoAdapter.newEnumAdapter(ContainerType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ContainerType fromValue(int i) {
            if (i == 0) {
                return SPACE;
            }
            if (i != 1) {
                return null;
            }
            return WIKI2;
        }

        private ContainerType(int i) {
            this.value = i;
        }
    }

    public enum DocSubType implements WireEnum {
        UNKNOWN_DOC_SUBTYPE(0),
        PHOTO(1),
        PDF(2),
        TXT(3),
        WORD(4),
        EXCEL(5),
        PPT(6),
        VIDEO(7),
        AUDIO(8),
        ZIP(9),
        PSD(10),
        APK(11),
        SKETCH(12),
        AE(13),
        KEYNOTE(14);
        
        public static final ProtoAdapter<DocSubType> ADAPTER = ProtoAdapter.newEnumAdapter(DocSubType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DocSubType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_DOC_SUBTYPE;
                case 1:
                    return PHOTO;
                case 2:
                    return PDF;
                case 3:
                    return TXT;
                case 4:
                    return WORD;
                case 5:
                    return EXCEL;
                case 6:
                    return PPT;
                case 7:
                    return VIDEO;
                case 8:
                    return AUDIO;
                case 9:
                    return ZIP;
                case 10:
                    return PSD;
                case 11:
                    return APK;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return SKETCH;
                case 13:
                    return AE;
                case 14:
                    return KEYNOTE;
                default:
                    return null;
            }
        }

        private DocSubType(int i) {
            this.value = i;
        }
    }

    public enum DocType implements WireEnum {
        UNKNOWN_DOC_TYPE(0),
        DOC(1),
        SHEET(2),
        BITABLE(3),
        MINDNOTE(4),
        FILE(5),
        SLIDE(6),
        FOLDER(7),
        DUSTBIN(8),
        PERSONAL_FOLDER(9),
        SHAREWITHME_FOLDER(10),
        SHARE_FOLDER(11),
        LINK(12),
        DEMONSTRATION(13),
        WIKI(14),
        DOCX(15);
        
        public static final ProtoAdapter<DocType> ADAPTER = ProtoAdapter.newEnumAdapter(DocType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DocType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_DOC_TYPE;
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
                    return FOLDER;
                case 8:
                    return DUSTBIN;
                case 9:
                    return PERSONAL_FOLDER;
                case 10:
                    return SHAREWITHME_FOLDER;
                case 11:
                    return SHARE_FOLDER;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return LINK;
                case 13:
                    return DEMONSTRATION;
                case 14:
                    return WIKI;
                case 15:
                    return DOCX;
                default:
                    return null;
            }
        }

        private DocType(int i) {
            this.value = i;
        }
    }

    public enum ShareStatus implements WireEnum {
        UNKNOWN(0),
        FULLY_SHARE(1),
        PARTIAL_SHARE(2),
        NO_SHARE_PERMISSION(3),
        NO_SUPPORT_SHARE(4);
        
        public static final ProtoAdapter<ShareStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ShareStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FULLY_SHARE;
            }
            if (i == 2) {
                return PARTIAL_SHARE;
            }
            if (i == 3) {
                return NO_SHARE_PERMISSION;
            }
            if (i != 4) {
                return null;
            }
            return NO_SUPPORT_SHARE;
        }

        private ShareStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcDocs$b */
    private static final class C51213b extends ProtoAdapter<VcDocs> {
        C51213b() {
            super(FieldEncoding.LENGTH_DELIMITED, VcDocs.class);
        }

        /* renamed from: a */
        public int encodedSize(VcDocs vcDocs) {
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
            int i13;
            int i14;
            int i15;
            int i16;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, vcDocs.doc_token);
            int i17 = 0;
            if (vcDocs.doc_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, vcDocs.doc_url);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (vcDocs.doc_type != null) {
                i2 = DocType.ADAPTER.encodedSizeWithTag(3, vcDocs.doc_type);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (vcDocs.doc_title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, vcDocs.doc_title);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (vcDocs.is_cross_tenant != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, vcDocs.is_cross_tenant);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (vcDocs.owner_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, vcDocs.owner_name);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (vcDocs.owner_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, vcDocs.owner_id);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (vcDocs.status != null) {
                i7 = ShareStatus.ADAPTER.encodedSizeWithTag(8, vcDocs.status);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (vcDocs.doc_title_highlight != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, vcDocs.doc_title_highlight);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (vcDocs.create_time != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, vcDocs.create_time);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (vcDocs.update_time != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, vcDocs.update_time);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (vcDocs.abstract_ != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, vcDocs.abstract_);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (vcDocs.edit_user_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, vcDocs.edit_user_id);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (vcDocs.doc_sub_type != null) {
                i13 = DocSubType.ADAPTER.encodedSizeWithTag(14, vcDocs.doc_sub_type);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (vcDocs.in_meeting_space != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(15, vcDocs.in_meeting_space);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (vcDocs.thumbnail != null) {
                i15 = ThumbnailDetail.ADAPTER.encodedSizeWithTag(16, vcDocs.thumbnail);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (vcDocs.doc_label_url != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(17, vcDocs.doc_label_url);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (vcDocs.container_type != null) {
                i17 = ContainerType.ADAPTER.encodedSizeWithTag(18, vcDocs.container_type);
            }
            return i33 + i17 + vcDocs.unknownFields().size();
        }

        /* renamed from: a */
        public VcDocs decode(ProtoReader protoReader) throws IOException {
            C51212a aVar = new C51212a();
            aVar.f127480a = "";
            aVar.f127481b = "";
            aVar.f127482c = DocType.UNKNOWN_DOC_TYPE;
            aVar.f127483d = "";
            aVar.f127484e = false;
            aVar.f127485f = "";
            aVar.f127486g = "";
            aVar.f127487h = ShareStatus.UNKNOWN;
            aVar.f127488i = "";
            aVar.f127489j = "";
            aVar.f127490k = "";
            aVar.f127491l = "";
            aVar.f127492m = "";
            aVar.f127493n = DocSubType.UNKNOWN_DOC_SUBTYPE;
            aVar.f127494o = false;
            aVar.f127496q = "";
            aVar.f127497r = ContainerType.SPACE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127480a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127481b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f127482c = DocType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f127483d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127484e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127485f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127486g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f127487h = ShareStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f127488i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127489j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127490k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127491l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f127492m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f127493n = DocSubType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 15:
                            aVar.f127494o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f127495p = ThumbnailDetail.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f127496q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            try {
                                aVar.f127497r = ContainerType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
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
        public void encode(ProtoWriter protoWriter, VcDocs vcDocs) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vcDocs.doc_token);
            if (vcDocs.doc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vcDocs.doc_url);
            }
            if (vcDocs.doc_type != null) {
                DocType.ADAPTER.encodeWithTag(protoWriter, 3, vcDocs.doc_type);
            }
            if (vcDocs.doc_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, vcDocs.doc_title);
            }
            if (vcDocs.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, vcDocs.is_cross_tenant);
            }
            if (vcDocs.owner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, vcDocs.owner_name);
            }
            if (vcDocs.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, vcDocs.owner_id);
            }
            if (vcDocs.status != null) {
                ShareStatus.ADAPTER.encodeWithTag(protoWriter, 8, vcDocs.status);
            }
            if (vcDocs.doc_title_highlight != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, vcDocs.doc_title_highlight);
            }
            if (vcDocs.create_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, vcDocs.create_time);
            }
            if (vcDocs.update_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, vcDocs.update_time);
            }
            if (vcDocs.abstract_ != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, vcDocs.abstract_);
            }
            if (vcDocs.edit_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, vcDocs.edit_user_id);
            }
            if (vcDocs.doc_sub_type != null) {
                DocSubType.ADAPTER.encodeWithTag(protoWriter, 14, vcDocs.doc_sub_type);
            }
            if (vcDocs.in_meeting_space != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, vcDocs.in_meeting_space);
            }
            if (vcDocs.thumbnail != null) {
                ThumbnailDetail.ADAPTER.encodeWithTag(protoWriter, 16, vcDocs.thumbnail);
            }
            if (vcDocs.doc_label_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, vcDocs.doc_label_url);
            }
            if (vcDocs.container_type != null) {
                ContainerType.ADAPTER.encodeWithTag(protoWriter, 18, vcDocs.container_type);
            }
            protoWriter.writeBytes(vcDocs.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcDocs$a */
    public static final class C51212a extends Message.Builder<VcDocs, C51212a> {

        /* renamed from: a */
        public String f127480a;

        /* renamed from: b */
        public String f127481b;

        /* renamed from: c */
        public DocType f127482c;

        /* renamed from: d */
        public String f127483d;

        /* renamed from: e */
        public Boolean f127484e;

        /* renamed from: f */
        public String f127485f;

        /* renamed from: g */
        public String f127486g;

        /* renamed from: h */
        public ShareStatus f127487h;

        /* renamed from: i */
        public String f127488i;

        /* renamed from: j */
        public String f127489j;

        /* renamed from: k */
        public String f127490k;

        /* renamed from: l */
        public String f127491l;

        /* renamed from: m */
        public String f127492m;

        /* renamed from: n */
        public DocSubType f127493n;

        /* renamed from: o */
        public Boolean f127494o;

        /* renamed from: p */
        public ThumbnailDetail f127495p;

        /* renamed from: q */
        public String f127496q;

        /* renamed from: r */
        public ContainerType f127497r;

        /* renamed from: a */
        public VcDocs build() {
            String str = this.f127480a;
            if (str != null) {
                return new VcDocs(str, this.f127481b, this.f127482c, this.f127483d, this.f127484e, this.f127485f, this.f127486g, this.f127487h, this.f127488i, this.f127489j, this.f127490k, this.f127491l, this.f127492m, this.f127493n, this.f127494o, this.f127495p, this.f127496q, this.f127497r, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "doc_token");
        }
    }

    @Override // com.squareup.wire.Message
    public C51212a newBuilder() {
        C51212a aVar = new C51212a();
        aVar.f127480a = this.doc_token;
        aVar.f127481b = this.doc_url;
        aVar.f127482c = this.doc_type;
        aVar.f127483d = this.doc_title;
        aVar.f127484e = this.is_cross_tenant;
        aVar.f127485f = this.owner_name;
        aVar.f127486g = this.owner_id;
        aVar.f127487h = this.status;
        aVar.f127488i = this.doc_title_highlight;
        aVar.f127489j = this.create_time;
        aVar.f127490k = this.update_time;
        aVar.f127491l = this.abstract_;
        aVar.f127492m = this.edit_user_id;
        aVar.f127493n = this.doc_sub_type;
        aVar.f127494o = this.in_meeting_space;
        aVar.f127495p = this.thumbnail;
        aVar.f127496q = this.doc_label_url;
        aVar.f127497r = this.container_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VcDocs");
        StringBuilder sb = new StringBuilder();
        sb.append(", doc_token=");
        sb.append(this.doc_token);
        if (this.doc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.doc_url);
        }
        if (this.doc_type != null) {
            sb.append(", doc_type=");
            sb.append(this.doc_type);
        }
        if (this.doc_title != null) {
            sb.append(", doc_title=");
            sb.append(this.doc_title);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.owner_name != null) {
            sb.append(", owner_name=");
            sb.append(this.owner_name);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.doc_title_highlight != null) {
            sb.append(", doc_title_highlight=");
            sb.append(this.doc_title_highlight);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.abstract_ != null) {
            sb.append(", abstract=");
            sb.append(this.abstract_);
        }
        if (this.edit_user_id != null) {
            sb.append(", edit_user_id=");
            sb.append(this.edit_user_id);
        }
        if (this.doc_sub_type != null) {
            sb.append(", doc_sub_type=");
            sb.append(this.doc_sub_type);
        }
        if (this.in_meeting_space != null) {
            sb.append(", in_meeting_space=");
            sb.append(this.in_meeting_space);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        if (this.doc_label_url != null) {
            sb.append(", doc_label_url=");
            sb.append(this.doc_label_url);
        }
        if (this.container_type != null) {
            sb.append(", container_type=");
            sb.append(this.container_type);
        }
        StringBuilder replace = sb.replace(0, 2, "VcDocs{");
        replace.append('}');
        return replace.toString();
    }

    public VcDocs(String str, String str2, DocType docType, String str3, Boolean bool, String str4, String str5, ShareStatus shareStatus, String str6, String str7, String str8, String str9, String str10, DocSubType docSubType, Boolean bool2, ThumbnailDetail thumbnailDetail, String str11, ContainerType containerType) {
        this(str, str2, docType, str3, bool, str4, str5, shareStatus, str6, str7, str8, str9, str10, docSubType, bool2, thumbnailDetail, str11, containerType, ByteString.EMPTY);
    }

    public VcDocs(String str, String str2, DocType docType, String str3, Boolean bool, String str4, String str5, ShareStatus shareStatus, String str6, String str7, String str8, String str9, String str10, DocSubType docSubType, Boolean bool2, ThumbnailDetail thumbnailDetail, String str11, ContainerType containerType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.doc_token = str;
        this.doc_url = str2;
        this.doc_type = docType;
        this.doc_title = str3;
        this.is_cross_tenant = bool;
        this.owner_name = str4;
        this.owner_id = str5;
        this.status = shareStatus;
        this.doc_title_highlight = str6;
        this.create_time = str7;
        this.update_time = str8;
        this.abstract_ = str9;
        this.edit_user_id = str10;
        this.doc_sub_type = docSubType;
        this.in_meeting_space = bool2;
        this.thumbnail = thumbnailDetail;
        this.doc_label_url = str11;
        this.container_type = containerType;
    }
}
