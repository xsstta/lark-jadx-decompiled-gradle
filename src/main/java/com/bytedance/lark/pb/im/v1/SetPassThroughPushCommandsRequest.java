package com.bytedance.lark.pb.im.v1;

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

public final class SetPassThroughPushCommandsRequest extends Message<SetPassThroughPushCommandsRequest, C18041a> {
    public static final ProtoAdapter<SetPassThroughPushCommandsRequest> ADAPTER = new C18042b();
    private static final long serialVersionUID = 0;
    public final List<Integer> commands;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetPassThroughPushCommandsRequest$b */
    private static final class C18042b extends ProtoAdapter<SetPassThroughPushCommandsRequest> {
        C18042b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetPassThroughPushCommandsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetPassThroughPushCommandsRequest setPassThroughPushCommandsRequest) {
            return ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, setPassThroughPushCommandsRequest.commands) + setPassThroughPushCommandsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetPassThroughPushCommandsRequest decode(ProtoReader protoReader) throws IOException {
            C18041a aVar = new C18041a();
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
                    aVar.f45163a.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetPassThroughPushCommandsRequest setPassThroughPushCommandsRequest) throws IOException {
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 1, setPassThroughPushCommandsRequest.commands);
            protoWriter.writeBytes(setPassThroughPushCommandsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetPassThroughPushCommandsRequest$a */
    public static final class C18041a extends Message.Builder<SetPassThroughPushCommandsRequest, C18041a> {

        /* renamed from: a */
        public List<Integer> f45163a = Internal.newMutableList();

        /* renamed from: a */
        public SetPassThroughPushCommandsRequest build() {
            return new SetPassThroughPushCommandsRequest(this.f45163a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18041a mo62654a(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.f45163a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18041a newBuilder() {
        C18041a aVar = new C18041a();
        aVar.f45163a = Internal.copyOf("commands", this.commands);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetPassThroughPushCommandsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.commands.isEmpty()) {
            sb.append(", commands=");
            sb.append(this.commands);
        }
        StringBuilder replace = sb.replace(0, 2, "SetPassThroughPushCommandsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetPassThroughPushCommandsRequest(List<Integer> list) {
        this(list, ByteString.EMPTY);
    }

    public SetPassThroughPushCommandsRequest(List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.commands = Internal.immutableCopyOf("commands", list);
    }
}
