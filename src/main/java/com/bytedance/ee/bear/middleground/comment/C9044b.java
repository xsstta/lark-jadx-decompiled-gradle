package com.bytedance.ee.bear.middleground.comment;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2;
import com.bytedance.ee.bear.middleground.comment.card.AnimatorUtils;
import com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.CommentBuilder;
import com.bytedance.ee.bear.middleground.comment.export.IAnimatorSettings;
import com.bytedance.ee.bear.middleground.comment.export.ICardAdapter;
import com.bytedance.ee.bear.middleground.comment.export.IComment;
import com.bytedance.ee.bear.middleground.comment.export.IDataTransformer;
import com.bytedance.ee.bear.middleground.comment.export.IReactionHelper;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity;
import com.bytedance.ee.bear.middleground.comment.p443a.C8969a;
import com.bytedance.ee.bear.middleground.comment.p449g.AbstractC9234g;
import com.bytedance.ee.bear.middleground.comment.uitls.CommentTo;
import com.bytedance.ee.bear.middleground.comment.uitls.ReactionHelper;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.comment.b */
public class C9044b implements AbstractC9224g {
    @Override // com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g
    /* renamed from: a */
    public IReactionHelper mo34611a() {
        return ReactionHelper.m38334a();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g
    /* renamed from: b */
    public IDataTransformer mo34613b() {
        return new IDataTransformer() {
            /* class com.bytedance.ee.bear.middleground.comment.C9044b.C90451 */

            @Override // com.bytedance.ee.bear.middleground.comment.export.IDataTransformer
            /* renamed from: a */
            public DataEntity.C9219Entity.BodyEntity mo34615a(String str) {
                return CommentTo.f24850a.mo35310a(str);
            }

            @Override // com.bytedance.ee.bear.middleground.comment.export.IDataTransformer
            /* renamed from: b */
            public DataEntity.C9219Entity.BodyEntity.PublishEntity mo34617b(String str) {
                return CommentTo.m38285d(str);
            }

            @Override // com.bytedance.ee.bear.middleground.comment.export.IDataTransformer
            /* renamed from: c */
            public JSONObject mo34618c(String str) {
                return CommentTo.m38284b(str);
            }

            @Override // com.bytedance.ee.bear.middleground.comment.export.IDataTransformer
            /* renamed from: a */
            public List<CommentBean> mo34616a(String str, Action action) {
                return CommentTo.m38282a(str, action);
            }
        };
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g
    /* renamed from: c */
    public IAnimatorSettings mo34614c() {
        return new IAnimatorSettings() {
            /* class com.bytedance.ee.bear.middleground.comment.C9044b.C90462 */

            @Override // com.bytedance.ee.bear.middleground.comment.export.IAnimatorSettings
            /* renamed from: a */
            public boolean mo34620a() {
                return AnimatorUtils.m37827e();
            }

            @Override // com.bytedance.ee.bear.middleground.comment.export.IAnimatorSettings
            /* renamed from: b */
            public int mo34621b() {
                return AnimatorUtils.m37826d();
            }

            @Override // com.bytedance.ee.bear.middleground.comment.export.IAnimatorSettings
            /* renamed from: c */
            public boolean mo34622c() {
                return AnimatorUtils.m37821a();
            }

            @Override // com.bytedance.ee.bear.middleground.comment.export.IAnimatorSettings
            /* renamed from: d */
            public boolean mo34623d() {
                return AnimatorUtils.m37828f();
            }

            @Override // com.bytedance.ee.bear.middleground.comment.export.IAnimatorSettings
            /* renamed from: a */
            public void mo34619a(int i) {
                AnimatorUtils.m37819a(i);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m37611b(CommentBuilder bVar) {
        return bVar.mo34962k().invoke().booleanValue();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g
    /* renamed from: a */
    public ICardAdapter mo34609a(IComment eVar) {
        Comment aVar = (Comment) eVar;
        return new CardAdapter2(aVar.mo34314b(), ((an) KoinJavaComponent.m268610a(an.class)).mo16408f().f14584a, aVar, aVar.mo34323c(), null);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g
    /* renamed from: a */
    public IComment mo34610a(CommentBuilder bVar) {
        return new Comment.Build(bVar.mo34964m(), bVar.mo34965n(), bVar.mo34966o()).mo34366a(bVar.f24790a).mo34371b(bVar.f24791b).mo34363a(bVar.f24792c).mo34368a(bVar.mo34943a()).mo34373c(bVar.mo34947b()).mo34362a(bVar.mo34948c()).mo34370b(bVar.mo34951d()).mo34376e(bVar.mo34959h()).mo34377f(bVar.mo34960i()).mo34364a(bVar.f24793d).mo34372b(bVar.mo34954e()).mo34374c(bVar.mo34956f()).mo34375d(bVar.mo34958g()).mo34378g(bVar.mo34961j()).mo34365a(new AbstractC9234g() {
            /* class com.bytedance.ee.bear.middleground.comment.$$Lambda$b$Ih5SJodqIT0E2la9XvPAm0WZfxg */

            @Override // com.bytedance.ee.bear.middleground.comment.p449g.AbstractC9234g
            public final boolean isOwner() {
                return C9044b.lambda$Ih5SJodqIT0E2la9XvPAm0WZfxg(CommentBuilder.this);
            }
        }).mo34367a(bVar.mo34963l()).mo34369a();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g
    /* renamed from: a */
    public AbstractC10460a.AbstractC10461a mo34612a(FragmentActivity fragmentActivity, long j, C8275a aVar, final Function1<String, Boolean> function1, final Function1<String, Unit> function12, final Function1<String, Unit> function13) {
        C8969a aVar2 = new C8969a(fragmentActivity, false);
        aVar2.mo34409a(j);
        aVar2.mo34410a(aVar);
        aVar2.mo34411a(new C8969a.AbstractC8970a() {
            /* class com.bytedance.ee.bear.middleground.comment.C9044b.C90473 */

            @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
            /* renamed from: b */
            public void mo34413b(String str) {
                function12.invoke(str);
            }

            @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
            /* renamed from: c */
            public void mo34414c(String str) {
                function13.invoke(str);
            }

            @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
            /* renamed from: a */
            public boolean mo34412a(String str) {
                return ((Boolean) function1.invoke(str)).booleanValue();
            }
        });
        return aVar2;
    }
}
