package com.xiaomi.xmss.dao;

import java.util.BitSet;

public class BitSetWrap {
    private BitSet bitSet = new BitSet();
    private BitSet negativeBitSet = new BitSet();
    private int hasMinValue = 0;

    public void add(int key) {
        if (key == Integer.MIN_VALUE) {
            hasMinValue = 1;
        } else if (key >= 0) {
            bitSet.set(key);
        } else {
            negativeBitSet.set(-key);
        }
    }

    public boolean contains(int key) {
        if (key == Integer.MIN_VALUE) {
            return hasMinValue == 1;
        }
        return (key >= 0) ? bitSet.get(key) : negativeBitSet.get(-key);
    }

    public int size() {
        return bitSet.size() + negativeBitSet.size() + hasMinValue;
    }

    public void clear() {
        bitSet.clear();
        negativeBitSet.clear();
        hasMinValue = 0;
    }
}
