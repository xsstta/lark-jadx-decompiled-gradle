package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchUserByContactPointRequest extends Message<SearchUserByContactPointRequest, C16364a> {
    public static final ProtoAdapter<SearchUserByContactPointRequest> ADAPTER = new C16365b();
    private static final long serialVersionUID = 0;
    public final String contact_content;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SearchUserByContactPointRequest$b */
    private static final class C16365b extends ProtoAdapter<SearchUserByContactPointRequest> {
        C16365b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchUserByContactPointRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchUserByContactPointRequest searchUserByContactPointRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, searchUserByContactPointRequest.contact_content) + searchUserByContactPointRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchUserByContactPointRequest decode(ProtoReader protoReader) throws IOException {
            C16364a aVar = new C16364a();
            aVar.f42624a = "";
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
                    aVar.f42624a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchUserByContactPointRequest searchUserByContactPointRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchUserByContactPointRequest.contact_content);
            protoWriter.writeBytes(searchUserByContactPointRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SearchUserByContactPointRequest$a */
    public static final class C16364a extends Message.Builder<SearchUserByContactPointRequest, C16364a> {

        /* renamed from: a */
        public String f42624a;

        /* renamed from: a */
        public SearchUserByContactPointRequest build() {
            String str = this.f42624a;
            if (str != null) {
                return new SearchUserByContactPointRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "contact_content");
        }

        /* renamed from: a */
        public C16364a mo58461a(String str) {
            this.f42624a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16364a newBuilder() {
        C16364a aVar = new C16364a();
        aVar.f42624a = this.contact_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SearchUserByContactPointRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", contact_content=");
        sb.append(this.contact_content);
        StringBuilder replace = sb.replace(0, 2, "SearchUserByContactPointRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchUserByContactPointRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SearchUserByContactPointRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.contact_content = str;
    }
}
