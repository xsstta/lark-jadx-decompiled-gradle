package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullUserSearchTabsRequest extends Message<PullUserSearchTabsRequest, C50032a> {
    public static final ProtoAdapter<PullUserSearchTabsRequest> ADAPTER = new C50033b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.searches.PullUserSearchTabsRequest$b */
    private static final class C50033b extends ProtoAdapter<PullUserSearchTabsRequest> {
        C50033b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullUserSearchTabsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullUserSearchTabsRequest pullUserSearchTabsRequest) {
            return pullUserSearchTabsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullUserSearchTabsRequest decode(ProtoReader protoReader) throws IOException {
            C50032a aVar = new C50032a();
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
        public void encode(ProtoWriter protoWriter, PullUserSearchTabsRequest pullUserSearchTabsRequest) throws IOException {
            protoWriter.writeBytes(pullUserSearchTabsRequest.unknownFields());
        }
    }

    public PullUserSearchTabsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.searches.PullUserSearchTabsRequest$a */
    public static final class C50032a extends Message.Builder<PullUserSearchTabsRequest, C50032a> {
        /* renamed from: a */
        public PullUserSearchTabsRequest build() {
            return new PullUserSearchTabsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50032a newBuilder() {
        C50032a aVar = new C50032a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullUserSearchTabsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullUserSearchTabsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
