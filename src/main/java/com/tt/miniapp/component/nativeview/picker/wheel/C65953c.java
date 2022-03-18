package com.tt.miniapp.component.nativeview.picker.wheel;

import android.app.Activity;
import com.tt.miniapp.address.AddressInfo;
import com.tt.miniapp.address.AsyncTaskC65743a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.c */
public class C65953c extends C65949b implements AsyncTaskC65743a.AbstractC65745b {

    /* renamed from: G */
    public AddressInfo f166468G;

    /* renamed from: H */
    public String[] f166469H;

    /* renamed from: I */
    public AddressInfo f166470I = new AddressInfo("", "", "");

    /* renamed from: J */
    public AddressInfo f166471J = new AddressInfo("", "", "");

    /* renamed from: K */
    public AddressInfo f166472K = new AddressInfo("", "", "");

    /* renamed from: L */
    private int f166473L = -2;

    /* renamed from: M */
    private int f166474M = -2;

    /* renamed from: n */
    public void mo230910n() {
        m258325a(0, 0, 0);
    }

    /* renamed from: o */
    public boolean mo230911o() {
        String[] strArr = this.f166469H;
        if (strArr == null || strArr.length < 1) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo230912p() {
        String[] strArr = this.f166469H;
        if (strArr == null || strArr.length < 2) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo230913q() {
        String[] strArr = this.f166469H;
        if (strArr == null || strArr.length < 3) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public AddressInfo[] mo230914r() {
        return new AddressInfo[]{this.f166470I, this.f166471J, this.f166472K};
    }

    /* renamed from: b */
    public List<AddressInfo> mo230909b(List<AddressInfo> list) {
        if (this.f166468G == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f166468G);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo230907a(String str) {
        if (str != null) {
            this.f166468G = new AddressInfo(str, "", "");
            this.f166471J = new AddressInfo(str, "", "");
            this.f166472K = new AddressInfo(str, "", "");
        }
    }

    public C65953c(Activity activity) {
        super(activity, null);
        this.f166458D = new ArrayList();
        this.f166458D.add(new ArrayList());
        this.f166458D.add(new ArrayList());
        this.f166458D.add(new ArrayList());
        mo230903a(this.f166458D);
    }

    /* renamed from: a */
    public void mo230908a(String[] strArr) {
        this.f166469H = new String[3];
        for (int i = 0; i < strArr.length; i++) {
            String[] strArr2 = this.f166469H;
            if (i < strArr2.length) {
                strArr2[i] = strArr[i];
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65949b
    /* renamed from: a */
    public void mo230900a(WheelView wheelView, int i) {
        super.mo230900a(wheelView, i);
        int intValue = ((Integer) wheelView.getTag()).intValue();
        if (i != this.f166474M || intValue != this.f166473L) {
            this.f166473L = intValue;
            this.f166474M = i;
            if (i != 0 || this.f166468G == null) {
                AsyncTaskC65743a aVar = new AsyncTaskC65743a(this.f166322a, this);
                synchronized (this.f166458D) {
                    List list = (List) this.f166458D.get(intValue);
                    if (!list.isEmpty()) {
                        if (list.size() >= i) {
                            AddressInfo addressInfo = (AddressInfo) list.get(i);
                            List<AddressInfo> b = mo230909b(aVar.mo230368a(addressInfo.getAddrHashCode()));
                            if (intValue == 0) {
                                this.f166470I = addressInfo;
                                ((WheelView) this.f166460F.get(1)).setSelectedIndex(0);
                                this.f166471J = b.get(0);
                                int a = aVar.mo230367a();
                                mo230899a(a, b, 0);
                                List<AddressInfo> b2 = mo230909b(aVar.mo230368a(this.f166471J.getAddrHashCode()));
                                this.f166472K = b2.get(0);
                                mo230899a(a + 1, b2, 0);
                            } else if (intValue == 1) {
                                ((WheelView) this.f166460F.get(2)).setSelectedIndex(0);
                                this.f166472K = b.get(0);
                                this.f166471J = addressInfo;
                                mo230899a(aVar.mo230367a(), b, 0);
                            } else if (intValue == 2) {
                                this.f166472K = addressInfo;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f166468G);
            if (intValue == 0) {
                AddressInfo addressInfo2 = this.f166468G;
                this.f166470I = addressInfo2;
                this.f166471J = addressInfo2;
                this.f166472K = addressInfo2;
                mo230899a(1, arrayList, 0);
                mo230899a(2, arrayList, 0);
            }
            if (intValue == 1) {
                AddressInfo addressInfo3 = this.f166468G;
                this.f166471J = addressInfo3;
                this.f166472K = addressInfo3;
                mo230899a(2, arrayList, 0);
            }
            if (intValue == 2) {
                this.f166472K = this.f166468G;
            }
        }
    }

    @Override // com.tt.miniapp.address.AsyncTaskC65743a.AbstractC65745b
    /* renamed from: a */
    public void mo230374a(String str, List<AddressInfo> list, int i) {
        mo230899a(i, list, 0);
    }

    /* renamed from: a */
    private void m258325a(final int i, final int i2, final int i3) {
        new AsyncTaskC65743a(this.f166322a, new AsyncTaskC65743a.AbstractC65745b() {
            /* class com.tt.miniapp.component.nativeview.picker.wheel.C65953c.C659541 */

            @Override // com.tt.miniapp.address.AsyncTaskC65743a.AbstractC65745b
            /* renamed from: a */
            public void mo230374a(String str, List<AddressInfo> list, int i) {
                List<AddressInfo> b = C65953c.this.mo230909b(list);
                int i2 = i;
                int i3 = 0;
                while (true) {
                    if (i3 >= b.size() || !C65953c.this.mo230911o()) {
                        break;
                    } else if (b.get(i3).name.equals(C65953c.this.f166469H[0])) {
                        C65953c.this.f166470I = b.get(i3);
                        i2 = i3;
                        break;
                    } else {
                        C65953c.this.f166470I = b.get(0);
                        i3++;
                    }
                }
                if (C65953c.this.f166468G != null && (C65953c.this.f166468G.name.equals(C65953c.this.f166469H[0]) || C65953c.this.f166469H[0] == null)) {
                    C65953c cVar = C65953c.this;
                    cVar.f166470I = cVar.f166468G;
                    i2 = 0;
                }
                C65953c.this.mo230899a(0, b, i2);
                if (C65953c.this.mo230912p()) {
                    AsyncTaskC65743a aVar = new AsyncTaskC65743a(C65953c.this.f166322a, new AsyncTaskC65743a.AbstractC65745b() {
                        /* class com.tt.miniapp.component.nativeview.picker.wheel.C65953c.C659541.C659551 */

                        @Override // com.tt.miniapp.address.AsyncTaskC65743a.AbstractC65745b
                        /* renamed from: a */
                        public void mo230374a(String str, List<AddressInfo> list, int i) {
                            int i2 = i2;
                            List<AddressInfo> b = C65953c.this.mo230909b(list);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= b.size()) {
                                    break;
                                } else if (b.get(i3).name.equals(C65953c.this.f166469H[1])) {
                                    C65953c.this.f166471J = b.get(i3);
                                    i2 = i3;
                                    break;
                                } else {
                                    if (C65953c.this.f166468G == null || !C65953c.this.f166468G.name.equals(C65953c.this.f166469H[1])) {
                                        C65953c.this.f166471J = b.get(0);
                                    } else {
                                        C65953c.this.f166471J = C65953c.this.f166468G;
                                    }
                                    i3++;
                                }
                            }
                            if (C65953c.this.f166468G == null || (!C65953c.this.f166468G.name.equals(C65953c.this.f166469H[1]) && C65953c.this.f166469H[1] != null)) {
                                C65953c.this.mo230899a(1, b, i2);
                                if (C65953c.this.mo230913q()) {
                                    AsyncTaskC65743a aVar = new AsyncTaskC65743a(C65953c.this.f166322a, new AsyncTaskC65743a.AbstractC65745b() {
                                        /* class com.tt.miniapp.component.nativeview.picker.wheel.C65953c.C659541.C659551.C659561 */

                                        @Override // com.tt.miniapp.address.AsyncTaskC65743a.AbstractC65745b
                                        /* renamed from: a */
                                        public void mo230374a(String str, List<AddressInfo> list, int i) {
                                            int i2 = i3;
                                            List<AddressInfo> b = C65953c.this.mo230909b(list);
                                            int i3 = 0;
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 >= b.size()) {
                                                    break;
                                                } else if (b.get(i4).name.equals(C65953c.this.f166469H[2])) {
                                                    C65953c.this.f166472K = b.get(i4);
                                                    i2 = i4;
                                                    break;
                                                } else {
                                                    if (C65953c.this.f166468G == null || !C65953c.this.f166468G.name.equals(C65953c.this.f166469H[2])) {
                                                        C65953c.this.f166472K = b.get(0);
                                                    } else {
                                                        C65953c.this.f166472K = C65953c.this.f166468G;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            if (C65953c.this.f166468G == null || (!C65953c.this.f166468G.name.equals(C65953c.this.f166469H[2]) && C65953c.this.f166469H[2] != null)) {
                                                i3 = i2;
                                            } else {
                                                C65953c.this.f166472K = C65953c.this.f166468G;
                                            }
                                            C65953c.this.mo230899a(2, b, i3);
                                        }
                                    });
                                    if (C65953c.this.f166468G != null) {
                                        i2--;
                                    }
                                    aVar.execute(list.get(i2).getAddrHashCode());
                                    return;
                                }
                                return;
                            }
                            C65953c.this.f166471J = C65953c.this.f166468G;
                            C65953c.this.mo230899a(1, b, 0);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(C65953c.this.f166468G);
                            C65953c.this.mo230899a(2, arrayList, 0);
                        }
                    });
                    if (C65953c.this.f166468G == null || i2 - 1 >= 0) {
                        aVar.execute(list.get(i2).getAddrHashCode());
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C65953c.this.f166468G);
                    C65953c.this.mo230899a(1, arrayList, 0);
                    C65953c.this.mo230899a(2, arrayList, 0);
                }
            }
        }).execute("province");
    }
}
