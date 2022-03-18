package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetBadgeRequest extends Message<GetBadgeRequest, C49912a> {
    public static final ProtoAdapter<GetBadgeRequest> ADAPTER = new C49913b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.moments.GetBadgeRequest$b */
    private static final class C49913b extends ProtoAdapter<GetBadgeRequest> {
        C49913b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBadgeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBadgeRequest getBadgeRequest) {
            return getBadgeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBadgeRequest decode(ProtoReader protoReader) throws IOException {
            C49912a aVar = new C49912a();
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
        public void encode(ProtoWriter protoWriter, GetBadgeRequest getBadgeRequest) throws IOException {
            protoWriter.writeBytes(getBadgeRequest.unknownFields());
        }
    }

    public GetBadgeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.moments.GetBadgeRequest$a */
    public static final class C49912a extends Message.Builder<GetBadgeRequest, C49912a> {
        /* renamed from: a */
        public GetBadgeRequest build() {
            return new GetBadgeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49912a newBuilder() {
        C49912a aVar = new C49912a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetBadgeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBadgeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
