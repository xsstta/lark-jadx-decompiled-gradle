package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetBlockUserNumResponse extends Message<GetBlockUserNumResponse, C16446a> {
    public static final ProtoAdapter<GetBlockUserNumResponse> ADAPTER = new C16447b();
    public static final Integer DEFAULT_BLOCK_USER_NUMS = 0;
    private static final long serialVersionUID = 0;
    public final Integer block_user_nums;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserNumResponse$b */
    private static final class C16447b extends ProtoAdapter<GetBlockUserNumResponse> {
        C16447b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockUserNumResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockUserNumResponse getBlockUserNumResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getBlockUserNumResponse.block_user_nums) + getBlockUserNumResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockUserNumResponse decode(ProtoReader protoReader) throws IOException {
            C16446a aVar = new C16446a();
            aVar.f42744a = 0;
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
                    aVar.f42744a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBlockUserNumResponse getBlockUserNumResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getBlockUserNumResponse.block_user_nums);
            protoWriter.writeBytes(getBlockUserNumResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserNumResponse$a */
    public static final class C16446a extends Message.Builder<GetBlockUserNumResponse, C16446a> {

        /* renamed from: a */
        public Integer f42744a;

        /* renamed from: a */
        public GetBlockUserNumResponse build() {
            Integer num = this.f42744a;
            if (num != null) {
                return new GetBlockUserNumResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "block_user_nums");
        }
    }

    @Override // com.squareup.wire.Message
    public C16446a newBuilder() {
        C16446a aVar = new C16446a();
        aVar.f42744a = this.block_user_nums;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetBlockUserNumResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", block_user_nums=");
        sb.append(this.block_user_nums);
        StringBuilder replace = sb.replace(0, 2, "GetBlockUserNumResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockUserNumResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public GetBlockUserNumResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.block_user_nums = num;
    }
}
