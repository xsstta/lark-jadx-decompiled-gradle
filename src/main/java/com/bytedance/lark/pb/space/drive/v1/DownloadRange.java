package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DownloadRange extends Message<DownloadRange, C19345a> {
    public static final ProtoAdapter<DownloadRange> ADAPTER = new C19346b();
    public static final Long DEFAULT_END = 0L;
    public static final Long DEFAULT_START = 0L;
    private static final long serialVersionUID = 0;
    public final Long end;
    public final Long start;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRange$b */
    private static final class C19346b extends ProtoAdapter<DownloadRange> {
        C19346b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadRange.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadRange downloadRange) {
            return ProtoAdapter.UINT64.encodedSizeWithTag(1, downloadRange.start) + ProtoAdapter.UINT64.encodedSizeWithTag(2, downloadRange.end) + downloadRange.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadRange decode(ProtoReader protoReader) throws IOException {
            C19345a aVar = new C19345a();
            aVar.f47547a = 0L;
            aVar.f47548b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47547a = ProtoAdapter.UINT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47548b = ProtoAdapter.UINT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DownloadRange downloadRange) throws IOException {
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, downloadRange.start);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, downloadRange.end);
            protoWriter.writeBytes(downloadRange.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19345a newBuilder() {
        C19345a aVar = new C19345a();
        aVar.f47547a = this.start;
        aVar.f47548b = this.end;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRange$a */
    public static final class C19345a extends Message.Builder<DownloadRange, C19345a> {

        /* renamed from: a */
        public Long f47547a;

        /* renamed from: b */
        public Long f47548b;

        /* renamed from: a */
        public DownloadRange build() {
            Long l;
            Long l2 = this.f47547a;
            if (l2 != null && (l = this.f47548b) != null) {
                return new DownloadRange(l2, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "start", this.f47548b, "end");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadRange");
        StringBuilder sb = new StringBuilder();
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        StringBuilder replace = sb.replace(0, 2, "DownloadRange{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadRange(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public DownloadRange(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start = l;
        this.end = l2;
    }
}
