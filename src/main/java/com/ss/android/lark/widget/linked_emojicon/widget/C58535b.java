package com.ss.android.lark.widget.linked_emojicon.widget;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.b */
public class C58535b {

    /* renamed from: a */
    private LinkEmojiTextView f144494a;

    /* renamed from: b */
    private List<String> f144495b = new ArrayList();

    /* renamed from: c */
    private boolean f144496c = false;

    /* renamed from: d */
    private boolean f144497d = false;

    /* renamed from: e */
    private List<String> f144498e;

    /* renamed from: a */
    public boolean mo198437a() {
        return this.f144497d;
    }

    /* renamed from: a */
    public void mo198436a(boolean z) {
        this.f144497d = z;
    }

    /* renamed from: a */
    public void mo198435a(List<String> list) {
        CollectionUtils.resetToList(this.f144495b, list);
    }

    /* renamed from: b */
    public void mo198439b(List<String> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.f144498e = list;
        }
    }

    public C58535b(LinkEmojiTextView linkEmojiTextView) {
        this.f144494a = linkEmojiTextView;
    }

    /* renamed from: a */
    public boolean mo198438a(String str) {
        return this.f144495b.contains(str);
    }

    /* renamed from: b */
    public boolean mo198440b(String str) {
        if (CollectionUtils.isEmpty(this.f144498e)) {
            return false;
        }
        return this.f144498e.contains(str);
    }

    /* renamed from: c */
    public boolean mo198441c(String str) {
        if (TextUtils.isEmpty(this.f144494a.getCurrentUserId()) || this.f144494a.getCurrentUserId().equals(str) || mo198440b(str) || str.equals("all") || !mo198437a()) {
            return false;
        }
        return true;
    }
}
