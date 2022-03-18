package com.bytedance.ee.bear.list.analysis;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/list/analysis/ListAnalysis;", "", "()V", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.a.a */
public final class ListAnalysis {

    /* renamed from: a */
    public static final Companion f21728a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m32494a(AbstractC5233x xVar) {
        f21728a.mo31405a(xVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32495a(AbstractC5233x xVar, int i) {
        f21728a.mo31406a(xVar, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32496a(AbstractC5233x xVar, AccountService.Account account, String str, Document document, String str2, String str3) {
        f21728a.mo31407a(xVar, account, str, document, str2, str3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32497a(AbstractC5233x xVar, String str) {
        f21728a.mo31408a(xVar, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32498a(AbstractC5233x xVar, String str, int i, boolean z, Document document, int i2) {
        f21728a.mo31409a(xVar, str, i, z, document, i2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32499a(AbstractC5233x xVar, String str, Document document) {
        f21728a.mo31410a(xVar, str, document);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32500a(AbstractC5233x xVar, String str, String str2) {
        f21728a.mo31412a(xVar, str, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32501a(AbstractC5233x xVar, String str, String str2, String str3) {
        f21728a.mo31413a(xVar, str, str2, str3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32502a(AbstractC5233x xVar, String str, String str2, String str3, int i, String str4) {
        f21728a.mo31414a(xVar, str, str2, str3, i, str4);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32503a(AbstractC5233x xVar, String str, String str2, String str3, Document document) {
        f21728a.mo31415a(xVar, str, str2, str3, document);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32504a(AbstractC5233x xVar, String str, String str2, String str3, String str4) {
        f21728a.mo31416a(xVar, str, str2, str3, str4);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32505a(AbstractC5233x xVar, String str, String str2, boolean z, boolean z2, String str3) {
        f21728a.mo31417a(xVar, str, str2, z, z2, str3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32506a(AbstractC5233x xVar, String str, boolean z) {
        f21728a.mo31419a(xVar, str, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32507a(AbstractC5233x xVar, boolean z) {
        f21728a.mo31420a(xVar, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32508a(AbstractC5233x xVar, boolean z, int i) {
        f21728a.mo31421a(xVar, z, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32509a(AbstractC5233x xVar, boolean z, String str, Document document, String str2) {
        f21728a.mo31422a(xVar, z, str, document, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32510a(AbstractC5233x xVar, boolean z, String str, String str2, int i, String str3) {
        f21728a.mo31423a(xVar, z, str, str2, i, str3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32511a(C10917c cVar, boolean z, Document document, String str) {
        f21728a.mo31424a(cVar, z, document, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32512a(String str) {
        f21728a.mo31425a(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32513a(String str, String str2, int i, String str3, String str4, String str5) {
        f21728a.mo31426a(str, str2, i, str3, str4, str5);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32514a(String str, String str2, String str3) {
        f21728a.mo31427a(str, str2, str3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32515a(String str, String str2, String str3, int i, String str4, String str5, String str6, boolean z, boolean z2) {
        f21728a.mo31428a(str, str2, str3, i, str4, str5, str6, z, z2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32516a(String str, String str2, String str3, String str4) {
        f21728a.mo31429a(str, str2, str3, str4);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32517a(String str, String str2, String str3, String str4, String str5) {
        f21728a.mo31430a(str, str2, str3, str4, str5);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32518a(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, boolean z2, boolean z3, int i2, String str7) {
        f21728a.mo31431a(str, str2, str3, str4, str5, i, str6, z, z2, z3, i2, str7);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32519a(String str, String str2, String str3, String str4, String str5, String str6) {
        f21728a.mo31432a(str, str2, str3, str4, str5, str6);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32520a(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, Boolean bool, String str8) {
        f21728a.mo31434a(str, str2, str3, str4, str5, str6, i, str7, bool, str8);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32521a(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, boolean z, boolean z2, int i2) {
        f21728a.mo31435a(str, str2, str3, str4, str5, str6, i, str7, z, z2, i2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32522a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        f21728a.mo31436a(str, str2, str3, str4, str5, str6, str7, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32523a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, boolean z, boolean z2, boolean z3, int i2, Boolean bool, String str10) {
        f21728a.mo31437a(str, str2, str3, str4, str5, str6, str7, i, str8, str9, z, z2, z3, i2, bool, str10);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m32524a(String str, String str2, boolean z) {
        f21728a.mo31438a(str, str2, z);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m32525b(String str) {
        return f21728a.mo31439b(str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m32526b(AbstractC5233x xVar, String str) {
        f21728a.mo31440b(xVar, str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m32527b(AbstractC5233x xVar, String str, Document document) {
        f21728a.mo31441b(xVar, str, document);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m32528b(String str, String str2, String str3) {
        f21728a.mo31442b(str, str2, str3);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m32529b(String str, String str2, String str3, String str4) {
        f21728a.mo31443b(str, str2, str3, str4);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m32530b(String str, String str2, String str3, String str4, String str5) {
        f21728a.mo31444b(str, str2, str3, str4, str5);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m32531c(AbstractC5233x xVar, String str) {
        f21728a.mo31445c(xVar, str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m32532c(String str, String str2, String str3) {
        f21728a.mo31446c(str, str2, str3);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m32533d(AbstractC5233x xVar, String str) {
        f21728a.mo31447d(xVar, str);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m32534d(String str, String str2, String str3) {
        f21728a.mo31448d(str, str2, str3);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m32535e(AbstractC5233x xVar, String str) {
        f21728a.mo31449e(xVar, str);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m32536e(String str, String str2, String str3) {
        f21728a.mo31450e(str, str2, str3);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m32537f(AbstractC5233x xVar, String str) {
        f21728a.mo31453g(xVar, str);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m32538f(String str, String str2, String str3) {
        f21728a.mo31452f(str, str2, str3);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m32539g(AbstractC5233x xVar, String str) {
        f21728a.mo31455h(xVar, str);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m32540g(String str, String str2, String str3) {
        f21728a.mo31454g(str, str2, str3);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m32541h(AbstractC5233x xVar, String str) {
        f21728a.mo31457i(xVar, str);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m32542h(String str, String str2, String str3) {
        f21728a.mo31456h(str, str2, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bi\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b#\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\b\u0010s\u001a\u0004\u0018\u00010\u00042\u0006\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u00042\b\u0010w\u001a\u0004\u0018\u00010\u00042\b\u0010x\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010y\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u0004H\u0002J\u0010\u0010}\u001a\u00020n2\u0006\u0010z\u001a\u00020{H\u0007J\u0013\u0010~\u001a\u00020\u00042\t\u0010\u001a\u0005\u0018\u00010\u0001H\u0002J-\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J3\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u00042\u0007\u0010\u001a\u00030\u0001H\u0007J\u000b\u0010\u0001\u001a\u0004\u0018\u00010{H\u0007J\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010q\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020\u00042\b\u0010\u0001\u001a\u00030\u0001H\u0007J\n\u0010\u0001\u001a\u00030\u0001H\u0002J5\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010q\u001a\u00020\u00042\u0007\u0010\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J\u001a\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010\u0001\u001a\u00020uH\u0007J-\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u00042\t\u0010\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020uH\u0007J\u0019\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u0004H\u0007J\u0017\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u0004J\"\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u00042\u0007\u0010\u001a\u00030\u0001H\u0007J\u001a\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J\u001b\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0011\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{H\u0007J\u0019\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u0004H\u0007J\u001b\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u0001H\u0007J#\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u00042\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u001a\u0010\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010 \u0001\u001a\u00020\u0004H\u0007JE\u0010¡\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020u2\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u0004H\u0007JY\u0010¡\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\u0007\u0010¥\u0001\u001a\u00020\u00042\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020uH\u0007J:\u0010§\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\u0007\u0010¥\u0001\u001a\u00020\u00042\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010¨\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010©\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004H\u0007JN\u0010ª\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\u0007\u0010¥\u0001\u001a\u00020\u00042\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020uH\u0007J\u0019\u0010«\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u0004H\u0007J\"\u0010¬\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010­\u0001\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u0004H\u0007JD\u0010®\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010­\u0001\u001a\u00020\u00042(\u0010o\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010¯\u0001j\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`°\u0001H\u0007J&\u0010±\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004H\u0007JE\u0010²\u0001\u001a\u00020n2\u0007\u0010¥\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010´\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010¶\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010³\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J4\u0010·\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u00042\u0007\u0010¥\u0001\u001a\u00020\u00042\u0007\u0010¤\u0001\u001a\u00020\u00042\u0007\u0010¸\u0001\u001a\u00020\u0004H\u0007Jo\u0010·\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u00042\u0007\u0010¥\u0001\u001a\u00020\u00042\u0007\u0010¤\u0001\u001a\u00020\u00042\u0007\u0010¸\u0001\u001a\u00020\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u00042\n\u0010¹\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010º\u0001\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0003\u0010»\u0001J\"\u0010¼\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u00042\u0007\u0010¸\u0001\u001a\u00020\u0004H\u0007J>\u0010½\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020u2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u001a\u00030\u00012\u0007\u0010¾\u0001\u001a\u00020uH\u0007J\u0019\u0010¿\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u0004H\u0007JA\u0010À\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\n\u0010Á\u0001\u001a\u0005\u0018\u00010Â\u00012\u0007\u0010Ã\u0001\u001a\u00020\u00042\b\u0010Ä\u0001\u001a\u00030\u00012\u0006\u0010q\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J=\u0010Å\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\u0007\u0010Æ\u0001\u001a\u00020\u00042\u0007\u0010Ç\u0001\u001a\u00020u2\u0007\u0010È\u0001\u001a\u00020\u0004H\u0007J\"\u0010É\u0001\u001a\u00020n2\u0007\u0010Ê\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0004H\u0007J\"\u0010Ë\u0001\u001a\u00020n2\u0007\u0010Ê\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0004H\u0007J\"\u0010Ì\u0001\u001a\u00020n2\u0007\u0010Ê\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0004H\u0007J0\u0010Í\u0001\u001a\u00020n2\b\u0010Î\u0001\u001a\u00030Ï\u00012\b\u0010Ð\u0001\u001a\u00030\u00012\b\u0010Ä\u0001\u001a\u00030\u00012\u0007\u0010Ñ\u0001\u001a\u00020\u0004H\u0007J®\u0001\u0010Ò\u0001\u001a\u00020n2\u0007\u0010Ó\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\u0007\u0010¥\u0001\u001a\u00020\u00042\u0007\u0010¤\u0001\u001a\u00020\u00042\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Ô\u0001\u001a\u00030\u00012\b\u0010Õ\u0001\u001a\u00030\u00012\b\u0010Ö\u0001\u001a\u00030\u00012\u0007\u0010×\u0001\u001a\u00020u2\n\u0010¹\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010º\u0001\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0003\u0010Ø\u0001Js\u0010Ù\u0001\u001a\u00020n2\u0007\u0010Ó\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010£\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u00042\b\u0010Õ\u0001\u001a\u00030\u00012\b\u0010Ö\u0001\u001a\u00030\u00012\u0007\u0010×\u0001\u001a\u00020uH\u0007J-\u0010Ú\u0001\u001a\u00020n2\u0007\u0010Ó\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u00042\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010Û\u0001\u001a\u00020n2\u0007\u0010Ó\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u00042\b\u0010Ô\u0001\u001a\u00030\u00012\b\u0010Õ\u0001\u001a\u00030\u00012\b\u0010Ö\u0001\u001a\u00030\u00012\u0007\u0010×\u0001\u001a\u00020u2\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J>\u0010Ü\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010q\u001a\u00020\u00042\u0007\u0010£\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020u2\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J`\u0010Ý\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\u0007\u0010£\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u00042\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010x\u001a\u0004\u0018\u00010\u00042\b\u0010Õ\u0001\u001a\u00030\u00012\b\u0010ß\u0001\u001a\u00030\u0001H\u0007J?\u0010à\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\b\u0010á\u0001\u001a\u00030\u00012\b\u0010â\u0001\u001a\u00030\u00012\u0007\u0010È\u0001\u001a\u00020\u0004H\u0007J\"\u0010ã\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u00042\u0007\u0010\u001a\u00030\u0001H\u0007J\u001a\u0010ä\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J$\u0010å\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\b\u0010æ\u0001\u001a\u00030\u00012\u0007\u0010ç\u0001\u001a\u00020uH\u0007J&\u0010è\u0001\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00042\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Õ\u0001\u001a\u00030\u0001H\u0007J\u0019\u0010é\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u0004H\u0007J9\u0010é\u0001\u001a\u00020n2\u0006\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u00042\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010ë\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J5\u0010ì\u0001\u001a\u00020n2\t\u0010í\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010î\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010ï\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010ð\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010ñ\u0001\u001a\u00020n2\t\u0010í\u0001\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006ò\u0001"}, d2 = {"Lcom/bytedance/ee/bear/list/analysis/ListAnalysis$Companion;", "", "()V", "ADD", "", "ADD_TO_FAVORITES", "ADD_TO_QUICKACCESS", "CANCEL", "CCM_ANNOUNCEMENT_CLICK", "CCM_ANNOUNCEMENT_VIEW", "CCM_DOCS_PAGE_VIEW", "CCM_DOC_TODO_CENTER_PAGE_VIEW", "CCM_PERMISSION_SHARE_VIEW", "CCM_SPACE_CREATE_NEW_CLICK", "CCM_SPACE_CREATE_NEW_FOLDER_CLICK", "CCM_SPACE_CREATE_NEW_FOLDER_VIEW", "CCM_SPACE_CREATE_NEW_VIEW", "CCM_SPACE_DELETE_VIEW", "CCM_SPACE_FAVORITES_PAGE_CLICK", "CCM_SPACE_FAVORITES_PAGE_VIEW", "CCM_SPACE_FILE_CHOOSE_VIEW", "CCM_SPACE_FOLDER_CLICK", "CCM_SPACE_FOLDER_VIEW", "CCM_SPACE_HEADER_FILTER_CLICK", "CCM_SPACE_HEADER_FILTER_VIEW", "CCM_SPACE_HOME_PAGE_CLICK", "CCM_SPACE_HOME_PAGE_VIEW", "CCM_SPACE_OFFLINE_PAGE_CLICK", "CCM_SPACE_OFFLINE_PAGE_VIEW", "CCM_SPACE_PERSONAL_PAGE_CLICK", "CCM_SPACE_PERSONAL_PAGE_VIEW", "CCM_SPACE_RIGHT_CLICK_MENU_VIEW", "CCM_SPACE_SHARED_PAGE_CLICK", "CCM_SPACE_SHARED_PAGE_VIEW", "CCM_SPACE_TEMPLATES_PAGE_VIEW", "CCM_SPACE_UPLOAD_PROGRESS_CLICK", "CCM_SPACE_UPLOAD_PROGRESS_VIEW", "CCM_SPACE_WIKI_PAGE_CLICK", "CCM_SPACE_WIKI_PAGE_VIEW", "CCM_TEMPLATE_SYSTEMCENTER_VIEW", "CLICK_FILTER_BOARD", "CLICK_FOLDER_ALL", "CLICK_GRID_MORE", "CLICK_LIST_ITEM", "CLICK_PIN_COLLAPSE", "CLICK_PIN_SORT_ACTION", "CLICK_SEARCH", "CLICK_SHARED_COLLAPSE", "CLICK_VIEW_SWITCH", "CONFIRM", "CREATE", "DELETE", "DEV_PERFORMANCE_SHOW_LIST_ITEM", "EVENT_ENTER_EXPLORER_MODULE", "FILE_UPLOAD", "FILTER", "FOLDER", "GRID", "IMAGE_UPLOAD", "LAUNCH_WEB", "LIST", "LIST_FILE", "LIST_ITEM", "MIDDLE", "MORE", "NONE", "NULL", "PARAM_APP_FORM", "PARAM_CLICK", "PARAM_CONTAINER_ID", "PARAM_CONTAINER_TYPE", "PARAM_CURRENT_SUB_VIEW", "PARAM_DOC_VALUE", "PARAM_FILE_ID", "PARAM_FILE_TYPE", "PARAM_FOLDER_LEVER", "PARAM_IS_BLANK", "PARAM_IS_FOLDER", "PARAM_IS_FOLLOW", "PARAM_IS_SHARED_FOLDER", "PARAM_IS_SUBFOLDER", "PARAM_LOCATION", "PARAM_MODULE", "PARAM_NOTIFICATION_CLICK", "PARAM_NOTIFICATION_ID", "PARAM_NOTIFICATION_LOCATION", "PARAM_NOTIFICATION_TARGET", "PARAM_OPERATE_VALUE", "PARAM_SRC_FOLDER_ID", "PARAM_SRC_MODULE", "PARAM_SUB_FILE_TYPE", "PARAM_SUB_MODULE", "PARAM_SWITCH_TO", "PARAM_TARGET", "PARAM_TEMPLATES_ID", "PARAM_VIEW_TYPE", "REMOVE_FROM_FAVORITES", "REMOVE_FROM_QUICKACCESS", "RESET", "SEARCH", "SEARCH_MAIN_VIEW", "SHARE", "SHOW_LEFT_SLIDE", "SUSPEND_CREATE", "TAG", "TEMPLATES", "TEMPLATES_MORE", "VIEW_SWITCH", "WIKI", "addPublicParams", "", "params", "Lorg/json/JSONObject;", "module", "subModule", "fileId", "fileType", "", "subFileType", "containerId", "containerType", "beginCollectReportParams", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "tag", "beginReportListFileEvent", "buildGroupStr", "item", "Lcom/bytedance/ee/bear/list/dto/Document;", "collectReportParams", "key", "value", "collectStarOrPinParams", ShareHitPoint.f121868c, "getAnalyticService", "getTargetByModule", "getTimesMorning", "", "getViewType", "grid", "", "getYesterdayMorning", "reportAddManualOffline", "isGrid", "result", "reportBeginOpen", ShareHitPoint.f121869d, "reportClickBannerItem", "position", "reportClickFilter", "reportClickFolderAll", "reportClickGridMore", "reportClickNavigationItem", "reportClickPinCollapseAction", "expand", "reportClickPinSortAction", "reportClickSearch", "reportClickSharedCollapseAction", "reportClickSwitchView", "reportClickTab", "tabType", "reportCreateNewClick", "parentToken", "objToken", "target", "click", "templateId", "reportCreateNewFolderClick", "reportCreateNewFolderView", "reportCreateNewView", "reportCreateTemplateClick", "reportEnterModule", "reportEventByTag", "eventId", "reportEventWithParams", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "reportFileChooseView", "reportHeaderFilterClick", "path", "docValue", "operateValue", "reportHeaderFilterView", "reportHomePageClick", "currentSubView", "isBlank", "location", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "reportHomePageViewSwitchClick", "reportItemClick", "deepIndex", "reportLaunchTime", "reportLeftSlideClickEvent", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "action", "document", "reportMakeCopy", "status_name", "file_type", "obj_token", "reportNotificationClose", "nid", "reportNotificationOpen", "reportNotificationView", "reportOfflineCacheEvent", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "isConnect", "from", "reportPageClick", "event", "isFolder", "isSharedFolder", "isSubFolder", "folderLevel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZZILjava/lang/Boolean;Ljava/lang/String;)V", "reportPageItemClick", "reportPageView", "reportPageViewSwitchClick", "reportRemoveManualOffline", "reportRightClickMenuView", "containerObjToken", "isFollow", "reportSetShareFolderHidden", "success", "isHidden", "reportShowLeftSlide", "reportShowNavigationItem", "reportShowOnBoardingGuide", "newUser", "step", "reportSpaceFolderView", "reportTabSelect", "srcModule", "srcFolderId", "reportUploadProgressClick", "container_id", "page_token", "file_id", "upload_status", "reportUploadProgressView", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.a.a$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final String mo31404a(boolean z) {
            return z ? "grid" : "list";
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31413a(AbstractC5233x xVar, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            xVar.mo21078a(str, str2, str3);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31412a(AbstractC5233x xVar, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "eventId");
            Intrinsics.checkParameterIsNotNull(str2, "tag");
            xVar.mo21079a(str, xVar.mo21083b(str2));
            xVar.mo21087d(str2);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31415a(AbstractC5233x xVar, String str, String str2, String str3, Document document) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str3, "tag");
            Intrinsics.checkParameterIsNotNull(document, "item");
            Companion aVar = this;
            aVar.m32547j(xVar, str3);
            aVar.mo31413a(xVar, str3, ShareHitPoint.f121868c, str);
            aVar.mo31413a(xVar, str3, "module", str2);
            aVar.mo31413a(xVar, str3, "file_type", C8275a.m34050a(document.mo32483t()));
            int t = document.mo32483t();
            C8275a aVar2 = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FILE");
            if (t == aVar2.mo32555b()) {
                String C = document.mo32377C();
                if (!(C == null || C.length() == 0)) {
                    aVar.mo31413a(xVar, str3, "sub_type", document.mo32377C());
                }
            }
            aVar.mo31413a(xVar, str3, "file_id", C13598b.m55197d(document.mo32472o()));
            String aj = document.aj();
            if (aj == null) {
                aj = "";
            }
            aVar.mo31413a(xVar, str3, HiAnalyticsConstant.HaKey.BI_KEY_APPID, aj);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31425a(String str) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = hashMap;
            if (str == null) {
                str = "";
            }
            String d = C13598b.m55197d(str);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(container_id ?: \"\")");
            hashMap2.put("container_id", d);
            hashMap2.put("container_type", "wiki");
            hashMap2.put("module", "wiki");
            hashMap2.put("sub_module", "null");
            hashMap2.put("app_form", "null");
            C13479a.m54772d("ListAnalysis", "report ccm_space_upload_progress_view, params: " + hashMap);
            C5234y.m21391b().mo21079a("ccm_space_upload_progress_view", hashMap2);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31429a(String str, String str2, String str3, String str4) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = hashMap;
            if (str == null) {
                str = "";
            }
            String d = C13598b.m55197d(str);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(container_id ?: \"\")");
            hashMap2.put("container_id", d);
            hashMap2.put("container_type", "wiki");
            hashMap2.put("is_upload_to_wiki", String.valueOf(true));
            hashMap2.put("click", "finish");
            hashMap2.put("target", "none");
            if (str4 == null) {
                str4 = "";
            }
            hashMap2.put("upload_status", str4);
            if (str2 == null) {
                str2 = "";
            }
            String d2 = C13598b.m55197d(str2);
            Intrinsics.checkExpressionValueIsNotNull(d2, "EncriptUtils.handleEncription(page_token ?: \"\")");
            hashMap2.put("page_token", d2);
            if (str3 == null) {
                str3 = "";
            }
            String d3 = C13598b.m55197d(str3);
            Intrinsics.checkExpressionValueIsNotNull(d3, "EncriptUtils.handleEncription(file_id ?: \"\")");
            hashMap2.put("file_id", d3);
            hashMap2.put("file_type", "file");
            hashMap2.put("module", "wiki");
            hashMap2.put("sub_module", "null");
            hashMap2.put("app_form", "null");
            C13479a.m54772d("ListAnalysis", "report ccm_space_upload_progress_click, params: " + hashMap);
            C5234y.m21391b().mo21079a("ccm_space_upload_progress_click", hashMap2);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31414a(AbstractC5233x xVar, String str, String str2, String str3, int i, String str4) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str3, "status_name");
            Intrinsics.checkParameterIsNotNull(str4, "obj_token");
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121868c, str);
            hashMap.put("module", str2);
            hashMap.put("status_name", str3);
            hashMap.put("action", "make_a_copy");
            String a = C8275a.m34050a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(file_type)");
            hashMap.put("file_type", a);
            String d = C13598b.m55197d(str4);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(obj_token)");
            hashMap.put("file_id", d);
            xVar.mo21079a("client_content_management", hashMap);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31422a(AbstractC5233x xVar, boolean z, String str, Document document, String str2) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(document, "item");
            Intrinsics.checkParameterIsNotNull(str2, "result");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap2 = hashMap;
                hashMap2.put(ShareHitPoint.f121868c, z ? "grid_more" : "left_slide");
                hashMap2.put("module", str);
            }
            HashMap hashMap3 = hashMap;
            hashMap3.put("file_type", C8275a.m34050a(document.mo32483t()));
            int t = document.mo32483t();
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            if (t == aVar.mo32555b()) {
                String C = document.mo32377C();
                if (!(C == null || C.length() == 0)) {
                    hashMap3.put("sub_type", document.mo32377C());
                }
            }
            hashMap3.put("file_id", C13598b.m55197d(document.mo32472o()));
            hashMap3.put("action", "add_offline");
            hashMap3.put("status_name", str2);
            xVar.mo21079a("client_content_management", hashMap3);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31423a(AbstractC5233x xVar, boolean z, String str, String str2, int i, String str3) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str2, "objToken");
            Intrinsics.checkParameterIsNotNull(str3, "result");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap2 = hashMap;
                hashMap2.put(ShareHitPoint.f121868c, z ? "grid_more" : "left_slide");
                hashMap2.put("module", str);
            }
            HashMap hashMap3 = hashMap;
            String a = C8275a.m34050a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(type)");
            hashMap3.put("file_type", a);
            String d = C13598b.m55197d(str2);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(objToken)");
            hashMap3.put("file_id", d);
            hashMap3.put("action", "remove_offline");
            hashMap3.put("status_name", str3);
            xVar.mo21079a("client_content_management", hashMap3);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31418a(AbstractC5233x xVar, String str, HashMap<String, String> hashMap) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "eventId");
            xVar.mo21079a(str, hashMap);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31416a(AbstractC5233x xVar, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("sub_module", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("src_module", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("src_folder_id", C13598b.m55197d(str4));
            }
            xVar.mo21080a("enter_explorer_module", jSONObject);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31419a(AbstractC5233x xVar, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("module", str);
            hashMap2.put("view", z ? "grid" : "list");
            mo31418a(xVar, "click_view_switch", hashMap);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31411a(AbstractC5233x xVar, String str, Document document, int i) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            HashMap hashMap = new HashMap();
            String d = C13598b.m55197d(document != null ? document.mo32472o() : null);
            HashMap hashMap2 = hashMap;
            hashMap2.put("module", str);
            if (document == null) {
                Intrinsics.throwNpe();
            }
            String a = C8275a.m34050a(document.mo32483t());
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(item!!.type)");
            hashMap2.put("file_type", a);
            Intrinsics.checkExpressionValueIsNotNull(d, "fileId");
            hashMap2.put("file_id", d);
            hashMap2.put("location", String.valueOf(i + 1));
            hashMap2.put("folder_level", String.valueOf(0));
            hashMap2.put("sequence_num", String.valueOf(i));
            xVar.mo21079a("click_list_item", hashMap2);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31420a(AbstractC5233x xVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("action", z ? "expand" : "collapse");
            mo31418a(xVar, "click_shared_collapse", hashMap);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31417a(AbstractC5233x xVar, String str, String str2, boolean z, boolean z2, String str3) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str3, "obj_token");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put(ShareHitPoint.f121868c, str);
            hashMap2.put("module", str2);
            hashMap2.put("status_name", z ? "succeed" : "failed");
            hashMap2.put("action", z2 ? "set_folder_display" : "set_folder_hidden");
            C8275a aVar = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
            String a = aVar.mo32553a();
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.FOLDER.type");
            hashMap2.put("file_type", a);
            String d = C13598b.m55197d(str3);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(obj_token)");
            hashMap2.put("file_id", d);
            mo31418a(xVar, "client_content_management", hashMap);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31424a(C10917c cVar, boolean z, Document document, String str) {
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            Intrinsics.checkParameterIsNotNull(document, "document");
            Intrinsics.checkParameterIsNotNull(str, "from");
            if (!z) {
                AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238001b(new C8141a(document, str), C8142b.f21731a);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31421a(AbstractC5233x xVar, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("onboarding_module", z ? "home_onboarding_newbanner" : "home_onboarding_oldbanner");
            jSONObject.put("step_index", i);
            xVar.mo21080a("show_onboarding_guide_mobile", jSONObject);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31430a(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str2, "subModule");
            Intrinsics.checkParameterIsNotNull(str3, "click");
            Intrinsics.checkParameterIsNotNull(str4, "target");
            Intrinsics.checkParameterIsNotNull(str5, "currentSubView");
            C8275a aVar = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
            mo31434a(str, str2, str3, str4, str5, "", aVar.mo32555b(), "", null, "");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31434a(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, Boolean bool, String str8) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str2, "subModule");
            Intrinsics.checkParameterIsNotNull(str3, "click");
            Intrinsics.checkParameterIsNotNull(str4, "target");
            Intrinsics.checkParameterIsNotNull(str5, "currentSubView");
            mo31437a("ccm_space_home_page_click", str, str2, str3, str4, str5, str6, i, str7, "", false, false, false, 0, bool, str8);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31437a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, boolean z, boolean z2, boolean z3, int i2, Boolean bool, String str10) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str4, "click");
            Intrinsics.checkParameterIsNotNull(str5, "target");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            aVar.m32544a(jSONObject, str2, str3, str7, i, str8, str9, "folder");
            jSONObject.put("click", str4);
            jSONObject.put("target", str5);
            jSONObject.put("view_type", aVar.mo31404a(C8292f.f22432b));
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("current_sub_view", str6);
            }
            jSONObject.put("is_folder", z);
            jSONObject.put("is_shared_folder", z2);
            jSONObject.put("is_subfolder", z3);
            jSONObject.put("folder_lever", i2);
            if (bool != null) {
                jSONObject.put("is_blank", String.valueOf(bool.booleanValue()));
            }
            if (!TextUtils.isEmpty(str10)) {
                jSONObject.put("location", str10);
            }
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a(str, jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31427a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str2, "subModule");
            Intrinsics.checkParameterIsNotNull(str3, "currentSubView");
            C8275a aVar = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
            mo31431a("ccm_space_home_page_click", str, str2, str3, "", aVar.mo32555b(), "", false, false, false, 0, "");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31431a(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, boolean z2, boolean z3, int i2, String str7) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            aVar.m32544a(jSONObject, str2, str3, str5, i, str6, str7, "folder");
            jSONObject.put("click", "view_switch");
            jSONObject.put("target", "none");
            jSONObject.put("switch_to", aVar.mo31404a(C8292f.f22432b));
            jSONObject.put("view_type", aVar.mo31404a(!C8292f.f22432b));
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("current_sub_view", str4);
            }
            jSONObject.put("is_folder", String.valueOf(z));
            jSONObject.put("is_shared_folder", String.valueOf(z2));
            jSONObject.put("is_subfolder", String.valueOf(z3));
            jSONObject.put("folder_lever", i2);
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a(str, jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31435a(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, boolean z, boolean z2, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str6, "objToken");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            aVar.m32544a(jSONObject, str2, str3, str6, i, str7, str5, "folder");
            jSONObject.put("click", "list_item");
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("current_sub_view", str4);
            }
            jSONObject.put("view_type", aVar.mo31404a(C8292f.f22432b));
            C8275a aVar2 = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FOLDER");
            jSONObject.put("target", i == aVar2.mo32555b() ? "ccm_space_folder_view" : "ccm_docs_page_view");
            C8275a aVar3 = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.FOLDER");
            jSONObject.put("is_folder", String.valueOf(i == aVar3.mo32555b()));
            jSONObject.put("is_shared_folder", String.valueOf(z));
            jSONObject.put("is_subfolder", String.valueOf(z2));
            jSONObject.put("folder_lever", i2);
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a(str, jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31428a(String str, String str2, String str3, int i, String str4, String str5, String str6, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str3, "objToken");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            aVar.m32544a(jSONObject, str, str2, str3, i, str4, str5, str6);
            jSONObject.put("is_shared_folder", String.valueOf(z));
            jSONObject.put("is_follow", String.valueOf(z2));
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_right_click_menu_view", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31432a(String str, String str2, String str3, String str4, String str5, String str6) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FOLDER");
            aVar.m32544a(jSONObject, str2, str3, str4, aVar2.mo32555b(), "", str4, "folder");
            jSONObject.put("click", str);
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("doc_value", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("operate_value", str6);
            }
            String b = aVar.mo31439b(str2);
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("target", b);
            }
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_header_filter_click", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31426a(String str, String str2, int i, String str3, String str4, String str5) {
            String str6;
            String str7;
            Intrinsics.checkParameterIsNotNull(str, "module");
            C8275a aVar = C8275a.f22371d;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
            if (i != aVar.mo32555b()) {
                C8275a aVar2 = C8275a.f22372e;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
                if (i == aVar2.mo32555b()) {
                    str7 = "sheets";
                } else {
                    C8275a aVar3 = C8275a.f22374g;
                    Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
                    if (i == aVar3.mo32555b()) {
                        str7 = "mindnotes";
                    } else {
                        C8275a aVar4 = C8275a.f22373f;
                        Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.BITABLE");
                        if (i == aVar4.mo32555b()) {
                            str7 = "bitable";
                        } else {
                            C8275a aVar5 = C8275a.f22378k;
                            Intrinsics.checkExpressionValueIsNotNull(aVar5, "DocumentType.DOCX");
                            if (i == aVar5.mo32555b()) {
                                str7 = "docx";
                            }
                        }
                    }
                }
                str6 = str7;
                mo31436a(str, str2, str6, str5, "", str3, str4, i);
            }
            str6 = "docs";
            mo31436a(str, str2, str6, str5, "", str3, str4, i);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31436a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str3, "click");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            aVar.m32544a(jSONObject, str, str2, str7, i, "", str6, "folder");
            jSONObject.put("click", str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("target", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("templates_id", str5);
            }
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_create_new_click", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31433a(String str, String str2, String str3, String str4, String str5, String str6, int i) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str3, "click");
            mo31436a(str, str2, str3, "ccm_docs_page_view", str4, str5, str6, i);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31438a(String str, String str2, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FOLDER");
            aVar.m32544a(jSONObject, str, "", str2, aVar2.mo32555b(), "", str2, "folder");
            jSONObject.put("view_type", aVar.mo31404a(C8292f.f22432b));
            jSONObject.put("is_shared_folder", String.valueOf(z));
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_folder_view", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final AbstractC5233x mo31403a() {
            return C5234y.m21391b();
        }

        /* renamed from: b */
        private final long m32545b() {
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "cal");
            instance.setTimeInMillis(m32546c() - ((long) 86400000));
            Date time = instance.getTime();
            Intrinsics.checkExpressionValueIsNotNull(time, "cal.time");
            return time.getTime();
        }

        /* renamed from: c */
        private final long m32546c() {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(14, 0);
            Intrinsics.checkExpressionValueIsNotNull(instance, "cal");
            Date time = instance.getTime();
            Intrinsics.checkExpressionValueIsNotNull(time, "cal.time");
            return time.getTime();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.list.a.a$a$b */
        public static final class C8142b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C8142b f21731a = new C8142b();

            C8142b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("ListAnalysis", "reportOfflineCacheEvent ", th);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31405a(AbstractC5233x xVar) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Companion aVar = this;
            aVar.m32547j(xVar, "list_file");
            aVar.mo31413a(xVar, "list_file", "start_time", String.valueOf(System.currentTimeMillis()));
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.list.a.a$a$a */
        public static final class C8141a<T> implements Consumer<Boolean> {

            /* renamed from: a */
            final /* synthetic */ Document f21729a;

            /* renamed from: b */
            final /* synthetic */ String f21730b;

            C8141a(Document document, String str) {
                this.f21729a = document;
                this.f21730b = str;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                HashMap hashMap = new HashMap();
                hashMap.put("doc_has_cache", String.valueOf(this.f21729a.mo32464l() ? 1 : 0));
                String a = C8275a.m34050a(this.f21729a.mo32483t());
                Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(document.type)");
                hashMap.put("file_type", a);
                hashMap.put("doc_from", this.f21730b);
                C5234y.m21391b().mo21079a("dev_performance_show_list_item", hashMap);
            }
        }

        /* renamed from: a */
        private final String m32543a(Document document) {
            String str;
            if (document == null || TextUtils.isEmpty(document.mo32492x())) {
                return "";
            }
            long parseLong = Long.parseLong(document.mo32492x());
            Companion aVar = this;
            if (((long) 1000) * parseLong > aVar.m32546c()) {
                str = "today";
            } else if (parseLong * ((long) 100) > aVar.m32545b()) {
                str = "yesterday";
            } else {
                str = "earlier";
            }
            return str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[RETURN, SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo31439b(java.lang.String r2) {
            /*
            // Method dump skipped, instructions count: 174
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.analysis.ListAnalysis.Companion.mo31439b(java.lang.String):java.lang.String");
        }

        /* renamed from: j */
        private final void m32547j(AbstractC5233x xVar, String str) {
            xVar.mo21077a(str);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo31440b(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            xVar.mo21080a("launch_web", jSONObject);
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo31445c(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("module", str);
            mo31418a(xVar, "click_filter_board", hashMap);
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo31447d(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            HashMap hashMap = new HashMap();
            hashMap.put("module", str);
            xVar.mo21079a("click_search", hashMap);
        }

        /* renamed from: f */
        public final void mo31451f(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("module", str);
            mo31418a(xVar, "click_folder_all", hashMap);
        }

        @JvmStatic
        /* renamed from: g */
        public final void mo31453g(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("function_type", str);
            xVar.mo21080a("icon_show", jSONObject);
        }

        @JvmStatic
        /* renamed from: h */
        public final void mo31455h(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("function_type", str);
            xVar.mo21080a("icon_click", jSONObject);
        }

        @JvmStatic
        /* renamed from: i */
        public final void mo31457i(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "tabType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tab_type", str);
            xVar.mo21080a("tab_click", jSONObject);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31406a(AbstractC5233x xVar, int i) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Companion aVar = this;
            aVar.m32547j(xVar, "open_file");
            aVar.mo31413a(xVar, "open_file", "start_time", String.valueOf(SystemClock.uptimeMillis()));
            aVar.mo31413a(xVar, "open_file", "file_type", C8275a.m34050a(i));
            aVar.m32547j(xVar, "openDoc");
            aVar.mo31413a(xVar, "openDoc", "start_time", String.valueOf(SystemClock.uptimeMillis()));
        }

        @JvmStatic
        /* renamed from: e */
        public final void mo31449e(AbstractC5233x xVar, String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "tag");
            String a = xVar.mo21075a(str, "start_time");
            String str2 = a;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22258a(str, (float) (SystemClock.uptimeMillis() - C13721c.m55642a(a, 0L)));
                xVar.mo21087d(str);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31408a(AbstractC5233x xVar, String str) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            mo31416a(xVar, str, (String) null, (String) null, (String) null);
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo31448d(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FOLDER");
            aVar.m32544a(jSONObject, str, str2, "", aVar2.mo32555b(), "", str3, "folder");
            jSONObject.put("is_shared_folder", String.valueOf(false));
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_create_new_folder_view", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo31441b(AbstractC5233x xVar, String str, Document document) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(document, "item");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("module", str);
            String a = C8275a.m34050a(document.mo32483t());
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(item.type)");
            hashMap2.put("file_type", a);
            String aj = document.aj();
            if (aj == null) {
                aj = "";
            }
            hashMap2.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, aj);
            mo31418a(xVar, "click_grid_more", hashMap);
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo31446c(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.UNKNOWN");
            aVar.m32544a(jSONObject, str, str2, "", aVar2.mo32555b(), "", str3, "folder");
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_create_new_view", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: e */
        public final void mo31450e(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FILE");
            aVar.m32544a(jSONObject, str, str2, "", aVar2.mo32555b(), "", str3, "folder");
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_file_choose_view", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: f */
        public final void mo31452f(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "nid");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str3, "subModule");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.UNKNOWN");
            aVar.m32544a(jSONObject, str2, str3, "", aVar2.mo32555b(), "", "", "");
            jSONObject.put("location", "android_lark");
            jSONObject.put("announcement_id", str);
            C13479a.m54772d("ListAnalysis", "reportNotificationView, params = " + jSONObject);
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_announcement_view", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: g */
        public final void mo31454g(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "nid");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str3, "subModule");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.UNKNOWN");
            aVar.m32544a(jSONObject, str2, str3, "", aVar2.mo32555b(), "", "", "");
            jSONObject.put("location", "android_lark");
            jSONObject.put("announcement_id", str);
            jSONObject.put("click", "open");
            jSONObject.put("target", "none");
            C13479a.m54772d("ListAnalysis", "reportNotificationOpen, params = " + jSONObject);
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_announcement_click", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: h */
        public final void mo31456h(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "nid");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str3, "subModule");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.UNKNOWN");
            aVar.m32544a(jSONObject, str2, str3, "", aVar2.mo32555b(), "", "", "");
            jSONObject.put("location", "android_lark");
            jSONObject.put("announcement_id", str);
            jSONObject.put("click", "close");
            jSONObject.put("target", "none");
            C13479a.m54772d("ListAnalysis", "reportNotificationClose, params = " + jSONObject);
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_announcement_click", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo31442b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FOLDER");
            aVar.m32544a(jSONObject, str, str2, str3, aVar2.mo32555b(), "", "", "");
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_header_filter_view", jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31410a(AbstractC5233x xVar, String str, Document document) {
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(document, "item");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("module", str);
            String a = C8275a.m34050a(document.mo32483t());
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(item.type)");
            hashMap2.put("file_type", a);
            String aj = document.aj();
            if (aj == null) {
                aj = "";
            }
            hashMap2.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, aj);
            mo31418a(xVar, "show_left_slide", hashMap);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo31443b(String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            Intrinsics.checkParameterIsNotNull(str2, "module");
            Intrinsics.checkParameterIsNotNull(str3, "subModule");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.UNKNOWN");
            aVar.m32544a(jSONObject, str2, str3, "", aVar2.mo32555b(), "", "", "");
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("current_sub_view", str4);
            }
            jSONObject.put("view_type", aVar.mo31404a(C8292f.f22432b));
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a(str, jSONObject, "");
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo31444b(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str3, "click");
            JSONObject jSONObject = new JSONObject();
            Companion aVar = this;
            C8275a aVar2 = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FOLDER");
            aVar.m32544a(jSONObject, str, str2, "", aVar2.mo32555b(), "", str5, "folder");
            jSONObject.put("is_shared_folder", String.valueOf(false));
            jSONObject.put("click", str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("target", str4);
            }
            AbstractC5233x a = aVar.mo31403a();
            if (a != null) {
                a.mo21081a("ccm_space_create_new_folder_click", jSONObject, "");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x006c A[Catch:{ Exception -> 0x00fe }] */
        @kotlin.jvm.JvmStatic
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo31407a(com.bytedance.ee.bear.contract.AbstractC5233x r7, com.bytedance.ee.bear.contract.AccountService.Account r8, java.lang.String r9, com.bytedance.ee.bear.list.dto.Document r10, java.lang.String r11, java.lang.String r12) {
            /*
            // Method dump skipped, instructions count: 265
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.analysis.ListAnalysis.Companion.mo31407a(com.bytedance.ee.bear.contract.x, com.bytedance.ee.bear.contract.AccountService$Account, java.lang.String, com.bytedance.ee.bear.list.dto.Document, java.lang.String, java.lang.String):void");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31409a(AbstractC5233x xVar, String str, int i, boolean z, Document document, int i2) {
            String str2;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(document, "item");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            String d = C13598b.m55197d(document.mo32472o());
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(item.objToken)");
            hashMap2.put("file_id", d);
            hashMap2.put("module", str);
            hashMap2.put("location", String.valueOf(i + 1));
            hashMap2.put("sequence_num", String.valueOf(i));
            hashMap2.put("folder_level", String.valueOf(i2));
            Companion aVar = this;
            hashMap2.put("group", aVar.m32543a(document));
            String a = C8275a.m34050a(document.mo32483t());
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(item.type)");
            hashMap2.put("file_type", a);
            int t = document.mo32483t();
            C8275a aVar2 = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FILE");
            if (t == aVar2.mo32555b()) {
                String C = document.mo32377C();
                if (C == null || C.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    String C2 = document.mo32377C();
                    Intrinsics.checkExpressionValueIsNotNull(C2, "item.subType");
                    hashMap2.put("sub_type", C2);
                }
            }
            if (z) {
                str2 = "grid";
            } else {
                str2 = "list";
            }
            hashMap2.put("view", str2);
            String aj = document.aj();
            if (aj == null) {
                aj = "";
            }
            hashMap2.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, aj);
            aVar.mo31418a(xVar, "click_list_item", hashMap);
        }

        /* renamed from: a */
        private final void m32544a(JSONObject jSONObject, String str, String str2, String str3, int i, String str4, String str5, String str6) {
            jSONObject.put("module", str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "null";
            }
            jSONObject.put("sub_module", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("file_id", C13598b.m55197d(str3));
            } else {
                jSONObject.put("file_id", "null");
            }
            C8275a aVar = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
            if (i != aVar.mo32555b()) {
                jSONObject.put("file_type", C8275a.m34050a(i));
            } else {
                jSONObject.put("file_type", "null");
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = "null";
            }
            jSONObject.put("sub_file_type", str4);
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("container_id", C13598b.m55197d(str5));
            } else {
                jSONObject.put("container_id", "null");
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("container_type", str6);
            } else {
                jSONObject.put("container_type", "null");
            }
            jSONObject.put("app_form", "null");
        }
    }
}
