package com.ss.android.lark.guide.landing.general.ui;

import com.ss.android.lark.log.Log;

public class GuidePageTransApi {

    /* renamed from: a */
    private static GuidePageTransApi f99321a;

    /* renamed from: b */
    private AbstractC38645a f99322b;

    /* renamed from: com.ss.android.lark.guide.landing.general.ui.GuidePageTransApi$a */
    public interface AbstractC38645a {
        /* renamed from: a */
        boolean mo141527a(int i, boolean z);
    }

    public enum GuidePageEnum {
        ALL_IN_ONE(0),
        VIDEO_CONFERENCE(1),
        CLOUD(2),
        CALENDAR(3),
        OPEN_PLATFORM(4),
        OTHER(0);
        
        private int postion;

        public int getPostion() {
            return this.postion;
        }

        public static GuidePageEnum fromValue(String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -355239072:
                    if (str.equals("video_conference")) {
                        c = 0;
                        break;
                    }
                    break;
                case -210508088:
                    if (str.equals("open_platform")) {
                        c = 1;
                        break;
                    }
                    break;
                case -178324674:
                    if (str.equals("calendar")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94756405:
                    if (str.equals("cloud")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1250520234:
                    if (str.equals("all_in_one")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return VIDEO_CONFERENCE;
                case 1:
                    return OPEN_PLATFORM;
                case 2:
                    return CALENDAR;
                case 3:
                    return CLOUD;
                case 4:
                    return ALL_IN_ONE;
                default:
                    return OTHER;
            }
        }

        private GuidePageEnum(int i) {
            this.postion = i;
        }
    }

    /* renamed from: a */
    public static GuidePageTransApi m152498a() {
        if (f99321a == null) {
            synchronized (GuidePageTransApi.class) {
                if (f99321a == null) {
                    f99321a = new GuidePageTransApi();
                }
            }
        }
        return f99321a;
    }

    /* renamed from: a */
    public void mo141545a(AbstractC38645a aVar) {
        this.f99322b = aVar;
    }

    /* renamed from: a */
    public boolean mo141546a(String str, boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append("setCurrentItem ");
        sb.append(str);
        sb.append(" ");
        sb.append(z);
        sb.append(" -> ");
        if (this.f99322b == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb.append(z2);
        Log.m165389i("GuidePageTransApi", sb.toString());
        AbstractC38645a aVar = this.f99322b;
        if (aVar != null) {
            return aVar.mo141527a(GuidePageEnum.fromValue(str).getPostion(), z);
        }
        return false;
    }
}
