package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TriggerSyncDataRequest extends Message<TriggerSyncDataRequest, C15364a> {
    public static final ProtoAdapter<TriggerSyncDataRequest> ADAPTER = new C15365b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerSyncDataRequest$b */
    private static final class C15365b extends ProtoAdapter<TriggerSyncDataRequest> {
        C15365b() {
            super(FieldEncoding.LENGTH_DELIMITED, TriggerSyncDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TriggerSyncDataRequest triggerSyncDataRequest) {
            return triggerSyncDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TriggerSyncDataRequest decode(ProtoReader protoReader) throws IOException {
            C15364a aVar = new C15364a();
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
        public void encode(ProtoWriter protoWriter, TriggerSyncDataRequest triggerSyncDataRequest) throws IOException {
            protoWriter.writeBytes(triggerSyncDataRequest.unknownFields());
        }
    }

    public TriggerSyncDataRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerSyncDataRequest$a */
    public static final class C15364a extends Message.Builder<TriggerSyncDataRequest, C15364a> {
        /* renamed from: a */
        public TriggerSyncDataRequest build() {
            return new TriggerSyncDataRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15364a newBuilder() {
        C15364a aVar = new C15364a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TriggerSyncDataRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "TriggerSyncDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TriggerSyncDataRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
