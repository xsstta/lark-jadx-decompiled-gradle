package com.ss.android.lark.pb.ad;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullSplashADResponse extends Message<PullSplashADResponse, C49413a> {
    public static final ProtoAdapter<PullSplashADResponse> ADAPTER = new C49414b();
    public static final ByteString DEFAULT_SPLASH = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString msplash;

    /* renamed from: com.ss.android.lark.pb.ad.PullSplashADResponse$b */
    private static final class C49414b extends ProtoAdapter<PullSplashADResponse> {
        C49414b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullSplashADResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullSplashADResponse pullSplashADResponse) {
            int i;
            if (pullSplashADResponse.msplash != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, pullSplashADResponse.msplash);
            } else {
                i = 0;
            }
            return i + pullSplashADResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullSplashADResponse decode(ProtoReader protoReader) throws IOException {
            C49413a aVar = new C49413a();
            aVar.f123942a = ByteString.EMPTY;
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
                    aVar.f123942a = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullSplashADResponse pullSplashADResponse) throws IOException {
            if (pullSplashADResponse.msplash != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, pullSplashADResponse.msplash);
            }
            protoWriter.writeBytes(pullSplashADResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ad.PullSplashADResponse$a */
    public static final class C49413a extends Message.Builder<PullSplashADResponse, C49413a> {

        /* renamed from: a */
        public ByteString f123942a;

        /* renamed from: a */
        public PullSplashADResponse build() {
            return new PullSplashADResponse(this.f123942a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49413a newBuilder() {
        C49413a aVar = new C49413a();
        aVar.f123942a = this.msplash;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msplash != null) {
            sb.append(", splash=");
            sb.append(this.msplash);
        }
        StringBuilder replace = sb.replace(0, 2, "PullSplashADResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullSplashADResponse(ByteString byteString) {
        this(byteString, ByteString.EMPTY);
    }

    public PullSplashADResponse(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.msplash = byteString;
    }
}
