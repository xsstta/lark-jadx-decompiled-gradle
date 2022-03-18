package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TakeTrafficDataRequest extends Message<TakeTrafficDataRequest, C19761a> {
    public static final ProtoAdapter<TakeTrafficDataRequest> ADAPTER = new C19762b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.tool.v1.TakeTrafficDataRequest$b */
    private static final class C19762b extends ProtoAdapter<TakeTrafficDataRequest> {
        C19762b() {
            super(FieldEncoding.LENGTH_DELIMITED, TakeTrafficDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TakeTrafficDataRequest takeTrafficDataRequest) {
            return takeTrafficDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TakeTrafficDataRequest decode(ProtoReader protoReader) throws IOException {
            C19761a aVar = new C19761a();
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
        public void encode(ProtoWriter protoWriter, TakeTrafficDataRequest takeTrafficDataRequest) throws IOException {
            protoWriter.writeBytes(takeTrafficDataRequest.unknownFields());
        }
    }

    public TakeTrafficDataRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.TakeTrafficDataRequest$a */
    public static final class C19761a extends Message.Builder<TakeTrafficDataRequest, C19761a> {
        /* renamed from: a */
        public TakeTrafficDataRequest build() {
            return new TakeTrafficDataRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19761a newBuilder() {
        C19761a aVar = new C19761a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "TakeTrafficDataRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "TakeTrafficDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TakeTrafficDataRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
