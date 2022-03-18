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

public final class EntrustServerTrackRequest extends Message<EntrustServerTrackRequest, C50537a> {
    public static final ProtoAdapter<EntrustServerTrackRequest> ADAPTER = new C50538b();
    private static final long serialVersionUID = 0;
    public final String json_params;
    public final String key;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.EntrustServerTrackRequest$b */
    private static final class C50538b extends ProtoAdapter<EntrustServerTrackRequest> {
        C50538b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntrustServerTrackRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(EntrustServerTrackRequest entrustServerTrackRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entrustServerTrackRequest.key);
            if (entrustServerTrackRequest.json_params != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, entrustServerTrackRequest.json_params);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + entrustServerTrackRequest.unknownFields().size();
        }

        /* renamed from: a */
        public EntrustServerTrackRequest decode(ProtoReader protoReader) throws IOException {
            C50537a aVar = new C50537a();
            aVar.f126168a = "";
            aVar.f126169b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126168a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126169b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntrustServerTrackRequest entrustServerTrackRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entrustServerTrackRequest.key);
            if (entrustServerTrackRequest.json_params != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, entrustServerTrackRequest.json_params);
            }
            protoWriter.writeBytes(entrustServerTrackRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.EntrustServerTrackRequest$a */
    public static final class C50537a extends Message.Builder<EntrustServerTrackRequest, C50537a> {

        /* renamed from: a */
        public String f126168a;

        /* renamed from: b */
        public String f126169b;

        /* renamed from: a */
        public EntrustServerTrackRequest build() {
            String str = this.f126168a;
            if (str != null) {
                return new EntrustServerTrackRequest(str, this.f126169b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C50537a mo175020a(String str) {
            this.f126168a = str;
            return this;
        }

        /* renamed from: b */
        public C50537a mo175022b(String str) {
            this.f126169b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50537a newBuilder() {
        C50537a aVar = new C50537a();
        aVar.f126168a = this.key;
        aVar.f126169b = this.json_params;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "EntrustServerTrackRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (this.json_params != null) {
            sb.append(", json_params=");
            sb.append(this.json_params);
        }
        StringBuilder replace = sb.replace(0, 2, "EntrustServerTrackRequest{");
        replace.append('}');
        return replace.toString();
    }

    public EntrustServerTrackRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public EntrustServerTrackRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.json_params = str2;
    }
}
