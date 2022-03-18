package com.bytedance.lark.pb.statistics.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMobileCodeRequest extends Message<GetMobileCodeRequest, C19409a> {
    public static final ProtoAdapter<GetMobileCodeRequest> ADAPTER = new C19410b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.statistics.v1.GetMobileCodeRequest$b */
    private static final class C19410b extends ProtoAdapter<GetMobileCodeRequest> {
        C19410b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMobileCodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMobileCodeRequest getMobileCodeRequest) {
            return getMobileCodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMobileCodeRequest decode(ProtoReader protoReader) throws IOException {
            C19409a aVar = new C19409a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMobileCodeRequest getMobileCodeRequest) throws IOException {
            protoWriter.writeBytes(getMobileCodeRequest.unknownFields());
        }
    }

    public GetMobileCodeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.GetMobileCodeRequest$a */
    public static final class C19409a extends Message.Builder<GetMobileCodeRequest, C19409a> {
        /* renamed from: a */
        public GetMobileCodeRequest build() {
            return new GetMobileCodeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19409a newBuilder() {
        C19409a aVar = new C19409a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("statistics", "GetMobileCodeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetMobileCodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMobileCodeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
