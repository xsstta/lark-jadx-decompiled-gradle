package com.ss.android.lark.mail.impl.widget.time;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.widget.wheelpicker.AbstractC59257b;
import com.ss.android.lark.widget.wheelpicker.AbstractC59265j;
import com.ss.ttm.player.MediaPlayer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.time.g */
public class C44089g implements AbstractC44097j, AbstractC59265j<C44090a> {

    /* renamed from: a */
    public static DateFormat f111932a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: b */
    public int f111933b = 1;

    /* renamed from: c */
    public int f111934c;

    /* renamed from: d */
    public int f111935d;

    /* renamed from: e */
    public String[] f111936e;

    /* renamed from: f */
    private int f111937f;

    /* renamed from: g */
    private List<String> f111938g;

    /* renamed from: h */
    private List<String> f111939h;

    @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44097j
    public String aQ_() {
        return "24日 周四";
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: a */
    public int mo156880a() {
        return (this.f111937f - this.f111933b) + 1;
    }

    /* renamed from: com.ss.android.lark.mail.impl.widget.time.g$a */
    public class C44090a implements AbstractC59257b {

        /* renamed from: a */
        public int f111940a;

        @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59257b
        /* renamed from: a */
        public String mo156890a() {
            int i = this.f111940a;
            if (i < 0 || i >= C44089g.this.mo156880a()) {
                return "";
            }
            int i2 = C44089g.this.f111933b + this.f111940a;
            String str = C44089g.this.f111934c + "-" + C44089g.this.f111935d + "-" + i2;
            Calendar instance = Calendar.getInstance();
            try {
                instance.setTime(C44089g.f111932a.parse(str));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return i2 + C43819s.m173684a((int) R.string.Calendar_TimeFormat_AllDay) + C44089g.this.f111936e[(instance.get(7) - 1) % 7];
        }

        public C44090a(int i) {
            this.f111940a = i;
        }
    }

    /* renamed from: a */
    public int mo156882a(C44090a aVar) {
        return aVar.f111940a;
    }

    /* renamed from: a */
    public C44090a mo156885b(int i) {
        return new C44090a(i);
    }

    public C44089g(int i, int i2, String[] strArr, List<String> list, List<String> list2) {
        this.f111934c = i;
        this.f111935d = i2;
        this.f111936e = strArr;
        this.f111938g = list;
        this.f111939h = list2;
        if (list.contains(String.valueOf(i2))) {
            this.f111937f = 31;
        } else if (this.f111939h.contains(String.valueOf(i2))) {
            this.f111937f = 30;
        } else if ((i % 4 != 0 || i % 100 == 0) && i % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL != 0) {
            this.f111937f = 28;
        } else {
            this.f111937f = 29;
        }
    }
}
