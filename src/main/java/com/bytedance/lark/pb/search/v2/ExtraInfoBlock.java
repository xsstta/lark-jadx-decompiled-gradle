package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ExtraInfoBlock extends Message<ExtraInfoBlock, C18985a> {
    public static final ProtoAdapter<ExtraInfoBlock> ADAPTER = new C18986b();
    private static final long serialVersionUID = 0;
    public final List<ExtraInfoBlockSegment> block_segments;
    public final String segment_separator;

    /* renamed from: com.bytedance.lark.pb.search.v2.ExtraInfoBlock$b */
    private static final class C18986b extends ProtoAdapter<ExtraInfoBlock> {
        C18986b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraInfoBlock.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtraInfoBlock extraInfoBlock) {
            int i;
            int encodedSizeWithTag = ExtraInfoBlockSegment.ADAPTER.asRepeated().encodedSizeWithTag(1, extraInfoBlock.block_segments);
            if (extraInfoBlock.segment_separator != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, extraInfoBlock.segment_separator);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + extraInfoBlock.unknownFields().size();
        }

        /* renamed from: a */
        public ExtraInfoBlock decode(ProtoReader protoReader) throws IOException {
            C18985a aVar = new C18985a();
            aVar.f46958b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46957a.add(ExtraInfoBlockSegment.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46958b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtraInfoBlock extraInfoBlock) throws IOException {
            ExtraInfoBlockSegment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, extraInfoBlock.block_segments);
            if (extraInfoBlock.segment_separator != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extraInfoBlock.segment_separator);
            }
            protoWriter.writeBytes(extraInfoBlock.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ExtraInfoBlock$a */
    public static final class C18985a extends Message.Builder<ExtraInfoBlock, C18985a> {

        /* renamed from: a */
        public List<ExtraInfoBlockSegment> f46957a = Internal.newMutableList();

        /* renamed from: b */
        public String f46958b;

        /* renamed from: a */
        public ExtraInfoBlock build() {
            return new ExtraInfoBlock(this.f46957a, this.f46958b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18985a newBuilder() {
        C18985a aVar = new C18985a();
        aVar.f46957a = Internal.copyOf("block_segments", this.block_segments);
        aVar.f46958b = this.segment_separator;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ExtraInfoBlock");
        StringBuilder sb = new StringBuilder();
        if (!this.block_segments.isEmpty()) {
            sb.append(", block_segments=");
            sb.append(this.block_segments);
        }
        if (this.segment_separator != null) {
            sb.append(", segment_separator=");
            sb.append(this.segment_separator);
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
        this.block_segments = Internal.immutableCopyOf("block_segments", list);
        this.segment_separator = str;
    }
}
