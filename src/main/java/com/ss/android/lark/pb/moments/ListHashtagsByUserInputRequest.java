package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListHashtagsByUserInputRequest extends Message<ListHashtagsByUserInputRequest, C49920a> {
    public static final ProtoAdapter<ListHashtagsByUserInputRequest> ADAPTER = new C49921b();
    private static final long serialVersionUID = 0;
    public final String muser_input;

    /* renamed from: com.ss.android.lark.pb.moments.ListHashtagsByUserInputRequest$b */
    private static final class C49921b extends ProtoAdapter<ListHashtagsByUserInputRequest> {
        C49921b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListHashtagsByUserInputRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListHashtagsByUserInputRequest listHashtagsByUserInputRequest) {
            int i;
            if (listHashtagsByUserInputRequest.muser_input != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listHashtagsByUserInputRequest.muser_input);
            } else {
                i = 0;
            }
            return i + listHashtagsByUserInputRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListHashtagsByUserInputRequest decode(ProtoReader protoReader) throws IOException {
            C49920a aVar = new C49920a();
            aVar.f124934a = "";
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
                    aVar.f124934a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListHashtagsByUserInputRequest listHashtagsByUserInputRequest) throws IOException {
            if (listHashtagsByUserInputRequest.muser_input != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listHashtagsByUserInputRequest.muser_input);
            }
            protoWriter.writeBytes(listHashtagsByUserInputRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.ListHashtagsByUserInputRequest$a */
    public static final class C49920a extends Message.Builder<ListHashtagsByUserInputRequest, C49920a> {

        /* renamed from: a */
        public String f124934a;

        /* renamed from: a */
        public ListHashtagsByUserInputRequest build() {
            return new ListHashtagsByUserInputRequest(this.f124934a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49920a mo173612a(String str) {
            this.f124934a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49920a newBuilder() {
        C49920a aVar = new C49920a();
        aVar.f124934a = this.muser_input;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.muser_input != null) {
            sb.append(", user_input=");
            sb.append(this.muser_input);
        }
        StringBuilder replace = sb.replace(0, 2, "ListHashtagsByUserInputRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListHashtagsByUserInputRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public ListHashtagsByUserInputRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_input = str;
    }
}
