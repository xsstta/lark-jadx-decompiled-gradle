package com.bytedance.ee.bear.sheet.celldropdown;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class DropdownData implements NonProguard {
    private Map<String, String> colorMap;
    private boolean enableOptionColor;
    private boolean isMulti;
    private String[] options;
    private String textColor;
    private String[] values;

    /* renamed from: com.bytedance.ee.bear.sheet.celldropdown.DropdownData$a */
    public static class C11072a {

        /* renamed from: a */
        public String f29748a;

        /* renamed from: b */
        public boolean f29749b;

        /* renamed from: c */
        private String f29750c;

        public C11072a() {
        }

        /* renamed from: a */
        public String mo42208a() {
            return this.f29750c;
        }

        /* renamed from: b */
        public String mo42209b() {
            return this.f29748a;
        }

        /* renamed from: c */
        public boolean mo42210c() {
            return this.f29749b;
        }

        public int hashCode() {
            return Objects.hash(this.f29750c, this.f29748a, Boolean.valueOf(this.f29749b));
        }

        public String toString() {
            return "DropdownItem{color='" + this.f29750c + '\'' + ", option='" + this.f29748a + '\'' + ", isSelected=" + this.f29749b + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C11072a aVar = (C11072a) obj;
            if (this.f29749b != aVar.f29749b || !Objects.equals(this.f29750c, aVar.f29750c) || !Objects.equals(this.f29748a, aVar.f29748a)) {
                return false;
            }
            return true;
        }

        public C11072a(String str, boolean z) {
            this.f29748a = str;
            this.f29749b = z;
        }

        public C11072a(String str, String str2, boolean z) {
            this.f29750c = str;
            this.f29748a = str2;
            this.f29749b = z;
        }
    }

    public Map<String, String> getColorMap() {
        return this.colorMap;
    }

    public boolean getEnableOptionColor() {
        return this.enableOptionColor;
    }

    public String[] getOptions() {
        return this.options;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String[] getValues() {
        return this.values;
    }

    public boolean isEnableOptionColor() {
        return this.enableOptionColor;
    }

    public boolean isMulti() {
        return this.isMulti;
    }

    public C11072a[] parseToDropdownArray() {
        String[] strArr = this.options;
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        ArrayList<C11072a> arrayList = new ArrayList();
        if (this.colorMap == null || !this.enableOptionColor) {
            for (int i = 0; i < length; i++) {
                arrayList.add(new C11072a(this.options[i], false));
            }
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(new C11072a(this.colorMap.get(this.options[i2]), this.options[i2], false));
            }
        }
        HashSet hashSet = new HashSet(Arrays.asList(this.values));
        for (C11072a aVar : arrayList) {
            if (hashSet.contains(aVar.f29748a)) {
                aVar.f29749b = true;
            }
        }
        return (C11072a[]) arrayList.toArray(new C11072a[0]);
    }

    public String toString() {
        return "DropdownData{selectedOption='" + C13598b.m55197d(Arrays.toString(this.values)) + '\'' + "enableOptionColor= " + this.enableOptionColor + ", colors=" + this.colorMap + ", options=" + C13598b.m55197d(Arrays.toString(this.options)) + '}';
    }

    public void setColorMap(Map<String, String> map) {
        this.colorMap = map;
    }

    public void setEnableOptionColor(boolean z) {
        this.enableOptionColor = z;
    }

    public void setIsEnableOptionColor(boolean z) {
        setEnableOptionColor(z);
    }

    public void setMulti(boolean z) {
        this.isMulti = z;
    }

    public void setOptions(String[] strArr) {
        this.options = strArr;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public void setValues(String[] strArr) {
        this.values = strArr;
    }
}
