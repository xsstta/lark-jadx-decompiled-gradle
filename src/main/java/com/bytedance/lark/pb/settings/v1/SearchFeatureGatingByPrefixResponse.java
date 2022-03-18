package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SearchFeatureGatingByPrefixResponse extends Message<SearchFeatureGatingByPrefixResponse, C19199a> {
    public static final ProtoAdapter<SearchFeatureGatingByPrefixResponse> ADAPTER = new C19200b();
    private static final long serialVersionUID = 0;
    public final String fg_json_string;

    /* renamed from: com.bytedance.lark.pb.settings.v1.SearchFeatureGatingByPrefixResponse$b */
    private static final class C19200b extends ProtoAdapter<SearchFeatureGatingByPrefixResponse> {
        C19200b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchFeatureGatingByPrefixResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchFeatureGatingByPrefixResponse searchFeatureGatingByPrefixResponse) {
            int i;
            if (searchFeatureGatingByPrefixResponse.fg_json_string != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, searchFeatureGatingByPrefixResponse.fg_json_string);
            } else {
                i = 0;
            }
            return i + searchFeatureGatingByPrefixResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SearchFeatureGatingByPrefixResponse decode(ProtoReader protoReader) throws IOException {
            C19199a aVar = new C19199a();
            aVar.f47364a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47364a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchFeatureGatingByPrefixResponse searchFeatureGatingByPrefixResponse) throws IOException {
            if (searchFeatureGatingByPrefixResponse.fg_json_string != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchFeatureGatingByPrefixResponse.fg_json_string);
            }
            protoWriter.writeBytes(searchFeatureGatingByPrefixResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SearchFeatureGatingByPrefixResponse$a */
    public static final class C19199a extends Message.Builder<SearchFeatureGatingByPrefixResponse, C19199a> {

        /* renamed from: a */
        public String f47364a;

        /* renamed from: a */
        public SearchFeatureGatingByPrefixResponse build() {
            return new SearchFeatureGatingByPrefixResponse(this.f47364a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19199a newBuilder() {
        C19199a aVar = new C19199a();
        aVar.f47364a = this.fg_json_string;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SearchFeatureGatingByPrefixResponse");
        StringBuilder sb = new StringBuilder();
        if (this.fg_json_string != null) {
            sb.append(", fg_json_string=");
            sb.append(this.fg_json_string);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchFeatureGatingByPrefixResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SearchFeatureGatingByPrefixResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public SearchFeatureGatingByPrefixResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fg_json_string = str;
    }
}
