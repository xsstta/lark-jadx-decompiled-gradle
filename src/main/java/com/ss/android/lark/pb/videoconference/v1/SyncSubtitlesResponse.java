package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SyncSubtitlesResponse extends Message<SyncSubtitlesResponse, C51110a> {
    public static final ProtoAdapter<SyncSubtitlesResponse> ADAPTER = new C51111b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncSubtitlesResponse$b */
    private static final class C51111b extends ProtoAdapter<SyncSubtitlesResponse> {
        C51111b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncSubtitlesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncSubtitlesResponse syncSubtitlesResponse) {
            int i;
            if (syncSubtitlesResponse.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, syncSubtitlesResponse.meeting_id);
            } else {
                i = 0;
            }
            return i + syncSubtitlesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SyncSubtitlesResponse decode(ProtoReader protoReader) throws IOException {
            C51110a aVar = new C51110a();
            aVar.f127226a = "";
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
                    aVar.f127226a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncSubtitlesResponse syncSubtitlesResponse) throws IOException {
            if (syncSubtitlesResponse.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncSubtitlesResponse.meeting_id);
            }
            protoWriter.writeBytes(syncSubtitlesResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncSubtitlesResponse$a */
    public static final class C51110a extends Message.Builder<SyncSubtitlesResponse, C51110a> {

        /* renamed from: a */
        public String f127226a;

        /* renamed from: a */
        public SyncSubtitlesResponse build() {
            return new SyncSubtitlesResponse(this.f127226a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51110a newBuilder() {
        C51110a aVar = new C51110a();
        aVar.f127226a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SyncSubtitlesResponse");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncSubtitlesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SyncSubtitlesResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public SyncSubtitlesResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
