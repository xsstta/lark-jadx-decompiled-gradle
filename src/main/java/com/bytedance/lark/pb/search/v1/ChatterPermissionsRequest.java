package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ChatterPermissionsRequest extends Message<ChatterPermissionsRequest, C18817a> {
    public static final ProtoAdapter<ChatterPermissionsRequest> ADAPTER = new C18818b();
    private static final long serialVersionUID = 0;
    public final List<ActionType> actions;

    /* renamed from: com.bytedance.lark.pb.search.v1.ChatterPermissionsRequest$b */
    private static final class C18818b extends ProtoAdapter<ChatterPermissionsRequest> {
        C18818b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterPermissionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterPermissionsRequest chatterPermissionsRequest) {
            return ActionType.ADAPTER.asRepeated().encodedSizeWithTag(1, chatterPermissionsRequest.actions) + chatterPermissionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterPermissionsRequest decode(ProtoReader protoReader) throws IOException {
            C18817a aVar = new C18817a();
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
                        aVar.f46387a.add(ActionType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatterPermissionsRequest chatterPermissionsRequest) throws IOException {
            ActionType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatterPermissionsRequest.actions);
            protoWriter.writeBytes(chatterPermissionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.ChatterPermissionsRequest$a */
    public static final class C18817a extends Message.Builder<ChatterPermissionsRequest, C18817a> {

        /* renamed from: a */
        public List<ActionType> f46387a = Internal.newMutableList();

        /* renamed from: a */
        public ChatterPermissionsRequest build() {
            return new ChatterPermissionsRequest(this.f46387a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18817a mo64609a(List<ActionType> list) {
            Internal.checkElementsNotNull(list);
            this.f46387a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18817a newBuilder() {
        C18817a aVar = new C18817a();
        aVar.f46387a = Internal.copyOf("actions", this.actions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ChatterPermissionsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.actions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.actions);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatterPermissionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ChatterPermissionsRequest(List<ActionType> list) {
        this(list, ByteString.EMPTY);
    }

    public ChatterPermissionsRequest(List<ActionType> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.actions = Internal.immutableCopyOf("actions", list);
    }
}
