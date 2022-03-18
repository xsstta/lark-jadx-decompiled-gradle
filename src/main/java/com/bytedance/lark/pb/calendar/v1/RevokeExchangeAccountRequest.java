package com.bytedance.lark.pb.calendar.v1;

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

public final class RevokeExchangeAccountRequest extends Message<RevokeExchangeAccountRequest, C15980a> {
    public static final ProtoAdapter<RevokeExchangeAccountRequest> ADAPTER = new C15981b();
    private static final long serialVersionUID = 0;
    public final List<String> accounts;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RevokeExchangeAccountRequest$b */
    private static final class C15981b extends ProtoAdapter<RevokeExchangeAccountRequest> {
        C15981b() {
            super(FieldEncoding.LENGTH_DELIMITED, RevokeExchangeAccountRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RevokeExchangeAccountRequest revokeExchangeAccountRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, revokeExchangeAccountRequest.accounts) + revokeExchangeAccountRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RevokeExchangeAccountRequest decode(ProtoReader protoReader) throws IOException {
            C15980a aVar = new C15980a();
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
                    aVar.f41981a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RevokeExchangeAccountRequest revokeExchangeAccountRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, revokeExchangeAccountRequest.accounts);
            protoWriter.writeBytes(revokeExchangeAccountRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RevokeExchangeAccountRequest$a */
    public static final class C15980a extends Message.Builder<RevokeExchangeAccountRequest, C15980a> {

        /* renamed from: a */
        public List<String> f41981a = Internal.newMutableList();

        /* renamed from: a */
        public RevokeExchangeAccountRequest build() {
            return new RevokeExchangeAccountRequest(this.f41981a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15980a mo57528a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41981a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15980a newBuilder() {
        C15980a aVar = new C15980a();
        aVar.f41981a = Internal.copyOf("accounts", this.accounts);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "RevokeExchangeAccountRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.accounts.isEmpty()) {
            sb.append(", accounts=");
            sb.append(this.accounts);
        }
        StringBuilder replace = sb.replace(0, 2, "RevokeExchangeAccountRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RevokeExchangeAccountRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public RevokeExchangeAccountRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.accounts = Internal.immutableCopyOf("accounts", list);
    }
}
