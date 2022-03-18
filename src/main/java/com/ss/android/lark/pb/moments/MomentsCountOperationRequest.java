package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MomentsCountOperationRequest extends Message<MomentsCountOperationRequest, C49928a> {
    public static final ProtoAdapter<MomentsCountOperationRequest> ADAPTER = new C49929b();
    private static final long serialVersionUID = 0;
    public final String mcid;
    public final RecordPostViewData mrecord_post_view_data;
    public final Type mtype;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        RECORD_POST_VIEW(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return RECORD_POST_VIEW;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class RecordPostViewData extends Message<RecordPostViewData, C49926a> {
        public static final ProtoAdapter<RecordPostViewData> ADAPTER = new C49927b();
        private static final long serialVersionUID = 0;
        public final String mpost_id;

        /* renamed from: com.ss.android.lark.pb.moments.MomentsCountOperationRequest$RecordPostViewData$b */
        private static final class C49927b extends ProtoAdapter<RecordPostViewData> {
            C49927b() {
                super(FieldEncoding.LENGTH_DELIMITED, RecordPostViewData.class);
            }

            /* renamed from: a */
            public int encodedSize(RecordPostViewData recordPostViewData) {
                int i;
                if (recordPostViewData.mpost_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, recordPostViewData.mpost_id);
                } else {
                    i = 0;
                }
                return i + recordPostViewData.unknownFields().size();
            }

            /* renamed from: a */
            public RecordPostViewData decode(ProtoReader protoReader) throws IOException {
                C49926a aVar = new C49926a();
                aVar.f124940a = "";
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
                        aVar.f124940a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RecordPostViewData recordPostViewData) throws IOException {
                if (recordPostViewData.mpost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recordPostViewData.mpost_id);
                }
                protoWriter.writeBytes(recordPostViewData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments.MomentsCountOperationRequest$RecordPostViewData$a */
        public static final class C49926a extends Message.Builder<RecordPostViewData, C49926a> {

            /* renamed from: a */
            public String f124940a;

            /* renamed from: a */
            public RecordPostViewData build() {
                return new RecordPostViewData(this.f124940a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C49926a mo173625a(String str) {
                this.f124940a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C49926a newBuilder() {
            C49926a aVar = new C49926a();
            aVar.f124940a = this.mpost_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mpost_id != null) {
                sb.append(", post_id=");
                sb.append(this.mpost_id);
            }
            StringBuilder replace = sb.replace(0, 2, "RecordPostViewData{");
            replace.append('}');
            return replace.toString();
        }

        public RecordPostViewData(String str) {
            this(str, ByteString.EMPTY);
        }

        public RecordPostViewData(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mpost_id = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.MomentsCountOperationRequest$b */
    private static final class C49929b extends ProtoAdapter<MomentsCountOperationRequest> {
        C49929b() {
            super(FieldEncoding.LENGTH_DELIMITED, MomentsCountOperationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MomentsCountOperationRequest momentsCountOperationRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (momentsCountOperationRequest.mtype != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, momentsCountOperationRequest.mtype);
            } else {
                i = 0;
            }
            if (momentsCountOperationRequest.mcid != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, momentsCountOperationRequest.mcid);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (momentsCountOperationRequest.mrecord_post_view_data != null) {
                i3 = RecordPostViewData.ADAPTER.encodedSizeWithTag(101, momentsCountOperationRequest.mrecord_post_view_data);
            }
            return i4 + i3 + momentsCountOperationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MomentsCountOperationRequest decode(ProtoReader protoReader) throws IOException {
            C49928a aVar = new C49928a();
            aVar.f124942b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124941a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124942b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124943c = RecordPostViewData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MomentsCountOperationRequest momentsCountOperationRequest) throws IOException {
            if (momentsCountOperationRequest.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, momentsCountOperationRequest.mtype);
            }
            if (momentsCountOperationRequest.mcid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, momentsCountOperationRequest.mcid);
            }
            if (momentsCountOperationRequest.mrecord_post_view_data != null) {
                RecordPostViewData.ADAPTER.encodeWithTag(protoWriter, 101, momentsCountOperationRequest.mrecord_post_view_data);
            }
            protoWriter.writeBytes(momentsCountOperationRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.MomentsCountOperationRequest$a */
    public static final class C49928a extends Message.Builder<MomentsCountOperationRequest, C49928a> {

        /* renamed from: a */
        public Type f124941a;

        /* renamed from: b */
        public String f124942b;

        /* renamed from: c */
        public RecordPostViewData f124943c;

        /* renamed from: a */
        public MomentsCountOperationRequest build() {
            return new MomentsCountOperationRequest(this.f124941a, this.f124942b, this.f124943c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49928a mo173630a(RecordPostViewData recordPostViewData) {
            this.f124943c = recordPostViewData;
            return this;
        }

        /* renamed from: a */
        public C49928a mo173631a(Type type) {
            this.f124941a = type;
            return this;
        }

        /* renamed from: a */
        public C49928a mo173632a(String str) {
            this.f124942b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49928a newBuilder() {
        C49928a aVar = new C49928a();
        aVar.f124941a = this.mtype;
        aVar.f124942b = this.mcid;
        aVar.f124943c = this.mrecord_post_view_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mcid != null) {
            sb.append(", cid=");
            sb.append(this.mcid);
        }
        if (this.mrecord_post_view_data != null) {
            sb.append(", record_post_view_data=");
            sb.append(this.mrecord_post_view_data);
        }
        StringBuilder replace = sb.replace(0, 2, "MomentsCountOperationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MomentsCountOperationRequest(Type type, String str, RecordPostViewData recordPostViewData) {
        this(type, str, recordPostViewData, ByteString.EMPTY);
    }

    public MomentsCountOperationRequest(Type type, String str, RecordPostViewData recordPostViewData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
        this.mcid = str;
        this.mrecord_post_view_data = recordPostViewData;
    }
}
