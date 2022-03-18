package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MakeUserOfflineRequest extends Message<MakeUserOfflineRequest, C19715a> {
    public static final ProtoAdapter<MakeUserOfflineRequest> ADAPTER = new C19716b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOfflineRequest$b */
    private static final class C19716b extends ProtoAdapter<MakeUserOfflineRequest> {
        C19716b() {
            super(FieldEncoding.LENGTH_DELIMITED, MakeUserOfflineRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MakeUserOfflineRequest makeUserOfflineRequest) {
            return makeUserOfflineRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MakeUserOfflineRequest decode(ProtoReader protoReader) throws IOException {
            C19715a aVar = new C19715a();
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
        public void encode(ProtoWriter protoWriter, MakeUserOfflineRequest makeUserOfflineRequest) throws IOException {
            protoWriter.writeBytes(makeUserOfflineRequest.unknownFields());
        }
    }

    public MakeUserOfflineRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOfflineRequest$a */
    public static final class C19715a extends Message.Builder<MakeUserOfflineRequest, C19715a> {
        /* renamed from: a */
        public MakeUserOfflineRequest build() {
            return new MakeUserOfflineRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19715a newBuilder() {
        C19715a aVar = new C19715a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "MakeUserOfflineRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MakeUserOfflineRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MakeUserOfflineRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
