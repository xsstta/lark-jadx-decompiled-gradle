package com.bytedance.ee.bear.sheet.toolbar2;

import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Objects;

public class SheetBlockToolbarV2 extends ToolbarV2 implements NonProguard {
    private Data data;
    private BearUrl url;

    /* access modifiers changed from: private */
    public static class Data implements NonProguard {
        public Input input;

        private Data() {
        }

        public Input getInput() {
            return this.input;
        }

        public int hashCode() {
            return Objects.hash(this.input);
        }

        public String toString() {
            return "Data{input=" + this.input + '}';
        }

        public void setInput(Input input2) {
            this.input = input2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.input, ((Data) obj).input);
        }
    }

    public static class Input implements NonProguard {
        private List<BaseSegment> segments;
        public SegmentStyle style;
        private String token;
        public String value;

        public List<BaseSegment> getSegments() {
            return this.segments;
        }

        public String getToken() {
            String str = this.token;
            if (str == null) {
                return "";
            }
            return str;
        }

        public int hashCode() {
            int i;
            SegmentStyle segmentStyle = this.style;
            int i2 = 0;
            if (segmentStyle != null) {
                i = segmentStyle.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            if (getSegments() != null) {
                i2 = getSegments().hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            return "Input{style=" + this.style + ", segments=" + this.segments + '}';
        }

        public void setSegments(List<BaseSegment> list) {
            this.segments = list;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            if (!Objects.equals(this.style, input.style)) {
                return false;
            }
            if (getSegments() != null) {
                return getSegments().equals(input.getSegments());
            }
            if (input.getSegments() == null) {
                return true;
            }
            return false;
        }
    }

    public SheetBlockToolbarV2() {
    }

    public Data getData() {
        return this.data;
    }

    public BearUrl getUrl() {
        return this.url;
    }

    public Input getInput() {
        Data data2 = this.data;
        if (data2 != null) {
            return data2.getInput();
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.url);
    }

    public void parseSegments() {
        Data data2 = this.data;
        if (data2 != null && data2.input != null) {
            Input input = this.data.input;
            input.setSegments(C11211a.m46611a(input.value));
        }
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public void setInput(Input input) {
        Data data2 = this.data;
        if (data2 != null && data2.getInput() != null) {
            this.data.setInput(input);
        }
    }

    public SheetBlockToolbarV2(ToolbarV2 toolbarV2) {
        setItems(toolbarV2.getItems());
        setShowingItemId(toolbarV2.getShowingItemId());
        setType(toolbarV2.getType());
    }

    public void setUrl(BearUrl bearUrl) {
        this.url = bearUrl;
        Data data2 = this.data;
        if (data2 != null && data2.getInput() != null) {
            this.data.getInput().setToken(bearUrl.f17447b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SheetBlockToolbarV2 sheetBlockToolbarV2 = (SheetBlockToolbarV2) obj;
        if (!Objects.equals(this.data, sheetBlockToolbarV2.data) || !Objects.equals(this.url, sheetBlockToolbarV2.url)) {
            return false;
        }
        return true;
    }
}
