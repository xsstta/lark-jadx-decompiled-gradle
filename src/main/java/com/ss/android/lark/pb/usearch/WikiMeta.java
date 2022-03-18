package com.ss.android.lark.pb.usearch;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.DocType;
import java.io.IOException;
import okio.ByteString;

public final class WikiMeta extends Message<WikiMeta, C50254a> {
    public static final ProtoAdapter<WikiMeta> ADAPTER = new C50255b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_LAST_OPEN_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_SPACE_ID = 0L;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final Long mcreate_time;
    public final String mdoc_url;
    public final String medit_user_id;
    public final String medit_user_name;
    public final String mid;
    public final Boolean mis_cross_tenant;
    public final Long mlast_open_time;
    public final String mmessage_id;
    public final Integer mposition;
    public final Long mspace_id;
    public final String mspace_name;
    public final Integer mthread_chat_position;
    public final String mthread_id;
    public final Integer mthread_position;
    public final String mtoken;
    public final DocType mtype;
    public final Long mupdate_time;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.usearch.WikiMeta$b */
    private static final class C50255b extends ProtoAdapter<WikiMeta> {
        C50255b() {
            super(FieldEncoding.LENGTH_DELIMITED, WikiMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(WikiMeta wikiMeta) {
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
            int i17;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, wikiMeta.mid);
            int i18 = 0;
            if (wikiMeta.mtype != null) {
                i = DocType.ADAPTER.encodedSizeWithTag(2, wikiMeta.mtype);
            } else {
                i = 0;
            }
            int i19 = encodedSizeWithTag + i;
            if (wikiMeta.mupdate_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, wikiMeta.mupdate_time);
            } else {
                i2 = 0;
            }
            int i20 = i19 + i2;
            if (wikiMeta.mis_cross_tenant != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, wikiMeta.mis_cross_tenant);
            } else {
                i3 = 0;
            }
            int i21 = i20 + i3;
            if (wikiMeta.mchat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, wikiMeta.mchat_id);
            } else {
                i4 = 0;
            }
            int i22 = i21 + i4;
            if (wikiMeta.mposition != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, wikiMeta.mposition);
            } else {
                i5 = 0;
            }
            int i23 = i22 + i5;
            if (wikiMeta.mthread_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, wikiMeta.mthread_id);
            } else {
                i6 = 0;
            }
            int i24 = i23 + i6;
            if (wikiMeta.mthread_position != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, wikiMeta.mthread_position);
            } else {
                i7 = 0;
            }
            int i25 = i24 + i7;
            if (wikiMeta.mthread_chat_position != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(9, wikiMeta.mthread_chat_position);
            } else {
                i8 = 0;
            }
            int i26 = i25 + i8;
            if (wikiMeta.mmessage_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, wikiMeta.mmessage_id);
            } else {
                i9 = 0;
            }
            int i27 = i26 + i9;
            if (wikiMeta.mcreate_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, wikiMeta.mcreate_time);
            } else {
                i10 = 0;
            }
            int i28 = i27 + i10;
            if (wikiMeta.mlast_open_time != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(12, wikiMeta.mlast_open_time);
            } else {
                i11 = 0;
            }
            int i29 = i28 + i11;
            if (wikiMeta.medit_user_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, wikiMeta.medit_user_id);
            } else {
                i12 = 0;
            }
            int i30 = i29 + i12;
            if (wikiMeta.medit_user_name != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, wikiMeta.medit_user_name);
            } else {
                i13 = 0;
            }
            int i31 = i30 + i13;
            if (wikiMeta.murl != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, wikiMeta.murl);
            } else {
                i14 = 0;
            }
            int i32 = i31 + i14;
            if (wikiMeta.mdoc_url != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, wikiMeta.mdoc_url);
            } else {
                i15 = 0;
            }
            int i33 = i32 + i15;
            if (wikiMeta.mspace_id != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(17, wikiMeta.mspace_id);
            } else {
                i16 = 0;
            }
            int i34 = i33 + i16;
            if (wikiMeta.mspace_name != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(18, wikiMeta.mspace_name);
            } else {
                i17 = 0;
            }
            int i35 = i34 + i17;
            if (wikiMeta.mtoken != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(19, wikiMeta.mtoken);
            }
            return i35 + i18 + wikiMeta.unknownFields().size();
        }

        /* renamed from: a */
        public WikiMeta decode(ProtoReader protoReader) throws IOException {
            C50254a aVar = new C50254a();
            aVar.f125584a = "";
            aVar.f125586c = 0L;
            aVar.f125587d = false;
            aVar.f125588e = "";
            aVar.f125589f = 0;
            aVar.f125590g = "";
            aVar.f125591h = 0;
            aVar.f125592i = 0;
            aVar.f125593j = "";
            aVar.f125594k = 0L;
            aVar.f125595l = 0L;
            aVar.f125596m = "";
            aVar.f125597n = "";
            aVar.f125598o = "";
            aVar.f125599p = "";
            aVar.f125600q = 0L;
            aVar.f125601r = "";
            aVar.f125602s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125584a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125585b = DocType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125586c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125587d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125588e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125589f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125590g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125591h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125592i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125593j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125594k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125595l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125596m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f125597n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f125598o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f125599p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f125600q = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 18:
                            aVar.f125601r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f125602s = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, WikiMeta wikiMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, wikiMeta.mid);
            if (wikiMeta.mtype != null) {
                DocType.ADAPTER.encodeWithTag(protoWriter, 2, wikiMeta.mtype);
            }
            if (wikiMeta.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, wikiMeta.mupdate_time);
            }
            if (wikiMeta.mis_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, wikiMeta.mis_cross_tenant);
            }
            if (wikiMeta.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, wikiMeta.mchat_id);
            }
            if (wikiMeta.mposition != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, wikiMeta.mposition);
            }
            if (wikiMeta.mthread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, wikiMeta.mthread_id);
            }
            if (wikiMeta.mthread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, wikiMeta.mthread_position);
            }
            if (wikiMeta.mthread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, wikiMeta.mthread_chat_position);
            }
            if (wikiMeta.mmessage_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, wikiMeta.mmessage_id);
            }
            if (wikiMeta.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, wikiMeta.mcreate_time);
            }
            if (wikiMeta.mlast_open_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, wikiMeta.mlast_open_time);
            }
            if (wikiMeta.medit_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, wikiMeta.medit_user_id);
            }
            if (wikiMeta.medit_user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, wikiMeta.medit_user_name);
            }
            if (wikiMeta.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, wikiMeta.murl);
            }
            if (wikiMeta.mdoc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, wikiMeta.mdoc_url);
            }
            if (wikiMeta.mspace_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, wikiMeta.mspace_id);
            }
            if (wikiMeta.mspace_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, wikiMeta.mspace_name);
            }
            if (wikiMeta.mtoken != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, wikiMeta.mtoken);
            }
            protoWriter.writeBytes(wikiMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.WikiMeta$a */
    public static final class C50254a extends Message.Builder<WikiMeta, C50254a> {

        /* renamed from: a */
        public String f125584a;

        /* renamed from: b */
        public DocType f125585b;

        /* renamed from: c */
        public Long f125586c;

        /* renamed from: d */
        public Boolean f125587d;

        /* renamed from: e */
        public String f125588e;

        /* renamed from: f */
        public Integer f125589f;

        /* renamed from: g */
        public String f125590g;

        /* renamed from: h */
        public Integer f125591h;

        /* renamed from: i */
        public Integer f125592i;

        /* renamed from: j */
        public String f125593j;

        /* renamed from: k */
        public Long f125594k;

        /* renamed from: l */
        public Long f125595l;

        /* renamed from: m */
        public String f125596m;

        /* renamed from: n */
        public String f125597n;

        /* renamed from: o */
        public String f125598o;

        /* renamed from: p */
        public String f125599p;

        /* renamed from: q */
        public Long f125600q;

        /* renamed from: r */
        public String f125601r;

        /* renamed from: s */
        public String f125602s;

        /* renamed from: a */
        public WikiMeta build() {
            String str = this.f125584a;
            if (str != null) {
                return new WikiMeta(str, this.f125585b, this.f125586c, this.f125587d, this.f125588e, this.f125589f, this.f125590g, this.f125591h, this.f125592i, this.f125593j, this.f125594k, this.f125595l, this.f125596m, this.f125597n, this.f125598o, this.f125599p, this.f125600q, this.f125601r, this.f125602s, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50254a newBuilder() {
        C50254a aVar = new C50254a();
        aVar.f125584a = this.mid;
        aVar.f125585b = this.mtype;
        aVar.f125586c = this.mupdate_time;
        aVar.f125587d = this.mis_cross_tenant;
        aVar.f125588e = this.mchat_id;
        aVar.f125589f = this.mposition;
        aVar.f125590g = this.mthread_id;
        aVar.f125591h = this.mthread_position;
        aVar.f125592i = this.mthread_chat_position;
        aVar.f125593j = this.mmessage_id;
        aVar.f125594k = this.mcreate_time;
        aVar.f125595l = this.mlast_open_time;
        aVar.f125596m = this.medit_user_id;
        aVar.f125597n = this.medit_user_name;
        aVar.f125598o = this.murl;
        aVar.f125599p = this.mdoc_url;
        aVar.f125600q = this.mspace_id;
        aVar.f125601r = this.mspace_name;
        aVar.f125602s = this.mtoken;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        if (this.mis_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.mis_cross_tenant);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mposition != null) {
            sb.append(", position=");
            sb.append(this.mposition);
        }
        if (this.mthread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.mthread_id);
        }
        if (this.mthread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.mthread_position);
        }
        if (this.mthread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.mthread_chat_position);
        }
        if (this.mmessage_id != null) {
            sb.append(", message_id=");
            sb.append(this.mmessage_id);
        }
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        if (this.mlast_open_time != null) {
            sb.append(", last_open_time=");
            sb.append(this.mlast_open_time);
        }
        if (this.medit_user_id != null) {
            sb.append(", edit_user_id=");
            sb.append(this.medit_user_id);
        }
        if (this.medit_user_name != null) {
            sb.append(", edit_user_name=");
            sb.append(this.medit_user_name);
        }
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.mdoc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.mdoc_url);
        }
        if (this.mspace_id != null) {
            sb.append(", space_id=");
            sb.append(this.mspace_id);
        }
        if (this.mspace_name != null) {
            sb.append(", space_name=");
            sb.append(this.mspace_name);
        }
        if (this.mtoken != null) {
            sb.append(", token=");
            sb.append(this.mtoken);
        }
        StringBuilder replace = sb.replace(0, 2, "WikiMeta{");
        replace.append('}');
        return replace.toString();
    }

    public WikiMeta(String str, DocType docType, Long l, Boolean bool, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, Long l2, Long l3, String str5, String str6, String str7, String str8, Long l4, String str9, String str10) {
        this(str, docType, l, bool, str2, num, str3, num2, num3, str4, l2, l3, str5, str6, str7, str8, l4, str9, str10, ByteString.EMPTY);
    }

    public WikiMeta(String str, DocType docType, Long l, Boolean bool, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, Long l2, Long l3, String str5, String str6, String str7, String str8, Long l4, String str9, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtype = docType;
        this.mupdate_time = l;
        this.mis_cross_tenant = bool;
        this.mchat_id = str2;
        this.mposition = num;
        this.mthread_id = str3;
        this.mthread_position = num2;
        this.mthread_chat_position = num3;
        this.mmessage_id = str4;
        this.mcreate_time = l2;
        this.mlast_open_time = l3;
        this.medit_user_id = str5;
        this.medit_user_name = str6;
        this.murl = str7;
        this.mdoc_url = str8;
        this.mspace_id = l4;
        this.mspace_name = str9;
        this.mtoken = str10;
    }
}
