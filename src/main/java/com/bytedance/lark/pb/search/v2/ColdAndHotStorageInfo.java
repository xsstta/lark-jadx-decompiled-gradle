package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ColdAndHotStorageInfo extends Message<ColdAndHotStorageInfo, C18973a> {
    public static final ProtoAdapter<ColdAndHotStorageInfo> ADAPTER = new C18974b();
    public static final Boolean DEFAULT_IS_NEED_COLD_DATA = false;
    public static final Integer DEFAULT_TIME_SIZE = 0;
    public static final TimeUnit DEFAULT_TIME_UNIT = TimeUnit.YEAR;
    private static final long serialVersionUID = 0;
    public final Boolean is_need_cold_data;
    public final Integer time_size;
    public final String time_text;
    public final TimeUnit time_unit;

    public enum TimeUnit implements WireEnum {
        DAY(1),
        WEEK(2),
        MONTH(3),
        YEAR(4);
        
        public static final ProtoAdapter<TimeUnit> ADAPTER = ProtoAdapter.newEnumAdapter(TimeUnit.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TimeUnit fromValue(int i) {
            if (i == 1) {
                return DAY;
            }
            if (i == 2) {
                return WEEK;
            }
            if (i == 3) {
                return MONTH;
            }
            if (i != 4) {
                return null;
            }
            return YEAR;
        }

        private TimeUnit(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ColdAndHotStorageInfo$b */
    private static final class C18974b extends ProtoAdapter<ColdAndHotStorageInfo> {
        C18974b() {
            super(FieldEncoding.LENGTH_DELIMITED, ColdAndHotStorageInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ColdAndHotStorageInfo coldAndHotStorageInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (coldAndHotStorageInfo.is_need_cold_data != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, coldAndHotStorageInfo.is_need_cold_data);
            } else {
                i = 0;
            }
            if (coldAndHotStorageInfo.time_size != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, coldAndHotStorageInfo.time_size);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (coldAndHotStorageInfo.time_unit != null) {
                i3 = TimeUnit.ADAPTER.encodedSizeWithTag(3, coldAndHotStorageInfo.time_unit);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (coldAndHotStorageInfo.time_text != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, coldAndHotStorageInfo.time_text);
            }
            return i6 + i4 + coldAndHotStorageInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ColdAndHotStorageInfo decode(ProtoReader protoReader) throws IOException {
            C18973a aVar = new C18973a();
            aVar.f46916a = false;
            aVar.f46917b = 0;
            aVar.f46918c = TimeUnit.YEAR;
            aVar.f46919d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46916a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46917b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f46918c = TimeUnit.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46919d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ColdAndHotStorageInfo coldAndHotStorageInfo) throws IOException {
            if (coldAndHotStorageInfo.is_need_cold_data != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, coldAndHotStorageInfo.is_need_cold_data);
            }
            if (coldAndHotStorageInfo.time_size != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, coldAndHotStorageInfo.time_size);
            }
            if (coldAndHotStorageInfo.time_unit != null) {
                TimeUnit.ADAPTER.encodeWithTag(protoWriter, 3, coldAndHotStorageInfo.time_unit);
            }
            if (coldAndHotStorageInfo.time_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, coldAndHotStorageInfo.time_text);
            }
            protoWriter.writeBytes(coldAndHotStorageInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ColdAndHotStorageInfo$a */
    public static final class C18973a extends Message.Builder<ColdAndHotStorageInfo, C18973a> {

        /* renamed from: a */
        public Boolean f46916a;

        /* renamed from: b */
        public Integer f46917b;

        /* renamed from: c */
        public TimeUnit f46918c;

        /* renamed from: d */
        public String f46919d;

        /* renamed from: a */
        public ColdAndHotStorageInfo build() {
            return new ColdAndHotStorageInfo(this.f46916a, this.f46917b, this.f46918c, this.f46919d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18973a newBuilder() {
        C18973a aVar = new C18973a();
        aVar.f46916a = this.is_need_cold_data;
        aVar.f46917b = this.time_size;
        aVar.f46918c = this.time_unit;
        aVar.f46919d = this.time_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ColdAndHotStorageInfo");
        StringBuilder sb = new StringBuilder();
        if (this.is_need_cold_data != null) {
            sb.append(", is_need_cold_data=");
            sb.append(this.is_need_cold_data);
        }
        if (this.time_size != null) {
            sb.append(", time_size=");
            sb.append(this.time_size);
        }
        if (this.time_unit != null) {
            sb.append(", time_unit=");
            sb.append(this.time_unit);
        }
        if (this.time_text != null) {
            sb.append(", time_text=");
            sb.append(this.time_text);
        }
        StringBuilder replace = sb.replace(0, 2, "ColdAndHotStorageInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ColdAndHotStorageInfo(Boolean bool, Integer num, TimeUnit timeUnit, String str) {
        this(bool, num, timeUnit, str, ByteString.EMPTY);
    }

    public ColdAndHotStorageInfo(Boolean bool, Integer num, TimeUnit timeUnit, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_need_cold_data = bool;
        this.time_size = num;
        this.time_unit = timeUnit;
        this.time_text = str;
    }
}
