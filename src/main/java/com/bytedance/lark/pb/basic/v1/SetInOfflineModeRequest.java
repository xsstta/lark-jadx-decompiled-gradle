package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetInOfflineModeRequest extends Message<SetInOfflineModeRequest, C15272a> {
    public static final ProtoAdapter<SetInOfflineModeRequest> ADAPTER = new C15273b();
    public static final Boolean DEFAULT_IS_OFFLINE = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_offline;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetInOfflineModeRequest$b */
    private static final class C15273b extends ProtoAdapter<SetInOfflineModeRequest> {
        C15273b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetInOfflineModeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetInOfflineModeRequest setInOfflineModeRequest) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, setInOfflineModeRequest.is_offline) + setInOfflineModeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetInOfflineModeRequest decode(ProtoReader protoReader) throws IOException {
            C15272a aVar = new C15272a();
            aVar.f40472a = false;
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
                    aVar.f40472a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetInOfflineModeRequest setInOfflineModeRequest) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setInOfflineModeRequest.is_offline);
            protoWriter.writeBytes(setInOfflineModeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetInOfflineModeRequest$a */
    public static final class C15272a extends Message.Builder<SetInOfflineModeRequest, C15272a> {

        /* renamed from: a */
        public Boolean f40472a;

        /* renamed from: a */
        public SetInOfflineModeRequest build() {
            Boolean bool = this.f40472a;
            if (bool != null) {
                return new SetInOfflineModeRequest(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_offline");
        }

        /* renamed from: a */
        public C15272a mo55585a(Boolean bool) {
            this.f40472a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15272a newBuilder() {
        C15272a aVar = new C15272a();
        aVar.f40472a = this.is_offline;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetInOfflineModeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_offline=");
        sb.append(this.is_offline);
        StringBuilder replace = sb.replace(0, 2, "SetInOfflineModeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetInOfflineModeRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public SetInOfflineModeRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_offline = bool;
    }
}
