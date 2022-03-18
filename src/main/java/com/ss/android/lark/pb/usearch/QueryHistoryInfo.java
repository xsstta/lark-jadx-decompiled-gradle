package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.section.Action;
import java.io.IOException;
import okio.ByteString;

public final class QueryHistoryInfo extends Message<QueryHistoryInfo, C50232a> {
    public static final ProtoAdapter<QueryHistoryInfo> ADAPTER = new C50233b();
    private static final long serialVersionUID = 0;
    public final Action maction;
    public final String mdigest;
    public final String mquery;

    /* renamed from: com.ss.android.lark.pb.usearch.QueryHistoryInfo$b */
    private static final class C50233b extends ProtoAdapter<QueryHistoryInfo> {
        C50233b() {
            super(FieldEncoding.LENGTH_DELIMITED, QueryHistoryInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(QueryHistoryInfo queryHistoryInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, queryHistoryInfo.mdigest) + ProtoAdapter.STRING.encodedSizeWithTag(2, queryHistoryInfo.mquery) + Action.ADAPTER.encodedSizeWithTag(3, queryHistoryInfo.maction) + queryHistoryInfo.unknownFields().size();
        }

        /* renamed from: a */
        public QueryHistoryInfo decode(ProtoReader protoReader) throws IOException {
            C50232a aVar = new C50232a();
            aVar.f125507a = "";
            aVar.f125508b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125507a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125508b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125509c = Action.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QueryHistoryInfo queryHistoryInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, queryHistoryInfo.mdigest);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, queryHistoryInfo.mquery);
            Action.ADAPTER.encodeWithTag(protoWriter, 3, queryHistoryInfo.maction);
            protoWriter.writeBytes(queryHistoryInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50232a newBuilder() {
        C50232a aVar = new C50232a();
        aVar.f125507a = this.mdigest;
        aVar.f125508b = this.mquery;
        aVar.f125509c = this.maction;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.usearch.QueryHistoryInfo$a */
    public static final class C50232a extends Message.Builder<QueryHistoryInfo, C50232a> {

        /* renamed from: a */
        public String f125507a;

        /* renamed from: b */
        public String f125508b;

        /* renamed from: c */
        public Action f125509c;

        /* renamed from: a */
        public QueryHistoryInfo build() {
            String str;
            Action action;
            String str2 = this.f125507a;
            if (str2 != null && (str = this.f125508b) != null && (action = this.f125509c) != null) {
                return new QueryHistoryInfo(str2, str, action, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "mdigest", this.f125508b, "mquery", this.f125509c, "maction");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", digest=");
        sb.append(this.mdigest);
        sb.append(", query=");
        sb.append(this.mquery);
        sb.append(", action=");
        sb.append(this.maction);
        StringBuilder replace = sb.replace(0, 2, "QueryHistoryInfo{");
        replace.append('}');
        return replace.toString();
    }

    public QueryHistoryInfo(String str, String str2, Action action) {
        this(str, str2, action, ByteString.EMPTY);
    }

    public QueryHistoryInfo(String str, String str2, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdigest = str;
        this.mquery = str2;
        this.maction = action;
    }
}
