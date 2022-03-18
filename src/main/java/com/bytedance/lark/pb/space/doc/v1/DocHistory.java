package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.bytedance.lark.pb.basic.v1.Tag;
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

public final class DocHistory extends Message<DocHistory, C19243a> {
    public static final ProtoAdapter<DocHistory> ADAPTER = new C19244b();
    public static final Doc.Type DEFAULT_DOC_TYPE = Doc.Type.UNKNOWN;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_OPEN_TIME = 0L;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Doc.Type DEFAULT_WIKI_SUBTYPE = Doc.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String creator_id;
    public final String doc_id;
    public final Doc.Type doc_type;
    public final String editor_id;
    public final Icon icon;
    public final Boolean is_cross_tenant;
    public final Long open_time;
    public final List<Tag> tags;
    public final String title;
    public final Long update_time;
    public final String url;
    public final Doc.Type wiki_subtype;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.DocHistory$b */
    private static final class C19244b extends ProtoAdapter<DocHistory> {
        C19244b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocHistory.class);
        }

        /* renamed from: a */
        public int encodedSize(DocHistory docHistory) {
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
            if (docHistory.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, docHistory.url);
            } else {
                i = 0;
            }
            if (docHistory.doc_type != null) {
                i2 = Doc.Type.ADAPTER.encodedSizeWithTag(2, docHistory.doc_type);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (docHistory.title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, docHistory.title);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (docHistory.creator_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, docHistory.creator_id);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (docHistory.editor_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, docHistory.editor_id);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (docHistory.update_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, docHistory.update_time);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (docHistory.open_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, docHistory.open_time);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (docHistory.doc_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, docHistory.doc_id);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (docHistory.is_cross_tenant != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, docHistory.is_cross_tenant);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (docHistory.icon != null) {
                i10 = Icon.ADAPTER.encodedSizeWithTag(10, docHistory.icon);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag = i19 + i10 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(11, docHistory.tags);
            if (docHistory.wiki_subtype != null) {
                i11 = Doc.Type.ADAPTER.encodedSizeWithTag(12, docHistory.wiki_subtype);
            }
            return encodedSizeWithTag + i11 + docHistory.unknownFields().size();
        }

        /* renamed from: a */
        public DocHistory decode(ProtoReader protoReader) throws IOException {
            C19243a aVar = new C19243a();
            aVar.f47421a = "";
            aVar.f47422b = Doc.Type.UNKNOWN;
            aVar.f47423c = "";
            aVar.f47424d = "";
            aVar.f47425e = "";
            aVar.f47426f = 0L;
            aVar.f47427g = 0L;
            aVar.f47428h = "";
            aVar.f47429i = false;
            aVar.f47432l = Doc.Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47421a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f47422b = Doc.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47423c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47424d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47425e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47426f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47427g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47428h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47429i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47430j = Icon.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f47431k.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f47432l = Doc.Type.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DocHistory docHistory) throws IOException {
            if (docHistory.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docHistory.url);
            }
            if (docHistory.doc_type != null) {
                Doc.Type.ADAPTER.encodeWithTag(protoWriter, 2, docHistory.doc_type);
            }
            if (docHistory.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, docHistory.title);
            }
            if (docHistory.creator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, docHistory.creator_id);
            }
            if (docHistory.editor_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, docHistory.editor_id);
            }
            if (docHistory.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, docHistory.update_time);
            }
            if (docHistory.open_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, docHistory.open_time);
            }
            if (docHistory.doc_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, docHistory.doc_id);
            }
            if (docHistory.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, docHistory.is_cross_tenant);
            }
            if (docHistory.icon != null) {
                Icon.ADAPTER.encodeWithTag(protoWriter, 10, docHistory.icon);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, docHistory.tags);
            if (docHistory.wiki_subtype != null) {
                Doc.Type.ADAPTER.encodeWithTag(protoWriter, 12, docHistory.wiki_subtype);
            }
            protoWriter.writeBytes(docHistory.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.DocHistory$a */
    public static final class C19243a extends Message.Builder<DocHistory, C19243a> {

        /* renamed from: a */
        public String f47421a;

        /* renamed from: b */
        public Doc.Type f47422b;

        /* renamed from: c */
        public String f47423c;

        /* renamed from: d */
        public String f47424d;

        /* renamed from: e */
        public String f47425e;

        /* renamed from: f */
        public Long f47426f;

        /* renamed from: g */
        public Long f47427g;

        /* renamed from: h */
        public String f47428h;

        /* renamed from: i */
        public Boolean f47429i;

        /* renamed from: j */
        public Icon f47430j;

        /* renamed from: k */
        public List<Tag> f47431k = Internal.newMutableList();

        /* renamed from: l */
        public Doc.Type f47432l;

        /* renamed from: a */
        public DocHistory build() {
            return new DocHistory(this.f47421a, this.f47422b, this.f47423c, this.f47424d, this.f47425e, this.f47426f, this.f47427g, this.f47428h, this.f47429i, this.f47430j, this.f47431k, this.f47432l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19243a newBuilder() {
        C19243a aVar = new C19243a();
        aVar.f47421a = this.url;
        aVar.f47422b = this.doc_type;
        aVar.f47423c = this.title;
        aVar.f47424d = this.creator_id;
        aVar.f47425e = this.editor_id;
        aVar.f47426f = this.update_time;
        aVar.f47427g = this.open_time;
        aVar.f47428h = this.doc_id;
        aVar.f47429i = this.is_cross_tenant;
        aVar.f47430j = this.icon;
        aVar.f47431k = Internal.copyOf("tags", this.tags);
        aVar.f47432l = this.wiki_subtype;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DocHistory");
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.doc_type != null) {
            sb.append(", doc_type=");
            sb.append(this.doc_type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.creator_id != null) {
            sb.append(", creator_id=");
            sb.append(this.creator_id);
        }
        if (this.editor_id != null) {
            sb.append(", editor_id=");
            sb.append(this.editor_id);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.open_time != null) {
            sb.append(", open_time=");
            sb.append(this.open_time);
        }
        if (this.doc_id != null) {
            sb.append(", doc_id=");
            sb.append(this.doc_id);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.wiki_subtype != null) {
            sb.append(", wiki_subtype=");
            sb.append(this.wiki_subtype);
        }
        StringBuilder replace = sb.replace(0, 2, "DocHistory{");
        replace.append('}');
        return replace.toString();
    }

    public DocHistory(String str, Doc.Type type, String str2, String str3, String str4, Long l, Long l2, String str5, Boolean bool, Icon icon2, List<Tag> list, Doc.Type type2) {
        this(str, type, str2, str3, str4, l, l2, str5, bool, icon2, list, type2, ByteString.EMPTY);
    }

    public DocHistory(String str, Doc.Type type, String str2, String str3, String str4, Long l, Long l2, String str5, Boolean bool, Icon icon2, List<Tag> list, Doc.Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.doc_type = type;
        this.title = str2;
        this.creator_id = str3;
        this.editor_id = str4;
        this.update_time = l;
        this.open_time = l2;
        this.doc_id = str5;
        this.is_cross_tenant = bool;
        this.icon = icon2;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.wiki_subtype = type2;
    }
}
