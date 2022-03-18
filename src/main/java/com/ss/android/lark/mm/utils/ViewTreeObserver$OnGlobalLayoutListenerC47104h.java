package com.ss.android.lark.mm.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.ss.android.lark.log.Log;
import com.ss.ttm.player.MediaPlayer;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mm.utils.h */
public class ViewTreeObserver$OnGlobalLayoutListenerC47104h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    private static HashMap<AbstractC47105a, ViewTreeObserver$OnGlobalLayoutListenerC47104h> f118623g = new HashMap<>();

    /* renamed from: h */
    private static int f118624h = 0;

    /* renamed from: a */
    private AbstractC47105a f118625a;

    /* renamed from: b */
    private int f118626b;

    /* renamed from: c */
    private int f118627c;

    /* renamed from: d */
    private View f118628d;

    /* renamed from: e */
    private ViewGroup f118629e;

    /* renamed from: f */
    private float f118630f;

    /* renamed from: i */
    private int[] f118631i = new int[2];

    /* renamed from: com.ss.android.lark.mm.utils.h$a */
    public interface AbstractC47105a {
        /* renamed from: b */
        void mo161814b(int i);
    }

    /* renamed from: a */
    private void m186554a() {
        this.f118625a = null;
        this.f118628d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* renamed from: b */
    private static int m186557b() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public void onGlobalLayout() {
        int a = m186552a(C47098d.m186533a(this.f118629e.getContext()).getWindow());
        if (this.f118627c != a) {
            f118624h = a;
            this.f118625a.mo161814b(a);
            this.f118627c = a;
        }
    }

    /* renamed from: a */
    private View m186553a(Activity activity) {
        return m186558b(activity).getRootView();
    }

    /* renamed from: b */
    private ViewGroup m186558b(Activity activity) {
        return (ViewGroup) activity.findViewById(16908290);
    }

    /* renamed from: a */
    private int m186552a(Window window) {
        View decorView = window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.m165379d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > m186557b()) {
            return abs - this.f118626b;
        }
        this.f118626b = abs;
        return 0;
    }

    /* renamed from: a */
    public static void m186556a(AbstractC47105a aVar) {
        if (f118623g.containsKey(aVar)) {
            ViewTreeObserver$OnGlobalLayoutListenerC47104h hVar = f118623g.get(aVar);
            if (hVar != null) {
                hVar.m186554a();
            }
            f118623g.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m186555a(Activity activity, AbstractC47105a aVar) {
        m186556a(aVar);
        f118623g.put(aVar, new ViewTreeObserver$OnGlobalLayoutListenerC47104h(activity, aVar));
    }

    private ViewTreeObserver$OnGlobalLayoutListenerC47104h(Activity activity, AbstractC47105a aVar) {
        this.f118625a = aVar;
        if ((activity.getWindow().getAttributes().flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
            activity.getWindow().clearFlags(MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        }
        this.f118627c = m186552a(activity.getWindow());
        this.f118629e = m186558b(activity);
        this.f118628d = m186553a(activity);
        this.f118629e.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f118630f = activity.getResources().getDisplayMetrics().density;
    }
}
