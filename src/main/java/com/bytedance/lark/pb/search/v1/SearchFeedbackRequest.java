package com.bytedance.lark.pb.search.v1;

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

public final class SearchFeedbackRequest extends Message<SearchFeedbackRequest, C18877a> {
    public static final ProtoAdapter<SearchFeedbackRequest> ADAPTER = new C18878b();
    private static final long serialVersionUID = 0;
    public final List<Feedback> feedbacks;
    public final String impr_id;
    public final String query;
    public final Scene scene;
    public final String search_session;

    public static final class Feedback extends Message<Feedback, C18875a> {
        public static final ProtoAdapter<Feedback> ADAPTER = new C18876b();
        public static final Integer DEFAULT_OFFSET = 0;
        public static final EntityType DEFAULT_TYPE = EntityType.CHATTER;
        private static final long serialVersionUID = 0;
        public final String entity_id;
        public final Integer offset;
        public final EntityType type;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchFeedbackRequest$Feedback$b */
        private static final class C18876b extends ProtoAdapter<Feedback> {
            C18876b() {
                super(FieldEncoding.LENGTH_DELIMITED, Feedback.class);
            }

            /* renamed from: a */
            public int encodedSize(Feedback feedback) {
                int i;
                int i2;
                int i3 = 0;
                if (feedback.entity_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, feedback.entity_id);
                } else {
                    i = 0;
                }
                if (feedback.type != null) {
                    i2 = EntityType.ADAPTER.encodedSizeWithTag(2, feedback.type);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (feedback.offset != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, feedback.offset);
                }
                return i4 + i3 + feedback.unknownFields().size();
            }

            /* renamed from: a */
            public Feedback decode(ProtoReader protoReader) throws IOException {
                C18875a aVar = new C18875a();
                aVar.f46668a = "";
                aVar.f46669b = EntityType.CHATTER;
                aVar.f46670c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46668a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f46669b = EntityType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46670c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Feedback feedback) throws IOException {
                if (feedback.entity_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedback.entity_id);
                }
                if (feedback.type != null) {
                    EntityType.ADAPTER.encodeWithTag(protoWriter, 2, feedback.type);
                }
                if (feedback.offset != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, feedback.offset);
                }
                protoWriter.writeBytes(feedback.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchFeedbackRequest$Feedback$a */
        public static final class C18875a extends Message.Builder<Feedback, C18875a> {

            /* renamed from: a */
            public String f46668a;

            /* renamed from: b */
            public EntityType f46669b;

            /* renamed from: c */
            public Integer f46670c;

            /* renamed from: a */
            public Feedback build() {
                return new Feedback(this.f46668a, this.f46669b, this.f46670c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18875a mo64766a(EntityType entityType) {
                this.f46669b = entityType;
                return this;
            }

            /* renamed from: a */
            public C18875a mo64767a(Integer num) {
                this.f46670c = num;
                return this;
            }

            /* renamed from: a */
            public C18875a mo64768a(String str) {
                this.f46668a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18875a newBuilder() {
            C18875a aVar = new C18875a();
            aVar.f46668a = this.entity_id;
            aVar.f46669b = this.type;
            aVar.f46670c = this.offset;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "Feedback");
            StringBuilder sb = new StringBuilder();
            if (this.entity_id != null) {
                sb.append(", entity_id=");
                sb.append(this.entity_id);
            }
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.offset != null) {
                sb.append(", offset=");
                sb.append(this.offset);
            }
            StringBuilder replace = sb.replace(0, 2, "Feedback{");
            replace.append('}');
            return replace.toString();
        }

        public Feedback(String str, EntityType entityType, Integer num) {
            this(str, entityType, num, ByteString.EMPTY);
        }

        public Feedback(String str, EntityType entityType, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.entity_id = str;
            this.type = entityType;
            this.offset = num;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchFeedbackRequest$b */
    private static final class C18878b extends ProtoAdapter<SearchFeedbackRequest> {
        C18878b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchFeedbackRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchFeedbackRequest searchFeedbackRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (searchFeedbackRequest.query != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, searchFeedbackRequest.query);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Feedback.ADAPTER.asRepeated().encodedSizeWithTag(2, searchFeedbackRequest.feedbacks);
            if (searchFeedbackRequest.scene != null) {
                i2 = Scene.ADAPTER.encodedSizeWithTag(3, searchFeedbackRequest.scene);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (searchFeedbackRequest.search_session != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchFeedbackRequest.search_session);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (searchFeedbackRequest.impr_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchFeedbackRequest.impr_id);
            }
            return i6 + i4 + searchFeedbackRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchFeedbackRequest decode(ProtoReader protoReader) throws IOException {
            C18877a aVar = new C18877a();
            aVar.f46671a = "";
            aVar.f46674d = "";
            aVar.f46675e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46671a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46672b.add(Feedback.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f46673c = Scene.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46674d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46675e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchFeedbackRequest searchFeedbackRequest) throws IOException {
            if (searchFeedbackRequest.query != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchFeedbackRequest.query);
            }
            Feedback.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, searchFeedbackRequest.feedbacks);
            if (searchFeedbackRequest.scene != null) {
                Scene.ADAPTER.encodeWithTag(protoWriter, 3, searchFeedbackRequest.scene);
            }
            if (searchFeedbackRequest.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchFeedbackRequest.search_session);
            }
            if (searchFeedbackRequest.impr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchFeedbackRequest.impr_id);
            }
            protoWriter.writeBytes(searchFeedbackRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchFeedbackRequest$a */
    public static final class C18877a extends Message.Builder<SearchFeedbackRequest, C18877a> {

        /* renamed from: a */
        public String f46671a;

        /* renamed from: b */
        public List<Feedback> f46672b = Internal.newMutableList();

        /* renamed from: c */
        public Scene f46673c;

        /* renamed from: d */
        public String f46674d;

        /* renamed from: e */
        public String f46675e;

        /* renamed from: a */
        public SearchFeedbackRequest build() {
            return new SearchFeedbackRequest(this.f46671a, this.f46672b, this.f46673c, this.f46674d, this.f46675e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18877a mo64773a(Scene scene) {
            this.f46673c = scene;
            return this;
        }

        /* renamed from: b */
        public C18877a mo64777b(String str) {
            this.f46674d = str;
            return this;
        }

        /* renamed from: c */
        public C18877a mo64778c(String str) {
            this.f46675e = str;
            return this;
        }

        /* renamed from: a */
        public C18877a mo64774a(String str) {
            this.f46671a = str;
            return this;
        }

        /* renamed from: a */
        public C18877a mo64775a(List<Feedback> list) {
            Internal.checkElementsNotNull(list);
            this.f46672b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18877a newBuilder() {
        C18877a aVar = new C18877a();
        aVar.f46671a = this.query;
        aVar.f46672b = Internal.copyOf("feedbacks", this.feedbacks);
        aVar.f46673c = this.scene;
        aVar.f46674d = this.search_session;
        aVar.f46675e = this.impr_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchFeedbackRequest");
        StringBuilder sb = new StringBuilder();
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        if (!this.feedbacks.isEmpty()) {
            sb.append(", feedbacks=");
            sb.append(this.feedbacks);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchFeedbackRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchFeedbackRequest(String str, List<Feedback> list, Scene scene2, String str2, String str3) {
        this(str, list, scene2, str2, str3, ByteString.EMPTY);
    }

    public SearchFeedbackRequest(String str, List<Feedback> list, Scene scene2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.feedbacks = Internal.immutableCopyOf("feedbacks", list);
        this.scene = scene2;
        this.search_session = str2;
        this.impr_id = str3;
    }
}
