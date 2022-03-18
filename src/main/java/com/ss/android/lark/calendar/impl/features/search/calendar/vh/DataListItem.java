package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.util.List;

public class DataListItem {

    /* renamed from: a */
    private TYPE f82811a;

    /* renamed from: b */
    private Calendar f82812b;

    /* renamed from: c */
    private AbstractC30026d f82813c;

    /* renamed from: d */
    private String f82814d;

    /* renamed from: e */
    private List<DataListItem> f82815e;

    /* renamed from: f */
    private boolean f82816f;

    /* renamed from: g */
    private boolean f82817g;

    /* renamed from: h */
    private boolean f82818h;

    /* renamed from: i */
    private boolean f82819i;

    /* renamed from: j */
    private boolean f82820j;

    public enum TYPE {
        HEADER {
            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem.TYPE
            public int getIntValue() {
                return 0;
            }
        },
        SUB_HEADER {
            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem.TYPE
            public int getIntValue() {
                return 1;
            }
        },
        CELL {
            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem.TYPE
            public int getIntValue() {
                return 2;
            }
        },
        MORE {
            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem.TYPE
            public int getIntValue() {
                return 3;
            }
        },
        SUBSCRIBE {
            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem.TYPE
            public int getIntValue() {
                return 4;
            }
        },
        SUBSCRIBE_TITLE {
            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem.TYPE
            public int getIntValue() {
                return 5;
            }
        };

        public abstract int getIntValue();
    }

    /* renamed from: a */
    public Calendar mo118146a() {
        return this.f82812b;
    }

    /* renamed from: b */
    public AbstractC30026d mo118151b() {
        return this.f82813c;
    }

    /* renamed from: c */
    public TYPE mo118153c() {
        return this.f82811a;
    }

    /* renamed from: d */
    public String mo118154d() {
        return this.f82814d;
    }

    /* renamed from: e */
    public boolean mo118155e() {
        return this.f82816f;
    }

    /* renamed from: f */
    public List<DataListItem> mo118156f() {
        return this.f82815e;
    }

    /* renamed from: g */
    public boolean mo118157g() {
        return this.f82817g;
    }

    /* renamed from: h */
    public boolean mo118158h() {
        return this.f82820j;
    }

    /* renamed from: i */
    public boolean mo118159i() {
        return this.f82818h;
    }

    /* renamed from: j */
    public boolean mo118160j() {
        return this.f82819i;
    }

    /* renamed from: a */
    public void mo118147a(TYPE type) {
        this.f82811a = type;
    }

    /* renamed from: b */
    public void mo118152b(boolean z) {
        this.f82818h = z;
    }

    /* renamed from: a */
    public void mo118148a(Calendar calendar) {
        this.f82812b = calendar;
    }

    /* renamed from: a */
    public void mo118149a(String str) {
        this.f82814d = str;
    }

    /* renamed from: a */
    public void mo118150a(boolean z) {
        this.f82820j = z;
    }
}
