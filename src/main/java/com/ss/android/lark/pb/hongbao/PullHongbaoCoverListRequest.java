package com.ss.android.lark.pb.hongbao;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullHongbaoCoverListRequest extends Message<PullHongbaoCoverListRequest, Builder> {
    public static final ProtoAdapter<PullHongbaoCoverListRequest> ADAPTER = new C49798a();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.hongbao.PullHongbaoCoverListRequest$a */
    private static final class C49798a extends ProtoAdapter<PullHongbaoCoverListRequest> {
        C49798a() {
            super(FieldEncoding.LENGTH_DELIMITED, PullHongbaoCoverListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullHongbaoCoverListRequest pullHongbaoCoverListRequest) {
            return pullHongbaoCoverListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullHongbaoCoverListRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullHongbaoCoverListRequest pullHongbaoCoverListRequest) throws IOException {
            protoWriter.writeBytes(pullHongbaoCoverListRequest.unknownFields());
        }
    }

    public PullHongbaoCoverListRequest() {
        this(ByteString.EMPTY);
    }

    public static final class Builder extends Message.Builder<PullHongbaoCoverListRequest, Builder> {
        @Override // com.squareup.wire.Message.Builder
        public PullHongbaoCoverListRequest build() {
            return new PullHongbaoCoverListRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullHongbaoCoverListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullHongbaoCoverListRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
