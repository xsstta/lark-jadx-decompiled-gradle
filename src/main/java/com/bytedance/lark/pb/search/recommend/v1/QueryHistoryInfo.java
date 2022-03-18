package com.bytedance.lark.pb.search.recommend.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.sections.v1.Action;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class QueryHistoryInfo extends Message<QueryHistoryInfo, C18767a> {
    public static final ProtoAdapter<QueryHistoryInfo> ADAPTER = new C18768b();
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String digest;
    public final String query;

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.QueryHistoryInfo$b */
    private static final class C18768b extends ProtoAdapter<QueryHistoryInfo> {
        C18768b() {
            super(FieldEncoding.LENGTH_DELIMITED, QueryHistoryInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(QueryHistoryInfo queryHistoryInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, queryHistoryInfo.digest) + ProtoAdapter.STRING.encodedSizeWithTag(2, queryHistoryInfo.query) + Action.ADAPTER.encodedSizeWithTag(3, queryHistoryInfo.action) + queryHistoryInfo.unknownFields().size();
        }

        /* renamed from: a */
        public QueryHistoryInfo decode(ProtoReader protoReader) throws IOException {
            C18767a aVar = new C18767a();
            aVar.f46321a = "";
            aVar.f46322b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46321a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46322b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46323c = Action.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QueryHistoryInfo queryHistoryInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, queryHistoryInfo.digest);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, queryHistoryInfo.query);
            Action.ADAPTER.encodeWithTag(protoWriter, 3, queryHistoryInfo.action);
            protoWriter.writeBytes(queryHistoryInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18767a newBuilder() {
        C18767a aVar = new C18767a();
        aVar.f46321a = this.digest;
        aVar.f46322b = this.query;
        aVar.f46323c = this.action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.QueryHistoryInfo$a */
    public static final class C18767a extends Message.Builder<QueryHistoryInfo, C18767a> {

        /* renamed from: a */
        public String f46321a;

        /* renamed from: b */
        public String f46322b;

        /* renamed from: c */
        public Action f46323c;

        /* renamed from: a */
        public QueryHistoryInfo build() {
            String str;
            Action action;
            String str2 = this.f46321a;
            if (str2 != null && (str = this.f46322b) != null && (action = this.f46323c) != null) {
                return new QueryHistoryInfo(str2, str, action, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "digest", this.f46322b, SearchIntents.EXTRA_QUERY, this.f46323c, "action");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "QueryHistoryInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", digest=");
        sb.append(this.digest);
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", action=");
        sb.append(this.action);
        StringBuilder replace = sb.replace(0, 2, "QueryHistoryInfo{");
        replace.append('}');
        return replace.toString();
    }

    public QueryHistoryInfo(String str, String str2, Action action2) {
        this(str, str2, action2, ByteString.EMPTY);
    }

    public QueryHistoryInfo(String str, String str2, Action action2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.digest = str;
        this.query = str2;
        this.action = action2;
    }
}
