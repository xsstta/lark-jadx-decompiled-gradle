package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetStickerSetArchiveDownloadStateResponse extends Message<GetStickerSetArchiveDownloadStateResponse, C18264a> {
    public static final ProtoAdapter<GetStickerSetArchiveDownloadStateResponse> ADAPTER = new C18265b();
    private static final long serialVersionUID = 0;
    public final Map<String, State> states;

    public enum State implements WireEnum {
        UNKNOWN(0),
        DOWNLOADED(1),
        PART_DOWNLOADED(2),
        NOT_DOWNLOADED(3);
        
        public static final ProtoAdapter<State> ADAPTER = ProtoAdapter.newEnumAdapter(State.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static State fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DOWNLOADED;
            }
            if (i == 2) {
                return PART_DOWNLOADED;
            }
            if (i != 3) {
                return null;
            }
            return NOT_DOWNLOADED;
        }

        private State(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetStickerSetArchiveDownloadStateResponse$a */
    public static final class C18264a extends Message.Builder<GetStickerSetArchiveDownloadStateResponse, C18264a> {

        /* renamed from: a */
        public Map<String, State> f45512a = Internal.newMutableMap();

        /* renamed from: a */
        public GetStickerSetArchiveDownloadStateResponse build() {
            return new GetStickerSetArchiveDownloadStateResponse(this.f45512a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetStickerSetArchiveDownloadStateResponse$b */
    private static final class C18265b extends ProtoAdapter<GetStickerSetArchiveDownloadStateResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, State>> f45513a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, State.ADAPTER);

        C18265b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetArchiveDownloadStateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetArchiveDownloadStateResponse getStickerSetArchiveDownloadStateResponse) {
            return this.f45513a.encodedSizeWithTag(1, getStickerSetArchiveDownloadStateResponse.states) + getStickerSetArchiveDownloadStateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetArchiveDownloadStateResponse decode(ProtoReader protoReader) throws IOException {
            C18264a aVar = new C18264a();
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
                    aVar.f45512a.putAll(this.f45513a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetArchiveDownloadStateResponse getStickerSetArchiveDownloadStateResponse) throws IOException {
            this.f45513a.encodeWithTag(protoWriter, 1, getStickerSetArchiveDownloadStateResponse.states);
            protoWriter.writeBytes(getStickerSetArchiveDownloadStateResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18264a newBuilder() {
        C18264a aVar = new C18264a();
        aVar.f45512a = Internal.copyOf("states", this.states);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetStickerSetArchiveDownloadStateResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.states.isEmpty()) {
            sb.append(", states=");
            sb.append(this.states);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetArchiveDownloadStateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetArchiveDownloadStateResponse(Map<String, State> map) {
        this(map, ByteString.EMPTY);
    }

    public GetStickerSetArchiveDownloadStateResponse(Map<String, State> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.states = Internal.immutableCopyOf("states", map);
    }
}
