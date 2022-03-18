package com.ss.android.lark.pb.hongbao;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.HongbaoCover;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PullHongbaoCoverListResponse extends Message<PullHongbaoCoverListResponse, C49803a> {
    public static final ProtoAdapter<PullHongbaoCoverListResponse> ADAPTER = new C49804b();
    private static final long serialVersionUID = 0;
    public final List<Category> mcategory_list;
    public final Map<Long, CoverList> mcovers;
    public final List<HongbaoCover> mrecommend_covers;

    public static final class Category extends Message<Category, C49799a> {
        public static final ProtoAdapter<Category> ADAPTER = new C49800b();
        public static final Long DEFAULT_ID = 0L;
        public static final Integer DEFAULT_ORDER = 0;
        private static final long serialVersionUID = 0;
        public final Long mid;
        public final String mname;
        public final Integer morder;

        /* renamed from: com.ss.android.lark.pb.hongbao.PullHongbaoCoverListResponse$Category$b */
        private static final class C49800b extends ProtoAdapter<Category> {
            C49800b() {
                super(FieldEncoding.LENGTH_DELIMITED, Category.class);
            }

            /* renamed from: a */
            public int encodedSize(Category category) {
                int i;
                int i2;
                int i3 = 0;
                if (category.mid != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, category.mid);
                } else {
                    i = 0;
                }
                if (category.mname != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, category.mname);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (category.morder != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, category.morder);
                }
                return i4 + i3 + category.unknownFields().size();
            }

            /* renamed from: a */
            public Category decode(ProtoReader protoReader) throws IOException {
                C49799a aVar = new C49799a();
                aVar.f124729a = 0L;
                aVar.f124730b = "";
                aVar.f124731c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124729a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f124730b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124731c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Category category) throws IOException {
                if (category.mid != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, category.mid);
                }
                if (category.mname != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, category.mname);
                }
                if (category.morder != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, category.morder);
                }
                protoWriter.writeBytes(category.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.hongbao.PullHongbaoCoverListResponse$Category$a */
        public static final class C49799a extends Message.Builder<Category, C49799a> {

            /* renamed from: a */
            public Long f124729a;

            /* renamed from: b */
            public String f124730b;

            /* renamed from: c */
            public Integer f124731c;

            /* renamed from: a */
            public Category build() {
                return new Category(this.f124729a, this.f124730b, this.f124731c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49799a newBuilder() {
            C49799a aVar = new C49799a();
            aVar.f124729a = this.mid;
            aVar.f124730b = this.mname;
            aVar.f124731c = this.morder;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mid != null) {
                sb.append(", id=");
                sb.append(this.mid);
            }
            if (this.mname != null) {
                sb.append(", name=");
                sb.append(this.mname);
            }
            if (this.morder != null) {
                sb.append(", order=");
                sb.append(this.morder);
            }
            StringBuilder replace = sb.replace(0, 2, "Category{");
            replace.append('}');
            return replace.toString();
        }

        public Category(Long l, String str, Integer num) {
            this(l, str, num, ByteString.EMPTY);
        }

        public Category(Long l, String str, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mid = l;
            this.mname = str;
            this.morder = num;
        }
    }

    public static final class CoverList extends Message<CoverList, C49801a> {
        public static final ProtoAdapter<CoverList> ADAPTER = new C49802b();
        public static final Long DEFAULT_CATEGORY_ID = 0L;
        private static final long serialVersionUID = 0;
        public final Long mcategory_id;
        public final List<HongbaoCover> mcovers;

        /* renamed from: com.ss.android.lark.pb.hongbao.PullHongbaoCoverListResponse$CoverList$b */
        private static final class C49802b extends ProtoAdapter<CoverList> {
            C49802b() {
                super(FieldEncoding.LENGTH_DELIMITED, CoverList.class);
            }

            /* renamed from: a */
            public int encodedSize(CoverList coverList) {
                int i;
                if (coverList.mcategory_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, coverList.mcategory_id);
                } else {
                    i = 0;
                }
                return i + HongbaoCover.ADAPTER.asRepeated().encodedSizeWithTag(2, coverList.mcovers) + coverList.unknownFields().size();
            }

            /* renamed from: a */
            public CoverList decode(ProtoReader protoReader) throws IOException {
                C49801a aVar = new C49801a();
                aVar.f124732a = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124732a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124733b.add(HongbaoCover.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CoverList coverList) throws IOException {
                if (coverList.mcategory_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, coverList.mcategory_id);
                }
                HongbaoCover.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, coverList.mcovers);
                protoWriter.writeBytes(coverList.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.hongbao.PullHongbaoCoverListResponse$CoverList$a */
        public static final class C49801a extends Message.Builder<CoverList, C49801a> {

            /* renamed from: a */
            public Long f124732a;

            /* renamed from: b */
            public List<HongbaoCover> f124733b = Internal.newMutableList();

            /* renamed from: a */
            public CoverList build() {
                return new CoverList(this.f124732a, this.f124733b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49801a newBuilder() {
            C49801a aVar = new C49801a();
            aVar.f124732a = this.mcategory_id;
            aVar.f124733b = Internal.copyOf("mcovers", this.mcovers);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mcategory_id != null) {
                sb.append(", category_id=");
                sb.append(this.mcategory_id);
            }
            if (!this.mcovers.isEmpty()) {
                sb.append(", covers=");
                sb.append(this.mcovers);
            }
            StringBuilder replace = sb.replace(0, 2, "CoverList{");
            replace.append('}');
            return replace.toString();
        }

        public CoverList(Long l, List<HongbaoCover> list) {
            this(l, list, ByteString.EMPTY);
        }

        public CoverList(Long l, List<HongbaoCover> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mcategory_id = l;
            this.mcovers = Internal.immutableCopyOf("mcovers", list);
        }
    }

    /* renamed from: com.ss.android.lark.pb.hongbao.PullHongbaoCoverListResponse$a */
    public static final class C49803a extends Message.Builder<PullHongbaoCoverListResponse, C49803a> {

        /* renamed from: a */
        public List<Category> f124734a = Internal.newMutableList();

        /* renamed from: b */
        public Map<Long, CoverList> f124735b = Internal.newMutableMap();

        /* renamed from: c */
        public List<HongbaoCover> f124736c = Internal.newMutableList();

        /* renamed from: a */
        public PullHongbaoCoverListResponse build() {
            return new PullHongbaoCoverListResponse(this.f124734a, this.f124735b, this.f124736c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.hongbao.PullHongbaoCoverListResponse$b */
    private static final class C49804b extends ProtoAdapter<PullHongbaoCoverListResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, CoverList>> f124737a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, CoverList.ADAPTER);

        C49804b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullHongbaoCoverListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullHongbaoCoverListResponse pullHongbaoCoverListResponse) {
            return Category.ADAPTER.asRepeated().encodedSizeWithTag(1, pullHongbaoCoverListResponse.mcategory_list) + this.f124737a.encodedSizeWithTag(2, pullHongbaoCoverListResponse.mcovers) + HongbaoCover.ADAPTER.asRepeated().encodedSizeWithTag(3, pullHongbaoCoverListResponse.mrecommend_covers) + pullHongbaoCoverListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullHongbaoCoverListResponse decode(ProtoReader protoReader) throws IOException {
            C49803a aVar = new C49803a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124734a.add(Category.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f124735b.putAll(this.f124737a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124736c.add(HongbaoCover.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullHongbaoCoverListResponse pullHongbaoCoverListResponse) throws IOException {
            Category.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullHongbaoCoverListResponse.mcategory_list);
            this.f124737a.encodeWithTag(protoWriter, 2, pullHongbaoCoverListResponse.mcovers);
            HongbaoCover.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, pullHongbaoCoverListResponse.mrecommend_covers);
            protoWriter.writeBytes(pullHongbaoCoverListResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49803a newBuilder() {
        C49803a aVar = new C49803a();
        aVar.f124734a = Internal.copyOf("mcategory_list", this.mcategory_list);
        aVar.f124735b = Internal.copyOf("mcovers", this.mcovers);
        aVar.f124736c = Internal.copyOf("mrecommend_covers", this.mrecommend_covers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mcategory_list.isEmpty()) {
            sb.append(", category_list=");
            sb.append(this.mcategory_list);
        }
        if (!this.mcovers.isEmpty()) {
            sb.append(", covers=");
            sb.append(this.mcovers);
        }
        if (!this.mrecommend_covers.isEmpty()) {
            sb.append(", recommend_covers=");
            sb.append(this.mrecommend_covers);
        }
        StringBuilder replace = sb.replace(0, 2, "PullHongbaoCoverListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullHongbaoCoverListResponse(List<Category> list, Map<Long, CoverList> map, List<HongbaoCover> list2) {
        this(list, map, list2, ByteString.EMPTY);
    }

    public PullHongbaoCoverListResponse(List<Category> list, Map<Long, CoverList> map, List<HongbaoCover> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcategory_list = Internal.immutableCopyOf("mcategory_list", list);
        this.mcovers = Internal.immutableCopyOf("mcovers", map);
        this.mrecommend_covers = Internal.immutableCopyOf("mrecommend_covers", list2);
    }
}
