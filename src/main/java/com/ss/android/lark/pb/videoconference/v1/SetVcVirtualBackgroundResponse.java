package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SetVcVirtualBackgroundResponse extends Message<SetVcVirtualBackgroundResponse, C51028a> {
    public static final ProtoAdapter<SetVcVirtualBackgroundResponse> ADAPTER = new C51029b();
    private static final long serialVersionUID = 0;
    public final List<GetVcVirtualBackgroundResponse.VirtualBackgroundInfo> infos;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundResponse$b */
    private static final class C51029b extends ProtoAdapter<SetVcVirtualBackgroundResponse> {
        C51029b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetVcVirtualBackgroundResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetVcVirtualBackgroundResponse setVcVirtualBackgroundResponse) {
            return GetVcVirtualBackgroundResponse.VirtualBackgroundInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, setVcVirtualBackgroundResponse.infos) + setVcVirtualBackgroundResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetVcVirtualBackgroundResponse decode(ProtoReader protoReader) throws IOException {
            C51028a aVar = new C51028a();
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
                    aVar.f127087a.add(GetVcVirtualBackgroundResponse.VirtualBackgroundInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetVcVirtualBackgroundResponse setVcVirtualBackgroundResponse) throws IOException {
            GetVcVirtualBackgroundResponse.VirtualBackgroundInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, setVcVirtualBackgroundResponse.infos);
            protoWriter.writeBytes(setVcVirtualBackgroundResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundResponse$a */
    public static final class C51028a extends Message.Builder<SetVcVirtualBackgroundResponse, C51028a> {

        /* renamed from: a */
        public List<GetVcVirtualBackgroundResponse.VirtualBackgroundInfo> f127087a = Internal.newMutableList();

        /* renamed from: a */
        public SetVcVirtualBackgroundResponse build() {
            return new SetVcVirtualBackgroundResponse(this.f127087a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51028a newBuilder() {
        C51028a aVar = new C51028a();
        aVar.f127087a = Internal.copyOf("infos", this.infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SetVcVirtualBackgroundResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.infos.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        StringBuilder replace = sb.replace(0, 2, "SetVcVirtualBackgroundResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetVcVirtualBackgroundResponse(List<GetVcVirtualBackgroundResponse.VirtualBackgroundInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public SetVcVirtualBackgroundResponse(List<GetVcVirtualBackgroundResponse.VirtualBackgroundInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.infos = Internal.immutableCopyOf("infos", list);
    }
}
