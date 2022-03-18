package com.ss.android.lark.threadwindow.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadtab.p2757a.C55976a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.threadwindow.fragment.h */
public class C56093h extends C55976a {

    /* renamed from: d */
    private final Map<Integer, Integer> f138707d;

    /* renamed from: a */
    public void mo191372a(boolean z, boolean z2, List<ThreadMessageVO> list) {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191319a(z, z2, list);
        }
    }

    /* renamed from: a */
    public void mo191371a(boolean z) {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo67284a(z);
        }
    }

    /* renamed from: a */
    public void mo191370a(List<MessageInfo> list) {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191321b(list);
        }
    }

    /* renamed from: a */
    public void mo191363a() {
        for (AbstractC56088f fVar : this.f138328a) {
            if (fVar != null) {
                fVar.mo191304y();
            }
        }
    }

    /* renamed from: b */
    public void mo191373b() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191288b(0);
        }
    }

    /* renamed from: c */
    public void mo191377c() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191332r();
        }
    }

    /* renamed from: e */
    public void mo191380e() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191328n();
        }
    }

    /* renamed from: f */
    public void mo191381f() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191330p();
        }
    }

    /* renamed from: g */
    public void mo191382g() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191331q();
        }
    }

    /* renamed from: h */
    public void mo191383h() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191334t();
        }
    }

    /* renamed from: i */
    public void mo191384i() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191335u();
        }
    }

    /* renamed from: j */
    public void mo191385j() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191337w();
        }
    }

    /* renamed from: d */
    public void mo191379d() {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191327m();
        }
    }

    /* renamed from: d */
    private int m218540d(int i) {
        Integer num = this.f138707d.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public void mo191364a(int i) {
        if (i == 0) {
            int d = m218540d(0);
            if (d != -1) {
                ((AbstractC56088f) this.f138328a.get(d)).mo191333s();
                return;
            }
            return;
        }
        AbstractC56088f fVar = (AbstractC56088f) this.f138328a.get(1);
        if (fVar instanceof AbstractC56085c) {
            ((AbstractC56085c) fVar).mo191350f(i);
        }
    }

    /* renamed from: b */
    public void mo191374b(int i) {
        ((AbstractC56088f) this.f138328a.get(0)).mo191300d(i);
        if (this.f138328a.size() > 1) {
            ((AbstractC56088f) this.f138328a.get(1)).mo191300d(i);
        }
    }

    /* renamed from: c */
    public void mo191378c(int i) {
        Fragment fragment = (Fragment) this.f138328a.get(0);
        if (fragment instanceof BaseTopicFragment) {
            ((BaseTopicFragment) fragment).mo191272a(i);
        }
    }

    /* renamed from: b */
    public void mo191376b(boolean z) {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191322b(z);
        } else {
            Log.m165389i("TopicFragmentPageAdapter", "readAllThreadCurrentPage failed, index is -1");
        }
    }

    /* renamed from: a */
    public void mo191369a(MessageInfo messageInfo) {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191317a(messageInfo);
        }
    }

    /* renamed from: a */
    public void mo191365a(int i, int i2) {
        AbstractC56088f fVar = (AbstractC56088f) this.f138328a.get(1);
        if (fVar instanceof AbstractC56085c) {
            ((AbstractC56085c) fVar).mo191345a(i, i2);
        }
    }

    /* renamed from: b */
    public void mo191375b(int i, int i2) {
        ((AbstractC56088f) this.f138328a.get(0)).mo191295c(i2);
        if (this.f138328a.size() > 1) {
            Fragment fragment = (Fragment) this.f138328a.get(1);
            if (fragment instanceof AbstractC56085c) {
                ((AbstractC56085c) fragment).mo191348b(i, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo191367a(int i, boolean z) {
        int d = m218540d(0);
        if (d != -1) {
            ((AbstractC56088f) this.f138328a.get(d)).mo191315a(i, z);
        }
    }

    /* renamed from: a */
    public void mo191366a(int i, int i2, boolean z) {
        AbstractC56088f fVar = (AbstractC56088f) this.f138328a.get(1);
        if (fVar instanceof AbstractC56085c) {
            ((AbstractC56085c) fVar).mo191346a(i, i2, z);
        }
    }

    public C56093h(FragmentManager fragmentManager, List<String> list, List<AbstractC56088f> list2, Map<Integer, Integer> map) {
        super(fragmentManager, list);
        this.f138328a.addAll(list2);
        this.f138707d = map;
    }

    /* renamed from: a */
    public void mo191368a(int i, boolean z, boolean z2, List<ThreadMessageVO> list) {
        AbstractC56088f fVar = (AbstractC56088f) this.f138328a.get(1);
        if (fVar instanceof AbstractC56085c) {
            ((AbstractC56085c) fVar).mo191347a(i, z, z2, list);
        }
    }
}
