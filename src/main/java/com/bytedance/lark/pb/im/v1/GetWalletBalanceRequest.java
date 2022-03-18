package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetWalletBalanceRequest extends Message<GetWalletBalanceRequest, C17767a> {
    public static final ProtoAdapter<GetWalletBalanceRequest> ADAPTER = new C17768b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWalletBalanceRequest$b */
    private static final class C17768b extends ProtoAdapter<GetWalletBalanceRequest> {
        C17768b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetWalletBalanceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetWalletBalanceRequest getWalletBalanceRequest) {
            return getWalletBalanceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetWalletBalanceRequest decode(ProtoReader protoReader) throws IOException {
            C17767a aVar = new C17767a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetWalletBalanceRequest getWalletBalanceRequest) throws IOException {
            protoWriter.writeBytes(getWalletBalanceRequest.unknownFields());
        }
    }

    public GetWalletBalanceRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWalletBalanceRequest$a */
    public static final class C17767a extends Message.Builder<GetWalletBalanceRequest, C17767a> {
        /* renamed from: a */
        public GetWalletBalanceRequest build() {
            return new GetWalletBalanceRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17767a newBuilder() {
        C17767a aVar = new C17767a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetWalletBalanceRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetWalletBalanceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetWalletBalanceRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
