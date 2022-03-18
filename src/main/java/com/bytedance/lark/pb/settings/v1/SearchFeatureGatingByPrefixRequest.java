package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SearchFeatureGatingByPrefixRequest extends Message<SearchFeatureGatingByPrefixRequest, C19197a> {
    public static final ProtoAdapter<SearchFeatureGatingByPrefixRequest> ADAPTER = new C19198b();
    private static final long serialVersionUID = 0;
    public final String fg_key_prefix;

    /* renamed from: com.bytedance.lark.pb.settings.v1.SearchFeatureGatingByPrefixRequest$b */
    private static final class C19198b extends ProtoAdapter<SearchFeatureGatingByPrefixRequest> {
        C19198b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchFeatureGatingByPrefixRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchFeatureGatingByPrefixRequest searchFeatureGatingByPrefixRequest) {
            int i;
            if (searchFeatureGatingByPrefixRequest.fg_key_prefix != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, searchFeatureGatingByPrefixRequest.fg_key_prefix);
            } else {
                i = 0;
            }
            return i + searchFeatureGatingByPrefixRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchFeatureGatingByPrefixRequest decode(ProtoReader protoReader) throws IOException {
            C19197a aVar = new C19197a();
            aVar.f47363a = "";
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
                    aVar.f47363a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchFeatureGatingByPrefixRequest searchFeatureGatingByPrefixRequest) throws IOException {
            if (searchFeatureGatingByPrefixRequest.fg_key_prefix != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchFeatureGatingByPrefixRequest.fg_key_prefix);
            }
            protoWriter.writeBytes(searchFeatureGatingByPrefixRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SearchFeatureGatingByPrefixRequest$a */
    public static final class C19197a extends Message.Builder<SearchFeatureGatingByPrefixRequest, C19197a> {

        /* renamed from: a */
        public String f47363a;

        /* renamed from: a */
        public SearchFeatureGatingByPrefixRequest build() {
            return new SearchFeatureGatingByPrefixRequest(this.f47363a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19197a newBuilder() {
        C19197a aVar = new C19197a();
        aVar.f47363a = this.fg_key_prefix;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SearchFeatureGatingByPrefixRequest");
        StringBuilder sb = new StringBuilder();
        if (this.fg_key_prefix != null) {
            sb.append(", fg_key_prefix=");
            sb.append(this.fg_key_prefix);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchFeatureGatingByPrefixRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchFeatureGatingByPrefixRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SearchFeatureGatingByPrefixRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fg_key_prefix = str;
    }
}
