package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullAvailableSearchTabsRequest extends Message<PullAvailableSearchTabsRequest, C50028a> {
    public static final ProtoAdapter<PullAvailableSearchTabsRequest> ADAPTER = new C50029b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.searches.PullAvailableSearchTabsRequest$b */
    private static final class C50029b extends ProtoAdapter<PullAvailableSearchTabsRequest> {
        C50029b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAvailableSearchTabsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAvailableSearchTabsRequest pullAvailableSearchTabsRequest) {
            return pullAvailableSearchTabsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullAvailableSearchTabsRequest decode(ProtoReader protoReader) throws IOException {
            C50028a aVar = new C50028a();
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
        public void encode(ProtoWriter protoWriter, PullAvailableSearchTabsRequest pullAvailableSearchTabsRequest) throws IOException {
            protoWriter.writeBytes(pullAvailableSearchTabsRequest.unknownFields());
        }
    }

    public PullAvailableSearchTabsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.searches.PullAvailableSearchTabsRequest$a */
    public static final class C50028a extends Message.Builder<PullAvailableSearchTabsRequest, C50028a> {
        /* renamed from: a */
        public PullAvailableSearchTabsRequest build() {
            return new PullAvailableSearchTabsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50028a newBuilder() {
        C50028a aVar = new C50028a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullAvailableSearchTabsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullAvailableSearchTabsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
