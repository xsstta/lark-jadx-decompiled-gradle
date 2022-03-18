package com.ss.android.vc.meeting.module.reaction.livewidget;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.e */
public class C62844e {

    /* renamed from: a */
    private VCLinkEmojiTextView f158222a;

    /* renamed from: b */
    private List<String> f158223b = new ArrayList();

    /* renamed from: c */
    private boolean f158224c = false;

    /* renamed from: d */
    private boolean f158225d = false;

    /* renamed from: e */
    private List<String> f158226e;

    /* renamed from: a */
    public boolean mo217151a() {
        return this.f158225d;
    }

    /* renamed from: a */
    public void mo217150a(boolean z) {
        this.f158225d = z;
    }

    /* renamed from: a */
    public void mo217149a(List<String> list) {
        CollectionUtils.resetToList(this.f158223b, list);
    }

    /* renamed from: b */
    public void mo217153b(List<String> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.f158226e = list;
        }
    }

    public C62844e(VCLinkEmojiTextView vCLinkEmojiTextView) {
        this.f158222a = vCLinkEmojiTextView;
    }

    /* renamed from: a */
    public boolean mo217152a(String str) {
        return this.f158223b.contains(str);
    }

    /* renamed from: b */
    public boolean mo217154b(String str) {
        if (CollectionUtils.isEmpty(this.f158226e)) {
            return false;
        }
        return this.f158226e.contains(str);
    }

    /* renamed from: c */
    public boolean mo217155c(String str) {
        if (TextUtils.isEmpty(this.f158222a.getCurrentUserId()) || this.f158222a.getCurrentUserId().equals(str) || mo217154b(str) || str.equals("all") || !mo217151a()) {
            return false;
        }
        return true;
    }
}
