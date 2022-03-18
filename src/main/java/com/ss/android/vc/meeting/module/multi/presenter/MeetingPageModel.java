package com.ss.android.vc.meeting.module.multi.presenter;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.LinkedList;
import java.util.List;

public class MeetingPageModel {

    /* renamed from: a */
    public static MeetingPageModel f157340a = new MeetingPageModel("", 0, PageType.NORMAL);

    /* renamed from: b */
    private List<C62526c> f157341b = new LinkedList();

    /* renamed from: c */
    private PageType f157342c;

    /* renamed from: d */
    private int f157343d;

    /* renamed from: e */
    private boolean f157344e;

    public enum PageType {
        NORMAL,
        SCREEN
    }

    /* renamed from: a */
    public List<C62526c> mo216174a() {
        return this.f157341b;
    }

    /* renamed from: c */
    public int mo216179c() {
        return this.f157343d;
    }

    /* renamed from: d */
    public boolean mo216180d() {
        return this.f157344e;
    }

    /* renamed from: b */
    public boolean mo216178b() {
        if (this.f157342c == PageType.SCREEN) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo216182f() {
        if (CollectionUtils.isEmpty(this.f157341b)) {
            return 0;
        }
        return this.f157341b.size();
    }

    /* renamed from: e */
    public String mo216181e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f157342c.toString());
        for (C62526c cVar : this.f157341b) {
            sb.append("#");
            sb.append(cVar.mo216201f());
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f157341b.size(); i++) {
            sb.append("\t@[Grid-");
            sb.append(i);
            sb.append("]");
            sb.append(this.f157341b.get(i).toString());
            sb.append("\n");
        }
        return "MeetingPageModel {mPage=" + this.f157343d + ", mPageType=" + this.f157342c + ", mGrids=\n" + sb.toString() + '}';
    }

    /* renamed from: a */
    public void mo216176a(boolean z) {
        this.f157344e = z;
    }

    /* renamed from: a */
    public void mo216175a(List<C62526c> list) {
        this.f157341b.clear();
        this.f157341b.addAll(list);
    }

    /* renamed from: a */
    public boolean mo216177a(String str) {
        if (mo216178b()) {
            return false;
        }
        for (C62526c cVar : this.f157341b) {
            if (ParticipantUtil.m248716a(cVar.mo216208m(), str)) {
                return true;
            }
        }
        return false;
    }

    public MeetingPageModel(String str, int i, PageType pageType) {
        this.f157343d = i;
        this.f157342c = pageType;
    }
}
