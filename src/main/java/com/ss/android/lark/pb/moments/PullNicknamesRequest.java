package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullNicknamesRequest extends Message<PullNicknamesRequest, C49938a> {
    public static final ProtoAdapter<PullNicknamesRequest> ADAPTER = new C49939b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer mcount;

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknamesRequest$b */
    private static final class C49939b extends ProtoAdapter<PullNicknamesRequest> {
        C49939b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullNicknamesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullNicknamesRequest pullNicknamesRequest) {
            int i;
            if (pullNicknamesRequest.mcount != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, pullNicknamesRequest.mcount);
            } else {
                i = 0;
            }
            return i + pullNicknamesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullNicknamesRequest decode(ProtoReader protoReader) throws IOException {
            C49938a aVar = new C49938a();
            aVar.f124947a = 0;
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
                    aVar.f124947a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullNicknamesRequest pullNicknamesRequest) throws IOException {
            if (pullNicknamesRequest.mcount != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, pullNicknamesRequest.mcount);
            }
            protoWriter.writeBytes(pullNicknamesRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknamesRequest$a */
    public static final class C49938a extends Message.Builder<PullNicknamesRequest, C49938a> {

        /* renamed from: a */
        public Integer f124947a;

        /* renamed from: a */
        public PullNicknamesRequest build() {
            return new PullNicknamesRequest(this.f124947a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49938a mo173653a(Integer num) {
            this.f124947a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49938a newBuilder() {
        C49938a aVar = new C49938a();
        aVar.f124947a = this.mcount;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcount != null) {
            sb.append(", count=");
            sb.append(this.mcount);
        }
        StringBuilder replace = sb.replace(0, 2, "PullNicknamesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullNicknamesRequest(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public PullNicknamesRequest(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcount = num;
    }
}
