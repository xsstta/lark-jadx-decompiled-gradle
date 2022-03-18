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

public final class RecentListSubscItem extends Message<RecentListSubscItem, C19381a> {
    public static final ProtoAdapter<RecentListSubscItem> ADAPTER = new C19382b();
    public static final Long DEFAULT_FILE_TYPE = 0L;
    private static final long serialVersionUID = 0;
    public final Long file_type;
    public final String node_token;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.RecentListSubscItem$b */
    private static final class C19382b extends ProtoAdapter<RecentListSubscItem> {
        C19382b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecentListSubscItem.class);
        }

        /* renamed from: a */
        public int encodedSize(RecentListSubscItem recentListSubscItem) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, recentListSubscItem.node_token) + ProtoAdapter.INT64.encodedSizeWithTag(2, recentListSubscItem.file_type) + recentListSubscItem.unknownFields().size();
        }

        /* renamed from: a */
        public RecentListSubscItem decode(ProtoReader protoReader) throws IOException {
            C19381a aVar = new C19381a();
            aVar.f47678a = "";
            aVar.f47679b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47678a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47679b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecentListSubscItem recentListSubscItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recentListSubscItem.node_token);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, recentListSubscItem.file_type);
            protoWriter.writeBytes(recentListSubscItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19381a newBuilder() {
        C19381a aVar = new C19381a();
        aVar.f47678a = this.node_token;
        aVar.f47679b = this.file_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.RecentListSubscItem$a */
    public static final class C19381a extends Message.Builder<RecentListSubscItem, C19381a> {

        /* renamed from: a */
        public String f47678a;

        /* renamed from: b */
        public Long f47679b;

        /* renamed from: a */
        public RecentListSubscItem build() {
            Long l;
            String str = this.f47678a;
            if (str != null && (l = this.f47679b) != null) {
                return new RecentListSubscItem(str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "node_token", this.f47679b, "file_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "RecentListSubscItem");
        StringBuilder sb = new StringBuilder();
        sb.append(", node_token=");
        sb.append(this.node_token);
        sb.append(", file_type=");
        sb.append(this.file_type);
        StringBuilder replace = sb.replace(0, 2, "RecentListSubscItem{");
        replace.append('}');
        return replace.toString();
    }

    public RecentListSubscItem(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public RecentListSubscItem(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.node_token = str;
        this.file_type = l;
    }
}
