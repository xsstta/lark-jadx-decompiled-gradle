package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UniversalRecommendRequestHeader extends Message<UniversalRecommendRequestHeader, C50170a> {
    public static final ProtoAdapter<UniversalRecommendRequestHeader> ADAPTER = new C50171b();
    public static final Integer DEFAULT_HEIGHTINCH = 0;
    public static final Integer DEFAULT_WIDTHINCH = 0;
    private static final long serialVersionUID = 0;
    public final Integer mheightInch;
    public final String mlocale;
    public final String mpagination_token;
    public final RecommendContext mrecommend_context;
    public final List<SectionEntityType> msections;
    public final String msession_id;
    public final Integer mwidthInch;

    public static final class RecommendContext extends Message<RecommendContext, C50168a> {
        public static final ProtoAdapter<RecommendContext> ADAPTER = new C50169b();
        private static final long serialVersionUID = 0;
        public final String mtag_name;

        /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendRequestHeader$RecommendContext$b */
        private static final class C50169b extends ProtoAdapter<RecommendContext> {
            C50169b() {
                super(FieldEncoding.LENGTH_DELIMITED, RecommendContext.class);
            }

            /* renamed from: a */
            public int encodedSize(RecommendContext recommendContext) {
                int i;
                if (recommendContext.mtag_name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, recommendContext.mtag_name);
                } else {
                    i = 0;
                }
                return i + recommendContext.unknownFields().size();
            }

            /* renamed from: a */
            public RecommendContext decode(ProtoReader protoReader) throws IOException {
                C50168a aVar = new C50168a();
                aVar.f125362a = "";
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
                        aVar.f125362a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RecommendContext recommendContext) throws IOException {
                if (recommendContext.mtag_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recommendContext.mtag_name);
                }
                protoWriter.writeBytes(recommendContext.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendRequestHeader$RecommendContext$a */
        public static final class C50168a extends Message.Builder<RecommendContext, C50168a> {

            /* renamed from: a */
            public String f125362a;

            /* renamed from: a */
            public RecommendContext build() {
                return new RecommendContext(this.f125362a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C50168a mo174170a(String str) {
                this.f125362a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C50168a newBuilder() {
            C50168a aVar = new C50168a();
            aVar.f125362a = this.mtag_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mtag_name != null) {
                sb.append(", tag_name=");
                sb.append(this.mtag_name);
            }
            StringBuilder replace = sb.replace(0, 2, "RecommendContext{");
            replace.append('}');
            return replace.toString();
        }

        public RecommendContext(String str) {
            this(str, ByteString.EMPTY);
        }

        public RecommendContext(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtag_name = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendRequestHeader$b */
    private static final class C50171b extends ProtoAdapter<UniversalRecommendRequestHeader> {
        C50171b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalRecommendRequestHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalRecommendRequestHeader universalRecommendRequestHeader) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = SectionEntityType.ADAPTER.asRepeated().encodedSizeWithTag(1, universalRecommendRequestHeader.msections);
            int i6 = 0;
            if (universalRecommendRequestHeader.mpagination_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, universalRecommendRequestHeader.mpagination_token);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (universalRecommendRequestHeader.mlocale != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, universalRecommendRequestHeader.mlocale);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (universalRecommendRequestHeader.msession_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, universalRecommendRequestHeader.msession_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (universalRecommendRequestHeader.mrecommend_context != null) {
                i4 = RecommendContext.ADAPTER.encodedSizeWithTag(5, universalRecommendRequestHeader.mrecommend_context);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (universalRecommendRequestHeader.mwidthInch != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, universalRecommendRequestHeader.mwidthInch);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (universalRecommendRequestHeader.mheightInch != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, universalRecommendRequestHeader.mheightInch);
            }
            return i11 + i6 + universalRecommendRequestHeader.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalRecommendRequestHeader decode(ProtoReader protoReader) throws IOException {
            C50170a aVar = new C50170a();
            aVar.f125364b = "";
            aVar.f125365c = "";
            aVar.f125366d = "";
            aVar.f125368f = 0;
            aVar.f125369g = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125363a.add(SectionEntityType.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f125364b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125365c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125366d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125367e = RecommendContext.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125368f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125369g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UniversalRecommendRequestHeader universalRecommendRequestHeader) throws IOException {
            SectionEntityType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, universalRecommendRequestHeader.msections);
            if (universalRecommendRequestHeader.mpagination_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, universalRecommendRequestHeader.mpagination_token);
            }
            if (universalRecommendRequestHeader.mlocale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, universalRecommendRequestHeader.mlocale);
            }
            if (universalRecommendRequestHeader.msession_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, universalRecommendRequestHeader.msession_id);
            }
            if (universalRecommendRequestHeader.mrecommend_context != null) {
                RecommendContext.ADAPTER.encodeWithTag(protoWriter, 5, universalRecommendRequestHeader.mrecommend_context);
            }
            if (universalRecommendRequestHeader.mwidthInch != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, universalRecommendRequestHeader.mwidthInch);
            }
            if (universalRecommendRequestHeader.mheightInch != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, universalRecommendRequestHeader.mheightInch);
            }
            protoWriter.writeBytes(universalRecommendRequestHeader.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendRequestHeader$a */
    public static final class C50170a extends Message.Builder<UniversalRecommendRequestHeader, C50170a> {

        /* renamed from: a */
        public List<SectionEntityType> f125363a = Internal.newMutableList();

        /* renamed from: b */
        public String f125364b;

        /* renamed from: c */
        public String f125365c;

        /* renamed from: d */
        public String f125366d;

        /* renamed from: e */
        public RecommendContext f125367e;

        /* renamed from: f */
        public Integer f125368f;

        /* renamed from: g */
        public Integer f125369g;

        /* renamed from: a */
        public UniversalRecommendRequestHeader build() {
            return new UniversalRecommendRequestHeader(this.f125363a, this.f125364b, this.f125365c, this.f125366d, this.f125367e, this.f125368f, this.f125369g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50170a mo174175a(RecommendContext recommendContext) {
            this.f125367e = recommendContext;
            return this;
        }

        /* renamed from: b */
        public C50170a mo174180b(Integer num) {
            this.f125369g = num;
            return this;
        }

        /* renamed from: c */
        public C50170a mo174182c(String str) {
            this.f125366d = str;
            return this;
        }

        /* renamed from: a */
        public C50170a mo174176a(Integer num) {
            this.f125368f = num;
            return this;
        }

        /* renamed from: b */
        public C50170a mo174181b(String str) {
            this.f125365c = str;
            return this;
        }

        /* renamed from: a */
        public C50170a mo174177a(String str) {
            this.f125364b = str;
            return this;
        }

        /* renamed from: a */
        public C50170a mo174178a(List<SectionEntityType> list) {
            Internal.checkElementsNotNull(list);
            this.f125363a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50170a newBuilder() {
        C50170a aVar = new C50170a();
        aVar.f125363a = Internal.copyOf("msections", this.msections);
        aVar.f125364b = this.mpagination_token;
        aVar.f125365c = this.mlocale;
        aVar.f125366d = this.msession_id;
        aVar.f125367e = this.mrecommend_context;
        aVar.f125368f = this.mwidthInch;
        aVar.f125369g = this.mheightInch;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.msections.isEmpty()) {
            sb.append(", sections=");
            sb.append(this.msections);
        }
        if (this.mpagination_token != null) {
            sb.append(", pagination_token=");
            sb.append(this.mpagination_token);
        }
        if (this.mlocale != null) {
            sb.append(", locale=");
            sb.append(this.mlocale);
        }
        if (this.msession_id != null) {
            sb.append(", session_id=");
            sb.append(this.msession_id);
        }
        if (this.mrecommend_context != null) {
            sb.append(", recommend_context=");
            sb.append(this.mrecommend_context);
        }
        if (this.mwidthInch != null) {
            sb.append(", widthInch=");
            sb.append(this.mwidthInch);
        }
        if (this.mheightInch != null) {
            sb.append(", heightInch=");
            sb.append(this.mheightInch);
        }
        StringBuilder replace = sb.replace(0, 2, "UniversalRecommendRequestHeader{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalRecommendRequestHeader(List<SectionEntityType> list, String str, String str2, String str3, RecommendContext recommendContext, Integer num, Integer num2) {
        this(list, str, str2, str3, recommendContext, num, num2, ByteString.EMPTY);
    }

    public UniversalRecommendRequestHeader(List<SectionEntityType> list, String str, String str2, String str3, RecommendContext recommendContext, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msections = Internal.immutableCopyOf("msections", list);
        this.mpagination_token = str;
        this.mlocale = str2;
        this.msession_id = str3;
        this.mrecommend_context = recommendContext;
        this.mwidthInch = num;
        this.mheightInch = num2;
    }
}
