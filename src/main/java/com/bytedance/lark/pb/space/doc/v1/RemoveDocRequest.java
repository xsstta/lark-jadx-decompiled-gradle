package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RemoveDocRequest extends Message<RemoveDocRequest, C19273a> {
    public static final ProtoAdapter<RemoveDocRequest> ADAPTER = new C19274b();
    private static final long serialVersionUID = 0;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.RemoveDocRequest$b */
    private static final class C19274b extends ProtoAdapter<RemoveDocRequest> {
        C19274b() {
            super(FieldEncoding.LENGTH_DELIMITED, RemoveDocRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RemoveDocRequest removeDocRequest) {
            int i;
            if (removeDocRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, removeDocRequest.token);
            } else {
                i = 0;
            }
            return i + removeDocRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RemoveDocRequest decode(ProtoReader protoReader) throws IOException {
            C19273a aVar = new C19273a();
            aVar.f47465a = "";
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
                    aVar.f47465a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RemoveDocRequest removeDocRequest) throws IOException {
            if (removeDocRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, removeDocRequest.token);
            }
            protoWriter.writeBytes(removeDocRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.RemoveDocRequest$a */
    public static final class C19273a extends Message.Builder<RemoveDocRequest, C19273a> {

        /* renamed from: a */
        public String f47465a;

        /* renamed from: a */
        public RemoveDocRequest build() {
            return new RemoveDocRequest(this.f47465a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19273a mo65746a(String str) {
            this.f47465a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19273a newBuilder() {
        C19273a aVar = new C19273a();
        aVar.f47465a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "RemoveDocRequest");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "RemoveDocRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RemoveDocRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public RemoveDocRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
