package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: androidx.fragment.app.u */
public class C1069u extends Fragment {

    /* renamed from: a */
    ListAdapter f4041a;

    /* renamed from: b */
    ListView f4042b;

    /* renamed from: c */
    View f4043c;

    /* renamed from: d */
    TextView f4044d;

    /* renamed from: e */
    View f4045e;

    /* renamed from: f */
    View f4046f;

    /* renamed from: g */
    CharSequence f4047g;

    /* renamed from: h */
    boolean f4048h;

    /* renamed from: i */
    private final Handler f4049i = new Handler();

    /* renamed from: j */
    private final Runnable f4050j = new Runnable() {
        /* class androidx.fragment.app.C1069u.RunnableC10701 */

        public void run() {
            C1069u.this.f4042b.focusableViewAvailable(C1069u.this.f4042b);
        }
    };

    /* renamed from: k */
    private final AdapterView.OnItemClickListener f4051k = new AdapterView.OnItemClickListener() {
        /* class androidx.fragment.app.C1069u.C10712 */

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1069u.this.mo5692a((ListView) adapterView, view, i, j);
        }
    };

    /* renamed from: a */
    public void mo5692a(ListView listView, View view, int i, long j) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f4049i.removeCallbacks(this.f4050j);
        this.f4042b = null;
        this.f4048h = false;
        this.f4046f = null;
        this.f4045e = null;
        this.f4043c = null;
        this.f4044d = null;
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m5173a() {
        if (this.f4042b == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f4042b = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.f4044d = textView;
                    if (textView == null) {
                        this.f4043c = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f4045e = view.findViewById(16711682);
                    this.f4046f = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f4042b = listView;
                        View view2 = this.f4043c;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        } else {
                            CharSequence charSequence = this.f4047g;
                            if (charSequence != null) {
                                this.f4044d.setText(charSequence);
                                this.f4042b.setEmptyView(this.f4044d);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f4048h = true;
                this.f4042b.setOnItemClickListener(this.f4051k);
                ListAdapter listAdapter = this.f4041a;
                if (listAdapter != null) {
                    this.f4041a = null;
                    mo5691a(listAdapter);
                } else if (this.f4045e != null) {
                    m5174a(false, false);
                }
                this.f4049i.post(this.f4050j);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: a */
    public void mo5691a(ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        if (this.f4041a != null) {
            z = true;
        } else {
            z = false;
        }
        this.f4041a = listAdapter;
        ListView listView = this.f4042b;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f4048h && !z) {
                if (requireView().getWindowToken() != null) {
                    z2 = true;
                }
                m5174a(true, z2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m5173a();
    }

    /* renamed from: a */
    private void m5174a(boolean z, boolean z2) {
        m5173a();
        View view = this.f4045e;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f4048h != z) {
            this.f4048h = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f4046f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f4046f.clearAnimation();
                }
                this.f4045e.setVisibility(8);
                this.f4046f.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f4046f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f4046f.clearAnimation();
            }
            this.f4045e.setVisibility(0);
            this.f4046f.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }
}
