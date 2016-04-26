package com.xiaomi.xmss.dao;

import java.util.BitSet;

public class BitSetWrap {
    private static final BitSet bitSet = new BitSet();
    private static final BitSet negativeBitSet = new BitSet();

    public BitSetWrap() {
    }

    public void add(int key) {
        if (key >= 0) {
            bitSet.set(key);
        } else {
            negativeBitSet.set(-key);
        }
    }

    public boolean contains(int key) {
        return (key >= 0) ? bitSet.get(key) : negativeBitSet.get(-key);
    }

    public int size() {
        return bitSet.size() + negativeBitSet.size();
    }

    public void clear() {
        bitSet.clear();
        negativeBitSet.clear();
    }
}
