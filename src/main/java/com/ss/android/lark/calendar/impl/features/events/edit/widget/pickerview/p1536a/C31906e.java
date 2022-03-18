package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.ttm.player.MediaPlayer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.e */
public class C31906e implements AbstractC31902b<C31907a> {

    /* renamed from: a */
    public static DateFormat f81497a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: b */
    public int f81498b = 1;

    /* renamed from: c */
    public int f81499c;

    /* renamed from: d */
    public int f81500d;

    /* renamed from: e */
    public String[] f81501e;

    /* renamed from: f */
    private int f81502f;

    /* renamed from: g */
    private List<String> f81503g;

    /* renamed from: h */
    private List<String> f81504h;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: b */
    public String mo116508b() {
        return "24日 周四";
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: a */
    public int mo116503a() {
        return (this.f81502f - this.f81498b) + 1;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.e$a */
    public class C31907a implements AbstractC31908f {

        /* renamed from: a */
        public int f81505a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31908f
        /* renamed from: a */
        public String mo116514a() {
            int i = this.f81505a;
            if (i < 0 || i >= C31906e.this.mo116503a()) {
                return "";
            }
            int i2 = C31906e.this.f81498b + this.f81505a;
            String str = C31906e.this.f81499c + "-" + C31906e.this.f81500d + "-" + i2;
            Calendar instance = Calendar.getInstance();
            try {
                instance.setTime(C31906e.f81497a.parse(str));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_StandardTime_DayOnlyString, "numberDay", String.valueOf(i2)) + "(" + C31906e.this.f81501e[(instance.get(7) - 1) % 7] + ")";
        }

        public C31907a(int i) {
            this.f81505a = i;
        }
    }

    /* renamed from: a */
    public int mo116504a(C31907a aVar) {
        return aVar.f81505a;
    }

    /* renamed from: a */
    public C31907a mo116507b(int i) {
        return new C31907a(i);
    }

    public C31906e(int i, int i2, String[] strArr, List<String> list, List<String> list2) {
        this.f81499c = i;
        this.f81500d = i2;
        this.f81501e = strArr;
        this.f81503g = list;
        this.f81504h = list2;
        if (list.contains(String.valueOf(i2))) {
            this.f81502f = 31;
        } else if (this.f81504h.contains(String.valueOf(i2))) {
            this.f81502f = 30;
        } else if ((i % 4 != 0 || i % 100 == 0) && i % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL != 0) {
            this.f81502f = 28;
        } else {
            this.f81502f = 29;
        }
    }
}
