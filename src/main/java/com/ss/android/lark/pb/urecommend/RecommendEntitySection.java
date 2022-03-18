package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.usearch.SearchResult;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class RecommendEntitySection extends Message<RecommendEntitySection, C50154a> {
    public static final ProtoAdapter<RecommendEntitySection> ADAPTER = new C50155b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final String men_title;
    public final Boolean mhas_more;
    public final LayoutStyle mlayout_style;
    public final String mpagination_token;
    public final List<SearchResult> mresults;
    public final String mtitle;

    /* renamed from: com.ss.android.lark.pb.urecommend.RecommendEntitySection$b */
    private static final class C50155b extends ProtoAdapter<RecommendEntitySection> {
        C50155b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecommendEntitySection.class);
        }

        /* renamed from: a */
        public int encodedSize(RecommendEntitySection recommendEntitySection) {
            int i;
            int encodedSizeWithTag = LayoutStyle.ADAPTER.encodedSizeWithTag(1, recommendEntitySection.mlayout_style) + ProtoAdapter.STRING.encodedSizeWithTag(2, recommendEntitySection.mtitle);
            int i2 = 0;
            if (recommendEntitySection.mpagination_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, recommendEntitySection.mpagination_token);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (recommendEntitySection.mhas_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, recommendEntitySection.mhas_more);
            }
            return i3 + i2 + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(5, recommendEntitySection.mresults) + ProtoAdapter.STRING.encodedSizeWithTag(6, recommendEntitySection.men_title) + recommendEntitySection.unknownFields().size();
        }

        /* renamed from: a */
        public RecommendEntitySection decode(ProtoReader protoReader) throws IOException {
            C50154a aVar = new C50154a();
            aVar.f125346b = "";
            aVar.f125347c = "";
            aVar.f125348d = false;
            aVar.f125350f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125345a = LayoutStyle.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125346b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125347c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125348d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125349e.add(SearchResult.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f125350f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, RecommendEntitySection recommendEntitySection) throws IOException {
            LayoutStyle.ADAPTER.encodeWithTag(protoWriter, 1, recommendEntitySection.mlayout_style);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, recommendEntitySection.mtitle);
            if (recommendEntitySection.mpagination_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, recommendEntitySection.mpagination_token);
            }
            if (recommendEntitySection.mhas_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, recommendEntitySection.mhas_more);
            }
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, recommendEntitySection.mresults);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, recommendEntitySection.men_title);
            protoWriter.writeBytes(recommendEntitySection.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50154a newBuilder() {
        C50154a aVar = new C50154a();
        aVar.f125345a = this.mlayout_style;
        aVar.f125346b = this.mtitle;
        aVar.f125347c = this.mpagination_token;
        aVar.f125348d = this.mhas_more;
        aVar.f125349e = Internal.copyOf("mresults", this.mresults);
        aVar.f125350f = this.men_title;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.RecommendEntitySection$a */
    public static final class C50154a extends Message.Builder<RecommendEntitySection, C50154a> {

        /* renamed from: a */
        public LayoutStyle f125345a;

        /* renamed from: b */
        public String f125346b;

        /* renamed from: c */
        public String f125347c;

        /* renamed from: d */
        public Boolean f125348d;

        /* renamed from: e */
        public List<SearchResult> f125349e = Internal.newMutableList();

        /* renamed from: f */
        public String f125350f;

        /* renamed from: a */
        public RecommendEntitySection build() {
            String str;
            String str2;
            LayoutStyle layoutStyle = this.f125345a;
            if (layoutStyle != null && (str = this.f125346b) != null && (str2 = this.f125350f) != null) {
                return new RecommendEntitySection(layoutStyle, str, this.f125347c, this.f125348d, this.f125349e, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(layoutStyle, "mlayout_style", this.f125346b, "mtitle", this.f125350f, "men_title");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_style=");
        sb.append(this.mlayout_style);
        sb.append(", title=");
        sb.append(this.mtitle);
        if (this.mpagination_token != null) {
            sb.append(", pagination_token=");
            sb.append(this.mpagination_token);
        }
        if (this.mhas_more != null) {
            sb.append(", has_more=");
            sb.append(this.mhas_more);
        }
        if (!this.mresults.isEmpty()) {
            sb.append(", results=");
            sb.append(this.mresults);
        }
        sb.append(", en_title=");
        sb.append(this.men_title);
        StringBuilder replace = sb.replace(0, 2, "RecommendEntitySection{");
        replace.append('}');
        return replace.toString();
    }

    public RecommendEntitySection(LayoutStyle layoutStyle, String str, String str2, Boolean bool, List<SearchResult> list, String str3) {
        this(layoutStyle, str, str2, bool, list, str3, ByteString.EMPTY);
    }

    public RecommendEntitySection(LayoutStyle layoutStyle, String str, String str2, Boolean bool, List<SearchResult> list, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlayout_style = layoutStyle;
        this.mtitle = str;
        this.mpagination_token = str2;
        this.mhas_more = bool;
        this.mresults = Internal.immutableCopyOf("mresults", list);
        this.men_title = str3;
    }
}
