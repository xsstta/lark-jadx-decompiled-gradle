package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SetDomainAliasRequest extends Message<SetDomainAliasRequest, C19753a> {
    public static final ProtoAdapter<SetDomainAliasRequest> ADAPTER = new C19754b();
    private static final long serialVersionUID = 0;
    public final Map<String, DomainSettings.Alias> domain2alias;

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetDomainAliasRequest$a */
    public static final class C19753a extends Message.Builder<SetDomainAliasRequest, C19753a> {

        /* renamed from: a */
        public Map<String, DomainSettings.Alias> f48218a = Internal.newMutableMap();

        /* renamed from: a */
        public SetDomainAliasRequest build() {
            return new SetDomainAliasRequest(this.f48218a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetDomainAliasRequest$b */
    private static final class C19754b extends ProtoAdapter<SetDomainAliasRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, DomainSettings.Alias>> f48219a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DomainSettings.Alias.ADAPTER);

        C19754b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetDomainAliasRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetDomainAliasRequest setDomainAliasRequest) {
            return this.f48219a.encodedSizeWithTag(1, setDomainAliasRequest.domain2alias) + setDomainAliasRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetDomainAliasRequest decode(ProtoReader protoReader) throws IOException {
            C19753a aVar = new C19753a();
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
                    aVar.f48218a.putAll(this.f48219a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetDomainAliasRequest setDomainAliasRequest) throws IOException {
            this.f48219a.encodeWithTag(protoWriter, 1, setDomainAliasRequest.domain2alias);
            protoWriter.writeBytes(setDomainAliasRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19753a newBuilder() {
        C19753a aVar = new C19753a();
        aVar.f48218a = Internal.copyOf("domain2alias", this.domain2alias);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "SetDomainAliasRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.domain2alias.isEmpty()) {
            sb.append(", domain2alias=");
            sb.append(this.domain2alias);
        }
        StringBuilder replace = sb.replace(0, 2, "SetDomainAliasRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetDomainAliasRequest(Map<String, DomainSettings.Alias> map) {
        this(map, ByteString.EMPTY);
    }

    public SetDomainAliasRequest(Map<String, DomainSettings.Alias> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.domain2alias = Internal.immutableCopyOf("domain2alias", map);
    }
}
