package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListTabsRequest extends Message<ListTabsRequest, C18438a> {
    public static final ProtoAdapter<ListTabsRequest> ADAPTER = new C18439b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListTabsRequest$b */
    private static final class C18439b extends ProtoAdapter<ListTabsRequest> {
        C18439b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListTabsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListTabsRequest listTabsRequest) {
            return listTabsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListTabsRequest decode(ProtoReader protoReader) throws IOException {
            C18438a aVar = new C18438a();
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
        public void encode(ProtoWriter protoWriter, ListTabsRequest listTabsRequest) throws IOException {
            protoWriter.writeBytes(listTabsRequest.unknownFields());
        }
    }

    public ListTabsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListTabsRequest$a */
    public static final class C18438a extends Message.Builder<ListTabsRequest, C18438a> {
        /* renamed from: a */
        public ListTabsRequest build() {
            return new ListTabsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18438a newBuilder() {
        C18438a aVar = new C18438a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListTabsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ListTabsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListTabsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
