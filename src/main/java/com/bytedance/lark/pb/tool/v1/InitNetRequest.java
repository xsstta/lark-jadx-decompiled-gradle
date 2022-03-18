package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class InitNetRequest extends Message<InitNetRequest, C19713a> {
    public static final ProtoAdapter<InitNetRequest> ADAPTER = new C19714b();
    private static final long serialVersionUID = 0;
    public final List<HostAlias> optimized_alias;

    public enum HostAlias implements WireEnum {
        DOCS_API(1),
        MINA(2),
        OPEN(3),
        DOCS_DRIVE(4);
        
        public static final ProtoAdapter<HostAlias> ADAPTER = ProtoAdapter.newEnumAdapter(HostAlias.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static HostAlias fromValue(int i) {
            if (i == 1) {
                return DOCS_API;
            }
            if (i == 2) {
                return MINA;
            }
            if (i == 3) {
                return OPEN;
            }
            if (i != 4) {
                return null;
            }
            return DOCS_DRIVE;
        }

        private HostAlias(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.InitNetRequest$b */
    private static final class C19714b extends ProtoAdapter<InitNetRequest> {
        C19714b() {
            super(FieldEncoding.LENGTH_DELIMITED, InitNetRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(InitNetRequest initNetRequest) {
            return HostAlias.ADAPTER.asRepeated().encodedSizeWithTag(1, initNetRequest.optimized_alias) + initNetRequest.unknownFields().size();
        }

        /* renamed from: a */
        public InitNetRequest decode(ProtoReader protoReader) throws IOException {
            C19713a aVar = new C19713a();
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
                    try {
                        aVar.f48172a.add(HostAlias.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InitNetRequest initNetRequest) throws IOException {
            HostAlias.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, initNetRequest.optimized_alias);
            protoWriter.writeBytes(initNetRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.InitNetRequest$a */
    public static final class C19713a extends Message.Builder<InitNetRequest, C19713a> {

        /* renamed from: a */
        public List<HostAlias> f48172a = Internal.newMutableList();

        /* renamed from: a */
        public InitNetRequest build() {
            return new InitNetRequest(this.f48172a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19713a mo66816a(List<HostAlias> list) {
            Internal.checkElementsNotNull(list);
            this.f48172a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19713a newBuilder() {
        C19713a aVar = new C19713a();
        aVar.f48172a = Internal.copyOf("optimized_alias", this.optimized_alias);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "InitNetRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.optimized_alias.isEmpty()) {
            sb.append(", optimized_alias=");
            sb.append(this.optimized_alias);
        }
        StringBuilder replace = sb.replace(0, 2, "InitNetRequest{");
        replace.append('}');
        return replace.toString();
    }

    public InitNetRequest(List<HostAlias> list) {
        this(list, ByteString.EMPTY);
    }

    public InitNetRequest(List<HostAlias> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.optimized_alias = Internal.immutableCopyOf("optimized_alias", list);
    }
}
