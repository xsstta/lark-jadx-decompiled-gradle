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

public final class SetReqIdSuffixRequest extends Message<SetReqIdSuffixRequest, C15276a> {
    public static final ProtoAdapter<SetReqIdSuffixRequest> ADAPTER = new C15277b();
    private static final long serialVersionUID = 0;
    public final String suffix;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetReqIdSuffixRequest$b */
    private static final class C15277b extends ProtoAdapter<SetReqIdSuffixRequest> {
        C15277b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetReqIdSuffixRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetReqIdSuffixRequest setReqIdSuffixRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setReqIdSuffixRequest.suffix) + setReqIdSuffixRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetReqIdSuffixRequest decode(ProtoReader protoReader) throws IOException {
            C15276a aVar = new C15276a();
            aVar.f40473a = "";
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
                    aVar.f40473a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetReqIdSuffixRequest setReqIdSuffixRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setReqIdSuffixRequest.suffix);
            protoWriter.writeBytes(setReqIdSuffixRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetReqIdSuffixRequest$a */
    public static final class C15276a extends Message.Builder<SetReqIdSuffixRequest, C15276a> {

        /* renamed from: a */
        public String f40473a;

        /* renamed from: a */
        public SetReqIdSuffixRequest build() {
            String str = this.f40473a;
            if (str != null) {
                return new SetReqIdSuffixRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "suffix");
        }

        /* renamed from: a */
        public C15276a mo55594a(String str) {
            this.f40473a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15276a newBuilder() {
        C15276a aVar = new C15276a();
        aVar.f40473a = this.suffix;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetReqIdSuffixRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", suffix=");
        sb.append(this.suffix);
        StringBuilder replace = sb.replace(0, 2, "SetReqIdSuffixRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetReqIdSuffixRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetReqIdSuffixRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.suffix = str;
    }
}
