package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCategoryDetailRequest extends Message<GetCategoryDetailRequest, C18376a> {
    public static final ProtoAdapter<GetCategoryDetailRequest> ADAPTER = new C18377b();
    private static final long serialVersionUID = 0;
    public final String category_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetCategoryDetailRequest$b */
    private static final class C18377b extends ProtoAdapter<GetCategoryDetailRequest> {
        C18377b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCategoryDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCategoryDetailRequest getCategoryDetailRequest) {
            int i;
            if (getCategoryDetailRequest.category_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCategoryDetailRequest.category_id);
            } else {
                i = 0;
            }
            return i + getCategoryDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCategoryDetailRequest decode(ProtoReader protoReader) throws IOException {
            C18376a aVar = new C18376a();
            aVar.f45760a = "";
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
                    aVar.f45760a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCategoryDetailRequest getCategoryDetailRequest) throws IOException {
            if (getCategoryDetailRequest.category_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCategoryDetailRequest.category_id);
            }
            protoWriter.writeBytes(getCategoryDetailRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetCategoryDetailRequest$a */
    public static final class C18376a extends Message.Builder<GetCategoryDetailRequest, C18376a> {

        /* renamed from: a */
        public String f45760a;

        /* renamed from: a */
        public GetCategoryDetailRequest build() {
            return new GetCategoryDetailRequest(this.f45760a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18376a mo63565a(String str) {
            this.f45760a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18376a newBuilder() {
        C18376a aVar = new C18376a();
        aVar.f45760a = this.category_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetCategoryDetailRequest");
        StringBuilder sb = new StringBuilder();
        if (this.category_id != null) {
            sb.append(", category_id=");
            sb.append(this.category_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCategoryDetailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCategoryDetailRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetCategoryDetailRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.category_id = str;
    }
}
