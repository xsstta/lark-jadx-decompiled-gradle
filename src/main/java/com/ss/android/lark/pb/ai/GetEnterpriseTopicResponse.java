package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetEnterpriseTopicResponse extends Message<GetEnterpriseTopicResponse, C49473a> {
    public static final ProtoAdapter<GetEnterpriseTopicResponse> ADAPTER = new C49474b();
    public static final Integer DEFAULT_ERR_CODE = 0;
    public static final Integer DEFAULT_MAXSENTENCELENGTH = 0;
    private static final long serialVersionUID = 0;
    public final Integer mMaxSentenceLength;
    public final EntityCard mcard;
    public final UrlConfig mconfigs;
    public final Integer merr_code;
    public final List<EntityCard> mmulti_cards;
    public final List<WordCards> mmulti_words;

    /* renamed from: com.ss.android.lark.pb.ai.GetEnterpriseTopicResponse$b */
    private static final class C49474b extends ProtoAdapter<GetEnterpriseTopicResponse> {
        C49474b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEnterpriseTopicResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEnterpriseTopicResponse getEnterpriseTopicResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getEnterpriseTopicResponse.mcard != null) {
                i = EntityCard.ADAPTER.encodedSizeWithTag(1, getEnterpriseTopicResponse.mcard);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + EntityCard.ADAPTER.asRepeated().encodedSizeWithTag(2, getEnterpriseTopicResponse.mmulti_cards) + WordCards.ADAPTER.asRepeated().encodedSizeWithTag(3, getEnterpriseTopicResponse.mmulti_words);
            if (getEnterpriseTopicResponse.mMaxSentenceLength != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, getEnterpriseTopicResponse.mMaxSentenceLength);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (getEnterpriseTopicResponse.mconfigs != null) {
                i3 = UrlConfig.ADAPTER.encodedSizeWithTag(5, getEnterpriseTopicResponse.mconfigs);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getEnterpriseTopicResponse.merr_code != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(255, getEnterpriseTopicResponse.merr_code);
            }
            return i6 + i4 + getEnterpriseTopicResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetEnterpriseTopicResponse decode(ProtoReader protoReader) throws IOException {
            C49473a aVar = new C49473a();
            aVar.f124069d = 0;
            aVar.f124071f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124066a = EntityCard.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124067b.add(EntityCard.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f124068c.add(WordCards.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f124069d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f124070e = UrlConfig.ADAPTER.decode(protoReader);
                } else if (nextTag != 255) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124071f = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEnterpriseTopicResponse getEnterpriseTopicResponse) throws IOException {
            if (getEnterpriseTopicResponse.mcard != null) {
                EntityCard.ADAPTER.encodeWithTag(protoWriter, 1, getEnterpriseTopicResponse.mcard);
            }
            EntityCard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getEnterpriseTopicResponse.mmulti_cards);
            WordCards.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getEnterpriseTopicResponse.mmulti_words);
            if (getEnterpriseTopicResponse.mMaxSentenceLength != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getEnterpriseTopicResponse.mMaxSentenceLength);
            }
            if (getEnterpriseTopicResponse.mconfigs != null) {
                UrlConfig.ADAPTER.encodeWithTag(protoWriter, 5, getEnterpriseTopicResponse.mconfigs);
            }
            if (getEnterpriseTopicResponse.merr_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 255, getEnterpriseTopicResponse.merr_code);
            }
            protoWriter.writeBytes(getEnterpriseTopicResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetEnterpriseTopicResponse$a */
    public static final class C49473a extends Message.Builder<GetEnterpriseTopicResponse, C49473a> {

        /* renamed from: a */
        public EntityCard f124066a;

        /* renamed from: b */
        public List<EntityCard> f124067b = Internal.newMutableList();

        /* renamed from: c */
        public List<WordCards> f124068c = Internal.newMutableList();

        /* renamed from: d */
        public Integer f124069d;

        /* renamed from: e */
        public UrlConfig f124070e;

        /* renamed from: f */
        public Integer f124071f;

        /* renamed from: a */
        public GetEnterpriseTopicResponse build() {
            return new GetEnterpriseTopicResponse(this.f124066a, this.f124067b, this.f124068c, this.f124069d, this.f124070e, this.f124071f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49473a newBuilder() {
        C49473a aVar = new C49473a();
        aVar.f124066a = this.mcard;
        aVar.f124067b = Internal.copyOf("mmulti_cards", this.mmulti_cards);
        aVar.f124068c = Internal.copyOf("mmulti_words", this.mmulti_words);
        aVar.f124069d = this.mMaxSentenceLength;
        aVar.f124070e = this.mconfigs;
        aVar.f124071f = this.merr_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcard != null) {
            sb.append(", card=");
            sb.append(this.mcard);
        }
        if (!this.mmulti_cards.isEmpty()) {
            sb.append(", multi_cards=");
            sb.append(this.mmulti_cards);
        }
        if (!this.mmulti_words.isEmpty()) {
            sb.append(", multi_words=");
            sb.append(this.mmulti_words);
        }
        if (this.mMaxSentenceLength != null) {
            sb.append(", MaxSentenceLength=");
            sb.append(this.mMaxSentenceLength);
        }
        if (this.mconfigs != null) {
            sb.append(", configs=");
            sb.append(this.mconfigs);
        }
        if (this.merr_code != null) {
            sb.append(", err_code=");
            sb.append(this.merr_code);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEnterpriseTopicResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetEnterpriseTopicResponse(EntityCard entityCard, List<EntityCard> list, List<WordCards> list2, Integer num, UrlConfig urlConfig, Integer num2) {
        this(entityCard, list, list2, num, urlConfig, num2, ByteString.EMPTY);
    }

    public GetEnterpriseTopicResponse(EntityCard entityCard, List<EntityCard> list, List<WordCards> list2, Integer num, UrlConfig urlConfig, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcard = entityCard;
        this.mmulti_cards = Internal.immutableCopyOf("mmulti_cards", list);
        this.mmulti_words = Internal.immutableCopyOf("mmulti_words", list2);
        this.mMaxSentenceLength = num;
        this.mconfigs = urlConfig;
        this.merr_code = num2;
    }
}
