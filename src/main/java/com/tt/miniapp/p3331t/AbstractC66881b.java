package com.tt.miniapp.p3331t;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.tt.miniapp.t.b */
public abstract class AbstractC66881b extends Fragment implements AbstractC66891k {
    private Queue<Integer> transactionList = new LinkedList();

    @Override // com.tt.miniapp.p3331t.AbstractC66891k
    public void offerHideToQueue() {
        this.transactionList.offer(2);
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66891k
    public void offerRemoveToQueue() {
        this.transactionList.offer(3);
    }

    public void offerShowToQueue() {
        this.transactionList.offer(1);
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66891k
    public void executeHideWithOutCommit(FragmentTransaction fragmentTransaction) {
        if (this.transactionList.isEmpty()) {
            fragmentTransaction.hide(this);
        } else {
            this.transactionList.offer(2);
        }
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66891k
    public void executeRemoveWithOutCommit(FragmentTransaction fragmentTransaction) {
        if (this.transactionList.isEmpty()) {
            fragmentTransaction.remove(this);
        } else {
            this.transactionList.offer(3);
        }
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66891k
    public void executeShowWithOutCommit(FragmentTransaction fragmentTransaction) {
        if (this.transactionList.isEmpty()) {
            fragmentTransaction.show(this);
        } else {
            this.transactionList.offer(1);
        }
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66891k
    public void doWithOutCommitByAnimationEnd(FragmentTransaction fragmentTransaction) {
        if (fragmentTransaction == null) {
            this.transactionList.clear();
            return;
        }
        while (this.transactionList.peek() != null) {
            Integer poll = this.transactionList.poll();
            if (poll != null) {
                if (poll.intValue() == 1) {
                    fragmentTransaction.show(this);
                } else if (poll.intValue() == 2) {
                    fragmentTransaction.hide(this);
                } else {
                    fragmentTransaction.remove(this);
                }
            }
        }
    }
}
