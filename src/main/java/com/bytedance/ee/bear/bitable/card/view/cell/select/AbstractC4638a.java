package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.FieldCommandDataBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.FieldCommandResultCode;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.FieldPropertyBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.OptionBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.SetFieldAttrBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.ColorBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.CommonActionType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.OptionIdResult;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.RandomColorResult;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.OperationType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.ParamBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionEntity;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionRequestBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionResult;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4532f;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView;
import com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a;
import com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.bitable.common.BitableAnalytic;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p704g.C13665a;
import com.larksuite.suite.R;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.a */
public abstract class AbstractC4638a<E> extends AbstractC4597b<List<String>, E> implements AbstractC4607d, BitableSelectFieldAnalyticDelegate {

    /* renamed from: g */
    protected C4537a<List<String>> f13709g;

    /* renamed from: h */
    public RecordCardMultiSelectView f13710h;

    /* renamed from: i */
    protected SelectEditPanel f13711i;

    /* renamed from: j */
    public AbstractC4548e f13712j;

    /* renamed from: k */
    public C4771b f13713k;

    /* renamed from: l */
    protected Runnable f13714l;

    /* renamed from: m */
    private ColorBean[] f13715m;

    /* renamed from: n */
    private Disposable f13716n;

    /* renamed from: o */
    private Disposable f13717o;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo18252b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<String> mo18253c(String str);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo18017l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract EFieldType mo18255m();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13710h;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo17995a(boolean z, EFieldUneditableReason eFieldUneditableReason) {
        super.mo17995a(z, eFieldUneditableReason);
        this.f13710h.setDropTriangleVisibility((!z || mo18116e()) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo18251a(String str, String str2, int i, boolean z) {
        List<C4530e.C4531a> a = ((C4530e) this.f13709g.mo17829a()).mo17727a();
        a.add(0, new C4530e.C4531a(str, str2, i, this.f13715m[i].getColor(), this.f13715m[i].getTextColor()));
        if (z) {
            this.f13709g.mo17833a(mo18253c(str));
            mo18252b(str);
        }
        m19271a(a);
    }

    /* renamed from: a */
    public void mo18250a(String str, String str2, int i) {
        List<C4530e.C4531a> a = ((C4530e) this.f13709g.mo17829a()).mo17727a();
        Iterator<C4530e.C4531a> it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4530e.C4531a next = it.next();
            if (TextUtils.equals(next.mo17731a(), str)) {
                next.mo17733a(str2);
                next.mo17732a(i);
                next.mo17735b(this.f13715m[i].getColor());
                next.mo17737c(this.f13715m[i].getTextColor());
                break;
            }
        }
        m19271a(a);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        super.mo17996h();
        this.f13710h.setDropTriangleSelected(true);
        m19275p();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: k */
    public void mo18016k() {
        super.mo18016k();
        if (this.f13714l != null) {
            this.f13714l = null;
        }
        Disposable disposable = this.f13717o;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: p */
    private void m19275p() {
        if (this.f13711i != null) {
            mo18017l();
            this.f13711i.mo17973a();
            return;
        }
        this.f13716n = m19276q().subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$a$ZfQc63cFMocfjocsOKgzRR382k */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC4638a.this.m19272b((AbstractC4638a) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$a$LsCshEBPkc5mMury2u9AGGlF_Y */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC4638a.this.m19273b((AbstractC4638a) ((Throwable) obj));
            }
        });
    }

    /* renamed from: q */
    private Single<Boolean> m19276q() {
        PermissionRequestBean permissionRequestBean = new PermissionRequestBean();
        permissionRequestBean.setEntity(PermissionEntity.FIELD);
        permissionRequestBean.setOperation(OperationType.EDITABLE);
        permissionRequestBean.setParam(mo18256n());
        return this.f13713k.fetchPermissionsData(new PermissionRequestBean[]{permissionRequestBean}).map($$Lambda$a$7OBuWAtXctxCkj_DAeah4GT3xV4.INSTANCE).timeout(1000, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e());
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        super.mo17997i();
        this.f13710h.setDropTriangleSelected(false);
        SelectEditPanel iVar = this.f13711i;
        if (iVar != null && iVar.mo17980d()) {
            this.f13711i.mo17978b();
        }
        Disposable disposable = this.f13716n;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f13712j.mo17910b(this.f13710h, this);
    }

    /* renamed from: n */
    public ParamBean mo18256n() {
        return new ParamBean(this.f13709g.mo17829a().mo17748f().mo17767b(), this.f13709g.mo17829a().mo17748f().mo17775e().mo17793b(), this.f13709g.mo17834b().mo17707b(), this.f13709g.mo17829a().mo17749g());
    }

    /* renamed from: o */
    private void m19274o() {
        if (!mo18116e()) {
            if (this.f13709g.mo17829a() instanceof C4530e) {
                this.f13710h.setData(((C4530e) this.f13709g.mo17829a()).mo17728a(this.f13709g.mo17835c()));
                SelectEditPanel iVar = this.f13711i;
                if (iVar != null && iVar.mo17980d()) {
                    mo18017l();
                }
                if (this.f13586c) {
                    this.f13712j.mo17908a(this.f13710h, this);
                }
            }
        } else if (this.f13709g.mo17829a() instanceof C4532f) {
            this.f13710h.setData(((C4532f) this.f13709g.mo17829a()).mo17741a(this.f13709g.mo17835c()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19273b(Throwable th) throws Exception {
        C13479a.m54759a("BaseSelectCellViewHolder", "fetchOptionAttrsEditPerm fail", th);
        m19269a((Boolean) false);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d
    /* renamed from: a */
    public int mo17990a(Context context) {
        SelectEditPanel iVar = this.f13711i;
        if (iVar != null) {
            return iVar.mo17983g();
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.BitableSelectFieldAnalyticDelegate
    /* renamed from: d */
    public void mo18254d(String str) {
        this.f13588e.mo17876i().mo18687d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m19267a(PermissionResult permissionResult) throws Exception {
        if (permissionResult.getResult() == null || permissionResult.getResult().length <= 0) {
            return false;
        }
        return Boolean.valueOf(permissionResult.getResult()[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19272b(Boolean bool) throws Exception {
        C13479a.m54764b("BaseSelectCellViewHolder", "enableEditOptionAttrs result = " + bool);
        m19269a(bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19268a(FieldCommandResultCode fieldCommandResultCode) throws Exception {
        C13479a.m54772d("BaseSelectCellViewHolder", "modifyFieldAttr()... result = " + fieldCommandResultCode.name());
        if (fieldCommandResultCode == FieldCommandResultCode.SUCCESS) {
            m19274o();
        }
    }

    /* renamed from: a */
    private void m19269a(Boolean bool) {
        SelectEditPanel iVar = new SelectEditPanel(this.f13710h.getContext(), bool.booleanValue(), this.f13715m);
        this.f13711i = iVar;
        iVar.mo17976a(new AbstractC4565a.AbstractC4568a() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$2DzeHcjbtHRscPSbNRrqeBbGf5o */

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4568a
            public final void onDismiss() {
                AbstractC4638a.this.mo17997i();
            }
        });
        this.f13711i.mo18310a(this);
        this.f13711i.mo17977a(new AbstractC4565a.AbstractC4569b<E>() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a.C46391 */

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4569b
            /* renamed from: a */
            public void mo17986a(E e) {
                AbstractC4638a.this.mo18110a((Object) e);
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4569b
            /* renamed from: a */
            public void mo17987a(String str, Map<String, String> map) {
                AbstractC4638a.this.f13588e.mo17864a(str, map);
                AbstractC4638a.this.mo18249a("ccm_bitable_option_field_panel_click", "select_option");
            }
        });
        this.f13711i.mo18311a(new SelectEditPanel.DataRequestListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a.C46402 */

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel.DataRequestListener
            /* renamed from: a */
            public Single<RandomColorResult> mo18257a() {
                return AbstractC4638a.this.f13713k.fetchCommonData(CommonActionType.GET_RANDOM_COLOR, C13665a.m55442b(AbstractC4638a.this.mo18256n()), RandomColorResult.class);
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel.DataRequestListener
            /* renamed from: a */
            public void mo18258a(String str) {
                AbstractC4638a.this.mo18248a(str);
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel.DataRequestListener
            /* renamed from: a */
            public void mo18259a(String str, int i, boolean z) {
                C13479a.m54772d("BaseSelectCellViewHolder", "onAddNewOption()... optionContent = " + str + ", optionColorId = " + i);
                AbstractC4638a.this.f13713k.fetchCommonData(CommonActionType.GET_NEW_OPTION_ID, C13665a.m55442b(AbstractC4638a.this.mo18256n()), OptionIdResult.class).subscribe(new Consumer(str, i, z) {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$a$2$diD8ISjUmlQv6SVOv1kSGniZjFI */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ boolean f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        AbstractC4638a.C46402.this.m19296a(this.f$1, this.f$2, this.f$3, (OptionIdResult) obj);
                    }
                }, $$Lambda$a$2$Zd2NBPTyrcViAOyK_TChEHm2HP8.INSTANCE);
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel.DataRequestListener
            /* renamed from: a */
            public void mo18260a(String str, String str2, int i) {
                AbstractC4638a.this.mo18250a(str, str2, i);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m19296a(String str, int i, boolean z, OptionIdResult optionIdResult) throws Exception {
                String optionId = optionIdResult.getOptionId();
                C13479a.m54772d("BaseSelectCellViewHolder", "fetch new optionId = " + optionId);
                AbstractC4638a.this.mo18251a(optionId, str, i, z);
            }
        });
        this.f13711i.mo18173h().setOnPositionChangeListener(new CellEditDragView.AbstractC4564b() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a.C46413 */

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
            /* renamed from: a */
            public void mo17969a() {
                AbstractC4638a.this.f13711i.mo17978b();
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
            /* renamed from: b */
            public void mo17970b() {
                AbstractC4638a.this.f13712j.mo17908a(AbstractC4638a.this.f13710h, AbstractC4638a.this);
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
            /* renamed from: c */
            public void mo17971c() {
                AbstractC4638a.this.f13712j.mo17908a(AbstractC4638a.this.f13710h, AbstractC4638a.this);
            }
        });
        mo18017l();
        this.f13711i.mo17973a();
        this.f13712j.mo17908a(this.f13710h, this);
    }

    /* renamed from: a */
    private void m19271a(List<C4530e.C4531a> list) {
        int i;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        OptionBean[] optionBeanArr = new OptionBean[i];
        for (int i2 = 0; i2 < i; i2++) {
            optionBeanArr[i2] = new OptionBean(list.get(i2).mo17731a(), list.get(i2).mo17734b(), Integer.valueOf(list.get(i2).mo17736c()));
        }
        SetFieldAttrBean setFieldAttrBean = new SetFieldAttrBean(this.f13709g.mo17829a().mo17748f().mo17767b(), this.f13709g.mo17829a().mo17748f().mo17775e().mo17793b(), this.f13709g.mo17829a().mo17749g(), new FieldCommandDataBean(this.f13709g.mo17829a().mo17749g(), this.f13709g.mo17829a().mo17750h(), Integer.valueOf(this.f13709g.mo17829a().mo17752i().value), new FieldPropertyBean(optionBeanArr)));
        C13479a.m54772d("BaseSelectCellViewHolder", "modifyFieldAttr()... " + setFieldAttrBean);
        this.f13717o = this.f13713k.executeFieldAttrCommands(setFieldAttrBean).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$a$fcxLAk8kot8GL2cGqxSXh9VYX6g */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC4638a.this.m19268a((AbstractC4638a) ((FieldCommandResultCode) obj));
            }
        }, $$Lambda$a$d_2jCgtjCz_0uUO14IKOHGUbOTg.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.bitable.card.model.stmodel.cell.a<java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<String>> aVar) {
        super.mo17993a((C4537a) aVar);
        this.f13709g = aVar;
        Runnable runnable = this.f13714l;
        if (runnable != null) {
            runnable.run();
        }
        m19274o();
    }

    /* renamed from: a */
    public void mo18248a(String str) {
        List<C4530e.C4531a> a = ((C4530e) this.f13709g.mo17829a()).mo17727a();
        Iterator<C4530e.C4531a> it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4530e.C4531a next = it.next();
            if (TextUtils.equals(next.mo17731a(), str)) {
                a.remove(next);
                break;
            }
        }
        m19271a(a);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.BitableSelectFieldAnalyticDelegate
    /* renamed from: a */
    public void mo18249a(String str, String str2) {
        boolean z;
        BitableAnalytic i = this.f13588e.mo17876i();
        if (mo18255m() == EFieldType.MULTI_SELECT) {
            z = true;
        } else {
            z = false;
        }
        i.mo18676a(str, str2, z);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        super.onKeyboardHeightChanged(fVar, i, i2);
        SelectEditPanel iVar = this.f13711i;
        if (iVar != null && iVar.mo17980d()) {
            this.f13711i.mo17974a(i);
        }
    }

    public AbstractC4638a(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar);
        this.f13712j = eVar;
        this.f13710h = (RecordCardMultiSelectView) view.findViewById(R.id.select_content);
        C4771b bVar = (C4771b) C4950k.m20474a(dVar.mo17874g(), C4771b.class);
        this.f13713k = bVar;
        this.f13715m = bVar.getCommonColorList();
    }
}
