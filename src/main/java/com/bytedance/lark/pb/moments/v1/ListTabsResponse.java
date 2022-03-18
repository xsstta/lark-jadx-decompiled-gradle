package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ListTabsResponse extends Message<ListTabsResponse, C18440a> {
    public static final ProtoAdapter<ListTabsResponse> ADAPTER = new C18441b();
    private static final long serialVersionUID = 0;
    public final List<Tab> tabs;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListTabsResponse$b */
    private static final class C18441b extends ProtoAdapter<ListTabsResponse> {
        C18441b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListTabsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListTabsResponse listTabsResponse) {
            return Tab.ADAPTER.asRepeated().encodedSizeWithTag(1, listTabsResponse.tabs) + listTabsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListTabsResponse decode(ProtoReader protoReader) throws IOException {
            C18440a aVar = new C18440a();
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
                    aVar.f45831a.add(Tab.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListTabsResponse listTabsResponse) throws IOException {
            Tab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listTabsResponse.tabs);
            protoWriter.writeBytes(listTabsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListTabsResponse$a */
    public static final class C18440a extends Message.Builder<ListTabsResponse, C18440a> {

        /* renamed from: a */
        public List<Tab> f45831a = Internal.newMutableList();

        /* renamed from: a */
        public ListTabsResponse build() {
            return new ListTabsResponse(this.f45831a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18440a newBuilder() {
        C18440a aVar = new C18440a();
        aVar.f45831a = Internal.copyOf("tabs", this.tabs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListTabsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.tabs.isEmpty()) {
            sb.append(", tabs=");
            sb.append(this.tabs);
        }
        StringBuilder replace = sb.replace(0, 2, "ListTabsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListTabsResponse(List<Tab> list) {
        this(list, ByteString.EMPTY);
    }

    public ListTabsResponse(List<Tab> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tabs = Internal.immutableCopyOf("tabs", list);
    }
}
