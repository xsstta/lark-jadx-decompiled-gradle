package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DelVcVirtualBackgroundRequest extends Message<DelVcVirtualBackgroundRequest, C50523a> {
    public static final ProtoAdapter<DelVcVirtualBackgroundRequest> ADAPTER = new C50524b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DelVcVirtualBackgroundRequest$b */
    private static final class C50524b extends ProtoAdapter<DelVcVirtualBackgroundRequest> {
        C50524b() {
            super(FieldEncoding.LENGTH_DELIMITED, DelVcVirtualBackgroundRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DelVcVirtualBackgroundRequest delVcVirtualBackgroundRequest) {
            int i;
            if (delVcVirtualBackgroundRequest.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, delVcVirtualBackgroundRequest.key);
            } else {
                i = 0;
            }
            return i + delVcVirtualBackgroundRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DelVcVirtualBackgroundRequest decode(ProtoReader protoReader) throws IOException {
            C50523a aVar = new C50523a();
            aVar.f126126a = "";
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
                    aVar.f126126a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DelVcVirtualBackgroundRequest delVcVirtualBackgroundRequest) throws IOException {
            if (delVcVirtualBackgroundRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, delVcVirtualBackgroundRequest.key);
            }
            protoWriter.writeBytes(delVcVirtualBackgroundRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DelVcVirtualBackgroundRequest$a */
    public static final class C50523a extends Message.Builder<DelVcVirtualBackgroundRequest, C50523a> {

        /* renamed from: a */
        public String f126126a;

        /* renamed from: a */
        public DelVcVirtualBackgroundRequest build() {
            return new DelVcVirtualBackgroundRequest(this.f126126a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50523a mo174981a(String str) {
            this.f126126a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50523a newBuilder() {
        C50523a aVar = new C50523a();
        aVar.f126126a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "DelVcVirtualBackgroundRequest");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        StringBuilder replace = sb.replace(0, 2, "DelVcVirtualBackgroundRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DelVcVirtualBackgroundRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DelVcVirtualBackgroundRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
