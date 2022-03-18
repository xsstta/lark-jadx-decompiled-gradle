package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCategoryDetailRequest extends Message<GetCategoryDetailRequest, C49916a> {
    public static final ProtoAdapter<GetCategoryDetailRequest> ADAPTER = new C49917b();
    private static final long serialVersionUID = 0;
    public final String mcategory_id;

    /* renamed from: com.ss.android.lark.pb.moments.GetCategoryDetailRequest$b */
    private static final class C49917b extends ProtoAdapter<GetCategoryDetailRequest> {
        C49917b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCategoryDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCategoryDetailRequest getCategoryDetailRequest) {
            int i;
            if (getCategoryDetailRequest.mcategory_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCategoryDetailRequest.mcategory_id);
            } else {
                i = 0;
            }
            return i + getCategoryDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCategoryDetailRequest decode(ProtoReader protoReader) throws IOException {
            C49916a aVar = new C49916a();
            aVar.f124931a = "";
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
                    aVar.f124931a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCategoryDetailRequest getCategoryDetailRequest) throws IOException {
            if (getCategoryDetailRequest.mcategory_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCategoryDetailRequest.mcategory_id);
            }
            protoWriter.writeBytes(getCategoryDetailRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.GetCategoryDetailRequest$a */
    public static final class C49916a extends Message.Builder<GetCategoryDetailRequest, C49916a> {

        /* renamed from: a */
        public String f124931a;

        /* renamed from: a */
        public GetCategoryDetailRequest build() {
            return new GetCategoryDetailRequest(this.f124931a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49916a newBuilder() {
        C49916a aVar = new C49916a();
        aVar.f124931a = this.mcategory_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcategory_id != null) {
            sb.append(", category_id=");
            sb.append(this.mcategory_id);
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
        this.mcategory_id = str;
    }
}
