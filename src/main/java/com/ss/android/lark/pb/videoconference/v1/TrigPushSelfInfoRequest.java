package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TrigPushSelfInfoRequest extends Message<TrigPushSelfInfoRequest, C51120a> {
    public static final ProtoAdapter<TrigPushSelfInfoRequest> ADAPTER = new C51121b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TrigPushSelfInfoRequest$b */
    private static final class C51121b extends ProtoAdapter<TrigPushSelfInfoRequest> {
        C51121b() {
            super(FieldEncoding.LENGTH_DELIMITED, TrigPushSelfInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TrigPushSelfInfoRequest trigPushSelfInfoRequest) {
            return trigPushSelfInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TrigPushSelfInfoRequest decode(ProtoReader protoReader) throws IOException {
            C51120a aVar = new C51120a();
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
        public void encode(ProtoWriter protoWriter, TrigPushSelfInfoRequest trigPushSelfInfoRequest) throws IOException {
            protoWriter.writeBytes(trigPushSelfInfoRequest.unknownFields());
        }
    }

    public TrigPushSelfInfoRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TrigPushSelfInfoRequest$a */
    public static final class C51120a extends Message.Builder<TrigPushSelfInfoRequest, C51120a> {
        /* renamed from: a */
        public TrigPushSelfInfoRequest build() {
            return new TrigPushSelfInfoRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51120a newBuilder() {
        C51120a aVar = new C51120a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "TrigPushSelfInfoRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "TrigPushSelfInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TrigPushSelfInfoRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
