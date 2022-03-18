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

public final class FetchAllSketchDataRequest extends Message<FetchAllSketchDataRequest, C50553a> {
    public static final ProtoAdapter<FetchAllSketchDataRequest> ADAPTER = new C50554b();
    private static final long serialVersionUID = 0;
    public final String share_screen_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FetchAllSketchDataRequest$b */
    private static final class C50554b extends ProtoAdapter<FetchAllSketchDataRequest> {
        C50554b() {
            super(FieldEncoding.LENGTH_DELIMITED, FetchAllSketchDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FetchAllSketchDataRequest fetchAllSketchDataRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fetchAllSketchDataRequest.share_screen_id) + fetchAllSketchDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FetchAllSketchDataRequest decode(ProtoReader protoReader) throws IOException {
            C50553a aVar = new C50553a();
            aVar.f126195a = "";
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
                    aVar.f126195a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FetchAllSketchDataRequest fetchAllSketchDataRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fetchAllSketchDataRequest.share_screen_id);
            protoWriter.writeBytes(fetchAllSketchDataRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FetchAllSketchDataRequest$a */
    public static final class C50553a extends Message.Builder<FetchAllSketchDataRequest, C50553a> {

        /* renamed from: a */
        public String f126195a;

        /* renamed from: a */
        public FetchAllSketchDataRequest build() {
            String str = this.f126195a;
            if (str != null) {
                return new FetchAllSketchDataRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "share_screen_id");
        }

        /* renamed from: a */
        public C50553a mo175054a(String str) {
            this.f126195a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50553a newBuilder() {
        C50553a aVar = new C50553a();
        aVar.f126195a = this.share_screen_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FetchAllSketchDataRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", share_screen_id=");
        sb.append(this.share_screen_id);
        StringBuilder replace = sb.replace(0, 2, "FetchAllSketchDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FetchAllSketchDataRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public FetchAllSketchDataRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_screen_id = str;
    }
}
