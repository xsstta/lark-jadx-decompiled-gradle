package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchResult extends Message<SearchResult, C50238a> {
    public static final ProtoAdapter<SearchResult> ADAPTER = new C50239b();
    private static final long serialVersionUID = 0;
    public final String mavatar_key;
    public final List<ExplanationTag> mexplanation_tags;
    public final String mextra_info_separator;
    public final List<ExtraInfoBlock> mextra_infos;
    public final String mextras_highlighted;
    public final String mid;
    public final ResultMeta mresult_meta;
    public final String msummary_highlighted;
    public final String mtitle_highlighted;
    public final SearchEntityType mtype;

    /* renamed from: com.ss.android.lark.pb.usearch.SearchResult$b */
    private static final class C50239b extends ProtoAdapter<SearchResult> {
        C50239b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchResult.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchResult searchResult) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchResult.mid);
            int i7 = 0;
            if (searchResult.mtype != null) {
                i = SearchEntityType.ADAPTER.encodedSizeWithTag(2, searchResult.mtype);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (searchResult.mtitle_highlighted != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchResult.mtitle_highlighted);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (searchResult.msummary_highlighted != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchResult.msummary_highlighted);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (searchResult.mextras_highlighted != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchResult.mextras_highlighted);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (searchResult.mavatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchResult.mavatar_key);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (searchResult.mresult_meta != null) {
                i6 = ResultMeta.ADAPTER.encodedSizeWithTag(7, searchResult.mresult_meta);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i12 + i6 + ExplanationTag.ADAPTER.asRepeated().encodedSizeWithTag(8, searchResult.mexplanation_tags) + ExtraInfoBlock.ADAPTER.asRepeated().encodedSizeWithTag(9, searchResult.mextra_infos);
            if (searchResult.mextra_info_separator != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchResult.mextra_info_separator);
            }
            return encodedSizeWithTag2 + i7 + searchResult.unknownFields().size();
        }

        /* renamed from: a */
        public SearchResult decode(ProtoReader protoReader) throws IOException {
            C50238a aVar = new C50238a();
            aVar.f125535a = "";
            aVar.f125537c = "";
            aVar.f125538d = "";
            aVar.f125539e = "";
            aVar.f125540f = "";
            aVar.f125544j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125535a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125536b = SearchEntityType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125537c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125538d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125539e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125540f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125541g = ResultMeta.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125542h.add(ExplanationTag.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f125543i.add(ExtraInfoBlock.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f125544j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchResult searchResult) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchResult.mid);
            if (searchResult.mtype != null) {
                SearchEntityType.ADAPTER.encodeWithTag(protoWriter, 2, searchResult.mtype);
            }
            if (searchResult.mtitle_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchResult.mtitle_highlighted);
            }
            if (searchResult.msummary_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchResult.msummary_highlighted);
            }
            if (searchResult.mextras_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchResult.mextras_highlighted);
            }
            if (searchResult.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchResult.mavatar_key);
            }
            if (searchResult.mresult_meta != null) {
                ResultMeta.ADAPTER.encodeWithTag(protoWriter, 7, searchResult.mresult_meta);
            }
            ExplanationTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, searchResult.mexplanation_tags);
            ExtraInfoBlock.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, searchResult.mextra_infos);
            if (searchResult.mextra_info_separator != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchResult.mextra_info_separator);
            }
            protoWriter.writeBytes(searchResult.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.SearchResult$a */
    public static final class C50238a extends Message.Builder<SearchResult, C50238a> {

        /* renamed from: a */
        public String f125535a;

        /* renamed from: b */
        public SearchEntityType f125536b;

        /* renamed from: c */
        public String f125537c;

        /* renamed from: d */
        public String f125538d;

        /* renamed from: e */
        public String f125539e;

        /* renamed from: f */
        public String f125540f;

        /* renamed from: g */
        public ResultMeta f125541g;

        /* renamed from: h */
        public List<ExplanationTag> f125542h = Internal.newMutableList();

        /* renamed from: i */
        public List<ExtraInfoBlock> f125543i = Internal.newMutableList();

        /* renamed from: j */
        public String f125544j;

        /* renamed from: a */
        public SearchResult build() {
            String str = this.f125535a;
            if (str != null) {
                return new SearchResult(str, this.f125536b, this.f125537c, this.f125538d, this.f125539e, this.f125540f, this.f125541g, this.f125542h, this.f125543i, this.f125544j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50238a newBuilder() {
        C50238a aVar = new C50238a();
        aVar.f125535a = this.mid;
        aVar.f125536b = this.mtype;
        aVar.f125537c = this.mtitle_highlighted;
        aVar.f125538d = this.msummary_highlighted;
        aVar.f125539e = this.mextras_highlighted;
        aVar.f125540f = this.mavatar_key;
        aVar.f125541g = this.mresult_meta;
        aVar.f125542h = Internal.copyOf("mexplanation_tags", this.mexplanation_tags);
        aVar.f125543i = Internal.copyOf("mextra_infos", this.mextra_infos);
        aVar.f125544j = this.mextra_info_separator;
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
        if (this.mtitle_highlighted != null) {
            sb.append(", title_highlighted=");
            sb.append(this.mtitle_highlighted);
        }
        if (this.msummary_highlighted != null) {
            sb.append(", summary_highlighted=");
            sb.append(this.msummary_highlighted);
        }
        if (this.mextras_highlighted != null) {
            sb.append(", extras_highlighted=");
            sb.append(this.mextras_highlighted);
        }
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        if (this.mresult_meta != null) {
            sb.append(", result_meta=");
            sb.append(this.mresult_meta);
        }
        if (!this.mexplanation_tags.isEmpty()) {
            sb.append(", explanation_tags=");
            sb.append(this.mexplanation_tags);
        }
        if (!this.mextra_infos.isEmpty()) {
            sb.append(", extra_infos=");
            sb.append(this.mextra_infos);
        }
        if (this.mextra_info_separator != null) {
            sb.append(", extra_info_separator=");
            sb.append(this.mextra_info_separator);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchResult{");
        replace.append('}');
        return replace.toString();
    }

    public SearchResult(String str, SearchEntityType searchEntityType, String str2, String str3, String str4, String str5, ResultMeta resultMeta, List<ExplanationTag> list, List<ExtraInfoBlock> list2, String str6) {
        this(str, searchEntityType, str2, str3, str4, str5, resultMeta, list, list2, str6, ByteString.EMPTY);
    }

    public SearchResult(String str, SearchEntityType searchEntityType, String str2, String str3, String str4, String str5, ResultMeta resultMeta, List<ExplanationTag> list, List<ExtraInfoBlock> list2, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtype = searchEntityType;
        this.mtitle_highlighted = str2;
        this.msummary_highlighted = str3;
        this.mextras_highlighted = str4;
        this.mavatar_key = str5;
        this.mresult_meta = resultMeta;
        this.mexplanation_tags = Internal.immutableCopyOf("mexplanation_tags", list);
        this.mextra_infos = Internal.immutableCopyOf("mextra_infos", list2);
        this.mextra_info_separator = str6;
    }
}
