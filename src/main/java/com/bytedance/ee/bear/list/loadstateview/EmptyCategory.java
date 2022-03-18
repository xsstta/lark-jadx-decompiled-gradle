package com.bytedance.ee.bear.list.loadstateview;

import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import java.util.Map;

public class EmptyCategory {

    /* renamed from: a */
    public static final EmptyCategory f23237a = new EmptyCategory("pin", Mode.NORMAL);

    /* renamed from: b */
    public static final EmptyCategory f23238b = new EmptyCategory("recent", Mode.NORMAL);

    /* renamed from: c */
    public static final EmptyCategory f23239c = new EmptyCategory("recent", Mode.FILTER);

    /* renamed from: d */
    public static final EmptyCategory f23240d = new EmptyCategory("myspace", Mode.NORMAL);

    /* renamed from: e */
    public static final EmptyCategory f23241e = new EmptyCategory("myspace", Mode.FILTER);

    /* renamed from: f */
    public static final EmptyCategory f23242f = new EmptyCategory("share", Mode.NORMAL);

    /* renamed from: g */
    public static final EmptyCategory f23243g = new EmptyCategory("favorite", Mode.NORMAL);

    /* renamed from: h */
    public static final EmptyCategory f23244h = new EmptyCategory("favorite", Mode.FILTER);

    /* renamed from: i */
    public static final EmptyCategory f23245i = new EmptyCategory("offline", Mode.NORMAL);

    /* renamed from: j */
    public static final EmptyCategory f23246j = new EmptyCategory("folder", Mode.NORMAL);

    /* renamed from: k */
    public static final EmptyCategory f23247k = new EmptyCategory("folder", Mode.READONLY);

    /* renamed from: l */
    public static final EmptyCategory f23248l = new EmptyCategory("folder_select", Mode.NORMAL);

    /* renamed from: m */
    public static final EmptyCategory f23249m = new EmptyCategory("wiki", Mode.NORMAL);

    /* renamed from: n */
    public static final EmptyCategory f23250n = new EmptyCategory("template", Mode.NORMAL);

    /* renamed from: o */
    public static final EmptyCategory f23251o = new EmptyCategory("systemp", Mode.NORMAL);

    /* renamed from: p */
    public static final EmptyCategory f23252p = new EmptyCategory("custemp", Mode.NORMAL);

    /* renamed from: q */
    public static final EmptyCategory f23253q = new EmptyCategory("custemp_v2", Mode.NORMAL);

    /* renamed from: r */
    public static final EmptyCategory f23254r = new EmptyCategory("single_category_temp", Mode.NORMAL);

    /* renamed from: s */
    public static final EmptyCategory f23255s = new EmptyCategory("bustemp", Mode.NORMAL);

    /* renamed from: t */
    public static final EmptyCategory f23256t = new EmptyCategory("searchtemp", Mode.NORMAL);

    /* renamed from: u */
    public static final EmptyCategory f23257u = new EmptyCategory("unknow", Mode.NORMAL);

    /* renamed from: v */
    private final String f23258v;

    /* renamed from: w */
    private final Mode f23259w;

    public enum Mode {
        NORMAL("normal"),
        FILTER("filter"),
        READONLY("readonly");
        
        private String modeName;

        public String getModeName() {
            return this.modeName;
        }

        public void setModeName(String str) {
            this.modeName = str;
        }

        private Mode(String str) {
            this.modeName = str;
        }
    }

    /* renamed from: a */
    public LoadStateView.C8571c mo33442a(Map<String, Map<String, LoadStateView.C8571c>> map) {
        Map<String, LoadStateView.C8571c> map2 = map.get(this.f23258v);
        if (map2 == null) {
            return null;
        }
        return map2.get(this.f23259w.getModeName());
    }

    public EmptyCategory(String str, Mode mode) {
        this.f23258v = str;
        this.f23259w = mode;
    }
}
