package com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONObject;

public class Highlight implements NonProguard {
    private ColorItem[] background;
    private int backgroundSpanCount;
    private ColorItem clear;
    private boolean isShow;
    private ColorItem reset;
    private Selected selected;
    private ColorItem[] text;
    private int textColorSpanCount;

    public static class CallbackEntity implements NonProguard {
        private ColorItem background;
        private ColorItem clear;
        private ColorItem reset;
        private ColorItem text;

        public ColorItem getBackground() {
            return this.background;
        }

        public ColorItem getClear() {
            return this.clear;
        }

        public ColorItem getReset() {
            return this.reset;
        }

        public ColorItem getText() {
            return this.text;
        }

        public String toString() {
            return "CallbackEntity{background=" + this.background + ", text=" + this.text + ", clear=" + this.clear + ", reset=" + this.reset + '}';
        }

        public void setBackground(ColorItem colorItem) {
            this.background = colorItem;
        }

        public void setClear(ColorItem colorItem) {
            this.clear = colorItem;
        }

        public void setReset(ColorItem colorItem) {
            this.reset = colorItem;
        }

        public void setText(ColorItem colorItem) {
            this.text = colorItem;
        }
    }

    public static class ColorItem implements NonProguard {
        private String key;
        private boolean showFontIcon = true;
        public String type;
        private ColorRgba value;

        public String getType() {
            return this.type;
        }

        public ColorRgba getValue() {
            return this.value;
        }

        public boolean isShowFontIcon() {
            return this.showFontIcon;
        }

        public ColorItem() {
        }

        public String getKey() {
            String str = this.key;
            if (str == null) {
                return "";
            }
            return str;
        }

        public String toShortString() {
            if (this.value.f16450a == 1.0f) {
                return "rgb(" + this.value.f16453r + "," + this.value.f16452g + "," + this.value.f16451b + ')';
            }
            return "rgba(" + this.value.f16453r + "," + this.value.f16452g + "," + this.value.f16451b + "," + this.value.f16450a + ')';
        }

        public String toString() {
            return "ColorItem{type='" + this.type + '\'' + ", key='" + this.key + '\'' + ", showFontIcon='" + this.showFontIcon + '\'' + ", value='" + this.value + '\'' + '}';
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setShowFontIcon(boolean z) {
            this.showFontIcon = z;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setValue(ColorRgba colorRgba) {
            this.value = colorRgba;
        }

        public ColorItem(ColorRgba colorRgba) {
            this.value = colorRgba;
        }

        public static String toJson(ColorItem colorItem) {
            String str;
            try {
                str = JSON.toJSONString(colorItem);
            } catch (Throwable th) {
                C13479a.m54761a("ColorItem", th);
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }

        public static ColorItem fromJson(String str) {
            ColorItem colorItem;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString(ShareHitPoint.f121869d, "");
                String optString2 = jSONObject.optString("key", "");
                boolean optBoolean = jSONObject.optBoolean("showFontIcon", true);
                ColorRgba colorRgba = new ColorRgba();
                if (!TextUtils.isEmpty(jSONObject.optString("value"))) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString("value"));
                    colorRgba.setR(jSONObject2.optInt("r"));
                    colorRgba.setG(jSONObject2.optInt("g"));
                    colorRgba.setB(jSONObject2.optInt(C63954b.f161494a));
                    colorRgba.setA((float) jSONObject2.optDouble(AbstractC60044a.f149675a));
                }
                colorItem = new ColorItem(optString, optString2, optBoolean, colorRgba);
            } catch (Throwable th) {
                C13479a.m54761a("ColorItem", th);
                colorItem = null;
            }
            if (colorItem == null) {
                return new ColorItem("background", "", true, new ColorRgba());
            }
            return colorItem;
        }

        public ColorItem(String str, String str2, boolean z, ColorRgba colorRgba) {
            this.type = str;
            this.key = str2;
            this.showFontIcon = z;
            this.value = colorRgba;
        }
    }

    public static class ColorRgba implements NonProguard {

        /* renamed from: a */
        public float f16450a;

        /* renamed from: b */
        public int f16451b;

        /* renamed from: g */
        public int f16452g;
        private String key;

        /* renamed from: r */
        public int f16453r;

        public ColorRgba() {
        }

        public float getA() {
            return this.f16450a;
        }

        public int getB() {
            return this.f16451b;
        }

        public int getG() {
            return this.f16452g;
        }

        public String getKey() {
            return this.key;
        }

        public int getR() {
            return this.f16453r;
        }

        public String toShortString() {
            if (this.f16450a == 1.0f) {
                return "rgb()";
            }
            return "rgba()";
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f16453r), Integer.valueOf(this.f16452g), Integer.valueOf(this.f16451b), Float.valueOf(this.f16450a));
        }

        public String toString() {
            return "ColorRgba{r=" + this.f16453r + ", g=" + this.f16452g + ", b=" + this.f16451b + ", a=" + this.f16450a + ", key=" + this.key + '}';
        }

        public void setA(float f) {
            this.f16450a = f;
        }

        public void setB(int i) {
            this.f16451b = i;
        }

        public void setG(int i) {
            this.f16452g = i;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setR(int i) {
            this.f16453r = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ColorRgba colorRgba = (ColorRgba) obj;
            if (this.f16453r == colorRgba.f16453r && this.f16452g == colorRgba.f16452g && this.f16451b == colorRgba.f16451b && this.key.equals(colorRgba.key) && Float.compare(colorRgba.f16450a, this.f16450a) == 0) {
                return true;
            }
            return false;
        }

        public ColorRgba(int i, int i2, int i3, float f) {
            this.f16453r = i;
            this.f16452g = i2;
            this.f16451b = i3;
            this.f16450a = f;
        }

        public ColorRgba(int i, int i2, int i3, float f, String str) {
            this(i, i2, i3, f);
            this.key = str;
        }
    }

    public static class Selected implements NonProguard {
        private ColorItem background;
        private ColorItem text;

        public ColorItem getBackground() {
            return this.background;
        }

        public ColorItem getText() {
            return this.text;
        }

        public String toString() {
            return "Selected{background=" + this.background + ", text=" + this.text + '}';
        }

        public void setBackground(ColorItem colorItem) {
            this.background = colorItem;
        }

        public void setText(ColorItem colorItem) {
            this.text = colorItem;
        }

        public static Selected fromJson(String str) {
            Selected selected = new Selected();
            try {
                return (Selected) JSON.parseObject(str, Selected.class);
            } catch (Exception e) {
                C13479a.m54761a("Selected", e);
                return selected;
            }
        }
    }

    public ColorItem[] getBackground() {
        return this.background;
    }

    public int getBackgroundSpanCount() {
        return this.backgroundSpanCount;
    }

    public ColorItem getClear() {
        return this.clear;
    }

    public ColorItem getReset() {
        return this.reset;
    }

    public Selected getSelected() {
        return this.selected;
    }

    public ColorItem[] getText() {
        return this.text;
    }

    public int getTextColorSpanCount() {
        return this.textColorSpanCount;
    }

    public boolean isShow() {
        return this.isShow;
    }

    private void setClearItemType() {
        ColorItem colorItem = this.clear;
        if (colorItem != null) {
            colorItem.type = "clear";
        }
    }

    public void ensureItemType() {
        setTextItemType();
        setBackgroundItemType();
        setClearItemType();
    }

    private void setBackgroundItemType() {
        ColorItem[] colorItemArr = this.background;
        if (!(colorItemArr == null || colorItemArr.length == 0)) {
            for (ColorItem colorItem : colorItemArr) {
                colorItem.type = "background";
            }
        }
    }

    private void setTextItemType() {
        ColorItem[] colorItemArr = this.text;
        if (!(colorItemArr == null || colorItemArr.length == 0)) {
            for (ColorItem colorItem : colorItemArr) {
                colorItem.type = "text";
            }
        }
    }

    public String toString() {
        return "Highlight{text=" + Arrays.toString(this.text) + ", background=" + Arrays.toString(this.background) + ", selected=" + this.selected + ", clear=" + this.clear + ", reset=" + this.reset + ", isShow=" + this.isShow + '}';
    }

    public void setBackground(ColorItem[] colorItemArr) {
        this.background = colorItemArr;
    }

    public void setBackgroundSpanCount(int i) {
        this.backgroundSpanCount = i;
    }

    public void setClear(ColorItem colorItem) {
        this.clear = colorItem;
    }

    public void setReset(ColorItem colorItem) {
        this.reset = colorItem;
    }

    public void setSelected(Selected selected2) {
        this.selected = selected2;
    }

    public void setShow(boolean z) {
        this.isShow = z;
    }

    public void setText(ColorItem[] colorItemArr) {
        this.text = colorItemArr;
    }

    public void setTextColorSpanCount(int i) {
        this.textColorSpanCount = i;
    }
}
