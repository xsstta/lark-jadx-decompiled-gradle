package com.ss.android.lark.mail.impl.badge;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class BadgeDecorator {

    /* renamed from: a */
    public static ThreadLocal<C41830a> f106185a = new ThreadLocal<>();

    /* renamed from: com.ss.android.lark.mail.impl.badge.BadgeDecorator$b */
    public interface AbstractC41831b {
        /* renamed from: a */
        ColorType mo150410a();

        /* renamed from: a */
        CountType mo150411a(int i);

        /* renamed from: b */
        StrokeType mo150412b();

        /* renamed from: c */
        boolean mo150413c();

        /* renamed from: d */
        int mo150414d();
    }

    /* renamed from: a */
    private static int m166138a(int i, int i2, int i3) {
        return i + (i2 * 10) + (i3 * 100);
    }

    public enum ColorType {
        COLOR_TYPE_GRAY_INDEX(0),
        COLOR_TYPE_PINK_INDEX(1),
        COLOR_TYPE_ORANGE_INDEX(2);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static ColorType fromValue(int i) {
            if (i == 0) {
                return COLOR_TYPE_GRAY_INDEX;
            }
            if (i == 1) {
                return COLOR_TYPE_PINK_INDEX;
            }
            if (i != 2) {
                return null;
            }
            return COLOR_TYPE_ORANGE_INDEX;
        }

        private ColorType(int i) {
            this.value = i;
        }
    }

    public enum CountType {
        COUNT_TYPE_NO_COUNT_INDEX(0),
        COUNT_TYPE_SINGLE_COUNT_INDEX(1),
        COUNT_TYPE_MULTI_COUNT_INDEX(2),
        COUNT_TYPE_ETC_COUNT_INDEX(3);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static CountType fromValue(int i) {
            if (i == 0) {
                return COUNT_TYPE_NO_COUNT_INDEX;
            }
            if (i == 1) {
                return COUNT_TYPE_SINGLE_COUNT_INDEX;
            }
            if (i == 2) {
                return COUNT_TYPE_MULTI_COUNT_INDEX;
            }
            if (i != 3) {
                return null;
            }
            return COUNT_TYPE_ETC_COUNT_INDEX;
        }

        private CountType(int i) {
            this.value = i;
        }
    }

    public enum StrokeType {
        STROKE_TYPE_HAS_INDEX(0),
        STROKE_TYPE_NON_INDEX(1);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static StrokeType fromValue(int i) {
            if (i == 0) {
                return STROKE_TYPE_HAS_INDEX;
            }
            if (i != 1) {
                return null;
            }
            return STROKE_TYPE_NON_INDEX;
        }

        private StrokeType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.badge.BadgeDecorator$a */
    public static class C41830a {

        /* renamed from: a */
        private int f106186a;

        /* renamed from: b */
        private int f106187b;

        /* renamed from: c */
        private int f106188c;

        /* renamed from: d */
        private String f106189d;

        /* renamed from: e */
        private float f106190e;

        /* renamed from: f */
        private int f106191f;

        /* renamed from: a */
        public int mo150399a() {
            return this.f106187b;
        }

        /* renamed from: b */
        public String mo150403b() {
            return this.f106189d;
        }

        /* renamed from: c */
        public int mo150405c() {
            return this.f106188c;
        }

        /* renamed from: d */
        public int mo150407d() {
            return this.f106191f;
        }

        /* renamed from: e */
        public void mo150409e() {
            this.f106187b = 0;
            this.f106186a = 0;
            this.f106188c = 4;
            this.f106189d = null;
            this.f106190e = BitmapDescriptorFactory.HUE_RED;
        }

        /* renamed from: a */
        public void mo150400a(float f) {
            this.f106190e = f;
        }

        /* renamed from: b */
        public void mo150404b(int i) {
            this.f106187b = i;
        }

        /* renamed from: c */
        public void mo150406c(int i) {
            this.f106188c = i;
        }

        /* renamed from: d */
        public void mo150408d(int i) {
            this.f106191f = i;
        }

        /* renamed from: a */
        public void mo150401a(int i) {
            this.f106186a = i;
        }

        /* renamed from: a */
        public void mo150402a(String str) {
            this.f106189d = str;
        }
    }

    /* renamed from: a */
    public static C41830a m166140a(int i, boolean z, AbstractC41831b bVar) {
        return m166139a(i, z, bVar.mo150411a(i), bVar.mo150410a(), bVar.mo150412b(), bVar.mo150414d(), bVar.mo150413c());
    }

    /* renamed from: a */
    private static C41830a m166139a(int i, boolean z, CountType countType, ColorType colorType, StrokeType strokeType, int i2, boolean z2) {
        int i3;
        C41830a aVar = f106185a.get();
        if (aVar == null) {
            aVar = new C41830a();
            f106185a.set(aVar);
        }
        aVar.mo150409e();
        if (i == 0 && i2 == 0) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        aVar.mo150406c(i3);
        if (z2) {
            aVar.mo150402a("");
        } else if (countType != CountType.COUNT_TYPE_ETC_COUNT_INDEX) {
            aVar.mo150402a(String.valueOf(Math.abs(i)));
        } else if (z) {
            aVar.mo150402a("...");
        } else {
            aVar.mo150402a("999+");
        }
        if (strokeType == StrokeType.STROKE_TYPE_HAS_INDEX) {
            aVar.mo150400a(2.5f);
        } else {
            aVar.mo150400a(1.0f);
        }
        int a = m166138a(countType.getValue(), colorType.getValue(), strokeType.getValue());
        if (a == 0) {
            aVar.mo150401a(R.drawable.mail_bg_badge_gray_no_count_stroke);
        } else if (a == 1) {
            aVar.mo150401a(R.drawable.mail_bg_badge_gray_single_count_stroke);
            aVar.mo150404b(-1);
        } else if (a == 2) {
            aVar.mo150401a(R.drawable.mail_bg_badge_gray_multi_count_stroke);
            aVar.mo150404b(-1);
        } else if (a != 3) {
            switch (a) {
                case 11:
                    aVar.mo150401a(R.drawable.mail_bg_badge_pink_single_count_stroke);
                    aVar.mo150404b(UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.function_danger_500));
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    aVar.mo150401a(R.drawable.mail_bg_badge_pink_multi_count_stroke);
                    aVar.mo150404b(UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.function_danger_500));
                    break;
                case 13:
                    if (!z) {
                        aVar.mo150402a("999+");
                        aVar.mo150401a(R.drawable.mail_bg_badge_pink_multi_count_stroke);
                        aVar.mo150404b(UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.function_danger_500));
                        break;
                    } else {
                        aVar.mo150401a(R.drawable.mail_bg_badge_pink_etc_count_stroke);
                        break;
                    }
                default:
                    switch (a) {
                        case 20:
                            aVar.mo150401a(R.drawable.mail_bg_badge_orange_no_count_stroke);
                            break;
                        case 21:
                            aVar.mo150401a(R.drawable.badge_orange_single_count_bg_stroke);
                            aVar.mo150404b(-1);
                            break;
                        case 22:
                            aVar.mo150401a(R.drawable.badge_orange_multi_count_bg_stroke);
                            aVar.mo150404b(-1);
                            break;
                        case 23:
                            if (!z) {
                                aVar.mo150402a("999+");
                                aVar.mo150401a(R.drawable.badge_orange_multi_count_bg_stroke);
                                aVar.mo150404b(-1);
                                break;
                            } else {
                                aVar.mo150404b(-1);
                                aVar.mo150401a(R.drawable.badge_orange_bg_etc_count_stroke);
                                break;
                            }
                        default:
                            switch (a) {
                                case 100:
                                    aVar.mo150401a(R.drawable.mail_bg_badge_gray_no_count_no_stroke);
                                    break;
                                case 101:
                                    aVar.mo150401a(R.drawable.mail_bg_badge_gray_single_count_no_stroke);
                                    aVar.mo150404b(-1);
                                    break;
                                case 102:
                                    aVar.mo150401a(R.drawable.mail_bg_badge_gray_multi_count_no_stroke);
                                    aVar.mo150404b(-1);
                                    break;
                                case 103:
                                    if (!z) {
                                        aVar.mo150402a("999+");
                                        aVar.mo150401a(R.drawable.mail_bg_badge_gray_multi_count_no_stroke);
                                        aVar.mo150404b(-1);
                                        break;
                                    } else {
                                        aVar.mo150401a(R.drawable.mail_bg_badge_gray_etc_count);
                                        break;
                                    }
                                default:
                                    switch (a) {
                                        case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                            aVar.mo150401a(R.drawable.mail_bg_badge_pink_single_count_no_stroke);
                                            aVar.mo150404b(UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.function_danger_500));
                                            break;
                                        case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                            aVar.mo150401a(R.drawable.mail_bg_badge_pink_multi_count_no_stroke);
                                            aVar.mo150404b(UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.function_danger_500));
                                            break;
                                        case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                                            if (!z) {
                                                aVar.mo150402a("999+");
                                                aVar.mo150401a(R.drawable.mail_bg_badge_pink_multi_count_no_stroke);
                                                aVar.mo150404b(UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.function_danger_500));
                                                break;
                                            } else {
                                                aVar.mo150401a(R.drawable.mail_bg_badge_pink_etc_count);
                                                break;
                                            }
                                        default:
                                            switch (a) {
                                                case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                                                    aVar.mo150401a(R.drawable.mail_bg_badge_orange_no_count_no_stroke);
                                                    break;
                                                case SmActions.ACTION_INIT_ENTRY /*{ENCODED_INT: 121}*/:
                                                    aVar.mo150401a(R.drawable.badge_orange_single_count_bg_no_stroke);
                                                    aVar.mo150404b(-1);
                                                    break;
                                                case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                                                    aVar.mo150401a(R.drawable.badge_orange_multi_count_bg_no_stroke);
                                                    aVar.mo150404b(-1);
                                                    break;
                                                case SmActions.ACTION_CALLING_ENTRY /*{ENCODED_INT: 123}*/:
                                                    if (!z) {
                                                        aVar.mo150402a("999+");
                                                        aVar.mo150401a(R.drawable.badge_orange_multi_count_bg_stroke);
                                                        aVar.mo150404b(-1);
                                                        break;
                                                    } else {
                                                        aVar.mo150401a(R.drawable.mail_bg_badge_orange_etc_count);
                                                        break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else if (z) {
            aVar.mo150401a(R.drawable.mail_bg_badge_gray_etc_count_stroke);
        } else {
            aVar.mo150402a("999+");
            aVar.mo150401a(R.drawable.mail_bg_badge_gray_multi_count_stroke);
            aVar.mo150404b(-1);
        }
        if (i2 != 0) {
            aVar.mo150408d(i2);
            aVar.mo150402a("");
            aVar.mo150401a(0);
        } else {
            aVar.mo150408d(0);
        }
        return aVar;
    }
}
