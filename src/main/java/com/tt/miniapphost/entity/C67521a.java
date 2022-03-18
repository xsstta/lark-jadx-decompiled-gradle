package com.tt.miniapphost.entity;

import android.app.Application;
import android.graphics.Color;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapphost.entity.a */
public class C67521a {

    /* renamed from: a */
    private String f170275a;

    /* renamed from: b */
    private String f170276b;

    /* renamed from: c */
    private String f170277c;

    /* renamed from: d */
    private String f170278d;

    /* renamed from: a */
    public String mo234463a() {
        return this.f170275a;
    }

    /* renamed from: d */
    public String mo234466d() {
        if (TextUtils.isEmpty(this.f170278d)) {
            this.f170278d = "anchor";
        }
        return this.f170278d;
    }

    /* renamed from: e */
    private int m262616e() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null) {
            return applicationContext.getResources().getColor(R.color.microapp_m_anchor_btn_shape);
        }
        return Color.parseColor("#F85959");
    }

    /* renamed from: c */
    public int mo234465c() {
        try {
            if (TextUtils.isEmpty(this.f170277c)) {
                return m262616e();
            }
            if (this.f170277c.charAt(0) != '#') {
                this.f170277c = '#' + this.f170277c;
            }
            return Color.parseColor(this.f170277c);
        } catch (Exception unused) {
            return m262616e();
        }
    }

    /* renamed from: b */
    public String mo234464b() {
        if (TextUtils.isEmpty(this.f170276b)) {
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            String a = mo234463a();
            if (applicationContext == null) {
                this.f170276b = a;
            } else if ("ADD".equals(a)) {
                this.f170276b = applicationContext.getResources().getString(R.string.microapp_m_anchor_add);
            } else if ("REMOVE".equals(a)) {
                this.f170276b = applicationContext.getResources().getString(R.string.microapp_m_anchor_remove);
            } else {
                this.f170276b = a;
            }
        }
        return this.f170276b;
    }
}
