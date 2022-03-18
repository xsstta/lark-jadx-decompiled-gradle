package com.bytedance.lark.pb.passport.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetHiddenWaterMarkImageResponse extends Message<GetHiddenWaterMarkImageResponse, C18725a> {
    public static final ProtoAdapter<GetHiddenWaterMarkImageResponse> ADAPTER = new C18726b();
    private static final long serialVersionUID = 0;
    public final String water_mark_url;

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetHiddenWaterMarkImageResponse$b */
    private static final class C18726b extends ProtoAdapter<GetHiddenWaterMarkImageResponse> {
        C18726b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHiddenWaterMarkImageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHiddenWaterMarkImageResponse getHiddenWaterMarkImageResponse) {
            int i;
            if (getHiddenWaterMarkImageResponse.water_mark_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getHiddenWaterMarkImageResponse.water_mark_url);
            } else {
                i = 0;
            }
            return i + getHiddenWaterMarkImageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetHiddenWaterMarkImageResponse decode(ProtoReader protoReader) throws IOException {
            C18725a aVar = new C18725a();
            aVar.f46273a = "";
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
                    aVar.f46273a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHiddenWaterMarkImageResponse getHiddenWaterMarkImageResponse) throws IOException {
            if (getHiddenWaterMarkImageResponse.water_mark_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getHiddenWaterMarkImageResponse.water_mark_url);
            }
            protoWriter.writeBytes(getHiddenWaterMarkImageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetHiddenWaterMarkImageResponse$a */
    public static final class C18725a extends Message.Builder<GetHiddenWaterMarkImageResponse, C18725a> {

        /* renamed from: a */
        public String f46273a;

        /* renamed from: a */
        public GetHiddenWaterMarkImageResponse build() {
            return new GetHiddenWaterMarkImageResponse(this.f46273a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18725a newBuilder() {
        C18725a aVar = new C18725a();
        aVar.f46273a = this.water_mark_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("passport", "GetHiddenWaterMarkImageResponse");
        StringBuilder sb = new StringBuilder();
        if (this.water_mark_url != null) {
            sb.append(", water_mark_url=");
            sb.append(this.water_mark_url);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHiddenWaterMarkImageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetHiddenWaterMarkImageResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetHiddenWaterMarkImageResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.water_mark_url = str;
    }
}
