package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DelVcVirtualBackgroundResponse extends Message<DelVcVirtualBackgroundResponse, C50525a> {
    public static final ProtoAdapter<DelVcVirtualBackgroundResponse> ADAPTER = new C50526b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DelVcVirtualBackgroundResponse$b */
    private static final class C50526b extends ProtoAdapter<DelVcVirtualBackgroundResponse> {
        C50526b() {
            super(FieldEncoding.LENGTH_DELIMITED, DelVcVirtualBackgroundResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DelVcVirtualBackgroundResponse delVcVirtualBackgroundResponse) {
            return delVcVirtualBackgroundResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DelVcVirtualBackgroundResponse decode(ProtoReader protoReader) throws IOException {
            C50525a aVar = new C50525a();
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
        public void encode(ProtoWriter protoWriter, DelVcVirtualBackgroundResponse delVcVirtualBackgroundResponse) throws IOException {
            protoWriter.writeBytes(delVcVirtualBackgroundResponse.unknownFields());
        }
    }

    public DelVcVirtualBackgroundResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DelVcVirtualBackgroundResponse$a */
    public static final class C50525a extends Message.Builder<DelVcVirtualBackgroundResponse, C50525a> {
        /* renamed from: a */
        public DelVcVirtualBackgroundResponse build() {
            return new DelVcVirtualBackgroundResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50525a newBuilder() {
        C50525a aVar = new C50525a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "DelVcVirtualBackgroundResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DelVcVirtualBackgroundResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DelVcVirtualBackgroundResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
