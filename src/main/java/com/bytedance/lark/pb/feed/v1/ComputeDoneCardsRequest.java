package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ComputeDoneCardsRequest extends Message<ComputeDoneCardsRequest, C17100a> {
    public static final ProtoAdapter<ComputeDoneCardsRequest> ADAPTER = new C17101b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.ComputeDoneCardsRequest$b */
    private static final class C17101b extends ProtoAdapter<ComputeDoneCardsRequest> {
        C17101b() {
            super(FieldEncoding.LENGTH_DELIMITED, ComputeDoneCardsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ComputeDoneCardsRequest computeDoneCardsRequest) {
            return computeDoneCardsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ComputeDoneCardsRequest decode(ProtoReader protoReader) throws IOException {
            C17100a aVar = new C17100a();
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
        public void encode(ProtoWriter protoWriter, ComputeDoneCardsRequest computeDoneCardsRequest) throws IOException {
            protoWriter.writeBytes(computeDoneCardsRequest.unknownFields());
        }
    }

    public ComputeDoneCardsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.ComputeDoneCardsRequest$a */
    public static final class C17100a extends Message.Builder<ComputeDoneCardsRequest, C17100a> {
        /* renamed from: a */
        public ComputeDoneCardsRequest build() {
            return new ComputeDoneCardsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17100a newBuilder() {
        C17100a aVar = new C17100a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "ComputeDoneCardsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ComputeDoneCardsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ComputeDoneCardsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
