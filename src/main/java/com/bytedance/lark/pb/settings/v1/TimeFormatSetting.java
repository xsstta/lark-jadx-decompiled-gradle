package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TimeFormatSetting extends Message<TimeFormatSetting, C19219a> {
    public static final ProtoAdapter<TimeFormatSetting> ADAPTER = new C19220b();
    public static final TimeFormat DEFAULT_TIME_FORMAT = TimeFormat.TWELVE_HOUR;
    private static final long serialVersionUID = 0;
    public final TimeFormat time_format;

    public enum TimeFormat implements WireEnum {
        UNKNOWN(0),
        TWELVE_HOUR(1),
        TWENTY_FOUR_HOUR(2);
        
        public static final ProtoAdapter<TimeFormat> ADAPTER = ProtoAdapter.newEnumAdapter(TimeFormat.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TimeFormat fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TWELVE_HOUR;
            }
            if (i != 2) {
                return null;
            }
            return TWENTY_FOUR_HOUR;
        }

        private TimeFormat(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.TimeFormatSetting$b */
    private static final class C19220b extends ProtoAdapter<TimeFormatSetting> {
        C19220b() {
            super(FieldEncoding.LENGTH_DELIMITED, TimeFormatSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(TimeFormatSetting timeFormatSetting) {
            int i;
            if (timeFormatSetting.time_format != null) {
                i = TimeFormat.ADAPTER.encodedSizeWithTag(1, timeFormatSetting.time_format);
            } else {
                i = 0;
            }
            return i + timeFormatSetting.unknownFields().size();
        }

        /* renamed from: a */
        public TimeFormatSetting decode(ProtoReader protoReader) throws IOException {
            C19219a aVar = new C19219a();
            aVar.f47393a = TimeFormat.TWELVE_HOUR;
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
                        aVar.f47393a = TimeFormat.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TimeFormatSetting timeFormatSetting) throws IOException {
            if (timeFormatSetting.time_format != null) {
                TimeFormat.ADAPTER.encodeWithTag(protoWriter, 1, timeFormatSetting.time_format);
            }
            protoWriter.writeBytes(timeFormatSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.TimeFormatSetting$a */
    public static final class C19219a extends Message.Builder<TimeFormatSetting, C19219a> {

        /* renamed from: a */
        public TimeFormat f47393a;

        /* renamed from: a */
        public TimeFormatSetting build() {
            return new TimeFormatSetting(this.f47393a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19219a newBuilder() {
        C19219a aVar = new C19219a();
        aVar.f47393a = this.time_format;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "TimeFormatSetting");
        StringBuilder sb = new StringBuilder();
        if (this.time_format != null) {
            sb.append(", time_format=");
            sb.append(this.time_format);
        }
        StringBuilder replace = sb.replace(0, 2, "TimeFormatSetting{");
        replace.append('}');
        return replace.toString();
    }

    public TimeFormatSetting(TimeFormat timeFormat) {
        this(timeFormat, ByteString.EMPTY);
    }

    public TimeFormatSetting(TimeFormat timeFormat, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time_format = timeFormat;
    }
}
