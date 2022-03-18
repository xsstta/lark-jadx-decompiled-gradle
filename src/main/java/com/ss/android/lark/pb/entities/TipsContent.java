package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class TipsContent extends Message<TipsContent, C49736a> {
    public static final ProtoAdapter<TipsContent> ADAPTER = new C49737b();
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final List<ActionInfo> mactions;
    public final Map<String, String> mi18n_msg;
    public final Map<String, String> mi18n_title;
    public final Long mversion;

    /* renamed from: com.ss.android.lark.pb.entities.TipsContent$a */
    public static final class C49736a extends Message.Builder<TipsContent, C49736a> {

        /* renamed from: a */
        public Long f124566a;

        /* renamed from: b */
        public Map<String, String> f124567b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, String> f124568c = Internal.newMutableMap();

        /* renamed from: d */
        public List<ActionInfo> f124569d = Internal.newMutableList();

        /* renamed from: a */
        public TipsContent build() {
            return new TipsContent(this.f124566a, this.f124567b, this.f124568c, this.f124569d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.TipsContent$b */
    private static final class C49737b extends ProtoAdapter<TipsContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124570a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f124571b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49737b() {
            super(FieldEncoding.LENGTH_DELIMITED, TipsContent.class);
        }

        /* renamed from: a */
        public int encodedSize(TipsContent tipsContent) {
            int i;
            if (tipsContent.mversion != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, tipsContent.mversion);
            } else {
                i = 0;
            }
            return i + this.f124570a.encodedSizeWithTag(2, tipsContent.mi18n_title) + this.f124571b.encodedSizeWithTag(3, tipsContent.mi18n_msg) + ActionInfo.ADAPTER.asRepeated().encodedSizeWithTag(4, tipsContent.mactions) + tipsContent.unknownFields().size();
        }

        /* renamed from: a */
        public TipsContent decode(ProtoReader protoReader) throws IOException {
            C49736a aVar = new C49736a();
            aVar.f124566a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124566a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124567b.putAll(this.f124570a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f124568c.putAll(this.f124571b.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124569d.add(ActionInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TipsContent tipsContent) throws IOException {
            if (tipsContent.mversion != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, tipsContent.mversion);
            }
            this.f124570a.encodeWithTag(protoWriter, 2, tipsContent.mi18n_title);
            this.f124571b.encodeWithTag(protoWriter, 3, tipsContent.mi18n_msg);
            ActionInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, tipsContent.mactions);
            protoWriter.writeBytes(tipsContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49736a newBuilder() {
        C49736a aVar = new C49736a();
        aVar.f124566a = this.mversion;
        aVar.f124567b = Internal.copyOf("mi18n_title", this.mi18n_title);
        aVar.f124568c = Internal.copyOf("mi18n_msg", this.mi18n_msg);
        aVar.f124569d = Internal.copyOf("mactions", this.mactions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mversion != null) {
            sb.append(", version=");
            sb.append(this.mversion);
        }
        if (!this.mi18n_title.isEmpty()) {
            sb.append(", i18n_title=");
            sb.append(this.mi18n_title);
        }
        if (!this.mi18n_msg.isEmpty()) {
            sb.append(", i18n_msg=");
            sb.append(this.mi18n_msg);
        }
        if (!this.mactions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.mactions);
        }
        StringBuilder replace = sb.replace(0, 2, "TipsContent{");
        replace.append('}');
        return replace.toString();
    }

    public TipsContent(Long l, Map<String, String> map, Map<String, String> map2, List<ActionInfo> list) {
        this(l, map, map2, list, ByteString.EMPTY);
    }

    public TipsContent(Long l, Map<String, String> map, Map<String, String> map2, List<ActionInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mversion = l;
        this.mi18n_title = Internal.immutableCopyOf("mi18n_title", map);
        this.mi18n_msg = Internal.immutableCopyOf("mi18n_msg", map2);
        this.mactions = Internal.immutableCopyOf("mactions", list);
    }
}
