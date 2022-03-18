package com.ss.android.lark.browser.biz.basic.jsapi.navigation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.NavigationMenu;
import com.ss.android.lark.ui.C57590d;
import com.ss.android.lark.ui.CommonPopupRecycleAdapter;
import com.ss.android.lark.ui.IActionTitlebar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SetMenuHandlerV2 extends AbstractInjectJSApiHandler<NavigationMenu> implements Parcelable {
    public static final Parcelable.Creator<SetMenuHandlerV2> CREATOR = new Parcelable.Creator<SetMenuHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetMenuHandlerV2.C297115 */

        /* renamed from: a */
        public SetMenuHandlerV2[] newArray(int i) {
            return new SetMenuHandlerV2[i];
        }

        /* renamed from: a */
        public SetMenuHandlerV2 createFromParcel(Parcel parcel) {
            return new SetMenuHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetMenuHandlerV2$a */
    public static final class C29713a implements Serializable {
        private Drawable drawable;
        private String iconId;
        private String id;
        private String text;

        private C29713a() {
        }

        public Drawable getDrawable() {
            return this.drawable;
        }

        public String getIconId() {
            return this.iconId;
        }

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public void setDrawable(Drawable drawable2) {
            this.drawable = drawable2;
        }

        public void setIconId(String str) {
            this.iconId = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public SetMenuHandlerV2() {
    }

    /* renamed from: b */
    public void mo107037b() {
        KeyboardUtils.hideKeyboard(mo91999w().mo67314g().getContext());
        mo91999w().mo67314g().clearFocus();
    }

    protected SetMenuHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private List<CommonPopupRecycleAdapter.ListItem> m109904a(List<NavigationMenu.MenuItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!(list == null || list.size() == 0)) {
            for (NavigationMenu.MenuItem menuItem : list) {
                CommonPopupRecycleAdapter.ListItem listItem = new CommonPopupRecycleAdapter.ListItem();
                listItem.setId(menuItem.getId());
                listItem.setText(menuItem.getText());
                listItem.setIconId(menuItem.getIconId());
                arrayList.add(listItem);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Bitmap m109903a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("data:image/png;base64,") || str.startsWith("data:image/x-icon;base64,") || str.startsWith("data:image/jpg;base64,")) {
            String[] split = str.split(",");
            if (split.length > 1) {
                str = split[1];
            } else {
                Log.m165389i("SetMenuHandlerV2", "base base-64:" + str);
            }
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            Log.m165383e("SetMenuHandlerV2", th.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private List<C29713a> m109905b(List<NavigationMenu.MenuItem> list) {
        if (list == null || list.size() < 1) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (NavigationMenu.MenuItem menuItem : list) {
            BitmapDrawable bitmapDrawable = null;
            C29713a aVar = new C29713a();
            aVar.setText(menuItem.getText());
            aVar.setId(menuItem.getId());
            aVar.setIconId(menuItem.getIconId());
            Bitmap a = m109903a(menuItem.getImageBase64());
            if (a != null) {
                bitmapDrawable = new BitmapDrawable(mo91997u().getResources(), a);
            }
            aVar.setDrawable(bitmapDrawable);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public String mo107034a(List<NavigationMenu.MenuItem> list, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (NavigationMenu.MenuItem menuItem : list) {
            if (str.equals(menuItem.getText())) {
                return menuItem.getId();
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NavigationMenu navigationMenu, final AbstractC25832c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        Log.m165389i("SetMenuHandlerV2", "invoke api. " + navigationMenu);
        boolean b = mo91999w().mo67308b().mo67328b();
        mo91999w().mo67308b().removeAllActions();
        final ArrayList arrayList = new ArrayList();
        if (navigationMenu == null) {
            i = 0;
        } else {
            i = navigationMenu.getItems().size();
        }
        Log.m165389i("SetMenuHandlerV2", "count:" + i);
        if (i != 0) {
            for (NavigationMenu.MenuItem menuItem : arrayList) {
                if (("item:" + menuItem) == null) {
                    str = "null item";
                } else {
                    str = menuItem.getText();
                }
                Log.m165389i("SetMenuHandlerV2", str);
            }
            arrayList.addAll(navigationMenu.getItems());
            List<C29713a> b2 = m109905b((List<NavigationMenu.MenuItem>) arrayList);
            mo91999w().mo67308b().removeAllActions();
            if (b2.size() <= 2) {
                for (C29713a aVar : b2) {
                    if (aVar.getDrawable() == null) {
                        Log.m165389i("SetMenuHandlerV2", "add item:" + aVar.getText());
                        IWebContainerContract.IWebContainerView.IWebContainerTitleBar b3 = mo91999w().mo67308b();
                        String text = aVar.getText();
                        if (b) {
                            i4 = R.color.white_back_text_selector;
                        } else {
                            i4 = -1;
                        }
                        b3.addAction(new IActionTitlebar.TextAction(text, i4) {
                            /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetMenuHandlerV2.C297071 */

                            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                            public void performAction(View view) {
                                super.performAction(view);
                                SetMenuHandlerV2.this.mo107037b();
                                String a = SetMenuHandlerV2.this.mo107034a(arrayList, ((TextView) view).getText().toString());
                                AbstractC25832c cVar = cVar;
                                cVar.mo91902a("{\"id\":\"" + a + "\"}");
                            }
                        });
                    } else {
                        Log.m165389i("SetMenuHandlerV2", "add drawable");
                        mo91999w().mo67308b().addAction(new IActionTitlebar.C57573a(aVar.getDrawable()) {
                            /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetMenuHandlerV2.C297082 */

                            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                            public void performAction(View view) {
                                super.performAction(view);
                                SetMenuHandlerV2.this.mo107037b();
                                AbstractC25832c cVar = cVar;
                                cVar.mo91902a("{\"id\":\"" + getTag() + "\"}");
                            }
                        }.setTag(aVar.getId()));
                    }
                }
                return;
            }
            Log.m165389i("SetMenuHandlerV2", "add item:" + arrayList.get(0).getText());
            IWebContainerContract.IWebContainerView.IWebContainerTitleBar b4 = mo91999w().mo67308b();
            String text2 = arrayList.get(0).getText();
            if (b) {
                i2 = R.color.white_back_text_selector;
            } else {
                i2 = -1;
            }
            b4.addAction(new IActionTitlebar.TextAction(text2, i2) {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetMenuHandlerV2.C297093 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    SetMenuHandlerV2.this.mo107037b();
                    String id = ((NavigationMenu.MenuItem) arrayList.get(0)).getId();
                    AbstractC25832c cVar = cVar;
                    cVar.mo91902a("{\"id\":\"" + id + "\"}");
                }
            });
            IWebContainerContract.IWebContainerView.IWebContainerTitleBar b5 = mo91999w().mo67308b();
            if (b) {
                i3 = R.drawable.browser_titlebar_more_white_bg_selector;
            } else {
                i3 = R.drawable.browser_titlebar_more_bg_selector;
            }
            b5.addAction(new IActionTitlebar.C57573a(i3) {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetMenuHandlerV2.C297104 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    SetMenuHandlerV2.this.mo107037b();
                    SetMenuHandlerV2 setMenuHandlerV2 = SetMenuHandlerV2.this;
                    List list = arrayList;
                    setMenuHandlerV2.mo107035a(view, list.subList(1, list.size()), cVar);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo107035a(View view, List<NavigationMenu.MenuItem> list, AbstractC25832c cVar) {
        m109906b(view, list, cVar);
    }

    /* renamed from: b */
    private void m109906b(View view, List<NavigationMenu.MenuItem> list, final AbstractC25832c cVar) {
        C57590d.m223633a(mo91999w().mo67313f(), view, 0, m109904a(list), new CommonPopupRecycleAdapter.AbstractC57564a() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetMenuHandlerV2.C297126 */

            @Override // com.ss.android.lark.ui.CommonPopupRecycleAdapter.AbstractC57564a
            /* renamed from: a */
            public void mo102289a(View view, int i) {
                AbstractC25832c cVar = cVar;
                cVar.mo91902a("{\"id\":\"" + (i + 1) + "\"}");
            }
        });
    }
}
