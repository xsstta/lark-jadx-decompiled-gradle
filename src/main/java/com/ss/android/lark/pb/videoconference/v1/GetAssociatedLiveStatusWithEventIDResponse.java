package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAssociatedLiveStatusWithEventIDResponse extends Message<GetAssociatedLiveStatusWithEventIDResponse, C50599a> {
    public static final ProtoAdapter<GetAssociatedLiveStatusWithEventIDResponse> ADAPTER = new C50600b();
    private static final long serialVersionUID = 0;
    public final AssociatedLiveStatus status;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedLiveStatusWithEventIDResponse$b */
    private static final class C50600b extends ProtoAdapter<GetAssociatedLiveStatusWithEventIDResponse> {
        C50600b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAssociatedLiveStatusWithEventIDResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAssociatedLiveStatusWithEventIDResponse getAssociatedLiveStatusWithEventIDResponse) {
            int i;
            if (getAssociatedLiveStatusWithEventIDResponse.status != null) {
                i = AssociatedLiveStatus.ADAPTER.encodedSizeWithTag(1, getAssociatedLiveStatusWithEventIDResponse.status);
            } else {
                i = 0;
            }
            return i + getAssociatedLiveStatusWithEventIDResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAssociatedLiveStatusWithEventIDResponse decode(ProtoReader protoReader) throws IOException {
            C50599a aVar = new C50599a();
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
                    aVar.f126324a = AssociatedLiveStatus.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAssociatedLiveStatusWithEventIDResponse getAssociatedLiveStatusWithEventIDResponse) throws IOException {
            if (getAssociatedLiveStatusWithEventIDResponse.status != null) {
                AssociatedLiveStatus.ADAPTER.encodeWithTag(protoWriter, 1, getAssociatedLiveStatusWithEventIDResponse.status);
            }
            protoWriter.writeBytes(getAssociatedLiveStatusWithEventIDResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedLiveStatusWithEventIDResponse$a */
    public static final class C50599a extends Message.Builder<GetAssociatedLiveStatusWithEventIDResponse, C50599a> {

        /* renamed from: a */
        public AssociatedLiveStatus f126324a;

        /* renamed from: a */
        public GetAssociatedLiveStatusWithEventIDResponse build() {
            return new GetAssociatedLiveStatusWithEventIDResponse(this.f126324a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50599a newBuilder() {
        C50599a aVar = new C50599a();
        aVar.f126324a = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAssociatedLiveStatusWithEventIDResponse");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAssociatedLiveStatusWithEventIDResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAssociatedLiveStatusWithEventIDResponse(AssociatedLiveStatus associatedLiveStatus) {
        this(associatedLiveStatus, ByteString.EMPTY);
    }

    public GetAssociatedLiveStatusWithEventIDResponse(AssociatedLiveStatus associatedLiveStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = associatedLiveStatus;
    }
}
