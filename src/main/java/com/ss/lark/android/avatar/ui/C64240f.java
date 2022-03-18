package com.ss.lark.android.avatar.ui;

import android.app.Activity;
import android.content.Intent;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.statistics.PerfImageUploadMonitor;
import com.ss.lark.android.avatar.statistics.AvatarHit;
import com.ss.lark.android.avatar.ui.AbstractC64247j;

/* renamed from: com.ss.lark.android.avatar.ui.f */
public class C64240f extends BasePresenter<AbstractC64247j.AbstractC64248a, AbstractC64247j.AbstractC64249b, AbstractC64247j.AbstractC64249b.AbstractC64250a> {

    /* renamed from: a */
    public Activity f162414a;

    /* renamed from: b */
    public String f162415b;

    /* renamed from: c */
    public AvatarSource f162416c = AvatarSource.NONE;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: a */
    public boolean mo222695a() {
        AbstractC64247j.AbstractC64249b bVar = (AbstractC64247j.AbstractC64249b) getView();
        if (bVar != null) {
            return bVar.mo222631d();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC64247j.AbstractC64249b.AbstractC64250a createViewDelegate() {
        if (getView() instanceof AvatarPickView) {
            return new C64241a();
        }
        return new C64243b();
    }

    /* renamed from: a */
    public void mo222693a(AvatarSource avatarSource) {
        this.f162416c = avatarSource;
    }

    /* renamed from: com.ss.lark.android.avatar.ui.f$a */
    public class C64241a implements AbstractC64247j.AbstractC64249b.AbstractC64250a {
        @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b.AbstractC64250a
        /* renamed from: b */
        public void mo222699b(String str) {
        }

        public C64241a() {
        }

        @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b.AbstractC64250a
        /* renamed from: a */
        public void mo222698a(String str) {
            final boolean z;
            AbstractC64247j.AbstractC64248a aVar = (AbstractC64247j.AbstractC64248a) C64240f.this.getModel();
            final AbstractC64247j.AbstractC64249b bVar = (AbstractC64247j.AbstractC64249b) C64240f.this.getView();
            if (aVar != null) {
                bVar.mo222628b();
                if (C64240f.this.f162416c == AvatarSource.MOMENTS || C64240f.this.f162416c == AvatarSource.PROFILE || C64240f.this.f162416c == AvatarSource.EDIT_ALIAS) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo222692a(str, new IGetDataCallback<String>() {
                    /* class com.ss.lark.android.avatar.ui.C64240f.C64241a.C642421 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        bVar.mo222623a();
                        bVar.mo222626a(C64240f.this.f162415b);
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        bVar.mo222623a();
                        if (z) {
                            Intent intent = new Intent();
                            intent.putExtra("action", "change");
                            intent.putExtra("image_key", str);
                            C64240f.this.f162414a.setResult(-1, intent);
                            C64240f.this.f162414a.finish();
                            return;
                        }
                        bVar.mo222630c();
                        if (UIUtils.isActivityRunning(C64240f.this.f162414a)) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("avatar_path", str);
                            C64240f.this.f162414a.setResult(777, intent2);
                            C64240f.this.f162414a.finish();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.lark.android.avatar.ui.f$b */
    public class C64243b implements AbstractC64247j.AbstractC64249b.AbstractC64250a {
        public C64243b() {
        }

        @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b.AbstractC64250a
        /* renamed from: b */
        public void mo222699b(String str) {
            Intent intent = new Intent();
            intent.putExtra("action", "delete");
            intent.putExtra("image_key", str);
            C64240f.this.f162414a.setResult(-1, intent);
            C64240f.this.f162414a.finish();
        }

        @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b.AbstractC64250a
        /* renamed from: a */
        public void mo222698a(String str) {
            AbstractC64247j.AbstractC64248a aVar = (AbstractC64247j.AbstractC64248a) C64240f.this.getModel();
            final AbstractC64247j.AbstractC64249b bVar = (AbstractC64247j.AbstractC64249b) C64240f.this.getView();
            if (aVar != null) {
                final boolean z = false;
                if (C64240f.this.f162416c == AvatarSource.MOMENTS) {
                    PerfImageUploadMonitor.f145430a.mo199312a(Biz.Moments, Scene.Moments, 9);
                } else if (C64240f.this.f162416c == AvatarSource.PROFILE) {
                    PerfImageUploadMonitor.f145430a.mo199312a(Biz.Messenger, Scene.Profile, 9);
                } else if (C64240f.this.f162416c == AvatarSource.EDIT_ALIAS) {
                    PerfImageUploadMonitor.f145430a.mo199312a(Biz.Messenger, Scene.Profile, 0);
                } else {
                    PerfImageUploadMonitor.f145430a.mo199312a(Biz.Messenger, Scene.Chat, 5);
                }
                bVar.mo222628b();
                if (C64240f.this.f162416c == AvatarSource.MOMENTS || C64240f.this.f162416c == AvatarSource.PROFILE || C64240f.this.f162416c == AvatarSource.EDIT_ALIAS) {
                    z = true;
                }
                aVar.mo222692a(str, new IGetDataCallback<String>() {
                    /* class com.ss.lark.android.avatar.ui.C64240f.C64243b.C642441 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        bVar.mo222623a();
                        bVar.mo222626a(C64240f.this.f162415b);
                        PerfImageUploadMonitor.f145430a.mo199315b();
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        bVar.mo222623a();
                        if (z) {
                            Intent intent = new Intent();
                            intent.putExtra("action", "change");
                            intent.putExtra("image_key", str);
                            C64240f.this.f162414a.setResult(-1, intent);
                            C64240f.this.f162414a.finish();
                            return;
                        }
                        bVar.mo222630c();
                        PhotoItem photoItem = new PhotoItem();
                        photoItem.setImageKey(str);
                        photoItem.setType(4);
                        photoItem.setEntityId(bVar.mo222632e());
                        bVar.mo222624a(photoItem);
                        bVar.mo222627a(false);
                        AvatarHit.m252529a();
                        PerfImageUploadMonitor.f145430a.mo199310a(photoItem.getWidth(), photoItem.getHeight());
                        PerfImageUploadMonitor.f145430a.mo199316b(photoItem.getWidth(), photoItem.getHeight());
                        PerfImageUploadMonitor.f145430a.mo199309a();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo222694a(String str) {
        this.f162415b = str;
    }

    /* renamed from: b */
    public void mo222697b(String str) {
        AbstractC64247j.AbstractC64249b bVar = (AbstractC64247j.AbstractC64249b) getView();
        if (bVar != null) {
            bVar.mo222629b(str);
        }
    }

    public C64240f(Activity activity, AbstractC64247j.AbstractC64248a aVar, AbstractC64247j.AbstractC64249b bVar) {
        super(aVar, bVar);
        this.f162414a = activity;
    }
}
