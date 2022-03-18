package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetFeedbackReasonsRequest extends Message<GetFeedbackReasonsRequest, C50639a> {
    public static final ProtoAdapter<GetFeedbackReasonsRequest> ADAPTER = new C50640b();
    public static final FeedbackType DEFAULT_FEEDBACK_TYPE = FeedbackType.UNKOWN;
    private static final long serialVersionUID = 0;
    public final FeedbackType feedback_type;

    public enum FeedbackType implements WireEnum {
        UNKOWN(0),
        ALL(1),
        SINGLE(2),
        MULTI(3);
        
        public static final ProtoAdapter<FeedbackType> ADAPTER = ProtoAdapter.newEnumAdapter(FeedbackType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FeedbackType fromValue(int i) {
            if (i == 0) {
                return UNKOWN;
            }
            if (i == 1) {
                return ALL;
            }
            if (i == 2) {
                return SINGLE;
            }
            if (i != 3) {
                return null;
            }
            return MULTI;
        }

        private FeedbackType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsRequest$b */
    private static final class C50640b extends ProtoAdapter<GetFeedbackReasonsRequest> {
        C50640b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedbackReasonsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedbackReasonsRequest getFeedbackReasonsRequest) {
            int i;
            if (getFeedbackReasonsRequest.feedback_type != null) {
                i = FeedbackType.ADAPTER.encodedSizeWithTag(1, getFeedbackReasonsRequest.feedback_type);
            } else {
                i = 0;
            }
            return i + getFeedbackReasonsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedbackReasonsRequest decode(ProtoReader protoReader) throws IOException {
            C50639a aVar = new C50639a();
            aVar.f126375a = FeedbackType.UNKOWN;
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
                    try {
                        aVar.f126375a = FeedbackType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFeedbackReasonsRequest getFeedbackReasonsRequest) throws IOException {
            if (getFeedbackReasonsRequest.feedback_type != null) {
                FeedbackType.ADAPTER.encodeWithTag(protoWriter, 1, getFeedbackReasonsRequest.feedback_type);
            }
            protoWriter.writeBytes(getFeedbackReasonsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsRequest$a */
    public static final class C50639a extends Message.Builder<GetFeedbackReasonsRequest, C50639a> {

        /* renamed from: a */
        public FeedbackType f126375a;

        /* renamed from: a */
        public GetFeedbackReasonsRequest build() {
            return new GetFeedbackReasonsRequest(this.f126375a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50639a mo175253a(FeedbackType feedbackType) {
            this.f126375a = feedbackType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50639a newBuilder() {
        C50639a aVar = new C50639a();
        aVar.f126375a = this.feedback_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetFeedbackReasonsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.feedback_type != null) {
            sb.append(", feedback_type=");
            sb.append(this.feedback_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedbackReasonsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedbackReasonsRequest(FeedbackType feedbackType) {
        this(feedbackType, ByteString.EMPTY);
    }

    public GetFeedbackReasonsRequest(FeedbackType feedbackType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feedback_type = feedbackType;
    }
}
