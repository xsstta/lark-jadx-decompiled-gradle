package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetAssociatedLiveStatusWithEventIDRequest extends Message<GetAssociatedLiveStatusWithEventIDRequest, C50597a> {
    public static final ProtoAdapter<GetAssociatedLiveStatusWithEventIDRequest> ADAPTER = new C50598b();
    private static final long serialVersionUID = 0;
    public final String associated_event_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedLiveStatusWithEventIDRequest$b */
    private static final class C50598b extends ProtoAdapter<GetAssociatedLiveStatusWithEventIDRequest> {
        C50598b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAssociatedLiveStatusWithEventIDRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAssociatedLiveStatusWithEventIDRequest getAssociatedLiveStatusWithEventIDRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getAssociatedLiveStatusWithEventIDRequest.associated_event_id) + getAssociatedLiveStatusWithEventIDRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAssociatedLiveStatusWithEventIDRequest decode(ProtoReader protoReader) throws IOException {
            C50597a aVar = new C50597a();
            aVar.f126323a = "";
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
                    aVar.f126323a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAssociatedLiveStatusWithEventIDRequest getAssociatedLiveStatusWithEventIDRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAssociatedLiveStatusWithEventIDRequest.associated_event_id);
            protoWriter.writeBytes(getAssociatedLiveStatusWithEventIDRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedLiveStatusWithEventIDRequest$a */
    public static final class C50597a extends Message.Builder<GetAssociatedLiveStatusWithEventIDRequest, C50597a> {

        /* renamed from: a */
        public String f126323a;

        /* renamed from: a */
        public GetAssociatedLiveStatusWithEventIDRequest build() {
            String str = this.f126323a;
            if (str != null) {
                return new GetAssociatedLiveStatusWithEventIDRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "associated_event_id");
        }

        /* renamed from: a */
        public C50597a mo175160a(String str) {
            this.f126323a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50597a newBuilder() {
        C50597a aVar = new C50597a();
        aVar.f126323a = this.associated_event_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAssociatedLiveStatusWithEventIDRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", associated_event_id=");
        sb.append(this.associated_event_id);
        StringBuilder replace = sb.replace(0, 2, "GetAssociatedLiveStatusWithEventIDRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAssociatedLiveStatusWithEventIDRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetAssociatedLiveStatusWithEventIDRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.associated_event_id = str;
    }
}
