package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchTab extends Message<SearchTab, C50044a> {
    public static final ProtoAdapter<SearchTab> ADAPTER = new C50045b();
    private static final long serialVersionUID = 0;
    public final String mapp_id;
    public final String micon_url;
    public final String mlabel;
    public final SearchTabName mtype;

    /* renamed from: com.ss.android.lark.pb.searches.SearchTab$b */
    private static final class C50045b extends ProtoAdapter<SearchTab> {
        C50045b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchTab.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchTab searchTab) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchTab.mlabel) + SearchTabName.ADAPTER.encodedSizeWithTag(2, searchTab.mtype);
            int i2 = 0;
            if (searchTab.mapp_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, searchTab.mapp_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (searchTab.micon_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchTab.micon_url);
            }
            return i3 + i2 + searchTab.unknownFields().size();
        }

        /* renamed from: a */
        public SearchTab decode(ProtoReader protoReader) throws IOException {
            C50044a aVar = new C50044a();
            aVar.f125157a = "";
            aVar.f125159c = "";
            aVar.f125160d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125157a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f125158b = SearchTabName.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f125159c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125160d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchTab searchTab) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchTab.mlabel);
            SearchTabName.ADAPTER.encodeWithTag(protoWriter, 2, searchTab.mtype);
            if (searchTab.mapp_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchTab.mapp_id);
            }
            if (searchTab.micon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchTab.micon_url);
            }
            protoWriter.writeBytes(searchTab.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50044a newBuilder() {
        C50044a aVar = new C50044a();
        aVar.f125157a = this.mlabel;
        aVar.f125158b = this.mtype;
        aVar.f125159c = this.mapp_id;
        aVar.f125160d = this.micon_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.searches.SearchTab$a */
    public static final class C50044a extends Message.Builder<SearchTab, C50044a> {

        /* renamed from: a */
        public String f125157a;

        /* renamed from: b */
        public SearchTabName f125158b;

        /* renamed from: c */
        public String f125159c;

        /* renamed from: d */
        public String f125160d;

        /* renamed from: a */
        public SearchTab build() {
            SearchTabName searchTabName;
            String str = this.f125157a;
            if (str != null && (searchTabName = this.f125158b) != null) {
                return new SearchTab(str, searchTabName, this.f125159c, this.f125160d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mlabel", this.f125158b, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", label=");
        sb.append(this.mlabel);
        sb.append(", type=");
        sb.append(this.mtype);
        if (this.mapp_id != null) {
            sb.append(", app_id=");
            sb.append(this.mapp_id);
        }
        if (this.micon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.micon_url);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchTab{");
        replace.append('}');
        return replace.toString();
    }

    public SearchTab(String str, SearchTabName searchTabName, String str2, String str3) {
        this(str, searchTabName, str2, str3, ByteString.EMPTY);
    }

    public SearchTab(String str, SearchTabName searchTabName, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlabel = str;
        this.mtype = searchTabName;
        this.mapp_id = str2;
        this.micon_url = str3;
    }
}
