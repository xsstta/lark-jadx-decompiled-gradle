package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class SearchResponseExtras extends Message<SearchResponseExtras, C19021a> {
    public static final ProtoAdapter<SearchResponseExtras> ADAPTER = new C19022b();
    private static final long serialVersionUID = 0;
    public final ResultSummary result_summary;

    public static final class ResultSummary extends Message<ResultSummary, C19019a> {
        public static final ProtoAdapter<ResultSummary> ADAPTER = new C19020b();
        public static final Boolean DEFAULT_HAVE_ERR = false;
        public static final Integer DEFAULT_RECALL_NUMS = 0;
        public static final SearchEntityType DEFAULT_TYPE = SearchEntityType.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String err_msg;
        public final Boolean have_err;
        public final Integer recall_nums;
        public final SearchEntityType type;

        /* renamed from: com.bytedance.lark.pb.search.v2.SearchResponseExtras$ResultSummary$b */
        private static final class C19020b extends ProtoAdapter<ResultSummary> {
            C19020b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResultSummary.class);
            }

            /* renamed from: a */
            public int encodedSize(ResultSummary resultSummary) {
                int i;
                int encodedSizeWithTag = SearchEntityType.ADAPTER.encodedSizeWithTag(1, resultSummary.type);
                int i2 = 0;
                if (resultSummary.recall_nums != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, resultSummary.recall_nums);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.BOOL.encodedSizeWithTag(3, resultSummary.have_err);
                if (resultSummary.err_msg != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, resultSummary.err_msg);
                }
                return encodedSizeWithTag2 + i2 + resultSummary.unknownFields().size();
            }

            /* renamed from: a */
            public ResultSummary decode(ProtoReader protoReader) throws IOException {
                C19019a aVar = new C19019a();
                aVar.f47038a = SearchEntityType.UNKNOWN;
                aVar.f47039b = 0;
                aVar.f47040c = false;
                aVar.f47041d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f47038a = SearchEntityType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f47039b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f47040c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47041d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResultSummary resultSummary) throws IOException {
                SearchEntityType.ADAPTER.encodeWithTag(protoWriter, 1, resultSummary.type);
                if (resultSummary.recall_nums != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, resultSummary.recall_nums);
                }
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, resultSummary.have_err);
                if (resultSummary.err_msg != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, resultSummary.err_msg);
                }
                protoWriter.writeBytes(resultSummary.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19019a newBuilder() {
            C19019a aVar = new C19019a();
            aVar.f47038a = this.type;
            aVar.f47039b = this.recall_nums;
            aVar.f47040c = this.have_err;
            aVar.f47041d = this.err_msg;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.SearchResponseExtras$ResultSummary$a */
        public static final class C19019a extends Message.Builder<ResultSummary, C19019a> {

            /* renamed from: a */
            public SearchEntityType f47038a;

            /* renamed from: b */
            public Integer f47039b;

            /* renamed from: c */
            public Boolean f47040c;

            /* renamed from: d */
            public String f47041d;

            /* renamed from: a */
            public ResultSummary build() {
                Boolean bool;
                SearchEntityType searchEntityType = this.f47038a;
                if (searchEntityType != null && (bool = this.f47040c) != null) {
                    return new ResultSummary(searchEntityType, this.f47039b, bool, this.f47041d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(searchEntityType, ShareHitPoint.f121869d, this.f47040c, "have_err");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ResultSummary");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.recall_nums != null) {
                sb.append(", recall_nums=");
                sb.append(this.recall_nums);
            }
            sb.append(", have_err=");
            sb.append(this.have_err);
            if (this.err_msg != null) {
                sb.append(", err_msg=");
                sb.append(this.err_msg);
            }
            StringBuilder replace = sb.replace(0, 2, "ResultSummary{");
            replace.append('}');
            return replace.toString();
        }

        public ResultSummary(SearchEntityType searchEntityType, Integer num, Boolean bool, String str) {
            this(searchEntityType, num, bool, str, ByteString.EMPTY);
        }

        public ResultSummary(SearchEntityType searchEntityType, Integer num, Boolean bool, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = searchEntityType;
            this.recall_nums = num;
            this.have_err = bool;
            this.err_msg = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchResponseExtras$b */
    private static final class C19022b extends ProtoAdapter<SearchResponseExtras> {
        C19022b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchResponseExtras.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchResponseExtras searchResponseExtras) {
            int i;
            if (searchResponseExtras.result_summary != null) {
                i = ResultSummary.ADAPTER.encodedSizeWithTag(1, searchResponseExtras.result_summary);
            } else {
                i = 0;
            }
            return i + searchResponseExtras.unknownFields().size();
        }

        /* renamed from: a */
        public SearchResponseExtras decode(ProtoReader protoReader) throws IOException {
            C19021a aVar = new C19021a();
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
                    aVar.f47042a = ResultSummary.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchResponseExtras searchResponseExtras) throws IOException {
            if (searchResponseExtras.result_summary != null) {
                ResultSummary.ADAPTER.encodeWithTag(protoWriter, 1, searchResponseExtras.result_summary);
            }
            protoWriter.writeBytes(searchResponseExtras.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchResponseExtras$a */
    public static final class C19021a extends Message.Builder<SearchResponseExtras, C19021a> {

        /* renamed from: a */
        public ResultSummary f47042a;

        /* renamed from: a */
        public SearchResponseExtras build() {
            return new SearchResponseExtras(this.f47042a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19021a newBuilder() {
        C19021a aVar = new C19021a();
        aVar.f47042a = this.result_summary;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchResponseExtras");
        StringBuilder sb = new StringBuilder();
        if (this.result_summary != null) {
            sb.append(", result_summary=");
            sb.append(this.result_summary);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchResponseExtras{");
        replace.append('}');
        return replace.toString();
    }

    public SearchResponseExtras(ResultSummary resultSummary) {
        this(resultSummary, ByteString.EMPTY);
    }

    public SearchResponseExtras(ResultSummary resultSummary, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result_summary = resultSummary;
    }
}
