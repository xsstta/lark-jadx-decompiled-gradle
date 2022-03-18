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

public final class ConfigTabsRequest extends Message<ConfigTabsRequest, C18342a> {
    public static final ProtoAdapter<ConfigTabsRequest> ADAPTER = new C18343b();
    private static final long serialVersionUID = 0;
    public final List<String> tab_ids;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ConfigTabsRequest$b */
    private static final class C18343b extends ProtoAdapter<ConfigTabsRequest> {
        C18343b() {
            super(FieldEncoding.LENGTH_DELIMITED, ConfigTabsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ConfigTabsRequest configTabsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, configTabsRequest.tab_ids) + configTabsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ConfigTabsRequest decode(ProtoReader protoReader) throws IOException {
            C18342a aVar = new C18342a();
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
                    aVar.f45700a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ConfigTabsRequest configTabsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, configTabsRequest.tab_ids);
            protoWriter.writeBytes(configTabsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ConfigTabsRequest$a */
    public static final class C18342a extends Message.Builder<ConfigTabsRequest, C18342a> {

        /* renamed from: a */
        public List<String> f45700a = Internal.newMutableList();

        /* renamed from: a */
        public ConfigTabsRequest build() {
            return new ConfigTabsRequest(this.f45700a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18342a mo63469a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45700a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18342a newBuilder() {
        C18342a aVar = new C18342a();
        aVar.f45700a = Internal.copyOf("tab_ids", this.tab_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ConfigTabsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.tab_ids.isEmpty()) {
            sb.append(", tab_ids=");
            sb.append(this.tab_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "ConfigTabsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ConfigTabsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public ConfigTabsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tab_ids = Internal.immutableCopyOf("tab_ids", list);
    }
}
