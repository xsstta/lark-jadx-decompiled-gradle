package com.ss.android.lark.pb.improto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PipeEntity extends Message<PipeEntity, C49813a> {
    public static final ProtoAdapter<PipeEntity> ADAPTER = new C49814b();
    public static final Long DEFAULT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long mid;
    public final String mtype;

    /* renamed from: com.ss.android.lark.pb.improto.PipeEntity$b */
    private static final class C49814b extends ProtoAdapter<PipeEntity> {
        C49814b() {
            super(FieldEncoding.LENGTH_DELIMITED, PipeEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(PipeEntity pipeEntity) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pipeEntity.mtype);
            if (pipeEntity.mid != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, pipeEntity.mid);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pipeEntity.unknownFields().size();
        }

        /* renamed from: a */
        public PipeEntity decode(ProtoReader protoReader) throws IOException {
            C49813a aVar = new C49813a();
            aVar.f124753a = "";
            aVar.f124754b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124753a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124754b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PipeEntity pipeEntity) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pipeEntity.mtype);
            if (pipeEntity.mid != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pipeEntity.mid);
            }
            protoWriter.writeBytes(pipeEntity.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.improto.PipeEntity$a */
    public static final class C49813a extends Message.Builder<PipeEntity, C49813a> {

        /* renamed from: a */
        public String f124753a;

        /* renamed from: b */
        public Long f124754b;

        /* renamed from: a */
        public PipeEntity build() {
            String str = this.f124753a;
            if (str != null) {
                return new PipeEntity(str, this.f124754b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public C49813a newBuilder() {
        C49813a aVar = new C49813a();
        aVar.f124753a = this.mtype;
        aVar.f124754b = this.mid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.mtype);
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        StringBuilder replace = sb.replace(0, 2, "PipeEntity{");
        replace.append('}');
        return replace.toString();
    }

    public PipeEntity(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public PipeEntity(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = str;
        this.mid = l;
    }
}
