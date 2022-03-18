package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SyncSubtitlesRequest extends Message<SyncSubtitlesRequest, C51108a> {
    public static final ProtoAdapter<SyncSubtitlesRequest> ADAPTER = new C51109b();
    public static final Boolean DEFAULT_FORCE_SYNC = false;
    private static final long serialVersionUID = 0;
    public final Boolean force_sync;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncSubtitlesRequest$b */
    private static final class C51109b extends ProtoAdapter<SyncSubtitlesRequest> {
        C51109b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncSubtitlesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncSubtitlesRequest syncSubtitlesRequest) {
            int i;
            int i2 = 0;
            if (syncSubtitlesRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, syncSubtitlesRequest.meeting_id);
            } else {
                i = 0;
            }
            if (syncSubtitlesRequest.force_sync != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, syncSubtitlesRequest.force_sync);
            }
            return i + i2 + syncSubtitlesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SyncSubtitlesRequest decode(ProtoReader protoReader) throws IOException {
            C51108a aVar = new C51108a();
            aVar.f127224a = "";
            aVar.f127225b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127224a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127225b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncSubtitlesRequest syncSubtitlesRequest) throws IOException {
            if (syncSubtitlesRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncSubtitlesRequest.meeting_id);
            }
            if (syncSubtitlesRequest.force_sync != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, syncSubtitlesRequest.force_sync);
            }
            protoWriter.writeBytes(syncSubtitlesRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncSubtitlesRequest$a */
    public static final class C51108a extends Message.Builder<SyncSubtitlesRequest, C51108a> {

        /* renamed from: a */
        public String f127224a;

        /* renamed from: b */
        public Boolean f127225b;

        /* renamed from: a */
        public SyncSubtitlesRequest build() {
            return new SyncSubtitlesRequest(this.f127224a, this.f127225b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51108a mo176373a(Boolean bool) {
            this.f127225b = bool;
            return this;
        }

        /* renamed from: a */
        public C51108a mo176374a(String str) {
            this.f127224a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51108a newBuilder() {
        C51108a aVar = new C51108a();
        aVar.f127224a = this.meeting_id;
        aVar.f127225b = this.force_sync;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SyncSubtitlesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.force_sync != null) {
            sb.append(", force_sync=");
            sb.append(this.force_sync);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncSubtitlesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SyncSubtitlesRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public SyncSubtitlesRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.force_sync = bool;
    }
}
