package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetParticipantsByIdsRequest extends Message<GetParticipantsByIdsRequest, C50665a> {
    public static final ProtoAdapter<GetParticipantsByIdsRequest> ADAPTER = new C50666b();
    private static final long serialVersionUID = 0;
    public final List<String> ids;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantsByIdsRequest$b */
    private static final class C50666b extends ProtoAdapter<GetParticipantsByIdsRequest> {
        C50666b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetParticipantsByIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetParticipantsByIdsRequest getParticipantsByIdsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getParticipantsByIdsRequest.ids) + getParticipantsByIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetParticipantsByIdsRequest decode(ProtoReader protoReader) throws IOException {
            C50665a aVar = new C50665a();
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
                    aVar.f126395a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetParticipantsByIdsRequest getParticipantsByIdsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getParticipantsByIdsRequest.ids);
            protoWriter.writeBytes(getParticipantsByIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantsByIdsRequest$a */
    public static final class C50665a extends Message.Builder<GetParticipantsByIdsRequest, C50665a> {

        /* renamed from: a */
        public List<String> f126395a = Internal.newMutableList();

        /* renamed from: a */
        public GetParticipantsByIdsRequest build() {
            return new GetParticipantsByIdsRequest(this.f126395a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50665a mo175307a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f126395a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50665a newBuilder() {
        C50665a aVar = new C50665a();
        aVar.f126395a = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetParticipantsByIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetParticipantsByIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetParticipantsByIdsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetParticipantsByIdsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
