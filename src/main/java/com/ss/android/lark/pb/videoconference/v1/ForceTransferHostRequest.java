package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ForceTransferHostRequest extends Message<ForceTransferHostRequest, C50587a> {
    public static final ProtoAdapter<ForceTransferHostRequest> ADAPTER = new C50588b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ForceTransferHostRequest$b */
    private static final class C50588b extends ProtoAdapter<ForceTransferHostRequest> {
        C50588b() {
            super(FieldEncoding.LENGTH_DELIMITED, ForceTransferHostRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ForceTransferHostRequest forceTransferHostRequest) {
            int i;
            if (forceTransferHostRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, forceTransferHostRequest.meeting_id);
            } else {
                i = 0;
            }
            return i + forceTransferHostRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ForceTransferHostRequest decode(ProtoReader protoReader) throws IOException {
            C50587a aVar = new C50587a();
            aVar.f126287a = "";
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
                    aVar.f126287a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ForceTransferHostRequest forceTransferHostRequest) throws IOException {
            if (forceTransferHostRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, forceTransferHostRequest.meeting_id);
            }
            protoWriter.writeBytes(forceTransferHostRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ForceTransferHostRequest$a */
    public static final class C50587a extends Message.Builder<ForceTransferHostRequest, C50587a> {

        /* renamed from: a */
        public String f126287a;

        /* renamed from: a */
        public ForceTransferHostRequest build() {
            return new ForceTransferHostRequest(this.f126287a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50587a mo175138a(String str) {
            this.f126287a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50587a newBuilder() {
        C50587a aVar = new C50587a();
        aVar.f126287a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ForceTransferHostRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ForceTransferHostRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ForceTransferHostRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public ForceTransferHostRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
