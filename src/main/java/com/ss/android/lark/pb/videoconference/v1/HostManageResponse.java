package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class HostManageResponse extends Message<HostManageResponse, C50751a> {
    public static final ProtoAdapter<HostManageResponse> ADAPTER = new C50752b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageResponse$b */
    private static final class C50752b extends ProtoAdapter<HostManageResponse> {
        C50752b() {
            super(FieldEncoding.LENGTH_DELIMITED, HostManageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(HostManageResponse hostManageResponse) {
            return hostManageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public HostManageResponse decode(ProtoReader protoReader) throws IOException {
            C50751a aVar = new C50751a();
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
        public void encode(ProtoWriter protoWriter, HostManageResponse hostManageResponse) throws IOException {
            protoWriter.writeBytes(hostManageResponse.unknownFields());
        }
    }

    public HostManageResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageResponse$a */
    public static final class C50751a extends Message.Builder<HostManageResponse, C50751a> {
        /* renamed from: a */
        public HostManageResponse build() {
            return new HostManageResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50751a newBuilder() {
        C50751a aVar = new C50751a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "HostManageResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "HostManageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public HostManageResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
