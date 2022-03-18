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

public final class SketchStartRequest extends Message<SketchStartRequest, C51084a> {
    public static final ProtoAdapter<SketchStartRequest> ADAPTER = new C51085b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final String share_screen_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchStartRequest$b */
    private static final class C51085b extends ProtoAdapter<SketchStartRequest> {
        C51085b() {
            super(FieldEncoding.LENGTH_DELIMITED, SketchStartRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SketchStartRequest sketchStartRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sketchStartRequest.meeting_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, sketchStartRequest.share_screen_id) + sketchStartRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SketchStartRequest decode(ProtoReader protoReader) throws IOException {
            C51084a aVar = new C51084a();
            aVar.f127207a = "";
            aVar.f127208b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127207a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127208b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SketchStartRequest sketchStartRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sketchStartRequest.meeting_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sketchStartRequest.share_screen_id);
            protoWriter.writeBytes(sketchStartRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51084a newBuilder() {
        C51084a aVar = new C51084a();
        aVar.f127207a = this.meeting_id;
        aVar.f127208b = this.share_screen_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchStartRequest$a */
    public static final class C51084a extends Message.Builder<SketchStartRequest, C51084a> {

        /* renamed from: a */
        public String f127207a;

        /* renamed from: b */
        public String f127208b;

        /* renamed from: a */
        public SketchStartRequest build() {
            String str;
            String str2 = this.f127207a;
            if (str2 != null && (str = this.f127208b) != null) {
                return new SketchStartRequest(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "meeting_id", this.f127208b, "share_screen_id");
        }

        /* renamed from: a */
        public C51084a mo176312a(String str) {
            this.f127207a = str;
            return this;
        }

        /* renamed from: b */
        public C51084a mo176314b(String str) {
            this.f127208b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SketchStartRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", share_screen_id=");
        sb.append(this.share_screen_id);
        StringBuilder replace = sb.replace(0, 2, "SketchStartRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SketchStartRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SketchStartRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.share_screen_id = str2;
    }
}
