package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRlimitResponse extends Message<GetRlimitResponse, C14987a> {
    public static final ProtoAdapter<GetRlimitResponse> ADAPTER = new C14988b();
    public static final Integer DEFAULT_RLIM_CUR = 0;
    public static final Integer DEFAULT_RLIM_MAX = 0;
    private static final long serialVersionUID = 0;
    public final Integer rlim_cur;
    public final Integer rlim_max;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetRlimitResponse$b */
    private static final class C14988b extends ProtoAdapter<GetRlimitResponse> {
        C14988b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRlimitResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRlimitResponse getRlimitResponse) {
            int i;
            int i2 = 0;
            if (getRlimitResponse.rlim_cur != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getRlimitResponse.rlim_cur);
            } else {
                i = 0;
            }
            if (getRlimitResponse.rlim_max != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getRlimitResponse.rlim_max);
            }
            return i + i2 + getRlimitResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRlimitResponse decode(ProtoReader protoReader) throws IOException {
            C14987a aVar = new C14987a();
            aVar.f39653a = 0;
            aVar.f39654b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39653a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39654b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRlimitResponse getRlimitResponse) throws IOException {
            if (getRlimitResponse.rlim_cur != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getRlimitResponse.rlim_cur);
            }
            if (getRlimitResponse.rlim_max != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getRlimitResponse.rlim_max);
            }
            protoWriter.writeBytes(getRlimitResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetRlimitResponse$a */
    public static final class C14987a extends Message.Builder<GetRlimitResponse, C14987a> {

        /* renamed from: a */
        public Integer f39653a;

        /* renamed from: b */
        public Integer f39654b;

        /* renamed from: a */
        public GetRlimitResponse build() {
            return new GetRlimitResponse(this.f39653a, this.f39654b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14987a newBuilder() {
        C14987a aVar = new C14987a();
        aVar.f39653a = this.rlim_cur;
        aVar.f39654b = this.rlim_max;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetRlimitResponse");
        StringBuilder sb = new StringBuilder();
        if (this.rlim_cur != null) {
            sb.append(", rlim_cur=");
            sb.append(this.rlim_cur);
        }
        if (this.rlim_max != null) {
            sb.append(", rlim_max=");
            sb.append(this.rlim_max);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRlimitResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRlimitResponse(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetRlimitResponse(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rlim_cur = num;
        this.rlim_max = num2;
    }
}
