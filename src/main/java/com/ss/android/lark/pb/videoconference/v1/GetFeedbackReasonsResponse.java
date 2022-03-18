package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetFeedbackReasonsResponse extends Message<GetFeedbackReasonsResponse, C50645a> {
    public static final ProtoAdapter<GetFeedbackReasonsResponse> ADAPTER = new C50646b();
    private static final long serialVersionUID = 0;
    public final List<FeedbackReasonItem> items;
    public final MultiFeedbackReasonItems multi_items;

    public static final class FeedbackReasonItem extends Message<FeedbackReasonItem, C50641a> {
        public static final ProtoAdapter<FeedbackReasonItem> ADAPTER = new C50642b();
        private static final long serialVersionUID = 0;
        public final String message;
        public final String subkey;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse$FeedbackReasonItem$b */
        private static final class C50642b extends ProtoAdapter<FeedbackReasonItem> {
            C50642b() {
                super(FieldEncoding.LENGTH_DELIMITED, FeedbackReasonItem.class);
            }

            /* renamed from: a */
            public int encodedSize(FeedbackReasonItem feedbackReasonItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, feedbackReasonItem.subkey) + ProtoAdapter.STRING.encodedSizeWithTag(2, feedbackReasonItem.message) + feedbackReasonItem.unknownFields().size();
            }

            /* renamed from: a */
            public FeedbackReasonItem decode(ProtoReader protoReader) throws IOException {
                C50641a aVar = new C50641a();
                aVar.f126376a = "";
                aVar.f126377b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126376a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126377b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FeedbackReasonItem feedbackReasonItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedbackReasonItem.subkey);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feedbackReasonItem.message);
                protoWriter.writeBytes(feedbackReasonItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50641a newBuilder() {
            C50641a aVar = new C50641a();
            aVar.f126376a = this.subkey;
            aVar.f126377b = this.message;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse$FeedbackReasonItem$a */
        public static final class C50641a extends Message.Builder<FeedbackReasonItem, C50641a> {

            /* renamed from: a */
            public String f126376a;

            /* renamed from: b */
            public String f126377b;

            /* renamed from: a */
            public FeedbackReasonItem build() {
                String str;
                String str2 = this.f126376a;
                if (str2 != null && (str = this.f126377b) != null) {
                    return new FeedbackReasonItem(str2, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "subkey", this.f126377b, "message");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "FeedbackReasonItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", subkey=");
            sb.append(this.subkey);
            sb.append(", message=");
            sb.append(this.message);
            StringBuilder replace = sb.replace(0, 2, "FeedbackReasonItem{");
            replace.append('}');
            return replace.toString();
        }

        public FeedbackReasonItem(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public FeedbackReasonItem(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.subkey = str;
            this.message = str2;
        }
    }

    public static final class MultiFeedbackReasonItems extends Message<MultiFeedbackReasonItems, C50643a> {
        public static final ProtoAdapter<MultiFeedbackReasonItems> ADAPTER = new C50644b();
        private static final long serialVersionUID = 0;
        public final List<FeedbackReasonItem> share_screen_items;
        public final List<FeedbackReasonItem> video_items;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse$MultiFeedbackReasonItems$b */
        private static final class C50644b extends ProtoAdapter<MultiFeedbackReasonItems> {
            C50644b() {
                super(FieldEncoding.LENGTH_DELIMITED, MultiFeedbackReasonItems.class);
            }

            /* renamed from: a */
            public int encodedSize(MultiFeedbackReasonItems multiFeedbackReasonItems) {
                return FeedbackReasonItem.ADAPTER.asRepeated().encodedSizeWithTag(1, multiFeedbackReasonItems.video_items) + FeedbackReasonItem.ADAPTER.asRepeated().encodedSizeWithTag(2, multiFeedbackReasonItems.share_screen_items) + multiFeedbackReasonItems.unknownFields().size();
            }

            /* renamed from: a */
            public MultiFeedbackReasonItems decode(ProtoReader protoReader) throws IOException {
                C50643a aVar = new C50643a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126378a.add(FeedbackReasonItem.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126379b.add(FeedbackReasonItem.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MultiFeedbackReasonItems multiFeedbackReasonItems) throws IOException {
                FeedbackReasonItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, multiFeedbackReasonItems.video_items);
                FeedbackReasonItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, multiFeedbackReasonItems.share_screen_items);
                protoWriter.writeBytes(multiFeedbackReasonItems.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse$MultiFeedbackReasonItems$a */
        public static final class C50643a extends Message.Builder<MultiFeedbackReasonItems, C50643a> {

            /* renamed from: a */
            public List<FeedbackReasonItem> f126378a = Internal.newMutableList();

            /* renamed from: b */
            public List<FeedbackReasonItem> f126379b = Internal.newMutableList();

            /* renamed from: a */
            public MultiFeedbackReasonItems build() {
                return new MultiFeedbackReasonItems(this.f126378a, this.f126379b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50643a newBuilder() {
            C50643a aVar = new C50643a();
            aVar.f126378a = Internal.copyOf("video_items", this.video_items);
            aVar.f126379b = Internal.copyOf("share_screen_items", this.share_screen_items);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MultiFeedbackReasonItems");
            StringBuilder sb = new StringBuilder();
            if (!this.video_items.isEmpty()) {
                sb.append(", video_items=");
                sb.append(this.video_items);
            }
            if (!this.share_screen_items.isEmpty()) {
                sb.append(", share_screen_items=");
                sb.append(this.share_screen_items);
            }
            StringBuilder replace = sb.replace(0, 2, "MultiFeedbackReasonItems{");
            replace.append('}');
            return replace.toString();
        }

        public MultiFeedbackReasonItems(List<FeedbackReasonItem> list, List<FeedbackReasonItem> list2) {
            this(list, list2, ByteString.EMPTY);
        }

        public MultiFeedbackReasonItems(List<FeedbackReasonItem> list, List<FeedbackReasonItem> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.video_items = Internal.immutableCopyOf("video_items", list);
            this.share_screen_items = Internal.immutableCopyOf("share_screen_items", list2);
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse$b */
    private static final class C50646b extends ProtoAdapter<GetFeedbackReasonsResponse> {
        C50646b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedbackReasonsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedbackReasonsResponse getFeedbackReasonsResponse) {
            int i;
            int encodedSizeWithTag = FeedbackReasonItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getFeedbackReasonsResponse.items);
            if (getFeedbackReasonsResponse.multi_items != null) {
                i = MultiFeedbackReasonItems.ADAPTER.encodedSizeWithTag(2, getFeedbackReasonsResponse.multi_items);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getFeedbackReasonsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedbackReasonsResponse decode(ProtoReader protoReader) throws IOException {
            C50645a aVar = new C50645a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126380a.add(FeedbackReasonItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126381b = MultiFeedbackReasonItems.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFeedbackReasonsResponse getFeedbackReasonsResponse) throws IOException {
            FeedbackReasonItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getFeedbackReasonsResponse.items);
            if (getFeedbackReasonsResponse.multi_items != null) {
                MultiFeedbackReasonItems.ADAPTER.encodeWithTag(protoWriter, 2, getFeedbackReasonsResponse.multi_items);
            }
            protoWriter.writeBytes(getFeedbackReasonsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse$a */
    public static final class C50645a extends Message.Builder<GetFeedbackReasonsResponse, C50645a> {

        /* renamed from: a */
        public List<FeedbackReasonItem> f126380a = Internal.newMutableList();

        /* renamed from: b */
        public MultiFeedbackReasonItems f126381b;

        /* renamed from: a */
        public GetFeedbackReasonsResponse build() {
            return new GetFeedbackReasonsResponse(this.f126380a, this.f126381b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50645a newBuilder() {
        C50645a aVar = new C50645a();
        aVar.f126380a = Internal.copyOf("items", this.items);
        aVar.f126381b = this.multi_items;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetFeedbackReasonsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        if (this.multi_items != null) {
            sb.append(", multi_items=");
            sb.append(this.multi_items);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedbackReasonsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedbackReasonsResponse(List<FeedbackReasonItem> list, MultiFeedbackReasonItems multiFeedbackReasonItems) {
        this(list, multiFeedbackReasonItems, ByteString.EMPTY);
    }

    public GetFeedbackReasonsResponse(List<FeedbackReasonItem> list, MultiFeedbackReasonItems multiFeedbackReasonItems, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = Internal.immutableCopyOf("items", list);
        this.multi_items = multiFeedbackReasonItems;
    }
}
