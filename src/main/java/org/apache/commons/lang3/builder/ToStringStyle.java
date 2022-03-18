package org.apache.commons.lang3.builder;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;

public abstract class ToStringStyle implements Serializable {
    public static final ToStringStyle DEFAULT_STYLE = new C69859a();
    public static final ToStringStyle JSON_STYLE = new C69860b();
    public static final ToStringStyle MULTI_LINE_STYLE = new C69861c();
    public static final ToStringStyle NO_CLASS_NAME_STYLE = new C69862d();
    public static final ToStringStyle NO_FIELD_NAMES_STYLE = new C69863e();
    private static final ThreadLocal<WeakHashMap<Object, Object>> REGISTRY = new ThreadLocal<>();
    public static final ToStringStyle SHORT_PREFIX_STYLE = new C69864f();
    public static final ToStringStyle SIMPLE_STYLE = new C69865g();
    private static final long serialVersionUID = -2587890625525655916L;
    private boolean arrayContentDetail = true;
    private String arrayEnd = "}";
    private String arraySeparator = ",";
    private String arrayStart = "{";
    private String contentEnd = "]";
    private String contentStart = "[";
    private boolean defaultFullDetail = true;
    private String fieldNameValueSeparator = ContainerUtils.KEY_VALUE_DELIMITER;
    private String fieldSeparator = ",";
    private boolean fieldSeparatorAtEnd;
    private boolean fieldSeparatorAtStart;
    private String nullText = "<null>";
    private String sizeEndText = ">";
    private String sizeStartText = "<size=";
    private String summaryObjectEndText = ">";
    private String summaryObjectStartText = "<";
    private boolean useClassName = true;
    private boolean useFieldNames = true;
    private boolean useIdentityHashCode = true;
    private boolean useShortClassName;

    /* renamed from: org.apache.commons.lang3.builder.ToStringStyle$a */
    private static final class C69859a extends ToStringStyle {
        private static final long serialVersionUID = 1;

        C69859a() {
        }

        private Object readResolve() {
            return ToStringStyle.DEFAULT_STYLE;
        }
    }

    /* renamed from: org.apache.commons.lang3.builder.ToStringStyle$b */
    private static final class C69860b extends ToStringStyle {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return ToStringStyle.JSON_STYLE;
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, objArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, sArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, zArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        C69860b() {
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setContentStart("{");
            setContentEnd("}");
            setArrayStart("[");
            setArrayEnd("]");
            setFieldSeparator(",");
            setFieldNameValueSeparator(":");
            setNullText("null");
            setSummaryObjectStartText("\"<");
            setSummaryObjectEndText(">\"");
            setSizeStartText("\"<size=");
            setSizeEndText(">\"");
        }

        /* renamed from: a */
        private boolean m268110a(String str) {
            if (!str.startsWith(getArrayStart()) || !str.startsWith(getArrayEnd())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private boolean m268111b(String str) {
            if (!str.startsWith(getContentStart()) || !str.endsWith(getContentEnd())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m268109a(StringBuffer stringBuffer, String str) {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            stringBuffer.append('\"');
        }

        /* access modifiers changed from: protected */
        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendFieldStart(StringBuffer stringBuffer, String str) {
            if (str != null) {
                ToStringStyle.super.appendFieldStart(stringBuffer, "\"" + str + "\"");
                return;
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        /* access modifiers changed from: protected */
        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendDetail(StringBuffer stringBuffer, String str, char c) {
            m268109a(stringBuffer, String.valueOf(c));
        }

        /* access modifiers changed from: protected */
        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                appendNullText(stringBuffer, str);
            } else if ((obj instanceof String) || (obj instanceof Character)) {
                m268109a(stringBuffer, obj.toString());
            } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                stringBuffer.append(obj);
            } else {
                String obj2 = obj.toString();
                if (m268111b(obj2) || m268110a(obj2)) {
                    stringBuffer.append(obj);
                } else {
                    appendDetail(stringBuffer, str, obj2);
                }
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, obj, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, bArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, cArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, dArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, fArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, iArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (isFullDetail(bool)) {
                ToStringStyle.super.append(stringBuffer, str, jArr, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }
    }

    /* renamed from: org.apache.commons.lang3.builder.ToStringStyle$c */
    private static final class C69861c extends ToStringStyle {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return ToStringStyle.MULTI_LINE_STYLE;
        }

        C69861c() {
            setContentStart("[");
            setFieldSeparator(System.lineSeparator() + "  ");
            setFieldSeparatorAtStart(true);
            setContentEnd(System.lineSeparator() + "]");
        }
    }

    /* renamed from: org.apache.commons.lang3.builder.ToStringStyle$d */
    private static final class C69862d extends ToStringStyle {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return ToStringStyle.NO_CLASS_NAME_STYLE;
        }

        C69862d() {
            setUseClassName(false);
            setUseIdentityHashCode(false);
        }
    }

    /* renamed from: org.apache.commons.lang3.builder.ToStringStyle$e */
    private static final class C69863e extends ToStringStyle {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return ToStringStyle.NO_FIELD_NAMES_STYLE;
        }

        C69863e() {
            setUseFieldNames(false);
        }
    }

    /* renamed from: org.apache.commons.lang3.builder.ToStringStyle$f */
    private static final class C69864f extends ToStringStyle {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return ToStringStyle.SHORT_PREFIX_STYLE;
        }

        C69864f() {
            setUseShortClassName(true);
            setUseIdentityHashCode(false);
        }
    }

    /* renamed from: org.apache.commons.lang3.builder.ToStringStyle$g */
    private static final class C69865g extends ToStringStyle {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return ToStringStyle.SIMPLE_STYLE;
        }

        C69865g() {
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setUseFieldNames(false);
            setContentStart("");
            setContentEnd("");
        }
    }

    /* access modifiers changed from: protected */
    public String getArrayEnd() {
        return this.arrayEnd;
    }

    /* access modifiers changed from: protected */
    public String getArraySeparator() {
        return this.arraySeparator;
    }

    /* access modifiers changed from: protected */
    public String getArrayStart() {
        return this.arrayStart;
    }

    /* access modifiers changed from: protected */
    public String getContentEnd() {
        return this.contentEnd;
    }

    /* access modifiers changed from: protected */
    public String getContentStart() {
        return this.contentStart;
    }

    /* access modifiers changed from: protected */
    public String getFieldNameValueSeparator() {
        return this.fieldNameValueSeparator;
    }

    /* access modifiers changed from: protected */
    public String getFieldSeparator() {
        return this.fieldSeparator;
    }

    /* access modifiers changed from: protected */
    public String getNullText() {
        return this.nullText;
    }

    /* access modifiers changed from: protected */
    public String getSizeEndText() {
        return this.sizeEndText;
    }

    /* access modifiers changed from: protected */
    public String getSizeStartText() {
        return this.sizeStartText;
    }

    /* access modifiers changed from: protected */
    public String getSummaryObjectEndText() {
        return this.summaryObjectEndText;
    }

    /* access modifiers changed from: protected */
    public String getSummaryObjectStartText() {
        return this.summaryObjectStartText;
    }

    /* access modifiers changed from: protected */
    public boolean isArrayContentDetail() {
        return this.arrayContentDetail;
    }

    /* access modifiers changed from: protected */
    public boolean isDefaultFullDetail() {
        return this.defaultFullDetail;
    }

    /* access modifiers changed from: protected */
    public boolean isFieldSeparatorAtEnd() {
        return this.fieldSeparatorAtEnd;
    }

    /* access modifiers changed from: protected */
    public boolean isFieldSeparatorAtStart() {
        return this.fieldSeparatorAtStart;
    }

    /* access modifiers changed from: protected */
    public boolean isUseClassName() {
        return this.useClassName;
    }

    /* access modifiers changed from: protected */
    public boolean isUseFieldNames() {
        return this.useFieldNames;
    }

    /* access modifiers changed from: protected */
    public boolean isUseIdentityHashCode() {
        return this.useIdentityHashCode;
    }

    /* access modifiers changed from: protected */
    public boolean isUseShortClassName() {
        return this.useShortClassName;
    }

    public void append(StringBuffer stringBuffer, String str, boolean z) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, z);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (objArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, objArr);
        } else {
            appendSummary(stringBuffer, str, objArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            if (obj == null) {
                appendNullText(stringBuffer, str);
            } else {
                appendInternal(stringBuffer, str, obj, this.arrayContentDetail);
            }
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (jArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, jArr);
        } else {
            appendSummary(stringBuffer, str, jArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (iArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, iArr);
        } else {
            appendSummary(stringBuffer, str, iArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (sArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, sArr);
        } else {
            appendSummary(stringBuffer, str, sArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (bArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, bArr);
        } else {
            appendSummary(stringBuffer, str, bArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (cArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, cArr);
        } else {
            appendSummary(stringBuffer, str, cArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (dArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, dArr);
        } else {
            appendSummary(stringBuffer, str, dArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (fArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, fArr);
        } else {
            appendSummary(stringBuffer, str, fArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (zArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, zArr);
        } else {
            appendSummary(stringBuffer, str, zArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, boolean[] zArr) {
        appendSummarySize(stringBuffer, str, zArr.length);
    }

    static Map<Object, Object> getRegistry() {
        return REGISTRY.get();
    }

    protected ToStringStyle() {
    }

    /* access modifiers changed from: protected */
    public void setArrayContentDetail(boolean z) {
        this.arrayContentDetail = z;
    }

    /* access modifiers changed from: protected */
    public void setDefaultFullDetail(boolean z) {
        this.defaultFullDetail = z;
    }

    /* access modifiers changed from: protected */
    public void setFieldSeparatorAtEnd(boolean z) {
        this.fieldSeparatorAtEnd = z;
    }

    /* access modifiers changed from: protected */
    public void setFieldSeparatorAtStart(boolean z) {
        this.fieldSeparatorAtStart = z;
    }

    /* access modifiers changed from: protected */
    public void setUseClassName(boolean z) {
        this.useClassName = z;
    }

    /* access modifiers changed from: protected */
    public void setUseFieldNames(boolean z) {
        this.useFieldNames = z;
    }

    /* access modifiers changed from: protected */
    public void setUseIdentityHashCode(boolean z) {
        this.useIdentityHashCode = z;
    }

    /* access modifiers changed from: protected */
    public void setUseShortClassName(boolean z) {
        this.useShortClassName = z;
    }

    /* access modifiers changed from: protected */
    public void appendContentEnd(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentEnd);
    }

    /* access modifiers changed from: protected */
    public void appendContentStart(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentStart);
    }

    /* access modifiers changed from: protected */
    public void appendFieldSeparator(StringBuffer stringBuffer) {
        stringBuffer.append(this.fieldSeparator);
    }

    /* access modifiers changed from: protected */
    public String getShortClassName(Class<?> cls) {
        return ClassUtils.m268044a(cls);
    }

    /* access modifiers changed from: protected */
    public void setArrayEnd(String str) {
        if (str == null) {
            str = "";
        }
        this.arrayEnd = str;
    }

    /* access modifiers changed from: protected */
    public void setArraySeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.arraySeparator = str;
    }

    /* access modifiers changed from: protected */
    public void setArrayStart(String str) {
        if (str == null) {
            str = "";
        }
        this.arrayStart = str;
    }

    /* access modifiers changed from: protected */
    public void setContentEnd(String str) {
        if (str == null) {
            str = "";
        }
        this.contentEnd = str;
    }

    /* access modifiers changed from: protected */
    public void setContentStart(String str) {
        if (str == null) {
            str = "";
        }
        this.contentStart = str;
    }

    /* access modifiers changed from: protected */
    public void setFieldNameValueSeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.fieldNameValueSeparator = str;
    }

    /* access modifiers changed from: protected */
    public void setFieldSeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.fieldSeparator = str;
    }

    /* access modifiers changed from: protected */
    public void setNullText(String str) {
        if (str == null) {
            str = "";
        }
        this.nullText = str;
    }

    /* access modifiers changed from: protected */
    public void setSizeEndText(String str) {
        if (str == null) {
            str = "";
        }
        this.sizeEndText = str;
    }

    /* access modifiers changed from: protected */
    public void setSizeStartText(String str) {
        if (str == null) {
            str = "";
        }
        this.sizeStartText = str;
    }

    /* access modifiers changed from: protected */
    public void setSummaryObjectEndText(String str) {
        if (str == null) {
            str = "";
        }
        this.summaryObjectEndText = str;
    }

    /* access modifiers changed from: protected */
    public void setSummaryObjectStartText(String str) {
        if (str == null) {
            str = "";
        }
        this.summaryObjectStartText = str;
    }

    static boolean isRegistered(Object obj) {
        Map<Object, Object> registry = getRegistry();
        if (registry == null || !registry.containsKey(obj)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isFullDetail(Boolean bool) {
        if (bool == null) {
            return this.defaultFullDetail;
        }
        return bool.booleanValue();
    }

    static void register(Object obj) {
        if (obj != null) {
            if (getRegistry() == null) {
                REGISTRY.set(new WeakHashMap<>());
            }
            getRegistry().put(obj, null);
        }
    }

    static void unregister(Object obj) {
        Map<Object, Object> registry;
        if (obj != null && (registry = getRegistry()) != null) {
            registry.remove(obj);
            if (registry.isEmpty()) {
                REGISTRY.remove();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeLastFieldSeparator(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.fieldSeparator.length();
        if (length > 0 && length2 > 0 && length >= length2) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    z = true;
                    break;
                } else if (stringBuffer.charAt((length - 1) - i) != this.fieldSeparator.charAt((length2 - 1) - i)) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                stringBuffer.setLength(length - length2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void appendFieldEnd(StringBuffer stringBuffer, String str) {
        appendFieldSeparator(stringBuffer);
    }

    public void appendSuper(StringBuffer stringBuffer, String str) {
        appendToString(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendNullText(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.nullText);
    }

    public void appendEnd(StringBuffer stringBuffer, Object obj) {
        if (!this.fieldSeparatorAtEnd) {
            removeLastFieldSeparator(stringBuffer);
        }
        appendContentEnd(stringBuffer);
        unregister(obj);
    }

    /* access modifiers changed from: protected */
    public void appendFieldStart(StringBuffer stringBuffer, String str) {
        if (this.useFieldNames && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.fieldNameValueSeparator);
        }
    }

    /* access modifiers changed from: protected */
    public void appendIdentityHashCode(StringBuffer stringBuffer, Object obj) {
        if (isUseIdentityHashCode() && obj != null) {
            register(obj);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public void appendStart(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            appendClassName(stringBuffer, obj);
            appendIdentityHashCode(stringBuffer, obj);
            appendContentStart(stringBuffer);
            if (this.fieldSeparatorAtStart) {
                appendFieldSeparator(stringBuffer);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void appendClassName(StringBuffer stringBuffer, Object obj) {
        if (this.useClassName && obj != null) {
            register(obj);
            if (this.useShortClassName) {
                stringBuffer.append(getShortClassName(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
    }

    public void appendToString(StringBuffer stringBuffer, String str) {
        int indexOf;
        int lastIndexOf;
        if (str != null && (indexOf = str.indexOf(this.contentStart) + this.contentStart.length()) != (lastIndexOf = str.lastIndexOf(this.contentEnd)) && indexOf >= 0 && lastIndexOf >= 0) {
            if (this.fieldSeparatorAtStart) {
                removeLastFieldSeparator(stringBuffer);
            }
            stringBuffer.append((CharSequence) str, indexOf, lastIndexOf);
            appendFieldSeparator(stringBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void appendCyclicObject(StringBuffer stringBuffer, String str, Object obj) {
        ObjectUtils.m268053a(stringBuffer, obj);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, byte b) {
        stringBuffer.append((int) b);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, char c) {
        stringBuffer.append(c);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, byte[] bArr) {
        appendSummarySize(stringBuffer, str, bArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, byte b) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, b);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, char[] cArr) {
        appendSummarySize(stringBuffer, str, cArr.length);
    }

    /* access modifiers changed from: protected */
    public void appendSummarySize(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.sizeStartText);
        stringBuffer.append(i);
        stringBuffer.append(this.sizeEndText);
    }

    public void append(StringBuffer stringBuffer, String str, char c) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, c);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.summaryObjectStartText);
        stringBuffer.append(getShortClassName(obj.getClass()));
        stringBuffer.append(this.summaryObjectEndText);
    }

    public void append(StringBuffer stringBuffer, String str, double d) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, d);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, double[] dArr) {
        appendSummarySize(stringBuffer, str, dArr.length);
    }

    /* access modifiers changed from: protected */
    public void reflectionAppendArrayDetail(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.arrayStart);
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            if (obj2 == null) {
                appendNullText(stringBuffer, str);
            } else {
                appendInternal(stringBuffer, str, obj2, this.arrayContentDetail);
            }
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, float f) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, f);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, float[] fArr) {
        appendSummarySize(stringBuffer, str, fArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, int i) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, i);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, int[] iArr) {
        appendSummarySize(stringBuffer, str, iArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, long j) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, j);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, long[] jArr) {
        appendSummarySize(stringBuffer, str, jArr.length);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, Object[] objArr) {
        appendSummarySize(stringBuffer, str, objArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, short s) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, s);
        appendFieldEnd(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void appendDetail(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append((int) s);
    }

    /* access modifiers changed from: protected */
    public void appendSummary(StringBuffer stringBuffer, String str, short[] sArr) {
        appendSummarySize(stringBuffer, str, sArr.length);
    }

    /* access modifiers changed from: protected */
    public void appendInternal(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        if (!isRegistered(obj) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            register(obj);
            try {
                if (obj instanceof Collection) {
                    if (z) {
                        appendDetail(stringBuffer, str, (Collection) obj);
                    } else {
                        appendSummarySize(stringBuffer, str, ((Collection) obj).size());
                    }
                } else if (obj instanceof Map) {
                    if (z) {
                        appendDetail(stringBuffer, str, (Map) obj);
                    } else {
                        appendSummarySize(stringBuffer, str, ((Map) obj).size());
                    }
                } else if (obj instanceof long[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (long[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (long[]) obj);
                    }
                } else if (obj instanceof int[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (int[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (int[]) obj);
                    }
                } else if (obj instanceof short[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (short[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (short[]) obj);
                    }
                } else if (obj instanceof byte[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (byte[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (byte[]) obj);
                    }
                } else if (obj instanceof char[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (char[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (char[]) obj);
                    }
                } else if (obj instanceof double[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (double[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (double[]) obj);
                    }
                } else if (obj instanceof float[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (float[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (float[]) obj);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z) {
                        appendDetail(stringBuffer, str, (boolean[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (boolean[]) obj);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z) {
                        appendDetail(stringBuffer, str, (Object[]) obj);
                    } else {
                        appendSummary(stringBuffer, str, (Object[]) obj);
                    }
                } else if (z) {
                    appendDetail(stringBuffer, str, obj);
                } else {
                    appendSummary(stringBuffer, str, obj);
                }
            } finally {
                unregister(obj);
            }
        } else {
            appendCyclicObject(stringBuffer, str, obj);
        }
    }

    public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (obj == null) {
            appendNullText(stringBuffer, str);
        } else {
            appendInternal(stringBuffer, str, obj, isFullDetail(bool));
        }
        appendFieldEnd(stringBuffer, str);
    }
}
