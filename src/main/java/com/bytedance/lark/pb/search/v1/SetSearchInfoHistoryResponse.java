package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetSearchInfoHistoryResponse extends Message<SetSearchInfoHistoryResponse, C18931a> {
    public static final ProtoAdapter<SetSearchInfoHistoryResponse> ADAPTER = new C18932b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.search.v1.SetSearchInfoHistoryResponse$b */
    private static final class C18932b extends ProtoAdapter<SetSearchInfoHistoryResponse> {
        C18932b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSearchInfoHistoryResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSearchInfoHistoryResponse setSearchInfoHistoryResponse) {
            int i;
            if (setSearchInfoHistoryResponse.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setSearchInfoHistoryResponse.id);
            } else {
                i = 0;
            }
            return i + setSearchInfoHistoryResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetSearchInfoHistoryResponse decode(ProtoReader protoReader) throws IOException {
            C18931a aVar = new C18931a();
            aVar.f46814a = "";
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
                    aVar.f46814a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetSearchInfoHistoryResponse setSearchInfoHistoryResponse) throws IOException {
            if (setSearchInfoHistoryResponse.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setSearchInfoHistoryResponse.id);
            }
            protoWriter.writeBytes(setSearchInfoHistoryResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SetSearchInfoHistoryResponse$a */
    public static final class C18931a extends Message.Builder<SetSearchInfoHistoryResponse, C18931a> {

        /* renamed from: a */
        public String f46814a;

        /* renamed from: a */
        public SetSearchInfoHistoryResponse build() {
            return new SetSearchInfoHistoryResponse(this.f46814a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18931a newBuilder() {
        C18931a aVar = new C18931a();
        aVar.f46814a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SetSearchInfoHistoryResponse");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        StringBuilder replace = sb.replace(0, 2, "SetSearchInfoHistoryResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetSearchInfoHistoryResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetSearchInfoHistoryResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
