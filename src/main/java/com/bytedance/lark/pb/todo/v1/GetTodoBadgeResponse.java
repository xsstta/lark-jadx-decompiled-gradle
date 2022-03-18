package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoBadgeResponse extends Message<GetTodoBadgeResponse, C19541a> {
    public static final ProtoAdapter<GetTodoBadgeResponse> ADAPTER = new C19542b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoBadgeResponse$b */
    private static final class C19542b extends ProtoAdapter<GetTodoBadgeResponse> {
        C19542b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoBadgeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoBadgeResponse getTodoBadgeResponse) {
            int i;
            if (getTodoBadgeResponse.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getTodoBadgeResponse.count);
            } else {
                i = 0;
            }
            return i + getTodoBadgeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoBadgeResponse decode(ProtoReader protoReader) throws IOException {
            C19541a aVar = new C19541a();
            aVar.f47894a = 0;
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
                    aVar.f47894a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoBadgeResponse getTodoBadgeResponse) throws IOException {
            if (getTodoBadgeResponse.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getTodoBadgeResponse.count);
            }
            protoWriter.writeBytes(getTodoBadgeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoBadgeResponse$a */
    public static final class C19541a extends Message.Builder<GetTodoBadgeResponse, C19541a> {

        /* renamed from: a */
        public Integer f47894a;

        /* renamed from: a */
        public GetTodoBadgeResponse build() {
            return new GetTodoBadgeResponse(this.f47894a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19541a newBuilder() {
        C19541a aVar = new C19541a();
        aVar.f47894a = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoBadgeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoBadgeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoBadgeResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public GetTodoBadgeResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
    }
}
