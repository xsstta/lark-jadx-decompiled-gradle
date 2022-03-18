package com.bytedance.lark.pb.search.feedback.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FeedbackParam extends Message<FeedbackParam, C18745a> {
    public static final ProtoAdapter<FeedbackParam> ADAPTER = new C18746b();
    private static final long serialVersionUID = 0;
    public final CorrectionParam correction;
    public final IntegrationSearchParam integration_search;
    public final NoQuerySearchParam no_query_search;

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackParam$b */
    private static final class C18746b extends ProtoAdapter<FeedbackParam> {
        C18746b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackParam.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackParam feedbackParam) {
            int i;
            int i2;
            int i3 = 0;
            if (feedbackParam.integration_search != null) {
                i = IntegrationSearchParam.ADAPTER.encodedSizeWithTag(1, feedbackParam.integration_search);
            } else {
                i = 0;
            }
            if (feedbackParam.no_query_search != null) {
                i2 = NoQuerySearchParam.ADAPTER.encodedSizeWithTag(2, feedbackParam.no_query_search);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (feedbackParam.correction != null) {
                i3 = CorrectionParam.ADAPTER.encodedSizeWithTag(3, feedbackParam.correction);
            }
            return i4 + i3 + feedbackParam.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackParam decode(ProtoReader protoReader) throws IOException {
            C18745a aVar = new C18745a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.mo64443a(IntegrationSearchParam.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.mo64444a(NoQuerySearchParam.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo64442a(CorrectionParam.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackParam feedbackParam) throws IOException {
            if (feedbackParam.integration_search != null) {
                IntegrationSearchParam.ADAPTER.encodeWithTag(protoWriter, 1, feedbackParam.integration_search);
            }
            if (feedbackParam.no_query_search != null) {
                NoQuerySearchParam.ADAPTER.encodeWithTag(protoWriter, 2, feedbackParam.no_query_search);
            }
            if (feedbackParam.correction != null) {
                CorrectionParam.ADAPTER.encodeWithTag(protoWriter, 3, feedbackParam.correction);
            }
            protoWriter.writeBytes(feedbackParam.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18745a newBuilder() {
        C18745a aVar = new C18745a();
        aVar.f46291a = this.integration_search;
        aVar.f46292b = this.no_query_search;
        aVar.f46293c = this.correction;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackParam$a */
    public static final class C18745a extends Message.Builder<FeedbackParam, C18745a> {

        /* renamed from: a */
        public IntegrationSearchParam f46291a;

        /* renamed from: b */
        public NoQuerySearchParam f46292b;

        /* renamed from: c */
        public CorrectionParam f46293c;

        /* renamed from: a */
        public FeedbackParam build() {
            return new FeedbackParam(this.f46291a, this.f46292b, this.f46293c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18745a mo64442a(CorrectionParam correctionParam) {
            this.f46293c = correctionParam;
            this.f46291a = null;
            this.f46292b = null;
            return this;
        }

        /* renamed from: a */
        public C18745a mo64443a(IntegrationSearchParam integrationSearchParam) {
            this.f46291a = integrationSearchParam;
            this.f46292b = null;
            this.f46293c = null;
            return this;
        }

        /* renamed from: a */
        public C18745a mo64444a(NoQuerySearchParam noQuerySearchParam) {
            this.f46292b = noQuerySearchParam;
            this.f46291a = null;
            this.f46293c = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "FeedbackParam");
        StringBuilder sb = new StringBuilder();
        if (this.integration_search != null) {
            sb.append(", integration_search=");
            sb.append(this.integration_search);
        }
        if (this.no_query_search != null) {
            sb.append(", no_query_search=");
            sb.append(this.no_query_search);
        }
        if (this.correction != null) {
            sb.append(", correction=");
            sb.append(this.correction);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackParam{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackParam(IntegrationSearchParam integrationSearchParam, NoQuerySearchParam noQuerySearchParam, CorrectionParam correctionParam) {
        this(integrationSearchParam, noQuerySearchParam, correctionParam, ByteString.EMPTY);
    }

    public FeedbackParam(IntegrationSearchParam integrationSearchParam, NoQuerySearchParam noQuerySearchParam, CorrectionParam correctionParam, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(integrationSearchParam, noQuerySearchParam, correctionParam) <= 1) {
            this.integration_search = integrationSearchParam;
            this.no_query_search = noQuerySearchParam;
            this.correction = correctionParam;
            return;
        }
        throw new IllegalArgumentException("at most one of integration_search, no_query_search, correction may be non-null");
    }
}
