package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVersionNoteResponse extends Message<GetVersionNoteResponse, C14991a> {
    public static final ProtoAdapter<GetVersionNoteResponse> ADAPTER = new C14992b();
    private static final long serialVersionUID = 0;
    public final VersionData data;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetVersionNoteResponse$b */
    private static final class C14992b extends ProtoAdapter<GetVersionNoteResponse> {
        C14992b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVersionNoteResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVersionNoteResponse getVersionNoteResponse) {
            int i;
            if (getVersionNoteResponse.data != null) {
                i = VersionData.ADAPTER.encodedSizeWithTag(1, getVersionNoteResponse.data);
            } else {
                i = 0;
            }
            return i + getVersionNoteResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVersionNoteResponse decode(ProtoReader protoReader) throws IOException {
            C14991a aVar = new C14991a();
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
                    aVar.f39658a = VersionData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVersionNoteResponse getVersionNoteResponse) throws IOException {
            if (getVersionNoteResponse.data != null) {
                VersionData.ADAPTER.encodeWithTag(protoWriter, 1, getVersionNoteResponse.data);
            }
            protoWriter.writeBytes(getVersionNoteResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetVersionNoteResponse$a */
    public static final class C14991a extends Message.Builder<GetVersionNoteResponse, C14991a> {

        /* renamed from: a */
        public VersionData f39658a;

        /* renamed from: a */
        public GetVersionNoteResponse build() {
            return new GetVersionNoteResponse(this.f39658a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14991a newBuilder() {
        C14991a aVar = new C14991a();
        aVar.f39658a = this.data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetVersionNoteResponse");
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVersionNoteResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVersionNoteResponse(VersionData versionData) {
        this(versionData, ByteString.EMPTY);
    }

    public GetVersionNoteResponse(VersionData versionData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = versionData;
    }
}
