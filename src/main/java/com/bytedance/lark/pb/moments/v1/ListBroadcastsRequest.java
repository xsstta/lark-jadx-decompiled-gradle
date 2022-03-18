package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListBroadcastsRequest extends Message<ListBroadcastsRequest, C18414a> {
    public static final ProtoAdapter<ListBroadcastsRequest> ADAPTER = new C18415b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListBroadcastsRequest$b */
    private static final class C18415b extends ProtoAdapter<ListBroadcastsRequest> {
        C18415b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListBroadcastsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListBroadcastsRequest listBroadcastsRequest) {
            return listBroadcastsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListBroadcastsRequest decode(ProtoReader protoReader) throws IOException {
            C18414a aVar = new C18414a();
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
        public void encode(ProtoWriter protoWriter, ListBroadcastsRequest listBroadcastsRequest) throws IOException {
            protoWriter.writeBytes(listBroadcastsRequest.unknownFields());
        }
    }

    public ListBroadcastsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListBroadcastsRequest$a */
    public static final class C18414a extends Message.Builder<ListBroadcastsRequest, C18414a> {
        /* renamed from: a */
        public ListBroadcastsRequest build() {
            return new ListBroadcastsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18414a newBuilder() {
        C18414a aVar = new C18414a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListBroadcastsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ListBroadcastsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListBroadcastsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
