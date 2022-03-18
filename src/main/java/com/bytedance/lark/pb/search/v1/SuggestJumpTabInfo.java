package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SuggestJumpTabInfo extends Message<SuggestJumpTabInfo, C18933a> {
    public static final ProtoAdapter<SuggestJumpTabInfo> ADAPTER = new C18934b();
    public static final SearchTabName DEFAULT_SEARCH_TAB = SearchTabName.UNKNOWN_TAB;
    private static final long serialVersionUID = 0;
    public final String formatted_text;
    public final SearchTabName search_tab;

    /* renamed from: com.bytedance.lark.pb.search.v1.SuggestJumpTabInfo$b */
    private static final class C18934b extends ProtoAdapter<SuggestJumpTabInfo> {
        C18934b() {
            super(FieldEncoding.LENGTH_DELIMITED, SuggestJumpTabInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SuggestJumpTabInfo suggestJumpTabInfo) {
            int i;
            int i2 = 0;
            if (suggestJumpTabInfo.formatted_text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, suggestJumpTabInfo.formatted_text);
            } else {
                i = 0;
            }
            if (suggestJumpTabInfo.search_tab != null) {
                i2 = SearchTabName.ADAPTER.encodedSizeWithTag(2, suggestJumpTabInfo.search_tab);
            }
            return i + i2 + suggestJumpTabInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SuggestJumpTabInfo decode(ProtoReader protoReader) throws IOException {
            C18933a aVar = new C18933a();
            aVar.f46815a = "";
            aVar.f46816b = SearchTabName.UNKNOWN_TAB;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46815a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46816b = SearchTabName.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SuggestJumpTabInfo suggestJumpTabInfo) throws IOException {
            if (suggestJumpTabInfo.formatted_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, suggestJumpTabInfo.formatted_text);
            }
            if (suggestJumpTabInfo.search_tab != null) {
                SearchTabName.ADAPTER.encodeWithTag(protoWriter, 2, suggestJumpTabInfo.search_tab);
            }
            protoWriter.writeBytes(suggestJumpTabInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SuggestJumpTabInfo$a */
    public static final class C18933a extends Message.Builder<SuggestJumpTabInfo, C18933a> {

        /* renamed from: a */
        public String f46815a;

        /* renamed from: b */
        public SearchTabName f46816b;

        /* renamed from: a */
        public SuggestJumpTabInfo build() {
            return new SuggestJumpTabInfo(this.f46815a, this.f46816b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18933a newBuilder() {
        C18933a aVar = new C18933a();
        aVar.f46815a = this.formatted_text;
        aVar.f46816b = this.search_tab;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SuggestJumpTabInfo");
        StringBuilder sb = new StringBuilder();
        if (this.formatted_text != null) {
            sb.append(", formatted_text=");
            sb.append(this.formatted_text);
        }
        if (this.search_tab != null) {
            sb.append(", search_tab=");
            sb.append(this.search_tab);
        }
        StringBuilder replace = sb.replace(0, 2, "SuggestJumpTabInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SuggestJumpTabInfo(String str, SearchTabName searchTabName) {
        this(str, searchTabName, ByteString.EMPTY);
    }

    public SuggestJumpTabInfo(String str, SearchTabName searchTabName, ByteString byteString) {
        super(ADAPTER, byteString);
        this.formatted_text = str;
        this.search_tab = searchTabName;
    }
}
