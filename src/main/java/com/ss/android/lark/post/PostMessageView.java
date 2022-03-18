package com.ss.android.lark.post;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.anonymous.plugin.C28702a;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.chatbase.keyboard.AtKBPluginDependency;
import com.ss.android.lark.chatbase.keyboard.FaceKBPluginDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoAaKBPluginCompat;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.widget.AutoAdjustSizeLayoutManager;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.post.AbstractC52159a;
import com.ss.android.lark.post.plugin.IGroupContainerDelegate;
import com.ss.android.lark.post.plugin.IThreadInputDelegate;
import com.ss.android.lark.post.plugin.ThreadPostInputSupportPlugin;
import com.ss.android.lark.post.widget.GroupSelectDialog;
import com.ss.android.lark.post.widget.GroupSelectFragment;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threadwindow.C56145l;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PostMessageView implements AbstractC52159a.AbstractC52161b {

    /* renamed from: a */
    public final AbstractC52158a f129392a;

    /* renamed from: b */
    public AbstractC52159a.AbstractC52161b.AbstractC52162a f129393b;

    /* renamed from: c */
    public C52219g f129394c;

    /* renamed from: d */
    public GroupSelectDialog f129395d;

    /* renamed from: e */
    public KeyBoard f129396e;

    /* renamed from: f */
    public AtKBPluginDependency f129397f;

    /* renamed from: g */
    public AtKBPlugin f129398g;

    /* renamed from: h */
    public long f129399h;

    /* renamed from: i */
    public int f129400i;

    /* renamed from: j */
    public final boolean f129401j = C29990c.m110930b().mo134586n().mo134685a("messenger.message_inputbox_redesign");

    /* renamed from: k */
    private GroupSelectFragment f129402k;

    /* renamed from: l */
    private Boolean f129403l;

    /* renamed from: m */
    private boolean f129404m;
    @BindView(7632)
    FrameLayout mEditContainer;
    @BindView(7790)
    FrameLayout mFragmentContainer;
    @BindView(7962)
    SysKeyBoardObserveFrameLayout mKeyboardDetectorView;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.post.PostMessageView$a */
    public interface AbstractC52158a {
        /* renamed from: a */
        Context mo178659a();

        /* renamed from: a */
        void mo178660a(PostMessageView postMessageView);

        /* renamed from: a */
        void mo178661a(C58557a.C58559a aVar);

        /* renamed from: a */
        void mo178662a(C58633e.C58634a aVar);

        /* renamed from: a */
        void mo178663a(RichText richText, Chat chat, Boolean bool, boolean z);

        /* renamed from: a */
        void mo178664a(RichText richText, Chat chat, boolean z);

        /* renamed from: b */
        Activity mo178665b();

        /* renamed from: b */
        void mo178666b(RichText richText, Chat chat, boolean z);

        /* renamed from: c */
        FragmentManager mo178667c();

        /* renamed from: d */
        Boolean mo178668d();

        /* renamed from: e */
        Fragment mo178669e();
    }

    /* renamed from: i */
    private IKeyBoardPlugin m202305i() {
        return new AaStyleKBPlugin();
    }

    /* renamed from: m */
    private IThreadInputDelegate m202309m() {
        return new IThreadInputDelegate() {
            /* class com.ss.android.lark.post.PostMessageView.C521579 */

            @Override // com.ss.android.lark.post.plugin.IThreadInputDelegate
            /* renamed from: a */
            public void mo178656a() {
                PostMessageView.this.mo178644g();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ IPhotoDependency.Image m202355a(Image image) throws Exception {
                return new IPhotoDependency.Image(image.getUrls(), image.getWidth(), image.getHeight(), image.getToken());
            }

            @Override // com.ss.android.lark.post.plugin.IThreadInputDelegate
            /* renamed from: a */
            public void mo178657a(RichText richText) {
                KeyboardUtils.hideKeyboard(PostMessageView.this.f129392a.mo178659a());
                ThreadTopicHitPoint.f135906a.mo187743k("cancel");
                AbstractC52158a aVar = PostMessageView.this.f129392a;
                Chat b = PostMessageView.this.f129394c.mo178782b();
                boolean z = true;
                if (PostMessageView.this.f129400i != 1) {
                    z = false;
                }
                aVar.mo178664a(richText, b, z);
            }

            @Override // com.ss.android.lark.post.plugin.IThreadInputDelegate
            /* renamed from: a */
            public Observable<IPhotoDependency.Image> mo178655a(List<String> list, boolean z, AbstractC25974h hVar) {
                return C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Thread).map($$Lambda$PostMessageView$9$ai7Z0pcepIV_aJAosMzOJDaZYd8.INSTANCE);
            }

            @Override // com.ss.android.lark.post.plugin.IThreadInputDelegate
            /* renamed from: a */
            public void mo178658a(String str, RichText richText, boolean z) {
                boolean z2 = true;
                if (PostMessageView.this.f129401j) {
                    richText.setRichTextVersion(1);
                }
                PostMessageView.this.f129396e.mo146830k();
                ThreadTopicHitPoint.f135906a.mo187743k("send");
                long currentTimeMillis = (System.currentTimeMillis() - PostMessageView.this.f129399h) / 1000;
                if (currentTimeMillis > 0) {
                    ThreadTopicHitPoint.f135906a.mo187745l(String.valueOf(currentTimeMillis));
                }
                ThreadTopicHitPoint.f135906a.mo187743k("send");
                C54948d.m213137a(z, true, true);
                AbstractC52158a aVar = PostMessageView.this.f129392a;
                Chat b = PostMessageView.this.f129394c.mo178782b();
                Boolean j = PostMessageView.this.f129394c.mo178793j();
                if (PostMessageView.this.f129400i != 1) {
                    z2 = false;
                }
                aVar.mo178663a(richText, b, j, z2);
            }
        };
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f129392a.mo178660a(this);
        this.f129399h = System.currentTimeMillis();
        this.f129404m = true;
    }

    /* renamed from: h */
    private void m202304h() {
        GroupSelectFragment a = GroupSelectFragment.f129498c.mo178751a();
        this.f129402k = a;
        a.mo178746a(new GroupSelectFragment.Delegate() {
            /* class com.ss.android.lark.post.PostMessageView.C521482 */

            @Override // com.ss.android.lark.post.widget.GroupSelectFragment.Delegate
            /* renamed from: c */
            public void mo178649c() {
                PostMessageView.this.f129393b.mo178677a();
            }

            @Override // com.ss.android.lark.post.widget.GroupSelectFragment.Delegate
            /* renamed from: b */
            public boolean mo178648b() {
                return PostMessageView.this.f129393b.mo178679b().booleanValue();
            }

            @Override // com.ss.android.lark.post.widget.GroupSelectFragment.Delegate
            /* renamed from: a */
            public void mo178645a() {
                KeyboardUtils.hideKeyboard(PostMessageView.this.f129392a.mo178659a());
                if (PostMessageView.this.f129392a.mo178668d().booleanValue()) {
                    ThreadTopicHitPoint.f135906a.mo187739i("close");
                    AbstractC52158a aVar = PostMessageView.this.f129392a;
                    RichText e = PostMessageView.this.f129394c.mo178788e();
                    Chat b = PostMessageView.this.f129394c.mo178782b();
                    boolean z = true;
                    if (PostMessageView.this.f129400i != 1) {
                        z = false;
                    }
                    aVar.mo178664a(e, b, z);
                }
            }

            @Override // com.ss.android.lark.post.widget.GroupSelectFragment.Delegate
            /* renamed from: a */
            public void mo178647a(CommonTitleBar commonTitleBar) {
                commonTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_MobileSelectGroupTitle));
                commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
                commonTitleBar.setMainTitleTextStyle(1);
                commonTitleBar.setMainTitleSize(17.0f);
            }

            @Override // com.ss.android.lark.post.widget.GroupSelectFragment.Delegate
            /* renamed from: a */
            public void mo178646a(C29607af afVar) {
                boolean z;
                PostMessageView.this.f129394c.mo178776a(afVar.mo106680a());
                C52219g gVar = PostMessageView.this.f129394c;
                if (afVar.mo106681b().getType() == TopicGroup.Type.DEFAULT) {
                    z = true;
                } else {
                    z = false;
                }
                gVar.mo178786c(Boolean.valueOf(z));
                PostMessageView.this.f129393b.mo178681d();
                if (afVar.mo106681b().getType() == TopicGroup.Type.DEFAULT) {
                    ThreadTopicHitPoint.f135906a.mo187739i("select_default_group");
                } else {
                    ThreadTopicHitPoint.f135906a.mo187739i("select_group");
                }
            }
        });
    }

    /* renamed from: k */
    private IKeyBoardPlugin m202307k() {
        ThreadPhotoKBPlugin cVar = new ThreadPhotoKBPlugin(this.f129394c.mo178782b().isSecret(), false, false, new IPhotoDependency() {
            /* class com.ss.android.lark.post.PostMessageView.C521504 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122040a(ArrayList<File> arrayList) {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122041a(ArrayList<String> arrayList, boolean z) {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public boolean mo122042a() {
                return true;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: b */
            public void mo122043b(List<IPhotoDependency.VideoInfo> list) {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: b */
            public boolean mo122044b() {
                return true;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122038a(C58557a.C58559a aVar) {
                PostMessageView.this.f129392a.mo178661a(aVar);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public Observable<Map<String, IPhotoDependency.FrameInfo>> mo122036a(List<IPhotoDependency.VideoInfo> list) {
                return C34278w.m132953a().mo126826a(list);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122039a(C58633e.C58634a aVar) {
                PostMessageView.this.f129392a.mo178662a(aVar);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public Observable<IPhotoDependency.Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar) {
                return C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Thread).map(new Function<Image, IPhotoDependency.Image>() {
                    /* class com.ss.android.lark.post.PostMessageView.C521504.C521511 */

                    /* renamed from: a */
                    public IPhotoDependency.Image apply(Image image) throws Exception {
                        return new IPhotoDependency.Image(image.getUrls(), image.getWidth(), image.getHeight(), image.getToken());
                    }
                });
            }
        });
        cVar.mo147808a(new PhotoAaKBPluginCompat(this.f129396e));
        return cVar;
    }

    /* renamed from: n */
    private Boolean m202310n() {
        boolean z;
        GroupSelectDialog bVar = this.f129395d;
        if (bVar == null || !bVar.isShowing()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    private Boolean m202311o() {
        boolean z;
        if (this.mFragmentContainer.getVisibility() != 0 || this.f129402k == null || !this.f129403l.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f129404m = false;
        KeyBoard fVar = this.f129396e;
        if (fVar != null) {
            fVar.mo146838s();
        } else {
            Log.m165389i("PostMessageView", "view not call keyboard destroy");
        }
    }

    /* renamed from: g */
    public void mo178644g() {
        LKUIToast.show(this.f129392a.mo178659a(), UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", this.f129394c.mo178782b().getName()));
    }

    /* renamed from: j */
    private IKeyBoardPlugin m202306j() {
        Chat b = this.f129394c.mo178782b();
        AtKBPluginDependency aVar = new AtKBPluginDependency(this.f129392a.mo178665b(), b.getId(), false);
        this.f129397f = aVar;
        aVar.mo127070a(this.f129394c.mo178792i().booleanValue());
        AtKBPlugin aVar2 = new AtKBPlugin(b.getId(), b.isSecret(), false, this.f129397f);
        this.f129398g = aVar2;
        return aVar2;
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: b */
    public void mo178638b() {
        if (this.f129402k != null && this.f129392a.mo178668d().booleanValue()) {
            FragmentManager c = this.f129392a.mo178667c();
            FragmentTransaction beginTransaction = c.beginTransaction();
            beginTransaction.setCustomAnimations(R.anim.lkui_translate_from_bottom, R.anim.lkui_translate_to_bottom);
            beginTransaction.hide(this.f129402k);
            beginTransaction.commitAllowingStateLoss();
            c.executePendingTransactions();
            this.f129403l = false;
        }
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: c */
    public void mo178640c() {
        if (this.f129392a.mo178668d().booleanValue()) {
            if (m202310n().booleanValue()) {
                this.f129395d.mo178724b();
                this.f129395d.mo178723a(this.f129394c.mo178791h());
            } else if (m202311o().booleanValue()) {
                this.f129402k.mo178747a(this.f129394c.mo178791h());
            }
        }
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: d */
    public void mo178641d() {
        if (this.f129392a.mo178668d().booleanValue()) {
            if (m202310n().booleanValue()) {
                this.f129395d.mo178724b();
            } else if (m202311o().booleanValue()) {
                this.f129402k.mo178748b();
            }
        }
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: f */
    public void mo178643f() {
        ThreadPostInputSupportPlugin dVar = (ThreadPostInputSupportPlugin) this.f129396e.mo146827h();
        RichText q = dVar.mo178697q();
        dVar.mo178696p();
        ThreadTopicHitPoint.f135906a.mo187743k("cancel");
        AbstractC52158a aVar = this.f129392a;
        Chat b = this.f129394c.mo178782b();
        boolean z = true;
        if (this.f129400i != 1) {
            z = false;
        }
        aVar.mo178666b(q, b, z);
    }

    /* renamed from: l */
    private IKeyBoardPlugin m202308l() {
        if (!DesktopUtil.m144301a(this.f129392a.mo178659a())) {
            return new FaceKBPlugin(false, this.f129394c.mo178782b().isSecret(), ((FragmentActivity) this.f129392a.mo178659a()).getSupportFragmentManager(), new FaceKBPluginDependency(new FacePluginDependency() {
                /* class com.ss.android.lark.post.PostMessageView.C521536 */

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
                /* renamed from: a */
                public void mo122021a(C40964l lVar) {
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
                /* renamed from: a */
                public Fragment mo122020a() {
                    return PostMessageView.this.f129392a.mo178669e();
                }
            }));
        }
        DesktopFaceKBPlugin bVar = new DesktopFaceKBPlugin(false, this.f129394c.mo178782b().isSecret(), new FaceKBPluginDependency(new FacePluginDependency() {
            /* class com.ss.android.lark.post.PostMessageView.C521525 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
            /* renamed from: a */
            public void mo122021a(C40964l lVar) {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
            /* renamed from: a */
            public Fragment mo122020a() {
                return PostMessageView.this.f129392a.mo178669e();
            }
        }), false);
        bVar.mo147596a(0.3f);
        return bVar;
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: a */
    public void mo178632a() {
        this.mFragmentContainer.setVisibility(0);
        this.mEditContainer.setVisibility(8);
        FragmentManager c = this.f129392a.mo178667c();
        FragmentTransaction beginTransaction = c.beginTransaction();
        if (this.f129402k == null) {
            m202304h();
            beginTransaction.setCustomAnimations(R.anim.lkui_translate_from_bottom, R.anim.lkui_translate_to_bottom);
            beginTransaction.add(R.id.group_select_fragment, this.f129402k, (String) null);
            beginTransaction.commitAllowingStateLoss();
            c.executePendingTransactions();
            this.f129403l = true;
            return;
        }
        beginTransaction.setCustomAnimations(R.anim.lkui_translate_from_bottom, R.anim.lkui_translate_to_bottom);
        beginTransaction.show(this.f129402k);
        beginTransaction.commitAllowingStateLoss();
        c.executePendingTransactions();
        this.f129403l = true;
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: e */
    public boolean mo178642e() {
        if (m202311o().booleanValue()) {
            this.f129402k.mo178749c();
            return true;
        }
        KeyBoard fVar = this.f129396e;
        boolean z = false;
        if (fVar == null) {
            return false;
        }
        if (fVar.mo146824e()) {
            return true;
        }
        ThreadPostInputSupportPlugin dVar = (ThreadPostInputSupportPlugin) this.f129396e.mo146827h();
        RichText q = dVar.mo178697q();
        dVar.mo178696p();
        ThreadTopicHitPoint.f135906a.mo187743k("cancel");
        AbstractC52158a aVar = this.f129392a;
        Chat b = this.f129394c.mo178782b();
        if (this.f129400i == 1) {
            z = true;
        }
        aVar.mo178664a(q, b, z);
        return true;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC52159a.AbstractC52161b.AbstractC52162a aVar) {
        this.f129393b = aVar;
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: a */
    public void mo178635a(C52219g gVar) {
        this.f129394c = gVar;
    }

    PostMessageView(AbstractC52158a aVar) {
        this.f129392a = aVar;
    }

    /* renamed from: a */
    private void m202301a(final ThreadPostInputSupportPlugin dVar) {
        if (this.f129394c.mo178789f().booleanValue()) {
            dVar.mo178685a(new IGroupContainerDelegate() {
                /* class com.ss.android.lark.post.PostMessageView.C521558 */

                @Override // com.ss.android.lark.post.plugin.IGroupContainerDelegate
                /* renamed from: a */
                public void mo178651a() {
                    if (PostMessageView.this.f129395d == null) {
                        PostMessageView.this.f129395d = new GroupSelectDialog(PostMessageView.this.f129392a.mo178659a(), PostMessageView.this.f129394c.mo178782b(), new GroupSelectDialog.GroupSelectDelegate() {
                            /* class com.ss.android.lark.post.PostMessageView.C521558.C521561 */

                            @Override // com.ss.android.lark.post.widget.GroupSelectDialog.GroupSelectDelegate
                            /* renamed from: a */
                            public boolean mo178653a() {
                                return PostMessageView.this.f129393b.mo178679b().booleanValue();
                            }

                            @Override // com.ss.android.lark.post.widget.GroupSelectDialog.GroupSelectDelegate
                            /* renamed from: b */
                            public void mo178654b() {
                                PostMessageView.this.f129393b.mo178677a();
                            }

                            @Override // com.ss.android.lark.post.widget.GroupSelectDialog.GroupSelectDelegate
                            /* renamed from: a */
                            public void mo178652a(C29607af afVar) {
                                boolean z;
                                dVar.mo178684a(afVar.mo106680a());
                                PostMessageView.this.f129398g.mo147383a(afVar.mo106680a().getId());
                                PostMessageView.this.f129397f.mo127069a(afVar.mo106680a().getId());
                                PostMessageView.this.f129394c.mo178776a(afVar.mo106680a());
                                C52219g gVar = PostMessageView.this.f129394c;
                                if (afVar.mo106681b().getType() == TopicGroup.Type.DEFAULT) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                gVar.mo178786c(Boolean.valueOf(z));
                            }
                        });
                    }
                    KeyboardUtils.hideKeyboard(PostMessageView.this.f129392a.mo178659a());
                    if (CollectionUtils.isNotEmpty(PostMessageView.this.f129394c.mo178791h())) {
                        PostMessageView.this.f129395d.mo178723a(PostMessageView.this.f129394c.mo178791h());
                    } else {
                        PostMessageView.this.f129393b.mo178680c();
                    }
                    PostMessageView.this.f129395d.show();
                }
            });
        }
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: b */
    public void mo178639b(List<C29607af> list) {
        if (m202310n().booleanValue() && this.f129392a.mo178668d().booleanValue()) {
            this.f129395d.mo178723a(list);
        }
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: a */
    public void mo178636a(Boolean bool) {
        if (this.f129404m) {
            this.mEditContainer.setVisibility(0);
            m202302b(bool);
            this.mKeyboardDetectorView.mo148228a(new KeyBoardObserveFrameLayout.IOnKeyBoardListener() {
                /* class com.ss.android.lark.post.PostMessageView.C521471 */

                @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
                /* renamed from: a */
                public void mo129626a() {
                    EditText l = PostMessageView.this.f129396e.mo146827h().mo146904l();
                    if (l != null) {
                        l.requestLayout();
                    }
                }

                @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
                /* renamed from: a */
                public void mo129627a(int i) {
                    EditText l = PostMessageView.this.f129396e.mo146827h().mo146904l();
                    if (l != null) {
                        l.requestLayout();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private void m202302b(Boolean bool) {
        KeyBoard fVar = new KeyBoard(this.f129392a.mo178665b(), this.mEditContainer, new IKeyBoardDependency() {
            /* class com.ss.android.lark.post.PostMessageView.C521493 */

            @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
            /* renamed from: a */
            public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
            }

            @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
            /* renamed from: a */
            public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
            }

            @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
            /* renamed from: a */
            public void mo122097a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
            }
        });
        this.f129396e = fVar;
        fVar.mo146795a(KeyboardScene.ThreadMain);
        this.f129396e.mo146801a(new AutoAdjustSizeLayoutManager());
        this.f129396e.mo146806a("face", m202308l());
        this.f129396e.mo146806a("at", m202306j());
        this.f129396e.mo146806a("photo", m202307k());
        this.f129396e.mo146804a("post", m202303c(bool));
        if (this.f129401j) {
            this.f129396e.mo146806a("aa_editor", m202305i());
        }
        this.f129396e.mo146842w();
        this.f129396e.mo146802a(null, this.f129394c.mo178775a(), this.f129394c.mo178788e(), false);
    }

    /* renamed from: c */
    private IInputSupportPlugin m202303c(Boolean bool) {
        final ThreadPostInputSupportPlugin dVar = new ThreadPostInputSupportPlugin(m202309m());
        if (!TextUtils.isEmpty(this.f129394c.mo178787d())) {
            dVar.mo178689b(this.f129394c.mo178787d());
        }
        dVar.mo178692d(this.f129394c.mo178789f().booleanValue());
        dVar.mo178693e(bool.booleanValue());
        dVar.mo178694f(true);
        if (this.f129394c.mo178789f().booleanValue()) {
            dVar.mo178688b(this.f129394c.mo178782b());
            m202301a(dVar);
        }
        Log.m165389i("PostMessageView", "chatID : " + this.f129394c.mo178782b().getId() + " , AnonymousSetting : " + this.f129394c.mo178782b().getAnonymousSetting());
        if (C56145l.m218887b() && this.f129394c.mo178782b().getAnonymousSetting() == Chat.AnonymousSetting.ALLOWED) {
            C28702a aVar = new C28702a(new C28702a.AbstractC28706a() {
                /* class com.ss.android.lark.post.PostMessageView.C521547 */

                @Override // com.ss.android.lark.anonymous.plugin.C28702a.AbstractC28706a
                /* renamed from: a */
                public void mo102103a(IGetDataCallback<Long> iGetDataCallback) {
                    PostMessageView.this.f129393b.mo178678a(iGetDataCallback);
                }

                @Override // com.ss.android.lark.anonymous.plugin.C28702a.AbstractC28706a
                /* renamed from: a */
                public void mo102102a(int i) {
                    if (i == 0) {
                        dVar.mo178690c(UIHelper.getString(R.string.Lark_Group_NewTopicRichtextTip));
                    } else {
                        dVar.mo178690c(UIHelper.mustacheFormat((int) R.string.Lark_Groups_PostAnonymouslyPlaceholder, "N", String.valueOf(PostMessageView.this.f129394c.mo178782b().getAnonymousTotalQuota())));
                    }
                    PostMessageView.this.f129400i = i;
                }
            }, this.f129394c.mo178785c(), this.f129400i, true);
            dVar.mo147009a("input_addition", aVar.mo102096a("input_addition"));
            dVar.mo147009a("input_pop", aVar.mo102096a("input_pop"));
        }
        return dVar;
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: a */
    public void mo178637a(List<C29607af> list) {
        if (this.f129402k != null && this.f129392a.mo178668d().booleanValue()) {
            this.f129402k.mo178747a(list);
        }
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b
    /* renamed from: a */
    public void mo178633a(int i, int i2, Intent intent) {
        KeyBoard fVar = this.f129396e;
        if (fVar != null) {
            fVar.mo146812a(i, i2, intent);
        }
    }
}
