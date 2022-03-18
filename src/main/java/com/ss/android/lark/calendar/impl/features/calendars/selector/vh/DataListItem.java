package com.ss.android.lark.calendar.impl.features.calendars.selector.vh;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.List;

public class DataListItem {

    /* renamed from: a */
    private TYPE f76163a;

    /* renamed from: b */
    private Calendar f76164b;

    /* renamed from: c */
    private String f76165c;

    /* renamed from: d */
    private String f76166d;

    /* renamed from: e */
    private boolean f76167e;

    /* renamed from: f */
    private boolean f76168f;

    /* renamed from: g */
    private boolean f76169g;

    /* renamed from: h */
    private boolean f76170h;

    /* renamed from: i */
    private boolean f76171i;

    /* renamed from: j */
    private ArrayList<Calendar> f76172j = new ArrayList<>();

    public enum TYPE {
        TITLE {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 1;
            }
        },
        CELL {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 2;
            }
        },
        MORE {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 3;
            }
        },
        SUBSCRIBE {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 4;
            }
        },
        SUBSCRIBE_TITLE {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 5;
            }
        },
        ACC_MANAGER {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 6;
            }
        },
        VIEW_SWITCH {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 7;
            }
        },
        ADD_CALENDAR {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 8;
            }
        },
        SUBSCRIBE_CALENDAR {
            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem.TYPE
            public int getIntValue() {
                return 9;
            }
        };

        public abstract int getIntValue();
    }

    /* renamed from: o */
    public Calendar mo109830o() {
        return this.f76164b;
    }

    /* renamed from: r */
    public TYPE mo109833r() {
        return this.f76163a;
    }

    /* renamed from: s */
    public String mo109834s() {
        return this.f76166d;
    }

    /* renamed from: t */
    public boolean mo109835t() {
        return this.f76167e;
    }

    /* renamed from: u */
    public boolean mo109836u() {
        return this.f76168f;
    }

    /* renamed from: v */
    public boolean mo109837v() {
        return this.f76171i;
    }

    /* renamed from: w */
    public boolean mo109838w() {
        return this.f76169g;
    }

    /* renamed from: x */
    public boolean mo109839x() {
        return this.f76170h;
    }

    /* renamed from: z */
    public ArrayList<Calendar> mo109841z() {
        return this.f76172j;
    }

    /* renamed from: q */
    public boolean mo109832q() {
        if (this.f76164b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo109806a() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.getServerId();
        }
        return "";
    }

    /* renamed from: b */
    public String mo109812b() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.getExternalAccount();
        }
        return "";
    }

    /* renamed from: c */
    public boolean mo109816c() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.isVisible();
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo109818d() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.isDisabled();
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo109820e() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.isResignedCalendar();
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo109821f() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return CalendarShareDataHelper.m113341a(calendar);
        }
        return false;
    }

    /* renamed from: h */
    public Calendar.Type mo109823h() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.getType();
        }
        return Calendar.Type.UNKNOWN_TYPE;
    }

    /* renamed from: i */
    public boolean mo109824i() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.isActive();
        }
        return true;
    }

    /* renamed from: j */
    public String mo109825j() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.getNoteOrLocalizeSummary();
        }
        return "";
    }

    /* renamed from: l */
    public boolean mo109827l() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.isLoading();
        }
        return false;
    }

    /* renamed from: n */
    public CalendarSchemaCollection mo109829n() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.getCalendarSchema();
        }
        return null;
    }

    /* renamed from: p */
    public boolean mo109831p() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.isOwnerCalendar();
        }
        return false;
    }

    /* renamed from: k */
    public int mo109826k() {
        Calendar calendar = this.f76164b;
        if (calendar != null) {
            return calendar.getBackgroundColor();
        }
        return CalendarSkinColorTool.m124920a(0, C30022a.f74884c.mo108456c().getSkinType());
    }

    /* renamed from: m */
    public boolean mo109828m() {
        Calendar calendar;
        String str = this.f76165c;
        if (str == null || (calendar = this.f76164b) == null) {
            return false;
        }
        boolean equals = str.equals(calendar.getServerId());
        this.f76165c = null;
        return equals;
    }

    /* renamed from: y */
    public boolean mo109840y() {
        if (CollectionUtils.isEmpty(this.f76172j)) {
            return false;
        }
        return this.f76172j.get(0).isExternalPasswordInvalid();
    }

    /* renamed from: g */
    public boolean mo109822g() {
        Calendar calendar = this.f76164b;
        if (calendar == null) {
            return false;
        }
        if (calendar.getType() == Calendar.Type.PRIMARY || this.f76164b.getType() == Calendar.Type.OTHER || this.f76164b.getType() == Calendar.Type.RESOURCES || this.f76164b.getType() == Calendar.Type.ACTIVITY) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo109807a(TYPE type) {
        this.f76163a = type;
    }

    /* renamed from: b */
    public void mo109813b(String str) {
        this.f76166d = str;
    }

    /* renamed from: c */
    public void mo109815c(boolean z) {
        this.f76171i = z;
    }

    /* renamed from: d */
    public void mo109817d(boolean z) {
        this.f76169g = z;
    }

    /* renamed from: e */
    public void mo109819e(boolean z) {
        this.f76170h = z;
    }

    /* renamed from: a */
    public void mo109808a(Calendar calendar) {
        this.f76164b = calendar;
    }

    /* renamed from: b */
    public void mo109814b(boolean z) {
        this.f76168f = z;
    }

    /* renamed from: a */
    public void mo109809a(String str) {
        this.f76165c = str;
    }

    /* renamed from: a */
    public void mo109810a(List<Calendar> list) {
        if (list != null) {
            this.f76172j.addAll(list);
        }
    }

    /* renamed from: a */
    public void mo109811a(boolean z) {
        this.f76167e = z;
    }
}
