package com.by.inflate_lib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.by.inflate_lib.p101c.AbstractC2607a;

/* renamed from: com.by.inflate_lib.a */
public class C2599a {

    /* renamed from: a */
    static AbstractC2607a f8292a = null;

    /* renamed from: b */
    private static boolean f8293b = true;

    /* renamed from: a */
    public static View m10958a(Context context, int i, ViewGroup viewGroup, boolean z) {
        return m10959a(context, i, viewGroup, z, -1);
    }

    /* renamed from: a */
    public static View m10959a(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        return m10960a(context, i, viewGroup, z, i2, false);
    }

    /* renamed from: a */
    public static View m10960a(Context context, int i, ViewGroup viewGroup, boolean z, int i2, boolean z2) {
        C2608d.m10969a(context);
        if (!f8293b) {
            C2608d.m10970a("AndInflater is closed, inflate with origin LayoutInflater");
            if (z2) {
                return null;
            }
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        AbstractC2604b a = C2606c.m10964a(i);
        if (a == null) {
            C2608d.m10970a("layout id :" + Integer.toHexString(i) + " does not match any inflator, inflate with android.view.LayoutInflater");
            AbstractC2607a aVar = f8292a;
            if (aVar != null) {
                aVar.mo11277a(i, Integer.toHexString(i), Integer.toHexString(i2));
            }
            if (z2) {
                return null;
            }
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        try {
            View a2 = C2606c.m10963a(a, i, context, viewGroup, z);
            AbstractC2607a aVar2 = f8292a;
            if (aVar2 != null) {
                aVar2.mo11279b(i, Integer.toHexString(i), Integer.toHexString(i2));
            }
            return a2;
        } catch (Throwable th) {
            AbstractC2607a aVar3 = f8292a;
            if (aVar3 != null) {
                aVar3.mo11278a(i, Integer.toHexString(i), Integer.toHexString(i2), th);
            }
            if (C2608d.f8298a) {
                C2608d.m10970a("the inflator with id: " + i + " inflated failed " + th.getMessage() + " , inflate with android.view.LayoutInflater");
                throw new IllegalStateException(th);
            } else if (z2) {
                return null;
            } else {
                return LayoutInflater.from(context).inflate(i, viewGroup, z);
            }
        }
    }
}
