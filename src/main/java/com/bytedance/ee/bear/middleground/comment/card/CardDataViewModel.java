package com.bytedance.ee.bear.middleground.comment.card;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.architecture.DisposableBase;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020\u0011J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00192\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010,\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%J\u0016\u0010-\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000102J\u0010\u00103\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000104J\u0016\u00105\u001a\u0002062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u00107\u001a\u00020\f2\u0006\u0010$\u001a\u00020%J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\u0006\u00108\u001a\u00020\u0006J\u000e\u00109\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010:\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0011J\b\u0010;\u001a\u000206H\u0016J\u0010\u0010<\u001a\u0002062\b\b\u0002\u0010\u001f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR\u000e\u0010\"\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CardDataViewModel;", "Lcom/bytedance/ee/bear/architecture/DisposableBase;", "()V", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "inputText", "", "getInputText", "()Ljava/lang/String;", "setInputText", "(Ljava/lang/String;)V", "isFullScreen", "", "()Z", "setFullScreen", "(Z)V", "panelHeight", "", "getPanelHeight", "()Ljava/lang/Integer;", "setPanelHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "showDataLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "getShowDataLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setShowDataLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "targetId", "getTargetId", "setTargetId", "token", "getBottomViewVisibility", "resource", "Landroid/content/res/Resources;", "getCommentBean", "position", "getCommentDetail", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "getCommentId", "getCommentTitle", "getGuideLineEnd", "getInputHint", ShareHitPoint.f121869d, "", "getTargetPosition", "viewPager", "Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerViewPager;", "getTargetPosition2", "Lcom/bytedance/ee/bear/widgets/viewpager/viewpager2/widget/ViewPager2;", "initViewModel", "", "inputEnable", "text", "isLastPosition", "isUnSubmitComment", "onCleared", "reCreate", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.card.d */
public final class CardDataViewModel extends DisposableBase {

    /* renamed from: a */
    public static final Companion f24615a = new Companion(null);

    /* renamed from: b */
    private String f24616b = "";

    /* renamed from: c */
    private DataControl f24617c;

    /* renamed from: d */
    private String f24618d = "";

    /* renamed from: e */
    private boolean f24619e;

    /* renamed from: f */
    private C1177w<List<CommentBean>> f24620f;

    /* renamed from: g */
    private Integer f24621g;

    /* renamed from: h */
    private String f24622h = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CardDataViewModel$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo34824b() {
        return this.f24619e;
    }

    /* renamed from: c */
    public final C1177w<List<CommentBean>> mo34825c() {
        return this.f24620f;
    }

    /* renamed from: d */
    public final Integer mo34828d() {
        return this.f24621g;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.d$b */
    public static final class RunnableC9166b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CardDataViewModel f24623a;

        RunnableC9166b(CardDataViewModel dVar) {
            this.f24623a = dVar;
        }

        public final void run() {
            C1177w<List<CommentBean>> c = this.f24623a.mo34825c();
            if (c != null) {
                c.mo5929b((List<CommentBean>) null);
            }
        }
    }

    @Override // com.bytedance.ee.bear.architecture.DisposableBase
    /* renamed from: a */
    public void mo16330a() {
        super.mo16330a();
        C13742g.m55711d(new RunnableC9166b(this));
        C13479a.m54764b("CardDataViewModel", "onClear");
    }

    /* renamed from: a */
    public final void mo34817a(Integer num) {
        this.f24621g = num;
    }

    /* renamed from: a */
    public final void mo34818a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f24618d = str;
    }

    /* renamed from: a */
    public final void mo34820a(boolean z) {
        this.f24619e = z;
    }

    /* renamed from: a */
    public final int mo34811a(Resources resources) {
        Intrinsics.checkParameterIsNotNull(resources, "resource");
        if (resources.getConfiguration().orientation == 2) {
            return 8;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo34821b(Resources resources) {
        Intrinsics.checkParameterIsNotNull(resources, "resource");
        if (resources.getConfiguration().orientation == 2) {
            return 0;
        }
        return resources.getDimensionPixelSize(R.dimen.space_kit_len_52);
    }

    /* renamed from: c */
    public final boolean mo34826c(int i) {
        boolean z;
        List<CommentBean> b;
        CommentBean commentBean;
        C1177w<List<CommentBean>> wVar = this.f24620f;
        if (wVar == null || (b = wVar.mo5927b()) == null || (commentBean = b.get(i)) == null) {
            z = false;
        } else {
            z = commentBean.isUnSubmitComment();
        }
        return !z;
    }

    /* renamed from: d */
    public final boolean mo34829d(int i) {
        List<CommentBean> b;
        C1177w<List<CommentBean>> wVar = this.f24620f;
        if (wVar == null || (b = wVar.mo5927b()) == null || b.size() != i + 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final String mo34830e(int i) {
        List<CommentBean> b;
        CommentBean commentBean;
        String comment_id;
        try {
            C1177w<List<CommentBean>> wVar = this.f24620f;
            if (wVar == null || (b = wVar.mo5927b()) == null || (commentBean = b.get(i)) == null || (comment_id = commentBean.getComment_id()) == null) {
                return "";
            }
            return comment_id;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    public final CommentBean mo34831f(int i) {
        List<CommentBean> b;
        C1177w<List<CommentBean>> wVar = this.f24620f;
        if (wVar == null || (b = wVar.mo5927b()) == null) {
            return null;
        }
        return b.get(i);
    }

    /* renamed from: b */
    public final void mo34823b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        DataControl cVar = this.f24617c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataControl");
        }
        this.f24620f = cVar.mo34708b();
        this.f24618d = str;
    }

    /* renamed from: c */
    public final boolean mo34827c(Resources resources) {
        Intrinsics.checkParameterIsNotNull(resources, "resource");
        if (resources.getConfiguration().orientation != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo34812a(FixPageTransformerViewPager fixPageTransformerViewPager) {
        List<CommentBean> b;
        if (!TextUtils.isEmpty(this.f24618d)) {
            C1177w<List<CommentBean>> wVar = this.f24620f;
            if (wVar == null || (b = wVar.mo5927b()) == null) {
                return 0;
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "showDataLiveData?.value ?: return 0");
            int size = b.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(b.get(i).getComment_id(), this.f24618d)) {
                    this.f24618d = "";
                    return i;
                }
            }
            this.f24618d = "";
            return b.size() - 1;
        } else if (fixPageTransformerViewPager != null) {
            return fixPageTransformerViewPager.getCurrentItem();
        } else {
            return 0;
        }
    }

    /* renamed from: b */
    public final String mo34822b(int i) {
        int i2;
        List<CommentBean> b;
        C1177w<List<CommentBean>> wVar = this.f24620f;
        if (wVar == null || (b = wVar.mo5927b()) == null) {
            i2 = 0;
        } else {
            i2 = b.size();
        }
        if (i2 == 0) {
            String string = C13615c.f35773a.getString(R.string.Doc_Facade_Comment);
            Intrinsics.checkExpressionValueIsNotNull(string, "ContextUtils.baseApplica…tring.Doc_Facade_Comment)");
            return string;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(i + 1));
        hashMap.put("count", String.valueOf(i2));
        String a = C10539a.m43640a(C13615c.f35773a, R.string.Doc_Comment_CommentCardTitle, hashMap);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(…ommentCardTitle, hashMap)");
        return a;
    }

    /* renamed from: a */
    public final int mo34813a(ViewPager2 viewPager2) {
        C1177w<List<CommentBean>> wVar;
        List<CommentBean> b;
        if (TextUtils.isEmpty(this.f24618d) || (wVar = this.f24620f) == null || (b = wVar.mo5927b()) == null) {
            return 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "showDataLiveData?.value ?: return 0");
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(b.get(i).getComment_id(), this.f24618d)) {
                this.f24618d = "";
                return i;
            }
        }
        this.f24618d = "";
        return b.size() - 1;
    }

    /* renamed from: a */
    public final List<CommentBean.CommentDetail> mo34816a(int i) {
        List<CommentBean> b;
        CommentBean commentBean;
        List<CommentBean.CommentDetail> comment_list;
        try {
            C1177w<List<CommentBean>> wVar = this.f24620f;
            if (wVar == null || (b = wVar.mo5927b()) == null || (commentBean = b.get(i)) == null || (comment_list = commentBean.getComment_list()) == null) {
                return new ArrayList();
            }
            return comment_list;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final String mo34814a(Resources resources, long j) {
        String str;
        Intrinsics.checkParameterIsNotNull(resources, "resource");
        if (resources.getConfiguration().orientation == 2) {
            String string = resources.getString(R.string.Doc_Comment_NotSupportInLandScape);
            Intrinsics.checkExpressionValueIsNotNull(string, "resource.getString(R.str…nt_NotSupportInLandScape)");
            return string;
        }
        if (j == 1) {
            str = resources.getString(R.string.Doc_Comment_ReplyCommentDot);
        } else {
            str = resources.getString(R.string.Doc_Comment_Comment);
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "if (type == CommentType.…ring.Doc_Comment_Comment)");
        return str;
    }

    /* renamed from: a */
    public final String mo34815a(Resources resources, String str) {
        Intrinsics.checkParameterIsNotNull(resources, "resource");
        Intrinsics.checkParameterIsNotNull(str, "text");
        if (resources.getConfiguration().orientation != 2) {
            return this.f24622h;
        }
        this.f24622h = str;
        return "";
    }

    /* renamed from: a */
    public final void mo34819a(String str, DataControl cVar) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        this.f24616b = str;
        this.f24617c = cVar;
        this.f24620f = cVar.mo34708b();
    }
}
