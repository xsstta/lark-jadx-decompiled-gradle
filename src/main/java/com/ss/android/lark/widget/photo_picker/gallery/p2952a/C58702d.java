package com.ss.android.lark.widget.photo_picker.gallery.p2952a;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a;
import com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.d */
public class C58702d extends BasePresenter<AbstractC58689a.AbstractC58690a, AbstractC58689a.AbstractC58692b, AbstractC58689a.AbstractC58692b.AbstractC58693a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* renamed from: d */
    private AbstractC58689a.AbstractC58690a.AbstractC58691a m227774d() {
        return new C58704a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC58689a.AbstractC58692b.AbstractC58693a createViewDelegate() {
        return new C58708b();
    }

    /* renamed from: b */
    public void mo199080b() {
        ((AbstractC58689a.AbstractC58692b) getView()).mo199055b();
    }

    /* renamed from: c */
    public void mo199082c() {
        ((AbstractC58689a.AbstractC58692b) getView()).mo199061d();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.d$b */
    public class C58708b implements AbstractC58689a.AbstractC58692b.AbstractC58693a {
        @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b.AbstractC58693a
        /* renamed from: a */
        public void mo199062a() {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58708b.RunnableC587133 */

                public void run() {
                    final boolean c = C58612c.m227290a().mo102857c();
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58708b.RunnableC587133.RunnableC587141 */

                        public void run() {
                            ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199060c(c);
                        }
                    });
                }
            });
        }

        private C58708b() {
        }

        @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b.AbstractC58693a
        /* renamed from: a */
        public void mo199063a(final PhotoItem photoItem) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58708b.RunnableC587112 */

                public void run() {
                    ((AbstractC58689a.AbstractC58690a) C58702d.this.getModel()).mo199045b(photoItem, new UIGetDataCallback(new IGetDataCallback<String>() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58708b.RunnableC587112.C587121 */

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199059c(str);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            int errorCode = errorResult.getErrorCode();
                            if (errorCode == -6000) {
                                ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199053a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Core_SecuritySettingKAToast)));
                            } else if (errorCode == 321000) {
                                ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199056b(errorResult.getDisplayMsg(C58612c.m227290a().mo102830a(R.string.Lark_Audit_BlockedActionDownloadVideo)));
                                ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199058c();
                            } else if (errorCode == -5439) {
                            } else {
                                if (errorCode != -5438) {
                                    ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199053a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveFailTip)));
                                    ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199058c();
                                    return;
                                }
                                ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199053a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_HaveSavedVideoTip)));
                            }
                        }
                    }));
                }
            });
        }

        @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b.AbstractC58693a
        /* renamed from: a */
        public void mo199064a(final PhotoItem photoItem, final boolean z, final boolean z2) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58708b.RunnableC587091 */

                public void run() {
                    ((AbstractC58689a.AbstractC58690a) C58702d.this.getModel()).mo199044a(photoItem, new UIGetDataCallback(new IGetDataCallback<DataSource>() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58708b.RunnableC587091.C587101 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165382e("Video play failed");
                        }

                        /* renamed from: a */
                        public void onSuccess(DataSource dataSource) {
                            ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199051a(dataSource, z, z2);
                        }
                    }));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.d$a */
    public class C58704a implements AbstractC58689a.AbstractC58690a.AbstractC58691a {
        private C58704a() {
        }

        @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58690a.AbstractC58691a
        /* renamed from: a */
        public void mo199046a(final int i) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58704a.RunnableC587051 */

                public void run() {
                    ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199050a(i);
                }
            });
        }

        @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58690a.AbstractC58691a
        /* renamed from: a */
        public void mo199047a(final Context context, final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58704a.RunnableC587062 */

                public void run() {
                    C58612c.m227290a().mo102841a(context, z, new DialogInterface.OnDismissListener() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58702d.C58704a.RunnableC587062.DialogInterface$OnDismissListenerC587071 */

                        public void onDismiss(DialogInterface dialogInterface) {
                            ((AbstractC58689a.AbstractC58692b) C58702d.this.getView()).mo199048a();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo199077a(float f) {
        ((AbstractC58689a.AbstractC58692b) getView()).mo199049a(f);
    }

    /* renamed from: a */
    public void mo199078a(PhotoItem photoItem) {
        ((AbstractC58689a.AbstractC58692b) getView()).mo199052a(photoItem);
    }

    /* renamed from: b */
    public void mo199081b(boolean z) {
        ((AbstractC58689a.AbstractC58692b) getView()).mo199057b(z);
    }

    /* renamed from: a */
    public void mo199079a(boolean z) {
        ((AbstractC58689a.AbstractC58692b) getView()).mo199054a(z);
    }

    public C58702d(C58694b bVar, PhotoItem photoItem, boolean z, boolean z2, boolean z3, boolean z4, C58715e.AbstractC58731c cVar, OnDialogMenuClickListener onDialogMenuClickListener, boolean z5, OnChatAlbumClickListener onChatAlbumClickListener) {
        C58696c cVar2 = new C58696c(bVar.getContext(), photoItem);
        setModel(cVar2);
        C58715e eVar = new C58715e(bVar, cVar, photoItem, z, z2, z3, z4, onDialogMenuClickListener, z5, onChatAlbumClickListener);
        setView(eVar);
        eVar.setViewDelegate(createViewDelegate());
        cVar2.mo199070a(m227774d());
    }
}
