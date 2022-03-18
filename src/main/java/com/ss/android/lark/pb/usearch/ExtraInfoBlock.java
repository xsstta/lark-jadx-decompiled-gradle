package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ExtraInfoBlock extends Message<ExtraInfoBlock, C50202a> {
    public static final ProtoAdapter<ExtraInfoBlock> ADAPTER = new C50203b();
    private static final long serialVersionUID = 0;
    public final List<ExtraInfoBlockSegment> mblock_segments;
    public final String msegment_separator;

    /* renamed from: com.ss.android.lark.pb.usearch.ExtraInfoBlock$b */
    private static final class C50203b extends ProtoAdapter<ExtraInfoBlock> {
        C50203b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraInfoBlock.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtraInfoBlock extraInfoBlock) {
            int i;
            int encodedSizeWithTag = ExtraInfoBlockSegment.ADAPTER.asRepeated().encodedSizeWithTag(1, extraInfoBlock.mblock_segments);
            if (extraInfoBlock.msegment_separator != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, extraInfoBlock.msegment_separator);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + extraInfoBlock.unknownFields().size();
        }

        /* renamed from: a */
        public ExtraInfoBlock decode(ProtoReader protoReader) throws IOException {
            C50202a aVar = new C50202a();
            aVar.f125435b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125434a.add(ExtraInfoBlockSegment.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125435b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtraInfoBlock extraInfoBlock) throws IOException {
            ExtraInfoBlockSegment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, extraInfoBlock.mblock_segments);
            if (extraInfoBlock.msegment_separator != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extraInfoBlock.msegment_separator);
            }
            protoWriter.writeBytes(extraInfoBlock.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ExtraInfoBlock$a */
    public static final class C50202a extends Message.Builder<ExtraInfoBlock, C50202a> {

        /* renamed from: a */
        public List<ExtraInfoBlockSegment> f125434a = Internal.newMutableList();

        /* renamed from: b */
        public String f125435b;

        /* renamed from: a */
        public ExtraInfoBlock build() {
            return new ExtraInfoBlock(this.f125434a, this.f125435b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50202a newBuilder() {
        C50202a aVar = new C50202a();
        aVar.f125434a = Internal.copyOf("mblock_segments", this.mblock_segments);
        aVar.f125435b = this.msegment_separator;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mblock_segments.isEmpty()) {
            sb.append(", block_segments=");
            sb.append(this.mblock_segments);
        }
        if (this.msegment_separator != null) {
            sb.append(", segment_separator=");
            sb.append(this.msegment_separator);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtraInfoBlock{");
        replace.append('}');
        return replace.toString();
    }

    public ExtraInfoBlock(List<ExtraInfoBlockSegment> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public ExtraInfoBlock(List<ExtraInfoBlockSegment> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mblock_segments = Internal.immutableCopyOf("mblock_segments", list);
        this.msegment_separator = str;
    }
}
