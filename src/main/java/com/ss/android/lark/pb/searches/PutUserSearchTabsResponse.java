package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutUserSearchTabsResponse extends Message<PutUserSearchTabsResponse, C50038a> {
    public static final ProtoAdapter<PutUserSearchTabsResponse> ADAPTER = new C50039b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.searches.PutUserSearchTabsResponse$b */
    private static final class C50039b extends ProtoAdapter<PutUserSearchTabsResponse> {
        C50039b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutUserSearchTabsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutUserSearchTabsResponse putUserSearchTabsResponse) {
            return putUserSearchTabsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutUserSearchTabsResponse decode(ProtoReader protoReader) throws IOException {
            C50038a aVar = new C50038a();
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
        public void encode(ProtoWriter protoWriter, PutUserSearchTabsResponse putUserSearchTabsResponse) throws IOException {
            protoWriter.writeBytes(putUserSearchTabsResponse.unknownFields());
        }
    }

    public PutUserSearchTabsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.searches.PutUserSearchTabsResponse$a */
    public static final class C50038a extends Message.Builder<PutUserSearchTabsResponse, C50038a> {
        /* renamed from: a */
        public PutUserSearchTabsResponse build() {
            return new PutUserSearchTabsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50038a newBuilder() {
        C50038a aVar = new C50038a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PutUserSearchTabsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutUserSearchTabsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
