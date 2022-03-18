package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetAutoTranslateGlobalSwitchRequest extends Message<SetAutoTranslateGlobalSwitchRequest, C18037a> {
    public static final ProtoAdapter<SetAutoTranslateGlobalSwitchRequest> ADAPTER = new C18038b();
    public static final Boolean DEFAULT_IS_OPEN = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_open;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetAutoTranslateGlobalSwitchRequest$b */
    private static final class C18038b extends ProtoAdapter<SetAutoTranslateGlobalSwitchRequest> {
        C18038b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetAutoTranslateGlobalSwitchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetAutoTranslateGlobalSwitchRequest setAutoTranslateGlobalSwitchRequest) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, setAutoTranslateGlobalSwitchRequest.is_open) + setAutoTranslateGlobalSwitchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetAutoTranslateGlobalSwitchRequest decode(ProtoReader protoReader) throws IOException {
            C18037a aVar = new C18037a();
            aVar.f45161a = false;
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
                    aVar.f45161a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetAutoTranslateGlobalSwitchRequest setAutoTranslateGlobalSwitchRequest) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setAutoTranslateGlobalSwitchRequest.is_open);
            protoWriter.writeBytes(setAutoTranslateGlobalSwitchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetAutoTranslateGlobalSwitchRequest$a */
    public static final class C18037a extends Message.Builder<SetAutoTranslateGlobalSwitchRequest, C18037a> {

        /* renamed from: a */
        public Boolean f45161a;

        /* renamed from: a */
        public SetAutoTranslateGlobalSwitchRequest build() {
            Boolean bool = this.f45161a;
            if (bool != null) {
                return new SetAutoTranslateGlobalSwitchRequest(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_open");
        }

        /* renamed from: a */
        public C18037a mo62644a(Boolean bool) {
            this.f45161a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18037a newBuilder() {
        C18037a aVar = new C18037a();
        aVar.f45161a = this.is_open;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetAutoTranslateGlobalSwitchRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_open=");
        sb.append(this.is_open);
        StringBuilder replace = sb.replace(0, 2, "SetAutoTranslateGlobalSwitchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetAutoTranslateGlobalSwitchRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public SetAutoTranslateGlobalSwitchRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_open = bool;
    }
}
