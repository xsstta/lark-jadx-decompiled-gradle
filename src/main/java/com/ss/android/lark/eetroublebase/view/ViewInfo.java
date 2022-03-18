package com.ss.android.lark.eetroublebase.view;

import com.ss.android.lark.eetroublebase.model.BaseModel;
import java.util.List;
import java.util.Map;

public class ViewInfo extends IgnoreModel {

    /* renamed from: k */
    public Map<String, Object> f95040k;

    /* renamed from: n */
    public String f95041n;

    /* renamed from: p */
    public Position f95042p;
    public String resId;
    public List<ViewInfo> subs;
    public Boolean visible;

    public static class Position extends BaseModel {

        /* renamed from: h */
        public int f95043h;

        /* renamed from: w */
        public int f95044w;

        /* renamed from: x */
        public int f95045x;

        /* renamed from: y */
        public int f95046y;
    }

    public boolean isSelfEmpty() {
        if (this.f95041n == null && this.visible == null && this.resId == null && this.f95042p == null && this.f95040k == null) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.empty_mark != null) {
            return this.empty_mark.booleanValue();
        }
        if (!isSelfEmpty()) {
            return markEmpty(false);
        }
        List<ViewInfo> list = this.subs;
        if (list != null) {
            for (ViewInfo viewInfo : list) {
                if (!viewInfo.isEmpty()) {
                    return markEmpty(false);
                }
            }
        }
        return markEmpty(true);
    }

    private boolean markEmpty(boolean z) {
        this.empty_mark = Boolean.valueOf(z);
        return z;
    }
}
